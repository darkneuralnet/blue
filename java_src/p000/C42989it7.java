package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: it7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42989it7 extends AbstractC42396ht7 {

    /* renamed from: f */
    public final byte[] f91659f;

    public C42989it7(byte[] bArr) {
        bArr.getClass();
        this.f91659f = bArr;
    }

    @Override // p000.AbstractC42396ht7
    /* renamed from: L */
    public final boolean mo31672L(AbstractC44175kt7 abstractC44175kt7, int i, int i2) {
        if (i2 <= abstractC44175kt7.mo28217e()) {
            int i3 = i + i2;
            if (i3 <= abstractC44175kt7.mo28217e()) {
                if (abstractC44175kt7 instanceof C42989it7) {
                    C42989it7 c42989it7 = (C42989it7) abstractC44175kt7;
                    byte[] bArr = this.f91659f;
                    byte[] bArr2 = c42989it7.f91659f;
                    int mo31671M = mo31671M() + i2;
                    int mo31671M2 = mo31671M();
                    int mo31671M3 = c42989it7.mo31671M() + i;
                    while (mo31671M2 < mo31671M) {
                        if (bArr[mo31671M2] != bArr2[mo31671M3]) {
                            return false;
                        }
                        mo31671M2++;
                        mo31671M3++;
                    }
                    return true;
                }
                return abstractC44175kt7.mo28211u(i, i3).equals(mo28211u(0, i2));
            }
            int mo28217e = abstractC44175kt7.mo28217e();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(mo28217e);
            throw new IllegalArgumentException(sb.toString());
        }
        int mo28217e2 = mo28217e();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(mo28217e2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: M */
    public int mo31671M() {
        return 0;
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: a */
    public byte mo28220a(int i) {
        return this.f91659f[i];
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: b */
    public byte mo28219b(int i) {
        return this.f91659f[i];
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: e */
    public int mo28217e() {
        return this.f91659f.length;
    }

    @Override // p000.AbstractC44175kt7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC44175kt7) || mo28217e() != ((AbstractC44175kt7) obj).mo28217e()) {
            return false;
        }
        if (mo28217e() == 0) {
            return true;
        }
        if (obj instanceof C42989it7) {
            C42989it7 c42989it7 = (C42989it7) obj;
            int m28206z = m28206z();
            int m28206z2 = c42989it7.m28206z();
            if (m28206z != 0 && m28206z2 != 0 && m28206z != m28206z2) {
                return false;
            }
            return mo31672L(c42989it7, 0, mo28217e());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: f */
    public void mo28216f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f91659f, i, bArr, i2, i3);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: o */
    public final int mo28213o(int i, int i2, int i3) {
        return C46557ou7.m20294d(i, this.f91659f, mo31671M() + i2, i3);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: s */
    public final int mo28212s(int i, int i2, int i3) {
        int mo31671M = mo31671M() + i2;
        return C33456Hw7.m103209f(i, this.f91659f, mo31671M, i3 + mo31671M);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: u */
    public final AbstractC44175kt7 mo28211u(int i, int i2) {
        int m28207y = AbstractC44175kt7.m28207y(i, i2, mo28217e());
        if (m28207y == 0) {
            return AbstractC44175kt7.f95165c;
        }
        return new C34824Ns7(this.f91659f, mo31671M() + i, m28207y);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: v */
    public final String mo28210v(Charset charset) {
        return new String(this.f91659f, mo31671M(), mo28217e(), charset);
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: w */
    public final void mo28209w(AbstractC33654Is7 abstractC33654Is7) throws IOException {
        abstractC33654Is7.mo9570a(this.f91659f, mo31671M(), mo28217e());
    }

    @Override // p000.AbstractC44175kt7
    /* renamed from: x */
    public final boolean mo28208x() {
        int mo31671M = mo31671M();
        return C33456Hw7.m103206i(this.f91659f, mo31671M, mo28217e() + mo31671M);
    }
}
