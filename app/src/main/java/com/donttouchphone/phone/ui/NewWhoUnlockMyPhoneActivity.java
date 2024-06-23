package com.donttouchphone.phone.ui;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityWhoUnlockMyPhoneBinding;
import com.donttouchphone.phone.recivers.AdminPermissionReceiver;
import com.donttouchphone.phone.services.CameraService;
import com.donttouchphone.phone.ui.dilogs.ChangePinDialog;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\"\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010#\u001a\u00020\nH\u0016J\u0012\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020\nH\u0014J\b\u0010(\u001a\u00020\nH\u0014J+\u0010)\u001a\u00020\n2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005H\u0002R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/NewWhoUnlockMyPhoneActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityWhoUnlockMyPhoneBinding;", "()V", "adminPermissionCheckCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "adminPermissionCheck", "", "adminPermissionResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "compName", "Landroid/content/ComponentName;", "deviceManger", "Landroid/app/admin/DevicePolicyManager;", "requestCameraPermissionLauncher", "", "requestNotificationPermissionLauncher", "requestStoragePermissionLauncher", "checkPermissions", "getViewBinding", "handleAdminPermission", "handleBannerAD", "handleClicks", "initViews", "isPermissionGranted", "permission", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "requestAdminPermission", "callback", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: NewWhoUnlockMyPhoneActivity.kt */
public final class NewWhoUnlockMyPhoneActivity extends BaseClass<ActivityWhoUnlockMyPhoneBinding> {
    /* access modifiers changed from: private */
    public Function1<? super Boolean, Unit> adminPermissionCheckCallback;
    private ActivityResultLauncher<Intent> adminPermissionResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda0(this));
    private ComponentName compName;
    private DevicePolicyManager deviceManger;
    private final ActivityResultLauncher<String> requestCameraPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda1(this));
    private final ActivityResultLauncher<String> requestNotificationPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda3(this));
    private final ActivityResultLauncher<String> requestStoragePermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda2(this));

    public ActivityWhoUnlockMyPhoneBinding getViewBinding() {
        ActivityWhoUnlockMyPhoneBinding inflate = ActivityWhoUnlockMyPhoneBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFromSplash(getIntent().getBooleanExtra("isFromSplash", false));
        setSrcAds("intruderselfiescr_click_back");
        setSrcAdsTracking("intruderselfiescr_click_back");
        handleAdminPermission();
        Object systemService = getSystemService(Context.DEVICE_POLICY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        this.deviceManger = (DevicePolicyManager) systemService;
        this.compName = new ComponentName(this, AdminPermissionReceiver.class);
        initViews();
        handleClicks();
    }

    private final void initViews() {
        Context context = this;
        ContextKt.getBaseConfig(context).setNumberOfPasswords(1);
        getBinding().switchRingerAlarm.setChecked(ContextKt.getBaseConfig(context).getAlarmOnIntruder());
        TextView textView = ((ActivityWhoUnlockMyPhoneBinding) getBinding()).tvStatus;
        Intrinsics.checkNotNullExpressionValue(textView, "tvStatus");
        updateActivateTextUi(textView, isMyServiceRunning(CameraService.class));
    }

    private final void handleClicks() {
        ImageView imageView = getBinding().ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$1
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
                NewWhoUnlockMyPhoneActivity.this.onBackPressed();
            }
        }, 1, null);
        LinearLayout linearLayout = ((ActivityWhoUnlockMyPhoneBinding) getBinding()).turnOnButton;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "turnOnButton");
        ViewKt.setSafeOnClickListener$default(linearLayout, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2
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
                String userPassword = ContextKt.getBaseConfig(NewWhoUnlockMyPhoneActivity.this).getUserPassword();
                if (userPassword == null || userPassword.length() == 0) {
                    final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity = NewWhoUnlockMyPhoneActivity.this;
                    new ChangePinDialog(NewWhoUnlockMyPhoneActivity.this, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2.1
                        {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                ContextKt.toast$default(NewWhoUnlockMyPhoneActivity.this, "Pin Activated", 0, 2, (Object) null);
                            }
                        }
                    });
                    return;
                }
                if (CameraService.Companion.getServiceRunning()) {
                    NewWhoUnlockMyPhoneActivity.this.stopService(new Intent(NewWhoUnlockMyPhoneActivity.this, CameraService.class));
                    NewWhoUnlockMyPhoneActivity.this.removeAdminPermissionUninstall();
                } else {
                    NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity2 = NewWhoUnlockMyPhoneActivity.this;
                    final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity3 = NewWhoUnlockMyPhoneActivity.this;
                    newWhoUnlockMyPhoneActivity2.requestAdminPermission(new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2.2
                        {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z && ConstantsKt.isOreoPlus()) {
                                NewWhoUnlockMyPhoneActivity.this.startForegroundService(new Intent(NewWhoUnlockMyPhoneActivity.this, CameraService.class));
                                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity4 = NewWhoUnlockMyPhoneActivity.this;
                                TextView tvStatus = newWhoUnlockMyPhoneActivity4.getBinding().tvStatus;
                                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                                newWhoUnlockMyPhoneActivity4.updateActivateTextUi(tvStatus, NewWhoUnlockMyPhoneActivity.this.isMyServiceRunning(CameraService.class));
                            }
                        }
                    });
                }
                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity4 = NewWhoUnlockMyPhoneActivity.this;
                TextView tvStatus = newWhoUnlockMyPhoneActivity4.getBinding().tvStatus;
                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                newWhoUnlockMyPhoneActivity4.updateActivateTextUi(tvStatus, NewWhoUnlockMyPhoneActivity.this.isMyServiceRunning(CameraService.class));
            }
        }, 1, null);
        getBinding().switchRingerAlarm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NewWhoUnlockMyPhoneActivity.handleClicks$lambda$0(NewWhoUnlockMyPhoneActivity.this, compoundButton, z);
            }
        });
        ((ActivityWhoUnlockMyPhoneBinding) getBinding()).switchRingerAlarm.setOnCheckedChangeListener(new NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda4(this));
        CardView cardView = ((ActivityWhoUnlockMyPhoneBinding) getBinding()).showIntruders;
        Intrinsics.checkNotNullExpressionValue(cardView, "showIntruders");
        ViewKt.setSafeOnClickListener$default(cardView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2
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
                String userPassword = ContextKt.getBaseConfig(NewWhoUnlockMyPhoneActivity.this).getUserPassword();
                if (userPassword == null || userPassword.length() == 0) {
                    final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity = NewWhoUnlockMyPhoneActivity.this;
                    new ChangePinDialog(NewWhoUnlockMyPhoneActivity.this, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2.1
                        {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                ContextKt.toast$default(NewWhoUnlockMyPhoneActivity.this, "Pin Activated", 0, 2, (Object) null);
                            }
                        }
                    });
                    return;
                }
                if (CameraService.Companion.getServiceRunning()) {
                    NewWhoUnlockMyPhoneActivity.this.stopService(new Intent(NewWhoUnlockMyPhoneActivity.this, CameraService.class));
                    NewWhoUnlockMyPhoneActivity.this.removeAdminPermissionUninstall();
                } else {
                    NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity2 = NewWhoUnlockMyPhoneActivity.this;
                    final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity3 = NewWhoUnlockMyPhoneActivity.this;
                    newWhoUnlockMyPhoneActivity2.requestAdminPermission(new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$2.2
                        {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                invoke(bool.booleanValue());
                            }
                            return Unit.INSTANCE;
                        }

                        @RequiresApi(api = Build.VERSION_CODES.O)
                        public final void invoke(boolean z) {
                            if (z && ConstantsKt.isOreoPlus()) {
                                NewWhoUnlockMyPhoneActivity.this.startForegroundService(new Intent(NewWhoUnlockMyPhoneActivity.this, CameraService.class));
                                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity4 = NewWhoUnlockMyPhoneActivity.this;
                                TextView tvStatus = newWhoUnlockMyPhoneActivity4.getBinding().tvStatus;
                                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                                newWhoUnlockMyPhoneActivity4.updateActivateTextUi(tvStatus, NewWhoUnlockMyPhoneActivity.this.isMyServiceRunning(CameraService.class));
                            }
                        }
                    });
                }
                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity4 = NewWhoUnlockMyPhoneActivity.this;
                TextView tvStatus = newWhoUnlockMyPhoneActivity4.getBinding().tvStatus;
                Intrinsics.checkNotNullExpressionValue(tvStatus, "tvStatus");
                newWhoUnlockMyPhoneActivity4.updateActivateTextUi(tvStatus, NewWhoUnlockMyPhoneActivity.this.isMyServiceRunning(CameraService.class));
            }
        }, 1, null);
        getBinding().switchRingerAlarm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NewWhoUnlockMyPhoneActivity.handleClicks$lambda$0(NewWhoUnlockMyPhoneActivity.this, compoundButton, z);
            }
        });
        CardView cardView2 = ((ActivityWhoUnlockMyPhoneBinding) getBinding()).changePin;
        Intrinsics.checkNotNullExpressionValue(cardView2, "changePin");
        ViewKt.setSafeOnClickListener$default(cardView2, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$4
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
                NewWhoUnlockMyPhoneActivity.this.startActivity(new Intent(NewWhoUnlockMyPhoneActivity.this, ViewIntrudersActivity.class));
            }
        }, 1, null);
        CardView changePin = getBinding().changePin;
        Intrinsics.checkNotNullExpressionValue(changePin, "changePin");
        ViewKt.setSafeOnClickListener$default(changePin, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$5
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
                final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity = NewWhoUnlockMyPhoneActivity.this;
                new ChangePinDialog(NewWhoUnlockMyPhoneActivity.this, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleClicks$5.1
                    {
//                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        if (z) {
                            ContextKt.toast$default(NewWhoUnlockMyPhoneActivity.this, "Pin Changed", 0, 2, (Object) null);
                        }
                    }
                });
            }
        }, 1, null);
    }

    /* access modifiers changed from: private */
    public static final void handleClicks$lambda$0(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(newWhoUnlockMyPhoneActivity, "this$0");
        ContextKt.getBaseConfig(newWhoUnlockMyPhoneActivity).setAlarmOnIntruder(z);
    }

    private final void handleAdminPermission() {
        handleNotificationPermission(new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity$handleAdminPermission$1
            /* JADX INFO: Access modifiers changed from: package-private */ {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (!z) {
                    ContextKt.toast$default(NewWhoUnlockMyPhoneActivity.this, "Permission to post notifications is required", 0, 2, (Object) null);
                }
                if (NewWhoUnlockMyPhoneActivity.this.isAdministratorPermissionEnabled()) {
                    return;
                }
                final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity = NewWhoUnlockMyPhoneActivity.this;
//                new RequestDeviceAdminPermissionDialog(NewWhoUnlockMyPhoneActivity.this, new Function<Unit>() {
//
//
//
//
//                    @Override
//                    public Function andThen(Function after) {
//                        return Function.super.andThen(after);
//                    }
//
//                    @Override
//                    public Function compose(Function before) {
//                        return Function.super.compose(before);
//                    }
//
//
//
//                    public Unit invoke() {
//                        invoke2();
//                        return Unit.INSTANCE;
//                    }
//
//                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
//                    public final void invoke2() {
//                        NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity2 = NewWhoUnlockMyPhoneActivity.this;
//                        final NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity3 = NewWhoUnlockMyPhoneActivity.this;
//                        newWhoUnlockMyPhoneActivity2.requestAdminPermission(new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.NewWhoUnlockMyPhoneActivity.handleAdminPermission.1.1.1
//                            {
////                                super(1);
//                            }
//
//                            @Override // kotlin.jvm.functions.Function1
//                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
//                                invoke(bool.booleanValue());
//                                return Unit.INSTANCE;
//                            }
//
//                            public final void invoke(boolean z2) {
//                                NewWhoUnlockMyPhoneActivity.this.adminPermissionCheckCallback = null;
//                                if (z2) {
//                                    NewWhoUnlockMyPhoneActivity.this.checkPermissions();
//                                    return;
//                                }
//                                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity4 = NewWhoUnlockMyPhoneActivity.this;
//                                NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity5 = newWhoUnlockMyPhoneActivity4;
//                                String string = newWhoUnlockMyPhoneActivity4.getString(R.string.admin_permission_required);
//                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
//                                ContextKt.toast$default(newWhoUnlockMyPhoneActivity5, string, 0, 2, (Object) null);
//                                NewWhoUnlockMyPhoneActivity.this.finish();
//                            }
//                        });
//                    }
//                });
            }
        });
    }


    /* access modifiers changed from: private */
    public final void requestAdminPermission(Function1<? super Boolean, Unit> function1) {
        this.adminPermissionCheckCallback = function1;
        Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
        intent.putExtra("android.app.extra.DEVICE_ADMIN", this.compName);
        intent.putExtra("android.app.extra.ADD_EXPLANATION", "You should enable the app!");
        ActivityResultLauncher<Intent> activityResultLauncher = this.adminPermissionResultLauncher;
        if (activityResultLauncher != null && activityResultLauncher != null) {
            activityResultLauncher.launch(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            Toast.makeText(this, "Device admin permission granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Device admin permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.adminPermissionResultLauncher = null;
    }

    /* access modifiers changed from: private */
    public static final void adminPermissionResultLauncher$lambda$1(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(newWhoUnlockMyPhoneActivity, "this$0");
//        Intrinsics.checkNotNullParameter(activityResult, IronSourceConstants.EVENTS_RESULT);
        if (activityResult.getResultCode() == -1) {
            Function1<? super Boolean, Unit> function1 = newWhoUnlockMyPhoneActivity.adminPermissionCheckCallback;
            if (function1 != null) {
                function1.invoke(true);
                return;
            }
            return;
        }
        Function1<? super Boolean, Unit> function12 = newWhoUnlockMyPhoneActivity.adminPermissionCheckCallback;
        if (function12 != null) {
            function12.invoke(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void requestCameraPermissionLauncher$lambda$2(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity, boolean z) {
        Intrinsics.checkNotNullParameter(newWhoUnlockMyPhoneActivity, "this$0");
        if (z) {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Camera permission granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Camera permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestStoragePermissionLauncher$lambda$3(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity, boolean z) {
        Intrinsics.checkNotNullParameter(newWhoUnlockMyPhoneActivity, "this$0");
        if (z) {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Storage permission granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Storage permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestNotificationPermissionLauncher$lambda$4(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity, boolean z) {
        Intrinsics.checkNotNullParameter(newWhoUnlockMyPhoneActivity, "this$0");
        if (z) {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Notification permission granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(newWhoUnlockMyPhoneActivity, "Notification permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    /* access modifiers changed from: private */
    public final void checkPermissions() {
        if (!isPermissionGranted("android.permission.CAMERA")) {
            this.requestCameraPermissionLauncher.launch("android.permission.CAMERA");
        }
        if (Build.VERSION.SDK_INT >= 31 && !isPermissionGranted("android.permission.POST_NOTIFICATIONS")) {
            this.requestNotificationPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
        }
    }

    private final boolean isPermissionGranted(String str) {
        return ContextCompat.checkSelfPermission(this, str) == 0;
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
