package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtn;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: Ha7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33258Ha7 extends AbstractC33726Ja7 {

    /* renamed from: d */
    public final byte[] f13582d;

    /* renamed from: e */
    public final int f13583e;

    /* renamed from: f */
    public int f13584f;

    public C33258Ha7(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f13582d = bArr;
                this.f13584f = 0;
                this.f13583e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: F */
    public final void m103695F(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f13582d, this.f13584f, i2);
            this.f13584f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: g */
    public final int mo100160g() {
        return this.f13583e - this.f13584f;
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: h */
    public final void mo100159h(byte b) throws IOException {
        try {
            byte[] bArr = this.f13582d;
            int i = this.f13584f;
            this.f13584f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), 1), e);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: i */
    public final void mo100158i(int i, boolean z) throws IOException {
        mo100143x(i << 3);
        mo100159h(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: j */
    public final void mo100157j(int i, AbstractC32088Ca7 abstractC32088Ca7) throws IOException {
        mo100143x((i << 3) | 2);
        mo100156k(abstractC32088Ca7);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: k */
    public final void mo100156k(AbstractC32088Ca7 abstractC32088Ca7) throws IOException {
        mo100143x(abstractC32088Ca7.mo1072c());
        abstractC32088Ca7.mo1068j(this);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: l */
    public final void mo100155l(int i, int i2) throws IOException {
        mo100143x((i << 3) | 5);
        mo100154m(i2);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: m */
    public final void mo100154m(int i) throws IOException {
        try {
            byte[] bArr = this.f13582d;
            int i2 = this.f13584f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f13584f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), 1), e);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: n */
    public final void mo100153n(int i, long j) throws IOException {
        mo100143x((i << 3) | 1);
        mo100152o(j);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: o */
    public final void mo100152o(long j) throws IOException {
        try {
            byte[] bArr = this.f13582d;
            int i = this.f13584f;
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
            this.f13584f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), 1), e);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: p */
    public final void mo100151p(int i, int i2) throws IOException {
        mo100143x(i << 3);
        mo100150q(i2);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: q */
    public final void mo100150q(int i) throws IOException {
        if (i >= 0) {
            mo100143x(i);
        } else {
            mo100141z(i);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: r */
    public final void mo100149r(byte[] bArr, int i, int i2) throws IOException {
        m103695F(bArr, 0, i2);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: s */
    public final void mo100148s(InterfaceC36075Tb7 interfaceC36075Tb7) throws IOException {
        mo100143x(interfaceC36075Tb7.mo41143d());
        interfaceC36075Tb7.mo41137j(this);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: t */
    public final void mo100147t(int i, String str) throws IOException {
        mo100143x((i << 3) | 2);
        mo100146u(str);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: u */
    public final void mo100146u(String str) throws IOException {
        int i = this.f13584f;
        try {
            int m100166a = AbstractC33726Ja7.m100166a(str.length() * 3);
            int m100166a2 = AbstractC33726Ja7.m100166a(str.length());
            if (m100166a2 == m100166a) {
                int i2 = i + m100166a2;
                this.f13584f = i2;
                int m88317b = C35382Qc7.m88317b(str, this.f13582d, i2, this.f13583e - i2);
                this.f13584f = i;
                mo100143x((m88317b - i) - m100166a2);
                this.f13584f = m88317b;
                return;
            }
            mo100143x(C35382Qc7.m88316c(str));
            byte[] bArr = this.f13582d;
            int i3 = this.f13584f;
            this.f13584f = C35382Qc7.m88317b(str, bArr, i3, this.f13583e - i3);
        } catch (C35148Pc7 e) {
            this.f13584f = i;
            m100162e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zbtn(e2);
        }
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: v */
    public final void mo100145v(int i, int i2) throws IOException {
        mo100143x((i << 3) | i2);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: w */
    public final void mo100144w(int i, int i2) throws IOException {
        mo100143x(i << 3);
        mo100143x(i2);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: x */
    public final void mo100143x(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f13582d;
                int i2 = this.f13584f;
                this.f13584f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), 1), e);
            }
        }
        byte[] bArr2 = this.f13582d;
        int i3 = this.f13584f;
        this.f13584f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: y */
    public final void mo100142y(int i, long j) throws IOException {
        mo100143x(i << 3);
        mo100141z(j);
    }

    @Override // p000.AbstractC33726Ja7
    /* renamed from: z */
    public final void mo100141z(long j) throws IOException {
        boolean z;
        z = AbstractC33726Ja7.f17884c;
        if (z && this.f13583e - this.f13584f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f13582d;
                int i = this.f13584f;
                this.f13584f = i + 1;
                C34212Lc7.m96559s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f13582d;
            int i2 = this.f13584f;
            this.f13584f = i2 + 1;
            C34212Lc7.m96559s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f13582d;
                int i3 = this.f13584f;
                this.f13584f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zbtn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13584f), Integer.valueOf(this.f13583e), 1), e);
            }
        }
        byte[] bArr4 = this.f13582d;
        int i4 = this.f13584f;
        this.f13584f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
