package com.donttouchphone.phone.util;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a*\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\"\u0010\u000b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\"\u0010\u000e\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0006\u001a\u001a\u0010\u0012\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u0014"}, d2 = {"isYesterday", "", "d", "Ljava/util/Date;", "formatDate", "", "", "context", "Landroid/content/Context;", "dateFormat", "timeFormat", "formatDateOnly", "hideTimeAtOtherDays", "showYearEvenIfCurrent", "formatDateOrTime", "getFormattedDuration", "forceShowHours", "isThisYear", "showOnlyDate", "showOnlyTime", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Int.kt */
public final class IntKt {
    public static /* synthetic */ String getFormattedDuration$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return getFormattedDuration(i, z);
    }
    private static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";

    public static String getFormattedDuration(int durationInSeconds, boolean forceHourFormat) {
        StringBuilder formattedDuration = new StringBuilder(8);

        int hours = durationInSeconds / 3600;
        int minutes = (durationInSeconds % 3600) / 60;
        int seconds = durationInSeconds % 60;

        if (durationInSeconds >= 3600) {
            formattedDuration.append(String.format(Locale.getDefault(), ZERO_LEADING_NUMBER_FORMAT, hours)).append(":");
        } else if (forceHourFormat) {
            formattedDuration.append("0:");
        }

        formattedDuration.append(String.format(Locale.getDefault(), ZERO_LEADING_NUMBER_FORMAT, minutes)).append(":");
        formattedDuration.append(String.format(Locale.getDefault(), ZERO_LEADING_NUMBER_FORMAT, seconds));

        return formattedDuration.toString();
    }

    public static /* synthetic */ String formatDate$default(int i, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return formatDate(i, context, str, str2);
    }

    public static final String formatDate(int i, Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            str = "d MMMM yyyy";
        }
        if (str2 == null) {
            str2 = "hh:mm a";
        }
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTimeInMillis(((long) i) * 1000);
        return DateFormat.format(str + ", " + str2, instance).toString();
    }

    public static final String showOnlyTime(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTimeInMillis(((long) i) * 1000);
        return DateFormat.format("hh:mm a", instance).toString();
    }

//    public static final String showOnlyDate(int i, Context context, boolean z) {
//        Intrinsics.checkNotNullParameter(context, "context");
//        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
//        instance.setTimeInMillis(((long) i) * 1000);
//        String str = "d MMMM yyyy";
//        if (!z && isThisYear(i)) {
//            str = StringsKt.trim(StringsKt.trim(StringsKt.trim(StringsKt.trim((CharSequence) StringsKt.replace$default(str, "y", "", false, 4, (Object) null)).toString(), SignatureVisitor.SUPER), '.'), '/');
//        }
//        return DateFormat.format(str, instance).toString();
//    }

    public static final String formatDateOrTime(int i, Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        long j = ((long) i) * 1000;
        instance.setTimeInMillis(j);
        if (DateUtils.isToday(j)) {
            return DateFormat.format("hh:mm a", instance).toString();
        }
        String str = "d MMMM yyyy";
        if (!z2 && isThisYear(i)) {
//            str = StringsKt.trim(StringsKt.trim(StringsKt.trim(StringsKt.trim((CharSequence) StringsKt.replace$default(str, "y", "", false, 4, (Object) null)).toString(), SignatureVisitor.SUPER), '.'), '/');
        }
        if (!z) {
            str = str + ", hh:mm a";
        }
        return DateFormat.format(str, instance).toString();
    }

    public static final boolean isYesterday(Date date) {
        Intrinsics.checkNotNullParameter(date, "d");
        return DateUtils.isToday(date.getTime() + 86400000);
    }

    public static final String formatDateOnly(int i, Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        long j = ((long) i) * 1000;
        instance.setTimeInMillis(j);
        if (DateUtils.isToday(j)) {
            return DateFormat.format("hh:mm a", instance).toString();
        }
        String str = "d MMMM yyyy";
        if (!z2 && isThisYear(i)) {
//            str = StringsKt.trim(StringsKt.trim(StringsKt.trim(StringsKt.trim((CharSequence) StringsKt.replace$default(str, "y", "", false, 4, (Object) null)).toString(), SignatureVisitor.SUPER), '.'), '/');
        }
        if (!z) {
            str = str + ", hh:mm a";
        }
        return DateFormat.format(str, instance).toString();
    }
    public static void main(String[] args) {
        // Example usage
        int durationInSeconds = 3661;  // 1 hour, 1 minute, 1 second
        boolean forceHourFormat = true;

        String formattedDuration = getFormattedDuration(durationInSeconds, forceHourFormat);
        System.out.println(formattedDuration);  // Output: 01:01:01
    }
    public static final boolean isThisYear(int i) {
        Time time = new Time();
        time.set(((long) i) * 1000);
        int i2 = time.year;
        time.set(System.currentTimeMillis());
        return i2 == time.year;
    }
}
