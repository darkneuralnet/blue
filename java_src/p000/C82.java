package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: C82 */
/* loaded from: classes3.dex */
public final class C82 implements InterfaceC48812sj1<B82> {

    /* renamed from: a */
    public final Y94<BaseActivity> f3495a;

    /* renamed from: b */
    public final Y94<C8921W3> f3496b;

    public C82(Y94<BaseActivity> y94, Y94<C8921W3> y942) {
        this.f3495a = y94;
        this.f3496b = y942;
    }

    /* renamed from: a */
    public static C82 m112748a(Y94<BaseActivity> y94, Y94<C8921W3> y942) {
        return new C82(y94, y942);
    }

    /* renamed from: c */
    public static B82 m112746c(BaseActivity baseActivity, C8921W3 c8921w3) {
        return new B82(baseActivity, c8921w3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public B82 get() {
        return m112746c(this.f3495a.get(), this.f3496b.get());
    }
}
