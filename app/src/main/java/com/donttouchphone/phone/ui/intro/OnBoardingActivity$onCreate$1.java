package com.donttouchphone.phone.ui.intro;

import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.donttouchphone.phone.databinding.ActivityOnBoardingBinding;
import com.donttouchphone.phone.util.ViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/donttouchphone/phone/ui/intro/OnBoardingActivity$onCreate$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", "arg0", "", "onPageScrolled", "arg1", "", "arg2", "onPageSelected", "position", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: OnBoardingActivity.kt */
public final class OnBoardingActivity$onCreate$1 extends ViewPager2.OnPageChangeCallback {
    final /* synthetic */ OnBoardingActivity this$0;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    OnBoardingActivity$onCreate$1(OnBoardingActivity onBoardingActivity) {
        this.this$0 = onBoardingActivity;
    }

    public void onPageSelected(int i) {
        if (i == 1) {
            TextView textView = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnNextStep;
            Intrinsics.checkNotNullExpressionValue(textView, "btnNextStep");
            ViewKt.beVisible(textView);
            TextView textView2 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnGotItStep;
            Intrinsics.checkNotNullExpressionValue(textView2, "btnGotItStep");
            ViewKt.beGone(textView2);
            TextView textView3 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnSkipStep;
            Intrinsics.checkNotNullExpressionValue(textView3, "btnSkipStep");
            ViewKt.beVisible(textView3);
        } else if (i != 2) {
            TextView textView4 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnNextStep;
            Intrinsics.checkNotNullExpressionValue(textView4, "btnNextStep");
            ViewKt.beVisible(textView4);
            TextView textView5 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnGotItStep;
            Intrinsics.checkNotNullExpressionValue(textView5, "btnGotItStep");
            ViewKt.beGone(textView5);
            TextView textView6 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnSkipStep;
            Intrinsics.checkNotNullExpressionValue(textView6, "btnSkipStep");
            ViewKt.beVisible(textView6);
        } else {
            TextView textView7 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnNextStep;
            Intrinsics.checkNotNullExpressionValue(textView7, "btnNextStep");
            ViewKt.beInvisible(textView7);
            TextView textView8 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnGotItStep;
            Intrinsics.checkNotNullExpressionValue(textView8, "btnGotItStep");
            ViewKt.beVisible(textView8);
            TextView textView9 = ((ActivityOnBoardingBinding) this.this$0.getBinding()).btnSkipStep;
            Intrinsics.checkNotNullExpressionValue(textView9, "btnSkipStep");
            ViewKt.beGone(textView9);
        }
    }
}
