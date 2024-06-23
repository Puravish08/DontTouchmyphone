package com.donttouchphone.phone.util;

import android.app.Activity;
import android.os.Build;
import android.os.Looper;

import androidx.core.view.WindowInsetsControllerCompat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010M\u001a\u00020N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0P\u001a\b\u0010Q\u001a\u00020RH\u0007\u001a\b\u0010S\u001a\u00020RH\u0007\u001a\b\u0010T\u001a\u00020RH\u0007\u001a\u0006\u0010U\u001a\u00020R\u001a\b\u0010V\u001a\u00020RH\u0007\u001a\b\u0010W\u001a\u00020RH\u0007\u001a\b\u0010X\u001a\u00020RH\u0007\u001a\b\u0010Y\u001a\u00020RH\u0007\u001a\b\u0010Z\u001a\u00020RH\u0007\u001a\b\u0010[\u001a\u00020RH\u0007\u001a\b\u0010\\\u001a\u00020RH\u0007\u001a\b\u0010]\u001a\u00020RH\u0007\u001a\u001a\u0010^\u001a\u00020N*\u00020_2\u0006\u0010`\u001a\u00020\r2\u0006\u0010a\u001a\u00020R\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\rXT¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020IXT¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"ACTION_STOP_ANTI_POCKET", "", "ACTION_STOP_CHARGER_DETECTION_SERVICE", "ACTION_STOP_CLAP_SERVICE", "ACTION_STOP_INTRUDER_SERVICE", "ACTION_STOP_RINGTONE_SERVICE", "ACTION_STOP_SHAKING_DEVICE_SERVICE", "ACTION_STOP_SPEEDO_METER_SERVICE", "ACTION_STOP_WHISTLE_SERVICE", "ACTION_Stop_UPDATE_DEVICE_LOCATION_SERVICE", "ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_ID", "ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_NAME", "ANTI_POCKET_SERVICE_NOTIFICATION_ID", "", "CHARGER_DETECTION_NOTIFICATION_CHANNEL_ID", "CHARGER_DETECTION_NOTIFICATION_CHANNEL_NAME", "CHARGER_DETECTION_NOTIFICATION_ID", "DEVICE_SHAKING_NOTIFICATION_CHANNEL_ID", "DEVICE_SHAKING_NOTIFICATION_CHANNEL_NAME", "DEVICE_SHAKING_NOTIFICATION_ID", "ENTER_PLACE_CHANNEL", "ENTER_PLACE_ID", "EXIT_PLACE_CHANNEL", "EXIT_PLACE_ID", "INTRUDERS_IMAGES_LOCATION_ADDRESS", "INTRUDER_NOTIFICATION_CHANNEL_ID", "INTRUDER_NOTIFICATION_CHANNEL_NAME", "INTRUDER_SERVICE_NOTIFICATION_ID", "IS_USING_SYSTEM_THEME", "LAST_HOPE_CHANNEL", "LAST_HOPE_ID", "PERMISSION_ACCESS_COURSE_LOCATION", "PERMISSION_ACCESS_FINE_LOCATION", "PERMISSION_CALL_PHONE", "PERMISSION_CAMERA", "PERMISSION_GET_ACCOUNTS", "PERMISSION_MEDIA_LOCATION", "PERMISSION_POST_NOTIFICATIONS", "PERMISSION_READ_CALENDAR", "PERMISSION_READ_CALL_LOG", "PERMISSION_READ_CONTACTS", "PERMISSION_READ_MEDIA_AUDIO", "PERMISSION_READ_MEDIA_IMAGES", "PERMISSION_READ_MEDIA_VIDEO", "PERMISSION_READ_PHONE_STATE", "PERMISSION_READ_SMS", "PERMISSION_READ_STORAGE", "PERMISSION_RECORD_AUDIO", "PERMISSION_SEND_SMS", "PERMISSION_WRITE_CALENDAR", "PERMISSION_WRITE_CALL_LOG", "PERMISSION_WRITE_CONTACTS", "PERMISSION_WRITE_STORAGE", "RING_1", "RING_10", "RING_11", "RING_12", "RING_13", "RING_14", "RING_15", "RING_16", "RING_17", "RING_18", "RING_19", "RING_2", "RING_3", "RING_4", "RING_5", "RING_6", "RING_7", "RING_8", "RING_9", "SHORT_ANIMATION_DURATION", "", "SIM_CHANGE_CHANNEL", "SIM_CHANGE_ID", "Sim_Data_Key", "ensureBackgroundThread", "", "callback", "Lkotlin/Function0;", "isMarshmallowPlus", "", "isNougatMR1Plus", "isNougatPlus", "isOnMainThread", "isOreoMr1Plus", "isOreoPlus", "isPiePlus", "isQPlus", "isRPlus", "isSPlus", "isSV2Plus", "isTiramisuPlus", "changeStatusBarColor", "Landroid/app/Activity;", "color", "isAppearanceLightStatusBars", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Constants.kt */
public final class ConstantsKt {
    public static final String ACTION_STOP_ANTI_POCKET = "ACTION_STOP_ANTI_POCKET";
    public static final String ACTION_STOP_CHARGER_DETECTION_SERVICE = "ACTION_STOP_CHARGER_DETECTION_SERVICE";
    public static final String ACTION_STOP_CLAP_SERVICE = "ACTION_STOP_CLAP_SERVICE";
    public static final String ACTION_STOP_INTRUDER_SERVICE = "ACTION_STOP_INTRUDER_SERVICE";
    public static final String ACTION_STOP_RINGTONE_SERVICE = "ACTION_STOP_RINGTONE_SERVICE";
    public static final String ACTION_STOP_SHAKING_DEVICE_SERVICE = "ACTION_STOP_SHAKING_DEVICE_SERVICE";
    public static final String ACTION_STOP_SPEEDO_METER_SERVICE = "ACTION_STOP_SPEEDO_METER_SERVICE";
    public static final String ACTION_STOP_WHISTLE_SERVICE = "ACTION_STOP_WHISTLE_SERVICE";
    public static final String ACTION_Stop_UPDATE_DEVICE_LOCATION_SERVICE = "ACTION_Stop_UPDATE_DEVICE_LOCATION_SERVICE";
    public static final String ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_ID = "ANTI_POCKET_NOTIFICATION_CHANNEL_ID_2121";
    public static final String ANTI_POCKET_SERVICE_NOTIFICATION_CHANNEL_NAME = "ANTI_POCKET_SERVICE_NOTIFICATION";
    public static final int ANTI_POCKET_SERVICE_NOTIFICATION_ID = 1425;
    public static final String CHARGER_DETECTION_NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID_30018";
    public static final String CHARGER_DETECTION_NOTIFICATION_CHANNEL_NAME = "CHARGER_DETECTION_SERVICE_NOTIFICATION";
    public static final int CHARGER_DETECTION_NOTIFICATION_ID = 1338;
    public static final String DEVICE_SHAKING_NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID_30015";
    public static final String DEVICE_SHAKING_NOTIFICATION_CHANNEL_NAME = "DEVICE_SHAKING_SERVICE_NOTIFICATION";
    public static final int DEVICE_SHAKING_NOTIFICATION_ID = 1337;
    public static final String ENTER_PLACE_CHANNEL = "ENTER_PLACE_NOTIFICATION";
    public static final String ENTER_PLACE_ID = "ENTER_PLACE_NOTIFICATION_CHANNEL_ID";
    public static final String EXIT_PLACE_CHANNEL = "EXIT_PLACE_NOTIFICATION";
    public static final String EXIT_PLACE_ID = "EXIT_PLACE_NOTIFICATION_CHANNEL_ID";
    public static final String INTRUDERS_IMAGES_LOCATION_ADDRESS = "FindLostPhoneIntrudersImages";
    public static final String INTRUDER_NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID_25650";
    public static final String INTRUDER_NOTIFICATION_CHANNEL_NAME = "INTRUDER_SERVICE_NOTIFICATION";
    public static final int INTRUDER_SERVICE_NOTIFICATION_ID = 1352;
    public static final String IS_USING_SYSTEM_THEME = "is_using_system_theme";
    public static final String LAST_HOPE_CHANNEL = "LAST_HOPE_NOTIFICATION";
    public static final String LAST_HOPE_ID = "LAST_HOPE_NOTIFICATION_CHANNEL_ID";
    public static final int PERMISSION_ACCESS_COURSE_LOCATION = 22;
    public static final int PERMISSION_ACCESS_FINE_LOCATION = 21;
    public static final int PERMISSION_CALL_PHONE = 9;
    public static final int PERMISSION_CAMERA = 3;
    public static final int PERMISSION_GET_ACCOUNTS = 12;
    public static final int PERMISSION_MEDIA_LOCATION = 16;
    public static final int PERMISSION_POST_NOTIFICATIONS = 17;
    public static final int PERMISSION_READ_CALENDAR = 7;
    public static final int PERMISSION_READ_CALL_LOG = 10;
    public static final int PERMISSION_READ_CONTACTS = 5;
    public static final int PERMISSION_READ_MEDIA_AUDIO = 20;
    public static final int PERMISSION_READ_MEDIA_IMAGES = 18;
    public static final int PERMISSION_READ_MEDIA_VIDEO = 19;
    public static final int PERMISSION_READ_PHONE_STATE = 15;
    public static final int PERMISSION_READ_SMS = 13;
    public static final int PERMISSION_READ_STORAGE = 1;
    public static final int PERMISSION_RECORD_AUDIO = 4;
    public static final int PERMISSION_SEND_SMS = 14;
    public static final int PERMISSION_WRITE_CALENDAR = 8;
    public static final int PERMISSION_WRITE_CALL_LOG = 11;
    public static final int PERMISSION_WRITE_CONTACTS = 6;
    public static final int PERMISSION_WRITE_STORAGE = 2;
    public static final String RING_1 = "Alarm Clock";
    public static final String RING_10 = "Elephant";
    public static final String RING_11 = "Hello";
    public static final String RING_12 = "Horn";
    public static final String RING_13 = "Lazy Cat";
    public static final String RING_14 = "Loin";
    public static final String RING_15 = "Music";
    public static final String RING_16 = "Old Phone";
    public static final String RING_17 = "Roaster";
    public static final String RING_18 = "Scary";
    public static final String RING_19 = "Whistle";
    public static final String RING_2 = "Alarm loude";
    public static final String RING_3 = "Baby Sound";
    public static final String RING_4 = "Car Break";
    public static final String RING_5 = "Car Horn";
    public static final String RING_6 = "Cat Run";
    public static final String RING_7 = "Cow ";
    public static final String RING_8 = "Cycle Bell";
    public static final String RING_9 = "Dog";
    public static final long SHORT_ANIMATION_DURATION = 150;
    public static final String SIM_CHANGE_CHANNEL = "SIM_CHANGE_NOTIFICATION";
    public static final String SIM_CHANGE_ID = "SIM_CHANGE_NOTIFICATION_CHANNEL_ID";
    public static final String Sim_Data_Key = "PhoneFinderSimDataKey";

    public static final boolean isMarshmallowPlus() {
        return true;
    }

    public static final boolean isNougatPlus() {
        return true;
    }

    public static final boolean isOnMainThread() {
        return Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper());
    }

    public static final void ensureBackgroundThread(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "callback");
        if (isOnMainThread()) {
            new Thread(new ConstantsKt$$ExternalSyntheticLambda0(function0)).start();
        } else {
            function0.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void ensureBackgroundThread$lambda$0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$callback");
        function0.invoke();
    }

    public static final void changeStatusBarColor(Activity activity, int i, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().setStatusBarColor(activity.getResources().getColor(i));
        new WindowInsetsControllerCompat(activity.getWindow(), activity.getWindow().getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static final boolean isNougatMR1Plus() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static final boolean isOreoPlus() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean isOreoMr1Plus() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static final boolean isPiePlus() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isSV2Plus() {
        return Build.VERSION.SDK_INT >= 32;
    }

    public static final boolean isQPlus() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isRPlus() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isSPlus() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final boolean isTiramisuPlus() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
