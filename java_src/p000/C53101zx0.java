package p000;
/* renamed from: zx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C53101zx0 extends AbstractC31820Ax0<Double> {

    /* renamed from: a */
    public static C53101zx0 f122510a;

    private C53101zx0() {
    }

    /* renamed from: e */
    public static synchronized C53101zx0 m86e() {
        C53101zx0 c53101zx0;
        synchronized (C53101zx0.class) {
            if (f122510a == null) {
                f122510a = new C53101zx0();
            }
            c53101zx0 = f122510a;
        }
        return c53101zx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* renamed from: d */
    public Double m87d() {
        return Double.valueOf(1.0d);
    }
}
