package p000;

import co.bird.android.persistence.warehouseflightsheet.impl.WarehouseFlightSheetDatabase;
/* renamed from: Wk */
/* loaded from: classes4.dex */
public final class C9161Wk implements InterfaceC48812sj1<AbstractC34175Ky6> {

    /* renamed from: a */
    public final C22711hj f41870a;

    /* renamed from: b */
    public final Y94<WarehouseFlightSheetDatabase> f41871b;

    public C9161Wk(C22711hj c22711hj, Y94<WarehouseFlightSheetDatabase> y94) {
        this.f41870a = c22711hj;
        this.f41871b = y94;
    }

    /* renamed from: a */
    public static C9161Wk m77901a(C22711hj c22711hj, Y94<WarehouseFlightSheetDatabase> y94) {
        return new C9161Wk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC34175Ky6 m77899c(C22711hj c22711hj, WarehouseFlightSheetDatabase warehouseFlightSheetDatabase) {
        return (AbstractC34175Ky6) C51679xZ3.m5002e(c22711hj.m36023R0(warehouseFlightSheetDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC34175Ky6 get() {
        return m77899c(this.f41870a, this.f41871b.get());
    }
}
