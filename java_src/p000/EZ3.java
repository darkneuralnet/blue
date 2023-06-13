package p000;
/* renamed from: EZ3 */
/* loaded from: classes6.dex */
public final class EZ3 {
    private EZ3() {
    }

    /* renamed from: a */
    public static String m108814a(int i, int i2, String str) {
        if (i < 0) {
            return C46283oS5.m21042b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C46283oS5.m21042b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static String m108813b(int i, int i2, String str) {
        if (i < 0) {
            return C46283oS5.m21042b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C46283oS5.m21042b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static String m108812c(int i, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                return C46283oS5.m21042b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            return m108813b(i2, i3, "end index");
        }
        return m108813b(i, i3, "start index");
    }

    /* renamed from: d */
    public static void m108811d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m108810e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m108809f(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static void m108808g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: h */
    public static void m108807h(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, Long.valueOf(j)));
        }
    }

    /* renamed from: i */
    public static void m108806i(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* renamed from: j */
    public static void m108805j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, obj));
        }
    }

    /* renamed from: k */
    public static void m108804k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C46283oS5.m21042b(str, obj, obj2));
        }
    }

    /* renamed from: l */
    public static int m108803l(int i, int i2) {
        return m108802m(i, i2, "index");
    }

    /* renamed from: m */
    public static int m108802m(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(m108814a(i, i2, str));
        }
        return i;
    }

    /* renamed from: n */
    public static <T> T m108801n(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: o */
    public static <T> T m108800o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: p */
    public static <T> T m108799p(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C46283oS5.m21042b(str, obj));
    }

    /* renamed from: q */
    public static int m108798q(int i, int i2) {
        return m108797r(i, i2, "index");
    }

    /* renamed from: r */
    public static int m108797r(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m108813b(i, i2, str));
        }
        return i;
    }

    /* renamed from: s */
    public static void m108796s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m108812c(i, i2, i3));
        }
    }

    /* renamed from: t */
    public static void m108795t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public static void m108794u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: v */
    public static void m108793v(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C46283oS5.m21042b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: w */
    public static void m108792w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C46283oS5.m21042b(str, obj));
        }
    }

    /* renamed from: x */
    public static void m108791x(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(C46283oS5.m21042b(str, obj, obj2));
        }
    }
}
