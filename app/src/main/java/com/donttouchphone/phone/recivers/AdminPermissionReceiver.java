package com.donttouchphone.phone.recivers;

import android.app.ActivityManager;
import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import android.util.Log;

import com.donttouchphone.phone.services.CameraService;
import com.donttouchphone.phone.util.ContextKt;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/donttouchphone/antitheftalarm/recivers/AdminPermissionReceiver;", "Landroid/app/admin/DeviceAdminReceiver;", "()V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "onDisabled", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onEnabled", "onPasswordFailed", "user", "Landroid/os/UserHandle;", "onPasswordSucceeded", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: AdminPermissionReceiver.kt */
public final class AdminPermissionReceiver extends DeviceAdminReceiver {
    public FusedLocationProviderClient fusedLocationClient;
    private LocationCallback locationCallback;
    private LocationRequest locationRequest;

    public final FusedLocationProviderClient getFusedLocationClient() {
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationClient;
        if (fusedLocationProviderClient != null) {
            return fusedLocationProviderClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
        return null;
    }

    public final void setFusedLocationClient(FusedLocationProviderClient fusedLocationProviderClient) {
        Intrinsics.checkNotNullParameter(fusedLocationProviderClient, "<set-?>");
        this.fusedLocationClient = fusedLocationProviderClient;
    }

    public void onEnabled(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onEnabled(context, intent);
        Log.d("TestingREciever", "Receiver is Enabled");
    }

    public void onDisabled(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onDisabled(context, intent);
        Log.d("TestingREciever", "Receiver is Disabled");
        Object systemService = context.getSystemService(Context.ACTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        for (ActivityManager.RunningServiceInfo next : activityManager.getRunningServices(Integer.MAX_VALUE)) {
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            if (Intrinsics.areEqual((Object) CameraService.class.getName(), (Object) runningServiceInfo.service.getClassName())) {
                context.stopService(new Intent(context, CameraService.class));
            }
        }
    }

    public void onPasswordSucceeded(Context context, Intent intent, UserHandle userHandle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(userHandle, "user");
        super.onPasswordSucceeded(context, intent, userHandle);
        CameraService.Companion.setFailedPasswordCount(0);
    }

    public void onPasswordFailed(Context context, Intent intent, UserHandle userHandle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(userHandle, "user");
        CameraService.Companion companion = CameraService.Companion;
        companion.setFailedPasswordCount(companion.getFailedPasswordCount() + 1);
        Log.d("loginWatch", "password failed " + CameraService.Companion.getFailedPasswordCount());
        if (CameraService.Companion.getFailedPasswordCount() == ContextKt.getBaseConfig(context).getNumberOfPasswords()) {
//            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new AdminPermissionReceiver$onPasswordFailed$1(new CameraManager(context), context, (Continuation<? super AdminPermissionReceiver$onPasswordFailed$1>) null), 3, (Object) null);
        }
    }
}
