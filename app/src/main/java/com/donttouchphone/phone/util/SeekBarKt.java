package com.donttouchphone.phone.util;

import android.widget.SeekBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\t"}, d2 = {"onSeekBarChangeListener", "", "Landroid/widget/SeekBar;", "seekBarChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "progress", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: SeekBar.kt */
public final class SeekBarKt {
    public static final void onSeekBarChangeListener(SeekBar seekBar, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(seekBar, "<this>");
        Intrinsics.checkNotNullParameter(function1, "seekBarChangeListener");
        seekBar.setOnSeekBarChangeListener(new SeekBarKt$onSeekBarChangeListener$1(function1));
    }
}
