package p000;
/* renamed from: FZ3 */
/* loaded from: classes6.dex */
public final class FZ3 {
    /* renamed from: a */
    public static void m106947a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m106946b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m106945c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m106944d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
