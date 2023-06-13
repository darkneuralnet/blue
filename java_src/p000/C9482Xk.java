package p000;

import android.content.Context;
import co.bird.android.persistence.warehouseflightsheet.impl.WarehouseFlightSheetDatabase;
/* renamed from: Xk */
/* loaded from: classes4.dex */
public final class C9482Xk implements InterfaceC48812sj1<WarehouseFlightSheetDatabase> {

    /* renamed from: a */
    public final C22711hj f43776a;

    /* renamed from: b */
    public final Y94<Context> f43777b;

    public C9482Xk(C22711hj c22711hj, Y94<Context> y94) {
        this.f43776a = c22711hj;
        this.f43777b = y94;
    }

    /* renamed from: a */
    public static C9482Xk m76494a(C22711hj c22711hj, Y94<Context> y94) {
        return new C9482Xk(c22711hj, y94);
    }

    /* renamed from: c */
    public static WarehouseFlightSheetDatabase m76492c(C22711hj c22711hj, Context context) {
        return (WarehouseFlightSheetDatabase) C51679xZ3.m5002e(c22711hj.m36021S0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public WarehouseFlightSheetDatabase get() {
        return m76492c(this.f43776a, this.f43777b.get());
    }
}
