package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: vJ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50353vJ7 extends GI7 {

    /* renamed from: e */
    public final byte[] f113829e;

    public C50353vJ7(byte[] bArr) {
        this.f113829e = bArr;
    }

    @Override // p000.TD7
    /* renamed from: a */
    public final int mo8905a(int i, int i2, int i3) {
        return C37975aT7.m71330c(i, this.f113829e, mo8898x(), i3);
    }

    @Override // p000.TD7
    /* renamed from: b */
    public final String mo8904b(Charset charset) {
        return new String(this.f113829e, mo8898x(), size(), charset);
    }

    @Override // p000.TD7
    /* renamed from: c */
    public final TD7 mo8903c(int i, int i2) {
        int m84182h = TD7.m84182h(0, i2, size());
        return m84182h == 0 ? TD7.f34940c : new C40840fG7(this.f113829e, mo8898x(), m84182h);
    }

    @Override // p000.TD7
    /* renamed from: e */
    public final void mo8902e(VC7 vc7) throws IOException {
        vc7.mo51375a(this.f113829e, mo8898x(), size());
    }

    @Override // p000.TD7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof TD7) && size() == ((TD7) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C50353vJ7) {
                C50353vJ7 c50353vJ7 = (C50353vJ7) obj;
                int m84183f = m84183f();
                int m84183f2 = c50353vJ7.m84183f();
                if (m84183f == 0 || m84183f2 == 0 || m84183f == m84183f2) {
                    return mo8899w(c50353vJ7, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // p000.TD7
    /* renamed from: s */
    public byte mo8901s(int i) {
        return this.f113829e[i];
    }

    @Override // p000.TD7
    public int size() {
        return this.f113829e.length;
    }

    @Override // p000.TD7
    /* renamed from: v1 */
    public final boolean mo8900v1() {
        int mo8898x = mo8898x();
        return C31909Bg8.m113677i(this.f113829e, mo8898x, size() + mo8898x);
    }

    @Override // p000.GI7
    /* renamed from: w */
    public final boolean mo8899w(TD7 td7, int i, int i2) {
        if (i2 > td7.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > td7.size()) {
            int size2 = td7.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (td7 instanceof C50353vJ7) {
            C50353vJ7 c50353vJ7 = (C50353vJ7) td7;
            byte[] bArr = this.f113829e;
            byte[] bArr2 = c50353vJ7.f113829e;
            int mo8898x = mo8898x() + i2;
            int mo8898x2 = mo8898x();
            int mo8898x3 = c50353vJ7.mo8898x();
            while (mo8898x2 < mo8898x) {
                if (bArr[mo8898x2] != bArr2[mo8898x3]) {
                    return false;
                }
                mo8898x2++;
                mo8898x3++;
            }
            return true;
        } else {
            return td7.mo8903c(0, i2).equals(mo8903c(0, i2));
        }
    }

    /* renamed from: x */
    public int mo8898x() {
        return 0;
    }
}
