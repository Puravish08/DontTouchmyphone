package com.donttouchphone.phone.ui.dilogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.DialogPermissionDrawoverlayBinding;
import com.donttouchphone.phone.util.EtensionKt;
import com.donttouchphone.phone.util.ViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/dilogs/DrawOverlayPermissionDialog;", "", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/DialogPermissionDrawoverlayBinding;", "dialog", "Landroid/app/Dialog;", "showDialog", "", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: DrawOverlayPermissionDialog.kt */
public final class DrawOverlayPermissionDialog {
    private final DialogPermissionDrawoverlayBinding binding;
    /* access modifiers changed from: private */
    public final Dialog dialog;

    public DrawOverlayPermissionDialog(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "context");
        Context context = activity;
        Dialog dialog2 = new Dialog(context, R.style.UploadDialog);
        this.dialog = dialog2;
        DialogPermissionDrawoverlayBinding inflate = DialogPermissionDrawoverlayBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        dialog2.setContentView(inflate.getRoot());
        Window window = dialog2.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        TextView textView = inflate.textView48;
        Intrinsics.checkNotNullExpressionValue(textView, "textView48");
        TextView textView2 = inflate.textView42;
        Intrinsics.checkNotNullExpressionValue(textView2, "textView42");
        ViewKt.setSafeOnClickListener$default(textView, 0, new Function1<View, Unit>() {


            public final Unit invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                if (!EtensionKt.canDrawOverlay(activity)) {
                    EtensionKt.checkOverlayPermission(activity);
                }
                dialog.dismiss();
                return null;
            }
        }, 1, (Object) null);
        ViewKt.setSafeOnClickListener$default(textView2, 0, new Function1<View, Unit>() {
             DrawOverlayPermissionDialog this$0;

            {
//                this.this$0 = r1;
            }



            public final Unit invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.dialog.dismiss();
                return null;
            }
        }, 1, (Object) null);
    }

    public final void showDialog() {
        this.dialog.show();
    }
}
