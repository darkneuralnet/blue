package p000;
/* renamed from: Ym4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37341Ym4 extends AbstractC5142M {

    /* renamed from: b */
    public C4295K f46588b;

    /* renamed from: c */
    public C5448N f46589c;

    /* renamed from: d */
    public byte[][] f46590d;

    /* renamed from: e */
    public byte[] f46591e;

    /* renamed from: f */
    public byte[][] f46592f;

    /* renamed from: g */
    public byte[] f46593g;

    /* renamed from: h */
    public byte[] f46594h;

    /* renamed from: i */
    public C41728gm2[] f46595i;

    public C37341Ym4(AbstractC8166U abstractC8166U) {
        int i = 0;
        if (abstractC8166U.mo35872A(0) instanceof C4295K) {
            this.f46588b = C4295K.m99377A(abstractC8166U.mo35872A(0));
        } else {
            this.f46589c = C5448N.m94514F(abstractC8166U.mo35872A(0));
        }
        AbstractC8166U abstractC8166U2 = (AbstractC8166U) abstractC8166U.mo35872A(1);
        this.f46590d = new byte[abstractC8166U2.size()];
        for (int i2 = 0; i2 < abstractC8166U2.size(); i2++) {
            this.f46590d[i2] = ((AbstractC5803O) abstractC8166U2.mo35872A(i2)).m93017C();
        }
        this.f46591e = ((AbstractC5803O) ((AbstractC8166U) abstractC8166U.mo35872A(2)).mo35872A(0)).m93017C();
        AbstractC8166U abstractC8166U3 = (AbstractC8166U) abstractC8166U.mo35872A(3);
        this.f46592f = new byte[abstractC8166U3.size()];
        for (int i3 = 0; i3 < abstractC8166U3.size(); i3++) {
            this.f46592f[i3] = ((AbstractC5803O) abstractC8166U3.mo35872A(i3)).m93017C();
        }
        this.f46593g = ((AbstractC5803O) ((AbstractC8166U) abstractC8166U.mo35872A(4)).mo35872A(0)).m93017C();
        this.f46594h = ((AbstractC5803O) ((AbstractC8166U) abstractC8166U.mo35872A(5)).mo35872A(0)).m93017C();
        AbstractC8166U abstractC8166U4 = (AbstractC8166U) abstractC8166U.mo35872A(6);
        byte[][][][] bArr = new byte[abstractC8166U4.size()][][];
        byte[][][][] bArr2 = new byte[abstractC8166U4.size()][][];
        byte[][][] bArr3 = new byte[abstractC8166U4.size()][];
        byte[][] bArr4 = new byte[abstractC8166U4.size()];
        int i4 = 0;
        while (i4 < abstractC8166U4.size()) {
            AbstractC8166U abstractC8166U5 = (AbstractC8166U) abstractC8166U4.mo35872A(i4);
            AbstractC8166U abstractC8166U6 = (AbstractC8166U) abstractC8166U5.mo35872A(i);
            bArr[i4] = new byte[abstractC8166U6.size()][];
            for (int i5 = i; i5 < abstractC8166U6.size(); i5++) {
                AbstractC8166U abstractC8166U7 = (AbstractC8166U) abstractC8166U6.mo35872A(i5);
                bArr[i4][i5] = new byte[abstractC8166U7.size()];
                for (int i6 = 0; i6 < abstractC8166U7.size(); i6++) {
                    bArr[i4][i5][i6] = ((AbstractC5803O) abstractC8166U7.mo35872A(i6)).m93017C();
                }
            }
            AbstractC8166U abstractC8166U8 = (AbstractC8166U) abstractC8166U5.mo35872A(1);
            bArr2[i4] = new byte[abstractC8166U8.size()][];
            for (int i7 = 0; i7 < abstractC8166U8.size(); i7++) {
                AbstractC8166U abstractC8166U9 = (AbstractC8166U) abstractC8166U8.mo35872A(i7);
                bArr2[i4][i7] = new byte[abstractC8166U9.size()];
                for (int i8 = 0; i8 < abstractC8166U9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((AbstractC5803O) abstractC8166U9.mo35872A(i8)).m93017C();
                }
            }
            AbstractC8166U abstractC8166U10 = (AbstractC8166U) abstractC8166U5.mo35872A(2);
            bArr3[i4] = new byte[abstractC8166U10.size()];
            for (int i9 = 0; i9 < abstractC8166U10.size(); i9++) {
                bArr3[i4][i9] = ((AbstractC5803O) abstractC8166U10.mo35872A(i9)).m93017C();
            }
            bArr4[i4] = ((AbstractC5803O) abstractC8166U5.mo35872A(3)).m93017C();
            i4++;
            i = 0;
        }
        int length = this.f46594h.length - 1;
        this.f46595i = new C41728gm2[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.f46594h;
            int i11 = i10 + 1;
            this.f46595i[i10] = new C41728gm2(bArr5[i10], bArr5[i11], C39351cn4.m60874f(bArr[i10]), C39351cn4.m60874f(bArr2[i10]), C39351cn4.m60876d(bArr3[i10]), C39351cn4.m60878b(bArr4[i10]));
            i10 = i11;
        }
    }

    /* renamed from: s */
    public static C37341Ym4 m74281s(Object obj) {
        if (obj instanceof C37341Ym4) {
            return (C37341Ym4) obj;
        }
        if (obj != null) {
            return new C37341Ym4(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        InterfaceC1693E interfaceC1693E = this.f46588b;
        if (interfaceC1693E == null) {
            interfaceC1693E = this.f46589c;
        }
        c2042f.m108151a(interfaceC1693E);
        C2042F c2042f2 = new C2042F();
        int i = 0;
        while (true) {
            byte[][] bArr = this.f46590d;
            if (i >= bArr.length) {
                break;
            }
            c2042f2.m108151a(new VF0(bArr[i]));
            i++;
        }
        c2042f.m108151a(new ZF0(c2042f2));
        C2042F c2042f3 = new C2042F();
        c2042f3.m108151a(new VF0(this.f46591e));
        c2042f.m108151a(new ZF0(c2042f3));
        C2042F c2042f4 = new C2042F();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f46592f;
            if (i2 >= bArr2.length) {
                break;
            }
            c2042f4.m108151a(new VF0(bArr2[i2]));
            i2++;
        }
        c2042f.m108151a(new ZF0(c2042f4));
        C2042F c2042f5 = new C2042F();
        c2042f5.m108151a(new VF0(this.f46593g));
        c2042f.m108151a(new ZF0(c2042f5));
        C2042F c2042f6 = new C2042F();
        c2042f6.m108151a(new VF0(this.f46594h));
        c2042f.m108151a(new ZF0(c2042f6));
        C2042F c2042f7 = new C2042F();
        for (int i3 = 0; i3 < this.f46595i.length; i3++) {
            C2042F c2042f8 = new C2042F();
            byte[][][] m60875e = C39351cn4.m60875e(this.f46595i[i3].m37497a());
            C2042F c2042f9 = new C2042F();
            for (byte[][] bArr3 : m60875e) {
                C2042F c2042f10 = new C2042F();
                int i4 = 0;
                while (true) {
                    if (i4 < bArr3.length) {
                        c2042f10.m108151a(new VF0(bArr3[i4]));
                        i4++;
                    }
                }
                c2042f9.m108151a(new ZF0(c2042f10));
            }
            c2042f8.m108151a(new ZF0(c2042f9));
            byte[][][] m60875e2 = C39351cn4.m60875e(this.f46595i[i3].m37496b());
            C2042F c2042f11 = new C2042F();
            for (byte[][] bArr4 : m60875e2) {
                C2042F c2042f12 = new C2042F();
                int i5 = 0;
                while (true) {
                    if (i5 < bArr4.length) {
                        c2042f12.m108151a(new VF0(bArr4[i5]));
                        i5++;
                    }
                }
                c2042f11.m108151a(new ZF0(c2042f12));
            }
            c2042f8.m108151a(new ZF0(c2042f11));
            byte[][] m60877c = C39351cn4.m60877c(this.f46595i[i3].m37494d());
            C2042F c2042f13 = new C2042F();
            for (byte[] bArr5 : m60877c) {
                c2042f13.m108151a(new VF0(bArr5));
            }
            c2042f8.m108151a(new ZF0(c2042f13));
            c2042f8.m108151a(new VF0(C39351cn4.m60879a(this.f46595i[i3].m37495c())));
            c2042f7.m108151a(new ZF0(c2042f8));
        }
        c2042f.m108151a(new ZF0(c2042f7));
        return new ZF0(c2042f);
    }

    /* renamed from: j */
    public short[] m74283j() {
        return C39351cn4.m60878b(this.f46591e);
    }

    /* renamed from: o */
    public short[] m74282o() {
        return C39351cn4.m60878b(this.f46593g);
    }

    /* renamed from: u */
    public short[][] m74280u() {
        return C39351cn4.m60876d(this.f46590d);
    }

    /* renamed from: v */
    public short[][] m74279v() {
        return C39351cn4.m60876d(this.f46592f);
    }

    /* renamed from: w */
    public C41728gm2[] m74278w() {
        return this.f46595i;
    }

    /* renamed from: x */
    public int[] m74277x() {
        return C39351cn4.m60873g(this.f46594h);
    }

    public C37341Ym4(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C41728gm2[] c41728gm2Arr) {
        this.f46588b = new C4295K(1L);
        this.f46590d = C39351cn4.m60877c(sArr);
        this.f46591e = C39351cn4.m60879a(sArr2);
        this.f46592f = C39351cn4.m60877c(sArr3);
        this.f46593g = C39351cn4.m60879a(sArr4);
        this.f46594h = C39351cn4.m60872h(iArr);
        this.f46595i = c41728gm2Arr;
    }
}
