package p000;
/* renamed from: KH6 */
/* loaded from: classes8.dex */
public class KH6 extends AbstractC5142M {

    /* renamed from: b */
    public final int f19344b;

    /* renamed from: c */
    public final long f19345c;

    /* renamed from: d */
    public final long f19346d;

    /* renamed from: e */
    public final byte[] f19347e;

    /* renamed from: f */
    public final byte[] f19348f;

    /* renamed from: g */
    public final byte[] f19349g;

    /* renamed from: h */
    public final byte[] f19350h;

    /* renamed from: i */
    public final byte[] f19351i;

    public KH6(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f19344b = 0;
        this.f19345c = j;
        this.f19347e = C0210Ao.m115251d(bArr);
        this.f19348f = C0210Ao.m115251d(bArr2);
        this.f19349g = C0210Ao.m115251d(bArr3);
        this.f19350h = C0210Ao.m115251d(bArr4);
        this.f19351i = C0210Ao.m115251d(bArr5);
        this.f19346d = -1L;
    }

    /* renamed from: s */
    public static KH6 m99047s(Object obj) {
        if (obj instanceof KH6) {
            return (KH6) obj;
        }
        if (obj != null) {
            return new KH6(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(this.f19346d >= 0 ? new C4295K(1L) : new C4295K(0L));
        C2042F c2042f2 = new C2042F();
        c2042f2.m108151a(new C4295K(this.f19345c));
        c2042f2.m108151a(new VF0(this.f19347e));
        c2042f2.m108151a(new VF0(this.f19348f));
        c2042f2.m108151a(new VF0(this.f19349g));
        c2042f2.m108151a(new VF0(this.f19350h));
        long j = this.f19346d;
        if (j >= 0) {
            c2042f2.m108151a(new C39037cG0(false, 0, new C4295K(j)));
        }
        c2042f.m108151a(new ZF0(c2042f2));
        c2042f.m108151a(new C39037cG0(true, 0, new VF0(this.f19351i)));
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public byte[] m99049j() {
        return C0210Ao.m115251d(this.f19351i);
    }

    /* renamed from: o */
    public long m99048o() {
        return this.f19345c;
    }

    /* renamed from: u */
    public long m99046u() {
        return this.f19346d;
    }

    /* renamed from: v */
    public byte[] m99045v() {
        return C0210Ao.m115251d(this.f19349g);
    }

    /* renamed from: w */
    public byte[] m99044w() {
        return C0210Ao.m115251d(this.f19350h);
    }

    /* renamed from: x */
    public byte[] m99043x() {
        return C0210Ao.m115251d(this.f19348f);
    }

    /* renamed from: y */
    public byte[] m99042y() {
        return C0210Ao.m115251d(this.f19347e);
    }

    /* renamed from: z */
    public int m99041z() {
        return this.f19344b;
    }

    public KH6(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f19344b = 1;
        this.f19345c = j;
        this.f19347e = C0210Ao.m115251d(bArr);
        this.f19348f = C0210Ao.m115251d(bArr2);
        this.f19349g = C0210Ao.m115251d(bArr3);
        this.f19350h = C0210Ao.m115251d(bArr4);
        this.f19351i = C0210Ao.m115251d(bArr5);
        this.f19346d = j2;
    }

    public KH6(AbstractC8166U abstractC8166U) {
        long j;
        C4295K m99377A = C4295K.m99377A(abstractC8166U.mo35872A(0));
        if (!m99377A.m99375D(0) && !m99377A.m99375D(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f19344b = m99377A.m99373F();
        if (abstractC8166U.size() != 2 && abstractC8166U.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC8166U m82198z = AbstractC8166U.m82198z(abstractC8166U.mo35872A(1));
        this.f19345c = C4295K.m99377A(m82198z.mo35872A(0)).m99370I();
        this.f19347e = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(1)).m93017C());
        this.f19348f = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(2)).m93017C());
        this.f19349g = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(3)).m93017C());
        this.f19350h = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(4)).m93017C());
        if (m82198z.size() == 6) {
            AbstractC10088Z m73926z = AbstractC10088Z.m73926z(m82198z.mo35872A(5));
            if (m73926z.m73928C() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j = C4295K.m99368z(m73926z, false).m99370I();
        } else if (m82198z.size() != 5) {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        } else {
            j = -1;
        }
        this.f19346d = j;
        if (abstractC8166U.size() == 3) {
            this.f19351i = C0210Ao.m115251d(AbstractC5803O.m93016z(AbstractC10088Z.m73926z(abstractC8166U.mo35872A(2)), true).m93017C());
        } else {
            this.f19351i = null;
        }
    }
}
