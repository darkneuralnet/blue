package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: R84 */
/* loaded from: classes3.dex */
public final class R84 implements InterfaceC48812sj1<P84> {

    /* renamed from: a */
    public final Y94<BaseActivity> f31600a;

    /* renamed from: b */
    public final Y94<C7645T4> f31601b;

    /* renamed from: c */
    public final Y94<C46693p84> f31602c;

    public R84(Y94<BaseActivity> y94, Y94<C7645T4> y942, Y94<C46693p84> y943) {
        this.f31600a = y94;
        this.f31601b = y942;
        this.f31602c = y943;
    }

    /* renamed from: a */
    public static R84 m87240a(Y94<BaseActivity> y94, Y94<C7645T4> y942, Y94<C46693p84> y943) {
        return new R84(y94, y942, y943);
    }

    /* renamed from: c */
    public static P84 m87238c(BaseActivity baseActivity, C7645T4 c7645t4, C46693p84 c46693p84) {
        return new P84(baseActivity, c7645t4, c46693p84);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public P84 get() {
        return m87238c(this.f31600a.get(), this.f31601b.get(), this.f31602c.get());
    }
}
