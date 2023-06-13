package p000;
/* renamed from: xx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51915xx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C51915xx0 f118395a;

    private C51915xx0() {
    }

    /* renamed from: e */
    public static synchronized C51915xx0 m4412e() {
        C51915xx0 c51915xx0;
        synchronized (C51915xx0.class) {
            if (f118395a == null) {
                f118395a = new C51915xx0();
            }
            c51915xx0 = f118395a;
        }
        return c51915xx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* renamed from: d */
    public Long m4413d() {
        return 30L;
    }
}
