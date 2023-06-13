package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: Ws4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36927Ws4 extends AbstractC36289Tz5 {

    /* renamed from: b */
    public C48772sf1 f42228b;

    /* renamed from: c */
    public C37161Xs4 f42229c;

    /* renamed from: d */
    public boolean f42230d = false;

    public C36927Ws4(CX3 cx3) {
        C48772sf1 m78759Z = cx3.m78759Z();
        this.f42228b = m78759Z;
        this.f42229c = new C37161Xs4(m78759Z);
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: b */
    public boolean mo11958b() {
        return this.f42230d;
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: c */
    public void mo11957c(WB1 wb1) {
        if (!this.f42228b.m13887K(wb1.m78759Z())) {
            return;
        }
        m77760d(C32470Dr2.m109852b(wb1));
    }

    /* renamed from: d */
    public final void m77760d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m77759e((C32002Br2) it.next());
            if (this.f42230d) {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void m77759e(C32002Br2 c32002Br2) {
        EB0 m113440M0 = c32002Br2.m113440M0();
        C52053yB0 m109311R = m113440M0.m109311R();
        C52053yB0 m109311R2 = m113440M0.m109311R();
        for (int i = 1; i < m113440M0.size(); i++) {
            m113440M0.mo1715T(i - 1, m109311R);
            m113440M0.mo1715T(i, m109311R2);
            if (this.f42229c.m76181a(m109311R, m109311R2)) {
                this.f42230d = true;
                return;
            }
        }
    }

    /* renamed from: f */
    public boolean m77758f() {
        return this.f42230d;
    }
}
