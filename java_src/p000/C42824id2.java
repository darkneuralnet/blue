package p000;

import android.content.Context;
import co.bird.android.manager.itemlease.ItemLeaseManagerImpl;
/* renamed from: id2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42824id2 implements InterfaceC48812sj1<ItemLeaseManagerImpl> {

    /* renamed from: a */
    public final Y94<Context> f87559a;

    /* renamed from: b */
    public final Y94<InterfaceC34207Lc2> f87560b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f87561c;

    /* renamed from: d */
    public final Y94<C51174wi2> f87562d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f87563e;

    /* renamed from: f */
    public final Y94<GI3> f87564f;

    /* renamed from: g */
    public final Y94<C36207Tq4> f87565g;

    /* renamed from: h */
    public final Y94<LifecycleOwner> f87566h;

    /* renamed from: i */
    public final Y94<C22454gl> f87567i;

    /* renamed from: j */
    public final Y94<YR4> f87568j;

    /* renamed from: k */
    public final Y94<InterfaceC10636aM> f87569k;

    /* renamed from: l */
    public final Y94<InterfaceC40001dr4> f87570l;

    public C42824id2(Y94<Context> y94, Y94<InterfaceC34207Lc2> y942, Y94<InterfaceC6097Oh> y943, Y94<C51174wi2> y944, Y94<InterfaceC1880Ea> y945, Y94<GI3> y946, Y94<C36207Tq4> y947, Y94<LifecycleOwner> y948, Y94<C22454gl> y949, Y94<YR4> y9410, Y94<InterfaceC10636aM> y9411, Y94<InterfaceC40001dr4> y9412) {
        this.f87559a = y94;
        this.f87560b = y942;
        this.f87561c = y943;
        this.f87562d = y944;
        this.f87563e = y945;
        this.f87564f = y946;
        this.f87565g = y947;
        this.f87566h = y948;
        this.f87567i = y949;
        this.f87568j = y9410;
        this.f87569k = y9411;
        this.f87570l = y9412;
    }

    /* renamed from: a */
    public static C42824id2 m33725a(Y94<Context> y94, Y94<InterfaceC34207Lc2> y942, Y94<InterfaceC6097Oh> y943, Y94<C51174wi2> y944, Y94<InterfaceC1880Ea> y945, Y94<GI3> y946, Y94<C36207Tq4> y947, Y94<LifecycleOwner> y948, Y94<C22454gl> y949, Y94<YR4> y9410, Y94<InterfaceC10636aM> y9411, Y94<InterfaceC40001dr4> y9412) {
        return new C42824id2(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412);
    }

    /* renamed from: c */
    public static ItemLeaseManagerImpl m33723c(Context context, InterfaceC34207Lc2 interfaceC34207Lc2, InterfaceC6097Oh interfaceC6097Oh, C51174wi2 c51174wi2, InterfaceC1880Ea interfaceC1880Ea, GI3 gi3, C36207Tq4 c36207Tq4, LifecycleOwner lifecycleOwner, C22454gl c22454gl, YR4 yr4, InterfaceC10636aM interfaceC10636aM, InterfaceC40001dr4 interfaceC40001dr4) {
        return new ItemLeaseManagerImpl(context, interfaceC34207Lc2, interfaceC6097Oh, c51174wi2, interfaceC1880Ea, gi3, c36207Tq4, lifecycleOwner, c22454gl, yr4, interfaceC10636aM, interfaceC40001dr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ItemLeaseManagerImpl get() {
        return m33723c(this.f87559a.get(), this.f87560b.get(), this.f87561c.get(), this.f87562d.get(), this.f87563e.get(), this.f87564f.get(), this.f87565g.get(), this.f87566h.get(), this.f87567i.get(), this.f87568j.get(), this.f87569k.get(), this.f87570l.get());
    }
}
