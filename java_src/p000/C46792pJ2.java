package p000;
/* renamed from: pJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46792pJ2 implements InterfaceC48812sj1<InterfaceC48164rd5> {

    /* renamed from: a */
    public final VH2 f103449a;

    /* renamed from: b */
    public final Y94<InterfaceC31654Ae5> f103450b;

    /* renamed from: c */
    public final Y94<InterfaceC25136kJ> f103451c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f103452d;

    /* renamed from: e */
    public final Y94<InterfaceC10636aM> f103453e;

    public C46792pJ2(VH2 vh2, Y94<InterfaceC31654Ae5> y94, Y94<InterfaceC25136kJ> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC10636aM> y944) {
        this.f103449a = vh2;
        this.f103450b = y94;
        this.f103451c = y942;
        this.f103452d = y943;
        this.f103453e = y944;
    }

    /* renamed from: a */
    public static C46792pJ2 m19533a(VH2 vh2, Y94<InterfaceC31654Ae5> y94, Y94<InterfaceC25136kJ> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC10636aM> y944) {
        return new C46792pJ2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC48164rd5 m19531c(VH2 vh2, InterfaceC31654Ae5 interfaceC31654Ae5, InterfaceC25136kJ interfaceC25136kJ, InterfaceC1880Ea interfaceC1880Ea, InterfaceC10636aM interfaceC10636aM) {
        return (InterfaceC48164rd5) C51679xZ3.m5002e(vh2.m80030v0(interfaceC31654Ae5, interfaceC25136kJ, interfaceC1880Ea, interfaceC10636aM));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48164rd5 get() {
        return m19531c(this.f103449a, this.f103450b.get(), this.f103451c.get(), this.f103452d.get(), this.f103453e.get());
    }
}
