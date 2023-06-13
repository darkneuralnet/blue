package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: LV4 */
/* loaded from: classes3.dex */
public final class LV4 implements InterfaceC48812sj1<KV4> {

    /* renamed from: a */
    public final Y94<BX1> f21585a;

    /* renamed from: b */
    public final Y94<BaseActivity> f21586b;

    public LV4(Y94<BX1> y94, Y94<BaseActivity> y942) {
        this.f21585a = y94;
        this.f21586b = y942;
    }

    /* renamed from: a */
    public static LV4 m96789a(Y94<BX1> y94, Y94<BaseActivity> y942) {
        return new LV4(y94, y942);
    }

    /* renamed from: c */
    public static KV4 m96787c(BX1 bx1, BaseActivity baseActivity) {
        return new KV4(bx1, baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public KV4 get() {
        return m96787c(this.f21585a.get(), this.f21586b.get());
    }
}
