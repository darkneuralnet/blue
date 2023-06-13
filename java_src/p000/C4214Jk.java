package p000;

import co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase;
/* renamed from: Jk */
/* loaded from: classes4.dex */
public final class C4214Jk implements InterfaceC48812sj1<AbstractC38787bq3> {

    /* renamed from: a */
    public final C22711hj f18094a;

    /* renamed from: b */
    public final Y94<OperatorOrderViewDatabase> f18095b;

    public C4214Jk(C22711hj c22711hj, Y94<OperatorOrderViewDatabase> y94) {
        this.f18094a = c22711hj;
        this.f18095b = y94;
    }

    /* renamed from: a */
    public static C4214Jk m99903a(C22711hj c22711hj, Y94<OperatorOrderViewDatabase> y94) {
        return new C4214Jk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC38787bq3 m99901c(C22711hj c22711hj, OperatorOrderViewDatabase operatorOrderViewDatabase) {
        return (AbstractC38787bq3) C51679xZ3.m5002e(c22711hj.m36053C0(operatorOrderViewDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC38787bq3 get() {
        return m99901c(this.f18094a, this.f18095b.get());
    }
}
