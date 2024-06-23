package com.donttouchphone.phone.ui.dilogs;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.donttouchphone.phone.databinding.DialogEditEmailBinding;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/dilogs/EditEmailDialog;", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "", "", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Landroid/app/Activity;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/DialogEditEmailBinding;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: EditEmailDialog.kt */
public final class EditEmailDialog {
    private final Activity activity;
    /* access modifiers changed from: private */
    public final DialogEditEmailBinding binding;
    private final Function1<Boolean, Unit> callback;
    /* access modifiers changed from: private */
    public AlertDialog dialog;

    public EditEmailDialog(Activity activity2, Function1<? super Boolean, Unit> function1) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(activity2, "activity");
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.activity = activity2;
        this.callback = (Function1<Boolean, Unit>) function1;
        DialogEditEmailBinding inflate = DialogEditEmailBinding.inflate(LayoutInflater.from(activity2), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AlertDialog create = new AlertDialog.Builder(activity2).setView((View) inflate.getRoot()).setCancelable(true).create();
        this.dialog = create;
        if (!(create == null || (window2 = create.getWindow()) == null)) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog = this.dialog;
        if (!(alertDialog == null || (window = alertDialog.getWindow()) == null)) {
            window.setLayout(-2, -2);
        }
        AlertDialog alertDialog2 = this.dialog;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
        CardView cardView = inflate.cvYes;
        Intrinsics.checkNotNullExpressionValue(cardView, "cvYes");
        ViewKt.setSafeOnClickListener$default(cardView, 0, new Function1<View, Unit>() {
            EditEmailDialog this$0;

            {
//                this.this$0 = r1;
            }


            public final Unit invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                String obj = StringsKt.trim((CharSequence) this.this$0.binding.edtEmailAddress.getText().toString()).toString();
                CharSequence charSequence = obj;
                if (charSequence.length() > 0 && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches()) {
                    ContextKt.getBaseConfig(this.this$0.getActivity()).setProvidedEmail(obj);
                    AlertDialog access$getDialog$p = this.this$0.dialog;
                    if (access$getDialog$p != null) {
                        access$getDialog$p.dismiss();
                    }
                    this.this$0.getCallback().invoke(true);
                }
                return null;
            }
        }, 1, (Object) null);
        ConstraintLayout constraintLayout = inflate.cvNo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "cvNo");
        ViewKt.setSafeOnClickListener$default(constraintLayout, 0, new Function1<View, Unit>() {
           EditEmailDialog this$0;

            {
//                this.this$0 = r1;
            }



            public final Unit invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                AlertDialog access$getDialog$p = this.this$0.dialog;
                if (access$getDialog$p != null) {
                    access$getDialog$p.dismiss();
                }
                this.this$0.getCallback().invoke(false);
                return null;
            }
        }, 1, (Object) null);
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Function1<Boolean, Unit> getCallback() {
        return this.callback;
    }
}
