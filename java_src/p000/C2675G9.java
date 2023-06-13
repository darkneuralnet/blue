package p000;
/* renamed from: G9 */
/* loaded from: classes8.dex */
public class C2675G9 extends AbstractC5142M {

    /* renamed from: b */
    public C5448N f11050b;

    /* renamed from: c */
    public InterfaceC1693E f11051c;

    public C2675G9(C5448N c5448n) {
        this.f11050b = c5448n;
    }

    /* renamed from: o */
    public static C2675G9 m105699o(Object obj) {
        if (obj instanceof C2675G9) {
            return (C2675G9) obj;
        }
        if (obj != null) {
            return new C2675G9(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F(2);
        c2042f.m108151a(this.f11050b);
        InterfaceC1693E interfaceC1693E = this.f11051c;
        if (interfaceC1693E != null) {
            c2042f.m108151a(interfaceC1693E);
        }
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public C5448N m105700j() {
        return this.f11050b;
    }

    /* renamed from: s */
    public InterfaceC1693E m105698s() {
        return this.f11051c;
    }

    public C2675G9(C5448N c5448n, InterfaceC1693E interfaceC1693E) {
        this.f11050b = c5448n;
        this.f11051c = interfaceC1693E;
    }

    public C2675G9(AbstractC8166U abstractC8166U) {
        if (abstractC8166U.size() >= 1 && abstractC8166U.size() <= 2) {
            this.f11050b = C5448N.m94514F(abstractC8166U.mo35872A(0));
            this.f11051c = abstractC8166U.size() == 2 ? abstractC8166U.mo35872A(1) : null;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + abstractC8166U.size());
    }
}
