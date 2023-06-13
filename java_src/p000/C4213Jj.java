package p000;

import co.bird.android.persistence.brainswap.impl.BrainSwapDatabase;
/* renamed from: Jj */
/* loaded from: classes4.dex */
public final class C4213Jj implements InterfaceC48812sj1<AbstractC44247l10> {

    /* renamed from: a */
    public final C22711hj f18078a;

    /* renamed from: b */
    public final Y94<BrainSwapDatabase> f18079b;

    public C4213Jj(C22711hj c22711hj, Y94<BrainSwapDatabase> y94) {
        this.f18078a = c22711hj;
        this.f18079b = y94;
    }

    /* renamed from: a */
    public static C4213Jj m99919a(C22711hj c22711hj, Y94<BrainSwapDatabase> y94) {
        return new C4213Jj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC44247l10 m99917c(C22711hj c22711hj, BrainSwapDatabase brainSwapDatabase) {
        return (AbstractC44247l10) C51679xZ3.m5002e(c22711hj.m36056B(brainSwapDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC44247l10 get() {
        return m99917c(this.f18078a, this.f18079b.get());
    }
}
