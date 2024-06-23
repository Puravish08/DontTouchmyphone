package com.donttouchphone.phone.ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivityDontTouchStopBinding;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import java.util.Objects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/StopActivityActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityDontTouchStopBinding;", "()V", "TAG", "", "flashLightOn", "", "getFlashLightOn", "()Z", "setFlashLightOn", "(Z)V", "flashLightStatus", "handler", "Landroid/os/Handler;", "mp", "Landroid/media/MediaPlayer;", "checkStopService", "", "closeFlashLight", "getViewBinding", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "openFlashLight", "startFlashLight", "counter", "", "startMediaPlayer", "stopFlashLight", "stopMediaPlaying", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: StopActivityActivity.kt */
public final class StopActivityActivity extends BaseClass<ActivityDontTouchStopBinding> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int actiontype;
    /* access modifiers changed from: private */
    public static boolean isAlreadyScreenShowing;
    private final String TAG = "StopActivityActivity";
    private boolean flashLightOn;
    private boolean flashLightStatus;
    /* access modifiers changed from: private */
    public final Handler handler = new Handler(Looper.getMainLooper());
    private MediaPlayer mp;

    public ActivityDontTouchStopBinding getViewBinding() {
        ActivityDontTouchStopBinding inflate = ActivityDontTouchStopBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final boolean getFlashLightOn() {
        return this.flashLightOn;
    }

    public final void setFlashLightOn(boolean z) {
        this.flashLightOn = z;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/StopActivityActivity$Companion;", "", "()V", "actiontype", "", "getActiontype", "()I", "setActiontype", "(I)V", "isAlreadyScreenShowing", "", "()Z", "setAlreadyScreenShowing", "(Z)V", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: StopActivityActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getActiontype() {
            return StopActivityActivity.actiontype;
        }

        public final void setActiontype(int i) {
            StopActivityActivity.actiontype = i;
        }

        public final boolean isAlreadyScreenShowing() {
            return StopActivityActivity.isAlreadyScreenShowing;
        }

        public final void setAlreadyScreenShowing(boolean z) {
            StopActivityActivity.isAlreadyScreenShowing = z;
        }

        public final Intent getStartIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Log.d("AfterCallDetailActivity", "AfterCallDetailActivity getStartIntent: ");
            Intent intent = new Intent(context, StopActivityActivity.class);
            intent.setFlags(272760832);
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            Object systemService = getSystemService(Context.KEYGUARD_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            ((KeyguardManager) systemService).requestDismissKeyguard(this, (KeyguardManager.KeyguardDismissCallback) null);
        } else {
            getWindow().addFlags(6815872);
        }
        isAlreadyScreenShowing = true;
        getBinding().rippleBackground.startRippleAnimation();
        ConstraintLayout constraintLayout = ((ActivityDontTouchStopBinding) getBinding()).StopAlarm;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "StopAlarm");
        ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.StopActivityActivity$onCreate$1
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
                StopActivityActivity.this.stopMediaPlaying();
            }
        }, 1, null);
        Context context = this;
        if (ContextKt.getBaseConfig(context).getDoNotTouchVolumeEnabled() && ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel() > 0) {
            startMediaPlayer();
        }
        if (ContextKt.getBaseConfig(context).getDoNotTouchVibrationEnabled()) {
            ContextKt.startVibration(context);
        }
        if (ContextKt.getBaseConfig(context).getDoNotTouchFlashEnabled()) {
            int flashLightTypes = ContextKt.getBaseConfig(context).getFlashLightTypes();
            if (flashLightTypes == 0) {
                openFlashLight();
            } else if (flashLightTypes != 1) {
                startFlashLight(20);
            } else {
                startFlashLight(40);
            }
        }
        checkStopService();
    }

    private final void startMediaPlayer() {
        MediaPlayer mediaPlayer;
        try {
            String currentRingtone = ContextKt.getBaseConfig(this).getCurrentRingtone();
            if (currentRingtone == null || currentRingtone.length() <= 0) {
                mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.ringtone);
            } else {
                mediaPlayer = MediaPlayer.create(getBaseContext(), Uri.parse(ContextKt.getBaseConfig(this).getCurrentRingtone()));
            }
            this.mp = mediaPlayer;
            float doNotTouchVolumeLevel = (float) ContextKt.getBaseConfig(this).getDoNotTouchVolumeLevel();
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                float f = doNotTouchVolumeLevel / ((float) 100);
                mediaPlayer2.setVolume(f, f);
            }
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setLooping(true);
            }
            MediaPlayer mediaPlayer4 = this.mp;
            if (mediaPlayer4 != null) {
                mediaPlayer4.start();
            }
            MediaPlayer mediaPlayer5 = this.mp;
            if (mediaPlayer5 != null && mediaPlayer5.isPlaying()) {
                new Handler(Looper.getMainLooper()).postDelayed(new StopActivityActivity$$ExternalSyntheticLambda0(this), (long) (ContextKt.getBaseConfig(this).getDoNotTouchVolumeDuration() * 1000));
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(this.TAG, "startMediaPlayer: " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public static final void startMediaPlayer$lambda$0(StopActivityActivity stopActivityActivity) {
        Intrinsics.checkNotNullParameter(stopActivityActivity, "this$0");
        MediaPlayer mediaPlayer = stopActivityActivity.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = stopActivityActivity.mp;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        stopActivityActivity.mp = null;
    }

    /* access modifiers changed from: private */
    public final void stopMediaPlaying() {
        ContextKt.stopVibration(this);
        stopFlashLight();
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.mp;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.mp = null;
        new Handler().postDelayed(new StopActivityActivity$$ExternalSyntheticLambda1(this), 1000);
    }

    /* access modifiers changed from: private */
    public static final void stopMediaPlaying$lambda$1(StopActivityActivity stopActivityActivity) {
        Intrinsics.checkNotNullParameter(stopActivityActivity, "this$0");
        stopActivityActivity.startActivity(new Intent(stopActivityActivity, DtmpMainActivity.class));
        stopActivityActivity.finish();
    }

    private final void checkStopService() {
        int i = actiontype;
        if (i == 11) {
            Objects.requireNonNull(getBinding()).textView3.setText(getString(R.string.anti_pocket_detection));
        } else if (i == 22) {
            Objects.requireNonNull(getBinding()).textView3.setText(getString(R.string.don_t_touch_my_phone));
        } else if (i == 33) {
            Objects.requireNonNull(getBinding()).textView3.setText(getString(R.string.charger_unplug_detection));
        } else if (i == 44) {
            Objects.requireNonNull(getBinding()).textView3.setText(getString(R.string.don_t_touch_my_phone));
        } else if (i == 55) {
            Objects.requireNonNull(getBinding()).textView3.setText(getString(R.string.whistle_detection));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        hideNavigationBar(false);
    }

    /* access modifiers changed from: private */
    public final void openFlashLight() {
        Object systemService = getSystemService(Context.CAMERA_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        String str = null;
        try {
            str = cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            throw new RuntimeException(e);
        }
        if (!this.flashLightStatus) {
            try {
                cameraManager.setTorchMode(str, true);
                this.flashLightStatus = true;
            } catch (CameraAccessException e) {
                Log.e(this.TAG, "openFlashLight:1 " + e.getMessage());
            }
        } else {
            try {
                cameraManager.setTorchMode(str, false);
                this.flashLightStatus = false;
            } catch (CameraAccessException e2) {
                Log.e(this.TAG, "openFlashLight: 2" + e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void closeFlashLight() {
        Object systemService = getSystemService(Context.CAMERA_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        String str = null;
        try {
            str = cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            throw new RuntimeException(e);
        }
        if (this.flashLightStatus) {
            try {
                cameraManager.setTorchMode(str, false);
                this.flashLightStatus = false;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                Log.e(this.TAG, "closeFlashLight: " + e.getMessage());
            }
        }
    }

    private final void startFlashLight(long j) {
        openFlashLight();
        this.flashLightOn = true;
        this.handler.removeCallbacksAndMessages((Object) null);
        this.handler.postDelayed(new StopActivityActivity$startFlashLight$1(this, j), j);
    }

    private final void stopFlashLight() {
        this.flashLightOn = false;
        this.handler.removeCallbacksAndMessages((Object) null);
        closeFlashLight();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        isAlreadyScreenShowing = false;
    }
}
