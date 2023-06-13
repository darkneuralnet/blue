package p000;
/* renamed from: xZ3  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C51679xZ3 {
    private C51679xZ3() {
    }

    /* renamed from: a */
    public static <T> void m5006a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m5005b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m5004c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static <T> T m5003d(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    /* renamed from: e */
    public static <T> T m5002e(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
