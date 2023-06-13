package p000;

import com.google.android.gms.internal.recaptcha.zzqh;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: kj9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44077kj9 extends Qi9 {

    /* renamed from: h */
    public final OutputStream f94842h;

    public C44077kj9(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.f94842h = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: A */
    public final void mo15532A(int i) throws IOException {
        m28563V(4);
        m88152Q(i);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: B */
    public final void mo15531B(int i, long j) throws IOException {
        m28563V(18);
        m88150S((i << 3) | 1);
        m88151R(j);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: C */
    public final void mo15530C(long j) throws IOException {
        m28563V(8);
        m88151R(j);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: D */
    public final void mo15529D(int i, int i2) throws IOException {
        m28563V(20);
        m88150S(i << 3);
        if (i2 >= 0) {
            m88150S(i2);
        } else {
            m88149T(i2);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: E */
    public final void mo15528E(int i) throws IOException {
        if (i >= 0) {
            mo15521L(i);
        } else {
            mo15519N(i);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: F */
    public final void mo15527F(int i, Np9 np9, InterfaceC38803br9 interfaceC38803br9) throws IOException {
        mo15521L((i << 3) | 2);
        Ne9 ne9 = (Ne9) np9;
        int mo93595a = ne9.mo93595a();
        if (mo93595a == -1) {
            mo93595a = interfaceC38803br9.zza(ne9);
            ne9.mo93593i(mo93595a);
        }
        mo15521L(mo93595a);
        interfaceC38803br9.mo62269e(np9, this.f107544a);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: G */
    public final void mo15526G(Np9 np9) throws IOException {
        mo15521L(np9.mo93341g());
        np9.mo81209j(this);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: H */
    public final void mo15525H(int i, String str) throws IOException {
        mo15521L((i << 3) | 2);
        mo15524I(str);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: I */
    public final void mo15524I(String str) throws IOException {
        int m89658c;
        try {
            int length = str.length() * 3;
            int m15506l = AbstractC48228rj9.m15506l(length);
            int i = m15506l + length;
            int i2 = this.f30788e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int m89659b = Ps9.m89659b(str, bArr, 0, length);
                mo15521L(m89659b);
                m28562W(bArr, 0, m89659b);
                return;
            }
            if (i > i2 - this.f30789f) {
                m28564U();
            }
            int m15506l2 = AbstractC48228rj9.m15506l(str.length());
            int i3 = this.f30789f;
            try {
                if (m15506l2 == m15506l) {
                    int i4 = i3 + m15506l2;
                    this.f30789f = i4;
                    int m89659b2 = Ps9.m89659b(str, this.f30787d, i4, this.f30788e - i4);
                    this.f30789f = i3;
                    m89658c = (m89659b2 - i3) - m15506l2;
                    m88150S(m89658c);
                    this.f30789f = m89659b2;
                } else {
                    m89658c = Ps9.m89658c(str);
                    m88150S(m89658c);
                    this.f30789f = Ps9.m89659b(str, this.f30787d, this.f30789f, m89658c);
                }
                this.f30790g += m89658c;
            } catch (Ns9 e) {
                this.f30790g -= this.f30789f - i3;
                this.f30789f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzqh(e2);
            }
        } catch (Ns9 e3) {
            m15501q(str, e3);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: J */
    public final void mo15523J(int i, int i2) throws IOException {
        mo15521L((i << 3) | i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: K */
    public final void mo15522K(int i, int i2) throws IOException {
        m28563V(20);
        m88150S(i << 3);
        m88150S(i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: L */
    public final void mo15521L(int i) throws IOException {
        m28563V(5);
        m88150S(i);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: M */
    public final void mo15520M(int i, long j) throws IOException {
        m28563V(20);
        m88150S(i << 3);
        m88149T(j);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: N */
    public final void mo15519N(long j) throws IOException {
        m28563V(10);
        m88149T(j);
    }

    /* renamed from: U */
    public final void m28564U() throws IOException {
        this.f94842h.write(this.f30787d, 0, this.f30789f);
        this.f30789f = 0;
    }

    /* renamed from: V */
    public final void m28563V(int i) throws IOException {
        if (this.f30788e - this.f30789f < i) {
            m28564U();
        }
    }

    /* renamed from: W */
    public final void m28562W(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f30788e;
        int i4 = this.f30789f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.f30787d, i4, i2);
            this.f30789f += i2;
            this.f30790g += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.f30787d, i4, i5);
        int i6 = i2 - i5;
        this.f30789f = this.f30788e;
        this.f30790g += i5;
        m28564U();
        if (i6 <= this.f30788e) {
            System.arraycopy(bArr, i5, this.f30787d, 0, i6);
            this.f30789f = i6;
        } else {
            this.f94842h.write(bArr, i5, i6);
        }
        this.f30790g += i6;
    }

    @Override // p000.AbstractC48228rj9, p000.If9
    /* renamed from: a */
    public final void mo15517a(byte[] bArr, int i, int i2) throws IOException {
        m28562W(bArr, 0, i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: s */
    public final void mo15499s() throws IOException {
        if (this.f30789f > 0) {
            m28564U();
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: t */
    public final void mo15498t(byte b) throws IOException {
        if (this.f30789f == this.f30788e) {
            m28564U();
        }
        m88153P(b);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: u */
    public final void mo15497u(int i, boolean z) throws IOException {
        m28563V(11);
        m88150S(i << 3);
        m88153P(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: v */
    public final void mo15496v(byte[] bArr, int i, int i2) throws IOException {
        mo15521L(i2);
        m28562W(bArr, 0, i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: x */
    public final void mo15494x(int i, AbstractC45836nh9 abstractC45836nh9) throws IOException {
        mo15521L((i << 3) | 2);
        mo15493y(abstractC45836nh9);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: y */
    public final void mo15493y(AbstractC45836nh9 abstractC45836nh9) throws IOException {
        mo15521L(abstractC45836nh9.mo11924c());
        abstractC45836nh9.mo23297o(this);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: z */
    public final void mo15492z(int i, int i2) throws IOException {
        m28563V(14);
        m88150S((i << 3) | 5);
        m88152Q(i2);
    }
}
