package p000;

import android.content.Context;
import co.bird.android.persistence.fleetreport.impl.FleetReportDatabase;
/* renamed from: ak */
/* loaded from: classes4.dex */
public final class C10827ak implements InterfaceC48812sj1<FleetReportDatabase> {

    /* renamed from: a */
    public final C22711hj f51018a;

    /* renamed from: b */
    public final Y94<Context> f51019b;

    public C10827ak(C22711hj c22711hj, Y94<Context> y94) {
        this.f51018a = c22711hj;
        this.f51019b = y94;
    }

    /* renamed from: a */
    public static C10827ak m70821a(C22711hj c22711hj, Y94<Context> y94) {
        return new C10827ak(c22711hj, y94);
    }

    /* renamed from: c */
    public static FleetReportDatabase m70819c(C22711hj c22711hj, Context context) {
        return (FleetReportDatabase) C51679xZ3.m5002e(c22711hj.m36020T(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FleetReportDatabase get() {
        return m70819c(this.f51018a, this.f51019b.get());
    }
}
