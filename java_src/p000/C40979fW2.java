package p000;
/* renamed from: fW2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40979fW2 implements InterfaceC48812sj1<C40386eW2> {

    /* renamed from: a */
    public final Y94<C43207jG2> f80249a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f80250b;

    /* renamed from: c */
    public final Y94<InterfaceC31844Az6> f80251c;

    public C40979fW2(Y94<C43207jG2> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC31844Az6> y943) {
        this.f80249a = y94;
        this.f80250b = y942;
        this.f80251c = y943;
    }

    /* renamed from: a */
    public static C40979fW2 m41263a(Y94<C43207jG2> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC31844Az6> y943) {
        return new C40979fW2(y94, y942, y943);
    }

    /* renamed from: c */
    public static C40386eW2 m41261c(C43207jG2 c43207jG2, InterfaceC40099e13 interfaceC40099e13, InterfaceC31844Az6 interfaceC31844Az6) {
        return new C40386eW2(c43207jG2, interfaceC40099e13, interfaceC31844Az6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C40386eW2 get() {
        return m41261c(this.f80249a.get(), this.f80250b.get(), this.f80251c.get());
    }
}
