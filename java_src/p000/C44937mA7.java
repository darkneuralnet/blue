package p000;
/* renamed from: mA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44937mA7 {
    /* renamed from: a */
    public static int m26194a(int i, int i2, String str) {
        String m73638a;
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
            m73638a = ZA7.m73638a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m73638a = ZA7.m73638a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m73638a);
    }

    /* renamed from: b */
    public static int m26193b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m26191d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m26192c(int i, int i2, int i3) {
        String m26191d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m26191d = ZA7.m73638a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m26191d = m26191d(i2, i3, "end index");
            }
        } else {
            m26191d = m26191d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m26191d);
    }

    /* renamed from: d */
    public static String m26191d(int i, int i2, String str) {
        if (i < 0) {
            return ZA7.m73638a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ZA7.m73638a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
