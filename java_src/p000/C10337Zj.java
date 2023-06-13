package p000;

import co.bird.android.persistence.fleetreport.impl.FleetReportDatabase;
/* renamed from: Zj */
/* loaded from: classes4.dex */
public final class C10337Zj implements InterfaceC48812sj1<AbstractC53022zp1> {

    /* renamed from: a */
    public final C22711hj f48998a;

    /* renamed from: b */
    public final Y94<FleetReportDatabase> f48999b;

    public C10337Zj(C22711hj c22711hj, Y94<FleetReportDatabase> y94) {
        this.f48998a = c22711hj;
        this.f48999b = y94;
    }

    /* renamed from: a */
    public static C10337Zj m72649a(C22711hj c22711hj, Y94<FleetReportDatabase> y94) {
        return new C10337Zj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC53022zp1 m72647c(C22711hj c22711hj, FleetReportDatabase fleetReportDatabase) {
        return (AbstractC53022zp1) C51679xZ3.m5002e(c22711hj.m36022S(fleetReportDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC53022zp1 get() {
        return m72647c(this.f48998a, this.f48999b.get());
    }
}
