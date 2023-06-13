package p000;
/* renamed from: J57 */
/* loaded from: classes5.dex */
public final class J57 {
    /* renamed from: a */
    public static int m101169a(int i, int i2, String str) {
        String m90857a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m90857a = P57.m90857a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m90857a = P57.m90857a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m90857a);
    }

    /* renamed from: b */
    public static int m101168b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m101165e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m101167c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m101166d(int i, int i2, int i3) {
        String m101165e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m101165e = P57.m90857a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m101165e = m101165e(i2, i3, "end index");
            }
        } else {
            m101165e = m101165e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m101165e);
    }

    /* renamed from: e */
    public static String m101165e(int i, int i2, String str) {
        if (i < 0) {
            return P57.m90857a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return P57.m90857a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
