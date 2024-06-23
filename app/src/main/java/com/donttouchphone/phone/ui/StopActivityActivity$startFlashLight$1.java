package com.donttouchphone.phone.ui;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/donttouchphone/phone/ui/StopActivityActivity$startFlashLight$1", "Ljava/lang/Runnable;", "run", "", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: StopActivityActivity.kt */
public final class StopActivityActivity$startFlashLight$1 implements Runnable {
    final /* synthetic */ long $counter;
    final /* synthetic */ StopActivityActivity this$0;

    StopActivityActivity$startFlashLight$1(StopActivityActivity stopActivityActivity, long j) {
        this.this$0 = stopActivityActivity;
        this.$counter = j;
    }

    public void run() {
        if (this.this$0.getFlashLightOn()) {
            this.this$0.closeFlashLight();
        } else {
            this.this$0.openFlashLight();
        }
        StopActivityActivity stopActivityActivity = this.this$0;
        stopActivityActivity.setFlashLightOn(!stopActivityActivity.getFlashLightOn());
        this.this$0.handler.postDelayed(this, this.$counter);
    }
}
