package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Qw3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35558Qw3 implements InterfaceC48812sj1<C35324Pw3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f31249a;

    /* renamed from: b */
    public final Y94<C29040u4> f31250b;

    /* renamed from: c */
    public final Y94<G33> f31251c;

    public C35558Qw3(Y94<BaseActivity> y94, Y94<C29040u4> y942, Y94<G33> y943) {
        this.f31249a = y94;
        this.f31250b = y942;
        this.f31251c = y943;
    }

    /* renamed from: a */
    public static C35558Qw3 m87567a(Y94<BaseActivity> y94, Y94<C29040u4> y942, Y94<G33> y943) {
        return new C35558Qw3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C35324Pw3 m87565c(BaseActivity baseActivity, C29040u4 c29040u4, G33 g33) {
        return new C35324Pw3(baseActivity, c29040u4, g33);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35324Pw3 get() {
        return m87565c(this.f31249a.get(), this.f31250b.get(), this.f31251c.get());
    }
}
