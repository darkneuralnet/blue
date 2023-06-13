package p000;
/* renamed from: vg7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50566vg7 {
    /* renamed from: a */
    public static int m8263a(int i, int i2, String str) {
        String m11913a;
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
            m11913a = C49391th7.m11913a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m11913a = C49391th7.m11913a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m11913a);
    }

    /* renamed from: b */
    public static int m8262b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m8259e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m8261c(int i, int i2, int i3) {
        String m8259e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m8259e = C49391th7.m11913a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m8259e = m8259e(i2, i3, "end index");
            }
        } else {
            m8259e = m8259e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m8259e);
    }

    /* renamed from: d */
    public static void m8260d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: e */
    public static String m8259e(int i, int i2, String str) {
        if (i < 0) {
            return C49391th7.m11913a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C49391th7.m11913a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
