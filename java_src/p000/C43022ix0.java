package p000;
/* renamed from: ix0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43022ix0 extends AbstractC31820Ax0<Boolean> {

    /* renamed from: a */
    public static C43022ix0 f91754a;

    private C43022ix0() {
    }

    /* renamed from: e */
    public static synchronized C43022ix0 m31565e() {
        C43022ix0 c43022ix0;
        synchronized (C43022ix0.class) {
            if (f91754a == null) {
                f91754a = new C43022ix0();
            }
            c43022ix0 = f91754a;
        }
        return c43022ix0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "experiment_app_start_ttid";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* renamed from: d */
    public Boolean m31566d() {
        return Boolean.FALSE;
    }
}
