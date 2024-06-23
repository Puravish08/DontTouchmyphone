package com.donttouchphone.phone.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivityDtmpsettingBinding;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.SeekBarKt;
import com.donttouchphone.phone.util.ViewKt;

import java.util.List;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/SettingActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityDtmpsettingBinding;", "()V", "buttons", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "selectedButtonId", "textButtons", "Landroid/widget/TextView;", "checkSelectedItem", "", "getViewBinding", "handleBannerAD", "handleClicks", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "resetButtonColors", "button", "buttonIndex", "", "updateDuration", "seconds", "updateUIofFlashLight", "view", "Landroid/widget/ImageView;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SettingActivity.kt */
public final class DtmpSettingActivity extends BaseClass<ActivityDtmpsettingBinding> {
    private List<? extends ConstraintLayout> buttons;
    private ConstraintLayout selectedButtonId;
    private List<? extends TextView> textButtons;

    public ActivityDtmpsettingBinding getViewBinding() {
        ActivityDtmpsettingBinding inflate = ActivityDtmpsettingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSrcAds("settingscr_click_back");
        setSrcAdsTracking("settingscr_click_back");
        initViews();
        handleClicks();
        checkSelectedItem();
    }

    private final void handleClicks() {
        ImageView imageView = ((ActivityDtmpsettingBinding) getBinding()).ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() {
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
                DtmpSettingActivity.this.onBackPressed();
            }
        }, 1, null);
        ((ActivityDtmpsettingBinding) getBinding()).switchFlashlight.setOnCheckedChangeListener(new SettingActivity$$ExternalSyntheticLambda0(this));
        ((ActivityDtmpsettingBinding) getBinding()).switchVibration.setOnCheckedChangeListener(new SettingActivity$$ExternalSyntheticLambda1(this));
        ((ActivityDtmpsettingBinding) getBinding()).switchVolume.setOnCheckedChangeListener(new SettingActivity$$ExternalSyntheticLambda2(this));
        AppCompatSeekBar appCompatSeekBar = ((ActivityDtmpsettingBinding) getBinding()).volumeSeekBar;
        Intrinsics.checkNotNullExpressionValue(appCompatSeekBar, "volumeSeekBar");
        SeekBarKt.onSeekBarChangeListener(appCompatSeekBar, new Function1<Integer, Unit>() {
            /* JADX INFO: Access modifiers changed from: package-private */
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                DtmpSettingActivity.this.getBinding().tvVolumeCount.setText(String.valueOf(i));
                ContextKt.getBaseConfig(DtmpSettingActivity.this).setDoNotTouchVolumeLevel(i);
            }
        });
        ConstraintLayout constraintLayout = ((ActivityDtmpsettingBinding) getBinding()).clFlashDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "clFlashDefault");
        ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SettingActivity$handleClicks$6
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
                ContextKt.getBaseConfig(DtmpSettingActivity.this).setFlashLightTypes(0);
                DtmpSettingActivity dtmpSettingActivity = DtmpSettingActivity.this;
                ImageView ivFlashDefaultCheck = dtmpSettingActivity.getBinding().ivFlashDefaultCheck;
                Intrinsics.checkNotNullExpressionValue(ivFlashDefaultCheck, "ivFlashDefaultCheck");
                dtmpSettingActivity.updateUIofFlashLight(ivFlashDefaultCheck);
            }
        }, 1, null);
        ConstraintLayout constraintLayout2 = ((ActivityDtmpsettingBinding) getBinding()).clFlashSos;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clFlashSos");
        ViewKt.setSafeOnClickListener$default(constraintLayout2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SettingActivity$handleClicks$7
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
                ContextKt.getBaseConfig(DtmpSettingActivity.this).setFlashLightTypes(1);
                DtmpSettingActivity dtmpSettingActivity = DtmpSettingActivity.this;
                ImageView ivFlashSosCheck = dtmpSettingActivity.getBinding().ivFlashSosCheck;
                Intrinsics.checkNotNullExpressionValue(ivFlashSosCheck, "ivFlashSosCheck");
                dtmpSettingActivity.updateUIofFlashLight(ivFlashSosCheck);
            }
        }, 1, null);
        ConstraintLayout constraintLayout3 = ((ActivityDtmpsettingBinding) getBinding()).clDiscoMode;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "clDiscoMode");
        ViewKt.setSafeOnClickListener$default(constraintLayout3, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SettingActivity$handleClicks$8
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
                ContextKt.getBaseConfig(DtmpSettingActivity.this).setFlashLightTypes(2);
                DtmpSettingActivity dtmpSettingActivity = DtmpSettingActivity.this;
                ImageView ivDiscoCheck = dtmpSettingActivity.getBinding().ivDiscoCheck;
                Intrinsics.checkNotNullExpressionValue(ivDiscoCheck, "ivDiscoCheck");
                dtmpSettingActivity.updateUIofFlashLight(ivDiscoCheck);
            }
        }, 1, null);
        List<? extends ConstraintLayout> list = this.buttons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttons");
            list = null;
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
//                CollectionsKt.throwIndexOverflow();
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) next;
            ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SettingActivity$handleClicks$9$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
//                public final void invoke2(View it) {
//                    int i3;
//                    Intrinsics.checkNotNullParameter(it, "it");
//                    Log.d("testcaseee", "handleClicks: index:" + i + " .....id:" + constraintLayout.getId());
//                    this.resetButtonColors(constraintLayout, i);
//                    int id = constraintLayout.getId();
//                    if (id == C5914R.C5917id.fifS) {
//                        i3 = 15;
//                    } else if (id == C5914R.C5917id.thrS) {
//                        i3 = 30;
//                    } else if (id == C5914R.C5917id.oneM) {
//                        i3 = 60;
//                    } else {
//                        i3 = id == C5914R.C5917id.twoM ? 120 : 0;
//                    }
//                    this.updateDuration(i3);
//                }
            }, 1, null);
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    public static final void handleClicks$lambda$0(DtmpSettingActivity dtmpSettingActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(dtmpSettingActivity, "this$0");
        ContextKt.getBaseConfig(dtmpSettingActivity).setDoNotTouchFlashEnabled(z);
    }

    /* access modifiers changed from: private */
    public static final void handleClicks$lambda$1(DtmpSettingActivity dtmpSettingActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(dtmpSettingActivity, "this$0");
        ContextKt.getBaseConfig(dtmpSettingActivity).setDoNotTouchVibrationEnabled(z);
    }

    /* access modifiers changed from: private */
    public static final void handleClicks$lambda$2(DtmpSettingActivity dtmpSettingActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(dtmpSettingActivity, "this$0");
        ContextKt.getBaseConfig(dtmpSettingActivity).setDoNotTouchVolumeEnabled(z);
    }

    private final void initViews() {
        Context context = this;
        ((ActivityDtmpsettingBinding) getBinding()).switchFlashlight.setChecked(ContextKt.getBaseConfig(context).getDoNotTouchFlashEnabled());
        ((ActivityDtmpsettingBinding) getBinding()).switchVibration.setChecked(ContextKt.getBaseConfig(context).getDoNotTouchVibrationEnabled());
        ((ActivityDtmpsettingBinding) getBinding()).switchVolume.setChecked(ContextKt.getBaseConfig(context).getDoNotTouchVolumeEnabled());
        ((ActivityDtmpsettingBinding) getBinding()).volumeSeekBar.setProgress(ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel());
        ((ActivityDtmpsettingBinding) getBinding()).tvVolumeCount.setText(String.valueOf(ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel()));
        ConstraintLayout constraintLayout = ((ActivityDtmpsettingBinding) getBinding()).fifS;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "fifS");
        ConstraintLayout constraintLayout2 = ((ActivityDtmpsettingBinding) getBinding()).thrS;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "thrS");
        ConstraintLayout constraintLayout3 = ((ActivityDtmpsettingBinding) getBinding()).oneM;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "oneM");
        ConstraintLayout constraintLayout4 = ((ActivityDtmpsettingBinding) getBinding()).twoM;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "twoM");
        this.buttons = CollectionsKt.listOf(constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4);
        TextView textView = ((ActivityDtmpsettingBinding) getBinding()).fif;
        Intrinsics.checkNotNullExpressionValue(textView, "fif");
        TextView textView2 = ((ActivityDtmpsettingBinding) getBinding()).thr;
        Intrinsics.checkNotNullExpressionValue(textView2, "thr");
        TextView textView3 = ((ActivityDtmpsettingBinding) getBinding()).one;
        Intrinsics.checkNotNullExpressionValue(textView3, "one");
        TextView textView4 = ((ActivityDtmpsettingBinding) getBinding()).two;
        Intrinsics.checkNotNullExpressionValue(textView4, "two");
        this.textButtons = CollectionsKt.listOf(textView, textView2, textView3, textView4);
        List<? extends ConstraintLayout> list = this.buttons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttons");
            list = null;
        }
        this.selectedButtonId = (ConstraintLayout) list.get(0);
        int doNotTouchVolumeDuration = ContextKt.getBaseConfig(context).getDoNotTouchVolumeDuration();
        if (doNotTouchVolumeDuration == 15) {
            ConstraintLayout constraintLayout5 = this.selectedButtonId;
            Intrinsics.checkNotNull(constraintLayout5);
            resetButtonColors(constraintLayout5, 0);
        } else if (doNotTouchVolumeDuration == 30) {
            ConstraintLayout constraintLayout6 = this.selectedButtonId;
            Intrinsics.checkNotNull(constraintLayout6);
            resetButtonColors(constraintLayout6, 1);
        } else if (doNotTouchVolumeDuration == 60) {
            ConstraintLayout constraintLayout7 = this.selectedButtonId;
            Intrinsics.checkNotNull(constraintLayout7);
            resetButtonColors(constraintLayout7, 2);
        } else if (doNotTouchVolumeDuration == 120) {
            ConstraintLayout constraintLayout8 = this.selectedButtonId;
            Intrinsics.checkNotNull(constraintLayout8);
            resetButtonColors(constraintLayout8, 3);
        }
    }

    /* access modifiers changed from: private */
    public final void resetButtonColors(ConstraintLayout constraintLayout, int i) {
        List<? extends TextView> list = this.textButtons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textButtons");
            list = null;
        }
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
//                CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) next;
            if (i2 == i) {
                List<? extends ConstraintLayout> list2 = this.buttons;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttons");
                    list2 = null;
                }
                ((ConstraintLayout) list2.get(i)).setBackgroundResource(R.drawable.time_rounded_card_selected);
                textView.setTextColor(-1);
            } else {
                List<? extends ConstraintLayout> list3 = this.buttons;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttons");
                    list3 = null;
                }
                ((ConstraintLayout) list3.get(i2)).setBackgroundResource(R.drawable.time_rounded_card_unselected);
                textView.setTextColor(getResources().getColor(R.color.blue));
            }
            i2 = i3;
        }
    }

    /* access modifiers changed from: private */
    public final void updateDuration(int i) {
        ContextKt.getBaseConfig(this).setDoNotTouchVolumeDuration(i);
    }

    public final void checkSelectedItem() {
        int flashLightTypes = ContextKt.getBaseConfig(this).getFlashLightTypes();
        if (flashLightTypes == 0) {
            ImageView imageView = ((ActivityDtmpsettingBinding) getBinding()).ivFlashDefaultCheck;
            Intrinsics.checkNotNullExpressionValue(imageView, "ivFlashDefaultCheck");
            updateUIofFlashLight(imageView);
        } else if (flashLightTypes != 1) {
            ImageView imageView2 = ((ActivityDtmpsettingBinding) getBinding()).ivDiscoCheck;
            Intrinsics.checkNotNullExpressionValue(imageView2, "ivDiscoCheck");
            updateUIofFlashLight(imageView2);
        } else {
            ImageView imageView3 = ((ActivityDtmpsettingBinding) getBinding()).ivFlashSosCheck;
            Intrinsics.checkNotNullExpressionValue(imageView3, "ivFlashSosCheck");
            updateUIofFlashLight(imageView3);
        }
    }

    /* access modifiers changed from: private */
    public final void updateUIofFlashLight(ImageView imageView) {
        ((ActivityDtmpsettingBinding) getBinding()).ivFlashDefaultCheck.setImageDrawable(getDrawable(R.drawable.ic_check_disabled));
        ((ActivityDtmpsettingBinding) getBinding()).ivFlashSosCheck.setImageDrawable(getDrawable(R.drawable.ic_check_disabled));
        ((ActivityDtmpsettingBinding) getBinding()).ivDiscoCheck.setImageDrawable(getDrawable(R.drawable.ic_check_disabled));
        imageView.setImageDrawable(getDrawable(R.drawable.ic_check_enabled));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }


    public void onBackPressed() {
        if (isFromSplash()) {
            startActivity(new Intent(this, DtmpMainActivity.class));
        } else {
            super.onBackPressed();
        }
    }
}
