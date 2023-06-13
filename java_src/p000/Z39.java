package p000;
/* renamed from: Z39 */
/* loaded from: classes5.dex */
public final class Z39 {

    /* renamed from: a */
    public static Z39 f47804a;

    private Z39() {
    }

    /* renamed from: a */
    public static synchronized Z39 m73790a() {
        Z39 z39;
        synchronized (Z39.class) {
            if (f47804a == null) {
                f47804a = new Z39();
            }
            z39 = f47804a;
        }
        return z39;
    }

    /* renamed from: b */
    public static final boolean m73789b() {
        return Q39.m88986a("mlkit-dev-profiling");
    }
}
