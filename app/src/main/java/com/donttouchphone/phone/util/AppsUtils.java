package com.donttouchphone.phone.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;

import androidx.webkit.internal.AssetHelper;


import com.donttouchphone.phone.R;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0013\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\b\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/donttouchphone/phone/util/AppsUtils;", "", "()V", "feedback", "", "context", "Landroid/content/Context;", "openUrl", "url", "", "rateUs", "sendFeedback", "shareApp", "shareAppOnMessenger", "shareAppOnWhatsApp", "shareAppViaSMS", "shareLocation", "shareLocUrl", "updateApp", "openLink", "Landroid/app/Activity;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: AppsUtils.kt */
public final class AppsUtils {
    public static final AppsUtils INSTANCE = new AppsUtils();

    private AppsUtils() {
    }

    @SuppressLint("RestrictedApi")
    public final void shareApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "Hey check out my app at: https://play.google.com/store/apps/details?id=com.donttouchphone.phone");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        context.startActivity(intent);
    }

    public final void rateUs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.donttouchphone.phone"));
        intent.addFlags(1208483840);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.donttouchphone.phone")));
        }
    }

    public final void shareAppViaSMS(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        intent.putExtra("sms_body", "Hey check out my app at: https://play.google.com/store/apps/details?id=com.donttouchphone.phone");
        context.startActivity(intent);
    }

    @SuppressLint("RestrictedApi")
    public final void shareAppOnMessenger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "Hey check out my app at: https://play.google.com/store/apps/details?id=com.donttouchphone.phone");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.setPackage("com.facebook.orca");
        try {
            context.getPackageManager().getPackageInfo("com.facebook.orca", 1);
            context.startActivity(intent);
        } catch (PackageManager.NameNotFoundException unused) {
            Toast.makeText(context, "Meta Messenger not installed.", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("RestrictedApi")
    public final void shareAppOnWhatsApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.getPackageManager().getPackageInfo("com.whatsapp", 1);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", "Hey check out my app at: https://play.google.com/store/apps/details?id=com.donttouchphone.phone");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.setPackage("com.whatsapp");
            context.startActivity(intent);
        } catch (PackageManager.NameNotFoundException unused) {
            Toast.makeText(context, "WhatsApp not installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public final void updateApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        rateUs(context);
    }

    public final void openLink(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "url");
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    @SuppressLint("RestrictedApi")
//    public final void feedback(Context context) {
//        Intrinsics.checkNotNullParameter(context, "context");
//        Intent intent = new Intent("android.intent.action.SEND");
//        intent.putExtra("android.intent.extra.EMAIL", new String[]{"care.9appsgames@gmail.com"});
//        intent.putExtra("android.intent.extra.SUBJECT", "" + context.getResources().getString(R.string.app_name));
//        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
//        context.startActivity(Intent.createChooser(intent, "Send mail"));
//    }

    public final void sendFeedback(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
//        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"smartgoldtech@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", context.getResources().getString(R.string.app_name));
        intent.putExtra("android.intent.extra.TEXT", "Please enter your feedback here");
        context.startActivity(Intent.createChooser(intent, "Send mail"));
    }

//    public final void openUrl(Context context, String str) {
//        Intrinsics.checkNotNullParameter(context, "context");
//        Intrinsics.checkNotNullParameter(str, "url");
//        Uri.parse(str);
//        if (!StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(str, DtbConstants.HTTPS, false, 2, (Object) null)) {
//            Uri.parse("http://" + str);
//        }
//        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
//        if (intent.resolveActivity(context.getPackageManager()) != null) {
//            intent.setFlags(268435456);
//            context.startActivity(intent);
//        }
//    }

    @SuppressLint("RestrictedApi")
    public final void shareLocation(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "shareLocUrl");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        context.startActivity(intent);
    }
}
