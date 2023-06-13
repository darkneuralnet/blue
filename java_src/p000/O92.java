package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: O92 */
/* loaded from: classes3.dex */
public final class O92 implements InterfaceC48812sj1<N92> {

    /* renamed from: a */
    public final Y94<BaseActivity> f26064a;

    /* renamed from: b */
    public final Y94<M92> f26065b;

    public O92(Y94<BaseActivity> y94, Y94<M92> y942) {
        this.f26064a = y94;
        this.f26065b = y942;
    }

    /* renamed from: a */
    public static O92 m92712a(Y94<BaseActivity> y94, Y94<M92> y942) {
        return new O92(y94, y942);
    }

    /* renamed from: c */
    public static N92 m92710c(BaseActivity baseActivity, M92 m92) {
        return new N92(baseActivity, m92);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public N92 get() {
        return m92710c(this.f26064a.get(), this.f26065b.get());
    }
}
