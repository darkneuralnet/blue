package p000;
/* renamed from: sO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48615sO2 extends AbstractC5142M {

    /* renamed from: b */
    public final int f108721b;

    /* renamed from: c */
    public final int f108722c;

    /* renamed from: d */
    public final OA1 f108723d;

    public C48615sO2(int i, int i2, OA1 oa1) {
        this.f108721b = i;
        this.f108722c = i2;
        this.f108723d = new OA1(oa1);
    }

    /* renamed from: o */
    public static C48615sO2 m14244o(Object obj) {
        if (obj instanceof C48615sO2) {
            return (C48615sO2) obj;
        }
        if (obj != null) {
            return new C48615sO2(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(this.f108721b));
        c2042f.m108151a(new C4295K(this.f108722c));
        c2042f.m108151a(new VF0(this.f108723d.m92687c()));
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public OA1 m14245j() {
        return new OA1(this.f108723d);
    }

    /* renamed from: s */
    public int m14243s() {
        return this.f108721b;
    }

    /* renamed from: u */
    public int m14242u() {
        return this.f108722c;
    }

    public C48615sO2(AbstractC8166U abstractC8166U) {
        this.f108721b = ((C4295K) abstractC8166U.mo35872A(0)).m99373F();
        this.f108722c = ((C4295K) abstractC8166U.mo35872A(1)).m99373F();
        this.f108723d = new OA1(((AbstractC5803O) abstractC8166U.mo35872A(2)).m93017C());
    }
}
