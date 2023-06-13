package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: Ah3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31679Ah3 implements InterfaceC45592nH6 {
    /* renamed from: b */
    public static int m115386b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: e */
    public static C1837ET m115385e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C1837ET c1837et = new C1837ET(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                c1837et.m108950r(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return c1837et;
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (i >= 0 && i2 >= 0) {
                int mo41096d = mo41096d();
                if (map != null) {
                    EnumC40431eb1 enumC40431eb1 = EnumC40431eb1.MARGIN;
                    if (map.containsKey(enumC40431eb1)) {
                        mo41096d = Integer.parseInt(map.get(enumC40431eb1).toString());
                    }
                }
                return m115385e(mo30717c(str), i, i2, mo41096d);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    /* renamed from: c */
    public abstract boolean[] mo30717c(String str);

    /* renamed from: d */
    public int mo41096d() {
        return 10;
    }
}
