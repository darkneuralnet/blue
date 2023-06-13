package p000;
/* renamed from: va7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50506va7 extends C52878za7 {

    /* renamed from: g */
    public final int f114303g;

    public C50506va7(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC32088Ca7.m112098s(0, i2, bArr.length);
        this.f114303g = i2;
    }

    @Override // p000.C52878za7, p000.AbstractC32088Ca7
    /* renamed from: a */
    public final byte mo1074a(int i) {
        int i2 = this.f114303g;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.f121563f[i];
    }

    @Override // p000.C52878za7, p000.AbstractC32088Ca7
    /* renamed from: b */
    public final byte mo1073b(int i) {
        return this.f121563f[i];
    }

    @Override // p000.C52878za7, p000.AbstractC32088Ca7
    /* renamed from: c */
    public final int mo1072c() {
        return this.f114303g;
    }

    @Override // p000.C52878za7
    /* renamed from: x */
    public final int mo1066x() {
        return 0;
    }
}
