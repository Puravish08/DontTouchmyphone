package com.donttouchphone.phone.util;

import android.os.FileObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/util/DirectoryObserver;", "Landroid/os/FileObserver;", "dirPath", "", "onFileChanged", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onEvent", "event", "", "path", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: DirectoryObserver.kt */
public final class DirectoryObserver extends FileObserver {
    private final String dirPath;
    private final Function0<Unit> onFileChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryObserver(String str, Function0<Unit> function0) {
        super(str, 768);
        Intrinsics.checkNotNullParameter(str, "dirPath");
        Intrinsics.checkNotNullParameter(function0, "onFileChanged");
        this.dirPath = str;
        this.onFileChanged = function0;
    }

    public void onEvent(int i, String str) {
        if (i == 256 || i == 512) {
            this.onFileChanged.invoke();
        }
    }
}
