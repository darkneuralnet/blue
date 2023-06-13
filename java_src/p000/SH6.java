package p000;
/* renamed from: SH6 */
/* loaded from: classes8.dex */
public class SH6 extends AbstractC5142M {

    /* renamed from: b */
    public final int f33421b;

    /* renamed from: c */
    public final int f33422c;

    /* renamed from: d */
    public final byte[] f33423d;

    /* renamed from: e */
    public final byte[] f33424e;

    /* renamed from: f */
    public final byte[] f33425f;

    /* renamed from: g */
    public final byte[] f33426g;

    /* renamed from: h */
    public final int f33427h;

    /* renamed from: i */
    public final byte[] f33428i;

    public SH6(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f33421b = 0;
        this.f33422c = i;
        this.f33423d = C0210Ao.m115251d(bArr);
        this.f33424e = C0210Ao.m115251d(bArr2);
        this.f33425f = C0210Ao.m115251d(bArr3);
        this.f33426g = C0210Ao.m115251d(bArr4);
        this.f33428i = C0210Ao.m115251d(bArr5);
        this.f33427h = -1;
    }

    /* renamed from: s */
    public static SH6 m85778s(Object obj) {
        if (obj instanceof SH6) {
            return (SH6) obj;
        }
        if (obj != null) {
            return new SH6(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(this.f33427h >= 0 ? new C4295K(1L) : new C4295K(0L));
        C2042F c2042f2 = new C2042F();
        c2042f2.m108151a(new C4295K(this.f33422c));
        c2042f2.m108151a(new VF0(this.f33423d));
        c2042f2.m108151a(new VF0(this.f33424e));
        c2042f2.m108151a(new VF0(this.f33425f));
        c2042f2.m108151a(new VF0(this.f33426g));
        int i = this.f33427h;
        if (i >= 0) {
            c2042f2.m108151a(new C39037cG0(false, 0, new C4295K(i)));
        }
        c2042f.m108151a(new ZF0(c2042f2));
        c2042f.m108151a(new C39037cG0(true, 0, new VF0(this.f33428i)));
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public byte[] m85780j() {
        return C0210Ao.m115251d(this.f33428i);
    }

    /* renamed from: o */
    public int m85779o() {
        return this.f33422c;
    }

    /* renamed from: u */
    public int m85777u() {
        return this.f33427h;
    }

    /* renamed from: v */
    public byte[] m85776v() {
        return C0210Ao.m115251d(this.f33425f);
    }

    /* renamed from: w */
    public byte[] m85775w() {
        return C0210Ao.m115251d(this.f33426g);
    }

    /* renamed from: x */
    public byte[] m85774x() {
        return C0210Ao.m115251d(this.f33424e);
    }

    /* renamed from: y */
    public byte[] m85773y() {
        return C0210Ao.m115251d(this.f33423d);
    }

    /* renamed from: z */
    public int m85772z() {
        return this.f33421b;
    }

    public SH6(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.f33421b = 1;
        this.f33422c = i;
        this.f33423d = C0210Ao.m115251d(bArr);
        this.f33424e = C0210Ao.m115251d(bArr2);
        this.f33425f = C0210Ao.m115251d(bArr3);
        this.f33426g = C0210Ao.m115251d(bArr4);
        this.f33428i = C0210Ao.m115251d(bArr5);
        this.f33427h = i2;
    }

    public SH6(AbstractC8166U abstractC8166U) {
        int i;
        C4295K m99377A = C4295K.m99377A(abstractC8166U.mo35872A(0));
        if (!m99377A.m99375D(0) && !m99377A.m99375D(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f33421b = m99377A.m99373F();
        if (abstractC8166U.size() != 2 && abstractC8166U.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC8166U m82198z = AbstractC8166U.m82198z(abstractC8166U.mo35872A(1));
        this.f33422c = C4295K.m99377A(m82198z.mo35872A(0)).m99373F();
        this.f33423d = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(1)).m93017C());
        this.f33424e = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(2)).m93017C());
        this.f33425f = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(3)).m93017C());
        this.f33426g = C0210Ao.m115251d(AbstractC5803O.m93018A(m82198z.mo35872A(4)).m93017C());
        if (m82198z.size() == 6) {
            AbstractC10088Z m73926z = AbstractC10088Z.m73926z(m82198z.mo35872A(5));
            if (m73926z.m73928C() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i = C4295K.m99368z(m73926z, false).m99373F();
        } else if (m82198z.size() != 5) {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        } else {
            i = -1;
        }
        this.f33427h = i;
        if (abstractC8166U.size() == 3) {
            this.f33428i = C0210Ao.m115251d(AbstractC5803O.m93016z(AbstractC10088Z.m73926z(abstractC8166U.mo35872A(2)), true).m93017C());
        } else {
            this.f33428i = null;
        }
    }
}
