package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: BB4 */
/* loaded from: classes3.dex */
public final class BB4 implements InterfaceC48812sj1<AB4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f1979a;

    /* renamed from: b */
    public final Y94<C20206f5> f1980b;

    public BB4(Y94<BaseActivity> y94, Y94<C20206f5> y942) {
        this.f1979a = y94;
        this.f1980b = y942;
    }

    /* renamed from: a */
    public static BB4 m114276a(Y94<BaseActivity> y94, Y94<C20206f5> y942) {
        return new BB4(y94, y942);
    }

    /* renamed from: c */
    public static AB4 m114274c(BaseActivity baseActivity, C20206f5 c20206f5) {
        return new AB4(baseActivity, c20206f5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AB4 get() {
        return m114274c(this.f1979a.get(), this.f1980b.get());
    }
}
