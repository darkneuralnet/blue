package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
/* renamed from: gd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41642gd6 extends AbstractC40456ed6 {

    /* renamed from: j */
    public static final int[] f83962j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    public static final int[][] f83963k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    public final int[] f83964i = new int[4];

    /* renamed from: r */
    public static String m37947r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: s */
    public static void m37946s(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f83963k[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: g */
    public boolean mo37951g(String str) throws FormatException {
        return super.mo37951g(m37947r(str));
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: j */
    public int[] mo37950j(C1027CT c1027ct, int i) throws NotFoundException {
        return AbstractC40456ed6.m42687m(c1027ct, i, true, f83962j);
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: k */
    public int mo37949k(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f83964i;
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
        m37946s(sb, i2);
        return i;
    }

    @Override // p000.AbstractC40456ed6
    /* renamed from: p */
    public EnumC7009Qx mo37948p() {
        return EnumC7009Qx.UPC_E;
    }
}
