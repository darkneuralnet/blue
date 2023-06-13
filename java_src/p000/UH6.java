package p000;
/* renamed from: UH6 */
/* loaded from: classes8.dex */
public class UH6 extends AbstractC5142M {

    /* renamed from: b */
    public final byte[] f37182b;

    /* renamed from: c */
    public final byte[] f37183c;

    public UH6(AbstractC8166U abstractC8166U) {
        if (!C4295K.m99377A(abstractC8166U.mo35872A(0)).m99375D(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f37182b = C0210Ao.m115251d(AbstractC5803O.m93018A(abstractC8166U.mo35872A(1)).m93017C());
        this.f37183c = C0210Ao.m115251d(AbstractC5803O.m93018A(abstractC8166U.mo35872A(2)).m93017C());
    }

    /* renamed from: j */
    public static UH6 m81680j(Object obj) {
        if (obj instanceof UH6) {
            return (UH6) obj;
        }
        if (obj != null) {
            return new UH6(AbstractC8166U.m82198z(obj));
        }
        return null;
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(0L));
        c2042f.m108151a(new VF0(this.f37182b));
        c2042f.m108151a(new VF0(this.f37183c));
        return new ZF0(c2042f);
    }

    /* renamed from: o */
    public byte[] m81679o() {
        return C0210Ao.m115251d(this.f37182b);
    }

    /* renamed from: s */
    public byte[] m81678s() {
        return C0210Ao.m115251d(this.f37183c);
    }

    public UH6(byte[] bArr, byte[] bArr2) {
        this.f37182b = C0210Ao.m115251d(bArr);
        this.f37183c = C0210Ao.m115251d(bArr2);
    }
}
