package p000;
/* renamed from: fM8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40895fM8 extends OM8 {

    /* renamed from: g */
    public final int f79978g;

    public C40895fM8(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC40913fO8.m41431s(0, i2, bArr.length);
        this.f79978g = i2;
    }

    @Override // p000.OM8, p000.AbstractC40913fO8
    /* renamed from: a */
    public final byte mo41439a(int i) {
        int i2 = this.f79978g;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.f26443f[i];
    }

    @Override // p000.OM8, p000.AbstractC40913fO8
    /* renamed from: b */
    public final byte mo41438b(int i) {
        return this.f26443f[i];
    }

    @Override // p000.OM8, p000.AbstractC40913fO8
    /* renamed from: c */
    public final int mo41437c() {
        return this.f79978g;
    }

    @Override // p000.OM8
    /* renamed from: x */
    public final int mo41492x() {
        return 0;
    }
}
