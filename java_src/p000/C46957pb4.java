package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.List;
import java.util.Map;
/* renamed from: pb4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46957pb4 implements InterfaceC36918Wr4 {

    /* renamed from: b */
    public static final C40900fN4[] f103831b = new C40900fN4[0];

    /* renamed from: a */
    public final FV0 f103832a = new FV0();

    /* renamed from: b */
    public static C1837ET m19089b(C1837ET c1837et) throws NotFoundException {
        int[] m108954n = c1837et.m108954n();
        int[] m108958j = c1837et.m108958j();
        if (m108954n != null && m108958j != null) {
            float m19088c = m19088c(m108954n, c1837et);
            int i = m108954n[1];
            int i2 = m108958j[1];
            int i3 = m108954n[0];
            int i4 = m108958j[0];
            if (i3 < i4 && i < i2) {
                int i5 = i2 - i;
                if (i5 != i4 - i3 && (i4 = i3 + i5) >= c1837et.m108953o()) {
                    throw NotFoundException.m45943a();
                }
                int round = Math.round(((i4 - i3) + 1) / m19088c);
                int round2 = Math.round((i5 + 1) / m19088c);
                if (round > 0 && round2 > 0) {
                    if (round2 == round) {
                        int i6 = (int) (m19088c / 2.0f);
                        int i7 = i + i6;
                        int i8 = i3 + i6;
                        int i9 = (((int) ((round - 1) * m19088c)) + i8) - i4;
                        if (i9 > 0) {
                            if (i9 <= i6) {
                                i8 -= i9;
                            } else {
                                throw NotFoundException.m45943a();
                            }
                        }
                        int i10 = (((int) ((round2 - 1) * m19088c)) + i7) - i2;
                        if (i10 > 0) {
                            if (i10 <= i6) {
                                i7 -= i10;
                            } else {
                                throw NotFoundException.m45943a();
                            }
                        }
                        C1837ET c1837et2 = new C1837ET(round, round2);
                        for (int i11 = 0; i11 < round2; i11++) {
                            int i12 = ((int) (i11 * m19088c)) + i7;
                            for (int i13 = 0; i13 < round; i13++) {
                                if (c1837et.m108959h(((int) (i13 * m19088c)) + i8, i12)) {
                                    c1837et2.m108951q(i13, i11);
                                }
                            }
                        }
                        return c1837et2;
                    }
                    throw NotFoundException.m45943a();
                }
                throw NotFoundException.m45943a();
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: c */
    public static float m19088c(int[] iArr, C1837ET c1837et) throws NotFoundException {
        int m108956l = c1837et.m108956l();
        int m108953o = c1837et.m108953o();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m108953o && i2 < m108956l) {
            if (z != c1837et.m108959h(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m108953o && i2 != m108956l) {
            return (i - iArr[0]) / 7.0f;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public final C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C40900fN4[] m62006b;
        HV0 hv0;
        if (map != null && map.containsKey(EnumC47491qV0.PURE_BARCODE)) {
            hv0 = this.f103832a.m107077b(m19089b(c7707tg.m84122a()), map);
            m62006b = f103831b;
        } else {
            C38904c21 m65092e = new C38311b21(c7707tg.m84122a()).m65092e(map);
            HV0 m107077b = this.f103832a.m107077b(m65092e.m62007a(), map);
            m62006b = m65092e.m62006b();
            hv0 = m107077b;
        }
        if (hv0.m103820d() instanceof C46364ob4) {
            ((C46364ob4) hv0.m103820d()).m20804a(m62006b);
        }
        C38511bN4 c38511bN4 = new C38511bN4(hv0.m103816h(), hv0.m103819e(), m62006b, EnumC7009Qx.QR_CODE);
        List<byte[]> m103823a = hv0.m103823a();
        if (m103823a != null) {
            c38511bN4.m64615h(EnumC39715dN4.BYTE_SEGMENTS, m103823a);
        }
        String m103822b = hv0.m103822b();
        if (m103822b != null) {
            c38511bN4.m64615h(EnumC39715dN4.ERROR_CORRECTION_LEVEL, m103822b);
        }
        if (hv0.m103815i()) {
            c38511bN4.m64615h(EnumC39715dN4.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(hv0.m103817g()));
            c38511bN4.m64615h(EnumC39715dN4.STRUCTURED_APPEND_PARITY, Integer.valueOf(hv0.m103818f()));
        }
        return c38511bN4;
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}
