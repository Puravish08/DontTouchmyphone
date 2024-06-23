package com.donttouchphone.phone.util;

import android.widget.SeekBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/donttouchphone/phone/util/SeekBarKt$onSeekBarChangeListener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SeekBar.kt */
public final class SeekBarKt$onSeekBarChangeListener$1 implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ Function1<Integer, Unit> $seekBarChangeListener;

    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
    }

    SeekBarKt$onSeekBarChangeListener$1(Function1<? super Integer, Unit> function1) {
        this.$seekBarChangeListener = (Function1<Integer, Unit>) function1;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        this.$seekBarChangeListener.invoke(Integer.valueOf(i));
    }
}
