package p000;

import co.bird.android.persistence.hardcount.impl.HardCountScanDatabase;
/* renamed from: mk */
/* loaded from: classes4.dex */
public final class C26181mk implements InterfaceC48812sj1<AbstractC44401lH1> {

    /* renamed from: a */
    public final C22711hj f98653a;

    /* renamed from: b */
    public final Y94<HardCountScanDatabase> f98654b;

    public C26181mk(C22711hj c22711hj, Y94<HardCountScanDatabase> y94) {
        this.f98653a = c22711hj;
        this.f98654b = y94;
    }

    /* renamed from: a */
    public static C26181mk m25132a(C22711hj c22711hj, Y94<HardCountScanDatabase> y94) {
        return new C26181mk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC44401lH1 m25130c(C22711hj c22711hj, HardCountScanDatabase hardCountScanDatabase) {
        return (AbstractC44401lH1) C51679xZ3.m5002e(c22711hj.m35996f0(hardCountScanDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC44401lH1 get() {
        return m25130c(this.f98653a, this.f98654b.get());
    }
}