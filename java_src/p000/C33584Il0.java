package p000;

import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
/* renamed from: Il0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33584Il0 extends AbstractC52944zh3 {

    /* renamed from: d */
    public static final char[] f16154d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f16155e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f16156f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f16157a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f16158b = new int[80];

    /* renamed from: c */
    public int f16159c = 0;

    /* renamed from: g */
    public static boolean m101739g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        Arrays.fill(this.f16158b, 0);
        m101736j(c1027ct);
        int m101737i = m101737i();
        this.f16157a.setLength(0);
        int i2 = m101737i;
        do {
            int m101735k = m101735k(i2);
            if (m101735k != -1) {
                this.f16157a.append((char) m101735k);
                i2 += 8;
                if (this.f16157a.length() > 1 && m101739g(f16156f, f16154d[m101735k])) {
                    break;
                }
            } else {
                throw NotFoundException.m45943a();
            }
        } while (i2 < this.f16159c);
        int i3 = i2 - 1;
        int i4 = this.f16158b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f16158b[i2 + i6];
        }
        if (i2 < this.f16159c && i4 < i5 / 2) {
            throw NotFoundException.m45943a();
        }
        m101734l(m101737i);
        for (int i7 = 0; i7 < this.f16157a.length(); i7++) {
            StringBuilder sb = this.f16157a;
            sb.setCharAt(i7, f16154d[sb.charAt(i7)]);
        }
        char charAt = this.f16157a.charAt(0);
        char[] cArr = f16156f;
        if (m101739g(cArr, charAt)) {
            StringBuilder sb2 = this.f16157a;
            if (m101739g(cArr, sb2.charAt(sb2.length() - 1))) {
                if (this.f16157a.length() > 3) {
                    if (map == null || !map.containsKey(EnumC47491qV0.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.f16157a;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.f16157a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < m101737i; i9++) {
                        i8 += this.f16158b[i9];
                    }
                    float f = i8;
                    while (m101737i < i3) {
                        i8 += this.f16158b[m101737i];
                        m101737i++;
                    }
                    float f2 = i;
                    return new C38511bN4(this.f16157a.toString(), null, new C40900fN4[]{new C40900fN4(f, f2), new C40900fN4(i8, f2)}, EnumC7009Qx.CODABAR);
                }
                throw NotFoundException.m45943a();
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: h */
    public final void m101738h(int i) {
        int[] iArr = this.f16158b;
        int i2 = this.f16159c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f16159c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f16158b = iArr2;
        }
    }

    /* renamed from: i */
    public final int m101737i() throws NotFoundException {
        for (int i = 1; i < this.f16159c; i += 2) {
            int m101735k = m101735k(i);
            if (m101735k != -1 && m101739g(f16156f, f16154d[m101735k])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f16158b[i3];
                }
                if (i == 1 || this.f16158b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: j */
    public final void m101736j(C1027CT c1027ct) throws NotFoundException {
        int i = 0;
        this.f16159c = 0;
        int m112214n = c1027ct.m112214n(0);
        int m112213o = c1027ct.m112213o();
        if (m112214n < m112213o) {
            boolean z = true;
            while (m112214n < m112213o) {
                if (c1027ct.m112217k(m112214n) != z) {
                    i++;
                } else {
                    m101738h(i);
                    z = !z;
                    i = 1;
                }
                m112214n++;
            }
            m101738h(i);
            return;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: k */
    public final int m101735k(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f16159c) {
            return -1;
        }
        int[] iArr = this.f16158b;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f16155e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: l */
    public final void m101734l(int i) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f16157a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f16155e[this.f16157a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f16158b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f = ((iArr[i8] / iArr2[i8]) + (i10 / i11)) / 2.0f;
            fArr2[i9] = f;
            fArr[i8] = f;
            fArr[i9] = ((i10 * 2.0f) + 1.5f) / i11;
        }
        loop3: while (true) {
            int i12 = f16155e[this.f16157a.charAt(i2)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                float f2 = this.f16158b[i + i13];
                if (f2 < fArr2[i14] || f2 > fArr[i14]) {
                    break loop3;
                }
                i12 >>= 1;
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.m45943a();
    }
}
