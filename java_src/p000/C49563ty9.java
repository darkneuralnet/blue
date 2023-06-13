package p000;
/* renamed from: ty9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49563ty9 extends C39945dl7 {

    /* renamed from: g */
    public final int f111433g;

    /* renamed from: h */
    public final int f111434h;

    public C49563ty9(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC43604jv9.m29744w(i, i + i2, bArr.length);
        this.f111433g = i;
        this.f111434h = i2;
    }

    @Override // p000.C39945dl7, p000.AbstractC43604jv9
    /* renamed from: A */
    public final byte mo11134A(int i) {
        return this.f77181f[this.f111433g + i];
    }

    @Override // p000.C39945dl7
    /* renamed from: E */
    public final int mo11133E() {
        return this.f111433g;
    }

    @Override // p000.C39945dl7, p000.AbstractC43604jv9
    public final int size() {
        return this.f111434h;
    }

    @Override // p000.C39945dl7, p000.AbstractC43604jv9
    /* renamed from: u */
    public final void mo11132u(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f77181f, mo11133E(), bArr, 0, i3);
    }

    @Override // p000.C39945dl7, p000.AbstractC43604jv9
    /* renamed from: y */
    public final byte mo11131y(int i) {
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
        return this.f77181f[this.f111433g + i];
    }
}
