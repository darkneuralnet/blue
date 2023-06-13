package p000;
/* renamed from: tb4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49328tb4 extends C19599cp {

    /* renamed from: c */
    public int f110777c;

    /* renamed from: d */
    public byte[] f110778d;

    public C49328tb4(int i, byte[] bArr) {
        super(false);
        if (bArr.length != C49921ub4.m9997c(i)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f110777c = i;
        this.f110778d = C0210Ao.m115251d(bArr);
    }

    /* renamed from: a */
    public byte[] m12022a() {
        return C0210Ao.m115251d(this.f110778d);
    }

    /* renamed from: b */
    public int m12021b() {
        return this.f110777c;
    }
}
