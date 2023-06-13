package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.List;
import java.util.Map;
/* renamed from: MS0 */
/* loaded from: classes6.dex */
public final class MS0 implements InterfaceC36918Wr4 {

    /* renamed from: b */
    public static final C40900fN4[] f23129b = new C40900fN4[0];

    /* renamed from: a */
    public final DV0 f23130a = new DV0();

    /* renamed from: b */
    public static C1837ET m95293b(C1837ET c1837et) throws NotFoundException {
        int[] m108954n = c1837et.m108954n();
        int[] m108958j = c1837et.m108958j();
        if (m108954n != null && m108958j != null) {
            int m95292c = m95292c(m108954n, c1837et);
            int i = m108954n[1];
            int i2 = m108958j[1];
            int i3 = m108954n[0];
            int i4 = ((m108958j[0] - i3) + 1) / m95292c;
            int i5 = ((i2 - i) + 1) / m95292c;
            if (i4 > 0 && i5 > 0) {
                int i6 = m95292c / 2;
                int i7 = i + i6;
                int i8 = i3 + i6;
                C1837ET c1837et2 = new C1837ET(i4, i5);
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = (i9 * m95292c) + i7;
                    for (int i11 = 0; i11 < i4; i11++) {
                        if (c1837et.m108959h((i11 * m95292c) + i8, i10)) {
                            c1837et2.m108951q(i11, i9);
                        }
                    }
                }
                return c1837et2;
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: c */
    public static int m95292c(int[] iArr, C1837ET c1837et) throws NotFoundException {
        int m108953o = c1837et.m108953o();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m108953o && c1837et.m108959h(i, i2)) {
            i++;
        }
        if (i != m108953o) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C40900fN4[] m62006b;
        HV0 hv0;
        if (map != null && map.containsKey(EnumC47491qV0.PURE_BARCODE)) {
            hv0 = this.f23130a.m110354b(m95293b(c7707tg.m84122a()));
            m62006b = f23129b;
        } else {
            C38904c21 m73841c = new Z11(c7707tg.m84122a()).m73841c();
            HV0 m110354b = this.f23130a.m110354b(m73841c.m62007a());
            m62006b = m73841c.m62006b();
            hv0 = m110354b;
        }
        C38511bN4 c38511bN4 = new C38511bN4(hv0.m103816h(), hv0.m103819e(), m62006b, EnumC7009Qx.DATA_MATRIX);
        List<byte[]> m103823a = hv0.m103823a();
        if (m103823a != null) {
            c38511bN4.m64615h(EnumC39715dN4.BYTE_SEGMENTS, m103823a);
        }
        String m103822b = hv0.m103822b();
        if (m103822b != null) {
            c38511bN4.m64615h(EnumC39715dN4.ERROR_CORRECTION_LEVEL, m103822b);
        }
        return c38511bN4;
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}
