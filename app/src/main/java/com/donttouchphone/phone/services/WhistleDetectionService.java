package com.donttouchphone.phone.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.ui.DtmpSplashActivity;
import com.donttouchphone.phone.ui.StopActivityActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.whistle.DetectorThread;
import com.donttouchphone.phone.whistle.RecorderThread;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\"\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/WhistleDetectionService;", "Lcom/donttouchphone/antitheftalarm/services/BaseService;", "Lcom/donttouchphone/antitheftalarm/whistle/DetectorThread$OnSoundListener;", "()V", "mDetectorThread", "Lcom/donttouchphone/antitheftalarm/whistle/DetectorThread;", "mRecorderThread", "Lcom/donttouchphone/antitheftalarm/whistle/RecorderThread;", "mp", "Landroid/media/MediaPlayer;", "createNotificationChannel", "", "getNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onSound", "onStartCommand", "", "flags", "startId", "startDetection", "stopDetection", "stopService", "", "name", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: WhistleDetectionService.kt */
public final class WhistleDetectionService extends BaseService implements DetectorThread.OnSoundListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Intent whistleDetectionIntent;
    private DetectorThread mDetectorThread;
    private RecorderThread mRecorderThread;
    private MediaPlayer mp;

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/WhistleDetectionService$Companion;", "", "()V", "whistleDetectionIntent", "Landroid/content/Intent;", "getWhistleDetectionIntent", "()Landroid/content/Intent;", "setWhistleDetectionIntent", "(Landroid/content/Intent;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: WhistleDetectionService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getWhistleDetectionIntent() {
            return WhistleDetectionService.whistleDetectionIntent;
        }

        public final void setWhistleDetectionIntent(Intent intent) {
            WhistleDetectionService.whistleDetectionIntent = intent;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.mp = MediaPlayer.create(getBaseContext(), R.raw.ringtone);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(WhistleDetectionServiceKt.DETECTION_SERVICE_SERVICE_NOTIFICATION_ID, getNotification());
            }
            startDetection();
            return Service.START_NOT_STICKY;
        } catch (Exception e) {
            e.printStackTrace();
            return Service.START_NOT_STICKY;
        }
    }

    private final void startDetection() {
        try {
            stopDetection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        RecorderThread recorderThread = new RecorderThread();
        this.mRecorderThread = recorderThread;
        recorderThread.startRecording();
        DetectorThread detectorThread = new DetectorThread(recorderThread);
        this.mDetectorThread = detectorThread;
        detectorThread.setOnSoundListener(this);
        DetectorThread detectorThread2 = this.mDetectorThread;
        if (detectorThread2 != null) {
            detectorThread2.start();
        }
    }



//    private final void startDetection() {
//        try {
//            stopDetection();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        RecorderThread recorderThread = new RecorderThread();
//        this.mRecorderThread = recorderThread;
//        recorderThread.startRecording();
//        DetectorThread detectorThread = new DetectorThread(recorderThread);
//        this.mDetectorThread = detectorThread;
//        detectorThread.setOnSoundListener(this);
//        DetectorThread detectorThread2 = this.mDetectorThread;
//        if (detectorThread2 != null) {
//            detectorThread2.start();
//        }
//        Toast.makeText(this, "Detection started", Toast.LENGTH_SHORT).show();
//    }


    public boolean stopService(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "name");
        stopDetection();
        return super.stopService(intent);
    }

    private final void stopDetection() {
        DetectorThread detectorThread = this.mDetectorThread;
        if (detectorThread != null) {
            if (detectorThread != null) {
                detectorThread.stopDetection();
            }
            DetectorThread detectorThread2 = this.mDetectorThread;
            if (detectorThread2 != null) {
                detectorThread2.setOnSoundListener((DetectorThread.OnSoundListener) null);
            }
            this.mDetectorThread = null;
        }
        RecorderThread recorderThread = this.mRecorderThread;
        if (recorderThread != null) {
            if (recorderThread != null) {
                recorderThread.stopRecording();
            }
            this.mRecorderThread = null;
        }
    }

    public void onDestroy() {
        stopDetection();
        stopSelf();
        whistleDetectionIntent = null;
        super.onDestroy();
    }

    public void onSound() {
        if (isMyServiceRunning(WhistleDetectionService.class)) {
            try {
                if (!StopActivityActivity.Companion.isAlreadyScreenShowing()) {
                    Intent startIntent = StopActivityActivity.Companion.getStartIntent(this);
                    StopActivityActivity.Companion.setActiontype(55);
                    startActivity(startIntent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final Notification getNotification() {
        Context context = this;
        Intent intent = new Intent(context, DtmpSplashActivity.class);
        intent.setFlags(268468224);
        intent.putExtra(ConstantsKt.ACTION_STOP_WHISTLE_SERVICE, true);
        intent.putExtra("actionType", 55);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        createNotificationChannel();
        Notification build = new NotificationCompat.Builder(getBaseContext(), WhistleDetectionServiceKt.DETECTION_SERVICE_NOTIFICATION_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.app_name)).setContentText(getString(R.string.whistle_detection)).setAutoCancel(false).setContentIntent(activity).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(WhistleDetectionServiceKt.DETECTION_SERVICE_NOTIFICATION_CHANNEL_ID, WhistleDetectionServiceKt.DETECTION_SERVICE_NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.setLockscreenVisibility(0);
            Object systemService = getSystemService(Context.NOTIFICATION_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }
}
