package com.donttouchphone.phone.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityUnplugChargerBinding;
import com.donttouchphone.phone.services.ChargerDetectionService;
import com.donttouchphone.phone.util.ViewKt;

import java.util.Objects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/NewUnplugChargerActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityUnplugChargerBinding;", "()V", "getViewBinding", "handleBannerAD", "", "handleClicks", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: NewUnplugChargerActivity.kt */
public final class NewUnplugChargerActivity extends BaseClass<ActivityUnplugChargerBinding> {
    public ActivityUnplugChargerBinding getViewBinding() {
        ActivityUnplugChargerBinding inflate = ActivityUnplugChargerBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSelectedFunctionCategory("UnplugChargerActivity");
        setSrcAds("chargerunplugscr_click_back");
        setSrcAdsTracking("chargerunplugscr_click_back");
        setFromSplash(getIntent().getBooleanExtra("isFromSplash", false));
        RecyclerView recyclerView = ((ActivityUnplugChargerBinding) getBinding()).rcContent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcContent");
        setUpSoundAdapter(recyclerView);
        handleClicks();
        TextView textView = ((ActivityUnplugChargerBinding) getBinding()).tvStatus;
        Intrinsics.checkNotNullExpressionValue(textView, "tvStatus");
        updateActivateTextUi(textView, isMyServiceRunning(ChargerDetectionService.class));
    }

    private final void handleClicks() {
        ImageView imageView = Objects.requireNonNull(getBinding()).ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewUnplugChargerActivity$handleClicks$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
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
                NewUnplugChargerActivity.this.onBackPressed();
            }
        }, 1, null);
        ImageView imageView2 = getBinding().activateBtn;
        Intrinsics.checkNotNullExpressionValue(imageView2, "activateBtn");
        ViewKt.setSafeOnClickListener$default(imageView2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewUnplugChargerActivity$handleClicks$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
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
                NewUnplugChargerActivity newUnplugChargerActivity = NewUnplugChargerActivity.this;
                TextView tvStatus = newUnplugChargerActivity.getBinding().tvStatus;
                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                newUnplugChargerActivity.configUnPlugService(tvStatus);
            }
        }, 1, null);
    }


    public void onBackPressed() {
        if (isFromSplash()) {
            startActivity(new Intent(this, DtmpMainActivity.class));
        } else {
            super.onBackPressed();
        }
    }
}
