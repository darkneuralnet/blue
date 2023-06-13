package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: bB6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38405bB6 implements InterfaceC48812sj1<C37812aB6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f57070a;

    /* renamed from: b */
    public final Y94<C29759w6> f57071b;

    public C38405bB6(Y94<BaseActivity> y94, Y94<C29759w6> y942) {
        this.f57070a = y94;
        this.f57071b = y942;
    }

    /* renamed from: a */
    public static C38405bB6 m64864a(Y94<BaseActivity> y94, Y94<C29759w6> y942) {
        return new C38405bB6(y94, y942);
    }

    /* renamed from: c */
    public static C37812aB6 m64862c(BaseActivity baseActivity, C29759w6 c29759w6) {
        return new C37812aB6(baseActivity, c29759w6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37812aB6 get() {
        return m64862c(this.f57070a.get(), this.f57071b.get());
    }
}
