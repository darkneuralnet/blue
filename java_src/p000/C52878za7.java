package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: za7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52878za7 extends AbstractC52285ya7 {

    /* renamed from: f */
    public final byte[] f121563f;

    public C52878za7(byte[] bArr) {
        bArr.getClass();
        this.f121563f = bArr;
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: a */
    public byte mo1074a(int i) {
        return this.f121563f[i];
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: b */
    public byte mo1073b(int i) {
        return this.f121563f[i];
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: c */
    public int mo1072c() {
        return this.f121563f.length;
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: e */
    public final int mo1071e(int i, int i2, int i3) {
        return C46960pb7.m19080b(i, this.f121563f, 0, i3);
    }

    @Override // p000.AbstractC32088Ca7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC32088Ca7) || mo1072c() != ((AbstractC32088Ca7) obj).mo1072c()) {
            return false;
        }
        if (mo1072c() == 0) {
            return true;
        }
        if (obj instanceof C52878za7) {
            C52878za7 c52878za7 = (C52878za7) obj;
            int m112097u = m112097u();
            int m112097u2 = c52878za7.m112097u();
            if (m112097u != 0 && m112097u2 != 0 && m112097u != m112097u2) {
                return false;
            }
            int mo1072c = mo1072c();
            if (mo1072c <= c52878za7.mo1072c()) {
                if (mo1072c <= c52878za7.mo1072c()) {
                    byte[] bArr = this.f121563f;
                    byte[] bArr2 = c52878za7.f121563f;
                    c52878za7.mo1066x();
                    int i = 0;
                    int i2 = 0;
                    while (i < mo1072c) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo1072c + ", " + c52878za7.mo1072c());
            }
            throw new IllegalArgumentException("Length too large: " + mo1072c + mo1072c());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: f */
    public final AbstractC32088Ca7 mo1070f(int i, int i2) {
        int m112098s = AbstractC32088Ca7.m112098s(0, i2, mo1072c());
        if (m112098s == 0) {
            return AbstractC32088Ca7.f4281c;
        }
        return new C50506va7(this.f121563f, 0, m112098s);
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: h */
    public final String mo1069h(Charset charset) {
        return new String(this.f121563f, 0, mo1072c(), charset);
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: j */
    public final void mo1068j(C46357oa7 c46357oa7) throws IOException {
        ((C33258Ha7) c46357oa7).m103695F(this.f121563f, 0, mo1072c());
    }

    @Override // p000.AbstractC32088Ca7
    /* renamed from: o */
    public final boolean mo1067o() {
        return C35382Qc7.m88314e(this.f121563f, 0, mo1072c());
    }

    /* renamed from: x */
    public int mo1066x() {
        return 0;
    }
}
