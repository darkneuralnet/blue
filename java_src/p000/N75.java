package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: N75 */
/* loaded from: classes3.dex */
public final class N75 implements InterfaceC48812sj1<M75> {

    /* renamed from: a */
    public final Y94<InterfaceC36187To2> f24174a;

    /* renamed from: b */
    public final Y94<BaseActivity> f24175b;

    /* renamed from: c */
    public final Y94<C4176Jf> f24176c;

    /* renamed from: d */
    public final Y94<C12470bg> f24177d;

    /* renamed from: e */
    public final Y94<C7063R5> f24178e;

    /* renamed from: f */
    public final Y94<EO4> f24179f;

    public N75(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944, Y94<C7063R5> y945, Y94<EO4> y946) {
        this.f24174a = y94;
        this.f24175b = y942;
        this.f24176c = y943;
        this.f24177d = y944;
        this.f24178e = y945;
        this.f24179f = y946;
    }

    /* renamed from: a */
    public static N75 m94344a(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944, Y94<C7063R5> y945, Y94<EO4> y946) {
        return new N75(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static M75 m94342c(InterfaceC36187To2 interfaceC36187To2, BaseActivity baseActivity, C4176Jf c4176Jf, C12470bg c12470bg, C7063R5 c7063r5, EO4 eo4) {
        return new M75(interfaceC36187To2, baseActivity, c4176Jf, c12470bg, c7063r5, eo4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public M75 get() {
        return m94342c(this.f24174a.get(), this.f24175b.get(), this.f24176c.get(), this.f24177d.get(), this.f24178e.get(), this.f24179f.get());
    }
}
