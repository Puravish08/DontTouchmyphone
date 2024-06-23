package com.donttouchphone.phone.util;

import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/donttouchphone/phone/util/ViewKt$zoomInZoomOut$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "p0", "Landroid/view/View;", "onViewDetachedFromWindow", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: View.kt */
public final class ViewKt$zoomInZoomOut$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ float $originalScaleX;
    final /* synthetic */ float $originalScaleY;
    final /* synthetic */ ObjectAnimator $scaleXAnimator;
    final /* synthetic */ ObjectAnimator $scaleYAnimator;
    final /* synthetic */ View $this_zoomInZoomOut;

    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
    }

    ViewKt$zoomInZoomOut$1(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, View view, float f, float f2) {
        this.$scaleXAnimator = objectAnimator;
        this.$scaleYAnimator = objectAnimator2;
        this.$this_zoomInZoomOut = view;
        this.$originalScaleX = f;
        this.$originalScaleY = f2;
    }

    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "p0");
        this.$scaleXAnimator.cancel();
        this.$scaleYAnimator.cancel();
        this.$this_zoomInZoomOut.setScaleX(this.$originalScaleX);
        this.$this_zoomInZoomOut.setScaleY(this.$originalScaleY);
    }
}
