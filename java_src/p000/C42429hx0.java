package p000;
/* renamed from: hx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42429hx0 extends AbstractC31820Ax0<Boolean> {

    /* renamed from: a */
    public static C42429hx0 f86223a;

    private C42429hx0() {
    }

    /* renamed from: d */
    public static synchronized C42429hx0 m35451d() {
        C42429hx0 c42429hx0;
        synchronized (C42429hx0.class) {
            if (f86223a == null) {
                f86223a = new C42429hx0();
            }
            c42429hx0 = f86223a;
        }
        return c42429hx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "isEnabled";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "firebase_performance_collection_enabled";
    }
}
