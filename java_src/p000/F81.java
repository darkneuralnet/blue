package p000;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: F81 */
/* loaded from: classes6.dex */
public final class F81 extends AbstractC41049fd6 {
    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.EAN_13) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!AbstractC40456ed6.m42690h(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + AbstractC40456ed6.m42684q(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        }
        int i = E81.f7001j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int m115386b = AbstractC31679Ah3.m115386b(zArr, 0, AbstractC40456ed6.f78632d, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            m115386b += AbstractC31679Ah3.m115386b(zArr, m115386b, AbstractC40456ed6.f78636h[digit], false);
        }
        int m115386b2 = m115386b + AbstractC31679Ah3.m115386b(zArr, m115386b, AbstractC40456ed6.f78633e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            m115386b2 += AbstractC31679Ah3.m115386b(zArr, m115386b2, AbstractC40456ed6.f78635g[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC31679Ah3.m115386b(zArr, m115386b2, AbstractC40456ed6.f78632d, true);
        return zArr;
    }
}
