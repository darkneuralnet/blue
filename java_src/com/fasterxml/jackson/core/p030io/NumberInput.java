package com.fasterxml.jackson.core.p030io;

import java.math.BigDecimal;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;
/* renamed from: com.fasterxml.jackson.core.io.NumberInput */
/* loaded from: classes5.dex */
public final class NumberInput {
    static final long L_BILLION = 1000000000;
    public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String MAX_LONG_STR = String.valueOf((long) LongCompanionObject.MAX_VALUE);

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static double parseAsDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return d;
        }
        try {
            return parseDouble(trim);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static int parseAsInt(String str, int i) {
        if (str == null) {
            return i;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            return i;
        }
        int i2 = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char charAt2 = trim.charAt(i2);
            if (charAt2 <= '9' && charAt2 >= '0') {
                i2++;
            } else {
                try {
                    return (int) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return i;
                }
            }
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i;
        }
    }

    public static long parseAsLong(String str, long j) {
        if (str == null) {
            return j;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            return j;
        }
        int i = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i = 1;
        }
        while (i < length) {
            char charAt2 = trim.charAt(i);
            if (charAt2 <= '9' && charAt2 >= '0') {
                i++;
            } else {
                try {
                    return (long) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return j;
                }
            }
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused2) {
            return j;
        }
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        return BigDecimalParser.parse(str);
    }

    public static double parseDouble(String str) throws NumberFormatException {
        if (NASTY_SMALL_DOUBLE.equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseInt(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                break;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 7:
                i3 += (cArr[i] - '0') * DurationKt.NANOS_IN_MILLIS;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * DurationKt.NANOS_IN_MILLIS;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * DurationKt.NANOS_IN_MILLIS;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            default:
                return i3;
        }
        return i3 + ((cArr[i] - '0') * 10);
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (parseInt(cArr, i, i3) * L_BILLION) + parseInt(cArr, i + i3, 9);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) throws NumberFormatException {
        return BigDecimalParser.parse(cArr, i, i2);
    }

    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return BigDecimalParser.parse(cArr);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
        return java.lang.Integer.parseInt(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int parseInt(String str) {
        char charAt = str.charAt(0);
        int length = str.length();
        int i = 1;
        boolean z = charAt == '-';
        if (z) {
            if (length != 1 && length <= 10) {
                charAt = str.charAt(1);
                i = 2;
            } else {
                return Integer.parseInt(str);
            }
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (charAt > '9' || charAt < '0') {
            return Integer.parseInt(str);
        }
        int i2 = charAt - '0';
        if (i < length) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return Integer.parseInt(str);
            }
            i2 = (i2 * 10) + (charAt2 - '0');
            if (i3 < length) {
                int i4 = i3 + 1;
                char charAt3 = str.charAt(i3);
                if (charAt3 > '9' || charAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i2 = (i2 * 10) + (charAt3 - '0');
                if (i4 < length) {
                    while (true) {
                        int i5 = i4 + 1;
                        char charAt4 = str.charAt(i4);
                        if (charAt4 > '9' || charAt4 < '0') {
                            break;
                        }
                        i2 = (i2 * 10) + (charAt4 - '0');
                        if (i5 >= length) {
                            break;
                        }
                        i4 = i5;
                    }
                }
            }
        }
        return z ? -i2 : i2;
    }
}
