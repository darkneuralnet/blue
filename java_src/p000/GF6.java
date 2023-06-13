package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: GF6 */
/* loaded from: classes3.dex */
public final class GF6 implements InterfaceC48812sj1<FF6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f11215a;

    /* renamed from: b */
    public final Y94<C19672d4> f11216b;

    public GF6(Y94<BaseActivity> y94, Y94<C19672d4> y942) {
        this.f11215a = y94;
        this.f11216b = y942;
    }

    /* renamed from: a */
    public static GF6 m105586a(Y94<BaseActivity> y94, Y94<C19672d4> y942) {
        return new GF6(y94, y942);
    }

    /* renamed from: c */
    public static FF6 m105584c(BaseActivity baseActivity, C19672d4 c19672d4) {
        return new FF6(baseActivity, c19672d4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FF6 get() {
        return m105584c(this.f11215a.get(), this.f11216b.get());
    }
}
