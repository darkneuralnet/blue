package p000;

import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: ck */
/* loaded from: classes4.dex */
public final class C13654ck implements InterfaceC48812sj1<AbstractC51253wq1> {

    /* renamed from: a */
    public final C22711hj f61126a;

    /* renamed from: b */
    public final Y94<FleetStatusDatabase> f61127b;

    public C13654ck(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        this.f61126a = c22711hj;
        this.f61127b = y94;
    }

    /* renamed from: a */
    public static C13654ck m61014a(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        return new C13654ck(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC51253wq1 m61012c(C22711hj c22711hj, FleetStatusDatabase fleetStatusDatabase) {
        return (AbstractC51253wq1) C51679xZ3.m5002e(c22711hj.m36016V(fleetStatusDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC51253wq1 get() {
        return m61012c(this.f61126a, this.f61127b.get());
    }
}
