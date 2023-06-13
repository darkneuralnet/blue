package p000;
/* renamed from: fn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41148fn5 implements InterfaceC48812sj1<InterfaceC39352cn5> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f80683a;

    public C41148fn5(Y94<InterfaceC1880Ea> y94) {
        this.f80683a = y94;
    }

    /* renamed from: a */
    public static C41148fn5 m40820a(Y94<InterfaceC1880Ea> y94) {
        return new C41148fn5(y94);
    }

    /* renamed from: c */
    public static InterfaceC39352cn5 m40818c(InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC39352cn5) C51679xZ3.m5002e(AbstractC40555en5.m42556a(interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39352cn5 get() {
        return m40818c(this.f80683a.get());
    }
}
