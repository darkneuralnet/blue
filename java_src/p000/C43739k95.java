package p000;

import co.bird.android.manager.analytics.RiderDemandManagerImpl;
/* renamed from: k95  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43739k95 implements InterfaceC48812sj1<RiderDemandManagerImpl> {

    /* renamed from: a */
    public final Y94<C22454gl> f94005a;

    /* renamed from: b */
    public final Y94<YR4> f94006b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f94007c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f94008d;

    /* renamed from: e */
    public final Y94<InterfaceC44647lh6> f94009e;

    /* renamed from: f */
    public final Y94<InterfaceC35660Rh6> f94010f;

    /* renamed from: g */
    public final Y94<InterfaceC47256q54> f94011g;

    /* renamed from: h */
    public final Y94<InterfaceC12495bn> f94012h;

    /* renamed from: i */
    public final Y94<LifecycleOwner> f94013i;

    /* renamed from: j */
    public final Y94<AM3> f94014j;

    /* renamed from: k */
    public final Y94<InterfaceC40001dr4> f94015k;

    public C43739k95(Y94<C22454gl> y94, Y94<YR4> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44647lh6> y945, Y94<InterfaceC35660Rh6> y946, Y94<InterfaceC47256q54> y947, Y94<InterfaceC12495bn> y948, Y94<LifecycleOwner> y949, Y94<AM3> y9410, Y94<InterfaceC40001dr4> y9411) {
        this.f94005a = y94;
        this.f94006b = y942;
        this.f94007c = y943;
        this.f94008d = y944;
        this.f94009e = y945;
        this.f94010f = y946;
        this.f94011g = y947;
        this.f94012h = y948;
        this.f94013i = y949;
        this.f94014j = y9410;
        this.f94015k = y9411;
    }

    /* renamed from: a */
    public static C43739k95 m29239a(Y94<C22454gl> y94, Y94<YR4> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<InterfaceC44647lh6> y945, Y94<InterfaceC35660Rh6> y946, Y94<InterfaceC47256q54> y947, Y94<InterfaceC12495bn> y948, Y94<LifecycleOwner> y949, Y94<AM3> y9410, Y94<InterfaceC40001dr4> y9411) {
        return new C43739k95(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    /* renamed from: c */
    public static RiderDemandManagerImpl m29237c(C22454gl c22454gl, YR4 yr4, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC47256q54 interfaceC47256q54, InterfaceC12495bn interfaceC12495bn, LifecycleOwner lifecycleOwner, AM3 am3, InterfaceC40001dr4 interfaceC40001dr4) {
        return new RiderDemandManagerImpl(c22454gl, yr4, interfaceC1880Ea, c36207Tq4, interfaceC44647lh6, interfaceC35660Rh6, interfaceC47256q54, interfaceC12495bn, lifecycleOwner, am3, interfaceC40001dr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RiderDemandManagerImpl get() {
        return m29237c(this.f94005a.get(), this.f94006b.get(), this.f94007c.get(), this.f94008d.get(), this.f94009e.get(), this.f94010f.get(), this.f94011g.get(), this.f94012h.get(), this.f94013i.get(), this.f94014j.get(), this.f94015k.get());
    }
}
