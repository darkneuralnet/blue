package p000;
/* renamed from: fG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40840fG7 extends C50353vJ7 {

    /* renamed from: f */
    public final int f79790f;

    /* renamed from: g */
    public final int f79791g;

    public C40840fG7(byte[] bArr, int i, int i2) {
        super(bArr);
        TD7.m84182h(i, i + i2, bArr.length);
        this.f79790f = i;
        this.f79791g = i2;
    }

    @Override // p000.C50353vJ7, p000.TD7
    /* renamed from: s */
    public final byte mo8901s(int i) {
        int size = size();
        if (((size - (i + 1)) | i) < 0) {
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
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f113829e[this.f79790f + i];
    }

    @Override // p000.C50353vJ7, p000.TD7
    public final int size() {
        return this.f79791g;
    }

    @Override // p000.C50353vJ7
    /* renamed from: x */
    public final int mo8898x() {
        return this.f79790f;
    }
}
