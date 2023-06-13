package co.bird.android.feature.rider.birdpay.confirmation;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.confirmation.C15347e;
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.d */
/* loaded from: classes3.dex */
public final class C15346d implements InterfaceC48812sj1<C15347e.C15349b> {

    /* renamed from: a */
    public final Y94<BaseActivity> f64888a;

    public C15346d(Y94<BaseActivity> y94) {
        this.f64888a = y94;
    }

    /* renamed from: a */
    public static C15346d m57352a(Y94<BaseActivity> y94) {
        return new C15346d(y94);
    }

    /* renamed from: c */
    public static C15347e.C15349b m57350c(BaseActivity baseActivity) {
        return (C15347e.C15349b) C51679xZ3.m5002e(AbstractC15344c.m57357a(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C15347e.C15349b get() {
        return m57350c(this.f64888a.get());
    }
}
