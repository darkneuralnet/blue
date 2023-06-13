package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: jP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43287jP1 extends AbstractC31679Ah3 {

    /* renamed from: a */
    public static final int[] f92648a = {1, 1, 1, 1};

    /* renamed from: b */
    public static final int[] f92649b = {3, 1, 1};

    /* renamed from: c */
    public static final int[][] f92650c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.ITF) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int m115386b = AbstractC31679Ah3.m115386b(zArr, 0, f92648a, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[10];
                    for (int i2 = 0; i2 < 5; i2++) {
                        int i3 = i2 * 2;
                        int[][] iArr2 = f92650c;
                        iArr[i3] = iArr2[digit][i2];
                        iArr[i3 + 1] = iArr2[digit2][i2];
                    }
                    m115386b += AbstractC31679Ah3.m115386b(zArr, m115386b, iArr, true);
                }
                AbstractC31679Ah3.m115386b(zArr, m115386b, f92649b, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
