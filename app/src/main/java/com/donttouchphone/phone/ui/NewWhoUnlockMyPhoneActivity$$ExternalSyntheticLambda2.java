package com.donttouchphone.phone.ui;

import androidx.activity.result.ActivityResultCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda2 implements ActivityResultCallback {
    public final /* synthetic */ NewWhoUnlockMyPhoneActivity f$0;

    public /* synthetic */ NewWhoUnlockMyPhoneActivity$$ExternalSyntheticLambda2(NewWhoUnlockMyPhoneActivity newWhoUnlockMyPhoneActivity) {
        this.f$0 = newWhoUnlockMyPhoneActivity;
    }

    public final void onActivityResult(Object obj) {
        NewWhoUnlockMyPhoneActivity.requestStoragePermissionLauncher$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
    }
}
