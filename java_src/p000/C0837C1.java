package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"LC1;", "LEs5;", "", "Landroid/hardware/SensorEvent;", "event", "f", "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C1 */
/* loaded from: classes4.dex */
public final class C0837C1 extends AbstractC32716Es5<Float> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0837C1(SensorManager sensorManager) {
        super(sensorManager, r0);
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "sensorManager.getDefault…ensor.TYPE_ACCELEROMETER)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
        r2 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r2, 0);
     */
    @Override // p000.AbstractC32716Es5
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Float transformEvent(SensorEvent sensorEvent) {
        Float orNull;
        float floatValue = (sensorEvent == null || (r2 = sensorEvent.values) == null || orNull == null) ? 0.0f : orNull.floatValue();
        return Float.valueOf(floatValue);
    }
}
