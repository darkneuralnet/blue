package p000;

import co.bird.android.persistence.bird.impl.BirdDatabase;
/* renamed from: zj */
/* loaded from: classes4.dex */
public final class C31492zj implements InterfaceC48812sj1<AbstractC12358bL> {

    /* renamed from: a */
    public final C22711hj f122110a;

    /* renamed from: b */
    public final Y94<BirdDatabase> f122111b;

    public C31492zj(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        this.f122110a = c22711hj;
        this.f122111b = y94;
    }

    /* renamed from: a */
    public static C31492zj m486a(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        return new C31492zj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC12358bL m484c(C22711hj c22711hj, BirdDatabase birdDatabase) {
        return (AbstractC12358bL) C51679xZ3.m5002e(c22711hj.m35973r(birdDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC12358bL get() {
        return m484c(this.f122110a, this.f122111b.get());
    }
}
