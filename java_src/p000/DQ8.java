package p000;
/* renamed from: DQ8 */
/* loaded from: classes5.dex */
public final class DQ8 {
    /* renamed from: a */
    public static int m110470a(int i, int i2, String str) {
        String m93892a;
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
            m93892a = NR8.m93892a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m93892a = NR8.m93892a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m93892a);
    }

    /* renamed from: b */
    public static int m110469b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m110463h(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static Object m110468c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    /* renamed from: d */
    public static void m110467d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m110466e(int i, int i2, int i3) {
        String m110463h;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m110463h = NR8.m93892a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m110463h = m110463h(i2, i3, "end index");
            }
        } else {
            m110463h = m110463h(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m110463h);
    }

    /* renamed from: f */
    public static void m110465f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    public static void m110464g(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: h */
    public static String m110463h(int i, int i2, String str) {
        if (i < 0) {
            return NR8.m93892a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return NR8.m93892a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
