package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: bC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38409bC1 implements Serializable {
    private static final long serialVersionUID = -6820524753094095635L;

    /* renamed from: b */
    public C40414eZ3 f57076b;

    /* renamed from: c */
    public FB0 f57077c;

    /* renamed from: d */
    public int f57078d;

    public C38409bC1(C40414eZ3 c40414eZ3, int i, FB0 fb0) {
        this.f57076b = c40414eZ3;
        this.f57077c = fb0;
        this.f57078d = i;
    }

    /* renamed from: A */
    public static FB0 m64861A() {
        return AB0.m116035d();
    }

    /* renamed from: D */
    public static WB1[] m64858D(Collection collection) {
        if (collection == null) {
            return null;
        }
        return (WB1[]) collection.toArray(new WB1[collection.size()]);
    }

    /* renamed from: E */
    public static C32002Br2[] m64857E(Collection collection) {
        return (C32002Br2[]) collection.toArray(new C32002Br2[collection.size()]);
    }

    /* renamed from: F */
    public static FW3[] m64856F(Collection collection) {
        return (FW3[]) collection.toArray(new FW3[collection.size()]);
    }

    /* renamed from: H */
    public static CX3[] m64855H(Collection collection) {
        return (CX3[]) collection.toArray(new CX3[collection.size()]);
    }

    /* renamed from: B */
    public C40414eZ3 m64860B() {
        return this.f57076b;
    }

    /* renamed from: C */
    public int m64859C() {
        return this.f57078d;
    }

    /* renamed from: a */
    public WB1 m64854a(Collection collection) {
        Iterator it = collection.iterator();
        Class<?> cls = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            WB1 wb1 = (WB1) it.next();
            Class<?> cls2 = wb1.getClass();
            if (cls == null) {
                cls = cls2;
            }
            if (cls2 != cls) {
                z2 = true;
            }
            if (wb1 instanceof XB1) {
                z3 = true;
            }
        }
        if (cls == null) {
            return m64852c();
        }
        if (!z2 && !z3) {
            WB1 wb12 = (WB1) collection.iterator().next();
            if (collection.size() > 1) {
                z = true;
            }
            if (z) {
                if (wb12 instanceof CX3) {
                    return m64837r(m64855H(collection));
                }
                if (wb12 instanceof C32002Br2) {
                    return m64843l(m64857E(collection));
                }
                if (wb12 instanceof FW3) {
                    return m64840o(m64856F(collection));
                }
                C4596Ko.m98279f("Unhandled class: " + wb12.getClass().getName());
            }
            return wb12;
        }
        return m64851d(m64858D(collection));
    }

    /* renamed from: b */
    public WB1 m64853b(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m64833v();
                    }
                    throw new IllegalArgumentException("Invalid dimension: " + i);
                }
                return m64850e();
            }
            return m64836s();
        }
        return m64852c();
    }

    /* renamed from: c */
    public XB1 m64852c() {
        return new XB1(null, this);
    }

    /* renamed from: d */
    public XB1 m64851d(WB1[] wb1Arr) {
        return new XB1(wb1Arr, this);
    }

    /* renamed from: e */
    public C32002Br2 m64850e() {
        return m64849f(m64829z().mo107445c(new C52053yB0[0]));
    }

    /* renamed from: f */
    public C32002Br2 m64849f(EB0 eb0) {
        return new C32002Br2(eb0, this);
    }

    /* renamed from: g */
    public C32002Br2 m64848g(C52053yB0[] c52053yB0Arr) {
        return m64849f(c52053yB0Arr != null ? m64829z().mo107445c(c52053yB0Arr) : null);
    }

    /* renamed from: h */
    public C34108Kr2 m64847h() {
        return m64846i(m64829z().mo107445c(new C52053yB0[0]));
    }

    /* renamed from: i */
    public C34108Kr2 m64846i(EB0 eb0) {
        return new C34108Kr2(eb0, this);
    }

    /* renamed from: j */
    public C34108Kr2 m64845j(C52053yB0[] c52053yB0Arr) {
        return m64846i(c52053yB0Arr != null ? m64829z().mo107445c(c52053yB0Arr) : null);
    }

    /* renamed from: k */
    public DW2 m64844k() {
        return new DW2(null, this);
    }

    /* renamed from: l */
    public DW2 m64843l(C32002Br2[] c32002Br2Arr) {
        return new DW2(c32002Br2Arr, this);
    }

    /* renamed from: m */
    public VW2 m64842m() {
        return new VW2(null, this);
    }

    /* renamed from: n */
    public VW2 m64841n(EB0 eb0) {
        if (eb0 == null) {
            return m64840o(new FW3[0]);
        }
        FW3[] fw3Arr = new FW3[eb0.size()];
        for (int i = 0; i < eb0.size(); i++) {
            EB0 mo107447a = m64829z().mo107447a(1, eb0.mo1717F(), eb0.mo1710e3());
            HB0.m104192a(eb0, i, mo107447a, 0, 1);
            fw3Arr[i] = m64834u(mo107447a);
        }
        return m64840o(fw3Arr);
    }

    /* renamed from: o */
    public VW2 m64840o(FW3[] fw3Arr) {
        return new VW2(fw3Arr, this);
    }

    /* renamed from: p */
    public VW2 m64839p(C52053yB0[] c52053yB0Arr) {
        EB0 eb0;
        if (c52053yB0Arr != null) {
            eb0 = m64829z().mo107445c(c52053yB0Arr);
        } else {
            eb0 = null;
        }
        return m64841n(eb0);
    }

    /* renamed from: q */
    public WW2 m64838q() {
        return new WW2(null, this);
    }

    /* renamed from: r */
    public WW2 m64837r(CX3[] cx3Arr) {
        return new WW2(cx3Arr, this);
    }

    /* renamed from: s */
    public FW3 m64836s() {
        return m64834u(m64829z().mo107445c(new C52053yB0[0]));
    }

    /* renamed from: t */
    public FW3 m64835t(C52053yB0 c52053yB0) {
        return m64834u(c52053yB0 != null ? m64829z().mo107445c(new C52053yB0[]{c52053yB0}) : null);
    }

    /* renamed from: u */
    public FW3 m64834u(EB0 eb0) {
        return new FW3(eb0, this);
    }

    /* renamed from: v */
    public CX3 m64833v() {
        return m64830y(null, null);
    }

    /* renamed from: w */
    public CX3 m64832w(EB0 eb0) {
        return m64831x(m64846i(eb0));
    }

    /* renamed from: x */
    public CX3 m64831x(C34108Kr2 c34108Kr2) {
        return m64830y(c34108Kr2, null);
    }

    /* renamed from: y */
    public CX3 m64830y(C34108Kr2 c34108Kr2, C34108Kr2[] c34108Kr2Arr) {
        return new CX3(c34108Kr2, c34108Kr2Arr, this);
    }

    /* renamed from: z */
    public FB0 m64829z() {
        return this.f57077c;
    }

    public C38409bC1(C40414eZ3 c40414eZ3, int i) {
        this(c40414eZ3, i, m64861A());
    }

    public C38409bC1() {
        this(new C40414eZ3(), 0);
    }
}
