package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
/* renamed from: rk */
/* loaded from: classes4.dex */
public final class C27983rk implements InterfaceC48812sj1<F01> {

    /* renamed from: a */
    public final C22711hj f107545a;

    /* renamed from: b */
    public final Y94<Tweaks> f107546b;

    public C27983rk(C22711hj c22711hj, Y94<Tweaks> y94) {
        this.f107545a = c22711hj;
        this.f107546b = y94;
    }

    /* renamed from: a */
    public static C27983rk m15491a(C22711hj c22711hj, Y94<Tweaks> y94) {
        return new C27983rk(c22711hj, y94);
    }

    /* renamed from: c */
    public static F01 m15489c(C22711hj c22711hj, Tweaks tweaks) {
        return (F01) C51679xZ3.m5002e(c22711hj.m35986k0(tweaks));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public F01 get() {
        return m15489c(this.f107545a, this.f107546b.get());
    }
}
