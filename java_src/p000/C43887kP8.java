package p000;

import com.google.android.gms.internal.measurement.zzkg;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: kP8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43887kP8 extends QP8 {

    /* renamed from: d */
    public final byte[] f94356d;

    /* renamed from: e */
    public final int f94357e;

    /* renamed from: f */
    public int f94358f;

    public C43887kP8(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f94356d = bArr;
                this.f94358f = 0;
                this.f94357e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: B */
    public final void m29012B(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f94356d, this.f94358f, i2);
            this.f94358f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: C */
    public final void m29011C(String str) throws IOException {
        int i = this.f94358f;
        try {
            int m88514y = QP8.m88514y(str.length() * 3);
            int m88514y2 = QP8.m88514y(str.length());
            if (m88514y2 == m88514y) {
                int i2 = i + m88514y2;
                this.f94358f = i2;
                int m73654b = Z89.m73654b(str, this.f94356d, i2, this.f94357e - i2);
                this.f94358f = i;
                mo28996r((m73654b - i) - m88514y2);
                this.f94358f = m73654b;
                return;
            }
            mo28996r(Z89.m73653c(str));
            byte[] bArr = this.f94356d;
            int i3 = this.f94358f;
            this.f94358f = Z89.m73654b(str, bArr, i3, this.f94357e - i3);
        } catch (S89 e) {
            this.f94358f = i;
            m88520b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(e2);
        }
    }

    @Override // p000.QP8
    /* renamed from: d */
    public final int mo29010d() {
        return this.f94357e - this.f94358f;
    }

    @Override // p000.QP8
    /* renamed from: e */
    public final void mo29009e(byte b) throws IOException {
        try {
            byte[] bArr = this.f94356d;
            int i = this.f94358f;
            this.f94358f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), 1), e);
        }
    }

    @Override // p000.QP8
    /* renamed from: f */
    public final void mo29008f(int i, boolean z) throws IOException {
        mo28996r(i << 3);
        mo29009e(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.QP8
    /* renamed from: g */
    public final void mo29007g(int i, AbstractC40913fO8 abstractC40913fO8) throws IOException {
        mo28996r((i << 3) | 2);
        mo28996r(abstractC40913fO8.mo41437c());
        abstractC40913fO8.mo41433j(this);
    }

    @Override // p000.QP8
    /* renamed from: h */
    public final void mo29006h(int i, int i2) throws IOException {
        mo28996r((i << 3) | 5);
        mo29005i(i2);
    }

    @Override // p000.QP8
    /* renamed from: i */
    public final void mo29005i(int i) throws IOException {
        try {
            byte[] bArr = this.f94356d;
            int i2 = this.f94358f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f94358f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), 1), e);
        }
    }

    @Override // p000.QP8
    /* renamed from: j */
    public final void mo29004j(int i, long j) throws IOException {
        mo28996r((i << 3) | 1);
        mo29003k(j);
    }

    @Override // p000.QP8
    /* renamed from: k */
    public final void mo29003k(long j) throws IOException {
        try {
            byte[] bArr = this.f94356d;
            int i = this.f94358f;
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
            this.f94358f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), 1), e);
        }
    }

    @Override // p000.QP8
    /* renamed from: l */
    public final void mo29002l(int i, int i2) throws IOException {
        mo28996r(i << 3);
        mo29001m(i2);
    }

    @Override // p000.QP8
    /* renamed from: m */
    public final void mo29001m(int i) throws IOException {
        if (i >= 0) {
            mo28996r(i);
        } else {
            mo28994t(i);
        }
    }

    @Override // p000.QP8
    /* renamed from: n */
    public final void mo29000n(byte[] bArr, int i, int i2) throws IOException {
        m29012B(bArr, 0, i2);
    }

    @Override // p000.QP8
    /* renamed from: o */
    public final void mo28999o(int i, String str) throws IOException {
        mo28996r((i << 3) | 2);
        m29011C(str);
    }

    @Override // p000.QP8
    /* renamed from: p */
    public final void mo28998p(int i, int i2) throws IOException {
        mo28996r((i << 3) | i2);
    }

    @Override // p000.QP8
    /* renamed from: q */
    public final void mo28997q(int i, int i2) throws IOException {
        mo28996r(i << 3);
        mo28996r(i2);
    }

    @Override // p000.QP8
    /* renamed from: r */
    public final void mo28996r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f94356d;
                int i2 = this.f94358f;
                this.f94358f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), 1), e);
            }
        }
        byte[] bArr2 = this.f94356d;
        int i3 = this.f94358f;
        this.f94358f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // p000.QP8
    /* renamed from: s */
    public final void mo28995s(int i, long j) throws IOException {
        mo28996r(i << 3);
        mo28994t(j);
    }

    @Override // p000.QP8
    /* renamed from: t */
    public final void mo28994t(long j) throws IOException {
        boolean z;
        z = QP8.f30336c;
        if (z && this.f94357e - this.f94358f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f94356d;
                int i = this.f94358f;
                this.f94358f = i + 1;
                C44919m89.m26260s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f94356d;
            int i2 = this.f94358f;
            this.f94358f = i2 + 1;
            C44919m89.m26260s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f94356d;
                int i3 = this.f94358f;
                this.f94358f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f94358f), Integer.valueOf(this.f94357e), 1), e);
            }
        }
        byte[] bArr4 = this.f94356d;
        int i4 = this.f94358f;
        this.f94358f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
