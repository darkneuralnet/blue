package p000;
/* renamed from: Oh3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34955Oh3 implements InterfaceC48812sj1<C34721Nh3> {

    /* renamed from: a */
    public final Y94<C43207jG2> f27061a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f27062b;

    /* renamed from: c */
    public final Y94<InterfaceC31844Az6> f27063c;

    public C34955Oh3(Y94<C43207jG2> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC31844Az6> y943) {
        this.f27061a = y94;
        this.f27062b = y942;
        this.f27063c = y943;
    }

    /* renamed from: a */
    public static C34955Oh3 m91675a(Y94<C43207jG2> y94, Y94<InterfaceC40099e13> y942, Y94<InterfaceC31844Az6> y943) {
        return new C34955Oh3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C34721Nh3 m91673c(C43207jG2 c43207jG2, InterfaceC40099e13 interfaceC40099e13, InterfaceC31844Az6 interfaceC31844Az6) {
        return new C34721Nh3(c43207jG2, interfaceC40099e13, interfaceC31844Az6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34721Nh3 get() {
        return m91673c(this.f27061a.get(), this.f27062b.get(), this.f27063c.get());
    }
}
