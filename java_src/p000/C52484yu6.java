package p000;
/* renamed from: yu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52484yu6 implements InterfaceC51685xa0 {

    /* renamed from: a */
    public final InterfaceC51685xa0 f120391a;

    /* renamed from: b */
    public final C51672xY5 f120392b;

    /* renamed from: c */
    public final long f120393c;

    public C52484yu6(C51672xY5 c51672xY5, InterfaceC51685xa0 interfaceC51685xa0) {
        this(interfaceC51685xa0, c51672xY5, -1L);
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: b */
    public C51672xY5 mo2304b() {
        return this.f120392b;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: c */
    public EnumC49907ua0 mo2303c() {
        InterfaceC51685xa0 interfaceC51685xa0 = this.f120391a;
        if (interfaceC51685xa0 != null) {
            return interfaceC51685xa0.mo2303c();
        }
        return EnumC49907ua0.UNKNOWN;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: d */
    public EnumC50499va0 mo2302d() {
        InterfaceC51685xa0 interfaceC51685xa0 = this.f120391a;
        if (interfaceC51685xa0 != null) {
            return interfaceC51685xa0.mo2302d();
        }
        return EnumC50499va0.UNKNOWN;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: e */
    public EnumC48721sa0 mo2301e() {
        InterfaceC51685xa0 interfaceC51685xa0 = this.f120391a;
        if (interfaceC51685xa0 != null) {
            return interfaceC51685xa0.mo2301e();
        }
        return EnumC48721sa0.UNKNOWN;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: f */
    public EnumC51092wa0 mo2300f() {
        InterfaceC51685xa0 interfaceC51685xa0 = this.f120391a;
        if (interfaceC51685xa0 != null) {
            return interfaceC51685xa0.mo2300f();
        }
        return EnumC51092wa0.UNKNOWN;
    }

    @Override // p000.InterfaceC51685xa0
    public long getTimestamp() {
        InterfaceC51685xa0 interfaceC51685xa0 = this.f120391a;
        if (interfaceC51685xa0 != null) {
            return interfaceC51685xa0.getTimestamp();
        }
        long j = this.f120393c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public C52484yu6(InterfaceC51685xa0 interfaceC51685xa0, C51672xY5 c51672xY5, long j) {
        this.f120391a = interfaceC51685xa0;
        this.f120392b = c51672xY5;
        this.f120393c = j;
    }
}
