package p000;
/* renamed from: aC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37816aC1 extends AbstractC36289Tz5 {

    /* renamed from: b */
    public EB0 f50063b;

    /* renamed from: c */
    public C48772sf1 f50064c;

    /* renamed from: d */
    public boolean f50065d = false;

    public C37816aC1(CX3 cx3) {
        this.f50063b = cx3.m112157L0().m113440M0();
        this.f50064c = cx3.m78759Z();
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: b */
    public boolean mo11958b() {
        return this.f50065d;
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: c */
    public void mo11957c(WB1 wb1) {
        if (!(wb1 instanceof CX3)) {
            return;
        }
        C48772sf1 m78759Z = wb1.m78759Z();
        if (!this.f50064c.m13887K(m78759Z)) {
            return;
        }
        C52053yB0 c52053yB0 = new C52053yB0();
        for (int i = 0; i < 4; i++) {
            this.f50063b.mo1715T(i, c52053yB0);
            if (m78759Z.m13884a(c52053yB0) && SA5.m85865b(c52053yB0, (CX3) wb1)) {
                this.f50065d = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean m71792d() {
        return this.f50065d;
    }
}
