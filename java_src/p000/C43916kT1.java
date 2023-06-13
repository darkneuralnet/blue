package p000;
/* renamed from: kT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43916kT1 implements InterfaceC48812sj1<C43323jT1> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f94414a;

    public C43916kT1(Y94<InterfaceC40099e13> y94) {
        this.f94414a = y94;
    }

    /* renamed from: a */
    public static C43916kT1 m28934a(Y94<InterfaceC40099e13> y94) {
        return new C43916kT1(y94);
    }

    /* renamed from: c */
    public static C43323jT1 m28932c(InterfaceC40099e13 interfaceC40099e13) {
        return new C43323jT1(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43323jT1 get() {
        return m28932c(this.f94414a.get());
    }
}
