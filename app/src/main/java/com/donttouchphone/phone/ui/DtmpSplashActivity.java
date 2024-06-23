package com.donttouchphone.phone.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivityDtmpsplashBinding;
import com.donttouchphone.phone.ui.intro.OnBoardingActivity;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0016H\u0014J\b\u0010$\u001a\u00020\u0016H\u0014J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\u0014\u0010'\u001a\u00020\u00162\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/SplashActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivitySplashBinding;", "()V", "TAG", "", "actionType", "", "getActionType", "()I", "setActionType", "(I)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "timerWaitAds", "Landroid/os/CountDownTimer;", "getViewBinding", "gotoMainScreen", "", "handleMainScreenNavigation", "lngRemoteData", "", "(Ljava/lang/Long;)V", "handlePreLoadingAds", "handlePreloadNativeAds", "screen", "screenTracking", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "showBannerWithDefaultID", "showBannerWithID", "startIntent", "cls", "Ljava/lang/Class;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SplashActivity.kt */
public final class DtmpSplashActivity extends BaseClass<ActivityDtmpsplashBinding> {
    /* access modifiers changed from: private */
    public final String TAG = "SplashActivity";
    private int actionType;
    private Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public CountDownTimer timerWaitAds;

    public final int getActionType() {
        return this.actionType;
    }

    public final void setActionType(int i) {
        this.actionType = i;
    }

    public ActivityDtmpsplashBinding getViewBinding() {
        ActivityDtmpsplashBinding inflate = ActivityDtmpsplashBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setHandler(Handler handler2) {
        this.handler = handler2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstantsKt.changeStatusBarColor(this, R.color.screen_bg_color, true);
        this.actionType = getIntent().getIntExtra("actionType", 0);
        initViews();
    }

    private final void initViews() {
        handleNotificationPermission(new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.SplashActivity$initViews$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z) {
                    ContextKt.toast$default(DtmpSplashActivity.this, "Permission to post notifications is required", 0, 2, (Object) null);
                }
                DtmpSplashActivity dtmpSplashActivity = DtmpSplashActivity.this;
                final DtmpSplashActivity dtmpSplashActivity2 = DtmpSplashActivity.this;
            }
        });
    }


    /* access modifiers changed from: private */

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void gotoMainScreen() {
//        SDKBaseController.Companion.getInstance().loadInterstitialAds(this, ScreenAds.START.getValue(), ScreenAds.START.getValue());
//        SdkRemoteConfigDto sdkRemoteConfigDto = SDKBaseController.Companion.getInstance().getRemoteConfigData().get("sessionOpenlanguage");
        CountDownTimer countDownTimer = this.timerWaitAds;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (ProcessLifecycleOwner.Companion.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            int i = this.actionType;
            if (i == 11) {
                startIntent(NewAntiPocketActivity.class);
            } else if (i == 22) {
                startIntent(NewDoNotTouchMyPhoneActivity.class);
            } else if (i == 33) {
                startIntent(NewUnplugChargerActivity.class);
            } else if (i == 44) {
                startIntent(NewWhoUnlockMyPhoneActivity.class);
            } else if (i != 55) {
//                handleMainScreenNavigation(l);
            } else {
                startIntent(NewDetectWhistleActivity.class);
            }
        }
    }

    private final void handleMainScreenNavigation(Long l) {
        Class cls;
        if (l == null) {
            Context context = this;
            cls = !ContextKt.getBaseConfig(context).getAppStarted() ? LanguageActivity.class : !ContextKt.getBaseConfig(context).isPermissionDone() ? PermissionActivity.class : DtmpMainActivity.class;
        } else if (((int) l.longValue()) == 0) {
            Context context2 = this;
            cls = !ContextKt.getBaseConfig(context2).getAppStarted() ? OnBoardingActivity.class : !ContextKt.getBaseConfig(context2).isPermissionDone() ? PermissionActivity.class : DtmpMainActivity.class;
        } else if (((int) l.longValue()) == 1) {
            Context context3 = this;
            cls = !ContextKt.getBaseConfig(context3).isLanguageDone() ? LanguageActivity.class : !ContextKt.getBaseConfig(context3).getAppStarted() ? OnBoardingActivity.class : !ContextKt.getBaseConfig(context3).isPermissionDone() ? PermissionActivity.class : DtmpMainActivity.class;
        } else if (((int) l.longValue()) == 2) {
            cls = LanguageActivity.class;
        } else {
            Context context4 = this;
            if (!ContextKt.getBaseConfig(context4).getAppStarted()) {
                cls = OnBoardingActivity.class;
            } else {
                cls = !ContextKt.getBaseConfig(context4).isPermissionDone() ? PermissionActivity.class : DtmpMainActivity.class;
            }
        }
        startIntent(cls);
    }

    private final void startIntent(Class<?> cls) {
        startActivity(new Intent(this, cls).putExtra("isFromSplash", true));
        finish();
    }




    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.timerWaitAds;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
