package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: p35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46644p35 implements InterfaceC48812sj1<C46051o35> {

    /* renamed from: a */
    public final Y94<BaseActivity> f103069a;

    /* renamed from: b */
    public final Y94<EO4> f103070b;

    /* renamed from: c */
    public final Y94<C6237P5> f103071c;

    public C46644p35(Y94<BaseActivity> y94, Y94<EO4> y942, Y94<C6237P5> y943) {
        this.f103069a = y94;
        this.f103070b = y942;
        this.f103071c = y943;
    }

    /* renamed from: a */
    public static C46644p35 m20013a(Y94<BaseActivity> y94, Y94<EO4> y942, Y94<C6237P5> y943) {
        return new C46644p35(y94, y942, y943);
    }

    /* renamed from: c */
    public static C46051o35 m20011c(BaseActivity baseActivity, EO4 eo4, C6237P5 c6237p5) {
        return new C46051o35(baseActivity, eo4, c6237p5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46051o35 get() {
        return m20011c(this.f103069a.get(), this.f103070b.get(), this.f103071c.get());
    }
}
