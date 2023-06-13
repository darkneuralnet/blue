package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: uD3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49703uD3 implements InterfaceC36918Wr4 {
    /* renamed from: b */
    public static C38511bN4[] m10602b(C7707TG c7707tg, Map<EnumC47491qV0, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        C47925rD3 m71969b = C37718a21.m71969b(c7707tg, map, z);
        for (C40900fN4[] c40900fN4Arr : m71969b.m16200b()) {
            HV0 m7247i = C50888wD3.m7247i(m71969b.m16201a(), c40900fN4Arr[4], c40900fN4Arr[5], c40900fN4Arr[6], c40900fN4Arr[7], m10599e(c40900fN4Arr), m10601c(c40900fN4Arr));
            C38511bN4 c38511bN4 = new C38511bN4(m7247i.m103816h(), m7247i.m103819e(), c40900fN4Arr, EnumC7009Qx.PDF_417);
            c38511bN4.m64615h(EnumC39715dN4.ERROR_CORRECTION_LEVEL, m7247i.m103822b());
            C50295vD3 c50295vD3 = (C50295vD3) m7247i.m103820d();
            if (c50295vD3 != null) {
                c38511bN4.m64615h(EnumC39715dN4.PDF417_EXTRA_METADATA, c50295vD3);
            }
            arrayList.add(c38511bN4);
        }
        return (C38511bN4[]) arrayList.toArray(new C38511bN4[arrayList.size()]);
    }

    /* renamed from: c */
    public static int m10601c(C40900fN4[] c40900fN4Arr) {
        return Math.max(Math.max(m10600d(c40900fN4Arr[0], c40900fN4Arr[4]), (m10600d(c40900fN4Arr[6], c40900fN4Arr[2]) * 17) / 18), Math.max(m10600d(c40900fN4Arr[1], c40900fN4Arr[5]), (m10600d(c40900fN4Arr[7], c40900fN4Arr[3]) * 17) / 18));
    }

    /* renamed from: d */
    public static int m10600d(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        if (c40900fN4 == null || c40900fN42 == null) {
            return 0;
        }
        return (int) Math.abs(c40900fN4.m41471c() - c40900fN42.m41471c());
    }

    /* renamed from: e */
    public static int m10599e(C40900fN4[] c40900fN4Arr) {
        return Math.min(Math.min(m10598f(c40900fN4Arr[0], c40900fN4Arr[4]), (m10598f(c40900fN4Arr[6], c40900fN4Arr[2]) * 17) / 18), Math.min(m10598f(c40900fN4Arr[1], c40900fN4Arr[5]), (m10598f(c40900fN4Arr[7], c40900fN4Arr[3]) * 17) / 18));
    }

    /* renamed from: f */
    public static int m10598f(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        if (c40900fN4 == null || c40900fN42 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(c40900fN4.m41471c() - c40900fN42.m41471c());
    }

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException, ChecksumException {
        C38511bN4 c38511bN4;
        C38511bN4[] m10602b = m10602b(c7707tg, map, false);
        if (m10602b != null && m10602b.length != 0 && (c38511bN4 = m10602b[0]) != null) {
            return c38511bN4;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}
