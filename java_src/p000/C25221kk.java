package p000;

import co.bird.android.manager.hardcount.persistence.HardCountDatabase;
/* renamed from: kk */
/* loaded from: classes4.dex */
public final class C25221kk implements InterfaceC48812sj1<AbstractC42604iF1> {

    /* renamed from: a */
    public final C22711hj f94843a;

    /* renamed from: b */
    public final Y94<HardCountDatabase> f94844b;

    public C25221kk(C22711hj c22711hj, Y94<HardCountDatabase> y94) {
        this.f94843a = c22711hj;
        this.f94844b = y94;
    }

    /* renamed from: a */
    public static C25221kk m28561a(C22711hj c22711hj, Y94<HardCountDatabase> y94) {
        return new C25221kk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC42604iF1 m28559c(C22711hj c22711hj, HardCountDatabase hardCountDatabase) {
        return (AbstractC42604iF1) C51679xZ3.m5002e(c22711hj.m36000d0(hardCountDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC42604iF1 get() {
        return m28559c(this.f94843a, this.f94844b.get());
    }
}
