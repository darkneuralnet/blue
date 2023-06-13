package p000;
/* renamed from: qO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47430qO2 extends AbstractC5142M {

    /* renamed from: b */
    public int f105240b;

    /* renamed from: c */
    public int f105241c;

    /* renamed from: d */
    public byte[] f105242d;

    /* renamed from: e */
    public byte[] f105243e;

    /* renamed from: f */
    public byte[] f105244f;

    /* renamed from: g */
    public byte[] f105245g;

    /* renamed from: h */
    public byte[] f105246h;

    public C47430qO2(int i, int i2, PA1 pa1, TX3 tx3, C42121hR3 c42121hR3, C42121hR3 c42121hR32, OA1 oa1) {
        this.f105240b = i;
        this.f105241c = i2;
        this.f105242d = pa1.m90613e();
        this.f105243e = tx3.m83436h();
        this.f105244f = oa1.m92687c();
        this.f105245g = c42121hR3.m36400a();
        this.f105246h = c42121hR32.m36400a();
    }

    /* renamed from: s */
    public static C47430qO2 m17566s(Object obj) {
        if (obj instanceof C47430qO2) {
            return (C47430qO2) obj;
        }
        if (obj != null) {
            return new C47430qO2(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(this.f105240b));
        c2042f.m108151a(new C4295K(this.f105241c));
        c2042f.m108151a(new VF0(this.f105242d));
        c2042f.m108151a(new VF0(this.f105243e));
        c2042f.m108151a(new VF0(this.f105245g));
        c2042f.m108151a(new VF0(this.f105246h));
        c2042f.m108151a(new VF0(this.f105244f));
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public PA1 m17568j() {
        return new PA1(this.f105242d);
    }

    /* renamed from: o */
    public TX3 m17567o() {
        return new TX3(m17568j(), this.f105243e);
    }

    /* renamed from: u */
    public int m17565u() {
        return this.f105241c;
    }

    /* renamed from: v */
    public int m17564v() {
        return this.f105240b;
    }

    /* renamed from: w */
    public C42121hR3 m17563w() {
        return new C42121hR3(this.f105245g);
    }

    /* renamed from: x */
    public C42121hR3 m17562x() {
        return new C42121hR3(this.f105246h);
    }

    /* renamed from: y */
    public OA1 m17561y() {
        return new OA1(this.f105244f);
    }

    public C47430qO2(AbstractC8166U abstractC8166U) {
        this.f105240b = ((C4295K) abstractC8166U.mo35872A(0)).m99373F();
        this.f105241c = ((C4295K) abstractC8166U.mo35872A(1)).m99373F();
        this.f105242d = ((AbstractC5803O) abstractC8166U.mo35872A(2)).m93017C();
        this.f105243e = ((AbstractC5803O) abstractC8166U.mo35872A(3)).m93017C();
        this.f105245g = ((AbstractC5803O) abstractC8166U.mo35872A(4)).m93017C();
        this.f105246h = ((AbstractC5803O) abstractC8166U.mo35872A(5)).m93017C();
        this.f105244f = ((AbstractC5803O) abstractC8166U.mo35872A(6)).m93017C();
    }
}
