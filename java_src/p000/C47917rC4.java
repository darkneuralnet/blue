package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: rC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47917rC4 implements InterfaceC48812sj1<C45545nC4> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f106671a;

    /* renamed from: b */
    public final Y94<GI3> f106672b;

    /* renamed from: c */
    public final Y94<InterfaceC37857aG6> f106673c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f106674d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f106675e;

    /* renamed from: f */
    public final Y94<InterfaceC32301Cy4> f106676f;

    /* renamed from: g */
    public final Y94<InterfaceC48509sC4> f106677g;

    /* renamed from: h */
    public final Y94<SB4> f106678h;

    /* renamed from: i */
    public final Y94<InterfaceC50889wD4> f106679i;

    public C47917rC4(Y94<InterfaceC10636aM> y94, Y94<GI3> y942, Y94<InterfaceC37857aG6> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<InterfaceC32301Cy4> y946, Y94<InterfaceC48509sC4> y947, Y94<SB4> y948, Y94<InterfaceC50889wD4> y949) {
        this.f106671a = y94;
        this.f106672b = y942;
        this.f106673c = y943;
        this.f106674d = y944;
        this.f106675e = y945;
        this.f106676f = y946;
        this.f106677g = y947;
        this.f106678h = y948;
        this.f106679i = y949;
    }

    /* renamed from: a */
    public static C47917rC4 m16265a(Y94<InterfaceC10636aM> y94, Y94<GI3> y942, Y94<InterfaceC37857aG6> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<InterfaceC32301Cy4> y946, Y94<InterfaceC48509sC4> y947, Y94<SB4> y948, Y94<InterfaceC50889wD4> y949) {
        return new C47917rC4(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C45545nC4 m16263c(InterfaceC10636aM interfaceC10636aM, GI3 gi3, InterfaceC37857aG6 interfaceC37857aG6, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC32301Cy4 interfaceC32301Cy4, InterfaceC48509sC4 interfaceC48509sC4, SB4 sb4, InterfaceC50889wD4 interfaceC50889wD4) {
        return new C45545nC4(interfaceC10636aM, gi3, interfaceC37857aG6, interfaceC40099e13, scopeProvider, interfaceC32301Cy4, interfaceC48509sC4, sb4, interfaceC50889wD4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45545nC4 get() {
        return m16263c(this.f106671a.get(), this.f106672b.get(), this.f106673c.get(), this.f106674d.get(), this.f106675e.get(), this.f106676f.get(), this.f106677g.get(), this.f106678h.get(), this.f106679i.get());
    }
}
