package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: dv5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40042dv5 implements InterfaceC48812sj1<C39450cv5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f77432a;

    /* renamed from: b */
    public final Y94<C12291b6> f77433b;

    public C40042dv5(Y94<BaseActivity> y94, Y94<C12291b6> y942) {
        this.f77432a = y94;
        this.f77433b = y942;
    }

    /* renamed from: a */
    public static C40042dv5 m43501a(Y94<BaseActivity> y94, Y94<C12291b6> y942) {
        return new C40042dv5(y94, y942);
    }

    /* renamed from: c */
    public static C39450cv5 m43499c(BaseActivity baseActivity, C12291b6 c12291b6) {
        return new C39450cv5(baseActivity, c12291b6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39450cv5 get() {
        return m43499c(this.f77432a.get(), this.f77433b.get());
    }
}
