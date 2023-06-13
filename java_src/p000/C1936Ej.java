package p000;

import co.bird.android.persistence.birdratinghistory.BirdRatingHistoryDatabase;
/* renamed from: Ej */
/* loaded from: classes4.dex */
public final class C1936Ej implements InterfaceC48812sj1<AbstractC1025CR> {

    /* renamed from: a */
    public final C22711hj f7978a;

    /* renamed from: b */
    public final Y94<BirdRatingHistoryDatabase> f7979b;

    public C1936Ej(C22711hj c22711hj, Y94<BirdRatingHistoryDatabase> y94) {
        this.f7978a = c22711hj;
        this.f7979b = y94;
    }

    /* renamed from: a */
    public static C1936Ej m108561a(C22711hj c22711hj, Y94<BirdRatingHistoryDatabase> y94) {
        return new C1936Ej(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC1025CR m108559c(C22711hj c22711hj, BirdRatingHistoryDatabase birdRatingHistoryDatabase) {
        return (AbstractC1025CR) C51679xZ3.m5002e(c22711hj.m35963w(birdRatingHistoryDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC1025CR get() {
        return m108559c(this.f7978a, this.f7979b.get());
    }
}
