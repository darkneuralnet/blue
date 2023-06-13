package p000;
/* renamed from: ox0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46580ox0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C46580ox0 f102795a;

    private C46580ox0() {
    }

    /* renamed from: e */
    public static synchronized C46580ox0 m20244e() {
        C46580ox0 c46580ox0;
        synchronized (C46580ox0.class) {
            if (f102795a == null) {
                f102795a = new C46580ox0();
            }
            c46580ox0 = f102795a;
        }
        return c46580ox0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_rl_time_limit_sec";
    }

    /* renamed from: d */
    public Long m20245d() {
        return 600L;
    }
}
