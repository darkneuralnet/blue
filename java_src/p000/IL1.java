package p000;

import p000.C46610p01;
/* renamed from: IL1 */
/* loaded from: classes.dex */
public class IL1 extends AbstractC41387gB6 {
    public IL1(C43042iz0 c43042iz0) {
        super(c43042iz0);
    }

    @Override // p000.AbstractC41387gB6, p000.InterfaceC44238l01
    /* renamed from: a */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        C1263Cy c1263Cy = (C1263Cy) this.f81750b;
        int m111198z1 = c1263Cy.m111198z1();
        int i = 0;
        int i2 = -1;
        for (C46610p01 c46610p01 : this.f81756h.f102912l) {
            int i3 = c46610p01.f102907g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m111198z1 != 0 && m111198z1 != 2) {
            this.f81756h.mo20170d(i + c1263Cy.m111206A1());
        } else {
            this.f81756h.mo20170d(i2 + c1263Cy.m111206A1());
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: d */
    public void mo5648d() {
        C43042iz0 c43042iz0 = this.f81750b;
        if (c43042iz0 instanceof C1263Cy) {
            this.f81756h.f102902b = true;
            C1263Cy c1263Cy = (C1263Cy) c43042iz0;
            int m111198z1 = c1263Cy.m111198z1();
            boolean m111199y1 = c1263Cy.m111199y1();
            int i = 0;
            if (m111198z1 != 0) {
                if (m111198z1 != 1) {
                    if (m111198z1 != 2) {
                        if (m111198z1 == 3) {
                            this.f81756h.f102905e = C46610p01.EnumC27118a.BOTTOM;
                            while (i < c1263Cy.f17386W0) {
                                C43042iz0 c43042iz02 = c1263Cy.f17385V0[i];
                                if (m111199y1 || c43042iz02.m31393X() != 8) {
                                    C46610p01 c46610p01 = c43042iz02.f91893f.f81757i;
                                    c46610p01.f102911k.add(this.f81756h);
                                    this.f81756h.f102912l.add(c46610p01);
                                }
                                i++;
                            }
                            m102472q(this.f81750b.f91893f.f81756h);
                            m102472q(this.f81750b.f91893f.f81757i);
                            return;
                        }
                        return;
                    }
                    this.f81756h.f102905e = C46610p01.EnumC27118a.TOP;
                    while (i < c1263Cy.f17386W0) {
                        C43042iz0 c43042iz03 = c1263Cy.f17385V0[i];
                        if (m111199y1 || c43042iz03.m31393X() != 8) {
                            C46610p01 c46610p012 = c43042iz03.f91893f.f81756h;
                            c46610p012.f102911k.add(this.f81756h);
                            this.f81756h.f102912l.add(c46610p012);
                        }
                        i++;
                    }
                    m102472q(this.f81750b.f91893f.f81756h);
                    m102472q(this.f81750b.f91893f.f81757i);
                    return;
                }
                this.f81756h.f102905e = C46610p01.EnumC27118a.RIGHT;
                while (i < c1263Cy.f17386W0) {
                    C43042iz0 c43042iz04 = c1263Cy.f17385V0[i];
                    if (m111199y1 || c43042iz04.m31393X() != 8) {
                        C46610p01 c46610p013 = c43042iz04.f91891e.f81757i;
                        c46610p013.f102911k.add(this.f81756h);
                        this.f81756h.f102912l.add(c46610p013);
                    }
                    i++;
                }
                m102472q(this.f81750b.f91891e.f81756h);
                m102472q(this.f81750b.f91891e.f81757i);
                return;
            }
            this.f81756h.f102905e = C46610p01.EnumC27118a.LEFT;
            while (i < c1263Cy.f17386W0) {
                C43042iz0 c43042iz05 = c1263Cy.f17385V0[i];
                if (m111199y1 || c43042iz05.m31393X() != 8) {
                    C46610p01 c46610p014 = c43042iz05.f91891e.f81756h;
                    c46610p014.f102911k.add(this.f81756h);
                    this.f81756h.f102912l.add(c46610p014);
                }
                i++;
            }
            m102472q(this.f81750b.f91891e.f81756h);
            m102472q(this.f81750b.f91891e.f81757i);
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: e */
    public void mo5647e() {
        C43042iz0 c43042iz0 = this.f81750b;
        if (c43042iz0 instanceof C1263Cy) {
            int m111198z1 = ((C1263Cy) c43042iz0).m111198z1();
            if (m111198z1 != 0 && m111198z1 != 1) {
                this.f81750b.m31343r1(this.f81756h.f102907g);
            } else {
                this.f81750b.m31346q1(this.f81756h.f102907g);
            }
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: f */
    public void mo5646f() {
        this.f81751c = null;
        this.f81756h.m20171c();
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: m */
    public boolean mo5645m() {
        return false;
    }

    /* renamed from: q */
    public final void m102472q(C46610p01 c46610p01) {
        this.f81756h.f102911k.add(c46610p01);
        c46610p01.f102912l.add(this.f81756h);
    }
}
