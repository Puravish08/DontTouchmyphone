package com.donttouchphone.phone.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.database.Cursor;
import org.greenrobot.eventbus.EventBus;

import java.util.Locale;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0004¨\u0006\t"}, d2 = {"refreshLanguageStrings", "", "changeLanguage", "Landroid/app/Activity;", "languageCode", "", "get", "Landroid/database/Cursor;", "columnName", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: UtilsLanguage.kt */
public final class UtilsLanguageKt {
    @SuppressLint("Range")
    public static final String get(Cursor cursor, String str) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(str, "columnName");
        return cursor.getString(cursor.getColumnIndex(str));
    }

    public static final void changeLanguage(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Locale locale = new Locale(str);
        Configuration configuration = activity.getResources().getConfiguration();
        configuration.setLocale(locale);
        activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
    }

    public static final void refreshLanguageStrings() {
        EventBus.getDefault().post(new Events.RefreshLanguageStrings());
    }
}
