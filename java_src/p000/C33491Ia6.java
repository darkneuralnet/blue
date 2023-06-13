package p000;
/* renamed from: Ia6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33491Ia6 implements InterfaceC48812sj1<AbstractC34661Na6> {

    /* renamed from: a */
    public final C33257Ha6 f15916a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f15917b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f15918c;

    public C33491Ia6(C33257Ha6 c33257Ha6, Y94<InterfaceC40099e13> y94, Y94<C36207Tq4> y942) {
        this.f15916a = c33257Ha6;
        this.f15917b = y94;
        this.f15918c = y942;
    }

    /* renamed from: a */
    public static C33491Ia6 m101902a(C33257Ha6 c33257Ha6, Y94<InterfaceC40099e13> y94, Y94<C36207Tq4> y942) {
        return new C33491Ia6(c33257Ha6, y94, y942);
    }

    /* renamed from: c */
    public static AbstractC34661Na6 m101900c(C33257Ha6 c33257Ha6, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return (AbstractC34661Na6) C51679xZ3.m5002e(c33257Ha6.m103696a(interfaceC40099e13, c36207Tq4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC34661Na6 get() {
        return m101900c(this.f15916a, this.f15917b.get(), this.f15918c.get());
    }
}
