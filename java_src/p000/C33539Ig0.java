package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Ig0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33539Ig0 implements InterfaceC48812sj1<C33071Gg0> {

    /* renamed from: a */
    public final Y94<BaseActivity> f15999a;

    /* renamed from: b */
    public final Y94<C22545h3> f16000b;

    public C33539Ig0(Y94<BaseActivity> y94, Y94<C22545h3> y942) {
        this.f15999a = y94;
        this.f16000b = y942;
    }

    /* renamed from: a */
    public static C33539Ig0 m101821a(Y94<BaseActivity> y94, Y94<C22545h3> y942) {
        return new C33539Ig0(y94, y942);
    }

    /* renamed from: c */
    public static C33071Gg0 m101819c(BaseActivity baseActivity, C22545h3 c22545h3) {
        return new C33071Gg0(baseActivity, c22545h3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33071Gg0 get() {
        return m101819c(this.f15999a.get(), this.f16000b.get());
    }
}
