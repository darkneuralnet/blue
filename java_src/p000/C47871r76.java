package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: r76  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47871r76 implements InterfaceC48812sj1<C45499n76> {

    /* renamed from: a */
    public final Y94<InterfaceC37961aS2> f106488a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f106489b;

    /* renamed from: c */
    public final Y94<InterfaceC49056t76> f106490c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f106491d;

    /* renamed from: e */
    public final Y94<InterfaceC44637lg6> f106492e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f106493f;

    public C47871r76(Y94<InterfaceC37961aS2> y94, Y94<ScopeProvider> y942, Y94<InterfaceC49056t76> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC44637lg6> y945, Y94<C36207Tq4> y946) {
        this.f106488a = y94;
        this.f106489b = y942;
        this.f106490c = y943;
        this.f106491d = y944;
        this.f106492e = y945;
        this.f106493f = y946;
    }

    /* renamed from: a */
    public static C47871r76 m16462a(Y94<InterfaceC37961aS2> y94, Y94<ScopeProvider> y942, Y94<InterfaceC49056t76> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC44637lg6> y945, Y94<C36207Tq4> y946) {
        return new C47871r76(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C45499n76 m16460c(InterfaceC37961aS2 interfaceC37961aS2, ScopeProvider scopeProvider, InterfaceC49056t76 interfaceC49056t76, InterfaceC40099e13 interfaceC40099e13, InterfaceC44637lg6 interfaceC44637lg6, C36207Tq4 c36207Tq4) {
        return new C45499n76(interfaceC37961aS2, scopeProvider, interfaceC49056t76, interfaceC40099e13, interfaceC44637lg6, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45499n76 get() {
        return m16460c(this.f106488a.get(), this.f106489b.get(), this.f106490c.get(), this.f106491d.get(), this.f106492e.get(), this.f106493f.get());
    }
}
