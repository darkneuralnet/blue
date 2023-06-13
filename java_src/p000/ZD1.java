package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import co.bird.android.model.GravityVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\n"}, m28432d2 = {"LZD1;", "LEs5;", "Lco/bird/android/model/GravityVector;", "Landroid/hardware/SensorEvent;", "event", "f", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZD1 */
/* loaded from: classes4.dex */
public final class ZD1 extends AbstractC32716Es5<GravityVector> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZD1(SensorManager sensorManager) {
        super(sensorManager, r1);
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "sensorManager.getDefault…nsor(Sensor.TYPE_GRAVITY)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        r3 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r3, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        r6 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r6, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
        r2 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r2, 0);
     */
    @Override // p000.AbstractC32716Es5
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GravityVector transformEvent(SensorEvent sensorEvent) {
        float f;
        float f2;
        Float orNull;
        Float orNull2;
        Float orNull3;
        float f3 = 0.0f;
        if (sensorEvent != null && (r2 = sensorEvent.values) != null && orNull3 != null) {
            f = orNull3.floatValue();
        } else {
            f = 0.0f;
        }
        if (sensorEvent != null && (r3 = sensorEvent.values) != null && orNull2 != null) {
            f2 = orNull2.floatValue();
        } else {
            f2 = 0.0f;
        }
        if (sensorEvent != null && (r6 = sensorEvent.values) != null && orNull != null) {
            f3 = orNull.floatValue();
        }
        return new GravityVector(f, f2, f3);
    }
}
