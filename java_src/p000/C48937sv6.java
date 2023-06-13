package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: sv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48937sv6 implements InterfaceC48812sj1<C48345rv6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f109573a;

    /* renamed from: b */
    public final Y94<C28178s6> f109574b;

    public C48937sv6(Y94<BaseActivity> y94, Y94<C28178s6> y942) {
        this.f109573a = y94;
        this.f109574b = y942;
    }

    /* renamed from: a */
    public static C48937sv6 m13385a(Y94<BaseActivity> y94, Y94<C28178s6> y942) {
        return new C48937sv6(y94, y942);
    }

    /* renamed from: c */
    public static C48345rv6 m13383c(BaseActivity baseActivity, C28178s6 c28178s6) {
        return new C48345rv6(baseActivity, c28178s6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48345rv6 get() {
        return m13383c(this.f109573a.get(), this.f109574b.get());
    }
}
