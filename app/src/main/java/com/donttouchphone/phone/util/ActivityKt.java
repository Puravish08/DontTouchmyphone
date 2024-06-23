package com.donttouchphone.phone.util;

import android.app.Activity;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.models.SoundsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"getAllSounds", "Ljava/util/ArrayList;", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "Lkotlin/collections/ArrayList;", "Landroid/app/Activity;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Activity.kt */
public final class ActivityKt {
    public static final ArrayList<SoundsModel> getAllSounds(Activity activity) {
        Activity activity2 = activity;
        Intrinsics.checkNotNullParameter(activity2, "<this>");
        ArrayList<SoundsModel> arrayList = new ArrayList<>();
        String string = activity2.getString(R.string.alarm_clock);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new SoundsModel(string, R.raw.ringtone, R.raw.animation, R.drawable.anim_alarm, 0, false));
        String string2 = activity2.getString(R.string.alarm_lound);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new SoundsModel(string2, R.raw.alarm_loude, R.raw.alarm_loude_anim, R.drawable.anim_alaramloud, 1, false));
        String string3 = activity2.getString(R.string.cat_run);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new SoundsModel(string3, R.raw.cat_run, R.raw.cat_run_anim, R.drawable.anim_cat_run, 2, false));
        String string4 = activity2.getString(R.string.cow);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new SoundsModel(string4, R.raw.cow, R.raw.cow_anim, R.drawable.anim_cow, 3, false));
        String string5 = activity2.getString(R.string.cycle_bell);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new SoundsModel(string5, R.raw.cycle_bell, R.raw.cycle_bell_anim, R.drawable.anim_cycle_bell, 4, false));
        String string6 = activity2.getString(R.string.dog);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new SoundsModel(string6, R.raw.dog, R.raw.dog_anim, R.drawable.anim_dog, 5, false));
        String string7 = activity2.getString(R.string.elephant);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        arrayList.add(new SoundsModel(string7, R.raw.elephant, R.raw.elephant_anim, R.drawable.anim_elephant, 6, false));
        String string8 = activity2.getString(R.string.hello);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new SoundsModel(string8, R.raw.hello, R.raw.hello_anim, R.drawable.anim_hello, 7, false));
        String string9 = activity2.getString(R.string.loin);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        arrayList.add(new SoundsModel(string9, R.raw.lion, R.raw.lion_anim, R.drawable.anim_lion, 9, false));
        String string10 = activity2.getString(R.string.music);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        arrayList.add(new SoundsModel(string10, R.raw.music, R.raw.music_anim, R.drawable.anim_music, 10, false));
        return arrayList;
    }
}
