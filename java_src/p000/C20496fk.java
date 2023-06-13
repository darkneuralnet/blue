package p000;

import android.content.Context;
import co.bird.android.persistence.flightsheet.impl.FlightSheetDatabase;
/* renamed from: fk */
/* loaded from: classes4.dex */
public final class C20496fk implements InterfaceC48812sj1<FlightSheetDatabase> {

    /* renamed from: a */
    public final C22711hj f80507a;

    /* renamed from: b */
    public final Y94<Context> f80508b;

    public C20496fk(C22711hj c22711hj, Y94<Context> y94) {
        this.f80507a = c22711hj;
        this.f80508b = y94;
    }

    /* renamed from: a */
    public static C20496fk m40982a(C22711hj c22711hj, Y94<Context> y94) {
        return new C20496fk(c22711hj, y94);
    }

    /* renamed from: c */
    public static FlightSheetDatabase m40980c(C22711hj c22711hj, Context context) {
        return (FlightSheetDatabase) C51679xZ3.m5002e(c22711hj.m36010Y(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FlightSheetDatabase get() {
        return m40980c(this.f80507a, this.f80508b.get());
    }
}
