package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: pD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46740pD4 implements InterfaceC48812sj1<C46147oD4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f103275a;

    /* renamed from: b */
    public final Y94<C24709j5> f103276b;

    public C46740pD4(Y94<BaseActivity> y94, Y94<C24709j5> y942) {
        this.f103275a = y94;
        this.f103276b = y942;
    }

    /* renamed from: a */
    public static C46740pD4 m19815a(Y94<BaseActivity> y94, Y94<C24709j5> y942) {
        return new C46740pD4(y94, y942);
    }

    /* renamed from: c */
    public static C46147oD4 m19813c(BaseActivity baseActivity, C24709j5 c24709j5) {
        return new C46147oD4(baseActivity, c24709j5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46147oD4 get() {
        return m19813c(this.f103275a.get(), this.f103276b.get());
    }
}
