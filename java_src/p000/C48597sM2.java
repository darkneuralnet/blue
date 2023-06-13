package p000;
/* renamed from: sM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48597sM2 {
    private C48597sM2() {
    }

    /* renamed from: a */
    public static int m14313a(G70 g70) {
        return m14312b(g70, true) + m14312b(g70, false);
    }

    /* renamed from: b */
    public static int m14312b(G70 g70, boolean z) {
        int m105765e;
        int m105766d;
        byte b;
        if (z) {
            m105765e = g70.m105766d();
        } else {
            m105765e = g70.m105765e();
        }
        if (z) {
            m105766d = g70.m105765e();
        } else {
            m105766d = g70.m105766d();
        }
        byte[][] m105767c = g70.m105767c();
        int i = 0;
        for (int i2 = 0; i2 < m105765e; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < m105766d; i4++) {
                if (z) {
                    b = m105767c[i2][i4];
                } else {
                    b = m105767c[i4][i2];
                }
                if (b == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    i3 = 1;
                    b2 = b;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static int m14311c(G70 g70) {
        byte[][] m105767c = g70.m105767c();
        int m105765e = g70.m105765e();
        int m105766d = g70.m105766d();
        int i = 0;
        for (int i2 = 0; i2 < m105766d - 1; i2++) {
            byte[] bArr = m105767c[i2];
            int i3 = 0;
            while (i3 < m105765e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = m105767c[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    public static int m14310d(G70 g70) {
        byte[][] m105767c = g70.m105767c();
        int m105765e = g70.m105765e();
        int m105766d = g70.m105766d();
        int i = 0;
        for (int i2 = 0; i2 < m105766d; i2++) {
            for (int i3 = 0; i3 < m105765e; i3++) {
                byte[] bArr = m105767c[i2];
                int i4 = i3 + 6;
                if (i4 < m105765e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m14307g(bArr, i3 - 4, i3) || m14307g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < m105766d && m105767c[i2][i3] == 1 && m105767c[i2 + 1][i3] == 0 && m105767c[i2 + 2][i3] == 1 && m105767c[i2 + 3][i3] == 1 && m105767c[i2 + 4][i3] == 1 && m105767c[i2 + 5][i3] == 0 && m105767c[i5][i3] == 1 && (m14306h(m105767c, i3, i2 - 4, i2) || m14306h(m105767c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: e */
    public static int m14309e(G70 g70) {
        byte[][] m105767c = g70.m105767c();
        int m105765e = g70.m105765e();
        int m105766d = g70.m105766d();
        int i = 0;
        for (int i2 = 0; i2 < m105766d; i2++) {
            byte[] bArr = m105767c[i2];
            for (int i3 = 0; i3 < m105765e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int m105766d2 = g70.m105766d() * g70.m105765e();
        return ((Math.abs((i << 1) - m105766d2) * 10) / m105766d2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static boolean m14308f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m14307g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m14306h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
