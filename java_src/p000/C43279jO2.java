package p000;
/* renamed from: jO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43279jO2 extends AbstractC5142M {

    /* renamed from: b */
    public int f92625b;

    /* renamed from: c */
    public int f92626c;

    /* renamed from: d */
    public byte[] f92627d;

    /* renamed from: e */
    public byte[] f92628e;

    /* renamed from: f */
    public byte[] f92629f;

    /* renamed from: g */
    public C2675G9 f92630g;

    public C43279jO2(int i, int i2, PA1 pa1, TX3 tx3, C42121hR3 c42121hR3, C2675G9 c2675g9) {
        this.f92625b = i;
        this.f92626c = i2;
        this.f92627d = pa1.m90613e();
        this.f92628e = tx3.m83436h();
        this.f92629f = c42121hR3.m36400a();
        this.f92630g = c2675g9;
    }

    /* renamed from: u */
    public static C43279jO2 m30731u(Object obj) {
        if (obj instanceof C43279jO2) {
            return (C43279jO2) obj;
        }
        if (obj != null) {
            return new C43279jO2(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(this.f92625b));
        c2042f.m108151a(new C4295K(this.f92626c));
        c2042f.m108151a(new VF0(this.f92627d));
        c2042f.m108151a(new VF0(this.f92628e));
        c2042f.m108151a(new VF0(this.f92629f));
        c2042f.m108151a(this.f92630g);
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public C2675G9 m30734j() {
        return this.f92630g;
    }

    /* renamed from: o */
    public PA1 m30733o() {
        return new PA1(this.f92627d);
    }

    /* renamed from: s */
    public TX3 m30732s() {
        return new TX3(m30733o(), this.f92628e);
    }

    /* renamed from: v */
    public int m30730v() {
        return this.f92626c;
    }

    /* renamed from: w */
    public int m30729w() {
        return this.f92625b;
    }

    /* renamed from: x */
    public C42121hR3 m30728x() {
        return new C42121hR3(this.f92629f);
    }

    public C43279jO2(AbstractC8166U abstractC8166U) {
        this.f92625b = ((C4295K) abstractC8166U.mo35872A(0)).m99373F();
        this.f92626c = ((C4295K) abstractC8166U.mo35872A(1)).m99373F();
        this.f92627d = ((AbstractC5803O) abstractC8166U.mo35872A(2)).m93017C();
        this.f92628e = ((AbstractC5803O) abstractC8166U.mo35872A(3)).m93017C();
        this.f92629f = ((AbstractC5803O) abstractC8166U.mo35872A(4)).m93017C();
        this.f92630g = C2675G9.m105699o(abstractC8166U.mo35872A(5));
    }
}
