package com.donttouchphone.phone.ui.dilogs;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AlertDialog;

import com.donttouchphone.phone.R;;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/dilogs/RequestDeviceAdminPermissionDialog;", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function0;", "", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Landroid/app/Activity;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/DeviceAdminPermissionDialogLayoutBinding;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: RequestDeviceAdminPermissionDialog.kt */
public final class RequestDeviceAdminPermissionDialog {
    private final Activity activity;
    private final Function0<Unit> callback;
    /* access modifiers changed from: private */
    public AlertDialog dialog;

    public RequestDeviceAdminPermissionDialog(Activity activity2, Function0<Unit> function0) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(activity2, "activity");
        Intrinsics.checkNotNullParameter(function0, "callback");
        this.activity = activity2;
        this.callback = function0;
        AlertDialog create = new AlertDialog.Builder(activity2, R.style.Theme_Dialog_90).setCancelable(false).create();
        this.dialog = create;
        if (create != null) {
            create.setCanceledOnTouchOutside(false);
        }
        AlertDialog alertDialog = this.dialog;
        if (!(alertDialog == null || (window2 = alertDialog.getWindow()) == null)) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.dialog;
        if (!(alertDialog2 == null || (window = alertDialog2.getWindow()) == null)) {
            window.setLayout(-2, -2);
        }
        AlertDialog alertDialog3 = this.dialog;
        if (alertDialog3 != null) {
            alertDialog3.show();
        }
//        TextView textView = inflate.yesId;
//        Intrinsics.checkNotNullExpressionValue(textView, "yesId");
        ViewKt.setSafeOnClickListener$default(null, 0, new Function1<View, Unit>() {
            RequestDeviceAdminPermissionDialog this$0;

            {
//                this.this$0 = r1;
            }


            public final Unit invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                if (ContextKt.getBaseConfig(this.this$0.getActivity()).getShouldDelayPermission()) {
                    Log.d("chkhamza", ": if");
                    ContextKt.getBaseConfig(this.this$0.getActivity()).setShouldDelayPermission(false);
                    AlertDialog access$getDialog$p = this.this$0.dialog;
                    if (access$getDialog$p != null) {
                        access$getDialog$p.dismiss();
                    }
                    this.this$0.getCallback().invoke();
                    return null;
                }
                Log.d("chkhamza", ": else");
                AlertDialog access$getDialog$p2 = this.this$0.dialog;
                if (access$getDialog$p2 != null) {
                    access$getDialog$p2.dismiss();
                }
                this.this$0.getCallback().invoke();
                return null;
            }
        }, 1, (Object) null);
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Function0<Unit> getCallback() {
        return this.callback;
    }
}
