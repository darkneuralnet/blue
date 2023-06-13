package p000;
/* renamed from: v83  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50248v83 implements InterfaceC48812sj1<C49656u83> {

    /* renamed from: a */
    public final Y94<InterfaceC48624sP2> f113584a;

    /* renamed from: b */
    public final Y94<B95> f113585b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f113586c;

    public C50248v83(Y94<InterfaceC48624sP2> y94, Y94<B95> y942, Y94<InterfaceC1880Ea> y943) {
        this.f113584a = y94;
        this.f113585b = y942;
        this.f113586c = y943;
    }

    /* renamed from: a */
    public static C50248v83 m9142a(Y94<InterfaceC48624sP2> y94, Y94<B95> y942, Y94<InterfaceC1880Ea> y943) {
        return new C50248v83(y94, y942, y943);
    }

    /* renamed from: c */
    public static C49656u83 m9140c(InterfaceC48624sP2 interfaceC48624sP2, B95 b95, InterfaceC1880Ea interfaceC1880Ea) {
        return new C49656u83(interfaceC48624sP2, b95, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49656u83 get() {
        return m9140c(this.f113584a.get(), this.f113585b.get(), this.f113586c.get());
    }
}
