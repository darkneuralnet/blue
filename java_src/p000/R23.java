package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: R23 */
/* loaded from: classes3.dex */
public final class R23 implements InterfaceC48812sj1<Q23> {

    /* renamed from: a */
    public final Y94<BaseActivity> f31417a;

    /* renamed from: b */
    public final Y94<C27137p4> f31418b;

    public R23(Y94<BaseActivity> y94, Y94<C27137p4> y942) {
        this.f31417a = y94;
        this.f31418b = y942;
    }

    /* renamed from: a */
    public static R23 m87398a(Y94<BaseActivity> y94, Y94<C27137p4> y942) {
        return new R23(y94, y942);
    }

    /* renamed from: c */
    public static Q23 m87396c(BaseActivity baseActivity, C27137p4 c27137p4) {
        return new Q23(baseActivity, c27137p4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Q23 get() {
        return m87396c(this.f31417a.get(), this.f31418b.get());
    }
}
