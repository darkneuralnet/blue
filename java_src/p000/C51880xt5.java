package p000;
/* renamed from: xt5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51880xt5 implements InterfaceC48812sj1<C51287wt5> {

    /* renamed from: a */
    public final Y94<InterfaceC37556Zk3> f118306a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f118307b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f118308c;

    public C51880xt5(Y94<InterfaceC37556Zk3> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC35660Rh6> y943) {
        this.f118306a = y94;
        this.f118307b = y942;
        this.f118308c = y943;
    }

    /* renamed from: a */
    public static C51880xt5 m4507a(Y94<InterfaceC37556Zk3> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC35660Rh6> y943) {
        return new C51880xt5(y94, y942, y943);
    }

    /* renamed from: c */
    public static C51287wt5 m4505c(InterfaceC37556Zk3 interfaceC37556Zk3, InterfaceC1880Ea interfaceC1880Ea, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new C51287wt5(interfaceC37556Zk3, interfaceC1880Ea, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51287wt5 get() {
        return m4505c(this.f118306a.get(), this.f118307b.get(), this.f118308c.get());
    }
}
