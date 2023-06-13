package p000;

import co.bird.android.persistence.flightsheet.impl.FlightSheetDatabase;
/* renamed from: gk */
/* loaded from: classes4.dex */
public final class C22418gk implements InterfaceC48812sj1<AbstractC32010Bs1> {

    /* renamed from: a */
    public final C22711hj f84093a;

    /* renamed from: b */
    public final Y94<FlightSheetDatabase> f84094b;

    public C22418gk(C22711hj c22711hj, Y94<FlightSheetDatabase> y94) {
        this.f84093a = c22711hj;
        this.f84094b = y94;
    }

    /* renamed from: a */
    public static C22418gk m37865a(C22711hj c22711hj, Y94<FlightSheetDatabase> y94) {
        return new C22418gk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC32010Bs1 m37863c(C22711hj c22711hj, FlightSheetDatabase flightSheetDatabase) {
        return (AbstractC32010Bs1) C51679xZ3.m5002e(c22711hj.m36008Z(flightSheetDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC32010Bs1 get() {
        return m37863c(this.f84093a, this.f84094b.get());
    }
}
