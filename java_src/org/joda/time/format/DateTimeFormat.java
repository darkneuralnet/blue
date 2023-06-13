package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
/* loaded from: classes8.dex */
public class DateTimeFormat {
    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    /* loaded from: classes8.dex */
    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i, int i2, int i3, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i + (i2 << 4) + (i3 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            if (locale == null) {
                if (styleFormatterCacheKey.locale != null) {
                    return false;
                }
            } else if (!locale.equals(styleFormatterCacheKey.locale)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int i = (this.combinedTypeAndStyle + 31) * 31;
            Locale locale = this.locale;
            if (locale == null) {
                hashCode = 0;
            } else {
                hashCode = locale.hashCode();
            }
            return i + hashCode;
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = 1;
        } else if (i2 == 4) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        StyleFormatter styleFormatter = new StyleFormatter(i, i2, i3);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter putIfAbsent;
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(str);
            if (dateTimeFormatter == null) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                parsePatternTo(dateTimeFormatterBuilder, str);
                DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
                if (concurrentHashMap.size() < 500 && (putIfAbsent = concurrentHashMap.putIfAbsent(str, formatter)) != null) {
                    return putIfAbsent;
                }
                return formatter;
            }
            return dateTimeFormatter;
        }
        throw new IllegalArgumentException("Invalid pattern specification");
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str != null && str.length() == 2) {
            int selectStyle = selectStyle(str.charAt(0));
            int selectStyle2 = selectStyle(str.charAt(1));
            if (selectStyle == 4 && selectStyle2 == 4) {
                throw new IllegalArgumentException("Style '--' is invalid");
            }
            return createFormatterForStyleIndex(selectStyle, selectStyle2);
        }
        throw new IllegalArgumentException("Invalid style specification: " + str);
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i, int i2) {
        int i3 = (i << 2) + i + i2;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i3 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i, i2);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i3);
        if (dateTimeFormatter == null) {
            DateTimeFormatter createDateTimeFormatter = createDateTimeFormatter(i, i2);
            if (!JS5.m100428a(atomicReferenceArray, i3, null, createDateTimeFormatter)) {
                return atomicReferenceArray.get(i3);
            }
            return createDateTimeFormatter;
        }
        return dateTimeFormatter;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                    }
                    break;
            }
        }
        return false;
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String parseToken = parseToken(str, iArr);
            int i2 = iArr[0];
            int length2 = parseToken.length();
            if (length2 != 0) {
                char charAt = parseToken.charAt(0);
                if (charAt != '\'') {
                    if (charAt != 'K') {
                        if (charAt != 'M') {
                            if (charAt != 'S') {
                                if (charAt != 'a') {
                                    if (charAt != 'h') {
                                        if (charAt != 'k') {
                                            if (charAt != 'm') {
                                                if (charAt != 's') {
                                                    if (charAt != 'G') {
                                                        if (charAt != 'H') {
                                                            if (charAt != 'Y') {
                                                                if (charAt != 'Z') {
                                                                    if (charAt != 'd') {
                                                                        if (charAt != 'e') {
                                                                            switch (charAt) {
                                                                                case 'C':
                                                                                    dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                                                                    break;
                                                                                case 'D':
                                                                                    dateTimeFormatterBuilder.appendDayOfYear(length2);
                                                                                    break;
                                                                                case 'E':
                                                                                    if (length2 >= 4) {
                                                                                        dateTimeFormatterBuilder.appendDayOfWeekText();
                                                                                        break;
                                                                                    } else {
                                                                                        dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    switch (charAt) {
                                                                                        case 'w':
                                                                                            dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                                                                            break;
                                                                                        case 'x':
                                                                                        case 'y':
                                                                                            break;
                                                                                        case 'z':
                                                                                            if (length2 >= 4) {
                                                                                                dateTimeFormatterBuilder.appendTimeZoneName();
                                                                                                break;
                                                                                            } else {
                                                                                                dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                                                                                break;
                                                                                            }
                                                                                        default:
                                                                                            throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            dateTimeFormatterBuilder.appendDayOfWeek(length2);
                                                                        }
                                                                    } else {
                                                                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                                                                    }
                                                                } else if (length2 == 1) {
                                                                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                                                                } else if (length2 == 2) {
                                                                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendTimeZoneId();
                                                                }
                                                            }
                                                            if (length2 == 2) {
                                                                if (i2 + 1 < length) {
                                                                    iArr[0] = iArr[0] + 1;
                                                                    z = !isNumericToken(parseToken(str, iArr));
                                                                    iArr[0] = iArr[0] - 1;
                                                                } else {
                                                                    z = true;
                                                                }
                                                                if (charAt != 'x') {
                                                                    dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                                                                }
                                                            } else {
                                                                int i3 = 9;
                                                                if (i2 + 1 < length) {
                                                                    iArr[0] = iArr[0] + 1;
                                                                    if (isNumericToken(parseToken(str, iArr))) {
                                                                        i3 = length2;
                                                                    }
                                                                    iArr[0] = iArr[0] - 1;
                                                                }
                                                                if (charAt != 'Y') {
                                                                    if (charAt != 'x') {
                                                                        if (charAt == 'y') {
                                                                            dateTimeFormatterBuilder.appendYear(length2, i3);
                                                                        }
                                                                    } else {
                                                                        dateTimeFormatterBuilder.appendWeekyear(length2, i3);
                                                                    }
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendYearOfEra(length2, i3);
                                                                }
                                                            }
                                                        } else {
                                                            dateTimeFormatterBuilder.appendHourOfDay(length2);
                                                        }
                                                    } else {
                                                        dateTimeFormatterBuilder.appendEraText();
                                                    }
                                                } else {
                                                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                                                }
                                            } else {
                                                dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                                            }
                                        } else {
                                            dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                                        }
                                    } else {
                                        dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                                    }
                                } else {
                                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                                }
                            } else {
                                dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                            }
                        } else if (length2 >= 3) {
                            if (length2 >= 4) {
                                dateTimeFormatterBuilder.appendMonthOfYearText();
                            } else {
                                dateTimeFormatterBuilder.appendMonthOfYearShortText();
                            }
                        } else {
                            dateTimeFormatterBuilder.appendMonthOfYear(length2);
                        }
                    } else {
                        dateTimeFormatterBuilder.appendHourOfHalfday(length2);
                    }
                } else {
                    String substring = parseToken.substring(1);
                    if (substring.length() == 1) {
                        dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                    } else {
                        dateTimeFormatterBuilder.appendLiteral(new String(substring));
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private static String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 < length && str.charAt(i3) == '\'') {
                        sb.append(charAt2);
                        i = i3;
                    } else {
                        z = !z;
                    }
                } else if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i--;
                    break;
                } else {
                    sb.append(charAt2);
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter createFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) createFormatterForStyle.getPrinter0()).getPattern(locale);
    }

    private static int selectStyle(char c) {
        if (c != '-') {
            if (c != 'F') {
                if (c != 'S') {
                    if (c != 'L') {
                        if (c == 'M') {
                            return 2;
                        }
                        throw new IllegalArgumentException("Invalid style character: " + c);
                    }
                    return 1;
                }
                return 3;
            }
            return 0;
        }
        return 4;
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }

    /* loaded from: classes8.dex */
    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        public StyleFormatter(int i, int i2, int i3) {
            this.iDateStyle = i;
            this.iTimeStyle = i2;
            this.iType = i3;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            if (dateTimeFormatter == null) {
                DateTimeFormatter forPattern = DateTimeFormat.forPattern(getPattern(locale));
                DateTimeFormatter putIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, forPattern);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return forPattern;
            }
            return dateTimeFormatter;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        public String getPattern(Locale locale) {
            DateFormat dateInstance;
            int i = this.iType;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        dateInstance = null;
                    } else {
                        dateInstance = DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
                    }
                } else {
                    dateInstance = DateFormat.getTimeInstance(this.iTimeStyle, locale);
                }
            } else {
                dateInstance = DateFormat.getDateInstance(this.iDateStyle, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, j, chronology, i, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }
}
