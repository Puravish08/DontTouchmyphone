package com.donttouchphone.phone.util;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\n\u0010\u000b\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\b*\u00020\u0002\u001a(\u0010\u0013\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001d"}, d2 = {"boundingBox", "Landroid/graphics/Rect;", "Landroid/view/View;", "getBoundingBox", "(Landroid/view/View;)Landroid/graphics/Rect;", "beGone", "", "beGoneIf", "", "beInvisible", "beInvisibleIf", "beVisible", "beVisibleIf", "fadeIn", "fadeOut", "isGone", "isInvisible", "isVisible", "performHapticFeedback", "setSafeOnClickListener", "interval", "", "onSafeClick", "Lkotlin/Function1;", "zoomInZoomOut", "duration", "", "scale", "", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: View.kt */
public final class ViewKt {
    public static /* synthetic */ void zoomInZoomOut$default(View view, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        zoomInZoomOut(view, j, f);
    }

    public static final void zoomInZoomOut(View view, long j, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{scaleX, f});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(ValueAnimator.REVERSE);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{scaleY, f});
        ofFloat2.setDuration(j);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat2.setRepeatMode(ValueAnimator.REVERSE);
        ofFloat2.setRepeatCount(-1);
        ofFloat.start();
        ofFloat2.start();
        view.addOnAttachStateChangeListener(new ViewKt$zoomInZoomOut$1(ofFloat, ofFloat2, view, scaleX, scaleY));
    }

    public static final void beInvisibleIf(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            beInvisible(view);
        } else {
            beVisible(view);
        }
    }

    public static final void beVisibleIf(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            beVisible(view);
        } else {
            beGone(view);
        }
    }

    public static final void beGoneIf(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        beVisibleIf(view, !z);
    }

    public static final void beInvisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(View.INVISIBLE);
    }

    public static final void beVisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(View.VISIBLE);
    }

    public static final void beGone(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(View.GONE);
    }

    public static final boolean isVisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == View.VISIBLE;
    }

    public static final boolean isInvisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == View.INVISIBLE;
    }

    public static final boolean isGone(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == View.GONE;
    }

    public static final boolean performHapticFeedback(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.performHapticFeedback(1, 2);
    }

    public static final void fadeIn(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().alpha(1.0f).setDuration(150).withStartAction(new ViewKt$$ExternalSyntheticLambda1(view)).start();
    }

    /* access modifiers changed from: private */
    public static final void fadeIn$lambda$0(View view) {
        Intrinsics.checkNotNullParameter(view, "$this_fadeIn");
        beVisible(view);
    }

    public static final void fadeOut(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().alpha(0.0f).setDuration(150).withEndAction(new ViewKt$$ExternalSyntheticLambda0(view)).start();
    }

    /* access modifiers changed from: private */
    public static final void fadeOut$lambda$1(View view) {
        Intrinsics.checkNotNullParameter(view, "$this_fadeOut");
        beGone(view);
    }

    public static final Rect getBoundingBox(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static /* synthetic */ void setSafeOnClickListener$default(View view, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1500;
        }
        setSafeOnClickListener(view, i, function1);
    }

    public static final void setSafeOnClickListener(View view, int i, Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function1, "onSafeClick");
        view.setOnClickListener(new ViewKt$$ExternalSyntheticLambda2(new Ref.LongRef(), i, function1));
    }

    /* access modifiers changed from: private */
    public static final void setSafeOnClickListener$lambda$3(Ref.LongRef longRef, int i, Function1 function1, View view) {
        Intrinsics.checkNotNullParameter(longRef, "$lastTimeClicked");
        Intrinsics.checkNotNullParameter(function1, "$onSafeClick");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longRef.element > ((long) i)) {
            longRef.element = currentTimeMillis;
            Intrinsics.checkNotNull(view);
            function1.invoke(view);
        }
    }
}
