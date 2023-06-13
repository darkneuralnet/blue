package p000;
/* renamed from: Tv8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36256Tv8 {

    /* renamed from: a */
    public static final Class<?> f36475a = m82239a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f36476b;

    static {
        boolean z;
        if (m82239a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f36476b = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m82239a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m82238b() {
        return (f36475a == null || f36476b) ? false : true;
    }

    /* renamed from: c */
    public static Class<?> m82237c() {
        return f36475a;
    }
}
