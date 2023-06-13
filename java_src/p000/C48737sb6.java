package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: sb6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48737sb6 implements InterfaceC48812sj1<C48145rb6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f109030a;

    /* renamed from: b */
    public final Y94<C27140p6> f109031b;

    public C48737sb6(Y94<BaseActivity> y94, Y94<C27140p6> y942) {
        this.f109030a = y94;
        this.f109031b = y942;
    }

    /* renamed from: a */
    public static C48737sb6 m13957a(Y94<BaseActivity> y94, Y94<C27140p6> y942) {
        return new C48737sb6(y94, y942);
    }

    /* renamed from: c */
    public static C48145rb6 m13955c(BaseActivity baseActivity, C27140p6 c27140p6) {
        return new C48145rb6(baseActivity, c27140p6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48145rb6 get() {
        return m13955c(this.f109030a.get(), this.f109031b.get());
    }
}
