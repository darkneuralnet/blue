package p000;

import co.bird.android.persistence.operatortaskv2.impl.OperatorTaskV2Database;
/* renamed from: Kk */
/* loaded from: classes4.dex */
public final class C4584Kk implements InterfaceC48812sj1<AbstractC51315ww3> {

    /* renamed from: a */
    public final C22711hj f20164a;

    /* renamed from: b */
    public final Y94<OperatorTaskV2Database> f20165b;

    public C4584Kk(C22711hj c22711hj, Y94<OperatorTaskV2Database> y94) {
        this.f20164a = c22711hj;
        this.f20165b = y94;
    }

    /* renamed from: a */
    public static C4584Kk m98340a(C22711hj c22711hj, Y94<OperatorTaskV2Database> y94) {
        return new C4584Kk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC51315ww3 m98338c(C22711hj c22711hj, OperatorTaskV2Database operatorTaskV2Database) {
        return (AbstractC51315ww3) C51679xZ3.m5002e(c22711hj.m36051D0(operatorTaskV2Database));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC51315ww3 get() {
        return m98338c(this.f20164a, this.f20165b.get());
    }
}
