package com.donttouchphone.phone.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import androidx.core.app.NotificationCompat;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.ui.DtmpSplashActivity;
import com.donttouchphone.phone.ui.StopActivityActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/PocketService;", "Lcom/donttouchphone/antitheftalarm/services/BaseService;", "Landroid/hardware/SensorEventListener;", "()V", "currentLightQuantity", "", "firstTime", "", "mSensor", "Landroid/hardware/Sensor;", "mSensorManager", "Landroid/hardware/SensorManager;", "createNotificationChannel", "", "getNotification", "Landroid/app/Notification;", "onAccuracyChanged", "sensor", "accuracy", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onStartCommand", "flags", "startId", "setMediaVolume", "vol", "stopPocketService", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: PocketService.kt */
public final class PocketService extends BaseService implements SensorEventListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Intent pocketServiceIntent;
    private float currentLightQuantity;
    private boolean firstTime = true;
    private Sensor mSensor;
    private SensorManager mSensorManager;

    public void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/PocketService$Companion;", "", "()V", "pocketServiceIntent", "Landroid/content/Intent;", "getPocketServiceIntent", "()Landroid/content/Intent;", "setPocketServiceIntent", "(Landroid/content/Intent;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: PocketService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getPocketServiceIntent() {
            return PocketService.pocketServiceIntent;
        }

        public final void setPocketServiceIntent(Intent intent) {
            PocketService.pocketServiceIntent = intent;
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            if (ConstantsKt.isOreoPlus()) {
                startForeground(ConstantsKt.ANTI_POCKET_SERVICE_NOTIFICATION_ID, getNotification());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        new Handler(Looper.getMainLooper()).postDelayed(new PocketService$$ExternalSyntheticLambda0(this), 5000);
        return Service.START_NOT_STICKY;
    }

    /* access modifiers changed from: private */
    public static final void onStartCommand$lambda$1(PocketService pocketService) {
        SensorManager sensorManager;
        Intrinsics.checkNotNullParameter(pocketService, "this$0");
        Object systemService = pocketService.getSystemService(Context.SENSOR_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager2 = (SensorManager) systemService;
        pocketService.mSensorManager = sensorManager2;
        Sensor defaultSensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(8) : null;
        pocketService.mSensor = defaultSensor;
        if (!(defaultSensor == null || (sensorManager = pocketService.mSensorManager) == null)) {
            sensorManager.registerListener(pocketService, defaultSensor, 3);
        }
        Log.d("yyeeeeee", "3: ");
    }

    private final void stopPocketService() {
        Intent intent = new Intent(this, PocketService.class);
        intent.setAction(ConstantsKt.ACTION_STOP_ANTI_POCKET);
        sendBroadcast(intent);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        Intrinsics.checkNotNullParameter(sensorEvent, NotificationCompat.CATEGORY_EVENT);
        if (sensorEvent.sensor.getType() == 8) {
            float f = sensorEvent.values[0];
            if (this.firstTime) {
                this.currentLightQuantity = f;
                this.firstTime = false;
                Log.d("yyeeeeee", "firstTime.... f=  " + f);
                return;
            }
            if (f <= this.currentLightQuantity) {
                this.currentLightQuantity = f;
                Log.d("yyeeeeee", "light <=currentLightQuantity ..... f=  " + f);
                Object systemService = getSystemService(Context.VIBRATOR_SERVICE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(500, -1));
                } else {
                    vibrator.vibrate(500);
                }
            }
            if (f > this.currentLightQuantity) {
                this.currentLightQuantity = 0.0f;
                Log.d("yyeeeeee", " light >current light snatch ......f=  " + f);
                this.firstTime = false;
                if (isMyServiceRunning(PocketService.class) && !StopActivityActivity.Companion.isAlreadyScreenShowing()) {
                    Intent startIntent = StopActivityActivity.Companion.getStartIntent(this);
                    StopActivityActivity.Companion.setActiontype(11);
                    startActivity(startIntent);
                }
            }
        }
    }

    private final void setMediaVolume(int i) {
        ContextKt.getAudioManager(this).setStreamVolume(3, i, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        pocketServiceIntent = null;
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        stopSelf();
    }

    private final Notification getNotification() {
        Context context = this;
        Intent intent = new Intent(context, DtmpSplashActivity.class);
        intent.setFlags(268468224);
        intent.putExtra(ConstantsKt.ACTION_STOP_ANTI_POCKET, true);
        intent.putExtra("actionType", 11);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        createNotificationChannel();
        Notification build = new NotificationCompat.Builder(getBaseContext(), ConstantsKt.ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.app_name)).setContentText("pocket Service active").setContentIntent(activity).setAutoCancel(false).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(ConstantsKt.ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_ID, ConstantsKt.ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_NAME, 4);
            Object systemService = getSystemService(Context.NOTIFICATION_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }
}
