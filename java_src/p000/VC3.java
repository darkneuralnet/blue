package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: VC3 */
/* loaded from: classes3.dex */
public final class VC3 implements InterfaceC48812sj1<UC3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f38733a;

    /* renamed from: b */
    public final Y94<C2126F4> f38734b;

    public VC3(Y94<BaseActivity> y94, Y94<C2126F4> y942) {
        this.f38733a = y94;
        this.f38734b = y942;
    }

    /* renamed from: a */
    public static VC3 m80234a(Y94<BaseActivity> y94, Y94<C2126F4> y942) {
        return new VC3(y94, y942);
    }

    /* renamed from: c */
    public static UC3 m80232c(BaseActivity baseActivity, C2126F4 c2126f4) {
        return new UC3(baseActivity, c2126f4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public UC3 get() {
        return m80232c(this.f38733a.get(), this.f38734b.get());
    }
}
