package com.donttouchphone.phone.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.ui.DtmpSplashActivity;
import com.donttouchphone.phone.ui.StopActivityActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\"\u0010,\u001a\u00020-2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016J\u0012\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010)H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/DoNotTouchMyPhoneService;", "Lcom/donttouchphone/antitheftalarm/services/BaseService;", "()V", "changeInAcceleration", "", "itIsNotFirstTime", "", "mAccelCurrent", "mAccelLast", "mAccelerometer", "Landroid/hardware/Sensor;", "mCurrentX", "", "mCurrentY", "mCurrentZ", "mLastX", "mLastY", "mLastZ", "mSensorEventListener", "com/donttouchphone/phone/services/DoNotTouchMyPhoneService$mSensorEventListener$1", "Lcom/donttouchphone/antitheftalarm/services/DoNotTouchMyPhoneService$mSensorEventListener$1;", "mSensorManager", "Landroid/hardware/SensorManager;", "shakeThreshold", "soundStart", "getSoundStart", "()Z", "setSoundStart", "(Z)V", "xDefference", "yDefference", "zDefference", "checkMobileShaked", "", "configDeviceShakeSensor", "createNotificationChannel", "getNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "onTaskRemoved", "rootIntent", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: DoNotTouchMyPhoneService.kt */
public final class DoNotTouchMyPhoneService extends BaseService {
    /* access modifiers changed from: private */
    public double changeInAcceleration;
    /* access modifiers changed from: private */
    public boolean itIsNotFirstTime;
    /* access modifiers changed from: private */
    public double mAccelCurrent;
    /* access modifiers changed from: private */
    public double mAccelLast;
    private Sensor mAccelerometer;
    /* access modifiers changed from: private */
    public float mCurrentX;
    /* access modifiers changed from: private */
    public float mCurrentY;
    /* access modifiers changed from: private */
    public float mCurrentZ;
    /* access modifiers changed from: private */
    public float mLastX;
    /* access modifiers changed from: private */
    public float mLastY;
    /* access modifiers changed from: private */
    public float mLastZ;
    private final DoNotTouchMyPhoneService$mSensorEventListener$1 mSensorEventListener = new DoNotTouchMyPhoneService$mSensorEventListener$1(this);
    private SensorManager mSensorManager;
    private float shakeThreshold = 2.0f;
    private boolean soundStart;
    private float xDefference;
    private float yDefference;
    private float zDefference;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return Service.START_NOT_STICKY;
    }

    public final boolean getSoundStart() {
        return this.soundStart;
    }

    public final void setSoundStart(boolean z) {
        this.soundStart = z;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            startForeground(ConstantsKt.DEVICE_SHAKING_NOTIFICATION_ID, getNotification());
        }
        configDeviceShakeSensor();
    }

    public void onTaskRemoved(Intent intent) {
        ContextKt.toast$default((Context) this, "Service Task destroyed", 0, 2, (Object) null);
    }

    private final void configDeviceShakeSensor() {
        Object systemService = getSystemService(Context.SENSOR_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.mSensorManager = sensorManager;
        int i = 1;
        this.mAccelerometer = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        int dontTouchSenstivity = ContextKt.getBaseConfig(this).getDontTouchSenstivity();
        if (1 <= dontTouchSenstivity && dontTouchSenstivity < 30) {
            i = 2;
        } else if (30 > dontTouchSenstivity || dontTouchSenstivity >= 71) {
            i = (70 > dontTouchSenstivity || dontTouchSenstivity >= 101) ? 3 : 0;
        }
        SensorManager sensorManager2 = this.mSensorManager;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(this.mSensorEventListener, this.mAccelerometer, i);
        }
    }

    /* access modifiers changed from: private */
    public final void checkMobileShaked() {
        this.xDefference = Math.abs(this.mLastX - this.mCurrentX);
        this.yDefference = Math.abs(this.mLastY - this.mCurrentY);
        float abs = Math.abs(this.mLastZ - this.mCurrentZ);
        this.zDefference = abs;
        float f = this.xDefference;
        float f2 = this.shakeThreshold;
        if (((f > f2 && this.yDefference > f2) || ((f > f2 && abs > f2) || (this.yDefference > f2 && abs > f2))) && !this.soundStart && isMyServiceRunning(DoNotTouchMyPhoneService.class)) {
            try {
                if (!StopActivityActivity.Companion.isAlreadyScreenShowing()) {
                    Intent startIntent = StopActivityActivity.Companion.getStartIntent(this);
                    StopActivityActivity.Companion.setActiontype(22);
                    startActivity(startIntent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onDestroy() {
        DoNotTouchMyPhoneService$mSensorEventListener$1 doNotTouchMyPhoneService$mSensorEventListener$1;
        super.onDestroy();
        SensorManager sensorManager = this.mSensorManager;
        if (!(sensorManager == null || (doNotTouchMyPhoneService$mSensorEventListener$1 = this.mSensorEventListener) == null || sensorManager == null)) {
            sensorManager.unregisterListener(doNotTouchMyPhoneService$mSensorEventListener$1);
        }
        stopSelf();
        BaseClass.Companion.setDoNotTouchIntent((Intent) null);
    }

    private final Notification getNotification() {
        Context context = this;
        Intent intent = new Intent(context, DtmpSplashActivity.class);
        intent.setFlags(268468224);
        intent.putExtra(ConstantsKt.ACTION_STOP_SHAKING_DEVICE_SERVICE, true);
        intent.putExtra("actionType", 22);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        createNotificationChannel();
        Notification build = new NotificationCompat.Builder(getBaseContext(), ConstantsKt.DEVICE_SHAKING_NOTIFICATION_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.app_name)).setContentText(getString(R.string.device_shake_service_notification)).setAutoCancel(false).setContentIntent(activity).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(ConstantsKt.DEVICE_SHAKING_NOTIFICATION_CHANNEL_ID, ConstantsKt.DEVICE_SHAKING_NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            Object systemService = getSystemService(Context.NOTIFICATION_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }
}
