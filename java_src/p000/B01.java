package p000;
/* renamed from: B01 */
/* loaded from: classes6.dex */
public final class B01 implements InterfaceC49405tj1<A01> {

    /* renamed from: a */
    public final Z94<InterfaceC47776qy0> f1520a;

    /* renamed from: b */
    public final Z94<InterfaceC40503ei3> f1521b;

    public B01(Z94<InterfaceC47776qy0> z94, Z94<InterfaceC40503ei3> z942) {
        this.f1520a = z94;
        this.f1521b = z942;
    }

    /* renamed from: a */
    public static B01 m114798a(Z94<InterfaceC47776qy0> z94, Z94<InterfaceC40503ei3> z942) {
        return new B01(z94, z942);
    }

    /* renamed from: c */
    public static A01 m114796c(InterfaceC47776qy0 interfaceC47776qy0, InterfaceC40503ei3 interfaceC40503ei3) {
        return new A01(interfaceC47776qy0, interfaceC40503ei3);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public A01 get() {
        return m114796c(this.f1520a.get(), this.f1521b.get());
    }
}
