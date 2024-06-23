package com.donttouchphone.phone.ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.cardview.widget.CardView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ActivityIntruderAlarmBinding;
import com.donttouchphone.phone.util.ContextKt;
import com.donttouchphone.phone.util.ViewKt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/IntruderAlarmActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityIntruderAlarmBinding;", "()V", "edtPassword", "Landroid/widget/EditText;", "getEdtPassword", "()Landroid/widget/EditText;", "setEdtPassword", "(Landroid/widget/EditText;)V", "mp", "Landroid/media/MediaPlayer;", "stopBtn", "Landroidx/cardview/widget/CardView;", "getStopBtn", "()Landroidx/cardview/widget/CardView;", "setStopBtn", "(Landroidx/cardview/widget/CardView;)V", "getViewBinding", "handleClicks", "", "initUIView", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: IntruderAlarmActivity.kt */
public final class IntruderAlarmActivity extends BaseClass<ActivityIntruderAlarmBinding> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int type;
    private EditText edtPassword;
    /* access modifiers changed from: private */
    public MediaPlayer mp;
    private CardView stopBtn;

    public ActivityIntruderAlarmBinding getViewBinding() {
        ActivityIntruderAlarmBinding inflate = ActivityIntruderAlarmBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final CardView getStopBtn() {
        return this.stopBtn;
    }

    public final void setStopBtn(CardView cardView) {
        this.stopBtn = cardView;
    }

    public final EditText getEdtPassword() {
        return this.edtPassword;
    }

    public final void setEdtPassword(EditText editText) {
        this.edtPassword = editText;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/IntruderAlarmActivity$Companion;", "", "()V", "type", "", "getType", "()I", "setType", "(I)V", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: IntruderAlarmActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getType() {
            return IntruderAlarmActivity.type;
        }

        public final void setType(int i) {
            IntruderAlarmActivity.type = i;
        }

        public final Intent getStartIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Log.d("AfterCallDetailActivity", "AfterCallDetailActivity getStartIntent: ");
            Intent intent = new Intent(context, IntruderAlarmActivity.class);
            intent.setFlags(272760832);
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            Object systemService = getSystemService(Context.KEYGUARD_SERVICE);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            ((KeyguardManager) systemService).requestDismissKeyguard(this, (KeyguardManager.KeyguardDismissCallback) null);
        } else {
            getWindow().addFlags(6815872);
        }
        try {
            getResources().getIdentifier("ringtone", "raw", getPackageName());
            if (type == 3) {
                this.mp = MediaPlayer.create(getBaseContext(), R.raw.ringtone);
            } else {
                this.mp = MediaPlayer.create(getBaseContext(), R.raw.ringtone);
            }
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setLooping(true);
            }
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
            Object systemService2 = getBaseContext().getSystemService(Context.AUDIO_SERVICE);
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService2;
            audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        initUIView();
        handleClicks();
    }

    private final void initUIView() {
        this.stopBtn = (CardView) findViewById(R.id.stopBtn);
        this.edtPassword = (EditText) findViewById(R.id.edt_password);
    }

    private final void handleClicks() {
        CardView cardView = this.stopBtn;
        if (cardView != null) {
            ViewKt.setSafeOnClickListener$default(cardView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.IntruderAlarmActivity$handleClicks$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
//                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    String str;
                    MediaPlayer mediaPlayer;
                    MediaPlayer mediaPlayer2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    EditText edtPassword = IntruderAlarmActivity.this.getEdtPassword();
                    if (edtPassword == null) {
                        str = "";
                    } else {
                        str = StringsKt.trim((CharSequence) edtPassword.getText().toString()).toString();
                    }
                    if (Intrinsics.areEqual(str, ContextKt.getBaseConfig(IntruderAlarmActivity.this).getUserPassword())) {
                        mediaPlayer = IntruderAlarmActivity.this.mp;
                        if (mediaPlayer != null) {
                            mediaPlayer.stop();
                        }
                        mediaPlayer2 = IntruderAlarmActivity.this.mp;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                        }
                        IntruderAlarmActivity.this.finish();
                    }
                }
            }, 1, null);
        }
    }


    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
    }
}
