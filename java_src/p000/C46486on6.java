package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: on6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46486on6 implements InterfaceC48812sj1<C45893nn6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f102503a;

    public C46486on6(Y94<BaseActivity> y94) {
        this.f102503a = y94;
    }

    /* renamed from: a */
    public static C46486on6 m20489a(Y94<BaseActivity> y94) {
        return new C46486on6(y94);
    }

    /* renamed from: c */
    public static C45893nn6 m20487c(BaseActivity baseActivity) {
        return new C45893nn6(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45893nn6 get() {
        return m20487c(this.f102503a.get());
    }
}
