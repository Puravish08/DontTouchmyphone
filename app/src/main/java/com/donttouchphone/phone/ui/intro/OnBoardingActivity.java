package com.donttouchphone.phone.ui.intro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityOnBoardingBinding;
import com.donttouchphone.phone.ui.PermissionActivity;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/intro/OnBoardingActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityOnBoardingBinding;", "()V", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getItem", "", "getViewBinding", "handleNativeAd", "", "screen", "", "trackingScreen", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: OnBoardingActivity.kt */
public final class OnBoardingActivity extends BaseClass<ActivityOnBoardingBinding> {
    /* access modifiers changed from: private */
    public ViewPager2 mViewPager;

    /* access modifiers changed from: private */
    public static final void onCreate$lambda$0(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = this;
        ContextKt.getBaseConfig(context).setFirstTimeLanguage(false);
        ViewPager2 viewPager2 = ((ActivityOnBoardingBinding) getBinding()).viewPager;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
        this.mViewPager = viewPager2;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(new HelpPagerAdapter(this, context));
        ViewPager2 viewPager22 = this.mViewPager;
        if (viewPager22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager22 = null;
        }
        viewPager22.setOffscreenPageLimit(1);
        ViewPager2 viewPager23 = this.mViewPager;
        if (viewPager23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager23 = null;
        }
        viewPager23.registerOnPageChangeCallback(new OnBoardingActivity$onCreate$1(this));
        TabLayout tabLayout = ((ActivityOnBoardingBinding) getBinding()).pageIndicator;
        ViewPager2 viewPager24 = this.mViewPager;
        if (viewPager24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager24 = null;
        }
        new TabLayoutMediator(tabLayout, viewPager24, new OnBoardingActivity$$ExternalSyntheticLambda0()).attach();
        TextView textView = ((ActivityOnBoardingBinding) getBinding()).btnNextStep;
        Intrinsics.checkNotNullExpressionValue(textView, "btnNextStep");
        ViewKt.setSafeOnClickListener$default(textView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.intro.OnBoardingActivity$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                ViewPager2 viewPager24;
                int item;
                Intrinsics.checkNotNullParameter(it, "it");
                viewPager24 = OnBoardingActivity.this.mViewPager;
                if (viewPager24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    viewPager24 = null;
                }
                item = OnBoardingActivity.this.getItem();
                viewPager24.setCurrentItem(item + 1, true);
            }
        }, 1, null);
        TextView textView2 = ((ActivityOnBoardingBinding) getBinding()).btnGotItStep;
        Intrinsics.checkNotNullExpressionValue(textView2, "btnGotItStep");
        ViewKt.setSafeOnClickListener$default(textView2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.intro.OnBoardingActivity$onCreate$4
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ContextKt.getBaseConfig(OnBoardingActivity.this).setAppStarted(true);
                OnBoardingActivity.this.startActivity(new Intent(OnBoardingActivity.this, PermissionActivity.class));
                OnBoardingActivity.this.finish();
            }
        }, 1, null);
        TextView textView3 = ((ActivityOnBoardingBinding) getBinding()).btnSkipStep;
        Intrinsics.checkNotNullExpressionValue(textView3, "btnSkipStep");
        ViewKt.setSafeOnClickListener$default(textView3, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.intro.OnBoardingActivity$onCreate$5
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewPager2 viewPager24 = OnBoardingActivity.this.getBinding().viewPager;
                RecyclerView.Adapter adapter = OnBoardingActivity.this.getBinding().viewPager.getAdapter();
                viewPager24.setCurrentItem((adapter != null ? adapter.getItemCount() : 0) - 1);
            }
        }, 1, null);
    }

    public ActivityOnBoardingBinding getViewBinding() {
        ActivityOnBoardingBinding inflate = ActivityOnBoardingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final int getItem() {
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        return viewPager2.getCurrentItem();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    /* access modifiers changed from: private */
}
