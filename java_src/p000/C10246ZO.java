package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ZO */
/* loaded from: classes2.dex */
public final class C10246ZO implements InterfaceC48812sj1<C9765YO> {

    /* renamed from: a */
    public final Y94<BaseActivity> f48468a;

    public C10246ZO(Y94<BaseActivity> y94) {
        this.f48468a = y94;
    }

    /* renamed from: a */
    public static C10246ZO m73220a(Y94<BaseActivity> y94) {
        return new C10246ZO(y94);
    }

    /* renamed from: c */
    public static C9765YO m73218c(BaseActivity baseActivity) {
        return new C9765YO(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C9765YO get() {
        return m73218c(this.f48468a.get());
    }
}
