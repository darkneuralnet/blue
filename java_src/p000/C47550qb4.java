package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: qb4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47550qb4 implements InterfaceC45592nH6 {
    /* renamed from: b */
    public static C1837ET m17349b(C45771nb4 c45771nb4, int i, int i2, int i3) {
        G70 m23483a = c45771nb4.m23483a();
        if (m23483a != null) {
            int m105765e = m23483a.m105765e();
            int m105766d = m23483a.m105766d();
            int i4 = i3 << 1;
            int i5 = m105765e + i4;
            int i6 = i4 + m105766d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (m105765e * min)) / 2;
            int i8 = (max2 - (m105766d * min)) / 2;
            C1837ET c1837et = new C1837ET(max, max2);
            int i9 = 0;
            while (i9 < m105766d) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < m105765e) {
                    if (m23483a.m105768b(i10, i9) == 1) {
                        c1837et.m108950r(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return c1837et;
        }
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (enumC7009Qx == EnumC7009Qx.QR_CODE) {
                if (i >= 0 && i2 >= 0) {
                    EnumC41074fg1 enumC41074fg1 = EnumC41074fg1.L;
                    int i3 = 4;
                    if (map != null) {
                        EnumC40431eb1 enumC40431eb1 = EnumC40431eb1.ERROR_CORRECTION;
                        if (map.containsKey(enumC40431eb1)) {
                            enumC41074fg1 = EnumC41074fg1.valueOf(map.get(enumC40431eb1).toString());
                        }
                        EnumC40431eb1 enumC40431eb12 = EnumC40431eb1.MARGIN;
                        if (map.containsKey(enumC40431eb12)) {
                            i3 = Integer.parseInt(map.get(enumC40431eb12).toString());
                        }
                    }
                    return m17349b(C47547qb1.m17361n(str, enumC41074fg1, map), i, i2, i3);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC7009Qx)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
