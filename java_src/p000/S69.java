package p000;
/* renamed from: S69 */
/* loaded from: classes5.dex */
public final class S69 {

    /* renamed from: a */
    public static S69 f33169a;

    private S69() {
    }

    /* renamed from: a */
    public static synchronized S69 m86000a() {
        S69 s69;
        synchronized (S69.class) {
            if (f33169a == null) {
                f33169a = new S69();
            }
            s69 = f33169a;
        }
        return s69;
    }
}
