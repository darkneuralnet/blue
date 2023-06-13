package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: EX3 */
/* loaded from: classes8.dex */
public class EX3 {

    /* renamed from: a */
    public C38409bC1 f7640a;

    /* renamed from: b */
    public List<C46119oA3> f7641b;

    /* renamed from: c */
    public List<C46119oA3> f7642c;

    /* renamed from: d */
    public boolean f7643d;

    public EX3(List<C45526nA3> list, C38409bC1 c38409bC1) {
        this(list, c38409bC1, true);
    }

    /* renamed from: a */
    public static void m108856a(C46119oA3 c46119oA3, List<C46119oA3> list) {
        for (C46119oA3 c46119oA32 : list) {
            if (c46119oA32.m21682j()) {
                c46119oA32.m21680l(c46119oA3);
            }
        }
    }

    /* renamed from: c */
    public static List<C40907fO2> m108854c(Collection<C45526nA3> collection) {
        ArrayList arrayList = new ArrayList();
        for (C45526nA3 c45526nA3 : collection) {
            if (c45526nA3.m24266B() && c45526nA3.m24237x().m18013n() && c45526nA3.m24238w() == null) {
                arrayList.add(new C40907fO2(c45526nA3));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m108855b(List<C46119oA3> list) {
        C46119oA3 m108850g = m108850g(list);
        if (m108850g != null) {
            m108856a(m108850g, list);
            this.f7641b.add(m108850g);
            return;
        }
        this.f7642c.addAll(list);
    }

    /* renamed from: d */
    public final void m108853d(List<C40907fO2> list) {
        for (C40907fO2 c40907fO2 : list) {
            m108855b(c40907fO2.m41461b(this.f7640a));
        }
    }

    /* renamed from: e */
    public final void m108852e(List<C45526nA3> list) {
        m108848i(list);
        m108853d(m108854c(list));
        m108847j(this.f7641b, this.f7642c);
    }

    /* renamed from: f */
    public final List<CX3> m108851f(List<C46119oA3> list) {
        ArrayList arrayList = new ArrayList();
        for (C46119oA3 c46119oA3 : list) {
            arrayList.add(c46119oA3.m21679m(this.f7640a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C46119oA3 m108850g(List<C46119oA3> list) {
        boolean z = false;
        C46119oA3 c46119oA3 = null;
        int i = 0;
        for (C46119oA3 c46119oA32 : list) {
            if (!c46119oA32.m21682j()) {
                i++;
                c46119oA3 = c46119oA32;
            }
        }
        if (i <= 1) {
            z = true;
        }
        C4596Ko.m98281d(z, "found two shells in EdgeRing list");
        return c46119oA3;
    }

    /* renamed from: h */
    public List<CX3> m108849h() {
        return m108851f(this.f7641b);
    }

    /* renamed from: i */
    public final void m108848i(List<C45526nA3> list) {
        for (C45526nA3 c45526nA3 : list) {
            C40907fO2.m41455h(c45526nA3);
        }
    }

    /* renamed from: j */
    public final void m108847j(List<C46119oA3> list, List<C46119oA3> list2) {
        for (C46119oA3 c46119oA3 : list2) {
            if (c46119oA3.m21683i() == null) {
                C46119oA3 m21688d = c46119oA3.m21688d(list);
                if (this.f7643d && m21688d == null) {
                    throw new TopologyException("unable to assign free hole to a shell", c46119oA3.m21687e());
                }
                c46119oA3.m21680l(m21688d);
            }
        }
    }

    public EX3(List<C45526nA3> list, C38409bC1 c38409bC1, boolean z) {
        this.f7641b = new ArrayList();
        this.f7642c = new ArrayList();
        this.f7640a = c38409bC1;
        this.f7643d = z;
        m108852e(list);
    }
}
