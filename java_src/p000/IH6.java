package p000;
/* renamed from: IH6 */
/* loaded from: classes8.dex */
public class IH6 extends AbstractC5142M {

    /* renamed from: b */
    public final C4295K f15087b;

    /* renamed from: c */
    public final int f15088c;

    /* renamed from: d */
    public final int f15089d;

    /* renamed from: e */
    public final C2675G9 f15090e;

    public IH6(int i, int i2, C2675G9 c2675g9) {
        this.f15087b = new C4295K(0L);
        this.f15088c = i;
        this.f15089d = i2;
        this.f15090e = c2675g9;
    }

    /* renamed from: o */
    public static IH6 m102558o(Object obj) {
        if (obj instanceof IH6) {
            return (IH6) obj;
        }
        if (obj != null) {
            return new IH6(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(this.f15087b);
        c2042f.m108151a(new C4295K(this.f15088c));
        c2042f.m108151a(new C4295K(this.f15089d));
        c2042f.m108151a(this.f15090e);
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public int m102559j() {
        return this.f15088c;
    }

    /* renamed from: s */
    public int m102557s() {
        return this.f15089d;
    }

    /* renamed from: u */
    public C2675G9 m102556u() {
        return this.f15090e;
    }

    public IH6(AbstractC8166U abstractC8166U) {
        this.f15087b = C4295K.m99377A(abstractC8166U.mo35872A(0));
        this.f15088c = C4295K.m99377A(abstractC8166U.mo35872A(1)).m99373F();
        this.f15089d = C4295K.m99377A(abstractC8166U.mo35872A(2)).m99373F();
        this.f15090e = C2675G9.m105699o(abstractC8166U.mo35872A(3));
    }
}
