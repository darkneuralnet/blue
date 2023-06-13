package p000;

import java.util.Locale;
/* renamed from: HZ3 */
/* loaded from: classes.dex */
public final class HZ3 {
    private HZ3() {
    }

    /* renamed from: a */
    public static void m103737a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m103736b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m103735c(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* renamed from: d */
    public static int m103734d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m103733e(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: f */
    public static int m103732f(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    /* renamed from: g */
    public static <T> T m103731g(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: h */
    public static <T> T m103730h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m103729i(boolean z) {
        m103728j(z, null);
    }

    /* renamed from: j */
    public static void m103728j(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
