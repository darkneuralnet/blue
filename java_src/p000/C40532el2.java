package p000;
/* renamed from: el2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40532el2 {

    /* renamed from: a */
    public final P31 f78821a;

    /* renamed from: b */
    public final int f78822b;

    public C40532el2(C5448N c5448n, int i) {
        if (c5448n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f78821a = R31.m87374a(c5448n);
        this.f78822b = i;
    }

    /* renamed from: a */
    public byte[] m42576a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f78822b;
        if (length == i) {
            if (bArr2.length == i) {
                return m42573d(0, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* renamed from: b */
    public byte[] m42575b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f78822b;
        if (length == i) {
            if (bArr2.length == i * 2) {
                return m42573d(1, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* renamed from: c */
    public byte[] m42574c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f78822b) {
            if (bArr2.length == 32) {
                return m42573d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* renamed from: d */
    public final byte[] m42573d(int i, byte[] bArr, byte[] bArr2) {
        byte[] m78605q = WH6.m78605q(i, this.f78822b);
        this.f78821a.mo31322f(m78605q, 0, m78605q.length);
        this.f78821a.mo31322f(bArr, 0, bArr.length);
        this.f78821a.mo31322f(bArr2, 0, bArr2.length);
        int i2 = this.f78822b;
        byte[] bArr3 = new byte[i2];
        P31 p31 = this.f78821a;
        if (p31 instanceof YH6) {
            ((YH6) p31).mo15580b(bArr3, 0, i2);
        } else {
            p31.mo15581a(bArr3, 0);
        }
        return bArr3;
    }
}
