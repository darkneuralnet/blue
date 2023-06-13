package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: rA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47898rA3 {

    /* renamed from: a */
    public C46712pA3 f106595a;

    /* renamed from: b */
    public C40711f32 f106596b;

    /* renamed from: c */
    public Collection<C45526nA3> f106597c;

    public C47898rA3(C46712pA3 c46712pA3, C40711f32 c40711f32) {
        this.f106595a = c46712pA3;
        this.f106596b = c40711f32;
        this.f106597c = c46712pA3.m19849b();
    }

    /* renamed from: b */
    public static List<C45526nA3> m16305b(Collection<C45526nA3> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (C45526nA3 c45526nA3 : collection) {
            C47305qA3 m24237x = c45526nA3.m24237x();
            if (m24237x.m18001z(i) && !m24237x.m18002y(i)) {
                arrayList.add(c45526nA3);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C45526nA3 m16304c(C45526nA3 c45526nA3, int i) {
        C45526nA3 c45526nA32 = c45526nA3;
        do {
            C47305qA3 m24237x = c45526nA32.m24237x();
            if (m24237x.m18016k(i)) {
                C4596Ko.m98282c(m24237x.m18021f(i));
                return c45526nA32;
            }
            c45526nA32 = (C45526nA3) c45526nA32.m107414l();
        } while (c45526nA32 != c45526nA3);
        return null;
    }

    /* renamed from: n */
    public static void m16293n(C45526nA3 c45526nA3, int i, boolean z, Deque<C45526nA3> deque) {
        int m18024c = c45526nA3.m24237x().m18024c(i);
        if (z && m18024c != 2) {
            return;
        }
        C45526nA3 m24253O = c45526nA3.m24253O();
        do {
            C47305qA3 m24237x = m24253O.m24237x();
            if (m24237x.m18002y(i)) {
                m24237x.m18028E(i, m18024c);
                deque.addFirst(m24253O.m24247U());
            }
            m24253O = m24253O.m24253O();
        } while (m24253O != c45526nA3);
    }

    /* renamed from: a */
    public void m16306a() {
        m16303d(this.f106595a.m19848c());
        m16300g();
        m16301f();
        m16300g();
        m16298i();
    }

    /* renamed from: d */
    public final void m16303d(Collection<C45526nA3> collection) {
        for (C45526nA3 c45526nA3 : collection) {
            m16294m(c45526nA3, 0);
            if (this.f106596b.m42226f(1)) {
                m16294m(c45526nA3, 1);
            }
        }
    }

    /* renamed from: e */
    public final void m16302e(C45526nA3 c45526nA3, int i) {
        C47305qA3 m24237x = c45526nA3.m24237x();
        if (!m24237x.m18010q(i)) {
            return;
        }
        m24237x.m18029D(i);
    }

    /* renamed from: f */
    public final void m16301f() {
        for (C45526nA3 c45526nA3 : this.f106597c) {
            if (c45526nA3.m24237x().m18002y(0)) {
                m16302e(c45526nA3, 0);
            }
            if (c45526nA3.m24237x().m18002y(1)) {
                m16302e(c45526nA3, 1);
            }
        }
    }

    /* renamed from: g */
    public final void m16300g() {
        m16292o(0);
        if (this.f106596b.m42226f(1)) {
            m16292o(1);
        }
    }

    /* renamed from: h */
    public final void m16299h(C45526nA3 c45526nA3, int i) {
        C47305qA3 m24237x = c45526nA3.m24237x();
        if (!this.f106596b.m42223i(i)) {
            m24237x.m18030C(i, 2);
        } else {
            m24237x.m18030C(i, m16297j(i, c45526nA3));
        }
    }

    /* renamed from: i */
    public final void m16298i() {
        for (C45526nA3 c45526nA3 : this.f106597c) {
            if (c45526nA3.m24237x().m18002y(0)) {
                m16299h(c45526nA3, 0);
            }
            if (c45526nA3.m24237x().m18002y(1)) {
                m16299h(c45526nA3, 1);
            }
        }
    }

    /* renamed from: j */
    public final int m16297j(int i, C45526nA3 c45526nA3) {
        boolean z;
        int m42220l = this.f106596b.m42220l(i, c45526nA3.m107413m());
        int m42220l2 = this.f106596b.m42220l(i, c45526nA3.m107421d());
        if (m42220l != 2 && m42220l2 != 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        return 2;
    }

    /* renamed from: k */
    public void m16296k(C45526nA3 c45526nA3, int i) {
        C47305qA3 m24237x = c45526nA3.m24237x();
        if (m24237x.m18013n() && C49083tA3.m12946g(i, m24237x.m18022e(0, 2, c45526nA3.m24235z()), m24237x.m18022e(1, 2, c45526nA3.m24235z()))) {
            c45526nA3.m24259I();
        }
    }

    /* renamed from: l */
    public void m16295l(int i) {
        for (C45526nA3 c45526nA3 : this.f106597c) {
            m16296k(c45526nA3, i);
        }
    }

    /* renamed from: m */
    public void m16294m(C45526nA3 c45526nA3, int i) {
        C45526nA3 m16304c;
        if (!this.f106596b.m42223i(i) || c45526nA3.m107422c() == 1 || (m16304c = m16304c(c45526nA3, i)) == null) {
            return;
        }
        int m24236y = m16304c.m24236y(i, 1);
        C45526nA3 m24253O = m16304c.m24253O();
        do {
            C47305qA3 m24237x = m24253O.m24237x();
            if (!m24237x.m18016k(i)) {
                m24237x.m18028E(i, m24236y);
            } else {
                C4596Ko.m98282c(m24237x.m18021f(i));
                if (m24253O.m24236y(i, 2) == m24236y) {
                    m24236y = m24253O.m24236y(i, 1);
                    if (m24236y == -1) {
                        C4596Ko.m98279f("found single null side at " + m24253O);
                    }
                } else {
                    throw new TopologyException("side location conflict: arg " + i, m24253O.m24241t());
                }
            }
            m24253O = m24253O.m24253O();
        } while (m24253O != m16304c);
    }

    /* renamed from: o */
    public final void m16292o(int i) {
        List<C45526nA3> m16305b = m16305b(this.f106597c, i);
        if (m16305b.size() <= 0) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(m16305b);
        boolean m42222j = this.f106596b.m42222j(i);
        while (!arrayDeque.isEmpty()) {
            m16293n((C45526nA3) arrayDeque.removeFirst(), i, m42222j, arrayDeque);
        }
    }

    /* renamed from: p */
    public void m16291p() {
        for (C45526nA3 c45526nA3 : this.f106597c) {
            if (c45526nA3.m24265C()) {
                c45526nA3.m24246V();
            }
        }
    }
}
