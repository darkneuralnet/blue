package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;
/* renamed from: cd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39253cd6 {

    /* renamed from: c */
    public static final int[] f60957c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final int[] f60958a = new int[4];

    /* renamed from: b */
    public final StringBuilder f60959b = new StringBuilder();

    /* renamed from: c */
    public static int m61149c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f60957c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: d */
    public static int m61148d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m61147e(String str) {
        String str2;
        String valueOf;
        char c = 0;
        char charAt = str.charAt(0);
        if (charAt != '0') {
            if (charAt != '5') {
                str2 = "";
                if (charAt == '9') {
                    switch (str.hashCode()) {
                        case 54118329:
                            break;
                        case 54395376:
                            if (str.equals("99990")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 54395377:
                            if (str.equals("99991")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            return null;
                        case 1:
                            return "Used";
                        case 2:
                            return "0.00";
                    }
                }
            } else {
                str2 = "$";
            }
        } else {
            str2 = "£";
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf2 = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            valueOf = "0".concat(String.valueOf(i));
        } else {
            valueOf = String.valueOf(i);
        }
        return str2 + valueOf2 + CoreConstants.DOT + valueOf;
    }

    /* renamed from: f */
    public static Map<EnumC39715dN4, Object> m61146f(String str) {
        String m61147e;
        if (str.length() != 5 || (m61147e = m61147e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC39715dN4.class);
        enumMap.put((EnumMap) EnumC39715dN4.SUGGESTED_PRICE, (EnumC39715dN4) m61147e);
        return enumMap;
    }

    /* renamed from: a */
    public final int m61151a(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f60958a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m112213o = c1027ct.m112213o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < m112213o; i3++) {
            int m42689i = AbstractC40456ed6.m42689i(c1027ct, iArr2, i, AbstractC40456ed6.f78636h);
            sb.append((char) ((m42689i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m42689i >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c1027ct.m112214n(c1027ct.m112215m(i));
            }
        }
        if (sb.length() == 5) {
            if (m61148d(sb.toString()) == m61149c(i2)) {
                return i;
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: b */
    public C38511bN4 m61150b(int i, C1027CT c1027ct, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f60959b;
        sb.setLength(0);
        int m61151a = m61151a(c1027ct, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC39715dN4, Object> m61146f = m61146f(sb2);
        float f = i;
        C38511bN4 c38511bN4 = new C38511bN4(sb2, null, new C40900fN4[]{new C40900fN4((iArr[0] + iArr[1]) / 2.0f, f), new C40900fN4(m61151a, f)}, EnumC7009Qx.UPC_EAN_EXTENSION);
        if (m61146f != null) {
            c38511bN4.m64616g(m61146f);
        }
        return c38511bN4;
    }
}
