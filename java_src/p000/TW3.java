package p000;

import co.bird.android.feature.rider.impl.PointRadiusDataManagerImpl;
/* renamed from: TW3 */
/* loaded from: classes3.dex */
public final class TW3 {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f35595a;

    /* renamed from: b */
    public final Y94<InterfaceC12495bn> f35596b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f35597c;

    /* renamed from: d */
    public final Y94<LifecycleOwner> f35598d;

    public TW3(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943, Y94<LifecycleOwner> y944) {
        this.f35595a = y94;
        this.f35596b = y942;
        this.f35597c = y943;
        this.f35598d = y944;
    }

    /* renamed from: a */
    public static TW3 m83488a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943, Y94<LifecycleOwner> y944) {
        return new TW3(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static PointRadiusDataManagerImpl m83486c(InterfaceC10636aM interfaceC10636aM, InterfaceC12495bn interfaceC12495bn, C36207Tq4 c36207Tq4, LifecycleOwner lifecycleOwner, InterfaceC50693vt4 interfaceC50693vt4) {
        return new PointRadiusDataManagerImpl(interfaceC10636aM, interfaceC12495bn, c36207Tq4, lifecycleOwner, interfaceC50693vt4);
    }

    /* renamed from: b */
    public PointRadiusDataManagerImpl m83487b(InterfaceC50693vt4 interfaceC50693vt4) {
        return m83486c(this.f35595a.get(), this.f35596b.get(), this.f35597c.get(), this.f35598d.get(), interfaceC50693vt4);
    }
}
