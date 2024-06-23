package com.donttouchphone.phone.ui.adapters;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"languageCodeForApp", "", "getLanguageCodeForApp", "()Ljava/lang/String;", "setLanguageCodeForApp", "(Ljava/lang/String;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: LanguagesAdapter.kt */
public final class LanguagesAdapterKt {
    private static String languageCodeForApp = "en";

    public static final String getLanguageCodeForApp() {
        return languageCodeForApp;
    }

    public static final void setLanguageCodeForApp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        languageCodeForApp = str;
    }
}
