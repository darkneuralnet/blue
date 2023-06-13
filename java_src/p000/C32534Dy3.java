package p000;
/* renamed from: Dy3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32534Dy3 {
    /* renamed from: a */
    public static int m109571a(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        return X70.m77366b(c52053yB0, c52053yB02, c52053yB03);
    }

    /* renamed from: b */
    public static boolean m109570b(EB0 eb0) {
        int i;
        int size = eb0.size() - 1;
        if (size < 3) {
            return false;
        }
        C52053yB0 mo1707u = eb0.mo1707u(0);
        double d = mo1707u.f118923c;
        C52053yB0 c52053yB0 = null;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= size) {
            double mo1713a3 = eb0.mo1713a3(i2, 1);
            if (mo1713a3 > d && mo1713a3 >= mo1707u.f118923c) {
                mo1707u = eb0.mo1707u(i2);
                c52053yB0 = eb0.mo1707u(i2 - 1);
                i3 = i2;
            }
            i2++;
            d = mo1713a3;
        }
        if (i3 == 0) {
            return false;
        }
        int i4 = i3;
        do {
            i4 = (i4 + 1) % size;
            if (i4 == i3) {
                break;
            }
        } while (eb0.mo1713a3(i4, 1) == mo1707u.f118923c);
        C52053yB0 mo1707u2 = eb0.mo1707u(i4);
        if (i4 > 0) {
            i = i4 - 1;
        } else {
            i = size - 1;
        }
        C52053yB0 mo1707u3 = eb0.mo1707u(i);
        if (mo1707u.m3886g(mo1707u3)) {
            if (!c52053yB0.m3886g(mo1707u) && !mo1707u2.m3886g(mo1707u) && !c52053yB0.m3886g(mo1707u2) && m109571a(c52053yB0, mo1707u, mo1707u2) == 1) {
                return true;
            }
            return false;
        } else if (mo1707u3.f118922b - mo1707u.f118922b < 0.0d) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m109569c(C52053yB0[] c52053yB0Arr) {
        return m109570b(new C52646zB0(c52053yB0Arr, 2, 0));
    }
}
