package com.donttouchphone.phone.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

import com.donttouchphone.phone.R;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b=\u0018\u0000 ´\u00012\u00020\u0001:\u0002´\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR$\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR$\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR(\u0010.\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR$\u00108\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R(\u0010>\u001a\u0004\u0018\u00010/2\b\u0010=\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00103R(\u0010A\u001a\u0004\u0018\u00010/2\b\u0010=\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00103R(\u0010D\u001a\u0004\u0018\u00010/2\b\u0010=\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\bE\u00101\"\u0004\bF\u00103R(\u0010G\u001a\u0004\u0018\u00010/2\b\u0010=\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\bH\u00101\"\u0004\bI\u00103R$\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bL\u0010\b\"\u0004\bM\u0010\nR$\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bP\u0010\b\"\u0004\bQ\u0010\nR$\u0010S\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\bT\u0010\u001f\"\u0004\bU\u0010!R$\u0010W\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010\nR$\u0010[\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010!R$\u0010_\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\b`\u0010\u001f\"\u0004\ba\u0010!R$\u0010b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bc\u0010\b\"\u0004\bd\u0010\nR$\u0010e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bf\u0010\b\"\u0004\bg\u0010\nR$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\bh\u0010\u001f\"\u0004\bi\u0010!R$\u0010k\u001a\u00020\u001c2\u0006\u0010j\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\bl\u0010\u001f\"\u0004\bm\u0010!R$\u0010n\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bn\u0010\b\"\u0004\bo\u0010\nR$\u0010p\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bp\u0010\b\"\u0004\bq\u0010\nR$\u0010r\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\br\u0010\b\"\u0004\bs\u0010\nR$\u0010t\u001a\u00020\u001c2\u0006\u0010t\u001a\u00020\u001c8F@FX\u000e¢\u0006\f\u001a\u0004\bu\u0010\u001f\"\u0004\bv\u0010!R\u001c\u0010w\u001a\n y*\u0004\u0018\u00010x0xX\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R(\u0010|\u001a\u0004\u0018\u00010/2\b\u0010|\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\f\u001a\u0004\b}\u00101\"\u0004\b~\u00103R'\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u001c8F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u001f\"\u0005\b\u0001\u0010!R(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR(\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\b\"\u0005\b\u0001\u0010\nR,\u0010\u0001\u001a\u0004\u0018\u00010/2\t\u0010\u0001\u001a\u0004\u0018\u00010/8F@FX\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u00101\"\u0005\b\u0001\u00103R(\u0010¡\u0001\u001a\u00020\u00062\u0007\u0010 \u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b¢\u0001\u0010\b\"\u0005\b£\u0001\u0010\nR(\u0010¥\u0001\u001a\u00020\u00062\u0007\u0010¤\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010\b\"\u0005\b§\u0001\u0010\nR(\u0010©\u0001\u001a\u00020\u00062\u0007\u0010¨\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\bª\u0001\u0010\b\"\u0005\b«\u0001\u0010\nR(\u0010­\u0001\u001a\u00020\u00062\u0007\u0010¬\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b®\u0001\u0010\b\"\u0005\b¯\u0001\u0010\nR(\u0010±\u0001\u001a\u00020\u00062\u0007\u0010°\u0001\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\u001a\u0005\b²\u0001\u0010\b\"\u0005\b³\u0001\u0010\n¨\u0006µ\u0001"}, d2 = {"Lcom/donttouchphone/antitheftalarm/util/BaseConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alarmOnIntruder", "", "getAlarmOnIntruder", "()Z", "setAlarmOnIntruder", "(Z)V", "antiPocket_flashToggle", "antiPocketFlashEnabled", "getAntiPocketFlashEnabled", "setAntiPocketFlashEnabled", "flashToggle", "antiPocketFlashToggle", "getAntiPocketFlashToggle", "setAntiPocketFlashToggle", "antiPocket_vibrationToggle", "antiPocketVibrationEnabled", "getAntiPocketVibrationEnabled", "setAntiPocketVibrationEnabled", "vibrationToggle", "antiPocketVibrationToggle", "getAntiPocketVibrationToggle", "setAntiPocketVibrationToggle", "dontUnplugVolume", "", "antiPocketVolume", "getAntiPocketVolume", "()I", "setAntiPocketVolume", "(I)V", "antiPocket_VolumeDuration", "antiPocketVolumeDuration", "getAntiPocketVolumeDuration", "setAntiPocketVolumeDuration", "antiPocket_volumeToggle", "antiPocketVolumeEnabled", "getAntiPocketVolumeEnabled", "setAntiPocketVolumeEnabled", "antiPocket_VolumeLevel", "antiPocketVolumeLevel", "getAntiPocketVolumeLevel", "setAntiPocketVolumeLevel", "appLanguage", "", "getAppLanguage", "()Ljava/lang/String;", "setAppLanguage", "(Ljava/lang/String;)V", "value", "appPurchaseDone", "getAppPurchaseDone", "setAppPurchaseDone", "appStarted", "getAppStarted", "setAppStarted", "getContext", "()Landroid/content/Context;", "currentRing", "currentRingtone", "getCurrentRingtone", "setCurrentRingtone", "currentRingtoneAntiPocket", "getCurrentRingtoneAntiPocket", "setCurrentRingtoneAntiPocket", "currentRingtoneUnplug", "getCurrentRingtoneUnplug", "setCurrentRingtoneUnplug", "currentRingtoneWhistle", "getCurrentRingtoneWhistle", "setCurrentRingtoneWhistle", "doNotTouch_flashToggle", "doNotTouchFlashEnabled", "getDoNotTouchFlashEnabled", "setDoNotTouchFlashEnabled", "doNotTouch_vibrationToggle", "doNotTouchVibrationEnabled", "getDoNotTouchVibrationEnabled", "setDoNotTouchVibrationEnabled", "doNotTouch_VolumeDuration", "doNotTouchVolumeDuration", "getDoNotTouchVolumeDuration", "setDoNotTouchVolumeDuration", "doNotTouch_volumeToggle", "doNotTouchVolumeEnabled", "getDoNotTouchVolumeEnabled", "setDoNotTouchVolumeEnabled", "doNotTouch_VolumeLevel", "doNotTouchVolumeLevel", "getDoNotTouchVolumeLevel", "setDoNotTouchVolumeLevel", "dontTouchVolume", "dontTouchSenstivity", "getDontTouchSenstivity", "setDontTouchSenstivity", "dontUnplugFlashToggle", "getDontUnplugFlashToggle", "setDontUnplugFlashToggle", "dontUnplugVibrationToggle", "getDontUnplugVibrationToggle", "setDontUnplugVibrationToggle", "getDontUnplugVolume", "setDontUnplugVolume", "doNotTouch_flashLightTypes", "flashLightTypes", "getFlashLightTypes", "setFlashLightTypes", "isFirstTimeLanguage", "setFirstTimeLanguage", "isLanguageDone", "setLanguageDone", "isPermissionDone", "setPermissionDone", "numberOfPasswords", "getNumberOfPasswords", "setNumberOfPasswords", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "providedEmail", "getProvidedEmail", "setProvidedEmail", "appRunCount", "shouldDelayPermission", "getShouldDelayPermission", "setShouldDelayPermission", "simChangeAlert", "getSimChangeAlert", "setSimChangeAlert", "time", "getTime", "setTime", "unplugCharge_flashToggle", "unplugChargeFlashEnabled", "getUnplugChargeFlashEnabled", "setUnplugChargeFlashEnabled", "unplugCharge_vibrationToggle", "unplugChargeVibrationEnabled", "getUnplugChargeVibrationEnabled", "setUnplugChargeVibrationEnabled", "unplugCharge_VolumeDuration", "unplugChargeVolumeDuration", "getUnplugChargeVolumeDuration", "setUnplugChargeVolumeDuration", "unplugCharge_volumeToggle", "unplugChargeVolumeEnabled", "getUnplugChargeVolumeEnabled", "setUnplugChargeVolumeEnabled", "unplugCharge_VolumeLevel", "unplugChargeVolumeLevel", "getUnplugChargeVolumeLevel", "setUnplugChargeVolumeLevel", "userPassword", "getUserPassword", "setUserPassword", "whistleDetection_flashToggle", "whistleDetectionFlashEnabled", "getWhistleDetectionFlashEnabled", "setWhistleDetectionFlashEnabled", "whistleDetection_vibrationToggle", "whistleDetectionVibrationEnabled", "getWhistleDetectionVibrationEnabled", "setWhistleDetectionVibrationEnabled", "whistleDetection_VolumeDuration", "whistleDetectionVolumeDuration", "getWhistleDetectionVolumeDuration", "setWhistleDetectionVolumeDuration", "whistleDetection_volumeToggle", "whistleDetectionVolumeEnabled", "getWhistleDetectionVolumeEnabled", "setWhistleDetectionVolumeEnabled", "whistleDetection_VolumeLevel", "whistleDetectionVolumeLevel", "getWhistleDetectionVolumeLevel", "setWhistleDetectionVolumeLevel", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: BaseConfig.kt */
public final class BaseConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Context context;
    private final SharedPreferences prefs;

    public BaseConfig(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.prefs = ContextKt.getSharedPrefs(context2);
    }

    public final Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences getPrefs() {
        return this.prefs;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/donttouchphone/antitheftalarm/util/BaseConfig$Companion;", "", "()V", "newInstance", "Lcom/donttouchphone/antitheftalarm/util/BaseConfig;", "context", "Landroid/content/Context;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: BaseConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BaseConfig newInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BaseConfig(context);
        }
    }

    public final boolean getShouldDelayPermission() {
        return this.prefs.getBoolean("should_Delay_Permission", true);
    }

    public final void setShouldDelayPermission(boolean z) {
        this.prefs.edit().putBoolean("should_Delay_Permission", z).apply();
    }

    public final String getAppLanguage() {
        return this.prefs.getString("Language_Name_prefs", "en");
    }

    public final void setAppLanguage(String str) {
        this.prefs.edit().putString("Language_Name_prefs", str).apply();
    }

    public final boolean getAppStarted() {
        return this.prefs.getBoolean("show_onboarding_screens_prefs", false);
    }

    public final void setAppStarted(boolean z) {
        this.prefs.edit().putBoolean("show_onboarding_screens_prefs", z).apply();
    }

    public final boolean isFirstTimeLanguage() {
        return this.prefs.getBoolean("isFirstOpenIAP_key", true);
    }

    public final void setFirstTimeLanguage(boolean z) {
        this.prefs.edit().putBoolean("isFirstOpenIAP_key", z).apply();
    }

    public final boolean isPermissionDone() {
        return this.prefs.getBoolean("iPermissionDone_key", false);
    }

    public final void setPermissionDone(boolean z) {
        this.prefs.edit().putBoolean("iPermissionDone_key", z).apply();
    }

    public final boolean isLanguageDone() {
        return this.prefs.getBoolean("iisLanguageDone_key", false);
    }

    public final void setLanguageDone(boolean z) {
        this.prefs.edit().putBoolean("iisLanguageDone_key", z).apply();
    }

    public final int getNumberOfPasswords() {
        return this.prefs.getInt("NUMBER_OF_WRONG_PASSWORD", 2);
    }

    public final void setNumberOfPasswords(int i) {
        this.prefs.edit().putInt("NUMBER_OF_WRONG_PASSWORD", i).apply();
    }

    public final boolean getAlarmOnIntruder() {
        return this.prefs.getBoolean("PLAY_ALARM_INTRUDER_PREFS", false);
    }

    public final void setAlarmOnIntruder(boolean z) {
        this.prefs.edit().putBoolean("PLAY_ALARM_INTRUDER_PREFS", z).apply();
    }

    public final String getProvidedEmail() {
        return this.prefs.getString("USER_PROVIDED_EMAIL_PREFS", "");
    }

    public final void setProvidedEmail(String str) {
        this.prefs.edit().putString("USER_PROVIDED_EMAIL_PREFS", str).apply();
    }

    public final String getUserPassword() {
        return this.prefs.getString("USER_PROVIDED_PASSWORD_PREFS", "");
    }

    public final void setUserPassword(String str) {
        this.prefs.edit().putString("USER_PROVIDED_PASSWORD_PREFS", str).apply();
    }

    public final int getFlashLightTypes() {
        return this.prefs.getInt("doNotTouch_flashLightTypes", 0);
    }

    public final void setFlashLightTypes(int i) {
        this.prefs.edit().putInt("doNotTouch_flashLightTypes", i).apply();
    }

    public final boolean getDoNotTouchFlashEnabled() {
        return this.prefs.getBoolean("doNotTouch_New_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setDoNotTouchFlashEnabled(boolean z) {
        this.prefs.edit().putBoolean("doNotTouch_New_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getDoNotTouchVibrationEnabled() {
        return this.prefs.getBoolean("doNotTouch_New_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setDoNotTouchVibrationEnabled(boolean z) {
        this.prefs.edit().putBoolean("doNotTouch_New_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getDoNotTouchVolumeEnabled() {
        return this.prefs.getBoolean("doNotTouch_New_TouchVolumeToggle_ALERT_SETTING_PREFS", true);
    }

    public final void setDoNotTouchVolumeEnabled(boolean z) {
        this.prefs.edit().putBoolean("doNotTouch_New_TouchVolumeToggle_ALERT_SETTING_PREFS", z).apply();
    }

    public final int getDoNotTouchVolumeLevel() {
        return this.prefs.getInt("doNotTouch_New_VolumeLevel_SETTING_PREFS", 50);
    }

    public final void setDoNotTouchVolumeLevel(int i) {
        this.prefs.edit().putInt("doNotTouch_New_VolumeLevel_SETTING_PREFS", i).apply();
    }

    public final int getDoNotTouchVolumeDuration() {
        return this.prefs.getInt("doNotTouch_New_VolumeDuration_SETTING_PREFS", 30);
    }

    public final void setDoNotTouchVolumeDuration(int i) {
        this.prefs.edit().putInt("doNotTouch_New_VolumeDuration_SETTING_PREFS", i).apply();
    }

    public final boolean getUnplugChargeFlashEnabled() {
        return this.prefs.getBoolean("unplugCharge_New_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setUnplugChargeFlashEnabled(boolean z) {
        this.prefs.edit().putBoolean("unplugCharge_New_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getUnplugChargeVibrationEnabled() {
        return this.prefs.getBoolean("unplugCharge_New_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setUnplugChargeVibrationEnabled(boolean z) {
        this.prefs.edit().putBoolean("unplugCharge_New_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getUnplugChargeVolumeEnabled() {
        return this.prefs.getBoolean("unplugCharge_New_TouchVolumeToggle_ALERT_SETTING_PREFS", true);
    }

    public final void setUnplugChargeVolumeEnabled(boolean z) {
        this.prefs.edit().putBoolean("unplugCharge_New_TouchVolumeToggle_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getUnplugChargeVolumeLevel() {
        return this.prefs.getBoolean("unplugCharge_New_VolumeLevel_SETTING_PREFS", true);
    }

    public final void setUnplugChargeVolumeLevel(boolean z) {
        this.prefs.edit().putBoolean("unplugCharge_New_VolumeLevel_SETTING_PREFS", z).apply();
    }

    public final boolean getUnplugChargeVolumeDuration() {
        return this.prefs.getBoolean("unplugCharge_New_VolumeDuration_SETTING_PREFS", true);
    }

    public final void setUnplugChargeVolumeDuration(boolean z) {
        this.prefs.edit().putBoolean("unplugCharge_New_VolumeDuration_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketFlashEnabled() {
        return this.prefs.getBoolean("antiPocket_New_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setAntiPocketFlashEnabled(boolean z) {
        this.prefs.edit().putBoolean("antiPocket_New_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketVibrationEnabled() {
        return this.prefs.getBoolean("antiPocket_New_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setAntiPocketVibrationEnabled(boolean z) {
        this.prefs.edit().putBoolean("antiPocket_New_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketVolumeEnabled() {
        return this.prefs.getBoolean("antiPocket_New_TouchVolumeToggle_ALERT_SETTING_PREFS", true);
    }

    public final void setAntiPocketVolumeEnabled(boolean z) {
        this.prefs.edit().putBoolean("antiPocket_New_TouchVolumeToggle_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketVolumeLevel() {
        return this.prefs.getBoolean("antiPocket_New_VolumeLevel_SETTING_PREFS", true);
    }

    public final void setAntiPocketVolumeLevel(boolean z) {
        this.prefs.edit().putBoolean("antiPocket_New_VolumeLevel_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketVolumeDuration() {
        return this.prefs.getBoolean("antiPocket_New_VolumeDuration_SETTING_PREFS", true);
    }

    public final void setAntiPocketVolumeDuration(boolean z) {
        this.prefs.edit().putBoolean("antiPocket_New_VolumeDuration_SETTING_PREFS", z).apply();
    }

    public final boolean getWhistleDetectionFlashEnabled() {
        return this.prefs.getBoolean("whistleDetection_New_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setWhistleDetectionFlashEnabled(boolean z) {
        this.prefs.edit().putBoolean("whistleDetection_New_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getWhistleDetectionVibrationEnabled() {
        return this.prefs.getBoolean("whistleDetection_New_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setWhistleDetectionVibrationEnabled(boolean z) {
        this.prefs.edit().putBoolean("whistleDetection_New_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getWhistleDetectionVolumeEnabled() {
        return this.prefs.getBoolean("whistleDetection_New_TouchVolumeToggle_ALERT_SETTING_PREFS", true);
    }

    public final void setWhistleDetectionVolumeEnabled(boolean z) {
        this.prefs.edit().putBoolean("whistleDetection_New_TouchVolumeToggle_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getWhistleDetectionVolumeLevel() {
        return this.prefs.getBoolean("whistleDetection_New_VolumeLevel_SETTING_PREFS", true);
    }

    public final void setWhistleDetectionVolumeLevel(boolean z) {
        this.prefs.edit().putBoolean("whistleDetection_New_VolumeLevel_SETTING_PREFS", z).apply();
    }

    public final boolean getWhistleDetectionVolumeDuration() {
        return this.prefs.getBoolean("whistleDetection_New_VolumeDuration_SETTING_PREFS", true);
    }

    public final void setWhistleDetectionVolumeDuration(boolean z) {
        this.prefs.edit().putBoolean("whistleDetection_New_VolumeDuration_SETTING_PREFS", z).apply();
    }

    public final int getDontTouchSenstivity() {
        return this.prefs.getInt("dont_Touch_Senstivity_SETTING_PREFS", 50);
    }

    public final void setDontTouchSenstivity(int i) {
        this.prefs.edit().putInt("dont_Touch_Senstivity_SETTING_PREFS", i).apply();
    }

    public final boolean getDontUnplugFlashToggle() {
        return this.prefs.getBoolean("DONT_UNPLUG_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setDontUnplugFlashToggle(boolean z) {
        this.prefs.edit().putBoolean("DONT_UNPLUG_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getDontUnplugVibrationToggle() {
        return this.prefs.getBoolean("DONT_UNPLUG_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setDontUnplugVibrationToggle(boolean z) {
        this.prefs.edit().putBoolean("DONT_UNPLUG_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final int getDontUnplugVolume() {
        return this.prefs.getInt("DONT_UNPLUG_MEDIA_VOLUME_SETTING_PREFS", 0);
    }

    public final void setDontUnplugVolume(int i) {
        this.prefs.edit().putInt("DONT_UNPLUG_MEDIA_VOLUME_SETTING_PREFS", i).apply();
    }

    public final boolean getAntiPocketFlashToggle() {
        return this.prefs.getBoolean("ANTI_POCKET_FLASH_ALERT_SETTING_PREFS", true);
    }

    public final void setAntiPocketFlashToggle(boolean z) {
        this.prefs.edit().putBoolean("ANTI_POCKET_FLASH_ALERT_SETTING_PREFS", z).apply();
    }

    public final boolean getAntiPocketVibrationToggle() {
        return this.prefs.getBoolean("ANTI_POCKET_VIBRATION_ALERT_SETTING_PREFS", true);
    }

    public final void setAntiPocketVibrationToggle(boolean z) {
        this.prefs.edit().putBoolean("ANTI_POCKET_VIBRATION_ALERT_SETTING_PREFS", z).apply();
    }

    public final int getAntiPocketVolume() {
        return this.prefs.getInt("ANTI_POCKET_MEDIA_VOLUME_SETTING_PREFS", 0);
    }

    public final void setAntiPocketVolume(int i) {
        this.prefs.edit().putInt("ANTI_POCKET_MEDIA_VOLUME_SETTING_PREFS", i).apply();
    }

    public final boolean getSimChangeAlert() {
        return this.prefs.getBoolean("SIM_CHANGE_ALERT_PREFS", false);
    }

    public final void setSimChangeAlert(boolean z) {
        this.prefs.edit().putBoolean("SIM_CHANGE_ALERT_PREFS", z).apply();
    }

    public final boolean getAppPurchaseDone() {
        return this.prefs.getBoolean("appPurchaseDone_PREFS", false);
    }

    public final void setAppPurchaseDone(boolean z) {
        this.prefs.edit().putBoolean("appPurchaseDone_PREFS", z).apply();
    }

    public final int getTime() {
        return this.prefs.getInt("time", 0);
    }

    public final void setTime(int i) {
        this.prefs.edit().putInt("time", i).apply();
    }

    public final String getCurrentRingtone() {
        return this.prefs.getString("ringtone_Name", Uri.parse("android.resource://" + this.context.getPackageName() + '/' + R.raw.ringtone).toString());
    }

    public final void setCurrentRingtone(String str) {
        this.prefs.edit().putString("ringtone_Name", str).apply();
    }

    public final String getCurrentRingtoneUnplug() {
        return this.prefs.getString("ringtone_Name_unplug", "");
    }

    public final void setCurrentRingtoneUnplug(String str) {
        this.prefs.edit().putString("ringtone_Name_unplug", str).apply();
    }

    public final String getCurrentRingtoneAntiPocket() {
        return this.prefs.getString("ringtone_Name_antipocket", "");
    }

    public final void setCurrentRingtoneAntiPocket(String str) {
        this.prefs.edit().putString("ringtone_Name_antipocket", str).apply();
    }

    public final String getCurrentRingtoneWhistle() {
        return this.prefs.getString("ringtone_Name_whistle", "");
    }

    public final void setCurrentRingtoneWhistle(String str) {
        this.prefs.edit().putString("ringtone_Name_whistle", str).apply();
    }
}
