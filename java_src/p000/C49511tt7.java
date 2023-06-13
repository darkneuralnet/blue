package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzapn;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: tt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49511tt7 extends AbstractC48326rt7 {

    /* renamed from: h */
    public final OutputStream f111345h;

    public C49511tt7(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.f111345h = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: A */
    public final void mo9587A(int i, int i2) throws IOException {
        m11254Y(14);
        m15110U((i << 3) | 5);
        m15112S(i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: B */
    public final void mo9586B(int i) throws IOException {
        m11254Y(4);
        m15112S(i);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: C */
    public final void mo9585C(int i, long j) throws IOException {
        m11254Y(18);
        m15110U((i << 3) | 1);
        m15111T(j);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: D */
    public final void mo9584D(long j) throws IOException {
        m11254Y(8);
        m15111T(j);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: E */
    public final void mo9583E(int i, int i2) throws IOException {
        m11254Y(20);
        m15110U(i << 3);
        if (i2 >= 0) {
            m15110U(i2);
        } else {
            m15109V(i2);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: F */
    public final void mo9582F(int i) throws IOException {
        if (i >= 0) {
            mo9573O(i);
        } else {
            mo9571Q(i);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: G */
    public final void mo9581G(int i, InterfaceC41230fv7 interfaceC41230fv7, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException {
        mo9573O((i << 3) | 2);
        AbstractC52465ys7 abstractC52465ys7 = (AbstractC52465ys7) interfaceC41230fv7;
        int mo2344b = abstractC52465ys7.mo2344b();
        if (mo2344b == -1) {
            mo2344b = interfaceC34851Nv7.zza(abstractC52465ys7);
            abstractC52465ys7.mo2342d(mo2344b);
        }
        mo9573O(mo2344b);
        interfaceC34851Nv7.mo29758f(interfaceC41230fv7, this.f113170a);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: H */
    public final void mo9580H(InterfaceC41230fv7 interfaceC41230fv7) throws IOException {
        mo9573O(interfaceC41230fv7.mo40440w());
        interfaceC41230fv7.mo190y(this);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: I */
    public final void mo9579I(int i, InterfaceC41230fv7 interfaceC41230fv7) throws IOException {
        mo9573O(11);
        mo9574N(2, i);
        mo9573O(26);
        mo9580H(interfaceC41230fv7);
        mo9573O(12);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: J */
    public final void mo9578J(int i, AbstractC44175kt7 abstractC44175kt7) throws IOException {
        mo9573O(11);
        mo9574N(2, i);
        mo9546y(3, abstractC44175kt7);
        mo9573O(12);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: K */
    public final void mo9577K(int i, String str) throws IOException {
        mo9573O((i << 3) | 2);
        mo9576L(str);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: L */
    public final void mo9576L(String str) throws IOException {
        int m103210e;
        try {
            int length = str.length() * 3;
            int m9558m = AbstractC50104ut7.m9558m(length);
            int i = m9558m + length;
            int i2 = this.f107853e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int m103211d = C33456Hw7.m103211d(str, bArr, 0, length);
                mo9573O(m103211d);
                m11256W(bArr, 0, m103211d);
                return;
            }
            if (i > i2 - this.f107854f) {
                m11255X();
            }
            int m9558m2 = AbstractC50104ut7.m9558m(str.length());
            int i3 = this.f107854f;
            try {
                if (m9558m2 == m9558m) {
                    int i4 = i3 + m9558m2;
                    this.f107854f = i4;
                    int m103211d2 = C33456Hw7.m103211d(str, this.f107852d, i4, this.f107853e - i4);
                    this.f107854f = i3;
                    m103210e = (m103211d2 - i3) - m9558m2;
                    m15110U(m103210e);
                    this.f107854f = m103211d2;
                } else {
                    m103210e = C33456Hw7.m103210e(str);
                    m15110U(m103210e);
                    this.f107854f = C33456Hw7.m103211d(str, this.f107852d, this.f107854f, m103210e);
                }
                this.f107855g += m103210e;
            } catch (C33222Gw7 e) {
                this.f107855g -= this.f107854f - i3;
                this.f107854f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzapn(e2);
            }
        } catch (C33222Gw7 e3) {
            m9553r(str, e3);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: M */
    public final void mo9575M(int i, int i2) throws IOException {
        mo9573O((i << 3) | i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: N */
    public final void mo9574N(int i, int i2) throws IOException {
        m11254Y(20);
        m15110U(i << 3);
        m15110U(i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: O */
    public final void mo9573O(int i) throws IOException {
        m11254Y(5);
        m15110U(i);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: P */
    public final void mo9572P(int i, long j) throws IOException {
        m11254Y(20);
        m15110U(i << 3);
        m15109V(j);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: Q */
    public final void mo9571Q(long j) throws IOException {
        m11254Y(10);
        m15109V(j);
    }

    /* renamed from: W */
    public final void m11256W(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f107853e;
        int i4 = this.f107854f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f107852d, i4, i2);
            this.f107854f += i2;
            this.f107855g += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f107852d, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f107854f = this.f107853e;
        this.f107855g += i5;
        m11255X();
        if (i7 <= this.f107853e) {
            System.arraycopy(bArr, i6, this.f107852d, 0, i7);
            this.f107854f = i7;
        } else {
            this.f111345h.write(bArr, i6, i7);
        }
        this.f107855g += i7;
    }

    /* renamed from: X */
    public final void m11255X() throws IOException {
        this.f111345h.write(this.f107852d, 0, this.f107854f);
        this.f107854f = 0;
    }

    /* renamed from: Y */
    public final void m11254Y(int i) throws IOException {
        if (this.f107853e - this.f107854f < i) {
            m11255X();
        }
    }

    @Override // p000.AbstractC50104ut7, p000.AbstractC33654Is7
    /* renamed from: a */
    public final void mo9570a(byte[] bArr, int i, int i2) throws IOException {
        m11256W(bArr, i, i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: t */
    public final void mo9551t() throws IOException {
        if (this.f107854f > 0) {
            m11255X();
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: u */
    public final void mo9550u(byte b) throws IOException {
        if (this.f107854f == this.f107853e) {
            m11255X();
        }
        m15113R(b);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: v */
    public final void mo9549v(int i, boolean z) throws IOException {
        m11254Y(11);
        m15110U(i << 3);
        m15113R(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: w */
    public final void mo9548w(byte[] bArr, int i, int i2) throws IOException {
        mo9573O(i2);
        m11256W(bArr, 0, i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: y */
    public final void mo9546y(int i, AbstractC44175kt7 abstractC44175kt7) throws IOException {
        mo9573O((i << 3) | 2);
        mo9545z(abstractC44175kt7);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: z */
    public final void mo9545z(AbstractC44175kt7 abstractC44175kt7) throws IOException {
        mo9573O(abstractC44175kt7.mo28217e());
        abstractC44175kt7.mo28209w(this);
    }
}
