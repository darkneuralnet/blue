package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: sR4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48644sR4 implements InterfaceC48812sj1<C48052rR4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f108814a;

    /* renamed from: b */
    public final Y94<EO4> f108815b;

    /* renamed from: c */
    public final Y94<C3022H5> f108816c;

    public C48644sR4(Y94<BaseActivity> y94, Y94<EO4> y942, Y94<C3022H5> y943) {
        this.f108814a = y94;
        this.f108815b = y942;
        this.f108816c = y943;
    }

    /* renamed from: a */
    public static C48644sR4 m14194a(Y94<BaseActivity> y94, Y94<EO4> y942, Y94<C3022H5> y943) {
        return new C48644sR4(y94, y942, y943);
    }

    /* renamed from: c */
    public static C48052rR4 m14192c(BaseActivity baseActivity, EO4 eo4, C3022H5 c3022h5) {
        return new C48052rR4(baseActivity, eo4, c3022h5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48052rR4 get() {
        return m14192c(this.f108814a.get(), this.f108815b.get(), this.f108816c.get());
    }
}
