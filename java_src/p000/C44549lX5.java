package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: lX5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44549lX5 implements InterfaceC48812sj1<C43956kX5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f96295a;

    /* renamed from: b */
    public final Y94<C10110Z4> f96296b;

    /* renamed from: c */
    public final Y94<IW5> f96297c;

    public C44549lX5(Y94<BaseActivity> y94, Y94<C10110Z4> y942, Y94<IW5> y943) {
        this.f96295a = y94;
        this.f96296b = y942;
        this.f96297c = y943;
    }

    /* renamed from: a */
    public static C44549lX5 m27173a(Y94<BaseActivity> y94, Y94<C10110Z4> y942, Y94<IW5> y943) {
        return new C44549lX5(y94, y942, y943);
    }

    /* renamed from: c */
    public static C43956kX5 m27171c(BaseActivity baseActivity, C10110Z4 c10110z4, IW5 iw5) {
        return new C43956kX5(baseActivity, c10110z4, iw5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43956kX5 get() {
        return m27171c(this.f96295a.get(), this.f96296b.get(), this.f96297c.get());
    }
}
