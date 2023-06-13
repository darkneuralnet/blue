package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Er5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32707Er5 implements InterfaceC48812sj1<C32473Dr5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f8201a;

    /* renamed from: b */
    public final Y94<C10113Z5> f8202b;

    public C32707Er5(Y94<BaseActivity> y94, Y94<C10113Z5> y942) {
        this.f8201a = y94;
        this.f8202b = y942;
    }

    /* renamed from: a */
    public static C32707Er5 m108323a(Y94<BaseActivity> y94, Y94<C10113Z5> y942) {
        return new C32707Er5(y94, y942);
    }

    /* renamed from: c */
    public static C32473Dr5 m108321c(BaseActivity baseActivity, C10113Z5 c10113z5) {
        return new C32473Dr5(baseActivity, c10113z5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32473Dr5 get() {
        return m108321c(this.f8201a.get(), this.f8202b.get());
    }
}
