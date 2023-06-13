package p000;

import com.google.android.gms.internal.recaptcha.zzqh;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: Xi9 */
/* loaded from: classes6.dex */
public final class Xi9 extends AbstractC48228rj9 {

    /* renamed from: d */
    public final byte[] f43723d;

    /* renamed from: e */
    public final int f43724e;

    /* renamed from: f */
    public int f43725f;

    public Xi9(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f43723d = bArr;
                this.f43725f = 0;
                this.f43724e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: A */
    public final void mo15532A(int i) throws IOException {
        try {
            byte[] bArr = this.f43723d;
            int i2 = this.f43725f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f43725f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), 1), e);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: B */
    public final void mo15531B(int i, long j) throws IOException {
        mo15521L((i << 3) | 1);
        mo15530C(j);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: C */
    public final void mo15530C(long j) throws IOException {
        try {
            byte[] bArr = this.f43723d;
            int i = this.f43725f;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f43725f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), 1), e);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: D */
    public final void mo15529D(int i, int i2) throws IOException {
        mo15521L(i << 3);
        mo15528E(i2);
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
        int i = this.f43725f;
        try {
            int m15506l = AbstractC48228rj9.m15506l(str.length() * 3);
            int m15506l2 = AbstractC48228rj9.m15506l(str.length());
            if (m15506l2 == m15506l) {
                int i2 = i + m15506l2;
                this.f43725f = i2;
                int m89659b = Ps9.m89659b(str, this.f43723d, i2, this.f43724e - i2);
                this.f43725f = i;
                mo15521L((m89659b - i) - m15506l2);
                this.f43725f = m89659b;
                return;
            }
            mo15521L(Ps9.m89658c(str));
            byte[] bArr = this.f43723d;
            int i3 = this.f43725f;
            this.f43725f = Ps9.m89659b(str, bArr, i3, this.f43724e - i3);
        } catch (Ns9 e) {
            this.f43725f = i;
            m15501q(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzqh(e2);
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
        mo15521L(i << 3);
        mo15521L(i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: L */
    public final void mo15521L(int i) throws IOException {
        boolean z;
        z = AbstractC48228rj9.f107543c;
        if (z) {
            int i2 = C48780sf9.f109092a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f43723d;
                int i3 = this.f43725f;
                this.f43725f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), 1), e);
            }
        }
        byte[] bArr2 = this.f43723d;
        int i4 = this.f43725f;
        this.f43725f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: M */
    public final void mo15520M(int i, long j) throws IOException {
        mo15521L(i << 3);
        mo15519N(j);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: N */
    public final void mo15519N(long j) throws IOException {
        boolean z;
        z = AbstractC48228rj9.f107543c;
        if (z && this.f43724e - this.f43725f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f43723d;
                int i = this.f43725f;
                this.f43725f = i + 1;
                Fs9.m106337s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f43723d;
            int i2 = this.f43725f;
            this.f43725f = i2 + 1;
            Fs9.m106337s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f43723d;
                int i3 = this.f43725f;
                this.f43725f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), 1), e);
            }
        }
        byte[] bArr4 = this.f43723d;
        int i4 = this.f43725f;
        this.f43725f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    /* renamed from: P */
    public final void m76537P(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f43723d, this.f43725f, i2);
            this.f43725f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.AbstractC48228rj9, p000.If9
    /* renamed from: a */
    public final void mo15517a(byte[] bArr, int i, int i2) throws IOException {
        m76537P(bArr, 0, i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: s */
    public final void mo15499s() {
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: t */
    public final void mo15498t(byte b) throws IOException {
        try {
            byte[] bArr = this.f43723d;
            int i = this.f43725f;
            this.f43725f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f43725f), Integer.valueOf(this.f43724e), 1), e);
        }
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: u */
    public final void mo15497u(int i, boolean z) throws IOException {
        mo15521L(i << 3);
        mo15498t(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: v */
    public final void mo15496v(byte[] bArr, int i, int i2) throws IOException {
        mo15521L(i2);
        m76537P(bArr, 0, i2);
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: w */
    public final int mo15495w() {
        return this.f43724e - this.f43725f;
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
        mo15521L((i << 3) | 5);
        mo15532A(i2);
    }
}
