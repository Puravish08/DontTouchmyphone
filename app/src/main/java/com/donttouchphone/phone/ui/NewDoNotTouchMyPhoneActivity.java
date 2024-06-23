package com.donttouchphone.phone.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityDoNotTouchMyPhoneBinding;
import com.donttouchphone.phone.services.DoNotTouchMyPhoneService;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015¨\u0006\r"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/NewDoNotTouchMyPhoneActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityDoNotTouchMyPhoneBinding;", "()V", "getViewBinding", "handleBannerAD", "", "handleButtonClicks", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: NewDoNotTouchMyPhoneActivity.kt */
public final class NewDoNotTouchMyPhoneActivity extends BaseClass<ActivityDoNotTouchMyPhoneBinding> {
    public ActivityDoNotTouchMyPhoneBinding getViewBinding() {
        ActivityDoNotTouchMyPhoneBinding inflate = ActivityDoNotTouchMyPhoneBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSelectedFunctionCategory("DoNotTouchMyPhone");
        setSrcAds("donttouchscr_click_back");
        setSrcAdsTracking("donttouchscr_click_back");
        initViews();
        handleButtonClicks();
    }

    private final void handleButtonClicks() {
        ImageView imageView = ((ActivityDoNotTouchMyPhoneBinding) getBinding()).activateBtn;
        Intrinsics.checkNotNullExpressionValue(imageView, "activateBtn");
//        ViewKt.setSafeOnClickListener$default(imageView, 0, new NewDoNotTouchMyPhoneActivity$handleButtonClicks$1(this), 1, (Object) null);
        Intrinsics.checkNotNullExpressionValue(imageView, "activateBtn");
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() {
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
                NewDoNotTouchMyPhoneActivity newDoNotTouchMyPhoneActivity = NewDoNotTouchMyPhoneActivity.this;
                TextView tvStatus = newDoNotTouchMyPhoneActivity.getBinding().tvStatus;
                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                newDoNotTouchMyPhoneActivity.configUnTouchDevice(tvStatus);
            }
        }, 1, null);


        ImageView imageView2 = ((ActivityDoNotTouchMyPhoneBinding) getBinding()).ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView2, "ivBack");
//        ViewKt.setSafeOnClickListener$default(imageView2, 0, new NewDoNotTouchMyPhoneActivity$handleButtonClicks$2(this), 1, (Object) null);


        ViewKt.setSafeOnClickListener$default(imageView2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewDoNotTouchMyPhoneActivity$handleButtonClicks$2
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
                NewDoNotTouchMyPhoneActivity.this.onBackPressed();
            }
        }, 1, null);

    }

    private final void initViews() {
        setFromSplash(getIntent().getBooleanExtra("isFromSplash", false));
        TextView textView = ((ActivityDoNotTouchMyPhoneBinding) getBinding()).tvStatus;
        Intrinsics.checkNotNullExpressionValue(textView, "tvStatus");
        updateActivateTextUi(textView, isMyServiceRunning(DoNotTouchMyPhoneService.class));
        RecyclerView recyclerView = ((ActivityDoNotTouchMyPhoneBinding) getBinding()).rcContent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcContent");
        setUpSoundAdapter(recyclerView);
    }


    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isFromSplash()) {
            startActivity(new Intent(this, DtmpMainActivity.class));
        } else {
            super.onBackPressed();
        }
    }


}
