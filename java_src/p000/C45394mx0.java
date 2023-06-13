package p000;
/* renamed from: mx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45394mx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C45394mx0 f99105a;

    private C45394mx0() {
    }

    /* renamed from: e */
    public static synchronized C45394mx0 m24679e() {
        C45394mx0 c45394mx0;
        synchronized (C45394mx0.class) {
            if (f99105a == null) {
                f99105a = new C45394mx0();
            }
            c45394mx0 = f99105a;
        }
        return c45394mx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* renamed from: d */
    public Long m24680d() {
        return 700L;
    }
}
