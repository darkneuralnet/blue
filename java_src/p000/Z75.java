package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Z75 */
/* loaded from: classes2.dex */
public final class Z75 implements InterfaceC48812sj1<Y75> {

    /* renamed from: a */
    public final Y94<BaseActivity> f47856a;

    /* renamed from: b */
    public final Y94<InterfaceC36187To2> f47857b;

    /* renamed from: c */
    public final Y94<C2136F5> f47858c;

    /* renamed from: d */
    public final Y94<C32492Dt6> f47859d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f47860e;

    /* renamed from: f */
    public final Y94<C4176Jf> f47861f;

    /* renamed from: g */
    public final Y94<C12470bg> f47862g;

    public Z75(Y94<BaseActivity> y94, Y94<InterfaceC36187To2> y942, Y94<C2136F5> y943, Y94<C32492Dt6> y944, Y94<C36207Tq4> y945, Y94<C4176Jf> y946, Y94<C12470bg> y947) {
        this.f47856a = y94;
        this.f47857b = y942;
        this.f47858c = y943;
        this.f47859d = y944;
        this.f47860e = y945;
        this.f47861f = y946;
        this.f47862g = y947;
    }

    /* renamed from: a */
    public static Z75 m73720a(Y94<BaseActivity> y94, Y94<InterfaceC36187To2> y942, Y94<C2136F5> y943, Y94<C32492Dt6> y944, Y94<C36207Tq4> y945, Y94<C4176Jf> y946, Y94<C12470bg> y947) {
        return new Z75(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static Y75 m73718c(BaseActivity baseActivity, InterfaceC36187To2 interfaceC36187To2, C2136F5 c2136f5, C32492Dt6 c32492Dt6, C36207Tq4 c36207Tq4, C4176Jf c4176Jf, C12470bg c12470bg) {
        return new Y75(baseActivity, interfaceC36187To2, c2136f5, c32492Dt6, c36207Tq4, c4176Jf, c12470bg);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Y75 get() {
        return m73718c(this.f47856a.get(), this.f47857b.get(), this.f47858c.get(), this.f47859d.get(), this.f47860e.get(), this.f47861f.get(), this.f47862g.get());
    }
}
