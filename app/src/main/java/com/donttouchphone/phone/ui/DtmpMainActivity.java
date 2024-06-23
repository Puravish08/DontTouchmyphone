package com.donttouchphone.phone.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivityDtmpmainBinding;
import com.donttouchphone.phone.util.AppsUtils;
import com.donttouchphone.phone.util.EtensionKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\tH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\tH\u0002J\u001c\u0010\u001d\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u001fH\u0002J\u001c\u0010 \u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/MainActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityMainBinding;", "()V", "TAG", "", "dialog1", "Landroid/app/Dialog;", "checkPermissions", "", "cls", "Ljava/lang/Class;", "isCameraPermission", "", "getViewBinding", "handleBannerAD", "handleClicks", "handleExitNativeAd", "view", "Lcom/bmik/android/sdk/widgets/IkmWidgetAdView;", "handleMainNativeAd", "handlePreloadExitNativeAds", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showDialog", "showExitPopUpDialog", "showInterstitialAd", "callback", "Lkotlin/Function1;", "showInterstitialExitAd", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class DtmpMainActivity extends BaseClass<ActivityDtmpmainBinding> {
    /* access modifiers changed from: private */
    public final String TAG = "MainActivity";
    private Dialog dialog1;

    public ActivityDtmpmainBinding getViewBinding() {
        ActivityDtmpmainBinding inflate = ActivityDtmpmainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        if (!EtensionKt.canDrawOverlay(this)) {
            showDialog();
            Log.e("TAG", "onCreate: show");
        }
        handleClicks();
    }

//    private final void handleClicks() {
//        ConstraintLayout donTouch = getBinding().donTouch;
//        Intrinsics.checkNotNullExpressionValue(donTouch, "donTouch");
//        ViewKt.setSafeOnClickListener$default(donTouch, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$1
//            {
////                super(1);
//            }
//
//            @Override
//            public  Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.checkPermissions(NewDoNotTouchMyPhoneActivity.class, false);
//            }
//        }, 1, null);
//        CardView cvChargerUnplug = getBinding().cvChargerUnplug;
//        Intrinsics.checkNotNullExpressionValue(cvChargerUnplug, "cvChargerUnplug");
//        ViewKt.setSafeOnClickListener$default(cvChargerUnplug, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$2
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.checkPermissions(NewUnplugChargerActivity.class, false);
//            }
//        }, 1, null);
//        CardView cvWhoUnlock = getBinding().cvWhoUnlock;
//        Intrinsics.checkNotNullExpressionValue(cvWhoUnlock, "cvWhoUnlock");
//        ViewKt.setSafeOnClickListener$default(cvWhoUnlock, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$3
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.checkPermissions(NewWhoUnlockMyPhoneActivity.class, true);
//            }
//        }, 1, null);
//        CardView cvAntiPocket = getBinding().cvAntiPocket;
//        Intrinsics.checkNotNullExpressionValue(cvAntiPocket, "cvAntiPocket");
//        ViewKt.setSafeOnClickListener$default(cvAntiPocket, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$4
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.checkPermissions(NewAntiPocketActivity.class, false);
//            }
//        }, 1, null);
//        CardView cvWhisleDetection = getBinding().cvWhisleDetection;
//        Intrinsics.checkNotNullExpressionValue(cvWhisleDetection, "cvWhisleDetection");
//        ViewKt.setSafeOnClickListener$default(cvWhisleDetection, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$5
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.checkPermissions(NewDetectWhistleActivity.class, false);
//            }
//        }, 1, null);
//        ImageView helpbtn = getBinding().helpbtn;
//        Intrinsics.checkNotNullExpressionValue(helpbtn, "helpbtn");
//        ViewKt.setSafeOnClickListener$default(helpbtn, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$6
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.startActivity(new Intent(MainActivity.this, HelpActivity.class));
//            }
//        }, 1, null);
//        ImageView ivDrawer = getBinding().ivDrawer;
//        Intrinsics.checkNotNullExpressionValue(ivDrawer, "ivDrawer");
//        ViewKt.setSafeOnClickListener$default(ivDrawer, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$7
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                MainActivity.this.startActivity(new Intent(MainActivity.this, DrawarActivity.class));
//            }
//        }, 1, null);
//        CardView cvSetting = getBinding().cvSetting;
//        Intrinsics.checkNotNullExpressionValue(cvSetting, "cvSetting");
//        ViewKt.setSafeOnClickListener$default(cvSetting, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$8
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                return Unit.INSTANCE;
//            }
//
//        }, 1, null);
//        LinearLayout iloveApp = getBinding().iloveApp;
//        Intrinsics.checkNotNullExpressionValue(iloveApp, "iloveApp");
//        ViewKt.setSafeOnClickListener$default(iloveApp, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$9
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.rateUs(MainActivity.this);
//            }
//        }, 1, null);
//        LinearLayout ilovethisApp = getBinding().ilovethisApp;
//        Intrinsics.checkNotNullExpressionValue(ilovethisApp, "ilovethisApp");
//        ViewKt.setSafeOnClickListener$default(ilovethisApp, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$10
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.rateUs(MainActivity.this);
//            }
//        }, 1, null);
//        LinearLayout idislikeApp = getBinding().idislikeApp;
//        Intrinsics.checkNotNullExpressionValue(idislikeApp, "idislikeApp");
//        ViewKt.setSafeOnClickListener$default(idislikeApp, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$11
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.sendFeedback(MainActivity.this);
//            }
//        }, 1, null);
//        LinearLayout llShareMsg = getBinding().llShareMsg;
//        Intrinsics.checkNotNullExpressionValue(llShareMsg, "llShareMsg");
//        ViewKt.setSafeOnClickListener$default(llShareMsg, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$12
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.shareAppOnMessenger(MainActivity.this);
//            }
//        }, 1, null);
//        LinearLayout llWhatsappShare = getBinding().llWhatsappShare;
//        Intrinsics.checkNotNullExpressionValue(llWhatsappShare, "llWhatsappShare");
//        ViewKt.setSafeOnClickListener$default(llWhatsappShare, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$13
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.shareAppOnWhatsApp(MainActivity.this);
//            }
//        }, 1, null);
//        LinearLayout llShare = getBinding().llShare;
//        Intrinsics.checkNotNullExpressionValue(llShare, "llShare");
//        ViewKt.setSafeOnClickListener$default(llShare, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$handleClicks$14
//            /* JADX INFO: Access modifiers changed from: package-private */
//            {
////                super(1);
//            }
//
//            @Override // kotlin.jvm.functions.Function1
//            public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                invoke2(view);
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2(View it) {
//                Intrinsics.checkNotNullParameter(it, "it");
//                AppsUtils.INSTANCE.shareApp(MainActivity.this);
//            }
//        }, 1, null);
//    }


    private final void handleClicks() {
        ConstraintLayout donTouch = getBinding().donTouch;
        Intrinsics.checkNotNullExpressionValue(donTouch, "donTouch");
        donTouch.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, NewDoNotTouchMyPhoneActivity.class);
            startActivity(intent);
        });

        CardView cvChargerUnplug = getBinding().cvChargerUnplug;
        Intrinsics.checkNotNullExpressionValue(cvChargerUnplug, "cvChargerUnplug");
        cvChargerUnplug.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, NewUnplugChargerActivity.class);
            startActivity(intent);
        });

        CardView cvWhoUnlock = getBinding().cvWhoUnlock;
        Intrinsics.checkNotNullExpressionValue(cvWhoUnlock, "cvWhoUnlock");
        cvWhoUnlock.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, NewWhoUnlockMyPhoneActivity.class);
            startActivity(intent);
        });

        CardView cvAntiPocket = getBinding().cvAntiPocket;
        Intrinsics.checkNotNullExpressionValue(cvAntiPocket, "cvAntiPocket");
        cvAntiPocket.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, NewAntiPocketActivity.class);
            startActivity(intent);
        });

        CardView cvWhisleDetection = getBinding().cvWhisleDetection;
        Intrinsics.checkNotNullExpressionValue(cvWhisleDetection, "cvWhisleDetection");
        cvWhisleDetection.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, NewDetectWhistleActivity.class);
            startActivity(intent);
        });







        ImageView helpbtn = getBinding().helpbtn;
        Intrinsics.checkNotNullExpressionValue(helpbtn, "helpbtn");
        helpbtn.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, HelpActivity.class);
            startActivity(intent);
        });

        ImageView ivDrawer = getBinding().ivDrawer;
        Intrinsics.checkNotNullExpressionValue(ivDrawer, "ivDrawer");
        ivDrawer.setOnClickListener(view -> {
            Intent intent = new Intent(DtmpMainActivity.this, DrawarActivity.class);
            startActivity(intent);
        });

        CardView cvSetting = getBinding().cvSetting;
        Intrinsics.checkNotNullExpressionValue(cvSetting, "cvSetting");
        cvSetting.setOnClickListener(view -> {
            // No action defined
            Intent intent = new Intent(DtmpMainActivity.this, DtmpSettingActivity.class);
            startActivity(intent);
        });

        LinearLayout iloveApp = getBinding().iloveApp;
        Intrinsics.checkNotNullExpressionValue(iloveApp, "iloveApp");
        iloveApp.setOnClickListener(view -> AppsUtils.INSTANCE.rateUs(DtmpMainActivity.this));

        LinearLayout ilovethisApp = getBinding().ilovethisApp;
        Intrinsics.checkNotNullExpressionValue(ilovethisApp, "ilovethisApp");
        ilovethisApp.setOnClickListener(view -> AppsUtils.INSTANCE.rateUs(DtmpMainActivity.this));

        LinearLayout idislikeApp = getBinding().idislikeApp;
        Intrinsics.checkNotNullExpressionValue(idislikeApp, "idislikeApp");
        idislikeApp.setOnClickListener(view -> AppsUtils.INSTANCE.sendFeedback(DtmpMainActivity.this));

        LinearLayout llShareMsg = getBinding().llShareMsg;
        Intrinsics.checkNotNullExpressionValue(llShareMsg, "llShareMsg");
        llShareMsg.setOnClickListener(view -> AppsUtils.INSTANCE.shareAppOnMessenger(DtmpMainActivity.this));

        LinearLayout llWhatsappShare = getBinding().llWhatsappShare;
        Intrinsics.checkNotNullExpressionValue(llWhatsappShare, "llWhatsappShare");
        llWhatsappShare.setOnClickListener(view -> AppsUtils.INSTANCE.shareAppOnWhatsApp(DtmpMainActivity.this));

        LinearLayout llShare = getBinding().llShare;
        Intrinsics.checkNotNullExpressionValue(llShare, "llShare");
        llShare.setOnClickListener(view -> AppsUtils.INSTANCE.shareApp(DtmpMainActivity.this));
    }





    static /* synthetic */ void checkPermissions$default(DtmpMainActivity dtmpMainActivity, Class cls, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        dtmpMainActivity.checkPermissions(cls, z);
    }

    /* access modifiers changed from: private */
    public final void checkPermissions(Class<?> cls, boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            handlePermission(17, new Function1<Boolean, Unit>() {

                {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {


                    }
                }
            });
        } else if (z) {
            handlePermission(3, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$checkPermissions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    if (z2) {
                        final Intent intent = new Intent(DtmpMainActivity.this, cls);
                        DtmpMainActivity dtmpMainActivity = DtmpMainActivity.this;
                        final DtmpMainActivity dtmpMainActivity2 = DtmpMainActivity.this;
                    }
                }
            });
        } else {
            final Intent intent = new Intent(this, cls);
        }
    }

    private final void showDialog() {
        Dialog dialog = this.dialog1;
        if (dialog != null) {
            dialog.setContentView(R.layout.dialog_permission_drawoverlay);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
            TextView textView = (TextView) dialog.findViewById(R.id.textView48);
            if (textView != null) {
                Intrinsics.checkNotNull(textView);
                ViewKt.setSafeOnClickListener$default(textView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.MainActivity$showDialog$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
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
                        if (!EtensionKt.canDrawOverlay(DtmpMainActivity.this)) {
                            EtensionKt.checkOverlayPermission(DtmpMainActivity.this);
                        }
                        dialog.dismiss();
                    }
                }, 1, null);
            }
            dialog.show();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

//    public final void showExitPopUpDialog() {
//        Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
//        dialog.setContentView(R.layout.exit_popup_layout);
//        dialog.setCancelable(false);
//        Window window = dialog.getWindow();
//        if (window != null) {
//            window.setGravity(80);
//        }
//        Window window2 = dialog.getWindow();
//        if (window2 != null) {
//            window2.setBackgroundDrawable(new ColorDrawable(0));
//        }
//        View findViewById = dialog.findViewById(R.id.cancel);
//        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
//        ViewKt.setSafeOnClickListener$default(findViewById, 0, new MainActivity$showExitPopUpDialog$1(dialog), 1, (Object) null);
//
//        View findViewById2 = dialog.findViewById(R.id.exitAppId);
//        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
//        ViewKt.setSafeOnClickListener$default(findViewById2, 0, new MainActivity$showExitPopUpDialog$2(dialog, this), 1, (Object) null);
//        dialog.show();
//    }










}
