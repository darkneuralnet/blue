package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Q13 */
/* loaded from: classes2.dex */
public final class Q13 implements InterfaceC48812sj1<P13> {

    /* renamed from: a */
    public final Y94<BaseActivity> f29703a;

    /* renamed from: b */
    public final Y94<C51975y31> f29704b;

    public Q13(Y94<BaseActivity> y94, Y94<C51975y31> y942) {
        this.f29703a = y94;
        this.f29704b = y942;
    }

    /* renamed from: a */
    public static Q13 m89114a(Y94<BaseActivity> y94, Y94<C51975y31> y942) {
        return new Q13(y94, y942);
    }

    /* renamed from: c */
    public static P13 m89112c(BaseActivity baseActivity, C51975y31 c51975y31) {
        return new P13(baseActivity, c51975y31);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public P13 get() {
        return m89112c(this.f29703a.get(), this.f29704b.get());
    }
}
