package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import okhttp3.internal.p056ws.WebSocketProtocol;
/* renamed from: CT */
/* loaded from: classes6.dex */
public final class C1027CT implements Cloneable {

    /* renamed from: b */
    public int[] f4100b;

    /* renamed from: c */
    public int f4101c;

    public C1027CT() {
        this.f4101c = 0;
        this.f4100b = new int[1];
    }

    /* renamed from: r */
    public static int[] m112210r(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: A */
    public void m112224A(C1027CT c1027ct) {
        if (this.f4101c == c1027ct.f4101c) {
            int i = 0;
            while (true) {
                int[] iArr = this.f4100b;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ c1027ct.f4100b[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: d */
    public void m112223d(boolean z) {
        m112218j(this.f4101c + 1);
        if (z) {
            int[] iArr = this.f4100b;
            int i = this.f4101c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f4101c++;
    }

    /* renamed from: e */
    public void m112222e(C1027CT c1027ct) {
        int i = c1027ct.f4101c;
        m112218j(this.f4101c + i);
        for (int i2 = 0; i2 < i; i2++) {
            m112223d(c1027ct.m112217k(i2));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1027CT)) {
            return false;
        }
        C1027CT c1027ct = (C1027CT) obj;
        if (this.f4101c != c1027ct.f4101c || !Arrays.equals(this.f4100b, c1027ct.f4100b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m112221f(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            m112218j(this.f4101c + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                m112223d(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: g */
    public void m112220g() {
        int length = this.f4100b.length;
        for (int i = 0; i < length; i++) {
            this.f4100b[i] = 0;
        }
    }

    /* renamed from: h */
    public C1027CT clone() {
        return new C1027CT((int[]) this.f4100b.clone(), this.f4101c);
    }

    public int hashCode() {
        return (this.f4101c * 31) + Arrays.hashCode(this.f4100b);
    }

    /* renamed from: j */
    public final void m112218j(int i) {
        if (i > (this.f4100b.length << 5)) {
            int[] m112210r = m112210r(i);
            int[] iArr = this.f4100b;
            System.arraycopy(iArr, 0, m112210r, 0, iArr.length);
            this.f4100b = m112210r;
        }
    }

    /* renamed from: k */
    public boolean m112217k(int i) {
        return ((1 << (i & 31)) & this.f4100b[i / 32]) != 0;
    }

    /* renamed from: l */
    public int[] m112216l() {
        return this.f4100b;
    }

    /* renamed from: m */
    public int m112215m(int i) {
        int i2 = this.f4101c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f4100b[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f4100b;
            if (i3 == iArr.length) {
                return this.f4101c;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f4101c;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: n */
    public int m112214n(int i) {
        int i2 = this.f4101c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f4100b[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f4100b;
            if (i3 == iArr.length) {
                return this.f4101c;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f4101c;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: o */
    public int m112213o() {
        return this.f4101c;
    }

    /* renamed from: p */
    public int m112212p() {
        return (this.f4101c + 7) / 8;
    }

    /* renamed from: q */
    public boolean m112211q(int i, int i2, boolean z) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.f4101c) {
            if (i2 == i) {
                return true;
            }
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.f4100b[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: t */
    public void m112209t() {
        int[] iArr = new int[this.f4100b.length];
        int i = (this.f4101c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f4100b[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.f4101c;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f4100b = iArr;
    }

    public String toString() {
        char c;
        int i = this.f4101c;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f4101c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (m112217k(i2)) {
                c = 'X';
            } else {
                c = CoreConstants.DOT;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: w */
    public void m112208w(int i) {
        int[] iArr = this.f4100b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: y */
    public void m112207y(int i, int i2) {
        this.f4100b[i / 32] = i2;
    }

    /* renamed from: z */
    public void m112206z(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (m112217k(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public C1027CT(int i) {
        this.f4101c = i;
        this.f4100b = m112210r(i);
    }

    public C1027CT(int[] iArr, int i) {
        this.f4100b = iArr;
        this.f4101c = i;
    }
}
