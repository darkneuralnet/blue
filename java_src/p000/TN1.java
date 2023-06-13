package p000;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;
/* renamed from: TN1 */
/* loaded from: classes6.dex */
public final class TN1 extends QC1 {

    /* renamed from: e */
    public C1837ET f35386e;

    public TN1(AbstractC52675zE2 abstractC52675zE2) {
        super(abstractC52675zE2);
    }

    /* renamed from: i */
    public static int[][] m83717i(byte[] bArr, int i, int i2, int i3, int i4) {
        char c;
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        char c2 = 2;
        boolean z = true;
        int i8 = 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i2, i);
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 << 3;
            if (i10 > i6) {
                i10 = i6;
            }
            int i11 = i8;
            while (i11 < i) {
                int i12 = i11 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                int i13 = (i10 * i3) + i12;
                int i14 = i8;
                int i15 = i14;
                int i16 = i15;
                int i17 = 255;
                while (i14 < i5) {
                    int i18 = i16;
                    int i19 = 0;
                    while (i19 < i5) {
                        int i20 = bArr[i13 + i19] & KotlinVersion.MAX_COMPONENT_VALUE;
                        i15 += i20;
                        if (i20 < i17) {
                            i17 = i20;
                        }
                        if (i20 > i18) {
                            i18 = i20;
                        }
                        i19++;
                        i5 = 8;
                    }
                    if (i18 - i17 <= 24) {
                        i14++;
                        i13 += i3;
                        i16 = i18;
                        z = true;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 < 8) {
                            int i21 = 0;
                            for (int i22 = 8; i21 < i22; i22 = 8) {
                                i15 += bArr[i13 + i21] & KotlinVersion.MAX_COMPONENT_VALUE;
                                i21++;
                            }
                        }
                    }
                    i14++;
                    i13 += i3;
                    i16 = i18;
                    z = true;
                    i5 = 8;
                }
                boolean z2 = z;
                int i23 = i15 >> 6;
                if (i16 - i17 <= 24) {
                    i23 = i17 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int[] iArr2 = iArr[i9 - 1];
                        int i24 = i11 - 1;
                        c = 2;
                        int i25 = ((iArr2[i11] + (iArr[i9][i24] * 2)) + iArr2[i24]) / 4;
                        if (i17 < i25) {
                            i23 = i25;
                        }
                        iArr[i9][i11] = i23;
                        i11++;
                        z = z2;
                        c2 = c;
                        i5 = 8;
                        i8 = 0;
                    }
                }
                c = 2;
                iArr[i9][i11] = i23;
                i11++;
                z = z2;
                c2 = c;
                i5 = 8;
                i8 = 0;
            }
            i9++;
            i5 = 8;
            i8 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    public static void m83716j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C1837ET c1837et) {
        int i5;
        int i6;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i9 << 3;
            if (i10 > i7) {
                i5 = i7;
            } else {
                i5 = i10;
            }
            int m83715k = m83715k(i9, 2, i2 - 3);
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = i11 << 3;
                if (i12 > i8) {
                    i6 = i8;
                } else {
                    i6 = i12;
                }
                int m83715k2 = m83715k(i11, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[m83715k + i14];
                    i13 += iArr2[m83715k2 - 2] + iArr2[m83715k2 - 1] + iArr2[m83715k2] + iArr2[m83715k2 + 1] + iArr2[m83715k2 + 2];
                }
                m83714l(bArr, i6, i5, i13 / 25, i3, c1837et);
            }
        }
    }

    /* renamed from: k */
    public static int m83715k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: l */
    public static void m83714l(byte[] bArr, int i, int i2, int i3, int i4, C1837ET c1837et) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & KotlinVersion.MAX_COMPONENT_VALUE) <= i3) {
                    c1837et.m108951q(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p000.AbstractC7368SG
    /* renamed from: a */
    public AbstractC7368SG mo83719a(AbstractC52675zE2 abstractC52675zE2) {
        return new TN1(abstractC52675zE2);
    }

    @Override // p000.QC1, p000.AbstractC7368SG
    /* renamed from: b */
    public C1837ET mo83718b() throws NotFoundException {
        C1837ET c1837et = this.f35386e;
        if (c1837et != null) {
            return c1837et;
        }
        AbstractC52675zE2 m85788e = m85788e();
        int m1615d = m85788e.m1615d();
        int m1618a = m85788e.m1618a();
        if (m1615d >= 40 && m1618a >= 40) {
            byte[] mo1617b = m85788e.mo1617b();
            int i = m1615d >> 3;
            if ((m1615d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = m1618a >> 3;
            if ((m1618a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] m83717i = m83717i(mo1617b, i2, i4, m1615d, m1618a);
            C1837ET c1837et2 = new C1837ET(m1615d, m1618a);
            m83716j(mo1617b, i2, i4, m1615d, m1618a, m83717i, c1837et2);
            this.f35386e = c1837et2;
        } else {
            this.f35386e = super.mo83718b();
        }
        return this.f35386e;
    }
}
