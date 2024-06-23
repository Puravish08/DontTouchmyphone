package com.donttouchphone.phone.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/donttouchphone/antitheftalarm/util/Constant;", "", "()V", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Constant.kt */
public final class Constant {
    /* access modifiers changed from: private */
    public static final String[] CAMERA_PERMISSION = {"android.permission.CAMERA"};
    /* access modifiers changed from: private */
    public static final String[] CONTACT_PERMISSION = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static String DeviceID = "";
    /* access modifiers changed from: private */
    public static final String[] POST_NOTIFICATIONS = {"android.permission.POST_NOTIFICATIONS"};
    /* access modifiers changed from: private */
    public static final String[] READ_EXTERNAL_STORAGE_PERMISSION = {"android.permission.READ_EXTERNAL_STORAGE"};
    /* access modifiers changed from: private */
    public static final String[] READ_MEDIA_IMAGES_PERMISSION = {"android.permission.READ_MEDIA_IMAGES"};

    @JvmStatic
    public static final boolean isNetworkAvailable(Context context) {
        return Companion.isNetworkAvailable(context);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/donttouchphone/antitheftalarm/util/Constant$Companion;", "", "()V", "CAMERA_PERMISSION", "", "", "getCAMERA_PERMISSION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "CONTACT_PERMISSION", "getCONTACT_PERMISSION", "DeviceID", "getDeviceID", "()Ljava/lang/String;", "setDeviceID", "(Ljava/lang/String;)V", "POST_NOTIFICATIONS", "getPOST_NOTIFICATIONS", "READ_EXTERNAL_STORAGE_PERMISSION", "getREAD_EXTERNAL_STORAGE_PERMISSION", "READ_MEDIA_IMAGES_PERMISSION", "getREAD_MEDIA_IMAGES_PERMISSION", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: Constant.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean isNetworkAvailable(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }

        public final String getDeviceID() {
            return Constant.DeviceID;
        }

        public final void setDeviceID(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            Constant.DeviceID = str;
        }

        public final String[] getCONTACT_PERMISSION() {
            return Constant.CONTACT_PERMISSION;
        }

        public final String[] getPOST_NOTIFICATIONS() {
            return Constant.POST_NOTIFICATIONS;
        }

        public final String[] getCAMERA_PERMISSION() {
            return Constant.CAMERA_PERMISSION;
        }

        public final String[] getREAD_MEDIA_IMAGES_PERMISSION() {
            return Constant.READ_MEDIA_IMAGES_PERMISSION;
        }

        public final String[] getREAD_EXTERNAL_STORAGE_PERMISSION() {
            return Constant.READ_EXTERNAL_STORAGE_PERMISSION;
        }
    }
}
