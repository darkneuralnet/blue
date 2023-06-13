package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0014X\u0094D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"LIy3;", "LEs5;", "", "Landroid/hardware/SensorEvent;", "event", "f", "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;", "", "h", "I", C17296a.f69688o, "()I", "delay", "", "i", "[F", "gravityReadings", "j", "magneticReadings", "k", "rotationMatrix", "l", "orientationAngles", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iy3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33704Iy3 extends AbstractC32716Es5<Float> {

    /* renamed from: h */
    public final int f16525h;

    /* renamed from: i */
    public final float[] f16526i;

    /* renamed from: j */
    public final float[] f16527j;

    /* renamed from: k */
    public final float[] f16528k;

    /* renamed from: l */
    public final float[] f16529l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33704Iy3(SensorManager sensorManager) {
        super(sensorManager, r3, r0);
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "sensorManager.getDefault…ensor.TYPE_ACCELEROMETER)");
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
        Intrinsics.checkNotNullExpressionValue(defaultSensor2, "sensorManager.getDefault…nsor.TYPE_MAGNETIC_FIELD)");
        this.f16525h = 1;
        this.f16526i = new float[3];
        this.f16527j = new float[3];
        this.f16528k = new float[9];
        this.f16529l = new float[3];
    }

    @Override // p000.AbstractC32716Es5
    /* renamed from: a */
    public int mo101436a() {
        return this.f16525h;
    }

    @Override // p000.AbstractC32716Es5
    /* renamed from: f */
    public Float transformEvent(SensorEvent sensorEvent) {
        Integer num;
        Sensor sensor;
        if (sensorEvent != null && (sensor = sensorEvent.sensor) != null) {
            num = Integer.valueOf(sensor.getType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            System.arraycopy(sensorEvent.values, 0, this.f16526i, 0, 3);
        } else if (num != null && num.intValue() == 2) {
            System.arraycopy(sensorEvent.values, 0, this.f16527j, 0, 3);
        }
        SensorManager.getRotationMatrix(this.f16528k, null, this.f16526i, this.f16527j);
        SensorManager.getOrientation(this.f16528k, this.f16529l);
        return Float.valueOf((float) Math.toDegrees(this.f16529l[0]));
    }
}
