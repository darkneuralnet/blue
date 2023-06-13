package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: dG4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39652dG4 implements InterfaceC48812sj1<C39041cG4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f76362a;

    /* renamed from: b */
    public final Y94<C25907m5> f76363b;

    public C39652dG4(Y94<BaseActivity> y94, Y94<C25907m5> y942) {
        this.f76362a = y94;
        this.f76363b = y942;
    }

    /* renamed from: a */
    public static C39652dG4 m44461a(Y94<BaseActivity> y94, Y94<C25907m5> y942) {
        return new C39652dG4(y94, y942);
    }

    /* renamed from: c */
    public static C39041cG4 m44459c(BaseActivity baseActivity, C25907m5 c25907m5) {
        return new C39041cG4(baseActivity, c25907m5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39041cG4 get() {
        return m44459c(this.f76362a.get(), this.f76363b.get());
    }
}
