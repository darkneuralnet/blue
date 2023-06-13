package p000;

import co.bird.android.persistence.operatorallocation.OperatorAllocationDatabase;
/* renamed from: Ek */
/* loaded from: classes4.dex */
public final class C1938Ek implements InterfaceC48812sj1<AbstractC48212ri3> {

    /* renamed from: a */
    public final C22711hj f7995a;

    /* renamed from: b */
    public final Y94<OperatorAllocationDatabase> f7996b;

    public C1938Ek(C22711hj c22711hj, Y94<OperatorAllocationDatabase> y94) {
        this.f7995a = c22711hj;
        this.f7996b = y94;
    }

    /* renamed from: a */
    public static C1938Ek m108546a(C22711hj c22711hj, Y94<OperatorAllocationDatabase> y94) {
        return new C1938Ek(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC48212ri3 m108544c(C22711hj c22711hj, OperatorAllocationDatabase operatorAllocationDatabase) {
        return (AbstractC48212ri3) C51679xZ3.m5002e(c22711hj.m35960x0(operatorAllocationDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC48212ri3 get() {
        return m108544c(this.f7995a, this.f7996b.get());
    }
}
