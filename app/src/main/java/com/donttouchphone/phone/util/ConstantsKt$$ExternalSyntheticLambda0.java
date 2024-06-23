package com.donttouchphone.phone.util;

import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ConstantsKt$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ ConstantsKt$$ExternalSyntheticLambda0(Function0 function0) {
        this.f$0 = function0;
    }

    public final void run() {
        ConstantsKt.ensureBackgroundThread$lambda$0(this.f$0);
    }
}
