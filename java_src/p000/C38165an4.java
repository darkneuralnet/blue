package p000;
/* renamed from: an4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38165an4 extends AbstractC5142M {

    /* renamed from: b */
    public C4295K f51234b;

    /* renamed from: c */
    public C5448N f51235c;

    /* renamed from: d */
    public C4295K f51236d;

    /* renamed from: e */
    public byte[][] f51237e;

    /* renamed from: f */
    public byte[][] f51238f;

    /* renamed from: g */
    public byte[] f51239g;

    public C38165an4(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f51234b = new C4295K(0L);
        this.f51236d = new C4295K(i);
        this.f51237e = C39351cn4.m60877c(sArr);
        this.f51238f = C39351cn4.m60877c(sArr2);
        this.f51239g = C39351cn4.m60879a(sArr3);
    }

    /* renamed from: v */
    public static C38165an4 m70736v(Object obj) {
        if (obj instanceof C38165an4) {
            return (C38165an4) obj;
        }
        if (obj != null) {
            return new C38165an4(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        InterfaceC1693E interfaceC1693E = this.f51234b;
        if (interfaceC1693E == null) {
            interfaceC1693E = this.f51235c;
        }
        c2042f.m108151a(interfaceC1693E);
        c2042f.m108151a(this.f51236d);
        C2042F c2042f2 = new C2042F();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f51237e;
            if (i2 >= bArr.length) {
                break;
            }
            c2042f2.m108151a(new VF0(bArr[i2]));
            i2++;
        }
        c2042f.m108151a(new ZF0(c2042f2));
        C2042F c2042f3 = new C2042F();
        while (true) {
            byte[][] bArr2 = this.f51238f;
            if (i >= bArr2.length) {
                c2042f.m108151a(new ZF0(c2042f3));
                C2042F c2042f4 = new C2042F();
                c2042f4.m108151a(new VF0(this.f51239g));
                c2042f.m108151a(new ZF0(c2042f4));
                return new ZF0(c2042f);
            }
            c2042f3.m108151a(new VF0(bArr2[i]));
            i++;
        }
    }

    /* renamed from: j */
    public short[][] m70740j() {
        return C39351cn4.m60876d(this.f51237e);
    }

    /* renamed from: o */
    public short[] m70739o() {
        return C39351cn4.m60878b(this.f51239g);
    }

    /* renamed from: s */
    public short[][] m70738s() {
        return C39351cn4.m60876d(this.f51238f);
    }

    /* renamed from: u */
    public int m70737u() {
        return this.f51236d.m99373F();
    }

    public C38165an4(AbstractC8166U abstractC8166U) {
        if (abstractC8166U.mo35872A(0) instanceof C4295K) {
            this.f51234b = C4295K.m99377A(abstractC8166U.mo35872A(0));
        } else {
            this.f51235c = C5448N.m94514F(abstractC8166U.mo35872A(0));
        }
        this.f51236d = C4295K.m99377A(abstractC8166U.mo35872A(1));
        AbstractC8166U m82198z = AbstractC8166U.m82198z(abstractC8166U.mo35872A(2));
        this.f51237e = new byte[m82198z.size()];
        for (int i = 0; i < m82198z.size(); i++) {
            this.f51237e[i] = AbstractC5803O.m93018A(m82198z.mo35872A(i)).m93017C();
        }
        AbstractC8166U abstractC8166U2 = (AbstractC8166U) abstractC8166U.mo35872A(3);
        this.f51238f = new byte[abstractC8166U2.size()];
        for (int i2 = 0; i2 < abstractC8166U2.size(); i2++) {
            this.f51238f[i2] = AbstractC5803O.m93018A(abstractC8166U2.mo35872A(i2)).m93017C();
        }
        this.f51239g = AbstractC5803O.m93018A(((AbstractC8166U) abstractC8166U.mo35872A(4)).mo35872A(0)).m93017C();
    }
}
