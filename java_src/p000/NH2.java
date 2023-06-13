package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: NH2 */
/* loaded from: classes3.dex */
public final class NH2 implements InterfaceC48812sj1<MH2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f24390a;

    /* renamed from: b */
    public final Y94<C50923wH2> f24391b;

    public NH2(Y94<BaseActivity> y94, Y94<C50923wH2> y942) {
        this.f24390a = y94;
        this.f24391b = y942;
    }

    /* renamed from: a */
    public static NH2 m94109a(Y94<BaseActivity> y94, Y94<C50923wH2> y942) {
        return new NH2(y94, y942);
    }

    /* renamed from: c */
    public static MH2 m94107c(BaseActivity baseActivity, C50923wH2 c50923wH2) {
        return new MH2(baseActivity, c50923wH2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MH2 get() {
        return m94107c(this.f24390a.get(), this.f24391b.get());
    }
}
