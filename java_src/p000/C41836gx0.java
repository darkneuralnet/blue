package p000;
/* renamed from: gx0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41836gx0 extends AbstractC31820Ax0<Boolean> {

    /* renamed from: a */
    public static C41836gx0 f84502a;

    private C41836gx0() {
    }

    /* renamed from: e */
    public static synchronized C41836gx0 m37298e() {
        C41836gx0 c41836gx0;
        synchronized (C41836gx0.class) {
            if (f84502a == null) {
                f84502a = new C41836gx0();
            }
            c41836gx0 = f84502a;
        }
        return c41836gx0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: b */
    public String mo6073b() {
        return "firebase_performance_collection_deactivated";
    }

    /* renamed from: d */
    public Boolean m37299d() {
        return Boolean.FALSE;
    }
}
