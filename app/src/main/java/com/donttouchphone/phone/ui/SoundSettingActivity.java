package com.donttouchphone.phone.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivitySoundSettingBinding;
import com.donttouchphone.phone.models.SoundsModel;
import com.donttouchphone.phone.ui.adapters.SoundsGridAdapter;
import com.donttouchphone.phone.util.ActivityKt;
import com.donttouchphone.phone.util.BaseConfig;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.SeekBarKt;
import com.donttouchphone.phone.util.ViewKt;

import java.util.List;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/SoundSettingActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivitySoundSettingBinding;", "()V", "actionType", "", "adapterSounds", "Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsGridAdapter;", "buttons", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "selectedButtonId", "textButtons", "Landroid/widget/TextView;", "uri", "Landroid/net/Uri;", "checkAlreadyApplied", "", "checkAndDoAction", "getViewBinding", "handleBannerAD", "screen", "trackingScreen", "handleClicks", "handleUiClicks", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "playSound", "model", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "resetButtonColors", "button", "buttonIndex", "", "setUpPlayPause", "isPlaying", "", "showInterstitialAd", "updateDuration", "seconds", "updateUiAntiPocket", "updateUiDoNotTouch", "updateUiUnPlugCharger", "updateUiWhistleDetection", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SoundSettingActivity.kt */
public final class SoundSettingActivity extends BaseClass<ActivitySoundSettingBinding> {
    private String actionType;
    private SoundsGridAdapter adapterSounds;
    private List<? extends ConstraintLayout> buttons;
    private ConstraintLayout selectedButtonId;
    private List<? extends TextView> textButtons;
    /* access modifiers changed from: private */
    public Uri uri;

    public ActivitySoundSettingBinding getViewBinding() {
        ActivitySoundSettingBinding inflate = ActivitySoundSettingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initViews();
        handleClicks();
        handleUiClicks();
        updateUiDoNotTouch();
    }

    private final void initViews() {
        setSelectedSoundModel((SoundsModel) getIntent().getParcelableExtra("soundResource"));
        String valueOf = String.valueOf(getIntent().getStringExtra("SoundSettingActivity"));
        this.actionType = valueOf;
        List<? extends ConstraintLayout> list = null;
        if (valueOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionType");
            valueOf = null;
        }
        checkAndDoAction(valueOf);
        Context context = this;
        ((ActivitySoundSettingBinding) getBinding()).rvSounds.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        Activity activity = this;
        this.adapterSounds = new SoundsGridAdapter(activity);
        ((ActivitySoundSettingBinding) getBinding()).rvSounds.setAdapter(this.adapterSounds);
        SoundsModel selectedSoundModel = getSelectedSoundModel();
        if (selectedSoundModel != null) {
            int soundPosition = selectedSoundModel.getSoundPosition();
            SoundsGridAdapter soundsGridAdapter = this.adapterSounds;
            if (soundsGridAdapter != null) {
                soundsGridAdapter.setItems(ActivityKt.getAllSounds(activity), soundPosition);
            }
        }
        ConstraintLayout constraintLayout = ((ActivitySoundSettingBinding) getBinding()).fifS;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "fifS");
        ConstraintLayout constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).thrS;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "thrS");
        ConstraintLayout constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).oneM;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "oneM");
        ConstraintLayout constraintLayout4 = ((ActivitySoundSettingBinding) getBinding()).twoM;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "twoM");
        this.buttons = CollectionsKt.listOf(constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4);
        TextView textView = ((ActivitySoundSettingBinding) getBinding()).fif;
        Intrinsics.checkNotNullExpressionValue(textView, "fif");
        TextView textView2 = ((ActivitySoundSettingBinding) getBinding()).thr;
        Intrinsics.checkNotNullExpressionValue(textView2, "thr");
        TextView textView3 = ((ActivitySoundSettingBinding) getBinding()).one;
        Intrinsics.checkNotNullExpressionValue(textView3, "one");
        TextView textView4 = ((ActivitySoundSettingBinding) getBinding()).two;
        Intrinsics.checkNotNullExpressionValue(textView4, "two");
        this.textButtons = CollectionsKt.listOf(textView, textView2, textView3, textView4);
        List<? extends ConstraintLayout> list2 = this.buttons;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttons");
        } else {
            list = list2;
        }
        this.selectedButtonId = (ConstraintLayout) list.get(0);
        ((ActivitySoundSettingBinding) getBinding()).sbPlace.setProgress(ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel());
        ((ActivitySoundSettingBinding) getBinding()).textView3.setText(getTitle());
        SoundsModel selectedSoundModel2 = getSelectedSoundModel();
        if (selectedSoundModel2 != null) {
            ((ActivitySoundSettingBinding) getBinding()).activateBtn.setAnimation(selectedSoundModel2.getSoundAnim());
        }
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

    private final void checkAlreadyApplied() {
        StringBuilder append = new StringBuilder("android.resource://").append(getPackageName()).append('/');
        SoundsModel selectedSoundModel = getSelectedSoundModel();
        this.uri = Uri.parse(append.append(selectedSoundModel != null ? Integer.valueOf(selectedSoundModel.getSoundMp3()) : null).toString());
        if (Intrinsics.areEqual((Object) ContextKt.getBaseConfig(this).getCurrentRingtone(), (Object) String.valueOf(this.uri))) {
            ((ActivitySoundSettingBinding) getBinding()).ApplyBtn.setText(getResources().getString(R.string.applied));
            ((ActivitySoundSettingBinding) getBinding()).ApplyBtn.setTextColor(getResources().getColor(R.color.blue));
            return;
        }
        ((ActivitySoundSettingBinding) getBinding()).ApplyBtn.setText(getResources().getString(R.string.apply));
        ((ActivitySoundSettingBinding) getBinding()).ApplyBtn.setTextColor(getResources().getColor(R.color.blue));
    }

    private final void handleClicks() {
        ImageView ivBack = getBinding().ivBack;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewKt.setSafeOnClickListener$default(ivBack, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleClicks$1
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
                SoundSettingActivity.this.onBackPressed();
            }
        }, 1, null);
        List<? extends ConstraintLayout> list = this.buttons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttons");
            list = null;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
//                CollectionsKt.throwIndexOverflow();
            }
            final ConstraintLayout constraintLayout = (ConstraintLayout) obj;
            int finalI = i;
            ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleClicks$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */ {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    int i3;
                    Intrinsics.checkNotNullParameter(it, "it");
                    Log.d("testcaseee", "handleClicks: index:" + finalI + " .....id:" + constraintLayout.getId());
                    resetButtonColors(constraintLayout, finalI);
                    int id = constraintLayout.getId();
                    if (id == R.id.fifS) {
                        i3 = 15;
                    } else if (id == R.id.thrS) {
                        i3 = 30;
                    } else if (id == R.id.oneM) {
                        i3 = 60;
                    } else {
                        i3 = id == R.id.twoM ? 120 : 0;
                    }
                    updateDuration(i3);
                }
            }, 1, null);
            i = i2;
        }
        getBinding().sbPlace.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleClicks$3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i3, boolean z) {
                ContextKt.getBaseConfig(SoundSettingActivity.this).setDoNotTouchVolumeLevel(i3);
            }
        });
        TextView ApplyBtn = getBinding().ApplyBtn;
        Intrinsics.checkNotNullExpressionValue(ApplyBtn, "ApplyBtn");
        ViewKt.setSafeOnClickListener$default(ApplyBtn, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleClicks$4
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
                Uri uri;
                Uri uri2;
                Intrinsics.checkNotNullParameter(it, "it");
                SoundSettingActivity soundSettingActivity = SoundSettingActivity.this;
                StringBuilder append = new StringBuilder("android.resource://").append(SoundSettingActivity.this.getPackageName()).append('/');
                SoundsModel selectedSoundModel = SoundSettingActivity.this.getSelectedSoundModel();
                soundSettingActivity.uri = Uri.parse(append.append(selectedSoundModel != null ? Integer.valueOf(selectedSoundModel.getSoundMp3()) : null).toString());
                String currentRingtone = ContextKt.getBaseConfig(SoundSettingActivity.this).getCurrentRingtone();
                uri = SoundSettingActivity.this.uri;
                if (!Intrinsics.areEqual(currentRingtone, String.valueOf(uri))) {
                    SoundSettingActivity.this.getBinding().ApplyBtn.setText(SoundSettingActivity.this.getResources().getString(R.string.applied));
                    SoundSettingActivity.this.getBinding().ApplyBtn.setTextColor(SoundSettingActivity.this.getResources().getColor(R.color.blue));
                    BaseConfig baseConfig = ContextKt.getBaseConfig(SoundSettingActivity.this);
                    uri2 = SoundSettingActivity.this.uri;
                    baseConfig.setCurrentRingtone(String.valueOf(uri2));
                    Log.e("TAG", "handleClicks: " + ContextKt.getBaseConfig(SoundSettingActivity.this).getCurrentRingtone());
                    return;
                }
                Toast makeText = Toast.makeText(SoundSettingActivity.this, R.string.already_applied, Toast.LENGTH_SHORT);
                makeText.show();
                Intrinsics.checkExpressionValueIsNotNull(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }, 1, null);
    }


    /* access modifiers changed from: private */
    public final void updateDuration(int i) {
        ContextKt.getBaseConfig(this).setDoNotTouchVolumeDuration(i);
    }

    private final void handleUiClicks() {
        ConstraintLayout constraintLayout = getBinding().clSound;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "clSound");
        ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleUiClicks$1
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
                ContextKt.getBaseConfig(SoundSettingActivity.this).setDoNotTouchVolumeEnabled(!ContextKt.getBaseConfig(SoundSettingActivity.this).getDoNotTouchVolumeEnabled());
                SoundSettingActivity.this.updateUiDoNotTouch();
            }
        }, 1, null);
        ConstraintLayout constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clVibration");
        ViewKt.setSafeOnClickListener$default(constraintLayout2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleUiClicks$2
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
                ContextKt.getBaseConfig(SoundSettingActivity.this).setDoNotTouchVibrationEnabled(!ContextKt.getBaseConfig(SoundSettingActivity.this).getDoNotTouchVibrationEnabled());
                SoundSettingActivity.this.updateUiDoNotTouch();
            }
        }, 1, null);
        ConstraintLayout constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clLight;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "clLight");
        ViewKt.setSafeOnClickListener$default(constraintLayout3, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleUiClicks$3
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
                ContextKt.getBaseConfig(SoundSettingActivity.this).setDoNotTouchFlashEnabled(!ContextKt.getBaseConfig(SoundSettingActivity.this).getDoNotTouchFlashEnabled());
                SoundSettingActivity.this.updateUiDoNotTouch();
            }
        }, 1, null);
        AppCompatSeekBar appCompatSeekBar = ((ActivitySoundSettingBinding) getBinding()).sbPlace;
        Intrinsics.checkNotNullExpressionValue(appCompatSeekBar, "sbPlace");
        SeekBarKt.onSeekBarChangeListener(appCompatSeekBar, new Function1<Integer, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleUiClicks$4
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                SoundSettingActivity.this.getBinding().textMeter.setText(String.valueOf(i));
                ContextKt.getBaseConfig(SoundSettingActivity.this).setDoNotTouchVolumeLevel(i);
            }
        });
        Context context = this;
        ((ActivitySoundSettingBinding) getBinding()).sbPlace.setProgress(ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel());
        ((ActivitySoundSettingBinding) getBinding()).textMeter.setText(String.valueOf(ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel()));
        SoundsGridAdapter soundsGridAdapter = this.adapterSounds;
        if (soundsGridAdapter != null) {
            soundsGridAdapter.setOnPlayClickListener(new Function1<SoundsModel, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$handleUiClicks$5
                /* JADX INFO: Access modifiers changed from: package-private */ {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SoundsModel soundsModel) {
                    invoke2(soundsModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(SoundsModel soundsModel) {
                    Intrinsics.checkNotNullParameter(soundsModel, "soundsModel");
                    SoundSettingActivity.this.playSound(soundsModel);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public final void playSound(SoundsModel soundsModel) {
        ((ActivitySoundSettingBinding) getBinding()).tvStatus.setImageDrawable(getDrawable(R.drawable.play_btn));
        togglePlayPause(soundsModel, true, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$playSound$1
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                SoundSettingActivity.this.setUpPlayPause(z);
            }
        });
        checkAlreadyApplied();
    }

    /* access modifiers changed from: private */
    public final void setUpPlayPause(boolean z) {
        if (z) {
            ((ActivitySoundSettingBinding) getBinding()).ivPlayPause.setImageDrawable(getResources().getDrawable(R.drawable.pause));
            ((ActivitySoundSettingBinding) getBinding()).customSoundText.setText(getString(R.string.pause));
            SoundsModel selectedSoundModel = getSelectedSoundModel();
            if (selectedSoundModel != null) {
                ((ActivitySoundSettingBinding) getBinding()).activateBtn.setAnimation(selectedSoundModel.getSoundAnim());
            }
            ((ActivitySoundSettingBinding) getBinding()).activateBtn.playAnimation();
            return;
        }
        ((ActivitySoundSettingBinding) getBinding()).ivPlayPause.setImageDrawable(getResources().getDrawable(R.drawable.play_btn));
        ((ActivitySoundSettingBinding) getBinding()).customSoundText.setText(getString(R.string.play));
        ((ActivitySoundSettingBinding) getBinding()).activateBtn.pauseAnimation();
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
    public final void updateUiDoNotTouch() {
        int i;
        ConstraintLayout constraintLayout;
        int i2;
        ConstraintLayout constraintLayout2;
        int i3;
        ConstraintLayout constraintLayout3;
        Context context = this;
        if (ContextKt.getBaseConfig(context).getDoNotTouchVolumeEnabled()) {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_selected_btn;
        } else {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_unselected_btn;
        }
        constraintLayout.setBackgroundResource(i);
        if (ContextKt.getBaseConfig(context).getDoNotTouchFlashEnabled()) {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_unselected_btn;
        }
        constraintLayout2.setBackgroundResource(i2);
        if (ContextKt.getBaseConfig(context).getDoNotTouchVibrationEnabled()) {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_unselected_btn;
        }
        constraintLayout3.setBackgroundResource(i3);
    }

    private final void updateUiUnPlugCharger() {
        int i;
        ConstraintLayout constraintLayout;
        int i2;
        ConstraintLayout constraintLayout2;
        int i3;
        ConstraintLayout constraintLayout3;
        Context context = this;
        if (ContextKt.getBaseConfig(context).getUnplugChargeVolumeEnabled()) {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_selected_btn;
        } else {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_unselected_btn;
        }
        constraintLayout.setBackgroundResource(i);
        if (ContextKt.getBaseConfig(context).getUnplugChargeFlashEnabled()) {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_unselected_btn;
        }
        constraintLayout2.setBackgroundResource(i2);
        if (ContextKt.getBaseConfig(context).getUnplugChargeVibrationEnabled()) {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_unselected_btn;
        }
        constraintLayout3.setBackgroundResource(i3);
    }

    private final void updateUiAntiPocket() {
        int i;
        ConstraintLayout constraintLayout;
        int i2;
        ConstraintLayout constraintLayout2;
        int i3;
        ConstraintLayout constraintLayout3;
        Context context = this;
        if (ContextKt.getBaseConfig(context).getAntiPocketVolumeEnabled()) {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_selected_btn;
        } else {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_unselected_btn;
        }
        constraintLayout.setBackgroundResource(i);
        if (ContextKt.getBaseConfig(context).getAntiPocketFlashEnabled()) {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_unselected_btn;
        }
        constraintLayout2.setBackgroundResource(i2);
        if (ContextKt.getBaseConfig(context).getAntiPocketVibrationEnabled()) {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_unselected_btn;
        }
        constraintLayout3.setBackgroundResource(i3);
    }

    private final void updateUiWhistleDetection() {
        int i;
        ConstraintLayout constraintLayout;
        int i2;
        ConstraintLayout constraintLayout2;
        int i3;
        ConstraintLayout constraintLayout3;
        Context context = this;
        if (ContextKt.getBaseConfig(context).getWhistleDetectionVolumeEnabled()) {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_selected_btn;
        } else {
            constraintLayout = ((ActivitySoundSettingBinding) getBinding()).clSound;
            i = R.drawable.setting_unselected_btn;
        }
        constraintLayout.setBackgroundResource(i);
        if (ContextKt.getBaseConfig(context).getWhistleDetectionFlashEnabled()) {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout2 = ((ActivitySoundSettingBinding) getBinding()).clLight;
            i2 = R.drawable.setting_unselected_btn;
        }
        constraintLayout2.setBackgroundResource(i2);
        if (ContextKt.getBaseConfig(context).getWhistleDetectionVibrationEnabled()) {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_selected_btn;
        } else {
            constraintLayout3 = ((ActivitySoundSettingBinding) getBinding()).clVibration;
            i3 = R.drawable.setting_unselected_btn;
        }
        constraintLayout3.setBackgroundResource(i3);
    }

    private final void checkAndDoAction(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 162115303) {
            if (hashCode != 486507326) {
                if (hashCode == 1101114022 && str.equals("UnplugChargerActivity")) {
                    CardView cvActivate = getBinding().cvActivate;
                    Intrinsics.checkNotNullExpressionValue(cvActivate, "cvActivate");
                    ViewKt.setSafeOnClickListener$default(cvActivate, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$1
                        /* JADX INFO: Access modifiers changed from: package-private */ {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(View view) {
                            invoke2(view);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            SoundsModel selectedSoundModel = SoundSettingActivity.this.getSelectedSoundModel();
                            if (selectedSoundModel != null) {
                                final SoundSettingActivity soundSettingActivity = SoundSettingActivity.this;
                                soundSettingActivity.togglePlayPause(selectedSoundModel, true, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$1$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */ {
//                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z) {
                                        SoundSettingActivity.this.setUpPlayPause(z);
                                    }
                                });
                            }
                        }
                    }, 1, null);
                    setTitle(getString(R.string.charger_unplug_detection));
                    return;
                }
            } else if (str.equals("DetectWhistleActivity")) {
                CardView cvActivate2 = getBinding().cvActivate;
                Intrinsics.checkNotNullExpressionValue(cvActivate2, "cvActivate");
                ViewKt.setSafeOnClickListener$default(cvActivate2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$3
                    /* JADX INFO: Access modifiers changed from: package-private */ {
//                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke2(view);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SoundsModel selectedSoundModel = SoundSettingActivity.this.getSelectedSoundModel();
                        if (selectedSoundModel != null) {
                            final SoundSettingActivity soundSettingActivity = SoundSettingActivity.this;
                            soundSettingActivity.togglePlayPause(selectedSoundModel, true, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$3$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */ {
//                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    SoundSettingActivity.this.setUpPlayPause(z);
                                }
                            });
                        }
                    }
                }, 1, null);
                setTitle(getString(R.string.whistle_detection));
                return;
            }
        } else if (str.equals("AntiPocketActivity")) {
            CardView cvActivate3 = getBinding().cvActivate;
            Intrinsics.checkNotNullExpressionValue(cvActivate3, "cvActivate");
            ViewKt.setSafeOnClickListener$default(cvActivate3, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$2
                /* JADX INFO: Access modifiers changed from: package-private */ {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SoundsModel selectedSoundModel = SoundSettingActivity.this.getSelectedSoundModel();
                    if (selectedSoundModel != null) {
                        final SoundSettingActivity soundSettingActivity = SoundSettingActivity.this;
                        soundSettingActivity.togglePlayPause(selectedSoundModel, true, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$2$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */ {
//                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                SoundSettingActivity.this.setUpPlayPause(z);
                            }
                        });
                    }
                }
            }, 1, null);
            setTitle(getString(R.string.anti_pocket_detection));
            return;
        }
        CardView cvActivate4 = getBinding().cvActivate;
        Intrinsics.checkNotNullExpressionValue(cvActivate4, "cvActivate");
        ViewKt.setSafeOnClickListener$default(cvActivate4, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$4
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
                SoundsModel selectedSoundModel = SoundSettingActivity.this.getSelectedSoundModel();
                if (selectedSoundModel != null) {
                    final SoundSettingActivity soundSettingActivity = SoundSettingActivity.this;
                    soundSettingActivity.togglePlayPause(selectedSoundModel, true, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SoundSettingActivity$checkAndDoAction$4$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */ {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            SoundSettingActivity.this.setUpPlayPause(z);
                        }
                    });
                }
            }
        }, 1, null);
        setTitle(getString(R.string.don_t_touch_my_phone));
    }



    /* access modifiers changed from: private */
}
