package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: LB4 */
/* loaded from: classes3.dex */
public final class LB4 implements InterfaceC48812sj1<KB4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f20875a;

    /* renamed from: b */
    public final Y94<C20724g5> f20876b;

    public LB4(Y94<BaseActivity> y94, Y94<C20724g5> y942) {
        this.f20875a = y94;
        this.f20876b = y942;
    }

    /* renamed from: a */
    public static LB4 m97609a(Y94<BaseActivity> y94, Y94<C20724g5> y942) {
        return new LB4(y94, y942);
    }

    /* renamed from: c */
    public static KB4 m97607c(BaseActivity baseActivity, C20724g5 c20724g5) {
        return new KB4(baseActivity, c20724g5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public KB4 get() {
        return m97607c(this.f20875a.get(), this.f20876b.get());
    }
}
