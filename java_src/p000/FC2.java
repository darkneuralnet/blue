package p000;
/* renamed from: FC2 */
/* loaded from: classes6.dex */
public final class FC2 implements InterfaceC49405tj1<EC2> {

    /* renamed from: a */
    public final Z94<InterfaceC47776qy0> f9003a;

    /* renamed from: b */
    public final Z94<C44537lW2> f9004b;

    /* renamed from: c */
    public final Z94<InterfaceC44023ke5> f9005c;

    /* renamed from: d */
    public final Z94<InterfaceC40503ei3> f9006d;

    public FC2(Z94<InterfaceC47776qy0> z94, Z94<C44537lW2> z942, Z94<InterfaceC44023ke5> z943, Z94<InterfaceC40503ei3> z944) {
        this.f9003a = z94;
        this.f9004b = z942;
        this.f9005c = z943;
        this.f9006d = z944;
    }

    /* renamed from: a */
    public static FC2 m107442a(Z94<InterfaceC47776qy0> z94, Z94<C44537lW2> z942, Z94<InterfaceC44023ke5> z943, Z94<InterfaceC40503ei3> z944) {
        return new FC2(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static EC2 m107440c(InterfaceC47776qy0 interfaceC47776qy0, Object obj, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC40503ei3 interfaceC40503ei3) {
        return new EC2(interfaceC47776qy0, (C44537lW2) obj, interfaceC44023ke5, interfaceC40503ei3);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public EC2 get() {
        return m107440c(this.f9003a.get(), this.f9004b.get(), this.f9005c.get(), this.f9006d.get());
    }
}
