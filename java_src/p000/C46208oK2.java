package p000;
/* renamed from: oK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46208oK2 implements InterfaceC48812sj1<C45615nK2> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f101788a;

    /* renamed from: b */
    public final Y94<InterfaceC10636aM> f101789b;

    public C46208oK2(Y94<InterfaceC40099e13> y94, Y94<InterfaceC10636aM> y942) {
        this.f101788a = y94;
        this.f101789b = y942;
    }

    /* renamed from: a */
    public static C46208oK2 m21345a(Y94<InterfaceC40099e13> y94, Y94<InterfaceC10636aM> y942) {
        return new C46208oK2(y94, y942);
    }

    /* renamed from: c */
    public static C45615nK2 m21343c(InterfaceC40099e13 interfaceC40099e13, InterfaceC10636aM interfaceC10636aM) {
        return new C45615nK2(interfaceC40099e13, interfaceC10636aM);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45615nK2 get() {
        return m21343c(this.f101788a.get(), this.f101789b.get());
    }
}
