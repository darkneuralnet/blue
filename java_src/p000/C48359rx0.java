package p000;
/* renamed from: rx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48359rx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C48359rx0 f107946a;

    private C48359rx0() {
    }

    /* renamed from: e */
    public static synchronized C48359rx0 m14990e() {
        C48359rx0 c48359rx0;
        synchronized (C48359rx0.class) {
            if (f107946a == null) {
                f107946a = new C48359rx0();
            }
            c48359rx0 = f107946a;
        }
        return c48359rx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* renamed from: d */
    public Long m14991d() {
        return 0L;
    }
}
