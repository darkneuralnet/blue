package p000;
/* renamed from: lx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44801lx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C44801lx0 f97000a;

    private C44801lx0() {
    }

    /* renamed from: e */
    public static synchronized C44801lx0 m26607e() {
        C44801lx0 c44801lx0;
        synchronized (C44801lx0.class) {
            if (f97000a == null) {
                f97000a = new C44801lx0();
            }
            c44801lx0 = f97000a;
        }
        return c44801lx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* renamed from: d */
    public Long m26608d() {
        return 70L;
    }
}
