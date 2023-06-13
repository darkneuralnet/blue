package com.fasterxml.jackson.databind.util;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import org.joda.time.DateTimeConstants;
@Deprecated
/* loaded from: classes5.dex */
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            } else {
                return i;
            }
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int parseInt = parseInt(str, index, i5);
            if (checkOffset(str, i5, CoreConstants.DASH_CHAR)) {
                i5++;
            }
            int i6 = i5 + 2;
            int parseInt2 = parseInt(str, i5, i6);
            if (checkOffset(str, i6, CoreConstants.DASH_CHAR)) {
                i6++;
            }
            int i7 = i6 + 2;
            int parseInt3 = parseInt(str, i6, i7);
            boolean checkOffset = checkOffset(str, i7, 'T');
            if (!checkOffset && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i8 = i7 + 1;
                int i9 = i8 + 2;
                int parseInt4 = parseInt(str, i8, i9);
                if (checkOffset(str, i9, CoreConstants.COLON_CHAR)) {
                    i9++;
                }
                int i10 = i9 + 2;
                int parseInt5 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, CoreConstants.COLON_CHAR)) {
                    i10++;
                }
                if (str.length() > i10 && (charAt = str.charAt(i10)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i11 = i10 + 2;
                    i4 = parseInt(str, i10, i11);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i11, CoreConstants.DOT)) {
                        int i12 = i11 + 1;
                        int indexOfNonDigit = indexOfNonDigit(str, i12 + 1);
                        int min = Math.min(indexOfNonDigit, i12 + 3);
                        int parseInt6 = parseInt(str, i12, min);
                        int i13 = min - i12;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                parseInt6 *= 10;
                            }
                        } else {
                            parseInt6 *= 100;
                        }
                        i2 = parseInt5;
                        i3 = parseInt6;
                        i = parseInt4;
                        i7 = indexOfNonDigit;
                    } else {
                        i2 = parseInt5;
                        i = parseInt4;
                        i7 = i11;
                        i3 = 0;
                    }
                    if (str.length() <= i7) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 == 'Z') {
                            timeZone = TIMEZONE_Z;
                            length = i7 + 1;
                        } else {
                            if (charAt2 != '+' && charAt2 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                            }
                            String substring = str.substring(i7);
                            length = i7 + substring.length();
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str2 = "GMT" + substring;
                                TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                                String id = timeZone2.getID();
                                if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = TIMEZONE_Z;
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, parseInt);
                        gregorianCalendar2.set(2, parseInt2 - 1);
                        gregorianCalendar2.set(5, parseInt3);
                        gregorianCalendar2.set(11, i);
                        gregorianCalendar2.set(12, i2);
                        gregorianCalendar2.set(13, i4);
                        gregorianCalendar2.set(14, i3);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i2 = parseInt5;
                i3 = 0;
                i = parseInt4;
                i7 = i10;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            if (str.length() <= i7) {
            }
        } catch (Exception e) {
            String str3 = '\"' + str + '\"';
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date " + str3 + ": " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / DateTimeConstants.MILLIS_PER_MINUTE;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? CoreConstants.DASH_CHAR : '+');
            objArr[1] = Integer.valueOf(abs);
            objArr[2] = Integer.valueOf(abs2);
            sb.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
