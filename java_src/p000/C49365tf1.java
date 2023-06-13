package p000;
/* renamed from: tf1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49365tf1 extends AbstractC36289Tz5 {

    /* renamed from: b */
    public C48772sf1 f110843b;

    /* renamed from: c */
    public boolean f110844c = false;

    public C49365tf1(C48772sf1 c48772sf1) {
        this.f110843b = c48772sf1;
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: b */
    public boolean mo11958b() {
        return this.f110844c;
    }

    @Override // p000.AbstractC36289Tz5
    /* renamed from: c */
    public void mo11957c(WB1 wb1) {
        C48772sf1 m78759Z = wb1.m78759Z();
        if (!this.f110843b.m13887K(m78759Z)) {
            return;
        }
        if (this.f110843b.m13883b(m78759Z)) {
            this.f110844c = true;
        } else if (m78759Z.m13869p() >= this.f110843b.m13869p() && m78759Z.m13871n() <= this.f110843b.m13871n()) {
            this.f110844c = true;
        } else if (m78759Z.m13868q() >= this.f110843b.m13868q() && m78759Z.m13870o() <= this.f110843b.m13870o()) {
            this.f110844c = true;
        }
    }

    /* renamed from: d */
    public boolean m11956d() {
        return this.f110844c;
    }
}
