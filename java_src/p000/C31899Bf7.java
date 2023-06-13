package p000;
/* renamed from: Bf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31899Bf7 {
    /* renamed from: a */
    public static int m113729a(int i, int i2, String str) {
        String m566a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m566a = C52938zg7.m566a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m566a = C52938zg7.m566a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m566a);
    }

    /* renamed from: b */
    public static int m113728b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m113725e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m113727c(int i, int i2, int i3) {
        String m113725e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m113725e = C52938zg7.m566a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m113725e = m113725e(i2, i3, "end index");
            }
        } else {
            m113725e = m113725e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m113725e);
    }

    /* renamed from: d */
    public static void m113726d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: e */
    public static String m113725e(int i, int i2, String str) {
        if (i < 0) {
            return C52938zg7.m566a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C52938zg7.m566a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
