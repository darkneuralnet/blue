package p000;
/* renamed from: li5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44656li5 implements InterfaceC48812sj1<C44063ki5> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f96599a;

    public C44656li5(Y94<InterfaceC40099e13> y94) {
        this.f96599a = y94;
    }

    /* renamed from: a */
    public static C44656li5 m26930a(Y94<InterfaceC40099e13> y94) {
        return new C44656li5(y94);
    }

    /* renamed from: c */
    public static C44063ki5 m26928c(InterfaceC40099e13 interfaceC40099e13) {
        return new C44063ki5(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44063ki5 get() {
        return m26928c(this.f96599a.get());
    }
}
