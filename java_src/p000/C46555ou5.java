package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ou5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46555ou5 implements InterfaceC48812sj1<C45962nu5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f102748a;

    /* renamed from: b */
    public final Y94<C10570a6> f102749b;

    public C46555ou5(Y94<BaseActivity> y94, Y94<C10570a6> y942) {
        this.f102748a = y94;
        this.f102749b = y942;
    }

    /* renamed from: a */
    public static C46555ou5 m20300a(Y94<BaseActivity> y94, Y94<C10570a6> y942) {
        return new C46555ou5(y94, y942);
    }

    /* renamed from: c */
    public static C45962nu5 m20298c(BaseActivity baseActivity, C10570a6 c10570a6) {
        return new C45962nu5(baseActivity, c10570a6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45962nu5 get() {
        return m20298c(this.f102748a.get(), this.f102749b.get());
    }
}
