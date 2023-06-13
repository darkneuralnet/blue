package p000;

import co.bird.android.manager.localasset.persistence.AssetDatabase;
/* renamed from: yj */
/* loaded from: classes4.dex */
public final class C30687yj implements InterfaceC48812sj1<AbstractC5089Lo> {

    /* renamed from: a */
    public final C22711hj f120054a;

    /* renamed from: b */
    public final Y94<AssetDatabase> f120055b;

    public C30687yj(C22711hj c22711hj, Y94<AssetDatabase> y94) {
        this.f120054a = c22711hj;
        this.f120055b = y94;
    }

    /* renamed from: a */
    public static C30687yj m2790a(C22711hj c22711hj, Y94<AssetDatabase> y94) {
        return new C30687yj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC5089Lo m2788c(C22711hj c22711hj, AssetDatabase assetDatabase) {
        return (AbstractC5089Lo) C51679xZ3.m5002e(c22711hj.m35975q(assetDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC5089Lo get() {
        return m2788c(this.f120054a, this.f120055b.get());
    }
}
