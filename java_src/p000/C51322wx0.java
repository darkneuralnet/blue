package p000;
/* renamed from: wx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51322wx0 extends AbstractC31820Ax0<Double> {

    /* renamed from: a */
    public static C51322wx0 f116881a;

    private C51322wx0() {
    }

    /* renamed from: e */
    public static synchronized C51322wx0 m6071e() {
        C51322wx0 c51322wx0;
        synchronized (C51322wx0.class) {
            if (f116881a == null) {
                f116881a = new C51322wx0();
            }
            c51322wx0 = f116881a;
        }
        return c51322wx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_sampling_percentage";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* renamed from: d */
    public Double m6072d() {
        return Double.valueOf(0.01d);
    }
}
