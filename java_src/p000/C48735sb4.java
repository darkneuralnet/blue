package p000;
/* renamed from: sb4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48735sb4 extends C19599cp {

    /* renamed from: c */
    public int f109025c;

    /* renamed from: d */
    public byte[] f109026d;

    public C48735sb4(int i, byte[] bArr) {
        super(true);
        if (bArr.length != C49921ub4.m9998b(i)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f109025c = i;
        this.f109026d = C0210Ao.m115251d(bArr);
    }

    /* renamed from: a */
    public byte[] m13961a() {
        return C0210Ao.m115251d(this.f109026d);
    }

    /* renamed from: b */
    public int m13960b() {
        return this.f109025c;
    }
}
