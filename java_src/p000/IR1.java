package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: IR1 */
/* loaded from: classes3.dex */
public final class IR1 implements InterfaceC48812sj1<HR1> {

    /* renamed from: a */
    public final Y94<BaseActivity> f15474a;

    /* renamed from: b */
    public final Y94<C6233P3> f15475b;

    public IR1(Y94<BaseActivity> y94, Y94<C6233P3> y942) {
        this.f15474a = y94;
        this.f15475b = y942;
    }

    /* renamed from: a */
    public static IR1 m102410a(Y94<BaseActivity> y94, Y94<C6233P3> y942) {
        return new IR1(y94, y942);
    }

    /* renamed from: c */
    public static HR1 m102408c(BaseActivity baseActivity, C6233P3 c6233p3) {
        return new HR1(baseActivity, c6233p3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HR1 get() {
        return m102408c(this.f15474a.get(), this.f15475b.get());
    }
}
