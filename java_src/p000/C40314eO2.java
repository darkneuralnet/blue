package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
/* renamed from: eO2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40314eO2 implements InterfaceC36918Wr4 {

    /* renamed from: b */
    public static final C40900fN4[] f78319b = new C40900fN4[0];

    /* renamed from: a */
    public final EV0 f78320a = new EV0();

    /* renamed from: b */
    public static C1837ET m42944b(C1837ET c1837et) throws NotFoundException {
        int[] m108957k = c1837et.m108957k();
        if (m108957k != null) {
            int i = m108957k[0];
            int i2 = m108957k[1];
            int i3 = m108957k[2];
            int i4 = m108957k[3];
            C1837ET c1837et2 = new C1837ET(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (c1837et.m108959h(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c1837et2.m108951q(i7, i5);
                    }
                }
            }
            return c1837et2;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map != null && map.containsKey(EnumC47491qV0.PURE_BARCODE)) {
            HV0 m108925b = this.f78320a.m108925b(m42944b(c7707tg.m84122a()), map);
            C38511bN4 c38511bN4 = new C38511bN4(m108925b.m103816h(), m108925b.m103819e(), f78319b, EnumC7009Qx.MAXICODE);
            String m103822b = m108925b.m103822b();
            if (m103822b != null) {
                c38511bN4.m64615h(EnumC39715dN4.ERROR_CORRECTION_LEVEL, m103822b);
            }
            return c38511bN4;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}
