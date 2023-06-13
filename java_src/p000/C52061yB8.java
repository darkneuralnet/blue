package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: yB8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52061yB8 extends OA8 {

    /* renamed from: f */
    public final byte[] f118946f;

    public C52061yB8(byte[] bArr) {
        bArr.getClass();
        this.f118946f = bArr;
    }

    @Override // p000.OA8
    /* renamed from: E */
    public final boolean mo3861E(AbstractC53119zy8 abstractC53119zy8, int i, int i2) {
        if (i2 <= abstractC53119zy8.mo44b()) {
            if (i2 <= abstractC53119zy8.mo44b()) {
                if (abstractC53119zy8 instanceof C52061yB8) {
                    C52061yB8 c52061yB8 = (C52061yB8) abstractC53119zy8;
                    byte[] bArr = this.f118946f;
                    byte[] bArr2 = c52061yB8.f118946f;
                    int mo3860F = mo3860F() + i2;
                    int mo3860F2 = mo3860F();
                    int mo3860F3 = c52061yB8.mo3860F();
                    while (mo3860F2 < mo3860F) {
                        if (bArr[mo3860F2] != bArr2[mo3860F3]) {
                            return false;
                        }
                        mo3860F2++;
                        mo3860F3++;
                    }
                    return true;
                }
                return abstractC53119zy8.mo40h(0, i2).equals(mo40h(0, i2));
            }
            int mo44b = abstractC53119zy8.mo44b();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: 0, ");
            sb.append(i2);
            sb.append(", ");
            sb.append(mo44b);
            throw new IllegalArgumentException(sb.toString());
        }
        int mo44b2 = mo44b();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(mo44b2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: F */
    public int mo3860F() {
        return 0;
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: a */
    public byte mo45a(int i) {
        return this.f118946f[i];
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: b */
    public int mo44b() {
        return this.f118946f.length;
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: e */
    public final int mo42e(int i, int i2, int i3) {
        return C52124yI8.m3694a(i, this.f118946f, mo3860F(), i3);
    }

    @Override // p000.AbstractC53119zy8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC53119zy8) || mo44b() != ((AbstractC53119zy8) obj).mo44b()) {
            return false;
        }
        if (mo44b() == 0) {
            return true;
        }
        if (obj instanceof C52061yB8) {
            C52061yB8 c52061yB8 = (C52061yB8) obj;
            int m46D = m46D();
            int m46D2 = c52061yB8.m46D();
            if (m46D != 0 && m46D2 != 0 && m46D != m46D2) {
                return false;
            }
            return mo3861E(c52061yB8, 0, mo44b());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: f */
    public final String mo41f(Charset charset) {
        return new String(this.f118946f, mo3860F(), mo44b(), charset);
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: h */
    public final AbstractC53119zy8 mo40h(int i, int i2) {
        int m32y = AbstractC53119zy8.m32y(0, i2, mo44b());
        if (m32y == 0) {
            return AbstractC53119zy8.f122544c;
        }
        return new C43050iz8(this.f118946f, mo3860F(), m32y);
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: u */
    public final void mo36u(AbstractC35572Qx8 abstractC35572Qx8) throws IOException {
        abstractC35572Qx8.mo50781a(this.f118946f, mo3860F(), mo44b());
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: v */
    public void mo35v(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f118946f, 0, bArr, 0, i3);
    }

    @Override // p000.AbstractC53119zy8
    /* renamed from: w */
    public byte mo34w(int i) {
        return this.f118946f[i];
    }

    @Override // p000.AbstractC53119zy8
    public final boolean zzc() {
        int mo3860F = mo3860F();
        return C49582u09.m11097g(this.f118946f, mo3860F, mo44b() + mo3860F);
    }
}
