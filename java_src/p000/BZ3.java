package p000;
/* renamed from: BZ3 */
/* loaded from: classes5.dex */
public final class BZ3 {
    /* renamed from: a */
    public static void m113864a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m113863b(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static void m113862c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: d */
    public static void m113861d(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: e */
    public static boolean m113860e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m113859f() {
        return true;
    }
}
