package p000;

import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: Yj */
/* loaded from: classes4.dex */
public final class C9952Yj implements InterfaceC48812sj1<AbstractC41164fp1> {

    /* renamed from: a */
    public final C22711hj f46366a;

    /* renamed from: b */
    public final Y94<FleetStatusDatabase> f46367b;

    public C9952Yj(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        this.f46366a = c22711hj;
        this.f46367b = y94;
    }

    /* renamed from: a */
    public static C9952Yj m74351a(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        return new C9952Yj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC41164fp1 m74349c(C22711hj c22711hj, FleetStatusDatabase fleetStatusDatabase) {
        return (AbstractC41164fp1) C51679xZ3.m5002e(c22711hj.m36024R(fleetStatusDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC41164fp1 get() {
        return m74349c(this.f46366a, this.f46367b.get());
    }
}
