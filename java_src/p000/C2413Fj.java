package p000;

import android.content.Context;
import co.bird.android.persistence.birdratinghistory.BirdRatingHistoryDatabase;
/* renamed from: Fj */
/* loaded from: classes4.dex */
public final class C2413Fj implements InterfaceC48812sj1<BirdRatingHistoryDatabase> {

    /* renamed from: a */
    public final C22711hj f9994a;

    /* renamed from: b */
    public final Y94<Context> f9995b;

    public C2413Fj(C22711hj c22711hj, Y94<Context> y94) {
        this.f9994a = c22711hj;
        this.f9995b = y94;
    }

    /* renamed from: a */
    public static C2413Fj m106690a(C22711hj c22711hj, Y94<Context> y94) {
        return new C2413Fj(c22711hj, y94);
    }

    /* renamed from: c */
    public static BirdRatingHistoryDatabase m106688c(C22711hj c22711hj, Context context) {
        return (BirdRatingHistoryDatabase) C51679xZ3.m5002e(c22711hj.m35961x(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BirdRatingHistoryDatabase get() {
        return m106688c(this.f9994a, this.f9995b.get());
    }
}
