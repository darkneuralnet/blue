package p000;
/* renamed from: ob1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46361ob1 {

    /* renamed from: a */
    public static final int[] f102163a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private C46361ob1() {
    }

    /* renamed from: a */
    public static int[] m20823a(C1027CT c1027ct, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int m112213o = c1027ct.m112213o() / i;
        for (int i4 = 0; i4 < m112213o; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (c1027ct.m112217k((i4 * i) + i6)) {
                    i3 = 1 << ((i - i6) - 1);
                } else {
                    i3 = 0;
                }
                i5 |= i3;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    /* renamed from: b */
    public static void m20822b(C1837ET c1837et, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c1837et.m108951q(i5, i4);
                    c1837et.m108951q(i5, i6);
                    c1837et.m108951q(i4, i5);
                    c1837et.m108951q(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c1837et.m108951q(i7, i7);
        int i8 = i7 + 1;
        c1837et.m108951q(i8, i7);
        c1837et.m108951q(i7, i8);
        int i9 = i + i2;
        c1837et.m108951q(i9, i7);
        c1837et.m108951q(i9, i8);
        c1837et.m108951q(i9, i9 - 1);
    }

    /* renamed from: c */
    public static void m20821c(C1837ET c1837et, boolean z, int i, C1027CT c1027ct) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (c1027ct.m112217k(i3)) {
                    c1837et.m108951q(i4, i2 - 5);
                }
                if (c1027ct.m112217k(i3 + 7)) {
                    c1837et.m108951q(i2 + 5, i4);
                }
                if (c1027ct.m112217k(20 - i3)) {
                    c1837et.m108951q(i4, i2 + 5);
                }
                if (c1027ct.m112217k(27 - i3)) {
                    c1837et.m108951q(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (c1027ct.m112217k(i3)) {
                c1837et.m108951q(i5, i2 - 7);
            }
            if (c1027ct.m112217k(i3 + 10)) {
                c1837et.m108951q(i2 + 7, i5);
            }
            if (c1027ct.m112217k(29 - i3)) {
                c1837et.m108951q(i5, i2 + 7);
            }
            if (c1027ct.m112217k(39 - i3)) {
                c1837et.m108951q(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static C10428Zu m20820d(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        C1027CT c1027ct;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1027CT m97039a = new LM1(bArr).m97039a();
        int i10 = 11;
        int m112213o = ((m97039a.m112213o() * i) / 100) + 11;
        int m112213o2 = m97039a.m112213o() + m112213o;
        int i11 = 32;
        int i12 = 0;
        int i13 = 1;
        if (i2 != 0) {
            if (i2 < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            i5 = Math.abs(i2);
            if (z2) {
                i11 = 4;
            }
            if (i5 <= i11) {
                i6 = m20815i(i5, z2);
                i4 = f102163a[i5];
                int i14 = i6 - (i6 % i4);
                c1027ct = m20816h(m97039a, i4);
                if (c1027ct.m112213o() + m112213o <= i14) {
                    if (z2 && c1027ct.m112213o() > (i4 << 6)) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            C1027CT c1027ct2 = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 <= 32) {
                if (i15 <= 3) {
                    z = i13;
                } else {
                    z = i12;
                }
                if (z) {
                    i3 = i15 + 1;
                } else {
                    i3 = i15;
                }
                int m20815i = m20815i(i3, z);
                if (m112213o2 <= m20815i) {
                    if (c1027ct2 == null || i16 != f102163a[i3]) {
                        int i17 = f102163a[i3];
                        i16 = i17;
                        c1027ct2 = m20816h(m97039a, i17);
                    }
                    int i18 = m20815i - (m20815i % i16);
                    if ((!z || c1027ct2.m112213o() <= (i16 << 6)) && c1027ct2.m112213o() + m112213o <= i18) {
                        c1027ct = c1027ct2;
                        i4 = i16;
                        z2 = z;
                        i5 = i3;
                        i6 = m20815i;
                        i12 = i12;
                    }
                }
                i15++;
                i13 = i13;
                i12 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C1027CT m20819e = m20819e(c1027ct, i6, i4);
        int m112213o3 = c1027ct.m112213o() / i4;
        C1027CT m20818f = m20818f(z2, i5, m112213o3);
        if (!z2) {
            i10 = 14;
        }
        int i19 = i10 + (i5 << 2);
        int[] iArr = new int[i19];
        int i20 = 2;
        if (z2) {
            for (int i21 = i12; i21 < i19; i21++) {
                iArr[i21] = i21;
            }
            i7 = i19;
        } else {
            int i22 = i19 / 2;
            i7 = i19 + 1 + (((i22 - 1) / 15) * 2);
            int i23 = i7 / 2;
            for (int i24 = i12; i24 < i22; i24++) {
                iArr[(i22 - i24) - i13] = (i23 - i8) - 1;
                iArr[i22 + i24] = (i24 / 15) + i24 + i23 + i13;
            }
        }
        C1837ET c1837et = new C1837ET(i7);
        int i25 = i12;
        int i26 = i25;
        while (i25 < i5) {
            int i27 = (i5 - i25) << i20;
            if (z2) {
                i9 = 9;
            } else {
                i9 = 12;
            }
            int i28 = i27 + i9;
            int i29 = i12;
            while (i29 < i28) {
                int i30 = i29 << 1;
                while (i12 < i20) {
                    if (m20819e.m112217k(i26 + i30 + i12)) {
                        int i31 = i25 << 1;
                        c1837et.m108951q(iArr[i31 + i12], iArr[i31 + i29]);
                    }
                    if (m20819e.m112217k((i28 << 1) + i26 + i30 + i12)) {
                        int i32 = i25 << 1;
                        c1837et.m108951q(iArr[i32 + i29], iArr[((i19 - 1) - i32) - i12]);
                    }
                    if (m20819e.m112217k((i28 << 2) + i26 + i30 + i12)) {
                        int i33 = (i19 - 1) - (i25 << 1);
                        c1837et.m108951q(iArr[i33 - i12], iArr[i33 - i29]);
                    }
                    if (m20819e.m112217k((i28 * 6) + i26 + i30 + i12)) {
                        int i34 = i25 << 1;
                        c1837et.m108951q(iArr[((i19 - 1) - i34) - i29], iArr[i34 + i12]);
                    }
                    i12++;
                    i20 = 2;
                }
                i29++;
                i12 = 0;
                i20 = 2;
            }
            i26 += i28 << 3;
            i25++;
            i12 = 0;
            i20 = 2;
        }
        m20821c(c1837et, z2, i7, m20818f);
        if (z2) {
            m20822b(c1837et, i7 / 2, 5);
        } else {
            int i35 = i7 / 2;
            m20822b(c1837et, i35, 7);
            int i36 = 0;
            int i37 = 0;
            while (i37 < (i19 / 2) - 1) {
                for (int i38 = i35 & 1; i38 < i7; i38 += 2) {
                    int i39 = i35 - i36;
                    c1837et.m108951q(i39, i38);
                    int i40 = i35 + i36;
                    c1837et.m108951q(i40, i38);
                    c1837et.m108951q(i38, i39);
                    c1837et.m108951q(i38, i40);
                }
                i37 += 15;
                i36 += 16;
            }
        }
        C10428Zu c10428Zu = new C10428Zu();
        c10428Zu.m72333c(z2);
        c10428Zu.m72330f(i7);
        c10428Zu.m72332d(i5);
        c10428Zu.m72334b(m112213o3);
        c10428Zu.m72331e(c1837et);
        return c10428Zu;
    }

    /* renamed from: e */
    public static C1027CT m20819e(C1027CT c1027ct, int i, int i2) {
        C43579jt4 c43579jt4 = new C43579jt4(m20817g(i2));
        int i3 = i / i2;
        int[] m20823a = m20823a(c1027ct, i2, i3);
        c43579jt4.m29779b(m20823a, i3 - (c1027ct.m112213o() / i2));
        C1027CT c1027ct2 = new C1027CT();
        c1027ct2.m112221f(0, i % i2);
        for (int i4 : m20823a) {
            c1027ct2.m112221f(i4, i2);
        }
        return c1027ct2;
    }

    /* renamed from: f */
    public static C1027CT m20818f(boolean z, int i, int i2) {
        C1027CT c1027ct = new C1027CT();
        if (z) {
            c1027ct.m112221f(i - 1, 2);
            c1027ct.m112221f(i2 - 1, 6);
            return m20819e(c1027ct, 28, 4);
        }
        c1027ct.m112221f(i - 1, 5);
        c1027ct.m112221f(i2 - 1, 11);
        return m20819e(c1027ct, 40, 4);
    }

    /* renamed from: g */
    public static C49683uB1 m20817g(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return C49683uB1.f111914h;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
                    }
                    return C49683uB1.f111915i;
                }
                return C49683uB1.f111920n;
            }
            return C49683uB1.f111916j;
        }
        return C49683uB1.f111917k;
    }

    /* renamed from: h */
    public static C1027CT m20816h(C1027CT c1027ct, int i) {
        C1027CT c1027ct2 = new C1027CT();
        int m112213o = c1027ct.m112213o();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < m112213o) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= m112213o || c1027ct.m112217k(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                c1027ct2.m112221f(i7, i);
            } else if (i7 == 0) {
                c1027ct2.m112221f(i4 | 1, i);
            } else {
                c1027ct2.m112221f(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return c1027ct2;
    }

    /* renamed from: i */
    public static int m20815i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
