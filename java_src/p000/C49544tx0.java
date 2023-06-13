package p000;
/* renamed from: tx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49544tx0 extends AbstractC31820Ax0<Long> {

    /* renamed from: a */
    public static C49544tx0 f111403a;

    private C49544tx0() {
    }

    /* renamed from: e */
    public static synchronized C49544tx0 m11170e() {
        C49544tx0 c49544tx0;
        synchronized (C49544tx0.class) {
            if (f111403a == null) {
                f111403a = new C49544tx0();
            }
            c49544tx0 = f111403a;
        }
        return c49544tx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "sessions_max_length_minutes";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_session_max_duration_min";
    }

    /* renamed from: d */
    public Long m11171d() {
        return 240L;
    }
}
