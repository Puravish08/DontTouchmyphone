package com.donttouchphone.phone.services;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/services/BaseService;", "Landroid/app/Service;", "()V", "isMyServiceRunning", "", "serviceClass", "Ljava/lang/Class;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: BaseService.kt */
public class BaseService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public final boolean isMyServiceRunning(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "serviceClass");
        Object systemService = getSystemService(Context.ACTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE)) {
            if (Intrinsics.areEqual((Object) cls.getName(), (Object) runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
