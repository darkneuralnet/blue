package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
/* renamed from: cv */
/* loaded from: classes6.dex */
public final class C19638cv implements InterfaceC45592nH6 {
    /* renamed from: b */
    public static C1837ET m44827b(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Charset charset, int i3, int i4) {
        if (enumC7009Qx == EnumC7009Qx.AZTEC) {
            return m44826c(C46361ob1.m20820d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    /* renamed from: c */
    public static C1837ET m44826c(C10428Zu c10428Zu, int i, int i2) {
        C1837ET m72335a = c10428Zu.m72335a();
        if (m72335a != null) {
            int m108953o = m72335a.m108953o();
            int m108956l = m72335a.m108956l();
            int max = Math.max(i, m108953o);
            int max2 = Math.max(i2, m108956l);
            int min = Math.min(max / m108953o, max2 / m108956l);
            int i3 = (max - (m108953o * min)) / 2;
            int i4 = (max2 - (m108956l * min)) / 2;
            C1837ET c1837et = new C1837ET(max, max2);
            int i5 = 0;
            while (i5 < m108956l) {
                int i6 = 0;
                int i7 = i3;
                while (i6 < m108953o) {
                    if (m72335a.m108959h(i6, i5)) {
                        c1837et.m108950r(i7, i4, min, min);
                    }
                    i6++;
                    i7 += min;
                }
                i5++;
                i4 += min;
            }
            return c1837et;
        }
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            EnumC40431eb1 enumC40431eb1 = EnumC40431eb1.CHARACTER_SET;
            if (map.containsKey(enumC40431eb1)) {
                charset = Charset.forName(map.get(enumC40431eb1).toString());
            }
            EnumC40431eb1 enumC40431eb12 = EnumC40431eb1.ERROR_CORRECTION;
            if (map.containsKey(enumC40431eb12)) {
                i3 = Integer.parseInt(map.get(enumC40431eb12).toString());
            }
            EnumC40431eb1 enumC40431eb13 = EnumC40431eb1.AZTEC_LAYERS;
            if (map.containsKey(enumC40431eb13)) {
                i4 = Integer.parseInt(map.get(enumC40431eb13).toString());
            }
        }
        return m44827b(str, enumC7009Qx, i, i2, charset, i3, i4);
    }
}
