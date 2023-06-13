package p000;
/* renamed from: lO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44465lO2 extends AbstractC5142M {

    /* renamed from: b */
    public final int f95978b;

    /* renamed from: c */
    public final int f95979c;

    /* renamed from: d */
    public final OA1 f95980d;

    /* renamed from: e */
    public final C2675G9 f95981e;

    public C44465lO2(int i, int i2, OA1 oa1, C2675G9 c2675g9) {
        this.f95978b = i;
        this.f95979c = i2;
        this.f95980d = new OA1(oa1.m92687c());
        this.f95981e = c2675g9;
    }

    /* renamed from: s */
    public static C44465lO2 m27344s(Object obj) {
        if (obj instanceof C44465lO2) {
            return (C44465lO2) obj;
        }
        if (obj != null) {
            return new C44465lO2(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(this.f95978b));
        c2042f.m108151a(new C4295K(this.f95979c));
        c2042f.m108151a(new VF0(this.f95980d.m92687c()));
        c2042f.m108151a(this.f95981e);
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public C2675G9 m27346j() {
        return this.f95981e;
    }

    /* renamed from: o */
    public OA1 m27345o() {
        return this.f95980d;
    }

    /* renamed from: u */
    public int m27343u() {
        return this.f95978b;
    }

    /* renamed from: v */
    public int m27342v() {
        return this.f95979c;
    }

    public C44465lO2(AbstractC8166U abstractC8166U) {
        this.f95978b = ((C4295K) abstractC8166U.mo35872A(0)).m99373F();
        this.f95979c = ((C4295K) abstractC8166U.mo35872A(1)).m99373F();
        this.f95980d = new OA1(((AbstractC5803O) abstractC8166U.mo35872A(2)).m93017C());
        this.f95981e = C2675G9.m105699o(abstractC8166U.mo35872A(3));
    }
}
