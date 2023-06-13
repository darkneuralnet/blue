package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: XC4 */
/* loaded from: classes3.dex */
public final class XC4 implements InterfaceC48812sj1<WC4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f42883a;

    /* renamed from: b */
    public final Y94<C23123i5> f42884b;

    public XC4(Y94<BaseActivity> y94, Y94<C23123i5> y942) {
        this.f42883a = y94;
        this.f42884b = y942;
    }

    /* renamed from: a */
    public static XC4 m77185a(Y94<BaseActivity> y94, Y94<C23123i5> y942) {
        return new XC4(y94, y942);
    }

    /* renamed from: c */
    public static WC4 m77183c(BaseActivity baseActivity, C23123i5 c23123i5) {
        return new WC4(baseActivity, c23123i5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public WC4 get() {
        return m77183c(this.f42883a.get(), this.f42884b.get());
    }
}
