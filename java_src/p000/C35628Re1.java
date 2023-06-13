package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Re1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35628Re1 implements InterfaceC48812sj1<C34692Ne1> {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f32388a;

    /* renamed from: b */
    public final Y94<InterfaceC7381SM> f32389b;

    /* renamed from: c */
    public final Y94<NQ5> f32390c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f32391d;

    /* renamed from: e */
    public final Y94<InterfaceC35862Se1> f32392e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f32393f;

    public C35628Re1(Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<NQ5> y943, Y94<ScopeProvider> y944, Y94<InterfaceC35862Se1> y945, Y94<InterfaceC40099e13> y946) {
        this.f32388a = y94;
        this.f32389b = y942;
        this.f32390c = y943;
        this.f32391d = y944;
        this.f32392e = y945;
        this.f32393f = y946;
    }

    /* renamed from: a */
    public static C35628Re1 m86508a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<NQ5> y943, Y94<ScopeProvider> y944, Y94<InterfaceC35862Se1> y945, Y94<InterfaceC40099e13> y946) {
        return new C35628Re1(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C34692Ne1 m86506c(InterfaceC46473om3 interfaceC46473om3, InterfaceC7381SM interfaceC7381SM, NQ5 nq5, ScopeProvider scopeProvider, InterfaceC35862Se1 interfaceC35862Se1, InterfaceC40099e13 interfaceC40099e13) {
        return new C34692Ne1(interfaceC46473om3, interfaceC7381SM, nq5, scopeProvider, interfaceC35862Se1, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34692Ne1 get() {
        return m86506c(this.f32388a.get(), this.f32389b.get(), this.f32390c.get(), this.f32391d.get(), this.f32392e.get(), this.f32393f.get());
    }
}
