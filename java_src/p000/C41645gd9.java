package p000;
/* renamed from: gd9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41645gd9 {

    /* renamed from: a */
    public static final Class<?> f83965a = m37945a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f83966b;

    static {
        boolean z;
        if (m37945a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f83966b = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m37945a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m37944b() {
        return (f83965a == null || f83966b) ? false : true;
    }

    /* renamed from: c */
    public static Class<?> m37943c() {
        return f83965a;
    }
}
