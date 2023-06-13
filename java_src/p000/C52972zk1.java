package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: zk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52972zk1 implements InterfaceC48812sj1<C52379yk1> {

    /* renamed from: a */
    public final Y94<InterfaceC36187To2> f122149a;

    /* renamed from: b */
    public final Y94<BaseActivity> f122150b;

    /* renamed from: c */
    public final Y94<C4176Jf> f122151c;

    /* renamed from: d */
    public final Y94<C12470bg> f122152d;

    public C52972zk1(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944) {
        this.f122149a = y94;
        this.f122150b = y942;
        this.f122151c = y943;
        this.f122152d = y944;
    }

    /* renamed from: a */
    public static C52972zk1 m459a(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944) {
        return new C52972zk1(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C52379yk1 m457c(InterfaceC36187To2 interfaceC36187To2, BaseActivity baseActivity, C4176Jf c4176Jf, C12470bg c12470bg) {
        return new C52379yk1(interfaceC36187To2, baseActivity, c4176Jf, c12470bg);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52379yk1 get() {
        return m457c(this.f122149a.get(), this.f122150b.get(), this.f122151c.get(), this.f122152d.get());
    }
}
