package p000;

import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: Uo9 */
/* loaded from: classes5.dex */
public final class Uo9 {
    /* renamed from: a */
    public static int m80802a(int i, int i2, String str) {
        String m104550a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            m104550a = Gx9.m104550a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m104550a = Gx9.m104550a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m104550a);
    }

    /* renamed from: b */
    public static int m80801b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m80799d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m80800c(int i, int i2, int i3) {
        String m80799d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m80799d = Gx9.m104550a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m80799d = m80799d(i2, i3, "end index");
            }
        } else {
            m80799d = m80799d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(m80799d);
    }

    /* renamed from: d */
    public static String m80799d(int i, int i2, String str) {
        if (i < 0) {
            return Gx9.m104550a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Gx9.m104550a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
