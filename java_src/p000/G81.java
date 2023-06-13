package p000;

import com.google.zxing.NotFoundException;
/* renamed from: G81 */
/* loaded from: classes6.dex */
public final class G81 extends AbstractC40456ed6 {

    /* renamed from: i */
    public final int[] f11040i = new int[4];

    @Override // p000.AbstractC40456ed6
    /* renamed from: k */
    public int mo37949k(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f11040i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m112213o = c1027ct.m112213o();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m112213o; i2++) {
            sb.append((char) (AbstractC40456ed6.m42689i(c1027ct, iArr2, i, AbstractC40456ed6.f78635g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC40456ed6.m42687m(c1027ct, i, true, AbstractC40456ed6.f78633e)[1];
        for (int i5 = 0; i5 < 4 && i4 < m112213o; i5++) {
            sb.append((char) (AbstractC40456ed6.m42689i(c1027ct, iArr2, i4, AbstractC40456ed6.f78635g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: p */
    public EnumC7009Qx mo37948p() {
        return EnumC7009Qx.EAN_8;
    }
}
