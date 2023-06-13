package p000;

import java.util.Map;
/* renamed from: OS0 */
/* loaded from: classes6.dex */
public final class OS0 implements InterfaceC45592nH6 {
    /* renamed from: b */
    public static C1837ET m92280b(G70 g70, int i, int i2) {
        C1837ET c1837et;
        int m105765e = g70.m105765e();
        int m105766d = g70.m105766d();
        int max = Math.max(i, m105765e);
        int max2 = Math.max(i2, m105766d);
        int min = Math.min(max / m105765e, max2 / m105766d);
        int i3 = (max - (m105765e * min)) / 2;
        int i4 = (max2 - (m105766d * min)) / 2;
        if (i2 >= m105766d && i >= m105765e) {
            c1837et = new C1837ET(i, i2);
        } else {
            c1837et = new C1837ET(m105765e, m105766d);
            i3 = 0;
            i4 = 0;
        }
        c1837et.m108962e();
        int i5 = 0;
        while (i5 < m105766d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < m105765e) {
                if (g70.m105768b(i7, i5) == 1) {
                    c1837et.m108950r(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return c1837et;
    }

    /* renamed from: c */
    public static C1837ET m92279c(C48111rY0 c48111rY0, C51070wX5 c51070wX5, int i, int i2) {
        boolean z;
        boolean z2;
        int m6689h = c51070wX5.m6689h();
        int m6690g = c51070wX5.m6690g();
        G70 g70 = new G70(c51070wX5.m6687j(), c51070wX5.m6688i());
        int i3 = 0;
        for (int i4 = 0; i4 < m6690g; i4++) {
            if (i4 % c51070wX5.f116135e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < c51070wX5.m6687j(); i6++) {
                    if (i6 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    g70.m105763g(i5, i3, z2);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < m6689h; i8++) {
                if (i8 % c51070wX5.f116134d == 0) {
                    g70.m105763g(i7, i3, true);
                    i7++;
                }
                g70.m105763g(i7, i3, c48111rY0.m15800e(i8, i4));
                i7++;
                int i9 = c51070wX5.f116134d;
                if (i8 % i9 == i9 - 1) {
                    if (i4 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    g70.m105763g(i7, i3, z);
                    i7++;
                }
            }
            i3++;
            int i10 = c51070wX5.f116135e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < c51070wX5.m6687j(); i12++) {
                    g70.m105763g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m92280b(g70, i, i2);
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) {
        X31 x31;
        if (!str.isEmpty()) {
            if (enumC7009Qx == EnumC7009Qx.DATA_MATRIX) {
                if (i >= 0 && i2 >= 0) {
                    EnumC52256yX5 enumC52256yX5 = EnumC52256yX5.FORCE_NONE;
                    X31 x312 = null;
                    if (map != null) {
                        EnumC52256yX5 enumC52256yX52 = (EnumC52256yX5) map.get(EnumC40431eb1.DATA_MATRIX_SHAPE);
                        if (enumC52256yX52 != null) {
                            enumC52256yX5 = enumC52256yX52;
                        }
                        X31 x313 = (X31) map.get(EnumC40431eb1.MIN_SIZE);
                        if (x313 == null) {
                            x313 = null;
                        }
                        x31 = (X31) map.get(EnumC40431eb1.MAX_SIZE);
                        if (x31 == null) {
                            x31 = null;
                        }
                        x312 = x313;
                    } else {
                        x31 = null;
                    }
                    String m95422b = MM1.m95422b(str, enumC52256yX5, x312, x31);
                    C51070wX5 m6685l = C51070wX5.m6685l(m95422b.length(), enumC52256yX5, x312, x31, true);
                    C48111rY0 c48111rY0 = new C48111rY0(C40481eg1.m42636c(m95422b, m6685l), m6685l.m6689h(), m6685l.m6690g());
                    c48111rY0.m15797h();
                    return m92279c(c48111rY0, m6685l, i, i2);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC7009Qx)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
