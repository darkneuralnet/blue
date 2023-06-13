package p000;
/* renamed from: q91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47293q91 extends SD1 {

    /* renamed from: f */
    public C52053yB0[] f104783f;

    /* renamed from: h */
    public String f104785h;

    /* renamed from: i */
    public EV2 f104786i;

    /* renamed from: g */
    public B91 f104784g = new B91(this);

    /* renamed from: j */
    public boolean f104787j = true;

    /* renamed from: k */
    public C47796r01 f104788k = new C47796r01();

    /* renamed from: l */
    public int f104789l = 0;

    public C47293q91(C52053yB0[] c52053yB0Arr, C35926Sl2 c35926Sl2) {
        this.f104783f = c52053yB0Arr;
        this.f33341a = c35926Sl2;
    }

    /* renamed from: x */
    public static void m18058x(C35926Sl2 c35926Sl2, P62 p62) {
        p62.m90805q(c35926Sl2.m84873e(0, 0), c35926Sl2.m84873e(1, 0), 1);
        if (c35926Sl2.m84871g()) {
            p62.m90805q(c35926Sl2.m84873e(0, 1), c35926Sl2.m84873e(1, 1), 2);
            p62.m90805q(c35926Sl2.m84873e(0, 2), c35926Sl2.m84873e(1, 2), 2);
        }
    }

    @Override // p000.SD1
    /* renamed from: a */
    public void mo18074a(P62 p62) {
        m18058x(this.f33341a, p62);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C47293q91)) {
            return false;
        }
        C47293q91 c47293q91 = (C47293q91) obj;
        C52053yB0[] c52053yB0Arr = this.f104783f;
        if (c52053yB0Arr.length != c47293q91.f104783f.length) {
            return false;
        }
        int length = c52053yB0Arr.length;
        int i = 0;
        boolean z = true;
        boolean z2 = true;
        while (true) {
            C52053yB0[] c52053yB0Arr2 = this.f104783f;
            if (i >= c52053yB0Arr2.length) {
                return true;
            }
            if (!c52053yB0Arr2[i].m3886g(c47293q91.f104783f[i])) {
                z = false;
            }
            length--;
            if (!this.f104783f[i].m3886g(c47293q91.f104783f[length])) {
                z2 = false;
            }
            if (!z && !z2) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        C52053yB0[] c52053yB0Arr = this.f104783f;
        int length = c52053yB0Arr.length + 31;
        if (c52053yB0Arr.length > 0) {
            C52053yB0 c52053yB0 = c52053yB0Arr[0];
            C52053yB0 c52053yB02 = c52053yB0Arr[c52053yB0Arr.length - 1];
            if (1 == c52053yB0.compareTo(c52053yB02)) {
                C52053yB0[] c52053yB0Arr2 = this.f104783f;
                c52053yB0 = c52053yB0Arr2[c52053yB0Arr2.length - 1];
                c52053yB02 = c52053yB0Arr2[0];
            }
            return (((length * 31) + c52053yB0.hashCode()) * 31) + c52053yB02.hashCode();
        }
        return length;
    }

    /* renamed from: i */
    public void m18073i(AbstractC48893sr2 abstractC48893sr2, int i, int i2, int i3) {
        C52053yB0 c52053yB0 = new C52053yB0(abstractC48893sr2.m13585f(i3));
        double m13586e = abstractC48893sr2.m13586e(i2, i3);
        int i4 = i + 1;
        C52053yB0[] c52053yB0Arr = this.f104783f;
        if (i4 < c52053yB0Arr.length && c52053yB0.m3886g(c52053yB0Arr[i4])) {
            m13586e = 0.0d;
            i = i4;
        }
        this.f104784g.m114328a(c52053yB0, i, m13586e);
    }

    /* renamed from: j */
    public void m18072j(AbstractC48893sr2 abstractC48893sr2, int i, int i2) {
        for (int i3 = 0; i3 < abstractC48893sr2.m13584g(); i3++) {
            m18073i(abstractC48893sr2, i, i2, i3);
        }
    }

    /* renamed from: k */
    public C47293q91 m18071k() {
        C52053yB0[] c52053yB0Arr = this.f104783f;
        return new C47293q91(new C52053yB0[]{c52053yB0Arr[0], c52053yB0Arr[1]}, C35926Sl2.m84861q(this.f33341a));
    }

    /* renamed from: l */
    public C52053yB0 m18070l() {
        C52053yB0[] c52053yB0Arr = this.f104783f;
        if (c52053yB0Arr.length > 0) {
            return c52053yB0Arr[0];
        }
        return null;
    }

    /* renamed from: m */
    public C52053yB0 m18069m(int i) {
        return this.f104783f[i];
    }

    /* renamed from: n */
    public C52053yB0[] m18068n() {
        return this.f104783f;
    }

    /* renamed from: o */
    public C47796r01 m18067o() {
        return this.f104788k;
    }

    /* renamed from: p */
    public B91 m18066p() {
        return this.f104784g;
    }

    /* renamed from: q */
    public EV2 m18065q() {
        if (this.f104786i == null) {
            this.f104786i = new EV2(this);
        }
        return this.f104786i;
    }

    /* renamed from: r */
    public int m18064r() {
        return this.f104783f.length;
    }

    /* renamed from: s */
    public boolean m18063s() {
        C52053yB0[] c52053yB0Arr = this.f104783f;
        return c52053yB0Arr[0].equals(c52053yB0Arr[c52053yB0Arr.length - 1]);
    }

    /* renamed from: t */
    public boolean m18062t() {
        if (!this.f33341a.m84871g()) {
            return false;
        }
        C52053yB0[] c52053yB0Arr = this.f104783f;
        if (c52053yB0Arr.length != 3 || !c52053yB0Arr[0].equals(c52053yB0Arr[2])) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("edge " + this.f104785h + ": ");
        sb.append("LINESTRING (");
        for (int i = 0; i < this.f104783f.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.f104783f[i].f118922b + " " + this.f104783f[i].f118923c);
        }
        sb.append(")  " + this.f33341a + " " + this.f104789l);
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m18061u() {
        return this.f104787j;
    }

    /* renamed from: v */
    public boolean m18060v(C47293q91 c47293q91) {
        if (this.f104783f.length != c47293q91.f104783f.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C52053yB0[] c52053yB0Arr = this.f104783f;
            if (i < c52053yB0Arr.length) {
                if (!c52053yB0Arr[i].m3886g(c47293q91.f104783f[i])) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: w */
    public void m18059w(boolean z) {
        this.f104787j = z;
    }
}
