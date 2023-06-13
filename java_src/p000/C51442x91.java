package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: x91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C51442x91 extends C50256v91 {

    /* renamed from: j */
    public List f117138j;

    public C51442x91(InterfaceC49573u00 interfaceC49573u00, C50256v91 c50256v91) {
        super(c50256v91.mo9128e(), c50256v91.m9130c(), c50256v91.m9129d(), new C35926Sl2(c50256v91.mo5787f()));
        this.f117138j = new ArrayList();
        m5783m(c50256v91);
    }

    @Override // p000.C50256v91
    /* renamed from: b */
    public void mo5788b(InterfaceC49573u00 interfaceC49573u00) {
        Iterator m5782n = m5782n();
        boolean z = false;
        while (m5782n.hasNext()) {
            if (((C50256v91) m5782n.next()).mo5787f().m84871g()) {
                z = true;
            }
        }
        if (z) {
            this.f113600c = new C35926Sl2(-1, -1, -1);
        } else {
            this.f113600c = new C35926Sl2(-1);
        }
        for (int i = 0; i < 2; i++) {
            m5786j(i, interfaceC49573u00);
            if (z) {
                m5784l(i);
            }
        }
    }

    @Override // p000.C50256v91
    /* renamed from: f */
    public C35926Sl2 mo5787f() {
        return this.f113600c;
    }

    /* renamed from: j */
    public final void m5786j(int i, InterfaceC49573u00 interfaceC49573u00) {
        Iterator m5782n = m5782n();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (m5782n.hasNext()) {
            int m84874d = ((C50256v91) m5782n.next()).mo5787f().m84874d(i);
            if (m84874d == 1) {
                i3++;
            }
            if (m84874d == 0) {
                z = true;
            }
        }
        if (!z) {
            i2 = -1;
        }
        if (i3 > 0) {
            i2 = C39002cC1.m61698w(interfaceC49573u00, i3);
        }
        this.f113600c.m84864n(i, i2);
    }

    /* renamed from: k */
    public final void m5785k(int i, int i2) {
        Iterator m5782n = m5782n();
        while (m5782n.hasNext()) {
            C50256v91 c50256v91 = (C50256v91) m5782n.next();
            if (c50256v91.mo5787f().m84871g()) {
                int m84873e = c50256v91.mo5787f().m84873e(i, i2);
                if (m84873e == 0) {
                    this.f113600c.m84863o(i, i2, 0);
                    return;
                } else if (m84873e == 2) {
                    this.f113600c.m84863o(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m5784l(int i) {
        m5785k(i, 1);
        m5785k(i, 2);
    }

    /* renamed from: m */
    public void m5783m(C50256v91 c50256v91) {
        this.f117138j.add(c50256v91);
    }

    /* renamed from: n */
    public Iterator m5782n() {
        return this.f117138j.iterator();
    }

    /* renamed from: o */
    public void m5781o(P62 p62) {
        C47293q91.m18058x(this.f113600c, p62);
    }

    public C51442x91(C50256v91 c50256v91) {
        this(null, c50256v91);
    }
}
