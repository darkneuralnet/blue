package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: hO */
/* loaded from: classes3.dex */
public final class C22634hO implements InterfaceC48812sj1<C20835gO> {

    /* renamed from: a */
    public final Y94<BaseActivity> f85136a;

    public C22634hO(Y94<BaseActivity> y94) {
        this.f85136a = y94;
    }

    /* renamed from: a */
    public static C22634hO m36476a(Y94<BaseActivity> y94) {
        return new C22634hO(y94);
    }

    /* renamed from: c */
    public static C20835gO m36474c(BaseActivity baseActivity) {
        return new C20835gO(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C20835gO get() {
        return m36474c(this.f85136a.get());
    }
}
