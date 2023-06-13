package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0014\"\u00020\n¢\u0006\u0004\b0\u00101J\u0019\u0010\u0005\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0017J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0013\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\f8\u0014X\u0094D¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b\u0015\u0010'R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\u001b\u0010.¨\u00062"}, m28432d2 = {"LEs5;", "T", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "transformEvent", "(Landroid/hardware/SensorEvent;)Ljava/lang/Object;", "", "e", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "Landroid/hardware/SensorManager;", "b", "Landroid/hardware/SensorManager;", "()Landroid/hardware/SensorManager;", "sensorManager", "", "c", "[Landroid/hardware/Sensor;", "getSensors", "()[Landroid/hardware/Sensor;", "sensors", "", DateTokenConverter.CONVERTER_KEY, "Z", "isRegistered", "I", C17296a.f69688o, "()I", "delay", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getHasObservers", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "hasObservers", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "onEvent", "<init>", "(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V", "co.bird.android.manager.sensor"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSensorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorListener.kt\nco/bird/android/manager/sensor/SensorListener\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n13579#2,2:50\n13579#2,2:52\n*S KotlinDebug\n*F\n+ 1 SensorListener.kt\nco/bird/android/manager/sensor/SensorListener\n*L\n27#1:50,2\n37#1:52,2\n*E\n"})
/* renamed from: Es5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC32716Es5<T> implements SensorEventListener {

    /* renamed from: b */
    public final SensorManager f8235b;

    /* renamed from: c */
    public final Sensor[] f8236c;

    /* renamed from: d */
    public boolean f8237d;

    /* renamed from: e */
    public final int f8238e;

    /* renamed from: f */
    public Function0<Boolean> f8239f;

    /* renamed from: g */
    public Function1<? super T, Unit> f8240g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Es5$a */
    /* loaded from: classes4.dex */
    public static final class C2008a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C2008a f8241g = new C2008a();

        public C2008a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Es5$b */
    /* loaded from: classes4.dex */
    public static final class C2009b extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C2009b f8242g = new C2009b();

        public C2009b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C2009b) obj);
            return Unit.INSTANCE;
        }
    }

    public AbstractC32716Es5(SensorManager sensorManager, Sensor... sensors) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(sensors, "sensors");
        this.f8235b = sensorManager;
        this.f8236c = sensors;
        this.f8238e = 3;
        this.f8239f = C2008a.f8241g;
        this.f8240g = C2009b.f8242g;
    }

    /* renamed from: a */
    public int mo101436a() {
        return this.f8238e;
    }

    /* renamed from: b */
    public final SensorManager m108279b() {
        return this.f8235b;
    }

    /* renamed from: c */
    public final void m108278c(Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f8239f = function0;
    }

    /* renamed from: d */
    public final void m108277d(Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f8240g = function1;
    }

    /* renamed from: e */
    public synchronized void m108276e() {
        if (this.f8237d) {
            return;
        }
        this.f8237d = true;
        for (Sensor sensor : this.f8236c) {
            this.f8235b.registerListener(this, sensor, mo101436a());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f8240g.invoke(transformEvent(sensorEvent));
        if (!this.f8239f.invoke().booleanValue()) {
            for (Sensor sensor : this.f8236c) {
                this.f8235b.unregisterListener(this, sensor);
            }
            this.f8237d = false;
        }
    }

    public abstract T transformEvent(SensorEvent sensorEvent);
}
