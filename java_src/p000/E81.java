package p000;

import com.google.zxing.NotFoundException;
/* renamed from: E81 */
/* loaded from: classes6.dex */
public final class E81 extends AbstractC40456ed6 {

    /* renamed from: j */
    public static final int[] f7001j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    public final int[] f7002i = new int[4];

    /* renamed from: r */
    public static void m109350r(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f7001j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: k */
    public int mo37949k(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f7002i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m112213o = c1027ct.m112213o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m112213o; i3++) {
            int m42689i = AbstractC40456ed6.m42689i(c1027ct, iArr2, i, AbstractC40456ed6.f78636h);
            sb.append((char) ((m42689i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m42689i >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m109350r(sb, i2);
        int i5 = AbstractC40456ed6.m42687m(c1027ct, i, true, AbstractC40456ed6.f78633e)[1];
        for (int i6 = 0; i6 < 6 && i5 < m112213o; i6++) {
            sb.append((char) (AbstractC40456ed6.m42689i(c1027ct, iArr2, i5, AbstractC40456ed6.f78635g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: p */
    public EnumC7009Qx mo37948p() {
        return EnumC7009Qx.EAN_13;
    }
}
