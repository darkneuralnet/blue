package p000;

import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: Wj */
/* loaded from: classes4.dex */
public final class C9157Wj implements InterfaceC48812sj1<AbstractC51233wo1> {

    /* renamed from: a */
    public final C22711hj f41566a;

    /* renamed from: b */
    public final Y94<FleetStatusDatabase> f41567b;

    public C9157Wj(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        this.f41566a = c22711hj;
        this.f41567b = y94;
    }

    /* renamed from: a */
    public static C9157Wj m77953a(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        return new C9157Wj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC51233wo1 m77951c(C22711hj c22711hj, FleetStatusDatabase fleetStatusDatabase) {
        return (AbstractC51233wo1) C51679xZ3.m5002e(c22711hj.m36028P(fleetStatusDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC51233wo1 get() {
        return m77951c(this.f41566a, this.f41567b.get());
    }
}
