package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: W40 */
/* loaded from: classes3.dex */
public final class W40 implements InterfaceC48812sj1<V40> {

    /* renamed from: a */
    public final Y94<BaseActivity> f40368a;

    /* renamed from: b */
    public final Y94<C20179f3> f40369b;

    public W40(Y94<BaseActivity> y94, Y94<C20179f3> y942) {
        this.f40368a = y94;
        this.f40369b = y942;
    }

    /* renamed from: a */
    public static W40 m78871a(Y94<BaseActivity> y94, Y94<C20179f3> y942) {
        return new W40(y94, y942);
    }

    /* renamed from: c */
    public static V40 m78869c(BaseActivity baseActivity, C20179f3 c20179f3) {
        return new V40(baseActivity, c20179f3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public V40 get() {
        return m78869c(this.f40368a.get(), this.f40369b.get());
    }
}
