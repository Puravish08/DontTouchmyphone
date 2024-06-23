package com.donttouchphone.phone.util;

import android.view.View;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ViewKt$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ Ref.LongRef f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ViewKt$$ExternalSyntheticLambda2(Ref.LongRef longRef, int i, Function1 function1) {
        this.f$0 = longRef;
        this.f$1 = i;
        this.f$2 = function1;
    }

    public final void onClick(View view) {
        ViewKt.setSafeOnClickListener$lambda$3(this.f$0, this.f$1, this.f$2, view);
    }
}
