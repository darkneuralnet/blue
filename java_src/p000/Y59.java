package p000;
/* renamed from: Y59 */
/* loaded from: classes5.dex */
public final class Y59 extends C50827w69 {

    /* renamed from: g */
    public final int f44514g;

    public Y59(byte[] bArr, int i, int i2) {
        super(bArr);
        T69.m84305s(0, i2, bArr.length);
        this.f44514g = i2;
    }

    @Override // p000.C50827w69, p000.T69
    /* renamed from: a */
    public final byte mo7404a(int i) {
        int i2 = this.f44514g;
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
        return this.f115381f[i];
    }

    @Override // p000.C50827w69, p000.T69
    /* renamed from: b */
    public final byte mo7403b(int i) {
        return this.f115381f[i];
    }

    @Override // p000.C50827w69, p000.T69
    /* renamed from: c */
    public final int mo7402c() {
        return this.f44514g;
    }

    @Override // p000.C50827w69
    /* renamed from: y */
    public final int mo7396y() {
        return 0;
    }
}
