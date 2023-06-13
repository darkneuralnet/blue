package p000;

import co.bird.android.persistence.ridepassview.RidePassViewDatabase;
/* renamed from: Qk */
/* loaded from: classes4.dex */
public final class C6848Qk implements InterfaceC48812sj1<CX4> {

    /* renamed from: a */
    public final C22711hj f30808a;

    /* renamed from: b */
    public final Y94<RidePassViewDatabase> f30809b;

    public C6848Qk(C22711hj c22711hj, Y94<RidePassViewDatabase> y94) {
        this.f30808a = c22711hj;
        this.f30809b = y94;
    }

    /* renamed from: a */
    public static C6848Qk m88109a(C22711hj c22711hj, Y94<RidePassViewDatabase> y94) {
        return new C6848Qk(c22711hj, y94);
    }

    /* renamed from: c */
    public static CX4 m88107c(C22711hj c22711hj, RidePassViewDatabase ridePassViewDatabase) {
        return (CX4) C51679xZ3.m5002e(c22711hj.m36035L0(ridePassViewDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public CX4 get() {
        return m88107c(this.f30808a, this.f30809b.get());
    }
}
