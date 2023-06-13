package p000;

import android.content.Context;
import co.bird.android.persistence.warehousemarker.impl.WarehouseMarkerDatabase;
/* renamed from: Zk */
/* loaded from: classes4.dex */
public final class C10348Zk implements InterfaceC48812sj1<WarehouseMarkerDatabase> {

    /* renamed from: a */
    public final C22711hj f49081a;

    /* renamed from: b */
    public final Y94<Context> f49082b;

    public C10348Zk(C22711hj c22711hj, Y94<Context> y94) {
        this.f49081a = c22711hj;
        this.f49082b = y94;
    }

    /* renamed from: a */
    public static C10348Zk m72598a(C22711hj c22711hj, Y94<Context> y94) {
        return new C10348Zk(c22711hj, y94);
    }

    /* renamed from: c */
    public static WarehouseMarkerDatabase m72596c(C22711hj c22711hj, Context context) {
        return (WarehouseMarkerDatabase) C51679xZ3.m5002e(c22711hj.m36017U0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public WarehouseMarkerDatabase get() {
        return m72596c(this.f49081a, this.f49082b.get());
    }
}
