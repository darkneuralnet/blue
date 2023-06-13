package p000;
/* renamed from: CZ3 */
/* loaded from: classes5.dex */
public final class CZ3 {
    private CZ3() {
    }

    /* renamed from: a */
    public static <T> void m112117a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m112116b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m112115c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
