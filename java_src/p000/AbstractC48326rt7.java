package p000;

import kotlin.KotlinVersion;
/* renamed from: rt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC48326rt7 extends AbstractC50104ut7 {

    /* renamed from: d */
    public final byte[] f107852d;

    /* renamed from: e */
    public final int f107853e;

    /* renamed from: f */
    public int f107854f;

    /* renamed from: g */
    public int f107855g;

    public AbstractC48326rt7(int i) {
        super(null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f107852d = bArr;
            this.f107853e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* renamed from: R */
    public final void m15113R(byte b) {
        byte[] bArr = this.f107852d;
        int i = this.f107854f;
        this.f107854f = i + 1;
        bArr[i] = b;
        this.f107855g++;
    }

    /* renamed from: S */
    public final void m15112S(int i) {
        byte[] bArr = this.f107852d;
        int i2 = this.f107854f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f107854f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f107855g += 4;
    }

    /* renamed from: T */
    public final void m15111T(long j) {
        byte[] bArr = this.f107852d;
        int i = this.f107854f;
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
        this.f107854f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f107855g += 8;
    }

    /* renamed from: U */
    public final void m15110U(int i) {
        boolean z;
        z = AbstractC50104ut7.f113169c;
        if (z) {
            long j = this.f107854f;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f107852d;
                int i2 = this.f107854f;
                this.f107854f = i2 + 1;
                C32286Cw7.m111234s(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f107852d;
            int i3 = this.f107854f;
            this.f107854f = i3 + 1;
            C32286Cw7.m111234s(bArr2, i3, (byte) i);
            this.f107855g += (int) (this.f107854f - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f107852d;
            int i4 = this.f107854f;
            this.f107854f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f107855g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f107852d;
        int i5 = this.f107854f;
        this.f107854f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f107855g++;
    }

    /* renamed from: V */
    public final void m15109V(long j) {
        boolean z;
        z = AbstractC50104ut7.f113169c;
        if (z) {
            long j2 = this.f107854f;
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f107852d;
                int i = this.f107854f;
                this.f107854f = i + 1;
                C32286Cw7.m111234s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f107852d;
            int i2 = this.f107854f;
            this.f107854f = i2 + 1;
            C32286Cw7.m111234s(bArr2, i2, (byte) j);
            this.f107855g += (int) (this.f107854f - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f107852d;
            int i3 = this.f107854f;
            this.f107854f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f107855g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f107852d;
        int i4 = this.f107854f;
        this.f107854f = i4 + 1;
        bArr4[i4] = (byte) j;
        this.f107855g++;
    }

    @Override // p000.AbstractC50104ut7
    /* renamed from: x */
    public final int mo9547x() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
