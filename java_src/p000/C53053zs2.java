package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: zs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C53053zs2 implements InterfaceC48812sj1<C52460ys2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f122409a;

    /* renamed from: b */
    public final Y94<C9293X4> f122410b;

    /* renamed from: c */
    public final Y94<C42381hs2> f122411c;

    public C53053zs2(Y94<BaseActivity> y94, Y94<C9293X4> y942, Y94<C42381hs2> y943) {
        this.f122409a = y94;
        this.f122410b = y942;
        this.f122411c = y943;
    }

    /* renamed from: a */
    public static C53053zs2 m201a(Y94<BaseActivity> y94, Y94<C9293X4> y942, Y94<C42381hs2> y943) {
        return new C53053zs2(y94, y942, y943);
    }

    /* renamed from: c */
    public static C52460ys2 m199c(BaseActivity baseActivity, C9293X4 c9293x4, C42381hs2 c42381hs2) {
        return new C52460ys2(baseActivity, c9293x4, c42381hs2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52460ys2 get() {
        return m199c(this.f122409a.get(), this.f122410b.get(), this.f122411c.get());
    }
}
