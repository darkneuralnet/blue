package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Jv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33911Jv3 implements InterfaceC48812sj1<C33677Iv3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f18769a;

    /* renamed from: b */
    public final Y94<C0848C4> f18770b;

    public C33911Jv3(Y94<BaseActivity> y94, Y94<C0848C4> y942) {
        this.f18769a = y94;
        this.f18770b = y942;
    }

    /* renamed from: a */
    public static C33911Jv3 m99562a(Y94<BaseActivity> y94, Y94<C0848C4> y942) {
        return new C33911Jv3(y94, y942);
    }

    /* renamed from: c */
    public static C33677Iv3 m99560c(BaseActivity baseActivity, C0848C4 c0848c4) {
        return new C33677Iv3(baseActivity, c0848c4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33677Iv3 get() {
        return m99560c(this.f18769a.get(), this.f18770b.get());
    }
}
