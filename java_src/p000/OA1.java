package p000;

import java.lang.reflect.Array;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: OA1 */
/* loaded from: classes8.dex */
public class OA1 extends AbstractC43863kN2 {

    /* renamed from: c */
    public int[][] f26084c;

    /* renamed from: d */
    public int f26085d;

    public OA1(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f94301b = i;
        this.f94300a = iArr.length;
        this.f26085d = iArr2.length;
        int i2 = i & 31;
        int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
        for (int i4 = 0; i4 < this.f94300a; i4++) {
            int[] iArr3 = iArr[i4];
            int i5 = this.f26085d - 1;
            iArr3[i5] = iArr3[i5] & i3;
        }
        this.f26084c = iArr;
    }

    /* renamed from: c */
    public byte[] m92687c() {
        int i = this.f94300a;
        int i2 = 8;
        byte[] bArr = new byte[(((this.f94301b + 7) >>> 3) * i) + 8];
        C35053Os2.m91272a(i, bArr, 0);
        C35053Os2.m91272a(this.f94301b, bArr, 4);
        int i3 = this.f94301b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.f94300a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                C35053Os2.m91272a(this.f26084c[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.f26084c[i6][i4] >>> i8) & KotlinVersion.MAX_COMPONENT_VALUE);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OA1) {
            OA1 oa1 = (OA1) obj;
            if (this.f94300a == oa1.f94300a && this.f94301b == oa1.f94301b && this.f26085d == oa1.f26085d) {
                for (int i = 0; i < this.f94300a; i++) {
                    if (!K52.m99250b(this.f26084c[i], oa1.f26084c[i])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.f94300a * 31) + this.f94301b) * 31) + this.f26085d;
        for (int i2 = 0; i2 < this.f94300a; i2++) {
            i = (i * 31) + C0210Ao.m115241n(this.f26084c[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.f94301b & 31;
        int i2 = this.f26085d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f94300a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f26084c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f26084c[i3][this.f26085d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public OA1(OA1 oa1) {
        this.f94301b = oa1.m29036a();
        this.f94300a = oa1.m29035b();
        this.f26085d = oa1.f26085d;
        this.f26084c = new int[oa1.f26084c.length];
        int i = 0;
        while (true) {
            int[][] iArr = this.f26084c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = K52.m99251a(oa1.f26084c[i]);
            i++;
        }
    }

    public OA1(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f94300a = C35053Os2.m91268e(bArr, 0);
        int m91268e = C35053Os2.m91268e(bArr, 4);
        this.f94301b = m91268e;
        int i = this.f94300a;
        int i2 = ((m91268e + 7) >>> 3) * i;
        if (i > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                int i4 = (m91268e + 31) >>> 5;
                this.f26085d = i4;
                this.f26084c = (int[][]) Array.newInstance(Integer.TYPE, i, i4);
                int i5 = this.f94301b;
                int i6 = i5 >> 5;
                int i7 = i5 & 31;
                for (int i8 = 0; i8 < this.f94300a; i8++) {
                    int i9 = 0;
                    while (i9 < i6) {
                        this.f26084c[i8][i9] = C35053Os2.m91268e(bArr, i3);
                        i9++;
                        i3 += 4;
                    }
                    int i10 = 0;
                    while (i10 < i7) {
                        int[] iArr = this.f26084c[i8];
                        iArr[i6] = ((bArr[i3] & UByte.MAX_VALUE) << i10) ^ iArr[i6];
                        i10 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
