package p000;

import co.bird.android.model.VehiclePricingDetails;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: ln6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44707ln6 implements InterfaceC48812sj1<C43521jn6> {

    /* renamed from: a */
    public final Y94<InterfaceC49597u24> f96709a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f96710b;

    /* renamed from: c */
    public final Y94<InterfaceC46893pU4> f96711c;

    /* renamed from: d */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f96712d;

    /* renamed from: e */
    public final Y94<InterfaceC45300mn6> f96713e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f96714f;

    /* renamed from: g */
    public final Y94<C22454gl> f96715g;

    /* renamed from: h */
    public final Y94<VehiclePricingDetails> f96716h;

    /* renamed from: i */
    public final Y94<Boolean> f96717i;

    public C44707ln6(Y94<InterfaceC49597u24> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC46893pU4> y943, Y94<LifecycleScopeProvider<EnumC7097RE>> y944, Y94<InterfaceC45300mn6> y945, Y94<InterfaceC40099e13> y946, Y94<C22454gl> y947, Y94<VehiclePricingDetails> y948, Y94<Boolean> y949) {
        this.f96709a = y94;
        this.f96710b = y942;
        this.f96711c = y943;
        this.f96712d = y944;
        this.f96713e = y945;
        this.f96714f = y946;
        this.f96715g = y947;
        this.f96716h = y948;
        this.f96717i = y949;
    }

    /* renamed from: a */
    public static C44707ln6 m26812a(Y94<InterfaceC49597u24> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC46893pU4> y943, Y94<LifecycleScopeProvider<EnumC7097RE>> y944, Y94<InterfaceC45300mn6> y945, Y94<InterfaceC40099e13> y946, Y94<C22454gl> y947, Y94<VehiclePricingDetails> y948, Y94<Boolean> y949) {
        return new C44707ln6(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C43521jn6 m26810c(InterfaceC49597u24 interfaceC49597u24, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC46893pU4 interfaceC46893pU4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC45300mn6 interfaceC45300mn6, InterfaceC40099e13 interfaceC40099e13, C22454gl c22454gl, VehiclePricingDetails vehiclePricingDetails, boolean z) {
        return new C43521jn6(interfaceC49597u24, interfaceC40001dr4, interfaceC46893pU4, lifecycleScopeProvider, interfaceC45300mn6, interfaceC40099e13, c22454gl, vehiclePricingDetails, z);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43521jn6 get() {
        return m26810c(this.f96709a.get(), this.f96710b.get(), this.f96711c.get(), this.f96712d.get(), this.f96713e.get(), this.f96714f.get(), this.f96715g.get(), this.f96716h.get(), this.f96717i.get().booleanValue());
    }
}
