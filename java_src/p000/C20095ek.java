package p000;

import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: ek */
/* loaded from: classes4.dex */
public final class C20095ek implements InterfaceC48812sj1<AbstractC50670vr1> {

    /* renamed from: a */
    public final C22711hj f78754a;

    /* renamed from: b */
    public final Y94<FleetStatusDatabase> f78755b;

    public C20095ek(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        this.f78754a = c22711hj;
        this.f78755b = y94;
    }

    /* renamed from: a */
    public static C20095ek m42602a(C22711hj c22711hj, Y94<FleetStatusDatabase> y94) {
        return new C20095ek(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC50670vr1 m42600c(C22711hj c22711hj, FleetStatusDatabase fleetStatusDatabase) {
        return (AbstractC50670vr1) C51679xZ3.m5002e(c22711hj.m36012X(fleetStatusDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC50670vr1 get() {
        return m42600c(this.f78754a, this.f78755b.get());
    }
}
