package p000;
/* renamed from: nA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45526nA3 extends FE1 {

    /* renamed from: d */
    public C52053yB0[] f99545d;

    /* renamed from: e */
    public boolean f99546e;

    /* renamed from: f */
    public C52053yB0 f99547f;

    /* renamed from: g */
    public C47305qA3 f99548g;

    /* renamed from: h */
    public boolean f99549h;

    /* renamed from: i */
    public boolean f99550i;

    /* renamed from: j */
    public boolean f99551j;

    /* renamed from: k */
    public C45526nA3 f99552k;

    /* renamed from: l */
    public C46119oA3 f99553l;

    /* renamed from: m */
    public C40907fO2 f99554m;

    /* renamed from: n */
    public C45526nA3 f99555n;

    public C45526nA3(C52053yB0 c52053yB0, C52053yB0 c52053yB02, boolean z, C47305qA3 c47305qA3, C52053yB0[] c52053yB0Arr) {
        super(c52053yB0);
        this.f99549h = false;
        this.f99550i = false;
        this.f99551j = false;
        this.f99547f = c52053yB02;
        this.f99546e = z;
        this.f99545d = c52053yB0Arr;
        this.f99548g = c47305qA3;
    }

    /* renamed from: r */
    public static C45526nA3 m24243r(C52053yB0[] c52053yB0Arr, C47305qA3 c47305qA3, boolean z) {
        C52053yB0 c52053yB0;
        C52053yB0 c52053yB02;
        if (z) {
            C52053yB0 c52053yB03 = c52053yB0Arr[0];
            c52053yB0 = c52053yB0Arr[1];
            c52053yB02 = c52053yB03;
        } else {
            int length = c52053yB0Arr.length - 1;
            C52053yB0 c52053yB04 = c52053yB0Arr[length];
            c52053yB0 = c52053yB0Arr[length - 1];
            c52053yB02 = c52053yB04;
        }
        return new C45526nA3(c52053yB02, c52053yB0, z, c47305qA3, c52053yB0Arr);
    }

    /* renamed from: s */
    public static C45526nA3 m24242s(C52053yB0[] c52053yB0Arr, C47305qA3 c47305qA3) {
        C45526nA3 m24243r = m24243r(c52053yB0Arr, c47305qA3, true);
        m24243r.m107415k(m24243r(c52053yB0Arr, c47305qA3, false));
        return m24243r;
    }

    /* renamed from: A */
    public boolean m24267A() {
        return this.f99549h || this.f99550i;
    }

    /* renamed from: B */
    public boolean m24266B() {
        return this.f99549h;
    }

    /* renamed from: C */
    public boolean m24265C() {
        return this.f99549h && m24247U().f99549h;
    }

    /* renamed from: D */
    public boolean m24264D() {
        return m24267A() || m24247U().m24267A();
    }

    /* renamed from: E */
    public boolean m24263E() {
        return this.f99550i;
    }

    /* renamed from: F */
    public boolean m24262F() {
        return this.f99552k != null;
    }

    /* renamed from: G */
    public boolean m24261G() {
        return this.f99555n != null;
    }

    /* renamed from: H */
    public boolean m24260H() {
        return this.f99551j;
    }

    /* renamed from: I */
    public void m24259I() {
        this.f99549h = true;
    }

    /* renamed from: J */
    public void m24258J() {
        this.f99550i = true;
        m24247U().f99550i = true;
    }

    /* renamed from: K */
    public final void m24257K() {
        this.f99551j = true;
    }

    /* renamed from: L */
    public void m24256L() {
        m24257K();
        m24247U().m24257K();
    }

    /* renamed from: M */
    public C45526nA3 m24255M() {
        return this.f99552k;
    }

    /* renamed from: N */
    public C45526nA3 m24254N() {
        return this.f99555n;
    }

    /* renamed from: O */
    public C45526nA3 m24253O() {
        return (C45526nA3) m107414l();
    }

    /* renamed from: P */
    public final String m24252P() {
        if (this.f99549h) {
            return " resA";
        }
        if (this.f99550i) {
            return " resL";
        }
        return "";
    }

    /* renamed from: Q */
    public void m24251Q(C46119oA3 c46119oA3) {
        this.f99553l = c46119oA3;
    }

    /* renamed from: R */
    public void m24250R(C40907fO2 c40907fO2) {
        this.f99554m = c40907fO2;
    }

    /* renamed from: S */
    public void m24249S(C45526nA3 c45526nA3) {
        this.f99552k = c45526nA3;
    }

    /* renamed from: T */
    public void m24248T(C45526nA3 c45526nA3) {
        this.f99555n = c45526nA3;
    }

    /* renamed from: U */
    public C45526nA3 m24247U() {
        return (C45526nA3) m107410p();
    }

    /* renamed from: V */
    public void m24246V() {
        this.f99549h = false;
        m24247U().f99549h = false;
    }

    @Override // p000.FE1
    /* renamed from: e */
    public C52053yB0 mo24245e() {
        return this.f99547f;
    }

    /* renamed from: q */
    public void m24244q(DB0 db0) {
        int i;
        if (db0.size() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f99546e) {
            int i2 = i ^ 1;
            while (true) {
                C52053yB0[] c52053yB0Arr = this.f99545d;
                if (i2 < c52053yB0Arr.length) {
                    db0.m110797f(c52053yB0Arr[i2], false);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            C52053yB0[] c52053yB0Arr2 = this.f99545d;
            int length = c52053yB0Arr2.length - 2;
            if (i != 0) {
                length = c52053yB0Arr2.length - 1;
            }
            while (length >= 0) {
                db0.m110797f(this.f99545d[length], false);
                length--;
            }
        }
    }

    /* renamed from: t */
    public C52053yB0 m24241t() {
        return m107413m();
    }

    @Override // p000.FE1
    public String toString() {
        String str;
        C52053yB0 m107413m = m107413m();
        C52053yB0 m107421d = m107421d();
        if (this.f99545d.length > 2) {
            str = ", " + C44204kw6.m28123u(mo24245e());
        } else {
            str = "";
        }
        return "OE( " + C44204kw6.m28123u(m107413m) + str + " .. " + C44204kw6.m28123u(m107421d) + " ) " + this.f99548g.m18027F(this.f99546e) + m24252P() + " / Sym: " + m24247U().m24237x().m18027F(m24247U().f99546e) + m24247U().m24252P();
    }

    /* renamed from: u */
    public C52053yB0[] m24240u() {
        if (this.f99546e) {
            return this.f99545d;
        }
        C52053yB0[] c52053yB0Arr = (C52053yB0[]) this.f99545d.clone();
        BB0.m114278h(c52053yB0Arr);
        return c52053yB0Arr;
    }

    /* renamed from: v */
    public C46119oA3 m24239v() {
        return this.f99553l;
    }

    /* renamed from: w */
    public C40907fO2 m24238w() {
        return this.f99554m;
    }

    /* renamed from: x */
    public C47305qA3 m24237x() {
        return this.f99548g;
    }

    /* renamed from: y */
    public int m24236y(int i, int i2) {
        return this.f99548g.m18023d(i, i2, this.f99546e);
    }

    /* renamed from: z */
    public boolean m24235z() {
        return this.f99546e;
    }
}
