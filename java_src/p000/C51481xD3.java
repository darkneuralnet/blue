package p000;

import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
/* renamed from: xD3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51481xD3 implements InterfaceC45592nH6 {
    /* renamed from: b */
    public static C1837ET m5655b(byte[][] bArr, int i) {
        int i2 = i * 2;
        C1837ET c1837et = new C1837ET(bArr[0].length + i2, bArr.length + i2);
        c1837et.m108962e();
        int m108956l = (c1837et.m108956l() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    c1837et.m108951q(i4 + i, m108956l);
                }
            }
            i3++;
            m108956l--;
        }
        return c1837et;
    }

    /* renamed from: c */
    public static C1837ET m5654c(C46146oD3 c46146oD3, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        boolean z2;
        boolean z3;
        c46146oD3.m21627e(str, i);
        byte[][] m86180b = c46146oD3.m21626f().m86180b(1, 4);
        if (i3 > i2) {
            z = true;
        } else {
            z = false;
        }
        if (m86180b[0].length < m86180b.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            m86180b = m5653d(m86180b);
            z3 = true;
        } else {
            z3 = false;
        }
        int length = i2 / m86180b[0].length;
        int length2 = i3 / m86180b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] m86180b2 = c46146oD3.m21626f().m86180b(length, length << 2);
            if (z3) {
                m86180b2 = m5653d(m86180b2);
            }
            return m5655b(m86180b2, i4);
        }
        return m5655b(m86180b, i4);
    }

    /* renamed from: d */
    public static byte[][] m5653d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.PDF_417) {
            C46146oD3 c46146oD3 = new C46146oD3();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                EnumC40431eb1 enumC40431eb1 = EnumC40431eb1.PDF417_COMPACT;
                if (map.containsKey(enumC40431eb1)) {
                    c46146oD3.m21624h(Boolean.valueOf(map.get(enumC40431eb1).toString()).booleanValue());
                }
                EnumC40431eb1 enumC40431eb12 = EnumC40431eb1.PDF417_COMPACTION;
                if (map.containsKey(enumC40431eb12)) {
                    c46146oD3.m21623i(EnumC35492Qp0.valueOf(map.get(enumC40431eb12).toString()));
                }
                EnumC40431eb1 enumC40431eb13 = EnumC40431eb1.PDF417_DIMENSIONS;
                if (map.containsKey(enumC40431eb13)) {
                    C38331b41 c38331b41 = (C38331b41) map.get(enumC40431eb13);
                    c46146oD3.m21622j(c38331b41.m65010a(), c38331b41.m65008c(), c38331b41.m65009b(), c38331b41.m65007d());
                }
                EnumC40431eb1 enumC40431eb14 = EnumC40431eb1.MARGIN;
                if (map.containsKey(enumC40431eb14)) {
                    i3 = Integer.parseInt(map.get(enumC40431eb14).toString());
                }
                EnumC40431eb1 enumC40431eb15 = EnumC40431eb1.ERROR_CORRECTION;
                if (map.containsKey(enumC40431eb15)) {
                    i4 = Integer.parseInt(map.get(enumC40431eb15).toString());
                }
                EnumC40431eb1 enumC40431eb16 = EnumC40431eb1.CHARACTER_SET;
                if (map.containsKey(enumC40431eb16)) {
                    c46146oD3.m21621k(Charset.forName(map.get(enumC40431eb16).toString()));
                }
            }
            return m5654c(c46146oD3, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC7009Qx)));
    }
}
