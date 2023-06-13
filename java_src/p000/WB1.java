package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: WB1 */
/* loaded from: classes8.dex */
public abstract class WB1 implements Cloneable, Comparable, Serializable {

    /* renamed from: f */
    public static final ZB1 f40526f = new C8949a();
    private static final long serialVersionUID = 8763622679187376702L;

    /* renamed from: b */
    public C48772sf1 f40527b;

    /* renamed from: c */
    public final C38409bC1 f40528c;

    /* renamed from: d */
    public int f40529d;

    /* renamed from: e */
    public Object f40530e = null;

    /* renamed from: WB1$a */
    /* loaded from: classes8.dex */
    public static class C8949a implements ZB1 {
        @Override // p000.ZB1
        /* renamed from: a */
        public void mo73636a(WB1 wb1) {
            wb1.m78762J();
        }
    }

    public WB1(C38409bC1 c38409bC1) {
        this.f40528c = c38409bC1;
        this.f40529d = c38409bC1.m64859C();
    }

    /* renamed from: g */
    public static void m78757g(WB1 wb1) {
        if (!wb1.m78743u0()) {
            return;
        }
        throw new IllegalArgumentException("Operation does not support GeometryCollection arguments");
    }

    /* renamed from: l0 */
    public static boolean m78753l0(WB1[] wb1Arr) {
        for (WB1 wb1 : wb1Arr) {
            if (!wb1.mo77226r0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public static boolean m78750o0(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A0 */
    public boolean m78769A0(WB1 wb1) {
        if (!m78759Z().m13887K(wb1.m78759Z())) {
            return false;
        }
        return m78768C0(wb1).m90812j(mo77244F(), wb1.mo77244F());
    }

    /* renamed from: C0 */
    public P62 m78768C0(WB1 wb1) {
        m78757g(this);
        m78757g(wb1);
        return C36936Wt4.m77744c(this, wb1);
    }

    /* renamed from: F */
    public abstract int mo77244F();

    /* renamed from: F0 */
    public void m78767F0(Object obj) {
        this.f40530e = obj;
    }

    /* renamed from: G0 */
    public String m78766G0() {
        return new C44204kw6().m28146D(this);
    }

    /* renamed from: H */
    public void m78765H() {
        mo77233f(f40526f);
    }

    /* renamed from: H0 */
    public boolean m78764H0(WB1 wb1) {
        if (!m78759Z().m13887K(wb1.m78759Z())) {
            return false;
        }
        return m78768C0(wb1).m90811k(mo77244F(), wb1.mo77244F());
    }

    /* renamed from: I0 */
    public WB1 m78763I0(WB1 wb1) {
        return C40205eC1.m43125c(this, wb1);
    }

    /* renamed from: J */
    public void m78762J() {
        this.f40527b = null;
    }

    /* renamed from: J0 */
    public boolean m78761J0(WB1 wb1) {
        return wb1.m78754l(this);
    }

    /* renamed from: M */
    public double mo77242M() {
        return 0.0d;
    }

    /* renamed from: N */
    public abstract WB1 mo77241N();

    /* renamed from: P */
    public abstract int mo77240P();

    /* renamed from: U */
    public FW3 m78760U() {
        if (mo77226r0()) {
            return this.f40528c.m64836s();
        }
        return m78749p(C36113Tg0.m83208k(this), this);
    }

    /* renamed from: W */
    public abstract C52053yB0 mo77239W();

    /* renamed from: Y */
    public abstract C52053yB0[] mo77238Y();

    /* renamed from: Z */
    public C48772sf1 m78759Z() {
        if (this.f40527b == null) {
            this.f40527b = mo77229k();
        }
        return new C48772sf1(this.f40527b);
    }

    /* renamed from: c0 */
    public C38409bC1 m78758c0() {
        return this.f40528c;
    }

    public Object clone() {
        try {
            WB1 wb1 = (WB1) super.clone();
            C48772sf1 c48772sf1 = wb1.f40527b;
            if (c48772sf1 != null) {
                wb1.f40527b = new C48772sf1(c48772sf1);
            }
            return wb1;
        } catch (CloneNotSupportedException unused) {
            C4596Ko.m98280e();
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        WB1 wb1 = (WB1) obj;
        if (mo77228k0() != wb1.mo77228k0()) {
            return mo77228k0() - wb1.mo77228k0();
        }
        if (mo77226r0() && wb1.mo77226r0()) {
            return 0;
        }
        if (mo77226r0()) {
            return -1;
        }
        if (wb1.mo77226r0()) {
            return 1;
        }
        return mo77230j(obj);
    }

    /* renamed from: d */
    public abstract void mo77237d(CB0 cb0);

    /* renamed from: d0 */
    public WB1 mo77236d0(int i) {
        return this;
    }

    /* renamed from: e */
    public abstract void mo77235e(GB0 gb0);

    /* renamed from: e0 */
    public double mo77234e0() {
        return 0.0d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WB1)) {
            return false;
        }
        return m78744t((WB1) obj);
    }

    /* renamed from: f */
    public abstract void mo77233f(ZB1 zb1);

    /* renamed from: f0 */
    public int mo77232f0() {
        return 1;
    }

    /* renamed from: g0 */
    public abstract int mo77231g0();

    /* renamed from: h */
    public int m78756h(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = ((Comparable) it.next()).compareTo((Comparable) it2.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        if (it2.hasNext()) {
            return -1;
        }
        return 0;
    }

    /* renamed from: h0 */
    public C40414eZ3 m78755h0() {
        return this.f40528c.m64860B();
    }

    public int hashCode() {
        return m78759Z().hashCode();
    }

    /* renamed from: j */
    public abstract int mo77230j(Object obj);

    /* renamed from: k */
    public abstract C48772sf1 mo77229k();

    /* renamed from: k0 */
    public abstract int mo77228k0();

    /* renamed from: l */
    public boolean m78754l(WB1 wb1) {
        if (wb1.mo77244F() == 2 && mo77244F() < 2) {
            return false;
        }
        if ((wb1.mo77244F() == 1 && mo77244F() < 1 && wb1.mo77234e0() > 0.0d) || !m78759Z().m13883b(wb1.m78759Z())) {
            return false;
        }
        if (mo78742x0()) {
            return C36225Ts4.m82328b((CX3) this, wb1);
        }
        return m78768C0(wb1).m90817d();
    }

    /* renamed from: m */
    public WB1 m78752m() {
        C48772sf1 m13882c;
        WB1 mo77227n = mo77227n();
        C48772sf1 c48772sf1 = this.f40527b;
        if (c48772sf1 == null) {
            m13882c = null;
        } else {
            m13882c = c48772sf1.m13882c();
        }
        mo77227n.f40527b = m13882c;
        mo77227n.f40529d = this.f40529d;
        mo77227n.f40530e = this.f40530e;
        return mo77227n;
    }

    /* renamed from: n */
    public abstract WB1 mo77227n();

    /* renamed from: o */
    public boolean m78751o(WB1 wb1) {
        if (wb1.mo77244F() == 2 && mo77244F() < 2) {
            return false;
        }
        if ((wb1.mo77244F() == 1 && mo77244F() < 1 && wb1.mo77234e0() > 0.0d) || !m78759Z().m13879f(wb1.m78759Z())) {
            return false;
        }
        if (mo78742x0()) {
            return true;
        }
        return m78768C0(wb1).m90816e();
    }

    /* renamed from: p */
    public final FW3 m78749p(C52053yB0 c52053yB0, WB1 wb1) {
        if (c52053yB0 == null) {
            return wb1.m78758c0().m64836s();
        }
        wb1.m78755h0().m42760f(c52053yB0);
        return wb1.m78758c0().m64835t(c52053yB0);
    }

    /* renamed from: q */
    public boolean m78748q(WB1 wb1) {
        if (!m78759Z().m13887K(wb1.m78759Z())) {
            return false;
        }
        return m78768C0(wb1).m90815f(mo77244F(), wb1.mo77244F());
    }

    /* renamed from: q0 */
    public boolean m78747q0(WB1 wb1) {
        if (!m78759Z().m13887K(wb1.m78759Z())) {
            return false;
        }
        if (mo78742x0()) {
            return C36693Vs4.m79322b((CX3) this, wb1);
        }
        if (wb1.mo78742x0()) {
            return C36693Vs4.m79322b((CX3) wb1, this);
        }
        if (!m78743u0() && !wb1.m78743u0()) {
            return m78768C0(wb1).m90813h();
        }
        for (int i = 0; i < mo77232f0(); i++) {
            for (int i2 = 0; i2 < wb1.mo77232f0(); i2++) {
                if (mo77236d0(i).m78747q0(wb1.mo77236d0(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean m78746r(C52053yB0 c52053yB0, C52053yB0 c52053yB02, double d) {
        if (d == 0.0d) {
            return c52053yB0.equals(c52053yB02);
        }
        if (c52053yB0.m3887f(c52053yB02) <= d) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public abstract boolean mo77226r0();

    /* renamed from: s0 */
    public boolean mo78745s0(WB1 wb1) {
        return getClass().getName().equals(wb1.getClass().getName());
    }

    /* renamed from: t */
    public boolean m78744t(WB1 wb1) {
        return this == wb1 || mo77225w(wb1, 0.0d);
    }

    public String toString() {
        return m78766G0();
    }

    /* renamed from: u0 */
    public boolean m78743u0() {
        return mo77228k0() == 7;
    }

    /* renamed from: w */
    public abstract boolean mo77225w(WB1 wb1, double d);

    /* renamed from: x0 */
    public boolean mo78742x0() {
        return false;
    }
}
