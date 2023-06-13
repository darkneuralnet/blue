package p000;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: oA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46119oA3 {

    /* renamed from: a */
    public C45526nA3 f101541a;

    /* renamed from: b */
    public C34108Kr2 f101542b;

    /* renamed from: c */
    public boolean f101543c;

    /* renamed from: d */
    public C52053yB0[] f101544d;

    /* renamed from: e */
    public C50770w12 f101545e;

    /* renamed from: f */
    public C46119oA3 f101546f;

    /* renamed from: g */
    public List<C46119oA3> f101547g = new ArrayList();

    public C46119oA3(C45526nA3 c45526nA3, C38409bC1 c38409bC1) {
        this.f101541a = c45526nA3;
        C52053yB0[] m21689c = m21689c(c45526nA3);
        this.f101544d = m21689c;
        m21690b(m21689c, c38409bC1);
    }

    /* renamed from: a */
    public void m21691a(C46119oA3 c46119oA3) {
        this.f101547g.add(c46119oA3);
    }

    /* renamed from: b */
    public final void m21690b(C52053yB0[] c52053yB0Arr, C38409bC1 c38409bC1) {
        if (this.f101542b != null) {
            return;
        }
        C34108Kr2 m64845j = c38409bC1.m64845j(c52053yB0Arr);
        this.f101542b = m64845j;
        this.f101543c = C32534Dy3.m109569c(m64845j.mo77238Y());
    }

    /* renamed from: c */
    public final C52053yB0[] m21689c(C45526nA3 c45526nA3) {
        DB0 db0 = new DB0();
        C45526nA3 c45526nA32 = c45526nA3;
        while (c45526nA32.m24239v() != this) {
            c45526nA32.m24244q(db0);
            c45526nA32.m24251Q(this);
            if (c45526nA32.m24255M() != null) {
                c45526nA32 = c45526nA32.m24255M();
                if (c45526nA32 == c45526nA3) {
                    db0.m110794o();
                    return db0.m110799b2();
                }
            } else {
                throw new TopologyException("Found null edge in ring", c45526nA32.m107421d());
            }
        }
        throw new TopologyException("Edge visited twice during ring-building at " + c45526nA32.m24241t(), c45526nA32.m24241t());
    }

    /* renamed from: d */
    public C46119oA3 m21688d(List<C46119oA3> list) {
        C34108Kr2 m21684h = m21684h();
        C48772sf1 m78759Z = m21684h.m78759Z();
        m21684h.m113441L0(0);
        C46119oA3 c46119oA3 = null;
        C48772sf1 c48772sf1 = null;
        for (C46119oA3 c46119oA32 : list) {
            C48772sf1 m78759Z2 = c46119oA32.m21684h().m78759Z();
            if (!m78759Z2.equals(m78759Z) && m78759Z2.m13883b(m78759Z) && c46119oA32.m21681k(BB0.m114280f(m21684h.mo77238Y(), c46119oA32.m21686f())) && (c46119oA3 == null || c48772sf1.m13883b(m78759Z2))) {
                c48772sf1 = c46119oA32.m21684h().m78759Z();
                c46119oA3 = c46119oA32;
            }
        }
        return c46119oA3;
    }

    /* renamed from: e */
    public C52053yB0 m21687e() {
        return this.f101544d[0];
    }

    /* renamed from: f */
    public final C52053yB0[] m21686f() {
        return this.f101544d;
    }

    /* renamed from: g */
    public final NW3 m21685g() {
        if (this.f101545e == null) {
            this.f101545e = new C50770w12(m21684h());
        }
        return this.f101545e;
    }

    /* renamed from: h */
    public C34108Kr2 m21684h() {
        return this.f101542b;
    }

    /* renamed from: i */
    public C46119oA3 m21683i() {
        return m21682j() ? this.f101546f : this;
    }

    /* renamed from: j */
    public boolean m21682j() {
        return this.f101543c;
    }

    /* renamed from: k */
    public boolean m21681k(C52053yB0 c52053yB0) {
        return 2 != m21685g().mo5981a(c52053yB0);
    }

    /* renamed from: l */
    public void m21680l(C46119oA3 c46119oA3) {
        this.f101546f = c46119oA3;
        if (c46119oA3 != null) {
            c46119oA3.m21691a(this);
        }
    }

    /* renamed from: m */
    public CX3 m21679m(C38409bC1 c38409bC1) {
        C34108Kr2[] c34108Kr2Arr;
        List<C46119oA3> list = this.f101547g;
        if (list != null) {
            c34108Kr2Arr = new C34108Kr2[list.size()];
            for (int i = 0; i < this.f101547g.size(); i++) {
                c34108Kr2Arr[i] = this.f101547g.get(i).m21684h();
            }
        } else {
            c34108Kr2Arr = null;
        }
        return c38409bC1.m64830y(this.f101542b, c34108Kr2Arr);
    }
}
