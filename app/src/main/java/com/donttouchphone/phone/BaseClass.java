package com.donttouchphone.phone;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.donttouchphone.phone.models.SoundsModel;
import com.donttouchphone.phone.recivers.AdminPermissionReceiver;
import com.donttouchphone.phone.services.ChargerDetectionService;
import com.donttouchphone.phone.services.DoNotTouchMyPhoneService;
import com.donttouchphone.phone.services.PocketService;
import com.donttouchphone.phone.services.WhistleDetectionService;
import com.donttouchphone.phone.ui.SoundSettingActivity;
import com.donttouchphone.phone.ui.adapters.SoundsAdapter;
import com.donttouchphone.phone.util.ActivityKt;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.ContextKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u0001*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010_\u001a\u00020\u000eJ\u0006\u0010`\u001a\u00020\u000eJ)\u0010a\u001a\u00020\u00122!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ\u000e\u0010c\u001a\u00020\u00122\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u00020\u00122\u0006\u0010d\u001a\u00020eJ\u000e\u0010g\u001a\u00020\u00122\u0006\u0010d\u001a\u00020eJ\u000e\u0010h\u001a\u00020\u00122\u0006\u0010d\u001a\u00020eJ\u0006\u0010i\u001a\u00020\u0012J\r\u0010j\u001a\u00028\u0000H&¢\u0006\u0002\u0010\"J)\u0010k\u001a\u00020\u00122!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ+\u0010l\u001a\u00020\u00122!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0002J1\u0010m\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00062!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ\u0010\u0010o\u001a\u00020\u00122\b\b\u0002\u0010p\u001a\u00020\u000eJ\u0006\u0010q\u001a\u00020\u000eJ\u0012\u0010r\u001a\u00020\u000e2\n\u0010s\u001a\u0006\u0012\u0002\b\u00030tJ\u0010\u0010u\u001a\u00020\u00122\u0006\u0010v\u001a\u00020QH\u0002J\"\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\u00062\b\u0010z\u001a\u0004\u0018\u00010<H\u0014J\u0012\u0010{\u001a\u00020\u00122\b\u0010|\u001a\u0004\u0018\u00010}H\u0014J\b\u0010~\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u00020\u0012H\u0014J3\u0010\u0001\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00062\u0010\u0010\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020\u0012H\u0014J\t\u0010\u0001\u001a\u00020\u0012H\u0002J\u0007\u0010\u0001\u001a\u00020\u0012J*\u0010\u0001\u001a\u00020\u00122!\u0010b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ\u0011\u0010\u0001\u001a\u00020\u00122\b\u0010\u0001\u001a\u00030\u0001J-\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u000b2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\rJ\u0011\u0010\u0001\u001a\u00020\u00122\b\u0010\u0001\u001a\u00030\u0001J4\u0010\u0001\u001a\u00020\u00122\u0006\u0010v\u001a\u00020Q2\t\b\u0002\u0010\u0001\u001a\u00020\u000e2\u0016\b\u0002\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0002J\t\u0010\u0001\u001a\u00020\u0012H\u0002J2\u0010\u0001\u001a\u00020\u00122\u0006\u0010v\u001a\u00020Q2\t\b\u0002\u0010\u0001\u001a\u00020\u000e2\u0016\b\u0002\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rJ\u0018\u0010\u0001\u001a\u00020\u00122\u0006\u0010d\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001a\u00102\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u001a\u00104\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R \u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u0016\u0010D\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010V\u001a\b\u0012\u0004\u0012\u00020<0;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010>\"\u0004\bX\u0010@R\u001a\u0010Y\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010G\"\u0004\b[\u0010IR\u001a\u0010\\\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010G\"\u0004\b^\u0010I¨\u0006\u0001"}, d2 = {"Lcom/donttouchphone/antitheftalarm/BaseClass;", "B", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "GENERIC_PERM_HANDLER", "", "GPS_PERMISSIONS_CODE", "getGPS_PERMISSIONS_CODE", "()I", "TAG2", "", "actionOnPermission", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "granted", "", "getActionOnPermission", "()Lkotlin/jvm/functions/Function1;", "setActionOnPermission", "(Lkotlin/jvm/functions/Function1;)V", "actionOnPermissionHandlePermission", "getActionOnPermissionHandlePermission", "setActionOnPermissionHandlePermission", "adapter", "Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter;", "getAdapter", "()Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter;", "setAdapter", "(Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "componentName", "Landroid/content/ComponentName;", "devicePolicyManager", "Landroid/app/admin/DevicePolicyManager;", "interval", "", "isAlreadyShowInterAd", "()Z", "setAlreadyShowInterAd", "(Z)V", "isAskingPermissions", "setAskingPermissions", "isAskingPermissionsHandlePermission", "setAskingPermissionsHandlePermission", "isFromSplash", "setFromSplash", "loadingDialog", "Landroid/app/Dialog;", "mediaPlayer", "Landroid/media/MediaPlayer;", "notificationPolicyResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getNotificationPolicyResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setNotificationPolicyResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "overlayPermissionResultLauncher", "getOverlayPermissionResultLauncher", "setOverlayPermissionResultLauncher", "resultLauncher", "selectedFunctionCategory", "getSelectedFunctionCategory", "()Ljava/lang/String;", "setSelectedFunctionCategory", "(Ljava/lang/String;)V", "selectedImageView", "Landroid/widget/ImageView;", "getSelectedImageView", "()Landroid/widget/ImageView;", "setSelectedImageView", "(Landroid/widget/ImageView;)V", "selectedSoundModel", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "getSelectedSoundModel", "()Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "setSelectedSoundModel", "(Lcom/donttouchphone/antitheftalarm/models/SoundsModel;)V", "someActivityResultLauncher", "getSomeActivityResultLauncher", "setSomeActivityResultLauncher", "srcAds", "getSrcAds", "setSrcAds", "srcAdsTracking", "getSrcAdsTracking", "setSrcAdsTracking", "checkDeviceOverLayPermissionGranted", "checkFinePermission", "checkPasswordAdminPermission", "callback", "configAntiPocket", "view", "Landroid/widget/TextView;", "configUnPlugService", "configUnTouchDevice", "configWhistleDetectionService", "dismissLoadingDialog", "getViewBinding", "handleNotificationPermission", "handleNotificationPolicyPermission", "handlePermission", "permissionId", "hideNavigationBar", "isLightStatusBar", "isAdministratorPermissionEnabled", "isMyServiceRunning", "serviceClass", "Ljava/lang/Class;", "navigateToSoundActivity", "model", "onActivityResult", "requestCode", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "pauseMediaPlayer", "removeAdminPermissionUninstall", "requestDrawOverLayPermission", "setUpSoundAdapter", "rcContent", "Landroidx/recyclerview/widget/RecyclerView;", "showInterAdsForScreens", "src", "srcTracking", "showLoadingDialog", "activity", "Landroid/app/Activity;", "startMediaPlayer", "isLoopPlay", "stopMediaPlayer", "togglePlayPause", "updateActivateTextUi", "isStart", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: BaseClass.kt */
public abstract class BaseClass<B extends ViewBinding> extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Intent doNotTouchIntent;
    private final int GENERIC_PERM_HANDLER = 100;
//    private final int GPS_PERMISSIONS_CODE = IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
    private final String TAG2 = "BaseClass";
    private Function1<? super Boolean, Unit> actionOnPermission;
    private Function1<? super Boolean, Unit> actionOnPermissionHandlePermission;
    private SoundsAdapter adapter;
    public B binding;
    private ComponentName componentName;
    private DevicePolicyManager devicePolicyManager;
    private long interval;
    private boolean isAlreadyShowInterAd;
    private boolean isAskingPermissions;
    private boolean isAskingPermissionsHandlePermission;
    private boolean isFromSplash;
    private Dialog loadingDialog;
    private MediaPlayer mediaPlayer;
    private ActivityResultLauncher<Intent> notificationPolicyResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BaseClass$$ExternalSyntheticLambda0(this));
    private ActivityResultLauncher<Intent> overlayPermissionResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BaseClass$$ExternalSyntheticLambda2(this));
    private ActivityResultLauncher<Intent> resultLauncher;
    private String selectedFunctionCategory = "DetectWhistleActivity";
    private ImageView selectedImageView;
    private SoundsModel selectedSoundModel;
    private ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BaseClass$$ExternalSyntheticLambda1(this));
    private String srcAds = "intruderselfiescr_click_back";
    private String srcAdsTracking = "intruderselfiescr_click_back";

    public abstract B getViewBinding();

    public final boolean isFromSplash() {
        return this.isFromSplash;
    }

    public final void setFromSplash(boolean z) {
        this.isFromSplash = z;
    }

    public final boolean isAlreadyShowInterAd() {
        return this.isAlreadyShowInterAd;
    }

    public final void setAlreadyShowInterAd(boolean z) {
        this.isAlreadyShowInterAd = z;
    }

    public final B getBinding() {
        B b = this.binding;
        if (b != null) {
            return b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(B b) {
        Intrinsics.checkNotNullParameter(b, "<set-?>");
        this.binding = b;
    }

    public final String getSelectedFunctionCategory() {
        return this.selectedFunctionCategory;
    }

    public final void setSelectedFunctionCategory(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedFunctionCategory = str;
    }

    public final String getSrcAds() {
        return this.srcAds;
    }

    public final void setSrcAds(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.srcAds = str;
    }

    public final String getSrcAdsTracking() {
        return this.srcAdsTracking;
    }

    public final void setSrcAdsTracking(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.srcAdsTracking = str;
    }

    public final Function1<Boolean, Unit> getActionOnPermissionHandlePermission() {
        return (Function1<Boolean, Unit>) this.actionOnPermissionHandlePermission;
    }

    public final void setActionOnPermissionHandlePermission(Function1<? super Boolean, Unit> function1) {
        this.actionOnPermissionHandlePermission = function1;
    }

    public final boolean isAskingPermissionsHandlePermission() {
        return this.isAskingPermissionsHandlePermission;
    }

    public final void setAskingPermissionsHandlePermission(boolean z) {
        this.isAskingPermissionsHandlePermission = z;
    }

    public final Function1<Boolean, Unit> getActionOnPermission() {
        return (Function1<Boolean, Unit>) this.actionOnPermission;
    }

    public final void setActionOnPermission(Function1<? super Boolean, Unit> function1) {
        this.actionOnPermission = function1;
    }

    public final boolean isAskingPermissions() {
        return this.isAskingPermissions;
    }

    public final void setAskingPermissions(boolean z) {
        this.isAskingPermissions = z;
    }

//    public final int getGPS_PERMISSIONS_CODE() {
//        return this.GPS_PERMISSIONS_CODE;
//    }

    public final SoundsModel getSelectedSoundModel() {
        return this.selectedSoundModel;
    }

    public final void setSelectedSoundModel(SoundsModel soundsModel) {
        this.selectedSoundModel = soundsModel;
    }

    public final ImageView getSelectedImageView() {
        return this.selectedImageView;
    }

    public final void setSelectedImageView(ImageView imageView) {
        this.selectedImageView = imageView;
    }

    public final SoundsAdapter getAdapter() {
        return this.adapter;
    }

    public final void setAdapter(SoundsAdapter soundsAdapter) {
        this.adapter = soundsAdapter;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBinding(getViewBinding());
        hideNavigationBar$default(this, false, 1, (Object) null);
        setContentView(getBinding().getRoot());
        this.isAlreadyShowInterAd = getIntent().getBooleanExtra("isAdFailed", false);
    }

    public final void setUpSoundAdapter(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "rcContent");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Activity activity = this;
        SoundsAdapter soundsAdapter = new SoundsAdapter(activity);
        this.adapter = soundsAdapter;
        recyclerView.setAdapter(soundsAdapter);

        if (this.adapter != null) {
            this.adapter.setItems(ActivityKt.getAllSounds(activity));

            this.adapter.setSafeOnClickListener(new Function1<SoundsModel, Unit>() {
                @Override
                public Unit invoke(SoundsModel model) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    navigateToSoundActivity(model);
                    return Unit.INSTANCE;
                }
            });

            this.adapter.setOnPlayClickListener(new Function2<SoundsModel, ImageView, Unit>() {
                @Override
                public Unit invoke(SoundsModel model, ImageView imgView) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(imgView, "imgView");

                    if (selectedImageView != null) {
                        selectedImageView.setImageDrawable(getResources().getDrawable(R.drawable.play_btn));
                    }
                    selectedImageView = imgView;
                    togglePlayPause(model);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    private void togglePlayPause(SoundsModel model) {




    }


//    public static /* synthetic */ void togglePlayPause$default(BaseClass baseClass, SoundsModel soundsModel, boolean z, Function1 function1, int i, Object obj) {
//        if (obj == null) {
//            if ((i & 2) != 0) {
//                z = false;
//            }
//            if ((i & 4) != 0) {
//                function1 = null;
//            }
//            baseClass.togglePlayPause(soundsModel, z, function1);
//            return;
//        }
//        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: togglePlayPause");
//    }

    public final void togglePlayPause(SoundsModel soundsModel, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(soundsModel, "model");
        if (Intrinsics.areEqual((Object) this.selectedSoundModel, (Object) soundsModel)) {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 == null || !mediaPlayer2.isPlaying()) {
                stopMediaPlayer();
                startMediaPlayer(soundsModel, z, function1);
                return;
            }
            pauseMediaPlayer();
            if (function1 != null) {
                function1.invoke(false);
                return;
            }
            return;
        }
        this.selectedSoundModel = soundsModel;
        stopMediaPlayer();
        startMediaPlayer(soundsModel, z, function1);
    }

    private final void pauseMediaPlayer() {
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.pause();
            }
            ImageView imageView = this.selectedImageView;
            if (imageView != null) {
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.play_btn));
            }
        }
    }

    static /* synthetic */ void startMediaPlayer$default(BaseClass baseClass, SoundsModel soundsModel, boolean z, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            baseClass.startMediaPlayer(soundsModel, z, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMediaPlayer");
    }

    private final void startMediaPlayer(SoundsModel soundsModel, boolean z, Function1<? super Boolean, Unit> function1) {
        if (this.mediaPlayer == null) {
            Context context = this;
            MediaPlayer create = MediaPlayer.create(context, soundsModel.getSoundMp3());
            this.mediaPlayer = create;
            if (create != null) {
                create.setLooping(z);
            }
            int doNotTouchVolumeLevel = ContextKt.getBaseConfig(context).getDoNotTouchVolumeLevel();
            if (doNotTouchVolumeLevel == 0) {
                MediaPlayer mediaPlayer2 = this.mediaPlayer;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
            } else {
                MediaPlayer mediaPlayer3 = this.mediaPlayer;
                if (mediaPlayer3 != null) {
                    float f = ((float) doNotTouchVolumeLevel) / ((float) 100);
                    mediaPlayer3.setVolume(f, f);
                }
            }
            MediaPlayer mediaPlayer4 = this.mediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setOnCompletionListener(new BaseClass$$ExternalSyntheticLambda3(this));
            }
            MediaPlayer mediaPlayer5 = this.mediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.start();
            }
            if (function1 != null) {
                function1.invoke(true);
            }
            ImageView imageView = this.selectedImageView;
            if (imageView != null) {
                imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pause));
            }
        } else if (function1 != null) {
            function1.invoke(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void startMediaPlayer$lambda$0(BaseClass baseClass, MediaPlayer mediaPlayer2) {
        Intrinsics.checkNotNullParameter(baseClass, "this$0");
        ImageView imageView = baseClass.selectedImageView;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(baseClass, R.drawable.play_btn));
        }
    }

    private final void stopMediaPlayer() {
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            this.mediaPlayer = null;
        }
    }

    public final boolean isMyServiceRunning(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "serviceClass");
        Object systemService = getSystemService(Context.ACTIVITY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE)) {
            if (Intrinsics.areEqual((Object) cls.getName(), (Object) runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void hideNavigationBar$default(BaseClass baseClass, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            baseClass.hideNavigationBar(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideNavigationBar");
    }

    public final void hideNavigationBar(boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(getWindow().getDecorView());
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
                windowInsetsController.hide(WindowInsetsCompat.Type.navigationBars());
                if (getWindow().getDecorView().getRootWindowInsets() != null) {
                    getWindow().getDecorView().getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
                }
                getWindow().setDecorFitsSystemWindows(true);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
        new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(z);
    }

    public final void checkPasswordAdminPermission(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        Object systemService = getSystemService(Context.DEVICE_POLICY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        if (((DevicePolicyManager) systemService).isAdminActive(new ComponentName(this, AdminPermissionReceiver.class))) {
            function1.invoke(true);
        } else {
            function1.invoke(false);
        }
    }

    public final boolean isAdministratorPermissionEnabled() {
        Boolean bool;
        Object systemService = getSystemService(Context.DEVICE_POLICY_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        this.devicePolicyManager = (DevicePolicyManager) systemService;
        ComponentName componentName2 = new ComponentName(this, AdminPermissionReceiver.class);
        this.componentName = componentName2;
        DevicePolicyManager devicePolicyManager2 = this.devicePolicyManager;
        if (devicePolicyManager2 != null) {
            Intrinsics.checkNotNull(componentName2);
            bool = Boolean.valueOf(devicePolicyManager2.isAdminActive(componentName2));
        } else {
            bool = null;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    public final void removeAdminPermissionUninstall() {
        DevicePolicyManager devicePolicyManager2 = this.devicePolicyManager;
        if (devicePolicyManager2 != null) {
            ComponentName componentName2 = this.componentName;
            Intrinsics.checkNotNull(componentName2);
            devicePolicyManager2.removeActiveAdmin(componentName2);
        }
    }

    private final void handleNotificationPolicyPermission(Function1<? super Boolean, Unit> function1) {
        this.actionOnPermission = function1;
        try {
            this.notificationPolicyResultLauncher.launch(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            ContextKt.toast$default((Context) this, "Something went wrong", 0, 2, (Object) null);
            function1.invoke(false);
        }
    }

    public final ActivityResultLauncher<Intent> getNotificationPolicyResultLauncher() {
        return this.notificationPolicyResultLauncher;
    }

    public final void setNotificationPolicyResultLauncher(ActivityResultLauncher<Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<set-?>");
        this.notificationPolicyResultLauncher = activityResultLauncher;
    }

    /* access modifiers changed from: private */
    public static final void notificationPolicyResultLauncher$lambda$1(BaseClass baseClass, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(baseClass, "this$0");
//        Intrinsics.checkNotNullParameter(activityResult, IronSourceConstants.EVENTS_RESULT);
        Object systemService = baseClass.getSystemService(Context.NOTIFICATION_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
            Function1<? super Boolean, Unit> function1 = baseClass.actionOnPermission;
            if (function1 != null) {
                function1.invoke(true);
                return;
            }
            return;
        }
        Function1<? super Boolean, Unit> function12 = baseClass.actionOnPermission;
        if (function12 != null) {
            function12.invoke(false);
        }
    }

    public final void handleNotificationPermission(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        if (!ConstantsKt.isTiramisuPlus()) {
            function1.invoke(true);
        } else {
            handlePermission(17, new Function1<Boolean, Unit>() {
                {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    function1.invoke(Boolean.valueOf(z));
                }
            });
        }
    }

    public final ActivityResultLauncher<Intent> getSomeActivityResultLauncher() {
        return this.someActivityResultLauncher;
    }

    public final void setSomeActivityResultLauncher(ActivityResultLauncher<Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<set-?>");
        this.someActivityResultLauncher = activityResultLauncher;
    }

    /* access modifiers changed from: private */
    public static final void someActivityResultLauncher$lambda$2(BaseClass baseClass, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(baseClass, "this$0");
//        Intrinsics.checkNotNullParameter(activityResult, IronSourceConstants.EVENTS_RESULT);
        Log.d(baseClass.TAG2, "initViews: on activity result");
        if (activityResult.getResultCode() == -1) {
            Log.d(baseClass.TAG2, "initViews: 6 result okk");
            baseClass.isAskingPermissions = false;
            Function1<? super Boolean, Unit> function1 = baseClass.actionOnPermission;
            if (function1 != null) {
                function1.invoke(true);
                return;
            }
            return;
        }
        Log.d(baseClass.TAG2, "initViews: result cancelled");
        Function1<? super Boolean, Unit> function12 = baseClass.actionOnPermission;
        if (function12 != null) {
            function12.invoke(false);
        }
    }

    public final void handlePermission(int i, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.actionOnPermissionHandlePermission = null;
        Context context = this;
        if (ContextKt.hasPermission(context, i)) {
            function1.invoke(true);
            return;
        }
        this.isAskingPermissionsHandlePermission = true;
        this.actionOnPermissionHandlePermission = function1;
        ActivityCompat.requestPermissions(this, new String[]{ContextKt.getPermissionString(context, i)}, this.GENERIC_PERM_HANDLER);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = false;
        this.isAskingPermissionsHandlePermission = false;
        if (i == this.GENERIC_PERM_HANDLER) {
            if ((!(iArr.length == 0)) && (function1 = this.actionOnPermissionHandlePermission) != null) {
                if (iArr[0] == 0) {
                    z = true;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final boolean checkFinePermission() {
        return ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public final boolean checkDeviceOverLayPermissionGranted() {
        return Settings.canDrawOverlays(this);
    }

    public final void requestDrawOverLayPermission(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.actionOnPermission = function1;
        this.overlayPermissionResultLauncher.launch(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())));
    }

    public final ActivityResultLauncher<Intent> getOverlayPermissionResultLauncher() {
        return this.overlayPermissionResultLauncher;
    }

    public final void setOverlayPermissionResultLauncher(ActivityResultLauncher<Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<set-?>");
        this.overlayPermissionResultLauncher = activityResultLauncher;
    }

    /* access modifiers changed from: private */
    public static final void overlayPermissionResultLauncher$lambda$3(BaseClass baseClass, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(baseClass, "this$0");
//        Intrinsics.checkNotNullParameter(activityResult, IronSourceConstants.EVENTS_RESULT);
        if (activityResult.getResultCode() == -1) {
            Function1<? super Boolean, Unit> function1 = baseClass.actionOnPermission;
            if (function1 != null) {
                function1.invoke(true);
                return;
            }
            return;
        }
        Function1<? super Boolean, Unit> function12 = baseClass.actionOnPermission;
        if (function12 != null) {
            function12.invoke(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: private */
    public final void navigateToSoundActivity(SoundsModel soundsModel) {
        Intent intent = new Intent(this, SoundSettingActivity.class);
        intent.putExtra("SoundSettingActivity", this.selectedFunctionCategory);
        intent.putExtra("soundResource", soundsModel);
        startActivity(intent);
    }

    public final void configUnTouchDevice(TextView textView) {
//        Intrinsics.checkNotNullParameter(textView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        Object systemService = getSystemService(Context.SENSOR_SERVICE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        if (((SensorManager) systemService).getDefaultSensor(1) == null) {
            String string = getString(R.string.accelerometer_not_available);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ContextKt.toast$default((Context) this, string, 0, 2, (Object) null);
            return;
        }
        if (doNotTouchIntent == null) {
            doNotTouchIntent = new Intent(this, DoNotTouchMyPhoneService.class);
        }
        if (isMyServiceRunning(DoNotTouchMyPhoneService.class)) {
            updateActivateTextUi(textView, false);
            stopService(doNotTouchIntent);
            String string2 = getString(R.string.service_stopped);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ContextKt.toast$default((Context) this, string2, 0, 2, (Object) null);
            return;
        }
        updateActivateTextUi(textView, true);
        String string3 = getString(R.string.service_started);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ContextKt.toast$default((Context) this, string3, 0, 2, (Object) null);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(doNotTouchIntent);
        } else {
            startService(doNotTouchIntent);
        }
    }

    public final void configWhistleDetectionService(TextView textView) {
//        Intrinsics.checkNotNullParameter(textView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (WhistleDetectionService.Companion.getWhistleDetectionIntent() == null) {
            WhistleDetectionService.Companion.setWhistleDetectionIntent(new Intent(this, WhistleDetectionService.class));
        }
        if (isMyServiceRunning(WhistleDetectionService.class)) {
            updateActivateTextUi(textView, false);
            stopService(WhistleDetectionService.Companion.getWhistleDetectionIntent());
            return;
        }
        updateActivateTextUi(textView, true);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(WhistleDetectionService.Companion.getWhistleDetectionIntent());
        } else {
            startService(WhistleDetectionService.Companion.getWhistleDetectionIntent());
        }
    }

    public final void configAntiPocket(TextView textView) {
//        Intrinsics.checkNotNullParameter(textView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (PocketService.Companion.getPocketServiceIntent() == null) {
            PocketService.Companion.setPocketServiceIntent(new Intent(this, PocketService.class));
        }
        if (isMyServiceRunning(PocketService.class)) {
            updateActivateTextUi(textView, false);
            stopService(PocketService.Companion.getPocketServiceIntent());
            return;
        }
        updateActivateTextUi(textView, true);
        if (ConstantsKt.isOreoPlus()) {
            startForegroundService(PocketService.Companion.getPocketServiceIntent());
        } else {
            startService(PocketService.Companion.getPocketServiceIntent());
        }
    }

    public final void configUnPlugService(TextView textView) {
//        Intrinsics.checkNotNullParameter(textView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (ChargerDetectionService.Companion.getChargerDetectionServiceIntent() == null) {
            ChargerDetectionService.Companion.setChargerDetectionServiceIntent(new Intent(this, ChargerDetectionService.class));
        }
        if (isMyServiceRunning(ChargerDetectionService.class)) {
            updateActivateTextUi(textView, false);
            stopService(ChargerDetectionService.Companion.getChargerDetectionServiceIntent());
            String string = getString(R.string.service_stopped);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ContextKt.toast$default((Context) this, string, 0, 2, (Object) null);
            return;
        }
        String string2 = getString(R.string.service_started);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ContextKt.toast$default((Context) this, string2, 0, 2, (Object) null);
        if (ConstantsKt.isOreoPlus()) {
            startForegroundService(ChargerDetectionService.Companion.getChargerDetectionServiceIntent());
        } else {
            startService(ChargerDetectionService.Companion.getChargerDetectionServiceIntent());
        }
        updateActivateTextUi(textView, true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/donttouchphone/antitheftalarm/BaseClass$Companion;", "", "()V", "doNotTouchIntent", "Landroid/content/Intent;", "getDoNotTouchIntent", "()Landroid/content/Intent;", "setDoNotTouchIntent", "(Landroid/content/Intent;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: BaseClass.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getDoNotTouchIntent() {
            return BaseClass.doNotTouchIntent;
        }

        public final void setDoNotTouchIntent(Intent intent) {
            BaseClass.doNotTouchIntent = intent;
        }
    }

    public final void updateActivateTextUi(TextView textView, boolean z) {
//        Intrinsics.checkNotNullParameter(textView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (z) {
            textView.setText(getString(R.string.tap_to_deactivate));
            textView.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        textView.setText(getString(R.string.tap_to_active));
        textView.setTextColor(getResources().getColor(R.color.green));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        stopMediaPlayer();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        stopMediaPlayer();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        SoundsAdapter soundsAdapter = this.adapter;
        if (soundsAdapter != null) {
            soundsAdapter.notifyDataSetChanged();
        }
        hideNavigationBar$default(this, false, 1, (Object) null);
    }



    public final void showLoadingDialog(Activity activity) {
        Dialog dialog;
        Window window;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Dialog dialog2 = new Dialog(activity, 16973834);
        this.loadingDialog = dialog2;
//        dialog2.setContentView(R.layout.dialog_resume_loading);
        Dialog dialog3 = this.loadingDialog;
        if (!(dialog3 == null || (window = dialog3.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog4 = this.loadingDialog;
        if (dialog4 != null) {
            dialog4.setCancelable(false);
        }
        Dialog dialog5 = this.loadingDialog;
        if (dialog5 != null && !dialog5.isShowing() && (dialog = this.loadingDialog) != null) {
            dialog.show();
        }
    }

    public final void dismissLoadingDialog() {
        Dialog dialog = this.loadingDialog;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.loadingDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.loadingDialog = null;
        }
    }
}
