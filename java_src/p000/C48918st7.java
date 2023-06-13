package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzapn;
import java.io.IOException;
import kotlin.KotlinVersion;
/* renamed from: st7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48918st7 extends AbstractC50104ut7 {

    /* renamed from: d */
    public final byte[] f109459d;

    /* renamed from: e */
    public final int f109460e;

    /* renamed from: f */
    public int f109461f;

    public C48918st7(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f109459d = bArr;
                this.f109461f = 0;
                this.f109460e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: A */
    public final void mo9587A(int i, int i2) throws IOException {
        mo9573O((i << 3) | 5);
        mo9586B(i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: B */
    public final void mo9586B(int i) throws IOException {
        try {
            byte[] bArr = this.f109459d;
            int i2 = this.f109461f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f109461f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), 1), e);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: C */
    public final void mo9585C(int i, long j) throws IOException {
        mo9573O((i << 3) | 1);
        mo9584D(j);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: D */
    public final void mo9584D(long j) throws IOException {
        try {
            byte[] bArr = this.f109459d;
            int i = this.f109461f;
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
            this.f109461f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), 1), e);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: E */
    public final void mo9583E(int i, int i2) throws IOException {
        mo9573O(i << 3);
        mo9582F(i2);
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
        int i = this.f109461f;
        try {
            int m9558m = AbstractC50104ut7.m9558m(str.length() * 3);
            int m9558m2 = AbstractC50104ut7.m9558m(str.length());
            if (m9558m2 == m9558m) {
                int i2 = i + m9558m2;
                this.f109461f = i2;
                int m103211d = C33456Hw7.m103211d(str, this.f109459d, i2, this.f109460e - i2);
                this.f109461f = i;
                mo9573O((m103211d - i) - m9558m2);
                this.f109461f = m103211d;
                return;
            }
            mo9573O(C33456Hw7.m103210e(str));
            byte[] bArr = this.f109459d;
            int i3 = this.f109461f;
            this.f109461f = C33456Hw7.m103211d(str, bArr, i3, this.f109460e - i3);
        } catch (C33222Gw7 e) {
            this.f109461f = i;
            m9553r(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzapn(e2);
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
        mo9573O(i << 3);
        mo9573O(i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: O */
    public final void mo9573O(int i) throws IOException {
        boolean z;
        z = AbstractC50104ut7.f113169c;
        if (z) {
            int i2 = C32016Bs7.f2988a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f109459d;
                int i3 = this.f109461f;
                this.f109461f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), 1), e);
            }
        }
        byte[] bArr2 = this.f109459d;
        int i4 = this.f109461f;
        this.f109461f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: P */
    public final void mo9572P(int i, long j) throws IOException {
        mo9573O(i << 3);
        mo9571Q(j);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: Q */
    public final void mo9571Q(long j) throws IOException {
        boolean z;
        z = AbstractC50104ut7.f113169c;
        if (z && this.f109460e - this.f109461f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f109459d;
                int i = this.f109461f;
                this.f109461f = i + 1;
                C32286Cw7.m111234s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f109459d;
            int i2 = this.f109461f;
            this.f109461f = i2 + 1;
            C32286Cw7.m111234s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f109459d;
                int i3 = this.f109461f;
                this.f109461f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), 1), e);
            }
        }
        byte[] bArr4 = this.f109459d;
        int i4 = this.f109461f;
        this.f109461f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    /* renamed from: R */
    public final void m13547R(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f109459d, this.f109461f, i2);
            this.f109461f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.AbstractC50104ut7, p000.AbstractC33654Is7
    /* renamed from: a */
    public final void mo9570a(byte[] bArr, int i, int i2) throws IOException {
        m13547R(bArr, i, i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: t */
    public final void mo9551t() {
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: u */
    public final void mo9550u(byte b) throws IOException {
        try {
            byte[] bArr = this.f109459d;
            int i = this.f109461f;
            this.f109461f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzapn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f109461f), Integer.valueOf(this.f109460e), 1), e);
        }
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: v */
    public final void mo9549v(int i, boolean z) throws IOException {
        mo9573O(i << 3);
        mo9550u(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: w */
    public final void mo9548w(byte[] bArr, int i, int i2) throws IOException {
        mo9573O(i2);
        m13547R(bArr, 0, i2);
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: x */
    public final int mo9547x() {
        return this.f109460e - this.f109461f;
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
