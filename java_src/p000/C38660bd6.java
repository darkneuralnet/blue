package p000;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;
/* renamed from: bd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38660bd6 {

    /* renamed from: a */
    public final int[] f57785a = new int[4];

    /* renamed from: b */
    public final StringBuilder f57786b = new StringBuilder();

    /* renamed from: c */
    public static Map<EnumC39715dN4, Object> m64247c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC39715dN4.class);
        enumMap.put((EnumMap) EnumC39715dN4.ISSUE_NUMBER, (EnumC39715dN4) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int m64249a(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f57785a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m112213o = c1027ct.m112213o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m112213o; i3++) {
            int m42689i = AbstractC40456ed6.m42689i(c1027ct, iArr2, i, AbstractC40456ed6.f78636h);
            sb.append((char) ((m42689i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m42689i >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c1027ct.m112214n(c1027ct.m112215m(i));
            }
        }
        if (sb.length() == 2) {
            if (Integer.parseInt(sb.toString()) % 4 == i2) {
                return i;
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: b */
    public C38511bN4 m64248b(int i, C1027CT c1027ct, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f57786b;
        sb.setLength(0);
        int m64249a = m64249a(c1027ct, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC39715dN4, Object> m64247c = m64247c(sb2);
        float f = i;
        C38511bN4 c38511bN4 = new C38511bN4(sb2, null, new C40900fN4[]{new C40900fN4((iArr[0] + iArr[1]) / 2.0f, f), new C40900fN4(m64249a, f)}, EnumC7009Qx.UPC_EAN_EXTENSION);
        if (m64247c != null) {
            c38511bN4.m64616g(m64247c);
        }
        return c38511bN4;
    }
}
