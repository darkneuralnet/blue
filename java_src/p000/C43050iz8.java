package p000;
/* renamed from: iz8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43050iz8 extends C52061yB8 {

    /* renamed from: g */
    public final int f91973g;

    /* renamed from: h */
    public final int f91974h;

    public C43050iz8(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC53119zy8.m32y(i, i + i2, bArr.length);
        this.f91973g = i;
        this.f91974h = i2;
    }

    @Override // p000.C52061yB8
    /* renamed from: F */
    public final int mo3860F() {
        return this.f91973g;
    }

    @Override // p000.C52061yB8, p000.AbstractC53119zy8
    /* renamed from: a */
    public final byte mo45a(int i) {
        int mo44b = mo44b();
        if (((mo44b - (i + 1)) | i) < 0) {
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
            sb2.append(mo44b);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f118946f[this.f91973g + i];
    }

    @Override // p000.C52061yB8, p000.AbstractC53119zy8
    /* renamed from: b */
    public final int mo44b() {
        return this.f91974h;
    }

    @Override // p000.C52061yB8, p000.AbstractC53119zy8
    /* renamed from: v */
    public final void mo35v(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f118946f, mo3860F(), bArr, 0, i3);
    }

    @Override // p000.C52061yB8, p000.AbstractC53119zy8
    /* renamed from: w */
    public final byte mo34w(int i) {
        return this.f118946f[this.f91973g + i];
    }
}
