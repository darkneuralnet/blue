package p000;
/* renamed from: sx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48951sx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C48951sx0 f109597a;

    private C48951sx0() {
    }

    /* renamed from: e */
    public static synchronized C48951sx0 m13370e() {
        C48951sx0 c48951sx0;
        synchronized (C48951sx0.class) {
            if (f109597a == null) {
                f109597a = new C48951sx0();
            }
            c48951sx0 = f109597a;
        }
        return c48951sx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* renamed from: d */
    public Long m13371d() {
        return 100L;
    }
}
