package p000;
/* renamed from: hb */
/* loaded from: classes6.dex */
public final class C22700hb {

    /* renamed from: a */
    public static boolean f85497a;

    /* renamed from: b */
    public static final Class<?> f85498b = m36175a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f85499c;

    static {
        boolean z;
        if (!f85497a && m36175a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f85499c = z;
    }

    private C22700hb() {
    }

    /* renamed from: a */
    public static <T> Class<T> m36175a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m36174b() {
        return f85498b;
    }

    /* renamed from: c */
    public static boolean m36173c() {
        return f85497a || !(f85498b == null || f85499c);
    }
}
