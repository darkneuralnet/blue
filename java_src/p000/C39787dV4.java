package p000;

import co.bird.android.manager.ride.RidePassManagerImpl;
/* renamed from: dV4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39787dV4 implements InterfaceC48812sj1<RidePassManagerImpl> {

    /* renamed from: a */
    public final Y94<GX4> f76731a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f76732b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f76733c;

    public C39787dV4(Y94<GX4> y94, Y94<C36207Tq4> y942, Y94<InterfaceC35660Rh6> y943) {
        this.f76731a = y94;
        this.f76732b = y942;
        this.f76733c = y943;
    }

    /* renamed from: a */
    public static C39787dV4 m44211a(Y94<GX4> y94, Y94<C36207Tq4> y942, Y94<InterfaceC35660Rh6> y943) {
        return new C39787dV4(y94, y942, y943);
    }

    /* renamed from: c */
    public static RidePassManagerImpl m44209c(GX4 gx4, C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new RidePassManagerImpl(gx4, c36207Tq4, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RidePassManagerImpl get() {
        return m44209c(this.f76731a.get(), this.f76732b.get(), this.f76733c.get());
    }
}
