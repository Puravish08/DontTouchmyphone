package com.donttouchphone.phone.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityHelpBinding;
import com.donttouchphone.phone.util.ViewKt;

import java.util.Objects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014¨\u0006\n"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/HelpActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityHelpBinding;", "()V", "getViewBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: HelpActivity.kt */
public final class HelpActivity extends BaseClass<ActivityHelpBinding> {
    public ActivityHelpBinding getViewBinding() {
        ActivityHelpBinding inflate = ActivityHelpBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ImageView imageView = Objects.requireNonNull(getBinding()).ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
//        ViewKt.setSafeOnClickListener$default(imageView, 0, new HelpActivity$onCreate$1(this), 1, (Object) null);
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() {
            /* JADX INFO: Access modifiers changed from: package-private */
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                HelpActivity.this.onBackPressed();
            }
        }, 1, null);
    }


    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }
}
