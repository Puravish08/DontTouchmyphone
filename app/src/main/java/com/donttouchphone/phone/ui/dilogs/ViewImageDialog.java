package com.donttouchphone.phone.ui.dilogs;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.appcompat.app.AlertDialog;

import com.bumptech.glide.Glide;
import com.donttouchphone.phone.databinding.ViewUserImageDialogBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/dilogs/ViewImageDialog;", "", "activity", "Landroid/app/Activity;", "imageUrl", "", "callback", "Lkotlin/Function0;", "", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Landroid/app/Activity;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/ViewUserImageDialogBinding;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getImageUrl", "()Ljava/lang/String;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ViewImageDialog.kt */
public final class ViewImageDialog {
    private final Activity activity;
    private final ViewUserImageDialogBinding binding;
    private final Function0<Unit> callback;
    private AlertDialog dialog;
    private final String imageUrl;

    public ViewImageDialog(Activity activity2, String str, Function0<Unit> function0) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(function0, "callback");
        this.activity = activity2;
        this.imageUrl = str;
        this.callback = function0;
        ViewUserImageDialogBinding inflate = ViewUserImageDialogBinding.inflate(LayoutInflater.from(activity2), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        if (activity2 != null) {
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                Glide.with(activity2).load(str).into(inflate.userImage);
            }
            AlertDialog create = new AlertDialog.Builder(activity2).setView((View) inflate.getRoot()).setCancelable(true).create();
            this.dialog = create;
            if (create != null) {
                create.setCanceledOnTouchOutside(true);
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
        }
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Function0<Unit> getCallback() {
        return this.callback;
    }
}
