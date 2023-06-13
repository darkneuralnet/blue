package p000;

import co.bird.android.persistence.birdplus.BirdPlusViewDatabase;
/* renamed from: Dj */
/* loaded from: classes4.dex */
public final class C1587Dj implements InterfaceC48812sj1<AbstractC25698lR> {

    /* renamed from: a */
    public final C22711hj f6223a;

    /* renamed from: b */
    public final Y94<BirdPlusViewDatabase> f6224b;

    public C1587Dj(C22711hj c22711hj, Y94<BirdPlusViewDatabase> y94) {
        this.f6223a = c22711hj;
        this.f6224b = y94;
    }

    /* renamed from: a */
    public static C1587Dj m109995a(C22711hj c22711hj, Y94<BirdPlusViewDatabase> y94) {
        return new C1587Dj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC25698lR m109993c(C22711hj c22711hj, BirdPlusViewDatabase birdPlusViewDatabase) {
        return (AbstractC25698lR) C51679xZ3.m5002e(c22711hj.m35965v(birdPlusViewDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC25698lR get() {
        return m109993c(this.f6223a, this.f6224b.get());
    }
}
