package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Nc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34677Nc4 implements InterfaceC48812sj1<C34443Mc4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f24851a;

    /* renamed from: b */
    public final Y94<C9607Y4> f24852b;

    public C34677Nc4(Y94<BaseActivity> y94, Y94<C9607Y4> y942) {
        this.f24851a = y94;
        this.f24852b = y942;
    }

    /* renamed from: a */
    public static C34677Nc4 m93703a(Y94<BaseActivity> y94, Y94<C9607Y4> y942) {
        return new C34677Nc4(y94, y942);
    }

    /* renamed from: c */
    public static C34443Mc4 m93701c(BaseActivity baseActivity, C9607Y4 c9607y4) {
        return new C34443Mc4(baseActivity, c9607y4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34443Mc4 get() {
        return m93701c(this.f24851a.get(), this.f24852b.get());
    }
}
