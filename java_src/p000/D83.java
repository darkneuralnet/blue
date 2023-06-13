package p000;
/* renamed from: D83 */
/* loaded from: classes8.dex */
public class D83 extends SD1 {

    /* renamed from: f */
    public C52053yB0 f5273f;

    /* renamed from: g */
    public AbstractC52628z91 f5274g;

    public D83(C52053yB0 c52053yB0, AbstractC52628z91 abstractC52628z91) {
        this.f5273f = c52053yB0;
        this.f5274g = abstractC52628z91;
        this.f33341a = new C35926Sl2(0, -1);
    }

    @Override // p000.SD1
    /* renamed from: a */
    public void mo18074a(P62 p62) {
    }

    /* renamed from: i */
    public void m110885i(C50256v91 c50256v91) {
        this.f5274g.mo1756g(c50256v91);
        c50256v91.m9125i(this);
    }

    /* renamed from: j */
    public C52053yB0 m110884j() {
        return this.f5273f;
    }

    /* renamed from: k */
    public AbstractC52628z91 m110883k() {
        return this.f5274g;
    }

    /* renamed from: l */
    public boolean m110882l() {
        for (C43685k41 c43685k41 : m110883k().m1758e()) {
            if (c43685k41.mo9128e().m85835e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m110881m() {
        return this.f33341a.m84875c() == 1;
    }

    /* renamed from: n */
    public void m110880n(int i, int i2) {
        C35926Sl2 c35926Sl2 = this.f33341a;
        if (c35926Sl2 == null) {
            this.f33341a = new C35926Sl2(i, i2);
        } else {
            c35926Sl2.m84864n(i, i2);
        }
    }

    /* renamed from: o */
    public void m110879o(int i) {
        int i2;
        C35926Sl2 c35926Sl2 = this.f33341a;
        if (c35926Sl2 == null) {
            return;
        }
        if (c35926Sl2 != null) {
            i2 = c35926Sl2.m84874d(i);
        } else {
            i2 = -1;
        }
        int i3 = 1;
        if (i2 != 0 && i2 == 1) {
            i3 = 0;
        }
        this.f33341a.m84864n(i, i3);
    }
}
