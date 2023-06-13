package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: z82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52619z82 implements InterfaceC48812sj1<C48469s82> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f120850a;

    /* renamed from: b */
    public final Y94<A82> f120851b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f120852c;

    /* renamed from: d */
    public final Y94<I82> f120853d;

    /* renamed from: e */
    public final Y94<InterfaceC33193Gt5> f120854e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f120855f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f120856g;

    /* renamed from: h */
    public final Y94<C51174wi2> f120857h;

    /* renamed from: i */
    public final Y94<D82> f120858i;

    public C52619z82(Y94<InterfaceC44647lh6> y94, Y94<A82> y942, Y94<ScopeProvider> y943, Y94<I82> y944, Y94<InterfaceC33193Gt5> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC40099e13> y947, Y94<C51174wi2> y948, Y94<D82> y949) {
        this.f120850a = y94;
        this.f120851b = y942;
        this.f120852c = y943;
        this.f120853d = y944;
        this.f120854e = y945;
        this.f120855f = y946;
        this.f120856g = y947;
        this.f120857h = y948;
        this.f120858i = y949;
    }

    /* renamed from: a */
    public static C52619z82 m1767a(Y94<InterfaceC44647lh6> y94, Y94<A82> y942, Y94<ScopeProvider> y943, Y94<I82> y944, Y94<InterfaceC33193Gt5> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC40099e13> y947, Y94<C51174wi2> y948, Y94<D82> y949) {
        return new C52619z82(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C48469s82 m1765c(InterfaceC44647lh6 interfaceC44647lh6, A82 a82, ScopeProvider scopeProvider, I82 i82, InterfaceC33193Gt5 interfaceC33193Gt5, InterfaceC1880Ea interfaceC1880Ea, InterfaceC40099e13 interfaceC40099e13, C51174wi2 c51174wi2, D82 d82) {
        return new C48469s82(interfaceC44647lh6, a82, scopeProvider, i82, interfaceC33193Gt5, interfaceC1880Ea, interfaceC40099e13, c51174wi2, d82);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48469s82 get() {
        return m1765c(this.f120850a.get(), this.f120851b.get(), this.f120852c.get(), this.f120853d.get(), this.f120854e.get(), this.f120855f.get(), this.f120856g.get(), this.f120857h.get(), this.f120858i.get());
    }
}
