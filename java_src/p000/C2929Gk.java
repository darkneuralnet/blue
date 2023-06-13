package p000;

import co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase;
/* renamed from: Gk */
/* loaded from: classes4.dex */
public final class C2929Gk implements InterfaceC48812sj1<AbstractC51235wo3> {

    /* renamed from: a */
    public final C22711hj f12347a;

    /* renamed from: b */
    public final Y94<OperatorFilterDatabase> f12348b;

    public C2929Gk(C22711hj c22711hj, Y94<OperatorFilterDatabase> y94) {
        this.f12347a = c22711hj;
        this.f12348b = y94;
    }

    /* renamed from: a */
    public static C2929Gk m104820a(C22711hj c22711hj, Y94<OperatorFilterDatabase> y94) {
        return new C2929Gk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC51235wo3 m104818c(C22711hj c22711hj, OperatorFilterDatabase operatorFilterDatabase) {
        return (AbstractC51235wo3) C51679xZ3.m5002e(c22711hj.m35956z0(operatorFilterDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC51235wo3 get() {
        return m104818c(this.f12347a, this.f12348b.get());
    }
}
