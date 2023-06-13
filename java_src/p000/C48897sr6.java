package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
/* renamed from: sr6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48897sr6 implements SensorEventListener {

    /* renamed from: b */
    public InterfaceC28416a f109427b;

    /* renamed from: sr6$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC28416a {
        /* renamed from: a */
        void mo13568a();
    }

    /* renamed from: a */
    public void m13569a(InterfaceC28416a interfaceC28416a) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f109427b = interfaceC28416a;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        TD0.m84203d(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f109427b != null) {
                float[] fArr = sensorEvent.values;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                    this.f109427b.mo13568a();
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
