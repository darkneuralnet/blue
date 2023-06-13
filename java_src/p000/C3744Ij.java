package p000;

import co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase;
/* renamed from: Ij */
/* loaded from: classes4.dex */
public final class C3744Ij implements InterfaceC48812sj1<M00> {

    /* renamed from: a */
    public final C22711hj f16113a;

    /* renamed from: b */
    public final Y94<BountyDatabase> f16114b;

    public C3744Ij(C22711hj c22711hj, Y94<BountyDatabase> y94) {
        this.f16113a = c22711hj;
        this.f16114b = y94;
    }

    /* renamed from: a */
    public static C3744Ij m101753a(C22711hj c22711hj, Y94<BountyDatabase> y94) {
        return new C3744Ij(c22711hj, y94);
    }

    /* renamed from: c */
    public static M00 m101751c(C22711hj c22711hj, BountyDatabase bountyDatabase) {
        return (M00) C51679xZ3.m5002e(c22711hj.m36058A(bountyDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public M00 get() {
        return m101751c(this.f16113a, this.f16114b.get());
    }
}
