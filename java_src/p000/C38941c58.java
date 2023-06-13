package p000;
/* renamed from: c58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38941c58 extends W58 {

    /* renamed from: g */
    public final int f60078g;

    public C38941c58(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC50836w78.m7379o(0, i2, bArr.length);
        this.f60078g = i2;
    }

    @Override // p000.W58, p000.AbstractC50836w78
    /* renamed from: a */
    public final byte mo7386a(int i) {
        int i2 = this.f60078g;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f40405f[i];
    }

    @Override // p000.W58, p000.AbstractC50836w78
    /* renamed from: b */
    public final byte mo7385b(int i) {
        return this.f40405f[i];
    }

    @Override // p000.W58, p000.AbstractC50836w78
    /* renamed from: c */
    public final int mo7384c() {
        return this.f60078g;
    }

    @Override // p000.W58
    /* renamed from: x */
    public final int mo61940x() {
        return 0;
    }
}
