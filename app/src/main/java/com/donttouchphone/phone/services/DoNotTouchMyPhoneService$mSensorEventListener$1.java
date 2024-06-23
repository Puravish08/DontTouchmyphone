package com.donttouchphone.phone.services;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import com.donttouchphone.phone.util.ContextKt;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/donttouchphone/phone/services/DoNotTouchMyPhoneService$mSensorEventListener$1", "Landroid/hardware/SensorEventListener;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: DoNotTouchMyPhoneService.kt */
public final class DoNotTouchMyPhoneService$mSensorEventListener$1 implements SensorEventListener {
    final /* synthetic */ DoNotTouchMyPhoneService this$0;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    DoNotTouchMyPhoneService$mSensorEventListener$1(DoNotTouchMyPhoneService doNotTouchMyPhoneService) {
        this.this$0 = doNotTouchMyPhoneService;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            DoNotTouchMyPhoneService doNotTouchMyPhoneService = this.this$0;
            doNotTouchMyPhoneService.mCurrentX = sensorEvent.values[0];
            doNotTouchMyPhoneService.mCurrentY = sensorEvent.values[1];
            doNotTouchMyPhoneService.mCurrentZ = sensorEvent.values[2];
            doNotTouchMyPhoneService.mAccelCurrent = Math.sqrt((double) ((doNotTouchMyPhoneService.mCurrentX * doNotTouchMyPhoneService.mCurrentX) + (doNotTouchMyPhoneService.mCurrentY * doNotTouchMyPhoneService.mCurrentY) + (doNotTouchMyPhoneService.mCurrentZ * doNotTouchMyPhoneService.mCurrentZ)));
            doNotTouchMyPhoneService.changeInAcceleration = Math.abs(doNotTouchMyPhoneService.mAccelCurrent - doNotTouchMyPhoneService.mAccelLast);
            doNotTouchMyPhoneService.mAccelLast = doNotTouchMyPhoneService.mAccelCurrent;
            int dontTouchSenstivity = ContextKt.getBaseConfig(doNotTouchMyPhoneService).getDontTouchSenstivity() / 10;
            if (doNotTouchMyPhoneService.changeInAcceleration <= 14.0d && doNotTouchMyPhoneService.changeInAcceleration <= 5.0d) {
                double unused = doNotTouchMyPhoneService.changeInAcceleration;
            }
        }
        if (this.this$0.itIsNotFirstTime) {
            this.this$0.checkMobileShaked();
        }
        DoNotTouchMyPhoneService doNotTouchMyPhoneService2 = this.this$0;
        doNotTouchMyPhoneService2.mLastX = doNotTouchMyPhoneService2.mCurrentX;
        DoNotTouchMyPhoneService doNotTouchMyPhoneService3 = this.this$0;
        doNotTouchMyPhoneService3.mLastY = doNotTouchMyPhoneService3.mCurrentY;
        DoNotTouchMyPhoneService doNotTouchMyPhoneService4 = this.this$0;
        doNotTouchMyPhoneService4.mLastZ = doNotTouchMyPhoneService4.mCurrentZ;
        this.this$0.itIsNotFirstTime = true;
    }
}
