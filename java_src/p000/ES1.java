package p000;
/* renamed from: ES1 */
/* loaded from: classes3.dex */
public final class ES1 implements InterfaceC48812sj1<DS1> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f7474a;

    /* renamed from: b */
    public final Y94<C22454gl> f7475b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f7476c;

    public ES1(Y94<InterfaceC44647lh6> y94, Y94<C22454gl> y942, Y94<InterfaceC40099e13> y943) {
        this.f7474a = y94;
        this.f7475b = y942;
        this.f7476c = y943;
    }

    /* renamed from: a */
    public static ES1 m109002a(Y94<InterfaceC44647lh6> y94, Y94<C22454gl> y942, Y94<InterfaceC40099e13> y943) {
        return new ES1(y94, y942, y943);
    }

    /* renamed from: c */
    public static DS1 m109000c(InterfaceC44647lh6 interfaceC44647lh6, C22454gl c22454gl, InterfaceC40099e13 interfaceC40099e13) {
        return new DS1(interfaceC44647lh6, c22454gl, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DS1 get() {
        return m109000c(this.f7474a.get(), this.f7475b.get(), this.f7476c.get());
    }
}
