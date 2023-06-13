package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* renamed from: j1 */
/* loaded from: classes8.dex */
public abstract class AbstractC24691j1 implements Serializable {
    private static final long serialVersionUID = -3886435814360241337L;

    /* renamed from: b */
    public AbstractC10089Z0 f92009b;

    /* renamed from: c */
    public boolean f92010c;

    /* renamed from: d */
    public ArrayList f92011d;

    /* renamed from: e */
    public int f92012e;

    /* renamed from: j1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC24692a {
        /* renamed from: a */
        boolean mo31253a(Object obj, Object obj2);
    }

    public AbstractC24691j1() {
        this(10);
    }

    /* renamed from: d */
    public static int m31265d(double d, double d2) {
        if (d > d2) {
            return 1;
        }
        return d < d2 ? -1 : 0;
    }

    /* renamed from: c */
    public synchronized void m31266c() {
        AbstractC10089Z0 m31264e;
        if (this.f92010c) {
            return;
        }
        if (this.f92011d.isEmpty()) {
            m31264e = mo31263f(0);
        } else {
            m31264e = m31264e(this.f92011d, -1);
        }
        this.f92009b = m31264e;
        this.f92011d = null;
        this.f92010c = true;
    }

    /* renamed from: e */
    public final AbstractC10089Z0 m31264e(List list, int i) {
        C4596Ko.m98282c(!list.isEmpty());
        int i2 = i + 1;
        List mo31262g = mo31262g(list, i2);
        if (mo31262g.size() == 1) {
            return (AbstractC10089Z0) mo31262g.get(0);
        }
        return m31264e(mo31262g, i2);
    }

    /* renamed from: f */
    public abstract AbstractC10089Z0 mo31263f(int i);

    /* renamed from: g */
    public List mo31262g(List list, int i) {
        C4596Ko.m98282c(!list.isEmpty());
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo31263f(i));
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2, mo31261h());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            InterfaceC48387s00 interfaceC48387s00 = (InterfaceC48387s00) it.next();
            if (m31256m(arrayList).m73924c().size() == m31259j()) {
                arrayList.add(mo31263f(i));
            }
            m31256m(arrayList).m73925a(interfaceC48387s00);
        }
        return arrayList;
    }

    /* renamed from: h */
    public abstract Comparator mo31261h();

    /* renamed from: i */
    public abstract InterfaceC24692a mo31260i();

    /* renamed from: j */
    public int m31259j() {
        return this.f92012e;
    }

    /* renamed from: k */
    public void m31258k(Object obj, Object obj2) {
        C4596Ko.m98281d(!this.f92010c, "Cannot insert items into an STR packed R-tree after it has been built.");
        this.f92011d.add(new C37465Za2(obj, obj2));
    }

    /* renamed from: l */
    public boolean m31257l() {
        if (!this.f92010c) {
            return this.f92011d.isEmpty();
        }
        return this.f92009b.m73923d();
    }

    /* renamed from: m */
    public AbstractC10089Z0 m31256m(List list) {
        return (AbstractC10089Z0) list.get(list.size() - 1);
    }

    /* renamed from: n */
    public List m31255n(Object obj) {
        m31266c();
        ArrayList arrayList = new ArrayList();
        if (m31257l()) {
            return arrayList;
        }
        if (mo31260i().mo31253a(this.f92009b.getBounds(), obj)) {
            m31254o(obj, this.f92009b, arrayList);
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void m31254o(Object obj, AbstractC10089Z0 abstractC10089Z0, List list) {
        List m73924c = abstractC10089Z0.m73924c();
        for (int i = 0; i < m73924c.size(); i++) {
            InterfaceC48387s00 interfaceC48387s00 = (InterfaceC48387s00) m73924c.get(i);
            if (mo31260i().mo31253a(interfaceC48387s00.getBounds(), obj)) {
                if (interfaceC48387s00 instanceof AbstractC10089Z0) {
                    m31254o(obj, (AbstractC10089Z0) interfaceC48387s00, list);
                } else if (interfaceC48387s00 instanceof C37465Za2) {
                    list.add(((C37465Za2) interfaceC48387s00).m72913a());
                } else {
                    C4596Ko.m98280e();
                }
            }
        }
    }

    public AbstractC24691j1(int i) {
        this.f92010c = false;
        this.f92011d = new ArrayList();
        C4596Ko.m98281d(i > 1, "Node capacity must be greater than 1");
        this.f92012e = i;
    }
}
