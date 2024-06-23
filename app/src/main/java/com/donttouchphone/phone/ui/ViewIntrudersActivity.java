package com.donttouchphone.phone.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.BaseClass;
import com.donttouchphone.phone.databinding.ActivityViewIntrudersBinding;
import com.donttouchphone.phone.ui.adapters.ViewIntrudersAdapter;
import com.donttouchphone.phone.util.ConstantsKt;
import com.donttouchphone.phone.util.DirectoryObserver;
import com.donttouchphone.phone.util.ViewKt;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J,\u0010\f\u001a\u00020\r2\"\u0010\u000e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\u00020\r2\"\u0010\u000e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\rH\u0014J\b\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/ViewIntrudersActivity;", "Lcom/donttouchphone/antitheftalarm/BaseClass;", "Lcom/donttouchphone/antitheftalarm/databinding/ActivityViewIntrudersBinding;", "()V", "adapterIntruder", "Lcom/donttouchphone/antitheftalarm/ui/adapters/ViewIntrudersAdapter;", "directoryObserver", "Lcom/donttouchphone/antitheftalarm/util/DirectoryObserver;", "listdata", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fetchImages", "", "callback", "Lkotlin/Function1;", "getDir", "Ljava/io/File;", "getImages", "getViewBinding", "handleBannerAD", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "refreshData", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ViewIntrudersActivity.kt */
public final class ViewIntrudersActivity extends BaseClass<ActivityViewIntrudersBinding> {
    /* access modifiers changed from: private */
    public ViewIntrudersAdapter adapterIntruder;
    private DirectoryObserver directoryObserver;
    /* access modifiers changed from: private */
    public ArrayList<String> listdata = new ArrayList<>();

    public ActivityViewIntrudersBinding getViewBinding() {
        ActivityViewIntrudersBinding inflate = ActivityViewIntrudersBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adapterIntruder = new ViewIntrudersAdapter(this);
        initViews();
        ImageView imageView = Objects.requireNonNull(getBinding()).imvBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "imvBack");
        ViewKt.setSafeOnClickListener$default(imageView, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.ViewIntrudersActivity$onCreate$1
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
                ViewIntrudersActivity.this.finish();
            }
        }, 1, null);
    }

    private final void initViews() {
        Objects.requireNonNull(getBinding()).recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = ((ActivityViewIntrudersBinding) getBinding()).recyclerView;
        ViewIntrudersAdapter viewIntrudersAdapter = this.adapterIntruder;
        if (viewIntrudersAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterIntruder");
            viewIntrudersAdapter = null;
        }
        recyclerView.setAdapter(viewIntrudersAdapter);
    }

    private final void refreshData() {
        getImages(new Function1<ArrayList<String>, Unit>() {
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<String> arrayList) {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<String> it) {
                ViewIntrudersAdapter viewIntrudersAdapter;
                Intrinsics.checkNotNullParameter(it, "it");
                viewIntrudersAdapter = ViewIntrudersActivity.this.adapterIntruder;
                if (viewIntrudersAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterIntruder");
                    viewIntrudersAdapter = null;
                }
                viewIntrudersAdapter.setData(it, ViewIntrudersActivity.this);
            }
        });
    }

    private final void getImages(Function1<? super ArrayList<String>, Unit> function1) {
        File dir = getDir();
        dir.mkdirs();
        String absolutePath = dir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
//        DirectoryObserver directoryObserver = new DirectoryObserver(absolutePath, new Functions<Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.ViewIntrudersActivity$getImages$1
//            /* JADX INFO: Access modifiers changed from: package-private */
//            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//            /* JADX WARN: Multi-variable type inference failed */
//            {
////                super(0);
//            }
//
//            public /* bridge */ /* synthetic */ Unit invoke() {
//                invoke2();
//                return Unit.INSTANCE;
//            }
//
//            /* renamed from: invoke  reason: avoid collision after fix types in other method */
//            public final void invoke2() {
//                ViewIntrudersActivity.this.fetchImages(function1);
//            }
//        });
        this.directoryObserver = directoryObserver;
        directoryObserver.startWatching();
        fetchImages(function1);
    }

    /* access modifiers changed from: private */
    public final void fetchImages(Function1<? super ArrayList<String>, Unit> function1) {
//        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new ViewIntrudersActivity$fetchImages$1(this, function1, (Continuation<? super ViewIntrudersActivity$fetchImages$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final File getDir() {
        return new File(getApplicationContext().getFilesDir(), ConstantsKt.INTRUDERS_IMAGES_LOCATION_ADDRESS);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        BaseClass.hideNavigationBar$default(this, false, 1, (Object) null);
        refreshData();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        DirectoryObserver directoryObserver2 = this.directoryObserver;
        if (directoryObserver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("directoryObserver");
            directoryObserver2 = null;
        }
        directoryObserver2.stopWatching();
    }

}
