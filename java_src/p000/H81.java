package p000;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: H81 */
/* loaded from: classes6.dex */
public final class H81 extends AbstractC41049fd6 {
    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.EAN_8) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!AbstractC40456ed6.m42690h(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + AbstractC40456ed6.m42684q(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        }
        boolean[] zArr = new boolean[67];
        int m115386b = AbstractC31679Ah3.m115386b(zArr, 0, AbstractC40456ed6.f78632d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            m115386b += AbstractC31679Ah3.m115386b(zArr, m115386b, AbstractC40456ed6.f78635g[Character.digit(str.charAt(i), 10)], false);
        }
        int m115386b2 = m115386b + AbstractC31679Ah3.m115386b(zArr, m115386b, AbstractC40456ed6.f78633e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            m115386b2 += AbstractC31679Ah3.m115386b(zArr, m115386b2, AbstractC40456ed6.f78635g[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC31679Ah3.m115386b(zArr, m115386b2, AbstractC40456ed6.f78632d, true);
        return zArr;
    }
}
