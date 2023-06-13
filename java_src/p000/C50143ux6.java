package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ux6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50143ux6 implements InterfaceC48812sj1<C49550tx6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f113245a;

    /* renamed from: b */
    public final Y94<C29416v6> f113246b;

    public C50143ux6(Y94<BaseActivity> y94, Y94<C29416v6> y942) {
        this.f113245a = y94;
        this.f113246b = y942;
    }

    /* renamed from: a */
    public static C50143ux6 m9431a(Y94<BaseActivity> y94, Y94<C29416v6> y942) {
        return new C50143ux6(y94, y942);
    }

    /* renamed from: c */
    public static C49550tx6 m9429c(BaseActivity baseActivity, C29416v6 c29416v6) {
        return new C49550tx6(baseActivity, c29416v6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49550tx6 get() {
        return m9429c(this.f113245a.get(), this.f113246b.get());
    }
}
