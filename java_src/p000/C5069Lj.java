package p000;

import co.bird.android.persistence.bird.impl.BirdDatabase;
/* renamed from: Lj */
/* loaded from: classes4.dex */
public final class C5069Lj implements InterfaceC48812sj1<AbstractC42498i40> {

    /* renamed from: a */
    public final C22711hj f21968a;

    /* renamed from: b */
    public final Y94<BirdDatabase> f21969b;

    public C5069Lj(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        this.f21968a = c22711hj;
        this.f21969b = y94;
    }

    /* renamed from: a */
    public static C5069Lj m96410a(C22711hj c22711hj, Y94<BirdDatabase> y94) {
        return new C5069Lj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC42498i40 m96408c(C22711hj c22711hj, BirdDatabase birdDatabase) {
        return (AbstractC42498i40) C51679xZ3.m5002e(c22711hj.m36052D(birdDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC42498i40 get() {
        return m96408c(this.f21968a, this.f21969b.get());
    }
}
