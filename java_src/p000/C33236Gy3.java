package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LGy3;", "LEs5;", "", "Landroid/hardware/SensorEvent;", "event", "f", "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;", "Ldr4;", "h", "Ldr4;", "locationManager", "", "i", "I", C17296a.f69688o, "()I", "delay", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;Ldr4;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOrientationV1SensorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrientationV1SensorListener.kt\nco/bird/android/manager/sensor/OrientationV1SensorListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* renamed from: Gy3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33236Gy3 extends AbstractC32716Es5<Float> {

    /* renamed from: h */
    public final InterfaceC40001dr4 f12672h;

    /* renamed from: i */
    public final int f12673i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33236Gy3(SensorManager sensorManager, InterfaceC40001dr4 locationManager) {
        super(sensorManager, r2);
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(3);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "sensorManager.getDefault…(Sensor.TYPE_ORIENTATION)");
        this.f12672h = locationManager;
        this.f12673i = 1;
    }

    @Override // p000.AbstractC32716Es5
    /* renamed from: a */
    public int mo101436a() {
        return this.f12673i;
    }

    @Override // p000.AbstractC32716Es5
    /* renamed from: f */
    public Float transformEvent(SensorEvent sensorEvent) {
        float f;
        float[] fArr;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            Float valueOf = Float.valueOf(fArr[0]);
            if (!(!Float.isNaN(valueOf.floatValue()))) {
                valueOf = null;
            }
            if (valueOf != null) {
                f = valueOf.floatValue();
                return Float.valueOf(f - C33470Hy3.m103148a(m108279b(), this.f12672h.mo43616p().m73665a()).getDeclination());
            }
        }
        f = 0.0f;
        return Float.valueOf(f - C33470Hy3.m103148a(m108279b(), this.f12672h.mo43616p().m73665a()).getDeclination());
    }
}
