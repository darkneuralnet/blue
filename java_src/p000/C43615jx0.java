package p000;
/* renamed from: jx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43615jx0 extends AbstractC31820Ax0<Double> {

    /* renamed from: a */
    public static C43615jx0 f93594a;

    private C43615jx0() {
    }

    /* renamed from: e */
    public static synchronized C43615jx0 m29678e() {
        C43615jx0 c43615jx0;
        synchronized (C43615jx0.class) {
            if (f93594a == null) {
                f93594a = new C43615jx0();
            }
            c43615jx0 = f93594a;
        }
        return c43615jx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "fragment_sampling_percentage";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* renamed from: d */
    public Double m29679d() {
        return Double.valueOf(0.0d);
    }
}
