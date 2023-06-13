package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Z7 */
/* loaded from: classes3.dex */
public final class C10115Z7 implements InterfaceC48812sj1<C9636Y7> {

    /* renamed from: a */
    public final Y94<BaseActivity> f47850a;

    /* renamed from: b */
    public final Y94<C6231P2> f47851b;

    public C10115Z7(Y94<BaseActivity> y94, Y94<C6231P2> y942) {
        this.f47850a = y94;
        this.f47851b = y942;
    }

    /* renamed from: a */
    public static C10115Z7 m73723a(Y94<BaseActivity> y94, Y94<C6231P2> y942) {
        return new C10115Z7(y94, y942);
    }

    /* renamed from: c */
    public static C9636Y7 m73721c(BaseActivity baseActivity, C6231P2 c6231p2) {
        return new C9636Y7(baseActivity, c6231p2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C9636Y7 get() {
        return m73721c(this.f47850a.get(), this.f47851b.get());
    }
}
