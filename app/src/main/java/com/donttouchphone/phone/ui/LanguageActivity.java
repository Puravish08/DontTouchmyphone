package com.donttouchphone.phone.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.os.BuildCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityLanguageBinding;
import com.donttouchphone.phone.ui.adapters.LanguagesAdapter;
import com.donttouchphone.phone.ui.adapters.LanguagesAdapterKt;
import com.donttouchphone.phone.ui.intro.OnBoardingActivity;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.EtensionKt;
import com.donttouchphone.phone.util.UtilsLanguageKt;
import com.donttouchphone.phone.util.ViewKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u00020\f2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/LanguageActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityLanguageBinding;", "()V", "adapterLanguage", "Lcom/donttouchphone/antitheftalarm/ui/adapters/LanguagesAdapter;", "getSystemLanguage", "Ljava/util/Locale;", "context", "Landroid/content/Context;", "getViewBinding", "handleClick", "", "handleNativeAd", "next", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setLocale", "language", "", "startIntent", "cls", "Ljava/lang/Class;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: LanguageActivity.kt */
public final class LanguageActivity extends BaseClass<ActivityLanguageBinding> {
    private LanguagesAdapter adapterLanguage;

    public ActivityLanguageBinding getViewBinding() {
        ActivityLanguageBinding inflate = ActivityLanguageBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = this;
        LanguagesAdapterKt.setLanguageCodeForApp(String.valueOf(ContextKt.getBaseConfig(context).getAppLanguage()));
        Activity activity = this;
        this.adapterLanguage = new LanguagesAdapter(activity);
        getBinding().rvLanguage.setLayoutManager(new GridLayoutManager(context, 2));
        getBinding().rvLanguage.setAdapter(this.adapterLanguage);
        LanguagesAdapter languagesAdapter = this.adapterLanguage;
        if (languagesAdapter != null) {
            languagesAdapter.setItems(EtensionKt.getLanguagesListSimpleFlags(activity));
        }
        handleClick();
        getSystemLanguage(context);
    }

    public void handleClick() {
        ImageView imageView = getBinding().ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivBack");
//        ViewKt.setSafeOnClickListener$default(imageView, 0, new LanguageActivity$handleClick$1(this), 1, (Object) null);
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.LanguageActivity$handleClick$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public  Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LanguageActivity.this.onBackPressed();
            }
        }, 1, null);

        TextView textView = getBinding().tickimg;
        Intrinsics.checkNotNullExpressionValue(textView, "tickimg");

        textView.setOnClickListener(view -> {
            String languageCodeForApp = LanguagesAdapterKt.getLanguageCodeForApp();
            if (languageCodeForApp == null || languageCodeForApp.isEmpty()) {
                Toast.makeText(LanguageActivity.this.getApplicationContext(), "Please Select Language", Toast.LENGTH_SHORT).show();
                return;
            }
            ContextKt.getBaseConfig(LanguageActivity.this).setAppLanguage(languageCodeForApp);
            LanguageActivity.this.setLocale(languageCodeForApp);
            LanguageActivity.this.next();
        });




        if (BuildCompat.isAtLeastT()) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new LanguageActivity$$ExternalSyntheticLambda0(this));
        } else {
            getOnBackPressedDispatcher().addCallback(this, new LanguageActivity$handleClick$4(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void handleClick$lambda$0(LanguageActivity languageActivity) {
        Intrinsics.checkNotNullParameter(languageActivity, "this$0");
        languageActivity.finish();
    }

    public final void next() {
        UtilsLanguageKt.changeLanguage(this, String.valueOf(ContextKt.getBaseConfig(this).getAppLanguage()));
        UtilsLanguageKt.refreshLanguageStrings();
        onBackPressed();
    }


    public final void setLocale(String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor edit = getSharedPreferences("Settings", 0).edit();
        Intrinsics.checkNotNullExpressionValue(edit, "edit(...)");
        edit.putString("app_lang", str);
        edit.apply();
    }

    private final Locale getSystemLanguage(Context context) {
        @SuppressLint({"NewApi", "LocalSuppress"}) Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNull(locale);
        return locale;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Class cls;
        if (getIntent().getBooleanExtra("comeFromSetting", false)) {
            startActivity(new Intent(this, DtmpMainActivity.class));
            finish();
            return;
        }
        Context context = this;
        ContextKt.getBaseConfig(context).setLanguageDone(true);
        if (!ContextKt.getBaseConfig(context).getAppStarted()) {
            cls = OnBoardingActivity.class;
        } else {
            cls = !ContextKt.getBaseConfig(context).isPermissionDone() ? PermissionActivity.class : DtmpMainActivity.class;
        }
        startIntent(cls);
    }

    private final void startIntent(Class<?> cls) {
        startActivity(new Intent(this, cls).putExtra("isFromSplash", true));
        finish();
    }

}
