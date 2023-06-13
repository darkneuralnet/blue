package p000;
/* renamed from: Ay7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31836Ay7 {

    /* renamed from: a */
    public static final Class<?> f1492a = m114806a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f1493b;

    static {
        f1493b = m114806a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    public static <T> Class<T> m114806a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m114805b() {
        return (f1492a == null || f1493b) ? false : true;
    }

    /* renamed from: c */
    public static Class<?> m114804c() {
        return f1492a;
    }
}
