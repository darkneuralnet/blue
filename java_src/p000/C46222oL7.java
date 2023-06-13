package p000;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: oL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46222oL7 {
    /* renamed from: a */
    public static int m21304a(int i, int i2, @NullableDecl String str) {
        String m112330a;
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
            m112330a = CL7.m112330a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m112330a = CL7.m112330a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m112330a);
    }

    /* renamed from: b */
    public static int m21303b(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m21301d(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m21302c(int i, int i2, int i3) {
        String m21301d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m21301d = CL7.m112330a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m21301d = m21301d(i2, i3, "end index");
            }
        } else {
            m21301d = m21301d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m21301d);
    }

    /* renamed from: d */
    public static String m21301d(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return CL7.m112330a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return CL7.m112330a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
