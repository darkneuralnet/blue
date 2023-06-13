package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: oO3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46245oO3 implements InterfaceC48812sj1<C45652nO3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f101865a;

    public C46245oO3(Y94<BaseActivity> y94) {
        this.f101865a = y94;
    }

    /* renamed from: a */
    public static C46245oO3 m21233a(Y94<BaseActivity> y94) {
        return new C46245oO3(y94);
    }

    /* renamed from: c */
    public static C45652nO3 m21231c(BaseActivity baseActivity) {
        return new C45652nO3(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45652nO3 get() {
        return m21231c(this.f101865a.get());
    }
}
