package p000;

import co.bird.android.persistence.bird.impl.BirdDatabase;
/* renamed from: Bj */
/* loaded from: classes4.dex */
public final class C0694Bj implements InterfaceC48812sj1<AbstractC4030JM> {

    /* renamed from: a */
    public final C22711hj f2726a;

    /* renamed from: b */
    public final Y94<BirdDatabase> f2727b;

    public C0694Bj(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        this.f2726a = c22711hj;
        this.f2727b = y94;
    }

    /* renamed from: a */
    public static C0694Bj m113649a(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        return new C0694Bj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC4030JM m113647c(C22711hj c22711hj, BirdDatabase birdDatabase) {
        return (AbstractC4030JM) C51679xZ3.m5002e(c22711hj.m35969t(birdDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC4030JM get() {
        return m113647c(this.f2726a, this.f2727b.get());
    }
}
