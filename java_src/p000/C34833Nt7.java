package p000;
/* renamed from: Nt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34833Nt7 {
    /* renamed from: a */
    public static int m93213a(int i, int i2, String str) {
        String m109704a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m109704a = C32502Du7.m109704a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m109704a = C32502Du7.m109704a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m109704a);
    }

    /* renamed from: b */
    public static int m93212b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m93209e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m93211c(int i, int i2, int i3) {
        String m93209e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m93209e = C32502Du7.m109704a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m93209e = m93209e(i2, i3, "end index");
            }
        } else {
            m93209e = m93209e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m93209e);
    }

    /* renamed from: d */
    public static void m93210d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    /* renamed from: e */
    public static String m93209e(int i, int i2, String str) {
        if (i < 0) {
            return C32502Du7.m109704a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C32502Du7.m109704a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
