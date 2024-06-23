package com.donttouchphone.phone.services;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.recivers.AdminPermissionReceiver;
import com.donttouchphone.phone.ui.DtmpSplashActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/CameraService;", "Landroid/app/Service;", "()V", "createNotificationChannel", "", "getNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "i", "i2", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: CameraService.kt */
public final class CameraService extends Service {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int failedPasswordCount;
    /* access modifiers changed from: private */
    public static boolean serviceRunning;

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/CameraService$Companion;", "", "()V", "failedPasswordCount", "", "getFailedPasswordCount", "()I", "setFailedPasswordCount", "(I)V", "serviceRunning", "", "getServiceRunning", "()Z", "setServiceRunning", "(Z)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: CameraService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getServiceRunning() {
            return CameraService.serviceRunning;
        }

        public final void setServiceRunning(boolean z) {
            CameraService.serviceRunning = z;
        }

        public final int getFailedPasswordCount() {
            return CameraService.failedPasswordCount;
        }

        public final void setFailedPasswordCount(int i) {
            CameraService.failedPasswordCount = i;
        }
    }

    public CameraService() {
        serviceRunning = false;
        failedPasswordCount = 0;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return Service.START_STICKY;
            }
            startForeground(ConstantsKt.INTRUDER_SERVICE_NOTIFICATION_ID, getNotification());
            return Service.START_STICKY;
        } catch (Exception e) {
            e.printStackTrace();
            return Service.START_STICKY;
        }
    }

    public void onCreate() {
        super.onCreate();
        serviceRunning = true;
        new AdminPermissionReceiver();
    }

    public void onDestroy() {
        super.onDestroy();
        serviceRunning = false;
    }

    @SuppressLint("WrongConstant")
    private final Notification getNotification() {
        Context context = this;
        Intent intent = new Intent(context, DtmpSplashActivity.class);
        intent.setFlags(268468224);
        intent.putExtra(ConstantsKt.ACTION_STOP_INTRUDER_SERVICE, true);
        intent.putExtra("actionType", 44);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        createNotificationChannel();
        Notification build = new NotificationCompat.Builder(getBaseContext(), ConstantsKt.INTRUDER_NOTIFICATION_CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(getString(R.string.app_name)).setContentText(getString(R.string.camera_service_notification)).setAutoCancel(false).setContentIntent(activity).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(ConstantsKt.INTRUDER_NOTIFICATION_CHANNEL_ID, ConstantsKt.INTRUDER_NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            Object systemService = getSystemService(Context.NOTIFICATION_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }
}
