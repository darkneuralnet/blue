package p000;

import java.nio.charset.Charset;
/* renamed from: W58 */
/* loaded from: classes5.dex */
public class W58 extends G58 {

    /* renamed from: f */
    public final byte[] f40405f;

    public W58(byte[] bArr) {
        bArr.getClass();
        this.f40405f = bArr;
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: a */
    public byte mo7386a(int i) {
        return this.f40405f[i];
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: b */
    public byte mo7385b(int i) {
        return this.f40405f[i];
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: c */
    public int mo7384c() {
        return this.f40405f.length;
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: e */
    public final int mo7383e(int i, int i2, int i3) {
        return C41051fd8.m41091d(i, this.f40405f, 0, i3);
    }

    @Override // p000.AbstractC50836w78
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC50836w78) || mo7384c() != ((AbstractC50836w78) obj).mo7384c()) {
            return false;
        }
        if (mo7384c() == 0) {
            return true;
        }
        if (obj instanceof W58) {
            W58 w58 = (W58) obj;
            int m7378s = m7378s();
            int m7378s2 = w58.m7378s();
            if (m7378s != 0 && m7378s2 != 0 && m7378s != m7378s2) {
                return false;
            }
            int mo7384c = mo7384c();
            if (mo7384c <= w58.mo7384c()) {
                if (mo7384c <= w58.mo7384c()) {
                    byte[] bArr = this.f40405f;
                    byte[] bArr2 = w58.f40405f;
                    w58.mo61940x();
                    int i = 0;
                    int i2 = 0;
                    while (i < mo7384c) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                int mo7384c2 = w58.mo7384c();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(mo7384c);
                sb.append(", ");
                sb.append(mo7384c2);
                throw new IllegalArgumentException(sb.toString());
            }
            int mo7384c3 = mo7384c();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(mo7384c);
            sb2.append(mo7384c3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: f */
    public final AbstractC50836w78 mo7382f(int i, int i2) {
        int m7379o = AbstractC50836w78.m7379o(0, i2, mo7384c());
        if (m7379o == 0) {
            return AbstractC50836w78.f115390c;
        }
        return new C38941c58(this.f40405f, 0, m7379o);
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: h */
    public final String mo7381h(Charset charset) {
        return new String(this.f40405f, 0, mo7384c(), charset);
    }

    @Override // p000.AbstractC50836w78
    /* renamed from: j */
    public final boolean mo7380j() {
        return C35311Pu8.m89443d(this.f40405f, 0, mo7384c());
    }

    /* renamed from: x */
    public int mo61940x() {
        return 0;
    }
}
