package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ZR2 */
/* loaded from: classes3.dex */
public final class ZR2 implements InterfaceC48812sj1<YR2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f48574a;

    /* renamed from: b */
    public final Y94<C25902m4> f48575b;

    public ZR2(Y94<BaseActivity> y94, Y94<C25902m4> y942) {
        this.f48574a = y94;
        this.f48575b = y942;
    }

    /* renamed from: a */
    public static ZR2 m73109a(Y94<BaseActivity> y94, Y94<C25902m4> y942) {
        return new ZR2(y94, y942);
    }

    /* renamed from: c */
    public static YR2 m73107c(BaseActivity baseActivity, C25902m4 c25902m4) {
        return new YR2(baseActivity, c25902m4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public YR2 get() {
        return m73107c(this.f48574a.get(), this.f48575b.get());
    }
}
