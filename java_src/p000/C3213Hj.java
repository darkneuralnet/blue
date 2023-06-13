package p000;

import co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase;
/* renamed from: Hj */
/* loaded from: classes4.dex */
public final class C3213Hj implements InterfaceC48812sj1<K00> {

    /* renamed from: a */
    public final C22711hj f13793a;

    /* renamed from: b */
    public final Y94<BountyDatabase> f13794b;

    public C3213Hj(C22711hj c22711hj, Y94<BountyDatabase> y94) {
        this.f13793a = c22711hj;
        this.f13794b = y94;
    }

    /* renamed from: a */
    public static C3213Hj m103499a(C22711hj c22711hj, Y94<BountyDatabase> y94) {
        return new C3213Hj(c22711hj, y94);
    }

    /* renamed from: c */
    public static K00 m103497c(C22711hj c22711hj, BountyDatabase bountyDatabase) {
        return (K00) C51679xZ3.m5002e(c22711hj.m35957z(bountyDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public K00 get() {
        return m103497c(this.f13793a, this.f13794b.get());
    }
}
