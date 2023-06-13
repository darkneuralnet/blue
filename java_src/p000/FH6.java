package p000;
/* renamed from: FH6 */
/* loaded from: classes8.dex */
public class FH6 extends AbstractC5142M {

    /* renamed from: b */
    public final C4295K f9126b;

    /* renamed from: c */
    public final int f9127c;

    /* renamed from: d */
    public final C2675G9 f9128d;

    public FH6(int i, C2675G9 c2675g9) {
        this.f9126b = new C4295K(0L);
        this.f9127c = i;
        this.f9128d = c2675g9;
    }

    /* renamed from: o */
    public static FH6 m107355o(Object obj) {
        if (obj instanceof FH6) {
            return (FH6) obj;
        }
        if (obj != null) {
            return new FH6(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(this.f9126b);
        c2042f.m108151a(new C4295K(this.f9127c));
        c2042f.m108151a(this.f9128d);
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public int m107356j() {
        return this.f9127c;
    }

    /* renamed from: s */
    public C2675G9 m107354s() {
        return this.f9128d;
    }

    public FH6(AbstractC8166U abstractC8166U) {
        this.f9126b = C4295K.m99377A(abstractC8166U.mo35872A(0));
        this.f9127c = C4295K.m99377A(abstractC8166U.mo35872A(1)).m99373F();
        this.f9128d = C2675G9.m105699o(abstractC8166U.mo35872A(2));
    }
}
