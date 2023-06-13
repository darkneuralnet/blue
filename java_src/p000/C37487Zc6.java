package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
/* renamed from: Zc6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37487Zc6 extends AbstractC40456ed6 {

    /* renamed from: i */
    public final AbstractC40456ed6 f48837i = new E81();

    /* renamed from: r */
    public static C38511bN4 m72850r(C38511bN4 c38511bN4) throws FormatException {
        String m64617f = c38511bN4.m64617f();
        if (m64617f.charAt(0) == '0') {
            C38511bN4 c38511bN42 = new C38511bN4(m64617f.substring(1), null, c38511bN4.m64618e(), EnumC7009Qx.UPC_A);
            if (c38511bN4.m64619d() != null) {
                c38511bN42.m64616g(c38511bN4.m64619d());
            }
            return c38511bN42;
        }
        throw FormatException.m45945a();
    }

    @Override // p000.AbstractC52944zh3, p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException {
        return m72850r(this.f48837i.mo544a(c7707tg, map));
    }

    @Override // p000.AbstractC40456ed6, p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m72850r(this.f48837i.mo543b(i, c1027ct, map));
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: k */
    public int mo37949k(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f48837i.mo37949k(c1027ct, iArr, sb);
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: l */
    public C38511bN4 mo42688l(int i, C1027CT c1027ct, int[] iArr, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m72850r(this.f48837i.mo42688l(i, c1027ct, iArr, map));
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: p */
    public EnumC7009Qx mo37948p() {
        return EnumC7009Qx.UPC_A;
    }
}
