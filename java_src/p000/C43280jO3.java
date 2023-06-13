package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: jO3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43280jO3 implements InterfaceC48812sj1<C39112cO3> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f92631a;

    /* renamed from: b */
    public final Y94<InterfaceC44466lO3> f92632b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f92633c;

    /* renamed from: d */
    public final Y94<AM3> f92634d;

    /* renamed from: e */
    public final Y94<VM3> f92635e;

    /* renamed from: f */
    public final Y94<InterfaceC52757zN3> f92636f;

    /* renamed from: g */
    public final Y94<YR4> f92637g;

    /* renamed from: h */
    public final Y94<InterfaceC1880Ea> f92638h;

    public C43280jO3(Y94<ScopeProvider> y94, Y94<InterfaceC44466lO3> y942, Y94<InterfaceC40099e13> y943, Y94<AM3> y944, Y94<VM3> y945, Y94<InterfaceC52757zN3> y946, Y94<YR4> y947, Y94<InterfaceC1880Ea> y948) {
        this.f92631a = y94;
        this.f92632b = y942;
        this.f92633c = y943;
        this.f92634d = y944;
        this.f92635e = y945;
        this.f92636f = y946;
        this.f92637g = y947;
        this.f92638h = y948;
    }

    /* renamed from: a */
    public static C43280jO3 m30727a(Y94<ScopeProvider> y94, Y94<InterfaceC44466lO3> y942, Y94<InterfaceC40099e13> y943, Y94<AM3> y944, Y94<VM3> y945, Y94<InterfaceC52757zN3> y946, Y94<YR4> y947, Y94<InterfaceC1880Ea> y948) {
        return new C43280jO3(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C39112cO3 m30725c(ScopeProvider scopeProvider, InterfaceC44466lO3 interfaceC44466lO3, InterfaceC40099e13 interfaceC40099e13, AM3 am3, VM3 vm3, InterfaceC52757zN3 interfaceC52757zN3, YR4 yr4, InterfaceC1880Ea interfaceC1880Ea) {
        return new C39112cO3(scopeProvider, interfaceC44466lO3, interfaceC40099e13, am3, vm3, interfaceC52757zN3, yr4, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39112cO3 get() {
        return m30725c(this.f92631a.get(), this.f92632b.get(), this.f92633c.get(), this.f92634d.get(), this.f92635e.get(), this.f92636f.get(), this.f92637g.get(), this.f92638h.get());
    }
}
