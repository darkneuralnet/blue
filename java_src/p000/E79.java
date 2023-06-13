package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zznr;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: E79 */
/* loaded from: classes5.dex */
public final class E79 extends Z79 {

    /* renamed from: d */
    public final byte[] f6995d;

    /* renamed from: e */
    public final int f6996e;

    /* renamed from: f */
    public int f6997f;

    public E79(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f6995d = bArr;
                this.f6997f = 0;
                this.f6996e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: H */
    public final void m109363H(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f6995d, this.f6997f, i2);
            this.f6997f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: I */
    public final void m109362I(String str) throws IOException {
        int i = this.f6997f;
        try {
            int m73702d = Z79.m73702d(str.length() * 3);
            int m73702d2 = Z79.m73702d(str.length());
            if (m73702d2 == m73702d) {
                int i2 = i + m73702d2;
                this.f6997f = i2;
                int m72530b = Zm9.m72530b(str, this.f6995d, i2, this.f6996e - i2);
                this.f6997f = i;
                mo73682x((m72530b - i) - m73702d2);
                this.f6997f = m72530b;
                return;
            }
            mo73682x(Zm9.m72529c(str));
            byte[] bArr = this.f6995d;
            int i3 = this.f6997f;
            this.f6997f = Zm9.m72530b(str, bArr, i3, this.f6996e - i3);
        } catch (Tm9 e) {
            this.f6997f = i;
            m73698h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zznr(e2);
        }
    }

    @Override // p000.Z79
    /* renamed from: j */
    public final int mo73696j() {
        return this.f6996e - this.f6997f;
    }

    @Override // p000.Z79
    /* renamed from: k */
    public final void mo73695k(byte b) throws IOException {
        try {
            byte[] bArr = this.f6995d;
            int i = this.f6997f;
            this.f6997f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), 1), e);
        }
    }

    @Override // p000.Z79
    /* renamed from: l */
    public final void mo73694l(int i, boolean z) throws IOException {
        mo73682x(i << 3);
        mo73695k(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.Z79
    /* renamed from: m */
    public final void mo73693m(int i, T69 t69) throws IOException {
        mo73682x((i << 3) | 2);
        mo73682x(t69.mo7402c());
        t69.mo7398j(this);
    }

    @Override // p000.Z79
    /* renamed from: n */
    public final void mo73692n(int i, int i2) throws IOException {
        mo73682x((i << 3) | 5);
        mo73691o(i2);
    }

    @Override // p000.Z79
    /* renamed from: o */
    public final void mo73691o(int i) throws IOException {
        try {
            byte[] bArr = this.f6995d;
            int i2 = this.f6997f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f6997f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), 1), e);
        }
    }

    @Override // p000.Z79
    /* renamed from: p */
    public final void mo73690p(int i, long j) throws IOException {
        mo73682x((i << 3) | 1);
        mo73689q(j);
    }

    @Override // p000.Z79
    /* renamed from: q */
    public final void mo73689q(long j) throws IOException {
        try {
            byte[] bArr = this.f6995d;
            int i = this.f6997f;
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
            this.f6997f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), 1), e);
        }
    }

    @Override // p000.Z79
    /* renamed from: r */
    public final void mo73688r(int i, int i2) throws IOException {
        mo73682x(i << 3);
        mo73687s(i2);
    }

    @Override // p000.Z79
    /* renamed from: s */
    public final void mo73687s(int i) throws IOException {
        if (i >= 0) {
            mo73682x(i);
        } else {
            mo73680z(i);
        }
    }

    @Override // p000.Z79
    /* renamed from: t */
    public final void mo73686t(byte[] bArr, int i, int i2) throws IOException {
        m109363H(bArr, 0, i2);
    }

    @Override // p000.Z79
    /* renamed from: u */
    public final void mo73685u(int i, String str) throws IOException {
        mo73682x((i << 3) | 2);
        m109362I(str);
    }

    @Override // p000.Z79
    /* renamed from: v */
    public final void mo73684v(int i, int i2) throws IOException {
        mo73682x((i << 3) | i2);
    }

    @Override // p000.Z79
    /* renamed from: w */
    public final void mo73683w(int i, int i2) throws IOException {
        mo73682x(i << 3);
        mo73682x(i2);
    }

    @Override // p000.Z79
    /* renamed from: x */
    public final void mo73682x(int i) throws IOException {
        boolean z;
        z = Z79.f47866c;
        if (z) {
            int i2 = C38339b49.f56884a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f6995d;
                int i3 = this.f6997f;
                this.f6997f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), 1), e);
            }
        }
        byte[] bArr2 = this.f6995d;
        int i4 = this.f6997f;
        this.f6997f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // p000.Z79
    /* renamed from: y */
    public final void mo73681y(int i, long j) throws IOException {
        mo73682x(i << 3);
        mo73680z(j);
    }

    @Override // p000.Z79
    /* renamed from: z */
    public final void mo73680z(long j) throws IOException {
        boolean z;
        z = Z79.f47866c;
        if (z && this.f6996e - this.f6997f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f6995d;
                int i = this.f6997f;
                this.f6997f = i + 1;
                C51221wm9.m6348s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f6995d;
            int i2 = this.f6997f;
            this.f6997f = i2 + 1;
            C51221wm9.m6348s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f6995d;
                int i3 = this.f6997f;
                this.f6997f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zznr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6997f), Integer.valueOf(this.f6996e), 1), e);
            }
        }
        byte[] bArr4 = this.f6995d;
        int i4 = this.f6997f;
        this.f6997f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
