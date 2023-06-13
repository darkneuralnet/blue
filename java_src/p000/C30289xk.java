package p000;

import android.content.Context;
import co.bird.android.persistence.nestflightsheet.impl.NestFlightSheetDatabase;
/* renamed from: xk */
/* loaded from: classes4.dex */
public final class C30289xk implements InterfaceC48812sj1<NestFlightSheetDatabase> {

    /* renamed from: a */
    public final C22711hj f118038a;

    /* renamed from: b */
    public final Y94<Context> f118039b;

    public C30289xk(C22711hj c22711hj, Y94<Context> y94) {
        this.f118038a = c22711hj;
        this.f118039b = y94;
    }

    /* renamed from: a */
    public static C30289xk m4765a(C22711hj c22711hj, Y94<Context> y94) {
        return new C30289xk(c22711hj, y94);
    }

    /* renamed from: c */
    public static NestFlightSheetDatabase m4763c(C22711hj c22711hj, Context context) {
        return (NestFlightSheetDatabase) C51679xZ3.m5002e(c22711hj.m35974q0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NestFlightSheetDatabase get() {
        return m4763c(this.f118038a, this.f118039b.get());
    }
}
