package p000;
/* renamed from: JC1 */
/* loaded from: classes3.dex */
public final class JC1 implements InterfaceC48812sj1<IC1> {

    /* renamed from: a */
    public final Y94<V74> f16992a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f16993b;

    public JC1(Y94<V74> y94, Y94<InterfaceC40099e13> y942) {
        this.f16992a = y94;
        this.f16993b = y942;
    }

    /* renamed from: a */
    public static JC1 m101024a(Y94<V74> y94, Y94<InterfaceC40099e13> y942) {
        return new JC1(y94, y942);
    }

    /* renamed from: c */
    public static IC1 m101022c(V74 v74, InterfaceC40099e13 interfaceC40099e13) {
        return new IC1(v74, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public IC1 get() {
        return m101022c(this.f16992a.get(), this.f16993b.get());
    }
}
