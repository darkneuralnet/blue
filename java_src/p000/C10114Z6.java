package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Z6 */
/* loaded from: classes3.dex */
public final class C10114Z6 implements InterfaceC48812sj1<C9609Y6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f47841a;

    /* renamed from: b */
    public final Y94<C5462N2> f47842b;

    public C10114Z6(Y94<BaseActivity> y94, Y94<C5462N2> y942) {
        this.f47841a = y94;
        this.f47842b = y942;
    }

    /* renamed from: a */
    public static C10114Z6 m73731a(Y94<BaseActivity> y94, Y94<C5462N2> y942) {
        return new C10114Z6(y94, y942);
    }

    /* renamed from: c */
    public static C9609Y6 m73729c(BaseActivity baseActivity, C5462N2 c5462n2) {
        return new C9609Y6(baseActivity, c5462n2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C9609Y6 get() {
        return m73729c(this.f47841a.get(), this.f47842b.get());
    }
}
