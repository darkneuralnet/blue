package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ED6 */
/* loaded from: classes3.dex */
public final class ED6 implements InterfaceC48812sj1<DD6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f7122a;

    /* renamed from: b */
    public final Y94<C30038x6> f7123b;

    public ED6(Y94<BaseActivity> y94, Y94<C30038x6> y942) {
        this.f7122a = y94;
        this.f7123b = y942;
    }

    /* renamed from: a */
    public static ED6 m109289a(Y94<BaseActivity> y94, Y94<C30038x6> y942) {
        return new ED6(y94, y942);
    }

    /* renamed from: c */
    public static DD6 m109287c(BaseActivity baseActivity, C30038x6 c30038x6) {
        return new DD6(baseActivity, c30038x6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DD6 get() {
        return m109287c(this.f7122a.get(), this.f7123b.get());
    }
}
