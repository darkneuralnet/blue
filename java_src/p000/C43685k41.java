package p000;
/* renamed from: k41  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43685k41 extends C50256v91 {

    /* renamed from: j */
    public boolean f93847j;

    /* renamed from: k */
    public boolean f93848k;

    /* renamed from: l */
    public boolean f93849l;

    /* renamed from: m */
    public C43685k41 f93850m;

    /* renamed from: n */
    public C43685k41 f93851n;

    /* renamed from: o */
    public C43685k41 f93852o;

    /* renamed from: p */
    public H91 f93853p;

    /* renamed from: q */
    public H91 f93854q;

    /* renamed from: r */
    public int[] f93855r;

    public C43685k41(C47293q91 c47293q91, boolean z) {
        super(c47293q91);
        this.f93848k = false;
        this.f93849l = false;
        this.f93855r = new int[]{0, -999, -999};
        this.f93847j = z;
        if (z) {
            m9126h(c47293q91.m18069m(0), c47293q91.m18069m(1));
        } else {
            int m18064r = c47293q91.m18064r() - 1;
            m9126h(c47293q91.m18069m(m18064r), c47293q91.m18069m(m18064r - 1));
        }
        m29375j();
    }

    /* renamed from: E */
    public void m29380E(C43685k41 c43685k41) {
        this.f93851n = c43685k41;
    }

    /* renamed from: F */
    public void m29379F(C43685k41 c43685k41) {
        this.f93852o = c43685k41;
    }

    /* renamed from: H */
    public void m29378H(C43685k41 c43685k41) {
        this.f93850m = c43685k41;
    }

    /* renamed from: J */
    public void m29377J(boolean z) {
        this.f93849l = z;
    }

    /* renamed from: K */
    public void m29376K(boolean z) {
        m29377J(z);
        this.f93850m.m29377J(z);
    }

    @Override // p000.C50256v91
    /* renamed from: e */
    public C47293q91 mo9128e() {
        return this.f113599b;
    }

    /* renamed from: j */
    public final void m29375j() {
        C35926Sl2 c35926Sl2 = new C35926Sl2(this.f113599b.m85838b());
        this.f113600c = c35926Sl2;
        if (!this.f93847j) {
            c35926Sl2.m84876b();
        }
    }

    /* renamed from: k */
    public H91 m29374k() {
        return this.f93853p;
    }

    /* renamed from: l */
    public H91 m29373l() {
        return this.f93854q;
    }

    /* renamed from: m */
    public C43685k41 m29372m() {
        return this.f93851n;
    }

    /* renamed from: n */
    public C43685k41 m29371n() {
        return this.f93852o;
    }

    /* renamed from: o */
    public C43685k41 m29370o() {
        return this.f93850m;
    }

    /* renamed from: p */
    public boolean m29369p() {
        return this.f93847j;
    }

    /* renamed from: q */
    public boolean m29368q() {
        return this.f93848k;
    }

    /* renamed from: r */
    public boolean m29367r() {
        boolean z = true;
        for (int i = 0; i < 2; i++) {
            if (!this.f113600c.m84870h(i) || this.f113600c.m84873e(i, 1) != 0 || this.f113600c.m84873e(i, 2) != 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: s */
    public boolean m29366s() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f113600c.m84869i(0) && !this.f113600c.m84869i(1)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f113600c.m84870h(0) && !this.f113600c.m84877a(0, 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f113600c.m84870h(1) && !this.f113600c.m84877a(1, 2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m29365t() {
        return this.f93849l;
    }

    /* renamed from: u */
    public void m29364u(H91 h91) {
        this.f93853p = h91;
    }

    /* renamed from: v */
    public void m29363v(boolean z) {
        this.f93848k = z;
    }

    /* renamed from: w */
    public void m29362w(H91 h91) {
        this.f93854q = h91;
    }
}
