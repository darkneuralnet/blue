package p000;

import co.bird.android.persistence.nestflightsheet.impl.NestFlightSheetDatabase;
/* renamed from: wk */
/* loaded from: classes4.dex */
public final class C29950wk implements InterfaceC48812sj1<J33> {

    /* renamed from: a */
    public final C22711hj f116412a;

    /* renamed from: b */
    public final Y94<NestFlightSheetDatabase> f116413b;

    public C29950wk(C22711hj c22711hj, Y94<NestFlightSheetDatabase> y94) {
        this.f116412a = c22711hj;
        this.f116413b = y94;
    }

    /* renamed from: a */
    public static C29950wk m6429a(C22711hj c22711hj, Y94<NestFlightSheetDatabase> y94) {
        return new C29950wk(c22711hj, y94);
    }

    /* renamed from: c */
    public static J33 m6427c(C22711hj c22711hj, NestFlightSheetDatabase nestFlightSheetDatabase) {
        return (J33) C51679xZ3.m5002e(c22711hj.m35976p0(nestFlightSheetDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public J33 get() {
        return m6427c(this.f116412a, this.f116413b.get());
    }
}
