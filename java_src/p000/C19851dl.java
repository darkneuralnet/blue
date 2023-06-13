package p000;

import co.bird.android.persistence.zone.impl.ZoneDatabase;
/* renamed from: dl */
/* loaded from: classes4.dex */
public final class C19851dl implements InterfaceC48812sj1<MI6> {

    /* renamed from: a */
    public final C22711hj f77159a;

    /* renamed from: b */
    public final Y94<ZoneDatabase> f77160b;

    public C19851dl(C22711hj c22711hj, Y94<ZoneDatabase> y94) {
        this.f77159a = c22711hj;
        this.f77160b = y94;
    }

    /* renamed from: a */
    public static C19851dl m43789a(C22711hj c22711hj, Y94<ZoneDatabase> y94) {
        return new C19851dl(c22711hj, y94);
    }

    /* renamed from: c */
    public static MI6 m43787c(C22711hj c22711hj, ZoneDatabase zoneDatabase) {
        return (MI6) C51679xZ3.m5002e(c22711hj.m36009Y0(zoneDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MI6 get() {
        return m43787c(this.f77159a, this.f77160b.get());
    }
}
