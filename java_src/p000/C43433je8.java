package p000;
/* renamed from: je8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43433je8 {
    /* renamed from: a */
    public static int m30137a(int i, int i2, String str) {
        String m60882a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m60882a = C39345cm8.m60882a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m60882a = C39345cm8.m60882a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m60882a);
    }

    /* renamed from: b */
    public static int m30136b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m30134d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m30135c(int i, int i2, int i3) {
        String m30134d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m30134d = C39345cm8.m60882a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m30134d = m30134d(i2, i3, "end index");
            }
        } else {
            m30134d = m30134d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m30134d);
    }

    /* renamed from: d */
    public static String m30134d(int i, int i2, String str) {
        if (i < 0) {
            return C39345cm8.m60882a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C39345cm8.m60882a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
