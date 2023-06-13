package p000;

import co.bird.android.persistence.zone.impl.ZoneDatabase;
/* renamed from: bl */
/* loaded from: classes4.dex */
public final class C12491bl implements InterfaceC48812sj1<CI6> {

    /* renamed from: a */
    public final C22711hj f58032a;

    /* renamed from: b */
    public final Y94<ZoneDatabase> f58033b;

    public C12491bl(C22711hj c22711hj, Y94<ZoneDatabase> y94) {
        this.f58032a = c22711hj;
        this.f58033b = y94;
    }

    /* renamed from: a */
    public static C12491bl m64043a(C22711hj c22711hj, Y94<ZoneDatabase> y94) {
        return new C12491bl(c22711hj, y94);
    }

    /* renamed from: c */
    public static CI6 m64041c(C22711hj c22711hj, ZoneDatabase zoneDatabase) {
        return (CI6) C51679xZ3.m5002e(c22711hj.m36013W0(zoneDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public CI6 get() {
        return m64041c(this.f58032a, this.f58033b.get());
    }
}
