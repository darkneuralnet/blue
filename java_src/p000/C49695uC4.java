package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: uC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49695uC4 implements InterfaceC48812sj1<C49102tC4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f111960a;

    /* renamed from: b */
    public final Y94<C22548h5> f111961b;

    public C49695uC4(Y94<BaseActivity> y94, Y94<C22548h5> y942) {
        this.f111960a = y94;
        this.f111961b = y942;
    }

    /* renamed from: a */
    public static C49695uC4 m10644a(Y94<BaseActivity> y94, Y94<C22548h5> y942) {
        return new C49695uC4(y94, y942);
    }

    /* renamed from: c */
    public static C49102tC4 m10642c(BaseActivity baseActivity, C22548h5 c22548h5) {
        return new C49102tC4(baseActivity, c22548h5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49102tC4 get() {
        return m10642c(this.f111960a.get(), this.f111961b.get());
    }
}
