package p000;
/* renamed from: wm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51216wm4 {
    private C51216wm4() {
    }

    /* renamed from: a */
    public static int m6374a(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            i3 = i2;
            i2 = i3;
        }
        int i4 = 1;
        int i5 = 1;
        while (i > i3) {
            i4 *= i;
            if (i5 <= i2) {
                i4 /= i5;
                i5++;
            }
            i--;
        }
        while (i5 <= i2) {
            i4 /= i5;
            i5++;
        }
        return i4;
    }

    /* renamed from: b */
    public static int m6373b(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i2 = 0;
        for (int i3 : iArr2) {
            i2 += i3;
        }
        int length = iArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (i4 < i7) {
                int i8 = 1 << i4;
                i6 |= i8;
                int i9 = 1;
                while (i9 < iArr2[i4]) {
                    int i10 = i2 - i9;
                    int i11 = length - i4;
                    int i12 = i11 - 2;
                    int m6374a = m6374a(i10 - 1, i12);
                    if (z && i6 == 0) {
                        int i13 = i11 - 1;
                        if (i10 - i13 >= i13) {
                            m6374a -= m6374a(i10 - i11, i12);
                        }
                    }
                    if (i11 - 1 > 1) {
                        int i14 = 0;
                        for (int i15 = i10 - i12; i15 > i; i15--) {
                            i14 += m6374a((i10 - i15) - 1, i11 - 3);
                        }
                        m6374a -= i14 * (i7 - i4);
                    } else if (i10 > i) {
                        m6374a--;
                    }
                    i5 += m6374a;
                    i9++;
                    i6 &= ~i8;
                    iArr2 = iArr;
                }
                i2 -= i9;
                i4++;
                iArr2 = iArr;
            } else {
                return i5;
            }
        }
    }
}