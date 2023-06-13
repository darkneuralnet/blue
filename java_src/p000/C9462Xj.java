package p000;

import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: Xj */
/* loaded from: classes4.dex */
public final class C9462Xj implements InterfaceC48812sj1<AbstractC37122Xo1> {

    /* renamed from: a */
    public final C22711hj f43726a;

    /* renamed from: b */
    public final Y94<FleetStatusDatabase> f43727b;

    public C9462Xj(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        this.f43726a = c22711hj;
        this.f43727b = y94;
    }

    /* renamed from: a */
    public static C9462Xj m76536a(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        return new C9462Xj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC37122Xo1 m76534c(C22711hj c22711hj, FleetStatusDatabase fleetStatusDatabase) {
        return (AbstractC37122Xo1) C51679xZ3.m5002e(c22711hj.m36026Q(fleetStatusDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC37122Xo1 get() {
        return m76534c(this.f43726a, this.f43727b.get());
    }
}
