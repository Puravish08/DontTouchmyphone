package com.donttouchphone.phone.util;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Point;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.donttouchphone.phone.R;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0012H\u0002\u001a\u0012\u0010<\u001a\u000208*\u00020\u00022\u0006\u0010=\u001a\u00020\u000e\u001a4\u0010>\u001a\u000208*\u00020\u00022\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0018\b\u0002\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u000208\u0018\u00010C\u001a\n\u0010D\u001a\u00020\u000e*\u00020\u0002\u001a\n\u0010E\u001a\u00020\u0012*\u00020\u0002\u001a\u0012\u0010F\u001a\u00020\u000e*\u00020\u00022\u0006\u0010G\u001a\u00020\u0012\u001a\u0012\u0010H\u001a\n J*\u0004\u0018\u00010I0I*\u00020\u0002\u001a\n\u0010K\u001a\u00020\u000e*\u00020\u0002\u001a*\u0010L\u001a\u000208*\u00020\u00022\u0006\u0010M\u001a\u00020N2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000208\u0018\u00010C\u001a\u0012\u0010O\u001a\u00020\u0018*\u00020\u00022\u0006\u0010P\u001a\u00020\u0012\u001a\n\u0010Q\u001a\u00020\u0018*\u00020\u0002\u001a\n\u0010R\u001a\u00020\u0018*\u00020\u0002\u001a\u0012\u0010S\u001a\u000208*\u00020\u00022\u0006\u0010T\u001a\u00020U\u001a|\u0010V\u001a\u000208*\u00020\u00022\u0006\u0010W\u001a\u00020X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000e0Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010Z2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010^\u001a\u00020\u00182!\u0010_\u001a\u001d\u0012\u0013\u0012\u00110`¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(c\u0012\u0004\u0012\u0002080C¢\u0006\u0002\u0010d\u001a\u0014\u0010e\u001a\u000208*\u00020f2\b\b\u0002\u0010g\u001a\u00020\u0012\u001a \u0010h\u001a\u000208*\u00020\u00022\n\u0010i\u001a\u00060jj\u0002`k2\b\b\u0002\u0010;\u001a\u00020\u0012\u001a\u001c\u0010h\u001a\u000208*\u00020\u00022\u0006\u0010l\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\u0012\u001a\n\u0010m\u001a\u000208*\u00020\u0002\u001a\n\u0010n\u001a\u000208*\u00020\u0002\u001a\u001c\u0010o\u001a\u000208*\u00020\u00022\u0006\u0010G\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012\u001a\u001c\u0010o\u001a\u000208*\u00020\u00022\u0006\u0010l\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\u0012\u001a\u0012\u0010p\u001a\u000208*\u00020\u00022\u0006\u0010q\u001a\u00020\u0018\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0015\u0010\u001b\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\"\u0015\u0010\u001d\u001a\u00020\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010!\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014\"\u0015\u0010#\u001a\u00020$*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010'\u001a\u00020\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010 \"\u0015\u0010)\u001a\u00020**\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u0010-\u001a\u00020\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010 \"\u0015\u0010/\u001a\u000200*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0015\u00103\u001a\u000204*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006r"}, d2 = {"audioManager", "Landroid/media/AudioManager;", "Landroid/content/Context;", "getAudioManager", "(Landroid/content/Context;)Landroid/media/AudioManager;", "baseConfig", "Lcom/donttouchphone/antitheftalarm/util/BaseConfig;", "getBaseConfig", "(Landroid/content/Context;)Lcom/donttouchphone/antitheftalarm/util/BaseConfig;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;", "countryIso", "", "getCountryIso", "(Landroid/content/Context;)Ljava/lang/String;", "current_music_volume_level", "", "getCurrent_music_volume_level", "(Landroid/content/Context;)I", "navigationBarHeight", "getNavigationBarHeight", "navigationBarOnBottom", "", "getNavigationBarOnBottom", "(Landroid/content/Context;)Z", "navigationBarOnSide", "getNavigationBarOnSide", "navigationBarSize", "Landroid/graphics/Point;", "getNavigationBarSize", "(Landroid/content/Context;)Landroid/graphics/Point;", "newNavigationBarHeight", "getNewNavigationBarHeight", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "realScreenSize", "getRealScreenSize", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "usableScreenSize", "getUsableScreenSize", "vibrator", "Landroid/os/Vibrator;", "getVibrator", "(Landroid/content/Context;)Landroid/os/Vibrator;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "(Landroid/content/Context;)Landroid/view/WindowManager;", "doToast", "", "context", "message", "length", "copyToClipboard", "text", "getCompleteAddressString", "latitude", "", "longitude", "callBack", "Lkotlin/Function1;", "getConnectedWifiName", "getDeviceBatteryPercentage", "getPermissionString", "id", "getSharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getStoreUrl", "getTimeFromTimeStamp", "timeStamp", "", "hasPermission", "permId", "isNetworkAvailable", "isNetworkConnected", "launchActivityIntent", "intent", "Landroid/content/Intent;", "queryCursor", "uri", "Landroid/net/Uri;", "projection", "", "selection", "selectionArgs", "sortOrder", "showErrors", "callback", "Landroid/database/Cursor;", "Lkotlin/ParameterName;", "name", "cursor", "(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "reduceDragSensitivity", "Landroidx/viewpager2/widget/ViewPager2;", "f", "showErrorToast", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "startVibration", "stopVibration", "toast", "toggleFlashLight", "mFlashLight_Status", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Context.kt */
public final class ContextKt {
    public static final SharedPreferences getSharedPrefs(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getSharedPreferences("Prefs", 0);
    }

    public static final BaseConfig getBaseConfig(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return BaseConfig.Companion.newInstance(context);
    }

    public static final NotificationManager getNotificationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public static final CameraManager getCameraManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.CAMERA_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    public static final Vibrator getVibrator(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.VIBRATOR_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService;
    }

    public static final AudioManager getAudioManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.AUDIO_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public static final int getCurrent_music_volume_level(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getAudioManager(context).getStreamVolume(3);
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.TELEPHONY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }

    public static final String getCountryIso(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.TELEPHONY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        return networkCountryIso;
    }

    public static final int getNavigationBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!getNavigationBarOnBottom(context) || getNavigationBarSize(context).y == getUsableScreenSize(context).y) {
            return 0;
        }
        return getNavigationBarSize(context).y;
    }

    public static final WindowManager getWindowManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.WINDOW_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    public static final Point getUsableScreenSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Point point = new Point();
        getWindowManager(context).getDefaultDisplay().getSize(point);
        return point;
    }

    public static final Point getRealScreenSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Point point = new Point();
        getWindowManager(context).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static final boolean getNavigationBarOnSide(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getUsableScreenSize(context).x < getRealScreenSize(context).x && getUsableScreenSize(context).x > getUsableScreenSize(context).y;
    }

    public static final boolean getNavigationBarOnBottom(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getUsableScreenSize(context).y < getRealScreenSize(context).y;
    }

    public static final Point getNavigationBarSize(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (getNavigationBarOnSide(context)) {
            return new Point(getNewNavigationBarHeight(context), getUsableScreenSize(context).y);
        }
        if (getNavigationBarOnBottom(context)) {
            return new Point(getUsableScreenSize(context).x, getNewNavigationBarHeight(context));
        }
        return new Point();
    }

    public static final int getNewNavigationBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ void toast$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        toast(context, i, i2);
    }

    public static final void toast(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        toast(context, string, i2);
    }

    public static /* synthetic */ void toast$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        toast(context, str, i);
    }

    public static final void toast(Context context, String str, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        try {
            if (ConstantsKt.isOnMainThread()) {
                doToast(context, str, i);
            } else {
                new Handler(Looper.getMainLooper()).post(new ContextKt$$ExternalSyntheticLambda0(context, str, i));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void toast$lambda$2(Context context, String str, int i) {
        Intrinsics.checkNotNullParameter(context, "$this_toast");
        Intrinsics.checkNotNullParameter(str, "$msg");
        doToast(context, str, i);
    }

    private static final void doToast(Context context, String str, int i) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                Toast.makeText(context, str, i).show();
                return;
            }
            return;
        }
        Toast.makeText(context, str, i).show();
    }

    public static /* synthetic */ void showErrorToast$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        showErrorToast(context, str, i);
    }

    public static final void showErrorToast(Context context, String str, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
//        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format("error", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        toast(context, format, i);
    }

    public static /* synthetic */ void showErrorToast$default(Context context, Exception exc, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        showErrorToast(context, exc, i);
    }

    public static final void showErrorToast(Context context, Exception exc, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(exc, "exception");
        showErrorToast(context, exc.toString(), i);
    }

    public static final boolean isNetworkConnected(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void reduceDragSensitivity$default(ViewPager2 viewPager2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        reduceDragSensitivity(viewPager2, i);
    }

    public static final void reduceDragSensitivity(ViewPager2 viewPager2, int i) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Field declaredField = null;
        try {
            declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        declaredField.setAccessible(true);
        Object obj = null;
        try {
            obj = declaredField.get(viewPager2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) obj;
        Field declaredField2 = null;
        try {
            declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        declaredField2.setAccessible(true);
        Object obj2 = null;
        try {
            obj2 = declaredField2.get(recyclerView);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        try {
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * i));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ void queryCursor$default(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z, Function1 function1, int i, Object obj) {
        queryCursor(context, uri, strArr, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : strArr2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z, function1);
    }



//    public static final void queryCursor(Context context, Uri uri, String[] projection, String str, String[] strArr, String str2, boolean z, Function1<? super Cursor, Unit> callback) {
//        Intrinsics.checkNotNullParameter(context, "<this>");
//        Intrinsics.checkNotNullParameter(uri, "uri");
//        Intrinsics.checkNotNullParameter(projection, "projection");
//        Intrinsics.checkNotNullParameter(callback, "callback");
//        try {
//            Cursor query = context.getContentResolver().query(uri, projection, str, strArr, str2);
//            if (query != null) {
//                Cursor cursor = query;
//                Cursor cursor2 = cursor;
//                if (query.moveToFirst()) {
//                    do {
//                        callback.invoke(query);
//                    } while (query.moveToNext());
//                    Unit unit = Unit.INSTANCE;
//                    Closeable.closeFinally(cursor, null);
//                }
//                Unit unit2 = Unit.INSTANCE;
//                Closeable.closeFinally(cursor, null);
//            }
//        } catch (Exception unused) {
//        }
//    }


    public static void queryCursor(Context context, Uri uri, String[] projection, String selection,
                                   String[] selectionArgs, String sortOrder, boolean distinct,
                                   Function1<? super Cursor, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(callback, "callback");

        try (Cursor cursor = context.getContentResolver().query(uri, projection, selection,
                selectionArgs, sortOrder)) {
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    callback.invoke(cursor);
                }
            }
        } catch (Exception e) {
            // Handle exception as needed
            e.printStackTrace();
        }
    }

    public static final boolean hasPermission(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextCompat.checkSelfPermission(context, getPermissionString(context, i)) == 0;
    }

    public static final String getPermissionString(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        switch (i) {
            case 1:
                return "android.permission.READ_EXTERNAL_STORAGE";
            case 2:
                return "android.permission.WRITE_EXTERNAL_STORAGE";
            case 3:
                return "android.permission.CAMERA";
            case 4:
                return "android.permission.RECORD_AUDIO";
            case 5:
                return "android.permission.READ_CONTACTS";
            case 6:
                return "android.permission.WRITE_CONTACTS";
            case 7:
                return "android.permission.READ_CALENDAR";
            case 8:
                return "android.permission.WRITE_CALENDAR";
            case 9:
                return "android.permission.CALL_PHONE";
            case 10:
                return "android.permission.READ_CALL_LOG";
            case 11:
                return "android.permission.WRITE_CALL_LOG";
            case 12:
                return "android.permission.GET_ACCOUNTS";
            case 13:
                return "android.permission.READ_SMS";
            case 14:
                return "android.permission.SEND_SMS";
            case 15:
                return "android.permission.READ_PHONE_STATE";
            case 16:
                if (ConstantsKt.isQPlus()) {
                    return "android.permission.ACCESS_MEDIA_LOCATION";
                }
                return "";
            case 17:
                return "android.permission.POST_NOTIFICATIONS";
            case 18:
                return "android.permission.READ_MEDIA_IMAGES";
            case 19:
                return "android.permission.READ_MEDIA_VIDEO";
            case 20:
                return "android.permission.READ_MEDIA_AUDIO";
            case 21:
                return "android.permission.ACCESS_FINE_LOCATION";
            case 22:
                return "android.permission.ACCESS_COARSE_LOCATION";
            default:
                return "";
        }
    }

    public static final boolean isNetworkAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final void launchActivityIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            toast$default(context, "No App found", 0, 2, (Object) null);
        } catch (Exception e) {
            showErrorToast$default(context, e, 0, 2, (Object) null);
        }
    }

    public static final String getStoreUrl(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return "https://play.google.com/store/apps/details?id=" + context.getPackageName();
    }

    public static final void toggleFlashLight(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            getCameraManager(context).setTorchMode(getCameraManager(context).getCameraIdList()[0], z);
        } catch (Exception unused) {
        }
    }

    public static final void startVibration(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(Context.VIBRATOR_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            long[] jArr = {0, 100, 1000};
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, 0));
            } else {
                vibrator.vibrate(jArr, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void stopVibration(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(Context.VIBRATOR_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void copyToClipboard(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "text");
        ClipData newPlainText = ClipData.newPlainText(context.getString(R.string.app_name), str);
        Object systemService = context.getSystemService(Context.CLIPBOARD_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
        toast$default(context, "Copied", 0, 2, (Object) null);
    }

    public static final int getDeviceBatteryPercentage(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.BATTERY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return ((BatteryManager) systemService).getIntProperty(4);
    }

    public static final String getConnectedWifiName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                Object systemService2 = context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                WifiInfo connectionInfo = ((WifiManager) systemService2).getConnectionInfo();
                Intrinsics.checkNotNullExpressionValue(connectionInfo, "getConnectionInfo(...)");
                return connectionInfo.getSSID().toString();
            } else if (activeNetworkInfo.getType() == 0) {
                return "Mobile Data";
            }
        }
        return "Unknown";
    }

    public static /* synthetic */ void getCompleteAddressString$default(Context context, double d, double d2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        getCompleteAddressString(context, d, d2, function1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r10 = r7.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void getCompleteAddressString(Context r7, double r8, double r10, Function1<? super String, Unit> r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.location.Geocoder r1 = new android.location.Geocoder     // Catch:{ Exception -> 0x00a4 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00a4 }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x00a4 }
            r6 = 1
            r2 = r8
            r4 = r10
            java.util.List r7 = r1.getFromLocation(r2, r4, r6)     // Catch:{ Exception -> 0x00a4 }
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0026
            java.lang.Object r10 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r10 = (android.location.Address) r10     // Catch:{ Exception -> 0x00a4 }
            if (r10 == 0) goto L_0x0026
            java.lang.String r10 = r10.getAddressLine(r9)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0027
        L_0x0026:
            r10 = r8
        L_0x0027:
            if (r10 == 0) goto L_0x003d
            if (r12 == 0) goto L_0x003c
            java.lang.Object r7 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r7 = (android.location.Address) r7     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.getAddressLine(r9)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00a4 }
            r12.invoke(r7)     // Catch:{ Exception -> 0x00a4 }
        L_0x003c:
            return
        L_0x003d:
            if (r7 == 0) goto L_0x004c
            java.lang.Object r10 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r10 = (android.location.Address) r10     // Catch:{ Exception -> 0x00a4 }
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r10.getLocality()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x004d
        L_0x004c:
            r10 = r8
        L_0x004d:
            if (r10 == 0) goto L_0x005f
            if (r12 == 0) goto L_0x005e
            java.lang.Object r7 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r7 = (android.location.Address) r7     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.getLocality()     // Catch:{ Exception -> 0x00a4 }
            r12.invoke(r7)     // Catch:{ Exception -> 0x00a4 }
        L_0x005e:
            return
        L_0x005f:
            if (r7 == 0) goto L_0x006e
            java.lang.Object r10 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r10 = (android.location.Address) r10     // Catch:{ Exception -> 0x00a4 }
            if (r10 == 0) goto L_0x006e
            java.lang.String r10 = r10.getAdminArea()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x006f
        L_0x006e:
            r10 = r8
        L_0x006f:
            if (r10 == 0) goto L_0x0081
            if (r12 == 0) goto L_0x0080
            java.lang.Object r7 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r7 = (android.location.Address) r7     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.getAdminArea()     // Catch:{ Exception -> 0x00a4 }
            r12.invoke(r7)     // Catch:{ Exception -> 0x00a4 }
        L_0x0080:
            return
        L_0x0081:
            if (r7 == 0) goto L_0x008f
            java.lang.Object r10 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r10 = (android.location.Address) r10     // Catch:{ Exception -> 0x00a4 }
            if (r10 == 0) goto L_0x008f
            java.lang.String r8 = r10.getCountryName()     // Catch:{ Exception -> 0x00a4 }
        L_0x008f:
            if (r8 == 0) goto L_0x009c
            java.lang.Object r7 = r7.get(r9)     // Catch:{ Exception -> 0x00a4 }
            android.location.Address r7 = (android.location.Address) r7     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.getCountryName()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x009e
        L_0x009c:
            java.lang.String r7 = "Unknown Location"
        L_0x009e:
            if (r12 == 0) goto L_0x00ab
            r12.invoke(r7)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ab
        L_0x00a4:
            if (r12 == 0) goto L_0x00ab
            java.lang.String r7 = "Please Check internet Connection"
            r12.invoke(r7)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donttouchphone.phone.util.ContextKt.getCompleteAddressString(android.content.Context, double, double, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void getTimeFromTimeStamp$default(Context context, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        getTimeFromTimeStamp(context, j, function1);
    }

    public static final void getTimeFromTimeStamp(Context context, long j, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" MMM d 'at' hh:mm a");
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.getDefault());
        dateFormatSymbols.setAmPmStrings(new String[]{"am", "pm"});
        simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
        String format = simpleDateFormat.format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        PrintStream printStream = System.out;
        Intrinsics.checkNotNullExpressionValue(printStream, "out");
        printStream.println("time is " + format);
        if (function1 != null) {
            function1.invoke(format);
        }
    }
}
