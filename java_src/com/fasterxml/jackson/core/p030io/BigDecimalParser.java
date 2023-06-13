package com.fasterxml.jackson.core.p030io;

import java.math.BigDecimal;
import java.util.Arrays;
/* renamed from: com.fasterxml.jackson.core.io.BigDecimalParser */
/* loaded from: classes5.dex */
public final class BigDecimalParser {
    private static final int MAX_CHARS_TO_REPORT = 1000;
    private final char[] chars;

    public BigDecimalParser(char[] cArr) {
        this.chars = cArr;
    }

    private int adjustScale(int i, long j) {
        long j2 = i - j;
        if (j2 > 2147483647L || j2 < -2147483648L) {
            throw new NumberFormatException("Scale out of range: " + j2 + " while adjusting scale " + i + " to exponent " + j);
        }
        return (int) j2;
    }

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    private BigDecimal parseBigDecimal(int i) {
        int i2;
        int i3;
        BigDecimal bigDecimalRec;
        int length = this.chars.length;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        int i7 = 0;
        boolean z3 = false;
        for (int i8 = 0; i8 < length; i8++) {
            char c = this.chars[i8];
            if (c != '+') {
                if (c != 'E' && c != 'e') {
                    if (c != '-') {
                        if (c != '.') {
                            if (i5 >= 0 && i4 == -1) {
                                i6++;
                            }
                        } else if (i5 < 0) {
                            i5 = i8;
                        } else {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                    } else if (i4 >= 0) {
                        if (z2) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                        z2 = true;
                    } else if (!z) {
                        i7 = i8 + 1;
                        z = true;
                        z3 = true;
                    } else {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                } else if (i4 < 0) {
                    i4 = i8;
                } else {
                    throw new NumberFormatException("Multiple exponent markers");
                }
            } else if (i4 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else if (!z) {
                i7 = i8 + 1;
                z = true;
            } else {
                throw new NumberFormatException("Multiple signs in number");
            }
        }
        if (i4 >= 0) {
            i2 = 1;
            i3 = Integer.parseInt(new String(this.chars, i4 + 1, (length - i4) - 1));
            i6 = adjustScale(i6, i3);
            length = i4;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (i5 >= 0) {
            int i9 = (length - i5) - i2;
            bigDecimalRec = toBigDecimalRec(i7, i5 - i7, i3, i).add(toBigDecimalRec(i5 + i2, i9, i3 - i9, i));
        } else {
            bigDecimalRec = toBigDecimalRec(i7, length - i7, i3, i);
        }
        if (i6 != 0) {
            bigDecimalRec = bigDecimalRec.setScale(i6);
        }
        if (z3) {
            return bigDecimalRec.negate();
        }
        return bigDecimalRec;
    }

    private BigDecimal toBigDecimalRec(int i, int i2, int i3, int i4) {
        if (i2 > i4) {
            int i5 = i2 / 2;
            return toBigDecimalRec(i, i5, (i3 + i2) - i5, i4).add(toBigDecimalRec(i + i5, i2 - i5, i3, i4));
        } else if (i2 == 0) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(this.chars, i, i2).movePointRight(i3);
        }
    }

    public static BigDecimal parse(char[] cArr, int i, int i2) {
        if (i > 0 || i2 != cArr.length) {
            cArr = Arrays.copyOfRange(cArr, i, i2 + i);
        }
        return parse(cArr);
    }

    public static BigDecimal parse(char[] cArr) {
        String str;
        int length = cArr.length;
        try {
            if (length < 500) {
                return new BigDecimal(cArr);
            }
            return new BigDecimalParser(cArr).parseBigDecimal(length / 10);
        } catch (NumberFormatException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (cArr.length <= 1000) {
                str = new String(cArr);
            } else {
                str = new String(Arrays.copyOfRange(cArr, 0, 1000)) + "(truncated, full length is " + cArr.length + " chars)";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }
}
