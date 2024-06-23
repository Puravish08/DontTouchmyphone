package com.donttouchphone.phone.whistle;

import android.media.AudioRecord;
import android.util.Log;
import com.musicg.api.DetectionApi;
import com.musicg.api.WhistleApi;
import com.musicg.wave.WaveHeader;
import java.util.LinkedList;

public class DetectorThread extends Thread {
    private Thread _thread;
    private boolean isSound;
    private DetectionApi mDetectionApi;
    private int numWhistles;
    private OnSoundListener onSoundListener;
    private RecorderThread recorder;
    private int totalWhistlesDetected;
    private WaveHeader waveHeader;
    private int whistleCheckLength;
    private int whistlePassScore;
    private LinkedList<Boolean> whistleResultList = new LinkedList<>();

    public interface OnSoundListener {
        void onSound();
    }

    public DetectorThread(RecorderThread recorderThread) {
        int i;
        int i2 = 0;
        this.totalWhistlesDetected = 0;
        this.whistleCheckLength = 3;
        this.whistlePassScore = 3;
        this.recorder = recorderThread;
        AudioRecord audioRecord = recorderThread.getAudioRecord();
        if (audioRecord.getAudioFormat() == 2) {
            i = 16;
        } else {
            i = audioRecord.getAudioFormat() == 3 ? 8 : 0;
        }
        i2 = audioRecord.getChannelConfiguration() == 16 ? 1 : i2;
        WaveHeader waveHeader2 = new WaveHeader();
        this.waveHeader = waveHeader2;
        waveHeader2.setChannels(i2);
        this.waveHeader.setBitsPerSample(i);
        this.waveHeader.setSampleRate(audioRecord.getSampleRate());
        this.mDetectionApi = new WhistleApi(this.waveHeader);
    }

    private void initBuffer() {
        this.numWhistles = 0;
        this.whistleResultList.clear();
        for (int i = 0; i < this.whistleCheckLength; i++) {
            this.whistleResultList.add(false);
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        this._thread = thread;
        thread.start();
    }

    public void stopDetection() {
        this._thread = null;
    }

    public void run() {
        Log.e("danishservice", "DetectorThread started...");
        try {
            initBuffer();
            Thread currentThread = Thread.currentThread();
            while (this._thread == currentThread) {
                byte[] frameBytes = this.recorder.getFrameBytes();
                Log.d("danishservice", "recorder.getFrameBytes() " + frameBytes);
                if (frameBytes != null) {
                    System.out.println("*Whistle:");
                    try {
                        boolean isWhistle = ((WhistleApi) this.mDetectionApi).isWhistle(frameBytes);
                        this.isSound = isWhistle;
                        Log.e("danishservice", "isWhistle : " + isWhistle + " " + frameBytes.length);
                        if (this.whistleResultList.getFirst().booleanValue()) {
                            this.numWhistles--;
                        }
                        this.whistleResultList.removeFirst();
                        this.whistleResultList.add(Boolean.valueOf(this.isSound));
                        if (this.isSound) {
                            this.numWhistles++;
                        }
                        Log.e("danishservice", "numWhistles : " + this.numWhistles);
                        if (this.numWhistles >= this.whistlePassScore) {
                            initBuffer();
                            this.totalWhistlesDetected++;
                            Log.e("danishservice", "totalWhistlesDetected : " + this.totalWhistlesDetected);
                            OnSoundListener onSoundListener2 = this.onSoundListener;
                            if (onSoundListener2 != null) {
                                onSoundListener2.onSound();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.w("danishservice", "error " + e.getMessage() + " Cause :: " + e.getCause());
                    }
                } else {
                    if (this.whistleResultList.getFirst().booleanValue()) {
                        this.numWhistles--;
                    }
                    this.whistleResultList.removeFirst();
                    this.whistleResultList.add(false);
                }
            }
            Log.e("danishservice", "Terminating detector thread...");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setOnSoundListener(OnSoundListener onSoundListener2) {
        this.onSoundListener = onSoundListener2;
    }
}
