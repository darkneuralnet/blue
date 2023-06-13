package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: FX3 */
/* loaded from: classes8.dex */
public class FX3 {

    /* renamed from: a */
    public C38409bC1 f9600a;

    /* renamed from: b */
    public List f9601b = new ArrayList();

    public FX3(C38409bC1 c38409bC1) {
        this.f9600a = c38409bC1;
    }

    /* renamed from: f */
    public static H91 m107033f(H91 h91, List list) {
        C34108Kr2 m104273g = h91.m104273g();
        C48772sf1 m78759Z = m104273g.m78759Z();
        m104273g.m113441L0(0);
        Iterator it = list.iterator();
        H91 h912 = null;
        C48772sf1 c48772sf1 = null;
        while (it.hasNext()) {
            H91 h913 = (H91) it.next();
            C34108Kr2 m104273g2 = h913.m104273g();
            C48772sf1 m78759Z2 = m104273g2.m78759Z();
            if (!m78759Z2.equals(m78759Z) && m78759Z2.m13883b(m78759Z) && LW3.m96718a(BB0.m114280f(m104273g.mo77238Y(), m104273g2.mo77238Y()), m104273g2.mo77238Y()) && (h912 == null || c48772sf1.m13883b(m78759Z2))) {
                c48772sf1 = h913.m104273g().m78759Z();
                h912 = h913;
            }
        }
        return h912;
    }

    /* renamed from: a */
    public void m107038a(C44529lV3 c44529lV3) {
        m107037b(c44529lV3.m27210d(), c44529lV3.m27207g());
    }

    /* renamed from: b */
    public void m107037b(Collection collection, Collection collection2) {
        C44529lV3.m27204j(collection2);
        List m107036c = m107036c(collection);
        ArrayList arrayList = new ArrayList();
        m107028k(m107035d(m107036c, this.f9601b, arrayList), this.f9601b, arrayList);
        m107030i(this.f9601b, arrayList);
    }

    /* renamed from: c */
    public final List m107036c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C43685k41 c43685k41 = (C43685k41) it.next();
            if (c43685k41.m29368q() && c43685k41.mo5787f().m84871g() && c43685k41.m29374k() == null) {
                C41500gO2 c41500gO2 = new C41500gO2(c43685k41, this.f9600a);
                arrayList.add(c41500gO2);
                c41500gO2.m104267o();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List m107035d(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41500gO2 c41500gO2 = (C41500gO2) it.next();
            if (c41500gO2.m104272h() > 2) {
                c41500gO2.m39510s();
                List m39511r = c41500gO2.m39511r();
                H91 m107032g = m107032g(m39511r);
                if (m107032g != null) {
                    m107029j(m107032g, m39511r);
                    list2.add(m107032g);
                } else {
                    list3.addAll(m39511r);
                }
            } else {
                arrayList.add(c41500gO2);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List m107034e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((H91) it.next()).m104265q(this.f9600a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final H91 m107032g(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        C46891pU2 c46891pU2 = null;
        int i = 0;
        while (it.hasNext()) {
            C46891pU2 c46891pU22 = (C46891pU2) it.next();
            if (!c46891pU22.m104270k()) {
                i++;
                c46891pU2 = c46891pU22;
            }
        }
        if (i <= 1) {
            z = true;
        }
        C4596Ko.m98281d(z, "found two shells in MinimalEdgeRing list");
        return c46891pU2;
    }

    /* renamed from: h */
    public List m107031h() {
        return m107034e(this.f9601b);
    }

    /* renamed from: i */
    public final void m107030i(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            H91 h91 = (H91) it.next();
            if (h91.m104271j() == null) {
                H91 m107033f = m107033f(h91, list);
                if (m107033f != null) {
                    h91.m104266p(m107033f);
                } else {
                    throw new TopologyException("unable to assign hole to a shell", h91.m104274f(0));
                }
            }
        }
    }

    /* renamed from: j */
    public final void m107029j(H91 h91, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C46891pU2 c46891pU2 = (C46891pU2) it.next();
            if (c46891pU2.m104270k()) {
                c46891pU2.m104266p(h91);
            }
        }
    }

    /* renamed from: k */
    public final void m107028k(List list, List list2, List list3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H91 h91 = (H91) it.next();
            if (h91.m104270k()) {
                list3.add(h91);
            } else {
                list2.add(h91);
            }
        }
    }
}
