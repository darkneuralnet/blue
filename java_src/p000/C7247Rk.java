package p000;

import android.content.Context;
import co.bird.android.persistence.ridepassview.RidePassViewDatabase;
/* renamed from: Rk */
/* loaded from: classes4.dex */
public final class C7247Rk implements InterfaceC48812sj1<RidePassViewDatabase> {

    /* renamed from: a */
    public final C22711hj f32491a;

    /* renamed from: b */
    public final Y94<Context> f32492b;

    public C7247Rk(C22711hj c22711hj, Y94<Context> y94) {
        this.f32491a = c22711hj;
        this.f32492b = y94;
    }

    /* renamed from: a */
    public static C7247Rk m86412a(C22711hj c22711hj, Y94<Context> y94) {
        return new C7247Rk(c22711hj, y94);
    }

    /* renamed from: c */
    public static RidePassViewDatabase m86410c(C22711hj c22711hj, Context context) {
        return (RidePassViewDatabase) C51679xZ3.m5002e(c22711hj.m36033M0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RidePassViewDatabase get() {
        return m86410c(this.f32491a, this.f32492b.get());
    }
}
