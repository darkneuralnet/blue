package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdh;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: A08 */
/* loaded from: classes5.dex */
public final class A08 extends AbstractC47813r18 {

    /* renamed from: d */
    public final byte[] f8d;

    /* renamed from: e */
    public final int f9e;

    /* renamed from: f */
    public int f10f;

    public A08(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f8d = bArr;
                this.f10f = 0;
                this.f9e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: C */
    public final void m116201C(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f8d, this.f10f, i2);
            this.f10f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: D */
    public final void m116200D(String str) throws IOException {
        int i = this.f10f;
        try {
            int m16656A = AbstractC47813r18.m16656A(str.length() * 3);
            int m16656A2 = AbstractC47813r18.m16656A(str.length());
            if (m16656A2 == m16656A) {
                int i2 = i + m16656A2;
                this.f10f = i2;
                int m29599d = C43623jx8.m29599d(str, this.f8d, i2, this.f9e - i2);
                this.f10f = i;
                mo16636s((m29599d - i) - m16656A2);
                this.f10f = m29599d;
                return;
            }
            mo16636s(C43623jx8.m29598e(str));
            byte[] bArr = this.f8d;
            int i3 = this.f10f;
            this.f10f = C43623jx8.m29599d(str, bArr, i3, this.f9e - i3);
        } catch (C37435Yw8 e) {
            this.f10f = i;
            m16652c(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdh(e2);
        }
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: e */
    public final int mo16650e() {
        return this.f9e - this.f10f;
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: f */
    public final void mo16649f(byte b) throws IOException {
        try {
            byte[] bArr = this.f8d;
            int i = this.f10f;
            this.f10f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), 1), e);
        }
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: g */
    public final void mo16648g(int i, boolean z) throws IOException {
        mo16636s(i << 3);
        mo16649f(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: h */
    public final void mo16647h(int i, AbstractC41604gZ7 abstractC41604gZ7) throws IOException {
        mo16636s((i << 3) | 2);
        mo16636s(abstractC41604gZ7.mo5074e());
        abstractC41604gZ7.mo15336w(this);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: i */
    public final void mo16646i(int i, int i2) throws IOException {
        mo16636s((i << 3) | 5);
        mo16645j(i2);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: j */
    public final void mo16645j(int i) throws IOException {
        try {
            byte[] bArr = this.f8d;
            int i2 = this.f10f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f10f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), 1), e);
        }
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: k */
    public final void mo16644k(int i, long j) throws IOException {
        mo16636s((i << 3) | 1);
        mo16643l(j);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: l */
    public final void mo16643l(long j) throws IOException {
        try {
            byte[] bArr = this.f8d;
            int i = this.f10f;
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
            this.f10f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), 1), e);
        }
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: m */
    public final void mo16642m(int i, int i2) throws IOException {
        mo16636s(i << 3);
        mo16641n(i2);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: n */
    public final void mo16641n(int i) throws IOException {
        if (i >= 0) {
            mo16636s(i);
        } else {
            mo16634u(i);
        }
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: o */
    public final void mo16640o(byte[] bArr, int i, int i2) throws IOException {
        m116201C(bArr, 0, i2);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: p */
    public final void mo16639p(int i, String str) throws IOException {
        mo16636s((i << 3) | 2);
        m116200D(str);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: q */
    public final void mo16638q(int i, int i2) throws IOException {
        mo16636s((i << 3) | i2);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: r */
    public final void mo16637r(int i, int i2) throws IOException {
        mo16636s(i << 3);
        mo16636s(i2);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: s */
    public final void mo16636s(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f8d;
                int i2 = this.f10f;
                this.f10f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), 1), e);
            }
        }
        byte[] bArr2 = this.f8d;
        int i3 = this.f10f;
        this.f10f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: t */
    public final void mo16635t(int i, long j) throws IOException {
        mo16636s(i << 3);
        mo16634u(j);
    }

    @Override // p000.AbstractC47813r18
    /* renamed from: u */
    public final void mo16634u(long j) throws IOException {
        boolean z;
        z = AbstractC47813r18.f106236c;
        if (z && this.f9e - this.f10f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f8d;
                int i = this.f10f;
                this.f10f = i + 1;
                C37192Xv8.m76060s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f8d;
            int i2 = this.f10f;
            this.f10f = i2 + 1;
            C37192Xv8.m76060s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f8d;
                int i3 = this.f10f;
                this.f10f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10f), Integer.valueOf(this.f9e), 1), e);
            }
        }
        byte[] bArr4 = this.f8d;
        int i4 = this.f10f;
        this.f10f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
