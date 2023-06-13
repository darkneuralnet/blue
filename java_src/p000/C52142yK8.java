package p000;
/* renamed from: yK8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52142yK8 {
    /* renamed from: a */
    public static int m3664a(int i, int i2, String str) {
        String m42992b;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            m42992b = C40302eM8.m42992b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m42992b = C40302eM8.m42992b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m42992b);
    }

    /* renamed from: b */
    public static int m3663b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m3653l(i, i2, "index"));
    }

    /* renamed from: c */
    public static <T> T m3662c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException((String) obj);
    }

    /* renamed from: d */
    public static <T> T m3661d(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C40302eM8.m42992b(str, obj));
    }

    /* renamed from: e */
    public static void m3660e(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static void m3659f(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C40302eM8.m42992b(str, Character.valueOf(c)));
    }

    /* renamed from: g */
    public static void m3658g(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C40302eM8.m42992b(str, obj));
    }

    /* renamed from: h */
    public static void m3657h(int i, int i2, int i3) {
        String m3653l;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m3653l = C40302eM8.m42992b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m3653l = m3653l(i2, i3, "end index");
            }
        } else {
            m3653l = m3653l(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m3653l);
    }

    /* renamed from: i */
    public static void m3656i(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public static void m3655j(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: k */
    public static void m3654k(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(C40302eM8.m42992b(str, Integer.valueOf(i)));
    }

    /* renamed from: l */
    public static String m3653l(int i, int i2, String str) {
        if (i < 0) {
            return C40302eM8.m42992b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C40302eM8.m42992b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
