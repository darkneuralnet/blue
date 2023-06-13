package p000;
/* renamed from: Ki9 */
/* loaded from: classes5.dex */
public final class Ki9 {

    /* renamed from: a */
    public static Ki9 f20092a;

    private Ki9() {
    }

    /* renamed from: a */
    public static synchronized Ki9 m98463a() {
        Ki9 ki9;
        synchronized (Ki9.class) {
            if (f20092a == null) {
                f20092a = new Ki9();
            }
            ki9 = f20092a;
        }
        return ki9;
    }

    /* renamed from: b */
    public static void m98462b() {
        Ci9.m111815a();
    }
}
