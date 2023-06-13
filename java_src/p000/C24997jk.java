package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
/* renamed from: jk */
/* loaded from: classes4.dex */
public final class C24997jk implements InterfaceC48812sj1<F01> {

    /* renamed from: a */
    public final C22711hj f93252a;

    /* renamed from: b */
    public final Y94<Tweaks> f93253b;

    public C24997jk(C22711hj c22711hj, Y94<Tweaks> y94) {
        this.f93252a = c22711hj;
        this.f93253b = y94;
    }

    /* renamed from: a */
    public static C24997jk m30020a(C22711hj c22711hj, Y94<Tweaks> y94) {
        return new C24997jk(c22711hj, y94);
    }

    /* renamed from: c */
    public static F01 m30018c(C22711hj c22711hj, Tweaks tweaks) {
        return (F01) C51679xZ3.m5002e(c22711hj.m36002c0(tweaks));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public F01 get() {
        return m30018c(this.f93252a, this.f93253b.get());
    }
}
