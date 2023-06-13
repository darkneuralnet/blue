package p000;
/* renamed from: ft8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41211ft8 {
    /* renamed from: a */
    public static int m40589a(int i, int i2, String str) {
        String m31032a;
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
            m31032a = C43159jA8.m31032a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m31032a = C43159jA8.m31032a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m31032a);
    }

    /* renamed from: b */
    public static int m40588b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m40584f(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m40587c(int i, int i2, int i3) {
        String m40584f;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m40584f = C43159jA8.m31032a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m40584f = m40584f(i2, i3, "end index");
            }
        } else {
            m40584f = m40584f(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m40584f);
    }

    /* renamed from: d */
    public static void m40586d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public static void m40585e(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: f */
    public static String m40584f(int i, int i2, String str) {
        if (i < 0) {
            return C43159jA8.m31032a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C43159jA8.m31032a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
