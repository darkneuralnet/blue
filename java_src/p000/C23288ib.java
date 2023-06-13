package p000;
/* renamed from: ib */
/* loaded from: classes6.dex */
public final class C23288ib {

    /* renamed from: a */
    public static boolean f87497a;

    /* renamed from: b */
    public static final Class<?> f87498b = m33781a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f87499c;

    static {
        boolean z;
        if (!f87497a && m33781a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f87499c = z;
    }

    private C23288ib() {
    }

    /* renamed from: a */
    public static <T> Class<T> m33781a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m33780b() {
        return f87498b;
    }

    /* renamed from: c */
    public static boolean m33779c() {
        return f87497a || !(f87498b == null || f87499c);
    }
}
