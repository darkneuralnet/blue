package p000;
/* renamed from: tk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49421tk7 {
    /* renamed from: a */
    public static int m11818a(int i, int i2, String str) {
        String m20534a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m20534a = C46467ol7.m20534a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m20534a = C46467ol7.m20534a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m20534a);
    }

    /* renamed from: b */
    public static int m11817b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m11815d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m11816c(int i, int i2, int i3) {
        String m11815d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m11815d = C46467ol7.m20534a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m11815d = m11815d(i2, i3, "end index");
            }
        } else {
            m11815d = m11815d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m11815d);
    }

    /* renamed from: d */
    public static String m11815d(int i, int i2, String str) {
        if (i < 0) {
            return C46467ol7.m20534a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C46467ol7.m20534a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
