package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* renamed from: nI6  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C45601nI6 extends AbstractC31862Bb6<Date> {

    /* renamed from: a */
    public static final TimeZone f99734a = TimeZone.getTimeZone("UTC");

    /* renamed from: g */
    public static int m23990g(String str, int i) {
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

    /* renamed from: e */
    public final boolean m23992e(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: f */
    public final String m23991f(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f99734a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        m23989h(sb, gregorianCalendar.get(1), 4);
        sb.append(CoreConstants.DASH_CHAR);
        m23989h(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append(CoreConstants.DASH_CHAR);
        m23989h(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m23989h(sb, gregorianCalendar.get(11), 2);
        sb.append(CoreConstants.COLON_CHAR);
        m23989h(sb, gregorianCalendar.get(12), 2);
        sb.append(CoreConstants.COLON_CHAR);
        m23989h(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        return sb.toString();
    }

    /* renamed from: h */
    public final void m23989h(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: IndexOutOfBoundsException -> 0x012c, TryCatch #0 {IndexOutOfBoundsException -> 0x012c, blocks: (B:3:0x0008, B:5:0x001a, B:6:0x001c, B:8:0x0028, B:9:0x002a, B:11:0x0039, B:13:0x003f, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:30:0x0084, B:35:0x0093, B:37:0x009b, B:48:0x00cb, B:50:0x00d1, B:52:0x00d7, B:54:0x010a, B:55:0x0123, B:56:0x0124, B:57:0x012b, B:41:0x00b3, B:42:0x00b6), top: B:69:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: IndexOutOfBoundsException -> 0x012c, TryCatch #0 {IndexOutOfBoundsException -> 0x012c, blocks: (B:3:0x0008, B:5:0x001a, B:6:0x001c, B:8:0x0028, B:9:0x002a, B:11:0x0039, B:13:0x003f, B:17:0x0052, B:19:0x0062, B:20:0x0064, B:22:0x0070, B:23:0x0072, B:25:0x0078, B:30:0x0084, B:35:0x0093, B:37:0x009b, B:48:0x00cb, B:50:0x00d1, B:52:0x00d7, B:54:0x010a, B:55:0x0123, B:56:0x0124, B:57:0x012b, B:41:0x00b3, B:42:0x00b6), top: B:69:0x0008 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date m23988i(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int m23987j = m23987j(str, index, i5);
            if (m23992e(str, i5, CoreConstants.DASH_CHAR)) {
                i5++;
            }
            int i6 = i5 + 2;
            int m23987j2 = m23987j(str, i5, i6);
            if (m23992e(str, i6, CoreConstants.DASH_CHAR)) {
                i6++;
            }
            int i7 = i6 + 2;
            int m23987j3 = m23987j(str, i6, i7);
            boolean m23992e = m23992e(str, i7, 'T');
            if (!m23992e && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(m23987j, m23987j2 - 1, m23987j3);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (m23992e) {
                int i8 = i7 + 1;
                int i9 = i8 + 2;
                int m23987j4 = m23987j(str, i8, i9);
                if (m23992e(str, i9, CoreConstants.COLON_CHAR)) {
                    i9++;
                }
                int i10 = i9 + 2;
                i2 = m23987j(str, i9, i10);
                if (m23992e(str, i10, CoreConstants.COLON_CHAR)) {
                    i10++;
                }
                if (str.length() > i10 && (charAt = str.charAt(i10)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i11 = i10 + 2;
                    i3 = m23987j(str, i10, i11);
                    if (i3 > 59 && i3 < 63) {
                        i3 = 59;
                    }
                    if (m23992e(str, i11, CoreConstants.DOT)) {
                        int i12 = i11 + 1;
                        int m23990g = m23990g(str, i12 + 1);
                        int min = Math.min(m23990g, i12 + 3);
                        int m23987j5 = m23987j(str, i12, min);
                        int i13 = min - i12;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                m23987j5 *= 10;
                            }
                        } else {
                            m23987j5 *= 100;
                        }
                        i = m23987j4;
                        i7 = m23990g;
                        i4 = m23987j5;
                    } else {
                        i4 = 0;
                        i7 = i11;
                        i = m23987j4;
                    }
                    if (str.length() <= i7) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 == 'Z') {
                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(f99734a);
                            gregorianCalendar2.setLenient(false);
                            gregorianCalendar2.set(1, m23987j);
                            gregorianCalendar2.set(2, m23987j2 - 1);
                            gregorianCalendar2.set(5, m23987j3);
                            gregorianCalendar2.set(11, i);
                            gregorianCalendar2.set(12, i2);
                            gregorianCalendar2.set(13, i3);
                            gregorianCalendar2.set(14, i4);
                            parsePosition.setIndex(i7 + 1);
                            return gregorianCalendar2.getTime();
                        }
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i = m23987j4;
                i7 = i10;
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = 0;
            i4 = 0;
            if (str.length() <= i7) {
            }
        } catch (IndexOutOfBoundsException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + "'";
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

    /* renamed from: j */
    public final int m23987j(String str, int i, int i2) throws NumberFormatException {
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

    @Override // p000.AbstractC31862Bb6
    /* renamed from: k */
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            return m23988i(nextString, new ParsePosition(0));
        } catch (ParseException e) {
            C33694Ix2.m101455d("ZendeskDateTypeAdapter", String.format(Locale.US, "Failed to parse Date from: %s", nextString), e, new Object[0]);
            return null;
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: l */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(m23991f(date));
        }
    }
}
