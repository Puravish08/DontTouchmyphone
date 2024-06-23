package com.donttouchphone.phone.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.ui.DtmpSplashActivity;
import com.donttouchphone.phone.ui.StopActivityActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/ChargerDetectionService;", "Lcom/donttouchphone/antitheftalarm/services/BaseService;", "()V", "mChargingPlugReceiver", "Lcom/donttouchphone/antitheftalarm/services/ChargerDetectionService$ChargingPlugReceiver;", "createNotificationChannel", "", "getNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "setMediaVolume", "vol", "showReceivedBroadcastResult", "startBroadcastReceiver", "ChargingPlugReceiver", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ChargerDetectionService.kt */
public final class ChargerDetectionService extends BaseService {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Intent chargerDetectionServiceIntent;
    private ChargingPlugReceiver mChargingPlugReceiver;

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/ChargerDetectionService$Companion;", "", "()V", "chargerDetectionServiceIntent", "Landroid/content/Intent;", "getChargerDetectionServiceIntent", "()Landroid/content/Intent;", "setChargerDetectionServiceIntent", "(Landroid/content/Intent;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: ChargerDetectionService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getChargerDetectionServiceIntent() {
            return ChargerDetectionService.chargerDetectionServiceIntent;
        }

        public final void setChargerDetectionServiceIntent(Intent intent) {
            ChargerDetectionService.chargerDetectionServiceIntent = intent;
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(ConstantsKt.CHARGER_DETECTION_NOTIFICATION_ID, getNotification());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        startBroadcastReceiver();
        return Service.START_STICKY;
    }

    private final void startBroadcastReceiver() {
        try {
            this.mChargingPlugReceiver = new ChargingPlugReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.setPriority(1000);
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            ChargingPlugReceiver chargingPlugReceiver = this.mChargingPlugReceiver;
            if (chargingPlugReceiver != null) {
                registerReceiver(chargingPlugReceiver, intentFilter);
                Toast.makeText(getApplicationContext(), "charging detection started", 0).show();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void showReceivedBroadcastResult() {
        if (isMyServiceRunning(ChargerDetectionService.class)) {
            try {
                if (!StopActivityActivity.Companion.isAlreadyScreenShowing()) {
                    Intent startIntent = StopActivityActivity.Companion.getStartIntent(this);
                    StopActivityActivity.Companion.setActiontype(33);
                    startActivity(startIntent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final void setMediaVolume(int i) {
        ContextKt.getAudioManager(this).setStreamVolume(3, i, 0);
    }

    public void onDestroy() {
        unregisterReceiver(this.mChargingPlugReceiver);
        Context context = this;
        setMediaVolume(ContextKt.getCurrent_music_volume_level(context));
        if (ContextKt.getBaseConfig(context).getDontUnplugFlashToggle()) {
            ContextKt.toggleFlashLight(context, false);
        }
        if (ContextKt.getBaseConfig(context).getDontUnplugVibrationToggle()) {
            ContextKt.getVibrator(context).cancel();
        }
        stopSelf();
        super.onDestroy();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/ChargerDetectionService$ChargingPlugReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/donttouchphone/antitheftalarm/services/ChargerDetectionService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: ChargerDetectionService.kt */
    public final class ChargingPlugReceiver extends BroadcastReceiver {
        public ChargingPlugReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            Log.d("TTTTT", "Charger Plugin Off :" + intent);
            ChargerDetectionService.this.showReceivedBroadcastResult();
        }
    }

    private final Notification getNotification() {
        Context context = this;
        Intent intent = new Intent(context, DtmpSplashActivity.class);
        intent.setFlags(268468224);
        intent.putExtra(ConstantsKt.ACTION_STOP_CHARGER_DETECTION_SERVICE, true);
        intent.putExtra("actionType", 33);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        createNotificationChannel();
        Notification build = new NotificationCompat.Builder(getBaseContext(), ConstantsKt.CHARGER_DETECTION_NOTIFICATION_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.app_name)).setContentText(getString(R.string.unplug_service_notification)).setAutoCancel(false).setContentIntent(activity).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(ConstantsKt.CHARGER_DETECTION_NOTIFICATION_CHANNEL_ID, ConstantsKt.CHARGER_DETECTION_NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            Object systemService = getSystemService(Context.NOTIFICATION_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }
}
