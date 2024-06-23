package com.donttouchphone.phone.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityPermissionBinding;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\r"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/PermissionActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityPermissionBinding;", "()V", "getViewBinding", "handleNativeAd", "", "screen", "", "trackingScreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: PermissionActivity.kt */
public final class PermissionActivity extends BaseClass<ActivityPermissionBinding> {
    public ActivityPermissionBinding getViewBinding() {
        ActivityPermissionBinding inflate = ActivityPermissionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = ((ActivityPermissionBinding) getBinding()).btnGrantPermission;
        Intrinsics.checkNotNullExpressionValue(textView, "btnGrantPermission");
//        ViewKt.setSafeOnClickListener$default(textView, 0, new PermissionActivity$onCreate$1(this), 1, (Object) null);

        Intrinsics.checkNotNullExpressionValue(textView, "btnGrantPermission");
        ViewKt.setSafeOnClickListener$default(textView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.PermissionActivity$onCreate$1
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
                if (Build.VERSION.SDK_INT >= 33) {
                    PermissionActivity permissionActivity = PermissionActivity.this;
                    final PermissionActivity permissionActivity2 = PermissionActivity.this;
                    permissionActivity.handlePermission(17, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.PermissionActivity$onCreate$1.1
                        {
//                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                PermissionActivity permissionActivity3 = PermissionActivity.this;
                                final PermissionActivity permissionActivity4 = PermissionActivity.this;
                                permissionActivity3.handlePermission(3, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.PermissionActivity.onCreate.1.1.1
                                    {
//                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z2) {
                                        ContextKt.getBaseConfig(PermissionActivity.this).setPermissionDone(true);
                                        PermissionActivity.this.startActivity(new Intent(PermissionActivity.this, DtmpMainActivity.class));
                                        PermissionActivity.this.finish();
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
                PermissionActivity permissionActivity3 = PermissionActivity.this;
                final PermissionActivity permissionActivity4 = PermissionActivity.this;
                permissionActivity3.handlePermission(3, new Function1<Boolean, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.PermissionActivity$onCreate$1.2
                    {
//                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        if (z) {
                            ContextKt.getBaseConfig(PermissionActivity.this).setPermissionDone(true);
                            PermissionActivity.this.startActivity(new Intent(PermissionActivity.this, DtmpMainActivity.class));
                            PermissionActivity.this.finish();
                        }
                    }
                });
            }
        }, 1, null);





    }

}
