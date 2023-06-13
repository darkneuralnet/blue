package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: OF */
/* loaded from: classes3.dex */
public final class C5931OF implements InterfaceC48812sj1<C5519NF> {

    /* renamed from: a */
    public final Y94<BaseActivity> f26263a;

    /* renamed from: b */
    public final Y94<C9603Y2> f26264b;

    public C5931OF(Y94<BaseActivity> y94, Y94<C9603Y2> y942) {
        this.f26263a = y94;
        this.f26264b = y942;
    }

    /* renamed from: a */
    public static C5931OF m92592a(Y94<BaseActivity> y94, Y94<C9603Y2> y942) {
        return new C5931OF(y94, y942);
    }

    /* renamed from: c */
    public static C5519NF m92590c(BaseActivity baseActivity, C9603Y2 c9603y2) {
        return new C5519NF(baseActivity, c9603y2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C5519NF get() {
        return m92590c(this.f26263a.get(), this.f26264b.get());
    }
}
