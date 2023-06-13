package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: We1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36798We1 implements InterfaceC48812sj1<C36564Ve1> {

    /* renamed from: a */
    public final Y94<BaseActivity> f41455a;

    /* renamed from: b */
    public final Y94<C30410y3> f41456b;

    public C36798We1(Y94<BaseActivity> y94, Y94<C30410y3> y942) {
        this.f41455a = y94;
        this.f41456b = y942;
    }

    /* renamed from: a */
    public static C36798We1 m78059a(Y94<BaseActivity> y94, Y94<C30410y3> y942) {
        return new C36798We1(y94, y942);
    }

    /* renamed from: c */
    public static C36564Ve1 m78057c(BaseActivity baseActivity, C30410y3 c30410y3) {
        return new C36564Ve1(baseActivity, c30410y3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36564Ve1 get() {
        return m78057c(this.f41455a.get(), this.f41456b.get());
    }
}
