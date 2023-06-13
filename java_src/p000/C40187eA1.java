package p000;
/* renamed from: eA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40187eA1 implements InterfaceC48812sj1<C38984cA1> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f78039a;

    /* renamed from: b */
    public final Y94<InterfaceC35583Qz1> f78040b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f78041c;

    public C40187eA1(Y94<C36207Tq4> y94, Y94<InterfaceC35583Qz1> y942, Y94<InterfaceC40099e13> y943) {
        this.f78039a = y94;
        this.f78040b = y942;
        this.f78041c = y943;
    }

    /* renamed from: a */
    public static C40187eA1 m43166a(Y94<C36207Tq4> y94, Y94<InterfaceC35583Qz1> y942, Y94<InterfaceC40099e13> y943) {
        return new C40187eA1(y94, y942, y943);
    }

    /* renamed from: c */
    public static C38984cA1 m43164c(C36207Tq4 c36207Tq4, InterfaceC35583Qz1 interfaceC35583Qz1, InterfaceC40099e13 interfaceC40099e13) {
        return new C38984cA1(c36207Tq4, interfaceC35583Qz1, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C38984cA1 get() {
        return m43164c(this.f78039a.get(), this.f78040b.get(), this.f78041c.get());
    }
}
