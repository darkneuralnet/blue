package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: FS2 */
/* loaded from: classes3.dex */
public final class FS2 implements InterfaceC48812sj1<ES2> {

    /* renamed from: a */
    public final Y94<C22454gl> f9385a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f9386b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f9387c;

    /* renamed from: d */
    public final Y94<InterfaceC6097Oh> f9388d;

    /* renamed from: e */
    public final Y94<Z85> f9389e;

    /* renamed from: f */
    public final Y94<InterfaceC37961aS2> f9390f;

    /* renamed from: g */
    public final Y94<GS2> f9391g;

    /* renamed from: h */
    public final Y94<InterfaceC40099e13> f9392h;

    /* renamed from: i */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f9393i;

    /* renamed from: j */
    public final Y94<InterfaceC35660Rh6> f9394j;

    public FS2(Y94<C22454gl> y94, Y94<C36207Tq4> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC6097Oh> y944, Y94<Z85> y945, Y94<InterfaceC37961aS2> y946, Y94<GS2> y947, Y94<InterfaceC40099e13> y948, Y94<LifecycleScopeProvider<EnumC7097RE>> y949, Y94<InterfaceC35660Rh6> y9410) {
        this.f9385a = y94;
        this.f9386b = y942;
        this.f9387c = y943;
        this.f9388d = y944;
        this.f9389e = y945;
        this.f9390f = y946;
        this.f9391g = y947;
        this.f9392h = y948;
        this.f9393i = y949;
        this.f9394j = y9410;
    }

    /* renamed from: a */
    public static FS2 m107136a(Y94<C22454gl> y94, Y94<C36207Tq4> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC6097Oh> y944, Y94<Z85> y945, Y94<InterfaceC37961aS2> y946, Y94<GS2> y947, Y94<InterfaceC40099e13> y948, Y94<LifecycleScopeProvider<EnumC7097RE>> y949, Y94<InterfaceC35660Rh6> y9410) {
        return new FS2(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static ES2 m107134c(C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC6097Oh interfaceC6097Oh, Z85 z85, InterfaceC37961aS2 interfaceC37961aS2, GS2 gs2, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new ES2(c22454gl, c36207Tq4, interfaceC1880Ea, interfaceC6097Oh, z85, interfaceC37961aS2, gs2, interfaceC40099e13, lifecycleScopeProvider, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ES2 get() {
        return m107134c(this.f9385a.get(), this.f9386b.get(), this.f9387c.get(), this.f9388d.get(), this.f9389e.get(), this.f9390f.get(), this.f9391g.get(), this.f9392h.get(), this.f9393i.get(), this.f9394j.get());
    }
}
