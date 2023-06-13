package p000;
/* renamed from: ux0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50137ux0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C50137ux0 f113236a;

    private C50137ux0() {
    }

    /* renamed from: e */
    public static synchronized C50137ux0 m9442e() {
        C50137ux0 c50137ux0;
        synchronized (C50137ux0.class) {
            if (f113236a == null) {
                f113236a = new C50137ux0();
            }
            c50137ux0 = f113236a;
        }
        return c50137ux0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* renamed from: d */
    public Long m9443d() {
        return 0L;
    }
}
