package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: l41  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44278l41 extends AbstractC52628z91 {

    /* renamed from: d */
    public List f95424d;

    /* renamed from: e */
    public C35926Sl2 f95425e;

    @Override // p000.AbstractC52628z91
    /* renamed from: b */
    public void mo1761b(C39002cC1[] c39002cC1Arr) {
        super.mo1761b(c39002cC1Arr);
        this.f95425e = new C35926Sl2(-1);
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            C35926Sl2 m85838b = ((C50256v91) m1754i.next()).mo9128e().m85838b();
            for (int i = 0; i < 2; i++) {
                int m84874d = m85838b.m84874d(i);
                if (m84874d == 0 || m84874d == 1) {
                    this.f95425e.m84864n(i, 0);
                }
            }
        }
    }

    @Override // p000.AbstractC52628z91
    /* renamed from: g */
    public void mo1756g(C50256v91 c50256v91) {
        C50256v91 c50256v912 = (C43685k41) c50256v91;
        m1755h(c50256v912, c50256v912);
    }

    /* renamed from: k */
    public void m27974k() {
        boolean z;
        boolean z2;
        Iterator m1754i = m1754i();
        while (true) {
            if (m1754i.hasNext()) {
                C43685k41 c43685k41 = (C43685k41) m1754i.next();
                C43685k41 m29370o = c43685k41.m29370o();
                if (!c43685k41.m29366s()) {
                    if (c43685k41.m29368q()) {
                        z = false;
                        break;
                    } else if (m29370o.m29368q()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        Iterator m1754i2 = m1754i();
        while (m1754i2.hasNext()) {
            C43685k41 c43685k412 = (C43685k41) m1754i2.next();
            C43685k41 m29370o2 = c43685k412.m29370o();
            if (c43685k412.m29366s()) {
                C47293q91 mo9128e = c43685k412.mo9128e();
                if (!z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo9128e.m85834f(z2);
            } else {
                if (c43685k412.m29368q()) {
                    z = true;
                }
                if (m29370o2.m29368q()) {
                    z = false;
                }
            }
        }
    }

    /* renamed from: l */
    public C35926Sl2 m27973l() {
        return this.f95425e;
    }

    /* renamed from: m */
    public int m27972m(H91 h91) {
        Iterator m1754i = m1754i();
        int i = 0;
        while (m1754i.hasNext()) {
            if (((C43685k41) m1754i.next()).m29374k() == h91) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: n */
    public final List m27971n() {
        List list = this.f95424d;
        if (list != null) {
            return list;
        }
        this.f95424d = new ArrayList();
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            C43685k41 c43685k41 = (C43685k41) m1754i.next();
            if (c43685k41.m29368q() || c43685k41.m29370o().m29368q()) {
                this.f95424d.add(c43685k41);
            }
        }
        return this.f95424d;
    }

    /* renamed from: o */
    public void m27970o(H91 h91) {
        boolean z;
        boolean z2 = true;
        C43685k41 c43685k41 = null;
        boolean z3 = true;
        C43685k41 c43685k412 = null;
        for (int size = this.f95424d.size() - 1; size >= 0; size--) {
            C43685k41 c43685k413 = (C43685k41) this.f95424d.get(size);
            C43685k41 m29370o = c43685k413.m29370o();
            if (c43685k41 == null && c43685k413.m29374k() == h91) {
                c43685k41 = c43685k413;
            }
            if (!z3) {
                if (z3 && c43685k413.m29374k() == h91) {
                    c43685k412.m29379F(c43685k413);
                    z3 = true;
                }
            } else if (m29370o.m29374k() == h91) {
                z3 = true;
                c43685k412 = m29370o;
            }
        }
        if (z3) {
            if (c43685k41 != null) {
                z = true;
            } else {
                z = false;
            }
            C4596Ko.m98281d(z, "found null for first outgoing dirEdge");
            if (c43685k41.m29374k() != h91) {
                z2 = false;
            }
            C4596Ko.m98281d(z2, "unable to link last incoming dirEdge");
            c43685k412.m29379F(c43685k41);
        }
    }

    /* renamed from: p */
    public void m27969p() {
        m27971n();
        C43685k41 c43685k41 = null;
        boolean z = true;
        C43685k41 c43685k412 = null;
        for (int i = 0; i < this.f95424d.size(); i++) {
            C43685k41 c43685k413 = (C43685k41) this.f95424d.get(i);
            C43685k41 m29370o = c43685k413.m29370o();
            if (c43685k413.mo5787f().m84871g()) {
                if (c43685k41 == null && c43685k413.m29368q()) {
                    c43685k41 = c43685k413;
                }
                if (!z) {
                    if (z && c43685k413.m29368q()) {
                        c43685k412.m29380E(c43685k413);
                        z = true;
                    }
                } else if (m29370o.m29368q()) {
                    z = true;
                    c43685k412 = m29370o;
                }
            }
        }
        if (z) {
            if (c43685k41 != null) {
                C4596Ko.m98281d(c43685k41.m29368q(), "unable to link last incoming dirEdge");
                c43685k412.m29380E(c43685k41);
                return;
            }
            throw new TopologyException("no outgoing dirEdge found", m1760c());
        }
    }

    /* renamed from: q */
    public void m27968q() {
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            C43685k41 c43685k41 = (C43685k41) m1754i.next();
            c43685k41.mo5787f().m84867k(c43685k41.m29370o().mo5787f());
        }
    }

    /* renamed from: r */
    public void m27967r(C35926Sl2 c35926Sl2) {
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            C35926Sl2 mo5787f = ((C43685k41) m1754i.next()).mo5787f();
            mo5787f.m84865m(0, c35926Sl2.m84874d(0));
            mo5787f.m84865m(1, c35926Sl2.m84874d(1));
        }
    }
}
