package p000;

import co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase;
/* renamed from: Hk */
/* loaded from: classes4.dex */
public final class C3215Hk implements InterfaceC48812sj1<AbstractC35963Sp3> {

    /* renamed from: a */
    public final C22711hj f13825a;

    /* renamed from: b */
    public final Y94<OperatorOrderViewDatabase> f13826b;

    public C3215Hk(C22711hj c22711hj, Y94<OperatorOrderViewDatabase> y94) {
        this.f13825a = c22711hj;
        this.f13826b = y94;
    }

    /* renamed from: a */
    public static C3215Hk m103487a(C22711hj c22711hj, Y94<OperatorOrderViewDatabase> y94) {
        return new C3215Hk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC35963Sp3 m103485c(C22711hj c22711hj, OperatorOrderViewDatabase operatorOrderViewDatabase) {
        return (AbstractC35963Sp3) C51679xZ3.m5002e(c22711hj.m36057A0(operatorOrderViewDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC35963Sp3 get() {
        return m103485c(this.f13825a, this.f13826b.get());
    }
}
