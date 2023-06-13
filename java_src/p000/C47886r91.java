package p000;
/* renamed from: r91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47886r91 {

    /* renamed from: a */
    public C52053yB0[] f106553a;

    /* renamed from: b */
    public int f106554b = -1;

    /* renamed from: c */
    public int f106555c = 0;

    /* renamed from: d */
    public boolean f106556d = false;

    /* renamed from: e */
    public int f106557e = -1;

    /* renamed from: f */
    public int f106558f = 0;

    /* renamed from: g */
    public boolean f106559g = false;

    public C47886r91(C52053yB0[] c52053yB0Arr, J91 j91) {
        this.f106553a = c52053yB0Arr;
        m16352a(j91);
    }

    /* renamed from: c */
    public static int m16350c(int i) {
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    /* renamed from: g */
    public static boolean m16346g(int i) {
        return i == 2 || i == 3;
    }

    /* renamed from: h */
    public static String m16345h(int i, int i2, boolean z, int i3) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "A:";
        } else {
            str = "B:";
        }
        sb.append(str);
        sb.append(C47305qA3.m18025b(i2));
        sb.append(m16335r(i2, z));
        sb.append(Integer.toString(i3));
        return sb.toString();
    }

    /* renamed from: i */
    public static void m16344i(C47305qA3 c47305qA3, int i, int i2, int i3, boolean z) {
        int m16340m = m16340m(i2, i3);
        if (m16340m != -1) {
            if (m16340m != 1) {
                if (m16340m != 2) {
                    if (m16340m == 3) {
                        c47305qA3.m18019h(i, z);
                        return;
                    }
                    return;
                }
                c47305qA3.m18020g(i, m16339n(i3), m16338o(i3), z);
                return;
            }
            c47305qA3.m18018i(i);
            return;
        }
        c47305qA3.m18017j(i);
    }

    /* renamed from: j */
    public static boolean m16343j(C52053yB0[] c52053yB0Arr) {
        if (c52053yB0Arr.length < 2 || c52053yB0Arr[0].m3886g(c52053yB0Arr[1])) {
            return true;
        }
        if (c52053yB0Arr.length > 2 && c52053yB0Arr[c52053yB0Arr.length - 1].m3886g(c52053yB0Arr[c52053yB0Arr.length - 2])) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m16342k(int i, C47886r91 c47886r91, C47886r91 c47886r912) {
        boolean z;
        boolean m16341l = c47886r91.m16341l(i);
        boolean m16341l2 = c47886r912.m16341l(i);
        if (!m16341l && !m16341l2) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    /* renamed from: m */
    public static int m16340m(int i, int i2) {
        if (i == -1) {
            return -1;
        }
        if (i == 1) {
            return 1;
        }
        return i2 == 0 ? 3 : 2;
    }

    /* renamed from: n */
    public static int m16339n(int i) {
        int m16350c = m16350c(i);
        if (m16350c != -1) {
            if (m16350c != 0) {
                if (m16350c != 1) {
                    return C47305qA3.f104818k;
                }
                return 2;
            }
            return C47305qA3.f104818k;
        }
        return 0;
    }

    /* renamed from: o */
    public static int m16338o(int i) {
        int m16350c = m16350c(i);
        if (m16350c != -1) {
            if (m16350c != 0) {
                if (m16350c != 1) {
                    return C47305qA3.f104818k;
                }
                return 0;
            }
            return C47305qA3.f104818k;
        }
        return 2;
    }

    /* renamed from: r */
    public static String m16335r(int i, boolean z) {
        if (m16346g(i)) {
            return "" + C47305qA3.m18031B(z);
        }
        return "";
    }

    /* renamed from: t */
    public static String m16333t(C52053yB0[] c52053yB0Arr) {
        String str;
        C52053yB0 c52053yB0 = c52053yB0Arr[0];
        C52053yB0 c52053yB02 = c52053yB0Arr[c52053yB0Arr.length - 1];
        if (c52053yB0Arr.length > 2) {
            str = ", " + C44204kw6.m28123u(c52053yB0Arr[1]);
        } else {
            str = "";
        }
        return C44204kw6.m28123u(c52053yB0) + str + " .. " + C44204kw6.m28123u(c52053yB02);
    }

    /* renamed from: a */
    public final void m16352a(J91 j91) {
        if (j91.m101079c() == 0) {
            this.f106554b = j91.m101080b();
            this.f106556d = j91.m101078d();
            this.f106555c = j91.m101081a();
            return;
        }
        this.f106557e = j91.m101080b();
        this.f106559g = j91.m101078d();
        this.f106558f = j91.m101081a();
    }

    /* renamed from: b */
    public C47305qA3 m16351b() {
        C47305qA3 c47305qA3 = new C47305qA3();
        m16344i(c47305qA3, 0, this.f106554b, this.f106555c, this.f106556d);
        m16344i(c47305qA3, 1, this.f106557e, this.f106558f, this.f106559g);
        return c47305qA3;
    }

    /* renamed from: d */
    public boolean m16349d() {
        int compareTo;
        C52053yB0[] m16347f = m16347f();
        if (m16347f.length >= 2) {
            C52053yB0 c52053yB0 = m16347f[0];
            C52053yB0 c52053yB02 = m16347f[1];
            C52053yB0 c52053yB03 = m16347f[m16347f.length - 1];
            C52053yB0 c52053yB04 = m16347f[m16347f.length - 2];
            int compareTo2 = c52053yB0.compareTo(c52053yB03);
            if (compareTo2 == 0) {
                compareTo2 = 0;
            }
            if (compareTo2 == 0 && (compareTo = c52053yB02.compareTo(c52053yB04)) != 0) {
                compareTo2 = compareTo;
            }
            if (compareTo2 != 0) {
                if (compareTo2 != -1) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Edge direction cannot be determined because endpoints are equal");
        }
        throw new IllegalStateException("Edge must have >= 2 points");
    }

    /* renamed from: e */
    public C52053yB0 m16348e(int i) {
        return this.f106553a[i];
    }

    /* renamed from: f */
    public C52053yB0[] m16347f() {
        return this.f106553a;
    }

    /* renamed from: l */
    public final boolean m16341l(int i) {
        if (i == 0) {
            if (this.f106554b == 2 && !this.f106556d) {
                return true;
            }
            return false;
        } else if (this.f106557e == 2 && !this.f106559g) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    public void m16337p(C47886r91 c47886r91) {
        this.f106556d = m16342k(0, this, c47886r91);
        int i = 1;
        this.f106559g = m16342k(1, this, c47886r91);
        int i2 = c47886r91.f106554b;
        if (i2 > this.f106554b) {
            this.f106554b = i2;
        }
        int i3 = c47886r91.f106557e;
        if (i3 > this.f106557e) {
            this.f106557e = i3;
        }
        if (!m16336q(c47886r91)) {
            i = -1;
        }
        this.f106555c += c47886r91.f106555c * i;
        this.f106558f += i * c47886r91.f106558f;
    }

    /* renamed from: q */
    public boolean m16336q(C47886r91 c47886r91) {
        if (!m16348e(0).m3886g(c47886r91.m16348e(0)) || !m16348e(1).m3886g(c47886r91.m16348e(1))) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public int m16334s() {
        return this.f106553a.length;
    }

    public String toString() {
        String m16333t = m16333t(this.f106553a);
        String m16345h = m16345h(0, this.f106554b, this.f106556d, this.f106555c);
        String m16345h2 = m16345h(1, this.f106557e, this.f106559g, this.f106558f);
        return "Edge( " + m16333t + " ) " + m16345h + "/" + m16345h2;
    }
}
