package p000;

import kotlin.KotlinVersion;
/* renamed from: Qi9 */
/* loaded from: classes6.dex */
public abstract class Qi9 extends AbstractC48228rj9 {

    /* renamed from: d */
    public final byte[] f30787d;

    /* renamed from: e */
    public final int f30788e;

    /* renamed from: f */
    public int f30789f;

    /* renamed from: g */
    public int f30790g;

    public Qi9(int i) {
        super(null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f30787d = bArr;
            this.f30788e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* renamed from: P */
    public final void m88153P(byte b) {
        byte[] bArr = this.f30787d;
        int i = this.f30789f;
        this.f30789f = i + 1;
        bArr[i] = b;
        this.f30790g++;
    }

    /* renamed from: Q */
    public final void m88152Q(int i) {
        byte[] bArr = this.f30787d;
        int i2 = this.f30789f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30789f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30790g += 4;
    }

    /* renamed from: R */
    public final void m88151R(long j) {
        byte[] bArr = this.f30787d;
        int i = this.f30789f;
        int i2 = i + 1;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30789f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f30790g += 8;
    }

    /* renamed from: S */
    public final void m88150S(int i) {
        boolean z;
        z = AbstractC48228rj9.f107543c;
        if (z) {
            long j = this.f30789f;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f30787d;
                int i2 = this.f30789f;
                this.f30789f = i2 + 1;
                Fs9.m106337s(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f30787d;
            int i3 = this.f30789f;
            this.f30789f = i3 + 1;
            Fs9.m106337s(bArr2, i3, (byte) i);
            this.f30790g += (int) (this.f30789f - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f30787d;
            int i4 = this.f30789f;
            this.f30789f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f30790g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f30787d;
        int i5 = this.f30789f;
        this.f30789f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f30790g++;
    }

    /* renamed from: T */
    public final void m88149T(long j) {
        boolean z;
        z = AbstractC48228rj9.f107543c;
        if (z) {
            long j2 = this.f30789f;
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f30787d;
                int i = this.f30789f;
                this.f30789f = i + 1;
                Fs9.m106337s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f30787d;
            int i2 = this.f30789f;
            this.f30789f = i2 + 1;
            Fs9.m106337s(bArr2, i2, (byte) j);
            this.f30790g += (int) (this.f30789f - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f30787d;
            int i3 = this.f30789f;
            this.f30789f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f30790g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f30787d;
        int i4 = this.f30789f;
        this.f30789f = i4 + 1;
        bArr4[i4] = (byte) j;
        this.f30790g++;
    }

    @Override // p000.AbstractC48228rj9
    /* renamed from: w */
    public final int mo15495w() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
