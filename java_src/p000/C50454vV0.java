package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.text.DecimalFormat;
/* renamed from: vV0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50454vV0 {

    /* renamed from: a */
    public static final String[] f114167a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private C50454vV0() {
    }

    /* renamed from: a */
    public static HV0 m8602a(byte[] bArr, int i) {
        String m8595h;
        StringBuilder sb = new StringBuilder((int) SyslogConstants.LOG_LOCAL2);
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    sb.append(m8598e(bArr, 1, 77));
                }
            } else {
                sb.append(m8598e(bArr, 1, 93));
            }
        } else {
            if (i == 2) {
                m8595h = new DecimalFormat("0000000000".substring(0, m8596g(bArr))).format(m8597f(bArr));
            } else {
                m8595h = m8595h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(m8600c(bArr));
            String format2 = decimalFormat.format(m8594i(bArr));
            sb.append(m8598e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, m8595h + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb.insert(0, m8595h + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        }
        return new HV0(bArr, sb.toString(), null, String.valueOf(i));
    }

    /* renamed from: b */
    public static int m8601b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static int m8600c(byte[] bArr) {
        return m8599d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    public static int m8599d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m8601b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static String m8598e(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        StringBuilder sb = new StringBuilder();
        int i7 = i;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i + i2) {
            char charAt = f114167a[i9].charAt(bArr[i7]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i10 = i9;
                    i9 = charAt - 65520;
                    i8 = 1;
                    break;
                case 65525:
                    i8 = 2;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65526:
                    i8 = 3;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65527:
                    i8 = -1;
                    i9 = 0;
                    break;
                case 65528:
                    i8 = -1;
                    i9 = 1;
                    break;
                case 65529:
                    i8 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    i7 = i7 + 1 + 1 + 1 + 1 + 1;
                    sb.append(new DecimalFormat("000000000").format((bArr[i3] << 24) + (bArr[i4] << 18) + (bArr[i5] << 12) + (bArr[i6] << 6) + bArr[i7]));
                    break;
            }
            int i11 = i8 - 1;
            if (i8 == 0) {
                i9 = i10;
            }
            i7++;
            i8 = i11;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static int m8597f(byte[] bArr) {
        return m8599d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    public static int m8596g(byte[] bArr) {
        return m8599d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    public static String m8595h(byte[] bArr) {
        String[] strArr = f114167a;
        return String.valueOf(new char[]{strArr[0].charAt(m8599d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m8599d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m8599d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m8599d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m8599d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m8599d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    public static int m8594i(byte[] bArr) {
        return m8599d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}