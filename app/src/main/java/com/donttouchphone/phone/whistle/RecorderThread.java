package com.donttouchphone.phone.whistle;

import android.media.AudioRecord;
import android.util.Log;

public class RecorderThread extends Thread {
    private int audioEncoding = 2;
    private AudioRecord audioRecord = new AudioRecord(1, this.sampleRate, this.channelConfiguration, this.audioEncoding, AudioRecord.getMinBufferSize(44100, 16, 2));
    byte[] buffer = new byte[this.frameByteSize];
    private int channelConfiguration = 16;
    private int frameByteSize = 2048;
    private int sampleRate = 44100;

    public AudioRecord getAudioRecord() {
        return this.audioRecord;
    }

    public void startRecording() {
        try {
            this.audioRecord.startRecording();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopRecording() {
        try {
            this.audioRecord.stop();
            this.audioRecord.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double getMaxAmplitude() {
        byte[] bArr = this.buffer;
        return (double) Math.abs(bArr[1] | ((bArr[0] & 255) << 8));
    }

    public byte[] getFrameBytes() {
        int i;
        int i2 = 0;
        this.audioRecord.read(this.buffer, 0, this.frameByteSize);
        int i3 = 0;
        while (true) {
            i = this.frameByteSize;
            if (i2 >= i) {
                break;
            }
            byte[] bArr = this.buffer;
            i3 += Math.abs((short) ((bArr[i2 + 1] << 8) | bArr[i2]));
            i2 += 2;
        }
        float f = (float) ((i3 / i) / 2);
        Log.e("", "averageAbsValue : " + f);
        if (f < 30.0f) {
            return null;
        }
        return this.buffer;
    }
}
