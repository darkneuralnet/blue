package p000;

import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: oX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46330oX7 extends ZW7 {

    /* renamed from: f */
    public final byte[] f102128f;

    public C46330oX7(byte[] bArr) {
        bArr.getClass();
        this.f102128f = bArr;
    }

    @Override // p000.ZW7
    /* renamed from: K */
    public final boolean mo20911K(AbstractC41604gZ7 abstractC41604gZ7, int i, int i2) {
        if (i2 <= abstractC41604gZ7.mo5074e()) {
            int i3 = i + i2;
            if (i3 <= abstractC41604gZ7.mo5074e()) {
                if (abstractC41604gZ7 instanceof C46330oX7) {
                    C46330oX7 c46330oX7 = (C46330oX7) abstractC41604gZ7;
                    byte[] bArr = this.f102128f;
                    byte[] bArr2 = c46330oX7.f102128f;
                    int mo5077L = mo5077L() + i2;
                    int mo5077L2 = mo5077L();
                    int mo5077L3 = c46330oX7.mo5077L() + i;
                    while (mo5077L2 < mo5077L) {
                        if (bArr[mo5077L2] != bArr2[mo5077L3]) {
                            return false;
                        }
                        mo5077L2++;
                        mo5077L3++;
                    }
                    return true;
                }
                return abstractC41604gZ7.mo15338u(i, i3).equals(mo15338u(0, i2));
            }
            int mo5074e = abstractC41604gZ7.mo5074e();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + mo5074e);
        }
        int mo5074e2 = mo5074e();
        throw new IllegalArgumentException("Length too large: " + i2 + mo5074e2);
    }

    /* renamed from: L */
    public int mo5077L() {
        return 0;
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: a */
    public byte mo5076a(int i) {
        return this.f102128f[i];
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: b */
    public byte mo5075b(int i) {
        return this.f102128f[i];
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: e */
    public int mo5074e() {
        return this.f102128f.length;
    }

    @Override // p000.AbstractC41604gZ7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC41604gZ7) || mo5074e() != ((AbstractC41604gZ7) obj).mo5074e()) {
            return false;
        }
        if (mo5074e() == 0) {
            return true;
        }
        if (obj instanceof C46330oX7) {
            C46330oX7 c46330oX7 = (C46330oX7) obj;
            int m39157z = m39157z();
            int m39157z2 = c46330oX7.m39157z();
            if (m39157z != 0 && m39157z2 != 0 && m39157z != m39157z2) {
                return false;
            }
            return mo20911K(c46330oX7, 0, mo5074e());
        }
        return obj.equals(this);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: f */
    public void mo5073f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f102128f, i, bArr, i2, i3);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: o */
    public final int mo15340o(int i, int i2, int i3) {
        return C32791Fa8.m106927b(i, this.f102128f, mo5077L() + i2, i3);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: s */
    public final int mo15339s(int i, int i2, int i3) {
        int mo5077L = mo5077L() + i2;
        return C43623jx8.m29597f(i, this.f102128f, mo5077L, i3 + mo5077L);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: u */
    public final AbstractC41604gZ7 mo15338u(int i, int i2) {
        int m39158y = AbstractC41604gZ7.m39158y(i, i2, mo5074e());
        if (m39158y == 0) {
            return AbstractC41604gZ7.f82424c;
        }
        return new C51656xW7(this.f102128f, mo5077L() + i, m39158y);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: v */
    public final String mo15337v(Charset charset) {
        return new String(this.f102128f, mo5077L(), mo5074e(), charset);
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: w */
    public final void mo15336w(C50461vV7 c50461vV7) throws IOException {
        ((A08) c50461vV7).m116201C(this.f102128f, mo5077L(), mo5074e());
    }

    @Override // p000.AbstractC41604gZ7
    /* renamed from: x */
    public final boolean mo15335x() {
        int mo5077L = mo5077L();
        return C43623jx8.m29595h(this.f102128f, mo5077L, mo5074e() + mo5077L);
    }
}
