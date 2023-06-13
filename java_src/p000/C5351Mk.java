package p000;

import co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase;
/* renamed from: Mk */
/* loaded from: classes4.dex */
public final class C5351Mk implements InterfaceC48812sj1<AbstractC31814Aw3> {

    /* renamed from: a */
    public final C22711hj f23444a;

    /* renamed from: b */
    public final Y94<OperatorFilterDatabase> f23445b;

    public C5351Mk(C22711hj c22711hj, Y94<OperatorFilterDatabase> y94) {
        this.f23444a = c22711hj;
        this.f23445b = y94;
    }

    /* renamed from: a */
    public static C5351Mk m94987a(C22711hj c22711hj, Y94<OperatorFilterDatabase> y94) {
        return new C5351Mk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC31814Aw3 m94985c(C22711hj c22711hj, OperatorFilterDatabase operatorFilterDatabase) {
        return (AbstractC31814Aw3) C51679xZ3.m5002e(c22711hj.m36047F0(operatorFilterDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC31814Aw3 get() {
        return m94985c(this.f23444a, this.f23445b.get());
    }
}
