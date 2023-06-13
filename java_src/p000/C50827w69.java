package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: w69  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50827w69 extends AbstractC46085o69 {

    /* renamed from: f */
    public final byte[] f115381f;

    public C50827w69(byte[] bArr) {
        bArr.getClass();
        this.f115381f = bArr;
    }

    @Override // p000.T69
    /* renamed from: a */
    public byte mo7404a(int i) {
        return this.f115381f[i];
    }

    @Override // p000.T69
    /* renamed from: b */
    public byte mo7403b(int i) {
        return this.f115381f[i];
    }

    @Override // p000.T69
    /* renamed from: c */
    public int mo7402c() {
        return this.f115381f.length;
    }

    @Override // p000.T69
    /* renamed from: e */
    public final int mo7401e(int i, int i2, int i3) {
        return C44007kc9.m28736d(i, this.f115381f, 0, i3);
    }

    @Override // p000.T69
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T69) || mo7402c() != ((T69) obj).mo7402c()) {
            return false;
        }
        if (mo7402c() == 0) {
            return true;
        }
        if (obj instanceof C50827w69) {
            C50827w69 c50827w69 = (C50827w69) obj;
            int m84304u = m84304u();
            int m84304u2 = c50827w69.m84304u();
            if (m84304u != 0 && m84304u2 != 0 && m84304u != m84304u2) {
                return false;
            }
            int mo7402c = mo7402c();
            if (mo7402c <= c50827w69.mo7402c()) {
                if (mo7402c <= c50827w69.mo7402c()) {
                    byte[] bArr = this.f115381f;
                    byte[] bArr2 = c50827w69.f115381f;
                    c50827w69.mo7396y();
                    int i = 0;
                    int i2 = 0;
                    while (i < mo7402c) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                int mo7402c2 = c50827w69.mo7402c();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(mo7402c);
                sb.append(", ");
                sb.append(mo7402c2);
                throw new IllegalArgumentException(sb.toString());
            }
            int mo7402c3 = mo7402c();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(mo7402c);
            sb2.append(mo7402c3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // p000.T69
    /* renamed from: f */
    public final T69 mo7400f(int i, int i2) {
        int m84305s = T69.m84305s(0, i2, mo7402c());
        if (m84305s == 0) {
            return T69.f34797c;
        }
        return new Y59(this.f115381f, 0, m84305s);
    }

    @Override // p000.T69
    /* renamed from: h */
    public final String mo7399h(Charset charset) {
        return new String(this.f115381f, 0, mo7402c(), charset);
    }

    @Override // p000.T69
    /* renamed from: j */
    public final void mo7398j(C43703k59 c43703k59) throws IOException {
        ((E79) c43703k59).m109363H(this.f115381f, 0, mo7402c());
    }

    @Override // p000.T69
    /* renamed from: o */
    public final boolean mo7397o() {
        return Zm9.m72526f(this.f115381f, 0, mo7402c());
    }

    /* renamed from: y */
    public int mo7396y() {
        return 0;
    }
}
