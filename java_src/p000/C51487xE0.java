package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: xE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51487xE0 implements InterfaceC48812sj1<C50894wE0> {

    /* renamed from: a */
    public final Y94<BaseActivity> f117235a;

    /* renamed from: b */
    public final Y94<C28165s3> f117236b;

    public C51487xE0(Y94<BaseActivity> y94, Y94<C28165s3> y942) {
        this.f117235a = y94;
        this.f117236b = y942;
    }

    /* renamed from: a */
    public static C51487xE0 m5652a(Y94<BaseActivity> y94, Y94<C28165s3> y942) {
        return new C51487xE0(y94, y942);
    }

    /* renamed from: c */
    public static C50894wE0 m5650c(BaseActivity baseActivity, C28165s3 c28165s3) {
        return new C50894wE0(baseActivity, c28165s3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50894wE0 get() {
        return m5650c(this.f117235a.get(), this.f117236b.get());
    }
}
