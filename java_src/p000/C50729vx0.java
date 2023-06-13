package p000;
/* renamed from: vx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50729vx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C50729vx0 f114932a;

    private C50729vx0() {
    }

    /* renamed from: e */
    public static synchronized C50729vx0 m7723e() {
        C50729vx0 c50729vx0;
        synchronized (C50729vx0.class) {
            if (f114932a == null) {
                f114932a = new C50729vx0();
            }
            c50729vx0 = f114932a;
        }
        return c50729vx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* renamed from: d */
    public Long m7724d() {
        return 100L;
    }
}
