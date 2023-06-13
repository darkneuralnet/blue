package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: dq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39989dq2 implements InterfaceC48812sj1<C39397cq2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f77266a;

    /* renamed from: b */
    public final Y94<C13383c4> f77267b;

    public C39989dq2(Y94<BaseActivity> y94, Y94<C13383c4> y942) {
        this.f77266a = y94;
        this.f77267b = y942;
    }

    /* renamed from: a */
    public static C39989dq2 m43670a(Y94<BaseActivity> y94, Y94<C13383c4> y942) {
        return new C39989dq2(y94, y942);
    }

    /* renamed from: c */
    public static C39397cq2 m43668c(BaseActivity baseActivity, C13383c4 c13383c4) {
        return new C39397cq2(baseActivity, c13383c4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39397cq2 get() {
        return m43668c(this.f77266a.get(), this.f77267b.get());
    }
}
