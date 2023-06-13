package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.List;
import java.util.Map;
/* renamed from: bv */
/* loaded from: classes6.dex */
public final class C13325bv implements InterfaceC36918Wr4 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e A[LOOP:0: B:33:0x005c->B:34:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException {
        C40900fN4[] c40900fN4Arr;
        C40900fN4[] c40900fN4Arr2;
        FormatException formatException;
        C40900fN4[] c40900fN4Arr3;
        List<byte[]> m103823a;
        String m103822b;
        InterfaceC41493gN4 interfaceC41493gN4;
        Y11 y11 = new Y11(c7707tg.m84122a());
        HV0 hv0 = null;
        try {
            C12188av m75847a = y11.m75847a(false);
            c40900fN4Arr = m75847a.m62006b();
            try {
                c40900fN4Arr2 = c40900fN4Arr;
                formatException = null;
                hv0 = new CV0().m112195c(m75847a);
                e = null;
            } catch (FormatException e) {
                e = e;
                c40900fN4Arr2 = c40900fN4Arr;
                formatException = e;
                e = null;
                if (hv0 == null) {
                }
                c40900fN4Arr3 = c40900fN4Arr2;
                if (map != null) {
                    while (r11 < r0) {
                    }
                }
                C38511bN4 c38511bN4 = new C38511bN4(hv0.m103816h(), hv0.m103819e(), hv0.m103821c(), c40900fN4Arr3, EnumC7009Qx.AZTEC, System.currentTimeMillis());
                m103823a = hv0.m103823a();
                if (m103823a != null) {
                }
                m103822b = hv0.m103822b();
                if (m103822b != null) {
                }
                return c38511bN4;
            } catch (NotFoundException e2) {
                e = e2;
                c40900fN4Arr2 = c40900fN4Arr;
                formatException = null;
                if (hv0 == null) {
                }
                c40900fN4Arr3 = c40900fN4Arr2;
                if (map != null) {
                }
                C38511bN4 c38511bN42 = new C38511bN4(hv0.m103816h(), hv0.m103819e(), hv0.m103821c(), c40900fN4Arr3, EnumC7009Qx.AZTEC, System.currentTimeMillis());
                m103823a = hv0.m103823a();
                if (m103823a != null) {
                }
                m103822b = hv0.m103822b();
                if (m103822b != null) {
                }
                return c38511bN42;
            }
        } catch (FormatException e3) {
            e = e3;
            c40900fN4Arr = null;
        } catch (NotFoundException e4) {
            e = e4;
            c40900fN4Arr = null;
        }
        if (hv0 == null) {
            try {
                C12188av m75847a2 = y11.m75847a(true);
                c40900fN4Arr2 = m75847a2.m62006b();
                hv0 = new CV0().m112195c(m75847a2);
            } catch (FormatException | NotFoundException e5) {
                if (e == null) {
                    if (formatException != null) {
                        throw formatException;
                    }
                    throw e5;
                }
                throw e;
            }
        }
        c40900fN4Arr3 = c40900fN4Arr2;
        if (map != null && (interfaceC41493gN4 = (InterfaceC41493gN4) map.get(EnumC47491qV0.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (C40900fN4 c40900fN4 : c40900fN4Arr3) {
                interfaceC41493gN4.m39547a(c40900fN4);
            }
        }
        C38511bN4 c38511bN422 = new C38511bN4(hv0.m103816h(), hv0.m103819e(), hv0.m103821c(), c40900fN4Arr3, EnumC7009Qx.AZTEC, System.currentTimeMillis());
        m103823a = hv0.m103823a();
        if (m103823a != null) {
            c38511bN422.m64615h(EnumC39715dN4.BYTE_SEGMENTS, m103823a);
        }
        m103822b = hv0.m103822b();
        if (m103822b != null) {
            c38511bN422.m64615h(EnumC39715dN4.ERROR_CORRECTION_LEVEL, m103822b);
        }
        return c38511bN422;
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}
