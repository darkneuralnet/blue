package p000;

import java.io.IOException;
import p000.LH6;
import p000.TH6;
/* renamed from: k64  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43708k64 {
    /* renamed from: a */
    public static short[] m29290a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = DD3.m110676h(bArr, i * 2);
        }
        return sArr;
    }

    /* renamed from: b */
    public static C19599cp m29289b(C44301l64 c44301l64) throws IOException {
        C5448N m105700j = c44301l64.m27862s().m105700j();
        if (m105700j.m94510J(InterfaceC25813lv.f96914W)) {
            return new C48735sb4(C33329Hi6.m103509e(c44301l64.m27862s()), AbstractC5803O.m93018A(c44301l64.m27859w()).m93017C());
        } else if (m105700j.m86135u(InterfaceC25813lv.f96944s)) {
            return new C49972ug5(AbstractC5803O.m93018A(c44301l64.m27859w()).m93017C(), C33329Hi6.m103507g(C48786sg5.m13849j(c44301l64.m27862s().m105698s())));
        } else {
            if (m105700j.m86135u(InterfaceC25813lv.f96929f0)) {
                return new C40997fY2(m29290a(AbstractC5803O.m93018A(c44301l64.m27859w()).m93017C()));
            }
            if (m105700j.m86135u(InterfaceC52074yD3.f119005I0)) {
                byte[] m93017C = AbstractC5803O.m93018A(c44301l64.m27859w()).m93017C();
                AbstractC0808C m27861u = c44301l64.m27861u();
                if (DD3.m110683a(m93017C, 0) == 1) {
                    if (m27861u != null) {
                        byte[] m113148C = m27861u.m113148C();
                        return C34054Kl2.m98312f(C0210Ao.m115247h(m93017C, 4, m93017C.length), C0210Ao.m115247h(m113148C, 4, m113148C.length));
                    }
                    return C34054Kl2.m98313e(C0210Ao.m115247h(m93017C, 4, m93017C.length));
                } else if (m27861u != null) {
                    return CE1.m112602b(C0210Ao.m115247h(m93017C, 4, m93017C.length), m27861u.m113148C());
                } else {
                    return CE1.m112603a(C0210Ao.m115247h(m93017C, 4, m93017C.length));
                }
            } else if (m105700j.m86135u(InterfaceC25813lv.f96948w)) {
                FH6 m107355o = FH6.m107355o(c44301l64.m27862s().m105698s());
                C5448N m105700j2 = m107355o.m107354s().m105700j();
                SH6 m85778s = SH6.m85778s(c44301l64.m27859w());
                try {
                    TH6.C7751b m83951o = new TH6.C7751b(new RH6(m107355o.m107356j(), C33329Hi6.m103512b(m105700j2))).m83954l(m85778s.m85779o()).m83949q(m85778s.m85773y()).m83950p(m85778s.m85774x()).m83952n(m85778s.m85776v()).m83951o(m85778s.m85775w());
                    if (m85778s.m85772z() != 0) {
                        m83951o.m83953m(m85778s.m85777u());
                    }
                    if (m85778s.m85780j() != null) {
                        m83951o.m83955k(((C29993wv) WH6.m78616f(m85778s.m85780j(), C29993wv.class)).m6106h(m105700j2));
                    }
                    return m83951o.m83956j();
                } catch (ClassNotFoundException e) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
                }
            } else if (!m105700j.m86135u(BD3.f2050F)) {
                if (m105700j.m86135u(BD3.f2083n)) {
                    C43279jO2 m30731u = C43279jO2.m30731u(c44301l64.m27859w());
                    return new C43872kO2(m30731u.m30729w(), m30731u.m30730v(), m30731u.m30733o(), m30731u.m30732s(), m30731u.m30728x(), C33329Hi6.m103511c(m30731u.m30734j().m105700j()));
                }
                throw new RuntimeException("algorithm identifier in private key not recognised");
            } else {
                IH6 m102558o = IH6.m102558o(c44301l64.m27862s().m105698s());
                C5448N m105700j3 = m102558o.m102556u().m105700j();
                try {
                    KH6 m99047s = KH6.m99047s(c44301l64.m27859w());
                    LH6.C4794b m97378p = new LH6.C4794b(new JH6(m102558o.m102559j(), m102558o.m102557s(), C33329Hi6.m103512b(m105700j3))).m97381m(m99047s.m99048o()).m97376r(m99047s.m99042y()).m97377q(m99047s.m99043x()).m97379o(m99047s.m99045v()).m97378p(m99047s.m99044w());
                    if (m99047s.m99041z() != 0) {
                        m97378p.m97380n(m99047s.m99046u());
                    }
                    if (m99047s.m99049j() != null) {
                        m97378p.m97382l(((C30340xv) WH6.m78616f(m99047s.m99049j(), C30340xv.class)).m4440f(m105700j3));
                    }
                    return m97378p.m97383k();
                } catch (ClassNotFoundException e2) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
                }
            }
        }
    }
}
