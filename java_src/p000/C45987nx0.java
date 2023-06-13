package p000;
/* renamed from: nx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45987nx0 extends AbstractC31820Ax0<Double> {

    /* renamed from: a */
    public static C45987nx0 f101113a;

    private C45987nx0() {
    }

    /* renamed from: e */
    public static synchronized C45987nx0 m22156e() {
        C45987nx0 c45987nx0;
        synchronized (C45987nx0.class) {
            if (f101113a == null) {
                f101113a = new C45987nx0();
            }
            c45987nx0 = f101113a;
        }
        return c45987nx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* renamed from: d */
    public Double m22157d() {
        return Double.valueOf(1.0d);
    }
}
