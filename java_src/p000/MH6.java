package p000;
/* renamed from: MH6 */
/* loaded from: classes8.dex */
public class MH6 extends AbstractC5142M {

    /* renamed from: b */
    public final byte[] f22951b;

    /* renamed from: c */
    public final byte[] f22952c;

    public MH6(byte[] bArr, byte[] bArr2) {
        this.f22951b = C0210Ao.m115251d(bArr);
        this.f22952c = C0210Ao.m115251d(bArr2);
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        C2042F c2042f = new C2042F();
        c2042f.m108151a(new C4295K(0L));
        c2042f.m108151a(new VF0(this.f22951b));
        c2042f.m108151a(new VF0(this.f22952c));
        return new ZF0(c2042f);
    }
}
