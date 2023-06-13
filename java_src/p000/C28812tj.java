package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
/* renamed from: tj */
/* loaded from: classes4.dex */
public final class C28812tj implements InterfaceC48812sj1<C22454gl> {

    /* renamed from: a */
    public final C22711hj f110934a;

    /* renamed from: b */
    public final Y94<C51174wi2> f110935b;

    /* renamed from: c */
    public final Y94<Tweaks> f110936c;

    public C28812tj(C22711hj c22711hj, Y94<C51174wi2> y94, Y94<Tweaks> y942) {
        this.f110934a = c22711hj;
        this.f110935b = y94;
        this.f110936c = y942;
    }

    /* renamed from: a */
    public static C28812tj m11851a(C22711hj c22711hj, Y94<C51174wi2> y94, Y94<Tweaks> y942) {
        return new C28812tj(c22711hj, y94, y942);
    }

    /* renamed from: c */
    public static C22454gl m11849c(C22711hj c22711hj, C51174wi2 c51174wi2, Tweaks tweaks) {
        return (C22454gl) C51679xZ3.m5002e(c22711hj.m35985l(c51174wi2, tweaks));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C22454gl get() {
        return m11849c(this.f110934a, this.f110935b.get(), this.f110936c.get());
    }
}
