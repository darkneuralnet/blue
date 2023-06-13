package p000;

import java.util.ArrayList;
/* renamed from: gC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41391gC1 {

    /* renamed from: a */
    public WB1 f81767a;

    /* renamed from: b */
    public C38409bC1 f81768b = null;

    /* renamed from: c */
    public boolean f81769c = true;

    /* renamed from: d */
    public boolean f81770d = true;

    /* renamed from: e */
    public boolean f81771e = false;

    /* renamed from: f */
    public boolean f81772f = false;

    /* renamed from: a */
    public final EB0 m39883a(EB0 eb0) {
        return eb0.copy();
    }

    /* renamed from: b */
    public final WB1 m39882b(WB1 wb1) {
        this.f81767a = wb1;
        this.f81768b = wb1.m78758c0();
        if (wb1 instanceof FW3) {
            return m39875j((FW3) wb1, null);
        }
        if (wb1 instanceof VW2) {
            return m39877h((VW2) wb1, null);
        }
        if (wb1 instanceof C34108Kr2) {
            return m39879f((C34108Kr2) wb1, null);
        }
        if (wb1 instanceof C32002Br2) {
            return m39880e((C32002Br2) wb1, null);
        }
        if (wb1 instanceof DW2) {
            return m39878g((DW2) wb1, null);
        }
        if (wb1 instanceof CX3) {
            return m39874k((CX3) wb1, null);
        }
        if (wb1 instanceof WW2) {
            return m39876i((WW2) wb1, null);
        }
        if (wb1 instanceof XB1) {
            return m39881d((XB1) wb1, null);
        }
        throw new IllegalArgumentException("Unknown Geometry subtype: " + wb1.getClass().getName());
    }

    /* renamed from: c */
    public EB0 mo21259c(EB0 eb0, WB1 wb1) {
        return m39883a(eb0);
    }

    /* renamed from: d */
    public WB1 m39881d(XB1 xb1, WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < xb1.mo77232f0(); i++) {
            WB1 m39882b = m39882b(xb1.mo77236d0(i));
            if (m39882b != null && (!this.f81769c || !m39882b.mo77226r0())) {
                arrayList.add(m39882b);
            }
        }
        if (this.f81770d) {
            return this.f81768b.m64851d(C38409bC1.m64858D(arrayList));
        }
        return this.f81768b.m64854a(arrayList);
    }

    /* renamed from: e */
    public WB1 m39880e(C32002Br2 c32002Br2, WB1 wb1) {
        return this.f81768b.m64849f(mo21259c(c32002Br2.m113440M0(), c32002Br2));
    }

    /* renamed from: f */
    public WB1 m39879f(C34108Kr2 c34108Kr2, WB1 wb1) {
        EB0 mo21259c = mo21259c(c34108Kr2.m113440M0(), c34108Kr2);
        if (mo21259c == null) {
            return this.f81768b.m64846i(null);
        }
        int size = mo21259c.size();
        if (size > 0 && size < 4 && !this.f81772f) {
            return this.f81768b.m64849f(mo21259c);
        }
        return this.f81768b.m64846i(mo21259c);
    }

    /* renamed from: g */
    public WB1 m39878g(DW2 dw2, WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dw2.mo77232f0(); i++) {
            WB1 m39880e = m39880e((C32002Br2) dw2.mo77236d0(i), dw2);
            if (m39880e != null && !m39880e.mo77226r0()) {
                arrayList.add(m39880e);
            }
        }
        if (arrayList.isEmpty()) {
            return this.f81768b.m64844k();
        }
        return this.f81768b.m64854a(arrayList);
    }

    /* renamed from: h */
    public WB1 m39877h(VW2 vw2, WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vw2.mo77232f0(); i++) {
            WB1 m39875j = m39875j((FW3) vw2.mo77236d0(i), vw2);
            if (m39875j != null && !m39875j.mo77226r0()) {
                arrayList.add(m39875j);
            }
        }
        if (arrayList.isEmpty()) {
            return this.f81768b.m64842m();
        }
        return this.f81768b.m64854a(arrayList);
    }

    /* renamed from: i */
    public WB1 m39876i(WW2 ww2, WB1 wb1) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ww2.mo77232f0(); i++) {
            WB1 m39874k = m39874k((CX3) ww2.mo77236d0(i), ww2);
            if (m39874k != null && !m39874k.mo77226r0()) {
                arrayList.add(m39874k);
            }
        }
        if (arrayList.isEmpty()) {
            return this.f81768b.m64838q();
        }
        return this.f81768b.m64854a(arrayList);
    }

    /* renamed from: j */
    public WB1 m39875j(FW3 fw3, WB1 wb1) {
        return this.f81768b.m64834u(mo21259c(fw3.m107068L0(), fw3));
    }

    /* renamed from: k */
    public WB1 m39874k(CX3 cx3, WB1 wb1) {
        boolean z;
        WB1 m39879f = m39879f(cx3.m112157L0(), cx3);
        boolean z2 = true;
        if (m39879f != null && !m39879f.mo77226r0()) {
            z = false;
        } else {
            z = true;
        }
        if (cx3.mo77226r0() && z) {
            return this.f81768b.m64833v();
        }
        z2 = (z || !(m39879f instanceof C34108Kr2)) ? false : false;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cx3.m112155O0(); i++) {
            WB1 m39879f2 = m39879f(cx3.m112156M0(i), cx3);
            if (m39879f2 != null && !m39879f2.mo77226r0()) {
                if (!(m39879f2 instanceof C34108Kr2)) {
                    z2 = false;
                }
                arrayList.add(m39879f2);
            }
        }
        if (z2) {
            return this.f81768b.m64830y((C34108Kr2) m39879f, (C34108Kr2[]) arrayList.toArray(new C34108Kr2[0]));
        }
        ArrayList arrayList2 = new ArrayList();
        if (m39879f != null) {
            arrayList2.add(m39879f);
        }
        arrayList2.addAll(arrayList);
        return this.f81768b.m64854a(arrayList2);
    }
}
