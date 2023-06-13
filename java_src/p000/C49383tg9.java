package p000;
/* renamed from: tg9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49383tg9 extends Xg9 {

    /* renamed from: g */
    public final int f110868g;

    public C49383tg9(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC45836nh9.m23295u(0, i2, bArr.length);
        this.f110868g = i2;
    }

    @Override // p000.Xg9
    /* renamed from: E */
    public final int mo11927E() {
        return 0;
    }

    @Override // p000.Xg9, p000.AbstractC45836nh9
    /* renamed from: a */
    public final byte mo11926a(int i) {
        int i2 = this.f110868g;
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
        return this.f43580f[i];
    }

    @Override // p000.Xg9, p000.AbstractC45836nh9
    /* renamed from: b */
    public final byte mo11925b(int i) {
        return this.f43580f[i];
    }

    @Override // p000.Xg9, p000.AbstractC45836nh9
    /* renamed from: c */
    public final int mo11924c() {
        return this.f110868g;
    }

    @Override // p000.Xg9, p000.AbstractC45836nh9
    /* renamed from: e */
    public final void mo11923e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f43580f, 0, bArr, 0, i3);
    }
}
