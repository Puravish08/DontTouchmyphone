package com.donttouchphone.phone.ui;

import android.os.Build;
import android.window.OnBackInvokedCallback;

import androidx.annotation.RequiresApi;

/* compiled from: D8$$SyntheticClass */
@RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
public final /* synthetic */ class LanguageActivity$$ExternalSyntheticLambda0 implements OnBackInvokedCallback {
    public final /* synthetic */ LanguageActivity f$0;

    public /* synthetic */ LanguageActivity$$ExternalSyntheticLambda0(LanguageActivity languageActivity) {
        this.f$0 = languageActivity;
    }

    public final void onBackInvoked() {
        LanguageActivity.handleClick$lambda$0(this.f$0);
    }
}
