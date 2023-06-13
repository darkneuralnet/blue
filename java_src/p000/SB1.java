package p000;

import co.bird.android.feature.rider.impl.GeocachedDataManagerImpl;
/* renamed from: SB1 */
/* loaded from: classes3.dex */
public final class SB1 {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f33294a;

    /* renamed from: b */
    public final Y94<InterfaceC12495bn> f33295b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f33296c;

    /* renamed from: d */
    public final Y94<DB1> f33297d;

    /* renamed from: e */
    public final Y94<LifecycleOwner> f33298e;

    /* renamed from: f */
    public final Y94<C22454gl> f33299f;

    public SB1(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943, Y94<DB1> y944, Y94<LifecycleOwner> y945, Y94<C22454gl> y946) {
        this.f33294a = y94;
        this.f33295b = y942;
        this.f33296c = y943;
        this.f33297d = y944;
        this.f33298e = y945;
        this.f33299f = y946;
    }

    /* renamed from: a */
    public static SB1 m85857a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943, Y94<DB1> y944, Y94<LifecycleOwner> y945, Y94<C22454gl> y946) {
        return new SB1(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static GeocachedDataManagerImpl m85855c(InterfaceC10636aM interfaceC10636aM, InterfaceC12495bn interfaceC12495bn, C36207Tq4 c36207Tq4, DB1 db1, LifecycleOwner lifecycleOwner, C22454gl c22454gl, InterfaceC50693vt4 interfaceC50693vt4) {
        return new GeocachedDataManagerImpl(interfaceC10636aM, interfaceC12495bn, c36207Tq4, db1, lifecycleOwner, c22454gl, interfaceC50693vt4);
    }

    /* renamed from: b */
    public GeocachedDataManagerImpl m85856b(InterfaceC50693vt4 interfaceC50693vt4) {
        return m85855c(this.f33294a.get(), this.f33295b.get(), this.f33296c.get(), this.f33297d.get(), this.f33298e.get(), this.f33299f.get(), interfaceC50693vt4);
    }
}
