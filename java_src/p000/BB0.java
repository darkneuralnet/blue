package p000;

import java.util.Collection;
/* renamed from: BB0 */
/* loaded from: classes8.dex */
public class BB0 {

    /* renamed from: a */
    public static final C52053yB0[] f1975a = new C52053yB0[0];

    private BB0() {
    }

    /* renamed from: a */
    public static int m114285a(C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr != null && c52053yB0Arr.length != 0) {
            int i = 0;
            for (C52053yB0 c52053yB0 : c52053yB0Arr) {
                i = Math.max(i, MB0.m95608c(c52053yB0));
            }
            return i;
        }
        return 3;
    }

    /* renamed from: b */
    public static boolean m114284b(C52053yB0[] c52053yB0Arr) {
        for (int i = 1; i < c52053yB0Arr.length; i++) {
            if (c52053yB0Arr[i - 1].equals(c52053yB0Arr[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m114283c(C52053yB0[] c52053yB0Arr) {
        for (int i = 0; i < c52053yB0Arr.length / 2; i++) {
            int compareTo = c52053yB0Arr[i].compareTo(c52053yB0Arr[(c52053yB0Arr.length - 1) - i]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 1;
    }

    /* renamed from: d */
    public static int m114282d(C52053yB0 c52053yB0, C52053yB0[] c52053yB0Arr) {
        for (int i = 0; i < c52053yB0Arr.length; i++) {
            if (c52053yB0.equals(c52053yB0Arr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m114281e(C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr == null || c52053yB0Arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            i = Math.max(i, MB0.m95607d(c52053yB0));
        }
        return i;
    }

    /* renamed from: f */
    public static C52053yB0 m114280f(C52053yB0[] c52053yB0Arr, C52053yB0[] c52053yB0Arr2) {
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            if (m114282d(c52053yB0, c52053yB0Arr2) < 0) {
                return c52053yB0;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C52053yB0[] m114279g(C52053yB0[] c52053yB0Arr) {
        if (!m114284b(c52053yB0Arr)) {
            return c52053yB0Arr;
        }
        return new DB0(c52053yB0Arr, false).m110799b2();
    }

    /* renamed from: h */
    public static void m114278h(C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr.length <= 1) {
            return;
        }
        int length = c52053yB0Arr.length - 1;
        int i = length / 2;
        for (int i2 = 0; i2 <= i; i2++) {
            C52053yB0 c52053yB0 = c52053yB0Arr[i2];
            int i3 = length - i2;
            c52053yB0Arr[i2] = c52053yB0Arr[i3];
            c52053yB0Arr[i3] = c52053yB0;
        }
    }

    /* renamed from: i */
    public static C52053yB0[] m114277i(Collection collection) {
        return (C52053yB0[]) collection.toArray(f1975a);
    }
}
