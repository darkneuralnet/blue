package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: dl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39945dl7 extends AbstractC48216ri7 {

    /* renamed from: f */
    public final byte[] f77181f;

    public C39945dl7(byte[] bArr) {
        bArr.getClass();
        this.f77181f = bArr;
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: A */
    public byte mo11134A(int i) {
        return this.f77181f[i];
    }

    @Override // p000.AbstractC48216ri7
    /* renamed from: D */
    public final boolean mo15551D(AbstractC43604jv9 abstractC43604jv9, int i, int i2) {
        if (i2 <= abstractC43604jv9.size()) {
            if (i2 <= abstractC43604jv9.size()) {
                if (abstractC43604jv9 instanceof C39945dl7) {
                    C39945dl7 c39945dl7 = (C39945dl7) abstractC43604jv9;
                    byte[] bArr = this.f77181f;
                    byte[] bArr2 = c39945dl7.f77181f;
                    int mo11133E = mo11133E() + i2;
                    int mo11133E2 = mo11133E();
                    int mo11133E3 = c39945dl7.mo11133E();
                    while (mo11133E2 < mo11133E) {
                        if (bArr[mo11133E2] != bArr2[mo11133E3]) {
                            return false;
                        }
                        mo11133E2++;
                        mo11133E3++;
                    }
                    return true;
                }
                return abstractC43604jv9.mo29747o(0, i2).equals(mo29747o(0, i2));
            }
            int size = abstractC43604jv9.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: 0, ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: E */
    public int mo11133E() {
        return 0;
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: c */
    public final boolean mo29752c() {
        int mo11133E = mo11133E();
        return U68.m81956h(this.f77181f, mo11133E, size() + mo11133E);
    }

    @Override // p000.AbstractC43604jv9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC43604jv9) || size() != ((AbstractC43604jv9) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C39945dl7) {
            C39945dl7 c39945dl7 = (C39945dl7) obj;
            int m29751e = m29751e();
            int m29751e2 = c39945dl7.m29751e();
            if (m29751e != 0 && m29751e2 != 0 && m29751e != m29751e2) {
                return false;
            }
            return mo15551D(c39945dl7, 0, size());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: h */
    public final int mo29749h(int i, int i2, int i3) {
        return C44389lF7.m27617c(i, this.f77181f, mo11133E(), i3);
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: j */
    public final String mo29748j(Charset charset) {
        return new String(this.f77181f, mo11133E(), size(), charset);
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: o */
    public final AbstractC43604jv9 mo29747o(int i, int i2) {
        int m29744w = AbstractC43604jv9.m29744w(0, i2, size());
        if (m29744w == 0) {
            return AbstractC43604jv9.f93538c;
        }
        return new C49563ty9(this.f77181f, mo11133E(), m29744w);
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: s */
    public final void mo29746s(Dq9 dq9) throws IOException {
        dq9.mo51052a(this.f77181f, mo11133E(), size());
    }

    @Override // p000.AbstractC43604jv9
    public int size() {
        return this.f77181f.length;
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: u */
    public void mo11132u(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f77181f, 0, bArr, 0, i3);
    }

    @Override // p000.AbstractC43604jv9
    /* renamed from: y */
    public byte mo11131y(int i) {
        return this.f77181f[i];
    }
}
