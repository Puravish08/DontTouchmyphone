package com.donttouchphone.phone.helper;

import androidx.annotation.NonNull;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.donttouchphone.phone.helper.CameraManager$initCamera$1", f = "CameraManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: CameraManager.kt */
public final class CameraManager$initCamera$1  implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final  CameraManager this$0;

    public CameraManager$initCamera$1(CameraManager cameraManager, Continuation<? super CameraManager$initCamera$1> continuation) {
        super();
        this.this$0 = cameraManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
//        return new CameraManager$initCamera$1(this.this$0, obj , continuation);
        return new Continuation<Unit>() {
            @NonNull
            @Override
            public CoroutineContext getContext() {
                return null;
            }

            @Override
            public void resumeWith(@NonNull Object o) {

            }
        };
    }

    @Override
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ( create(coroutineScope, continuation)).toString();
//        return ((CameraManager$initCamera$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }


}