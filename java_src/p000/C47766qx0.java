package p000;
/* renamed from: qx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47766qx0 extends AbstractC31820Ax0<Boolean> {

    /* renamed from: a */
    public static C47766qx0 f106115a;

    /* renamed from: e */
    public static synchronized C47766qx0 m16763e() {
        C47766qx0 c47766qx0;
        synchronized (C47766qx0.class) {
            if (f106115a == null) {
                f106115a = new C47766qx0();
            }
            c47766qx0 = f106115a;
        }
        return c47766qx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_enabled";
    }

    /* renamed from: d */
    public Boolean m16764d() {
        return Boolean.TRUE;
    }
}
