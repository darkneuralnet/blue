package p000;
/* renamed from: yx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52508yx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C52508yx0 f120438a;

    private C52508yx0() {
    }

    /* renamed from: e */
    public static synchronized C52508yx0 m2227e() {
        C52508yx0 c52508yx0;
        synchronized (C52508yx0.class) {
            if (f120438a == null) {
                f120438a = new C52508yx0();
            }
            c52508yx0 = f120438a;
        }
        return c52508yx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* renamed from: d */
    public Long m2228d() {
        return 300L;
    }
}
