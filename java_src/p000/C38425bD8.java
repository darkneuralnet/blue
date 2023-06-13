package p000;
/* renamed from: bD8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38425bD8 {
    /* renamed from: a */
    public static int m64819a(int i, int i2, String str) {
        String m1622a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m1622a = C52672zD8.m1622a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m1622a = C52672zD8.m1622a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m1622a);
    }

    /* renamed from: b */
    public static int m64818b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m64816d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m64817c(int i, int i2, int i3) {
        String m64816d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m64816d = C52672zD8.m1622a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m64816d = m64816d(i2, i3, "end index");
            }
        } else {
            m64816d = m64816d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m64816d);
    }

    /* renamed from: d */
    public static String m64816d(int i, int i2, String str) {
        if (i < 0) {
            return C52672zD8.m1622a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C52672zD8.m1622a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
