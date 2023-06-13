package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: gR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41528gR3 implements InterfaceC48812sj1<C40935fR3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f82189a;

    /* renamed from: b */
    public final Y94<C30411y4> f82190b;

    public C41528gR3(Y94<BaseActivity> y94, Y94<C30411y4> y942) {
        this.f82189a = y94;
        this.f82190b = y942;
    }

    /* renamed from: a */
    public static C41528gR3 m39474a(Y94<BaseActivity> y94, Y94<C30411y4> y942) {
        return new C41528gR3(y94, y942);
    }

    /* renamed from: c */
    public static C40935fR3 m39472c(BaseActivity baseActivity, C30411y4 c30411y4) {
        return new C40935fR3(baseActivity, c30411y4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C40935fR3 get() {
        return m39472c(this.f82189a.get(), this.f82190b.get());
    }
}
