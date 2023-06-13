package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: F92 */
/* loaded from: classes3.dex */
public final class F92 implements InterfaceC48812sj1<E92> {

    /* renamed from: a */
    public final Y94<BaseActivity> f8911a;

    /* renamed from: b */
    public final Y94<C10107Z3> f8912b;

    public F92(Y94<BaseActivity> y94, Y94<C10107Z3> y942) {
        this.f8911a = y94;
        this.f8912b = y942;
    }

    /* renamed from: a */
    public static F92 m107559a(Y94<BaseActivity> y94, Y94<C10107Z3> y942) {
        return new F92(y94, y942);
    }

    /* renamed from: c */
    public static E92 m107557c(BaseActivity baseActivity, C10107Z3 c10107z3) {
        return new E92(baseActivity, c10107z3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public E92 get() {
        return m107557c(this.f8911a.get(), this.f8912b.get());
    }
}
