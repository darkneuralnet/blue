package p000;
/* renamed from: kG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43800kG2 implements InterfaceC48812sj1<C43207jG2> {

    /* renamed from: a */
    public final Y94<C22454gl> f94176a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f94177b;

    public C43800kG2(Y94<C22454gl> y94, Y94<InterfaceC40099e13> y942) {
        this.f94176a = y94;
        this.f94177b = y942;
    }

    /* renamed from: a */
    public static C43800kG2 m29113a(Y94<C22454gl> y94, Y94<InterfaceC40099e13> y942) {
        return new C43800kG2(y94, y942);
    }

    /* renamed from: c */
    public static C43207jG2 m29111c(C22454gl c22454gl, InterfaceC40099e13 interfaceC40099e13) {
        return new C43207jG2(c22454gl, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43207jG2 get() {
        return m29111c(this.f94176a.get(), this.f94177b.get());
    }
}
