package p000;

import java.util.Arrays;
/* renamed from: ET */
/* loaded from: classes6.dex */
public final class C1837ET implements Cloneable {

    /* renamed from: b */
    public final int f7513b;

    /* renamed from: c */
    public final int f7514c;

    /* renamed from: d */
    public final int f7515d;

    /* renamed from: e */
    public final int[] f7516e;

    public C1837ET(int i) {
        this(i, i);
    }

    /* renamed from: d */
    public final String m108963d(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.f7514c * (this.f7513b + 1));
        for (int i = 0; i < this.f7514c; i++) {
            for (int i2 = 0; i2 < this.f7513b; i2++) {
                if (m108959h(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public void m108962e() {
        int length = this.f7516e.length;
        for (int i = 0; i < length; i++) {
            this.f7516e[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1837ET)) {
            return false;
        }
        C1837ET c1837et = (C1837ET) obj;
        if (this.f7513b != c1837et.f7513b || this.f7514c != c1837et.f7514c || this.f7515d != c1837et.f7515d || !Arrays.equals(this.f7516e, c1837et.f7516e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C1837ET clone() {
        return new C1837ET(this.f7513b, this.f7514c, this.f7515d, (int[]) this.f7516e.clone());
    }

    /* renamed from: g */
    public void m108960g(int i, int i2) {
        int i3 = (i2 * this.f7515d) + (i / 32);
        int[] iArr = this.f7516e;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: h */
    public boolean m108959h(int i, int i2) {
        if (((this.f7516e[(i2 * this.f7515d) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f7513b;
        return (((((((i * 31) + i) * 31) + this.f7514c) * 31) + this.f7515d) * 31) + Arrays.hashCode(this.f7516e);
    }

    /* renamed from: j */
    public int[] m108958j() {
        int length = this.f7516e.length - 1;
        while (length >= 0 && this.f7516e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f7515d;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f7516e[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: k */
    public int[] m108957k() {
        int i = this.f7513b;
        int i2 = this.f7514c;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f7514c; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f7515d;
                if (i6 < i7) {
                    int i8 = this.f7516e[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: l */
    public int m108956l() {
        return this.f7514c;
    }

    /* renamed from: m */
    public C1027CT m108955m(int i, C1027CT c1027ct) {
        if (c1027ct != null && c1027ct.m112213o() >= this.f7513b) {
            c1027ct.m112220g();
        } else {
            c1027ct = new C1027CT(this.f7513b);
        }
        int i2 = i * this.f7515d;
        for (int i3 = 0; i3 < this.f7515d; i3++) {
            c1027ct.m112207y(i3 << 5, this.f7516e[i2 + i3]);
        }
        return c1027ct;
    }

    /* renamed from: n */
    public int[] m108954n() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f7516e;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f7515d;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: o */
    public int m108953o() {
        return this.f7513b;
    }

    /* renamed from: p */
    public void m108952p() {
        int m108953o = m108953o();
        int m108956l = m108956l();
        C1027CT c1027ct = new C1027CT(m108953o);
        C1027CT c1027ct2 = new C1027CT(m108953o);
        for (int i = 0; i < (m108956l + 1) / 2; i++) {
            c1027ct = m108955m(i, c1027ct);
            int i2 = (m108956l - 1) - i;
            c1027ct2 = m108955m(i2, c1027ct2);
            c1027ct.m112209t();
            c1027ct2.m112209t();
            m108949t(i, c1027ct2);
            m108949t(i2, c1027ct);
        }
    }

    /* renamed from: q */
    public void m108951q(int i, int i2) {
        int i3 = (i2 * this.f7515d) + (i / 32);
        int[] iArr = this.f7516e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: r */
    public void m108950r(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.f7514c && i5 <= this.f7513b) {
                    while (i2 < i6) {
                        int i7 = this.f7515d * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.f7516e;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    /* renamed from: t */
    public void m108949t(int i, C1027CT c1027ct) {
        int[] m112216l = c1027ct.m112216l();
        int[] iArr = this.f7516e;
        int i2 = this.f7515d;
        System.arraycopy(m112216l, 0, iArr, i * i2, i2);
    }

    public String toString() {
        return m108948w("X ", "  ");
    }

    /* renamed from: w */
    public String m108948w(String str, String str2) {
        return m108963d(str, str2, "\n");
    }

    public C1837ET(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f7513b = i;
            this.f7514c = i2;
            int i3 = (i + 31) / 32;
            this.f7515d = i3;
            this.f7516e = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public C1837ET(int i, int i2, int i3, int[] iArr) {
        this.f7513b = i;
        this.f7514c = i2;
        this.f7515d = i3;
        this.f7516e = iArr;
    }
}
