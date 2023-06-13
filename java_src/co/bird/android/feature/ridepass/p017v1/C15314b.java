package co.bird.android.feature.ridepass.p017v1;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.ridepass.p017v1.RidePassActivity;
/* renamed from: co.bird.android.feature.ridepass.v1.b */
/* loaded from: classes3.dex */
public final class C15314b implements InterfaceC48812sj1<String> {

    /* renamed from: a */
    public final Y94<BaseActivity> f64819a;

    public C15314b(Y94<BaseActivity> y94) {
        this.f64819a = y94;
    }

    /* renamed from: a */
    public static C15314b m57409a(Y94<BaseActivity> y94) {
        return new C15314b(y94);
    }

    /* renamed from: c */
    public static String m57407c(BaseActivity baseActivity) {
        return (String) C51679xZ3.m5002e(RidePassActivity.AbstractC15300b.m57427b(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public String get() {
        return m57407c(this.f64819a.get());
    }
}
