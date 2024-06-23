package com.donttouchphone.phone.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.donttouchphone.phone.databinding.DialogExitFullLoadingBinding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/ExitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/DialogExitFullLoadingBinding;", "getBinding", "()Lcom/donttouchphone/antitheftalarm/databinding/DialogExitFullLoadingBinding;", "setBinding", "(Lcom/donttouchphone/antitheftalarm/databinding/DialogExitFullLoadingBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ExitActivity.kt */
public final class ExitActivity extends AppCompatActivity {
    public DialogExitFullLoadingBinding binding;

    public final DialogExitFullLoadingBinding getBinding() {
        DialogExitFullLoadingBinding dialogExitFullLoadingBinding = this.binding;
        if (dialogExitFullLoadingBinding != null) {
            return dialogExitFullLoadingBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(DialogExitFullLoadingBinding dialogExitFullLoadingBinding) {
        Intrinsics.checkNotNullParameter(dialogExitFullLoadingBinding, "<set-?>");
        this.binding = dialogExitFullLoadingBinding;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogExitFullLoadingBinding inflate = DialogExitFullLoadingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setBinding(inflate);
        setContentView((View) getBinding().getRoot());
        new Handler().postDelayed(new ExitActivity$$ExternalSyntheticLambda0(this), 1000);
    }

    /* access modifiers changed from: private */
    public static final void onCreate$lambda$0(ExitActivity exitActivity) {
        Intrinsics.checkNotNullParameter(exitActivity, "this$0");
        exitActivity.finishAffinity();
    }
}
