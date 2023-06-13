package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: rl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48245rl6 implements InterfaceC48812sj1<C47652ql6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f107573a;

    /* renamed from: b */
    public final Y94<C32532Dy1> f107574b;

    public C48245rl6(Y94<BaseActivity> y94, Y94<C32532Dy1> y942) {
        this.f107573a = y94;
        this.f107574b = y942;
    }

    /* renamed from: a */
    public static C48245rl6 m15454a(Y94<BaseActivity> y94, Y94<C32532Dy1> y942) {
        return new C48245rl6(y94, y942);
    }

    /* renamed from: c */
    public static C47652ql6 m15452c(BaseActivity baseActivity, C32532Dy1 c32532Dy1) {
        return new C47652ql6(baseActivity, c32532Dy1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47652ql6 get() {
        return m15452c(this.f107573a.get(), this.f107574b.get());
    }
}
