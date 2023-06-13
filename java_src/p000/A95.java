package p000;

import co.bird.android.feature.rider.impl.RiderMapDataManagerImpl;
/* renamed from: A95 */
/* loaded from: classes3.dex */
public final class A95 implements InterfaceC48812sj1<RiderMapDataManagerImpl> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f211a;

    /* renamed from: b */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f212b;

    /* renamed from: c */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f213c;

    /* renamed from: d */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f214d;

    /* renamed from: e */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f215e;

    /* renamed from: f */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f216f;

    /* renamed from: g */
    public final Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> f217g;

    /* renamed from: h */
    public final Y94<InterfaceC12495bn> f218h;

    /* renamed from: i */
    public final Y94<LifecycleOwner> f219i;

    public A95(Y94<C36207Tq4> y94, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y942, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y943, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y944, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y945, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y946, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y947, Y94<InterfaceC12495bn> y948, Y94<LifecycleOwner> y949) {
        this.f211a = y94;
        this.f212b = y942;
        this.f213c = y943;
        this.f214d = y944;
        this.f215e = y945;
        this.f216f = y946;
        this.f217g = y947;
        this.f218h = y948;
        this.f219i = y949;
    }

    /* renamed from: a */
    public static A95 m116055a(Y94<C36207Tq4> y94, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y942, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y943, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y944, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y945, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y946, Y94<InterfaceC51298wu6<? extends InterfaceC50693vt4>> y947, Y94<InterfaceC12495bn> y948, Y94<LifecycleOwner> y949) {
        return new A95(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static RiderMapDataManagerImpl m116053c(C36207Tq4 c36207Tq4, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu62, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu63, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu64, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu65, InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu66, InterfaceC12495bn interfaceC12495bn, LifecycleOwner lifecycleOwner) {
        return new RiderMapDataManagerImpl(c36207Tq4, interfaceC51298wu6, interfaceC51298wu62, interfaceC51298wu63, interfaceC51298wu64, interfaceC51298wu65, interfaceC51298wu66, interfaceC12495bn, lifecycleOwner);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RiderMapDataManagerImpl get() {
        return m116053c(this.f211a.get(), this.f212b.get(), this.f213c.get(), this.f214d.get(), this.f215e.get(), this.f216f.get(), this.f217g.get(), this.f218h.get(), this.f219i.get());
    }
}
