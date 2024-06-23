package com.donttouchphone.phone.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;

import com.donttouchphone.phone.models.CountryModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0003\u001a/\u0010\t\u001a\u00020\u0005*\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u001a/\u0010\u0010\u001a\u00020\u0005*\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u001a1\u0010\u0011\u001a\u00020\u0005*\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0007\u001a/\u0010\u0012\u001a\u00020\u0005*\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0006\u001a\u001a\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017*\u00020\u0006\u001a\u0016\u0010\u0018\u001a\u00020\u0001*\u00020\u00032\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a¨\u0006\u001b"}, d2 = {"canDrawOverlay", "", "activity", "Landroid/content/Context;", "checkOverlayPermission", "", "Landroid/app/Activity;", "isNetworkAvailable", "context", "askFineCamerPermission", "Landroidx/fragment/app/FragmentActivity;", "Granted", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isGranted", "askFineEXternalStragePermission", "askFineREADImagesPermission", "askNotificationPermission", "buildAlertMessageNoGps", "getLanguagesListSimpleFlags", "Ljava/util/ArrayList;", "Lcom/donttouchphone/antitheftalarm/models/CountryModel;", "Lkotlin/collections/ArrayList;", "isServiceIsRunning", "serviceClass", "Ljava/lang/Class;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Etension.kt */
public final class EtensionKt {
    public static final boolean canDrawOverlay(Context context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        return Settings.canDrawOverlays(context);
    }

//    public static final void askFineCamerPermission(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1) {
//        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
//        String[] camera_permission = Constant.Companion.getCAMERA_PERMISSION();
//        Kotlin_runtimepermissionsKt.askPermission(fragmentActivity, (String[]) Arrays.copyOf(camera_permission, camera_permission.length), (Function1<? super PermissionResult, Unit>) new EtensionKt$askFineCamerPermission$1(function1)).onDeclined(new EtensionKt$askFineCamerPermission$2(fragmentActivity, function1));
//    }
//
//    public static final void askFineEXternalStragePermission(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1) {
//        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
//        String[] read_external_storage_permission = Constant.Companion.getREAD_EXTERNAL_STORAGE_PERMISSION();
//        Kotlin_runtimepermissionsKt.askPermission(fragmentActivity, (String[]) Arrays.copyOf(read_external_storage_permission, read_external_storage_permission.length), (Function1<? super PermissionResult, Unit>) new EtensionKt$askFineEXternalStragePermission$1(function1)).onDeclined(new EtensionKt$askFineEXternalStragePermission$2(fragmentActivity, function1));
//    }
//
//    public static final void askFineREADImagesPermission(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1) {
//        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
//        String[] read_media_images_permission = Constant.Companion.getREAD_MEDIA_IMAGES_PERMISSION();
//        Kotlin_runtimepermissionsKt.askPermission(fragmentActivity, (String[]) Arrays.copyOf(read_media_images_permission, read_media_images_permission.length), (Function1<? super PermissionResult, Unit>) new EtensionKt$askFineREADImagesPermission$1(function1)).onDeclined(new EtensionKt$askFineREADImagesPermission$2(fragmentActivity, function1));
//    }
//
//    public static final void askNotificationPermission(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1) {
//        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
//        String[] post_notifications = Constant.Companion.getPOST_NOTIFICATIONS();
//        Kotlin_runtimepermissionsKt.askPermission(fragmentActivity, (String[]) Arrays.copyOf(post_notifications, post_notifications.length), (Function1<? super PermissionResult, Unit>) new EtensionKt$askNotificationPermission$1(function1)).onDeclined(new EtensionKt$askNotificationPermission$2(fragmentActivity, function1));
//    }

    public static final void buildAlertMessageNoGps(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?").setCancelable(false).setPositiveButton("Yes", new EtensionKt$$ExternalSyntheticLambda0(activity)).setNegativeButton("No", new EtensionKt$$ExternalSyntheticLambda1());
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        create.show();
    }

    /* access modifiers changed from: private */
    public static final void buildAlertMessageNoGps$lambda$0(Activity activity, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(activity, "$this_buildAlertMessageNoGps");
        activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    public static final void buildAlertMessageNoGps$lambda$1(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    private static final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService(Context.CONNECTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (!networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) && !networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) && !networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
            return false;
        }
        return true;
    }

    public static final boolean isServiceIsRunning(Context context, Class<?> cls) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(cls, "serviceClass");
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            if (Intrinsics.areEqual((Object) cls.getName(), (Object) runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static final void checkOverlayPermission(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivityForResult(intent, 1);
    }

//    public static final ArrayList<CountryModel> getLanguagesListSimpleFlags(Activity activity) {
//        Object obj;
//        Intrinsics.checkNotNullParameter(activity, "<this>");
//        ArrayList<CountryModel> arrayListOf = CollectionsKt.arrayListOf(new CountryModel("English", "en", "flag_english"), new CountryModel("français", "fr", "flag_french"),
//                new CountryModel("Deutsch", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "flag_german"), new CountryModel("日本語", "ja", "flag_japanese"), new CountryModel("한국어", "ko", "flag_south_korea"), new CountryModel("Português", "pt", "flag_portugese"), new CountryModel("Español", "es", "flag_spanish"), new CountryModel("العربية", "ar", "flag_saudi_arabia"), new CountryModel("中文", "zh", "flag_china"), new CountryModel("Italiano", "it", "flag_italy"), new CountryModel("Русский", "ru", "flag_russia"), new CountryModel("ไทย", "th", "flag_thailand"), new CountryModel("Türkçe", "tr", "flag_turkey"), new CountryModel("Tiếng Việt", "vi", "flag_vietnam"), new CountryModel("हिन्दी", "hi", "flag_hindi"), new CountryModel("Nederlands", "nl", "flag_netherlands"), new CountryModel("Bahasa Indonesia", "id", "flag_indonesia"));
//        Context context = activity;
//        if (ContextKt.getBaseConfig(context).isFirstTimeLanguage()) {
//            String language = Locale.getDefault().getLanguage();
//            Iterator it = arrayListOf.iterator();
//            while (true) {
//                if (!it.hasNext()) {
//                    obj = null;
//                    break;
//                }
//                obj = it.next();
//                if (Intrinsics.areEqual((Object) ((CountryModel) obj).getCode(), (Object) language)) {
//                    break;
//                }
//            }
//            CountryModel countryModel = (CountryModel) obj;
//            Log.d("hamsa", "getLanguagesListSimpleFlags: " + language + "  " + countryModel);
//            if (countryModel != null) {
//                ContextKt.getBaseConfig(context).setAppLanguage(language);
//            }
//        }
//        return arrayListOf;
//    }


    public static ArrayList<CountryModel> getLanguagesListSimpleFlags(Activity activity) {
        ArrayList<CountryModel> arrayList = new ArrayList<>(Arrays.asList(
                new CountryModel("English", "en", "flag_english"),
                new CountryModel("français", "fr", "flag_french"),
                new CountryModel("Deutsch", "de", "flag_german"),
                new CountryModel("日本語", "ja", "flag_japanese"),
                new CountryModel("한국어", "ko", "flag_south_korea"),
                new CountryModel("Português", "pt", "flag_portuguese"),
                new CountryModel("Español", "es", "flag_spanish"),
                new CountryModel("العربية", "ar", "flag_saudi_arabia"),
                new CountryModel("中文", "zh", "flag_china"),
                new CountryModel("Italiano", "it", "flag_italy"),
                new CountryModel("Русский", "ru", "flag_russia"),
                new CountryModel("ไทย", "th", "flag_thailand"),
                new CountryModel("Türkçe", "tr", "flag_turkey"),
                new CountryModel("Tiếng Việt", "vi", "flag_vietnam"),
                new CountryModel("हिन्दी", "hi", "flag_hindi"),
                new CountryModel("Nederlands", "nl", "flag_netherlands"),
                new CountryModel("Bahasa Indonesia", "id", "flag_indonesia")
        ));

        BaseConfig baseConfig = ContextKt.getBaseConfig(activity);
        if (baseConfig.isFirstTimeLanguage()) {
            String language = Locale.getDefault().getLanguage();
            for (CountryModel countryModel : arrayList) {
                if (countryModel.getCode().equals(language)) {
                    Log.d("hamsa", "getLanguagesListSimpleFlags: " + language + "  " + countryModel);
                    baseConfig.setAppLanguage(language);
                    break;
                }
            }
        }

        return arrayList;
    }




}
