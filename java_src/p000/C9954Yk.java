package p000;

import co.bird.android.persistence.warehousemarker.impl.WarehouseMarkerDatabase;
/* renamed from: Yk */
/* loaded from: classes4.dex */
public final class C9954Yk implements InterfaceC48812sj1<AbstractC36983Wy6> {

    /* renamed from: a */
    public final C22711hj f46515a;

    /* renamed from: b */
    public final Y94<WarehouseMarkerDatabase> f46516b;

    public C9954Yk(C22711hj c22711hj, Y94<WarehouseMarkerDatabase> y94) {
        this.f46515a = c22711hj;
        this.f46516b = y94;
    }

    /* renamed from: a */
    public static C9954Yk m74345a(C22711hj c22711hj, Y94<WarehouseMarkerDatabase> y94) {
        return new C9954Yk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC36983Wy6 m74343c(C22711hj c22711hj, WarehouseMarkerDatabase warehouseMarkerDatabase) {
        return (AbstractC36983Wy6) C51679xZ3.m5002e(c22711hj.m36019T0(warehouseMarkerDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC36983Wy6 get() {
        return m74343c(this.f46515a, this.f46516b.get());
    }
}
