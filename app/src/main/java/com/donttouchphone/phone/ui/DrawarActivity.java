package com.donttouchphone.phone.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityDrawarBinding;
import com.donttouchphone.phone.util.AppsUtils;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/DrawarActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityDrawarBinding;", "()V", "getViewBinding", "handleNativeAd", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: DrawarActivity.kt */
public final class DrawarActivity extends BaseClass<ActivityDrawarBinding> {
    public ActivityDrawarBinding getViewBinding() {
        ActivityDrawarBinding inflate = ActivityDrawarBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout rateUs = getBinding().rateUs;
        Intrinsics.checkNotNullExpressionValue(rateUs, "rateUs");
        ViewKt.setSafeOnClickListener$default(rateUs, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AppsUtils.INSTANCE.rateUs(DrawarActivity.this);
            }
        }, 1, null);
        ImageView ivBack = getBinding().ivBack;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewKt.setSafeOnClickListener$default(ivBack, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$2
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
                DrawarActivity.this.onBackPressed();
            }
        }, 1, null);
        ConstraintLayout shareApp = getBinding().shareApp;
        Intrinsics.checkNotNullExpressionValue(shareApp, "shareApp");
        ViewKt.setSafeOnClickListener$default(shareApp, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$3
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
                AppsUtils.INSTANCE.shareApp(DrawarActivity.this);
            }
        }, 1, null);
        ConstraintLayout privacyPolicy = getBinding().privacyPolicy;
        Intrinsics.checkNotNullExpressionValue(privacyPolicy, "privacyPolicy");
        ViewKt.setSafeOnClickListener$default(privacyPolicy, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$4
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
                DrawarActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/dont-touch-my-phone-policy/home")));
            }
        }, 1, null);
        ConstraintLayout Languages = getBinding().Languages;
        Intrinsics.checkNotNullExpressionValue(Languages, "Languages");
        ViewKt.setSafeOnClickListener$default(Languages, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$5
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DrawarActivity.this.startActivity(new Intent(DrawarActivity.this, LanguageActivity.class).putExtra("comeFromSetting", true));
            }
        }, 1, null);
        ConstraintLayout termsAndConditions = getBinding().termsAndConditions;
        Intrinsics.checkNotNullExpressionValue(termsAndConditions, "termsAndConditions");
        ViewKt.setSafeOnClickListener$default(termsAndConditions, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.DrawarActivity$onCreate$6
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public  Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DrawarActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/dont-touch-my-phone-policy/home")));
            }
        }, 1, null);

    }

    public void onBackPressed() {
        startActivity(new Intent(this, DtmpMainActivity.class));
        super.onBackPressed();
    }

}
