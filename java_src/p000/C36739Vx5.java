package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
/* renamed from: Vx5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36739Vx5 implements SensorEventListener {

    /* renamed from: b */
    public int f40110b = 13;

    /* renamed from: c */
    public final C8881d f40111c = new C8881d();

    /* renamed from: d */
    public final InterfaceC8878a f40112d;

    /* renamed from: e */
    public SensorManager f40113e;

    /* renamed from: f */
    public Sensor f40114f;

    /* renamed from: Vx5$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC8878a {
        /* renamed from: a */
        void mo77602a();
    }

    /* renamed from: Vx5$b */
    /* loaded from: classes6.dex */
    public static class C8879b {

        /* renamed from: a */
        public long f40115a;

        /* renamed from: b */
        public boolean f40116b;

        /* renamed from: c */
        public C8879b f40117c;
    }

    /* renamed from: Vx5$c */
    /* loaded from: classes6.dex */
    public static class C8880c {

        /* renamed from: a */
        public C8879b f40118a;

        /* renamed from: a */
        public C8879b m79081a() {
            C8879b c8879b = this.f40118a;
            if (c8879b == null) {
                return new C8879b();
            }
            this.f40118a = c8879b.f40117c;
            return c8879b;
        }

        /* renamed from: b */
        public void m79080b(C8879b c8879b) {
            c8879b.f40117c = this.f40118a;
            this.f40118a = c8879b;
        }
    }

    /* renamed from: Vx5$d */
    /* loaded from: classes6.dex */
    public static class C8881d {

        /* renamed from: a */
        public final C8880c f40119a = new C8880c();

        /* renamed from: b */
        public C8879b f40120b;

        /* renamed from: c */
        public C8879b f40121c;

        /* renamed from: d */
        public int f40122d;

        /* renamed from: e */
        public int f40123e;

        /* renamed from: a */
        public void m79079a(long j, boolean z) {
            m79076d(j - 500000000);
            C8879b m79081a = this.f40119a.m79081a();
            m79081a.f40115a = j;
            m79081a.f40116b = z;
            m79081a.f40117c = null;
            C8879b c8879b = this.f40121c;
            if (c8879b != null) {
                c8879b.f40117c = m79081a;
            }
            this.f40121c = m79081a;
            if (this.f40120b == null) {
                this.f40120b = m79081a;
            }
            this.f40122d++;
            if (z) {
                this.f40123e++;
            }
        }

        /* renamed from: b */
        public void m79078b() {
            while (true) {
                C8879b c8879b = this.f40120b;
                if (c8879b != null) {
                    this.f40120b = c8879b.f40117c;
                    this.f40119a.m79080b(c8879b);
                } else {
                    this.f40121c = null;
                    this.f40122d = 0;
                    this.f40123e = 0;
                    return;
                }
            }
        }

        /* renamed from: c */
        public boolean m79077c() {
            C8879b c8879b;
            C8879b c8879b2 = this.f40121c;
            if (c8879b2 != null && (c8879b = this.f40120b) != null && c8879b2.f40115a - c8879b.f40115a >= 250000000) {
                int i = this.f40123e;
                int i2 = this.f40122d;
                if (i >= (i2 >> 1) + (i2 >> 2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m79076d(long j) {
            C8879b c8879b;
            while (true) {
                int i = this.f40122d;
                if (i >= 4 && (c8879b = this.f40120b) != null && j - c8879b.f40115a > 0) {
                    if (c8879b.f40116b) {
                        this.f40123e--;
                    }
                    this.f40122d = i - 1;
                    C8879b c8879b2 = c8879b.f40117c;
                    this.f40120b = c8879b2;
                    if (c8879b2 == null) {
                        this.f40121c = null;
                    }
                    this.f40119a.m79080b(c8879b);
                } else {
                    return;
                }
            }
        }
    }

    public C36739Vx5(InterfaceC8878a interfaceC8878a) {
        this.f40112d = interfaceC8878a;
    }

    /* renamed from: a */
    public final boolean m79084a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        int i = this.f40110b;
        if ((f * f) + (f2 * f2) + (f3 * f3) <= i * i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m79083b(SensorManager sensorManager, int i) {
        if (this.f40114f != null) {
            return true;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f40114f = defaultSensor;
        if (defaultSensor != null) {
            this.f40113e = sensorManager;
            sensorManager.registerListener(this, defaultSensor, i);
        }
        if (this.f40114f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m79082c() {
        if (this.f40114f != null) {
            this.f40111c.m79078b();
            this.f40113e.unregisterListener(this, this.f40114f);
            this.f40113e = null;
            this.f40114f = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean m79084a = m79084a(sensorEvent);
        this.f40111c.m79079a(sensorEvent.timestamp, m79084a);
        if (this.f40111c.m79077c()) {
            this.f40111c.m79078b();
            this.f40112d.mo77602a();
        }
    }
}
