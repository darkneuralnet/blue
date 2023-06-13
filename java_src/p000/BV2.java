package p000;
/* renamed from: BV2 */
/* loaded from: classes8.dex */
public class BV2 {

    /* renamed from: a */
    public C52053yB0[] f2415a;

    /* renamed from: b */
    public int f2416b;

    /* renamed from: c */
    public int f2417c;

    /* renamed from: d */
    public C48772sf1 f2418d = null;

    /* renamed from: e */
    public Object f2419e;

    /* renamed from: f */
    public int f2420f;

    public BV2(C52053yB0[] c52053yB0Arr, int i, int i2, Object obj) {
        this.f2415a = c52053yB0Arr;
        this.f2416b = i;
        this.f2417c = i2;
        this.f2419e = obj;
    }

    /* renamed from: a */
    public final void m113972a(int i, int i2, BV2 bv2, int i3, int i4, double d, GV2 gv2) {
        int i5;
        int i6;
        int i7;
        if (i2 - i == 1 && i4 - i3 == 1) {
            gv2.mo105048b(this, i, bv2, i3);
        } else if (!m113966g(i, i2, bv2, i3, i4, d)) {
        } else {
            int i8 = (i + i2) / 2;
            int i9 = (i3 + i4) / 2;
            if (i < i8) {
                if (i3 < i9) {
                    i5 = i9;
                    i7 = i8;
                    m113972a(i, i8, bv2, i3, i9, d, gv2);
                } else {
                    i5 = i9;
                    i7 = i8;
                }
                if (i5 < i4) {
                    m113972a(i, i7, bv2, i5, i4, d, gv2);
                }
                i8 = i7;
            } else {
                i5 = i9;
            }
            if (i8 < i2) {
                if (i3 < i5) {
                    i6 = i8;
                    m113972a(i8, i2, bv2, i3, i5, d, gv2);
                } else {
                    i6 = i8;
                }
                if (i5 < i4) {
                    m113972a(i6, i2, bv2, i5, i4, d, gv2);
                }
            }
        }
    }

    /* renamed from: b */
    public void m113971b(BV2 bv2, double d, GV2 gv2) {
        m113972a(this.f2416b, this.f2417c, bv2, bv2.f2416b, bv2.f2417c, d, gv2);
    }

    /* renamed from: c */
    public Object m113970c() {
        return this.f2419e;
    }

    /* renamed from: d */
    public C48772sf1 m113969d(double d) {
        if (this.f2418d == null) {
            C52053yB0[] c52053yB0Arr = this.f2415a;
            C48772sf1 c48772sf1 = new C48772sf1(c52053yB0Arr[this.f2416b], c52053yB0Arr[this.f2417c]);
            this.f2418d = c48772sf1;
            if (d > 0.0d) {
                c48772sf1.m13877h(d);
            }
        }
        return this.f2418d;
    }

    /* renamed from: e */
    public int m113968e() {
        return this.f2420f;
    }

    /* renamed from: f */
    public void m113967f(int i, C31768Ar2 c31768Ar2) {
        C52053yB0[] c52053yB0Arr = this.f2415a;
        c31768Ar2.f1204b = c52053yB0Arr[i];
        c31768Ar2.f1205c = c52053yB0Arr[i + 1];
    }

    /* renamed from: g */
    public final boolean m113966g(int i, int i2, BV2 bv2, int i3, int i4, double d) {
        if (d > 0.0d) {
            C52053yB0[] c52053yB0Arr = this.f2415a;
            C52053yB0 c52053yB0 = c52053yB0Arr[i];
            C52053yB0 c52053yB02 = c52053yB0Arr[i2];
            C52053yB0[] c52053yB0Arr2 = bv2.f2415a;
            return m113965h(c52053yB0, c52053yB02, c52053yB0Arr2[i3], c52053yB0Arr2[i4], d);
        }
        C52053yB0[] c52053yB0Arr3 = this.f2415a;
        C52053yB0 c52053yB03 = c52053yB0Arr3[i];
        C52053yB0 c52053yB04 = c52053yB0Arr3[i2];
        C52053yB0[] c52053yB0Arr4 = bv2.f2415a;
        return C48772sf1.m13888J(c52053yB03, c52053yB04, c52053yB0Arr4[i3], c52053yB0Arr4[i4]);
    }

    /* renamed from: h */
    public final boolean m113965h(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04, double d) {
        double min = Math.min(c52053yB03.f118922b, c52053yB04.f118922b);
        double max = Math.max(c52053yB03.f118922b, c52053yB04.f118922b);
        double min2 = Math.min(c52053yB0.f118922b, c52053yB02.f118922b);
        double max2 = Math.max(c52053yB0.f118922b, c52053yB02.f118922b);
        if (min2 > max + d || max2 < min - d) {
            return false;
        }
        double min3 = Math.min(c52053yB03.f118923c, c52053yB04.f118923c);
        double max3 = Math.max(c52053yB03.f118923c, c52053yB04.f118923c);
        double min4 = Math.min(c52053yB0.f118923c, c52053yB02.f118923c);
        double max4 = Math.max(c52053yB0.f118923c, c52053yB02.f118923c);
        if (min4 > max3 + d || max4 < min3 - d) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m113964i(int i) {
        this.f2420f = i;
    }
}
