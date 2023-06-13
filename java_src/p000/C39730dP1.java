package p000;

import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* renamed from: dP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39730dP1 {

    /* renamed from: a */
    public static final TimeZone f76568a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m44308a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: b */
    public static int m44307b(String str, int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:47:0x00cd, B:49:0x00d3, B:51:0x00da, B:75:0x0187, B:55:0x00e4, B:56:0x00ff, B:57:0x0100, B:61:0x011c, B:63:0x0129, B:66:0x0132, B:68:0x0151, B:71:0x0160, B:72:0x0182, B:74:0x0185, B:60:0x010b, B:77:0x01b8, B:78:0x01bf, B:40:0x00b4, B:41:0x00b7), top: B:94:0x0004 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m44306c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int m44305d = m44305d(str, index, i5);
            if (m44308a(str, i5, CoreConstants.DASH_CHAR)) {
                i5++;
            }
            int i6 = i5 + 2;
            int m44305d2 = m44305d(str, i5, i6);
            if (m44308a(str, i6, CoreConstants.DASH_CHAR)) {
                i6++;
            }
            int i7 = i6 + 2;
            int m44305d3 = m44305d(str, i6, i7);
            boolean m44308a = m44308a(str, i7, 'T');
            if (!m44308a && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(m44305d, m44305d2 - 1, m44305d3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (m44308a) {
                int i8 = i7 + 1;
                int i9 = i8 + 2;
                int m44305d4 = m44305d(str, i8, i9);
                if (m44308a(str, i9, CoreConstants.COLON_CHAR)) {
                    i9++;
                }
                int i10 = i9 + 2;
                int m44305d5 = m44305d(str, i9, i10);
                if (m44308a(str, i10, CoreConstants.COLON_CHAR)) {
                    i10++;
                }
                if (str.length() > i10 && (charAt = str.charAt(i10)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i11 = i10 + 2;
                    i4 = m44305d(str, i10, i11);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (m44308a(str, i11, CoreConstants.DOT)) {
                        int i12 = i11 + 1;
                        int m44307b = m44307b(str, i12 + 1);
                        int min = Math.min(m44307b, i12 + 3);
                        int m44305d6 = m44305d(str, i12, min);
                        int i13 = min - i12;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                m44305d6 *= 10;
                            }
                        } else {
                            m44305d6 *= 100;
                        }
                        i2 = m44305d5;
                        i3 = m44305d6;
                        i = m44305d4;
                        i7 = m44307b;
                    } else {
                        i2 = m44305d5;
                        i = m44305d4;
                        i7 = i11;
                        i3 = 0;
                    }
                    if (str.length() <= i7) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 == 'Z') {
                            timeZone = f76568a;
                            length = i7 + 1;
                        } else {
                            if (charAt2 != '+' && charAt2 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                            }
                            String substring = str.substring(i7);
                            if (substring.length() < 5) {
                                substring = substring + "00";
                            }
                            length = i7 + substring.length();
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str3 = "GMT" + substring;
                                TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                                String id = timeZone2.getID();
                                if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = f76568a;
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, m44305d);
                        gregorianCalendar2.set(2, m44305d2 - 1);
                        gregorianCalendar2.set(5, m44305d3);
                        gregorianCalendar2.set(11, i);
                        gregorianCalendar2.set(12, i2);
                        gregorianCalendar2.set(13, i4);
                        gregorianCalendar2.set(14, i3);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i2 = m44305d5;
                i3 = 0;
                i = m44305d4;
                i7 = i10;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            if (str.length() <= i7) {
            }
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* renamed from: d */
    public static int m44305d(String str, int i, int i2) throws NumberFormatException {
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
}
