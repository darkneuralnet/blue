package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: Pl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35222Pl0 extends AbstractC31679Ah3 {
    /* renamed from: f */
    public static int m89870f(boolean[] zArr, int i, int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: g */
    public static int m89869g(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: h */
    public static void m89868h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.CODE_93) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            m89868h(C34988Ol0.f27199d[47], iArr);
            boolean[] zArr = new boolean[((str.length() + 2 + 2) * 9) + 1];
            int m89870f = m89870f(zArr, 0, iArr);
            for (int i = 0; i < length; i++) {
                m89868h(C34988Ol0.f27199d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
                m89870f += m89870f(zArr, m89870f, iArr);
            }
            int m89869g = m89869g(str, 20);
            int[] iArr2 = C34988Ol0.f27199d;
            m89868h(iArr2[m89869g], iArr);
            int m89870f2 = m89870f + m89870f(zArr, m89870f, iArr);
            m89868h(iArr2[m89869g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(m89869g), 15)], iArr);
            int m89870f3 = m89870f2 + m89870f(zArr, m89870f2, iArr);
            m89868h(iArr2[47], iArr);
            zArr[m89870f3 + m89870f(zArr, m89870f3, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
