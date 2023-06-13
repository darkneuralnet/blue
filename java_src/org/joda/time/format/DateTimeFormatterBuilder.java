package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.connection.RealConnection;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
/* loaded from: classes8.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    /* loaded from: classes8.dex */
    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c) {
            this.iValue = c;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            char c = this.iValue;
            if (charAt != c && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(c)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return ~i;
            }
            return i + 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    /* loaded from: classes8.dex */
    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char charAt;
            int parseInto = super.parseInto(dateTimeParserBucket, charSequence, i);
            if (parseInto < 0) {
                return parseInto;
            }
            int i2 = this.iMaxParsedDigits + i;
            if (parseInto != i2) {
                if (this.iSigned && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                    i2++;
                }
                if (parseInto > i2) {
                    return ~(i2 + 1);
                }
                if (parseInto < i2) {
                    return ~parseInto;
                }
                return parseInto;
            }
            return parseInto;
        }
    }

    /* loaded from: classes8.dex */
    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.iFieldType = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.iMinDigits = i;
            this.iMaxDigits = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[LOOP:0: B:3:0x000a->B:27:0x0079, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private long[] getFractionData(long j, DateTimeField dateTimeField) {
            long j2;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i = this.iMaxDigits;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                            return new long[]{(j * j2) / unitMillis, i};
                        }
                        i--;
                    case 2:
                        j2 = 100;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 3:
                        j2 = 1000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 4:
                        j2 = AbstractComponentTracker.LINGERING_TIMEOUT;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 5:
                        j2 = 100000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 6:
                        j2 = 1000000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 7:
                        j2 = 10000000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 8:
                        j2 = 100000000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 9:
                        j2 = 1000000000;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 10:
                        j2 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 11:
                        j2 = 100000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                    default:
                        j2 = 1;
                        if ((unitMillis * j2) / j2 == unitMillis) {
                        }
                        break;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.iMaxDigits, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += (charAt - '0') * unitMillis;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return ~i;
            }
            if (j2 > 2147483647L) {
                return ~i;
            }
            dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
            return i + i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        public void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
            String l;
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long remainder = field.remainder(j);
                if (remainder != 0) {
                    long[] fractionData = getFractionData(remainder, field);
                    long j2 = fractionData[0];
                    int i2 = (int) fractionData[1];
                    if ((2147483647L & j2) == j2) {
                        l = Integer.toString((int) j2);
                    } else {
                        l = Long.toString(j2);
                    }
                    int length = l.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && l.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < l.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(l.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(l);
                    return;
                }
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    }
                    appendable.append('0');
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int estimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    InternalParser internalParser = internalParserArr[length];
                    if (internalParser != null && (estimateParsedLength = internalParser.estimateParsedLength()) > i) {
                        i = estimateParsedLength;
                    }
                } else {
                    this.iParsedLengthEstimate = i;
                    return;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            InternalParser[] internalParserArr = this.iParsers;
            int length = internalParserArr.length;
            Object saveState = dateTimeParserBucket.saveState();
            boolean z = false;
            Object obj = null;
            int i4 = i;
            int i5 = i4;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                InternalParser internalParser = internalParserArr[i6];
                if (internalParser == null) {
                    if (i4 <= i) {
                        return i;
                    }
                    z = true;
                } else {
                    int parseInto = internalParser.parseInto(dateTimeParserBucket, charSequence, i);
                    if (parseInto >= i) {
                        if (parseInto <= i4) {
                            continue;
                        } else if (parseInto >= charSequence.length() || (i3 = i6 + 1) >= length || internalParserArr[i3] == null) {
                            break;
                        } else {
                            obj = dateTimeParserBucket.saveState();
                            i4 = parseInto;
                        }
                    } else if (parseInto < 0 && (i2 = ~parseInto) > i5) {
                        i5 = i2;
                    }
                    dateTimeParserBucket.restoreState(saveState);
                    i6++;
                }
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (obj != null) {
                dateTimeParserBucket.restoreState(obj);
            }
            return i4;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            if (r10 <= '9') goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
            r5 = r5 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            boolean z;
            char charAt;
            int min = Math.min(this.iMaxParsedDigits, charSequence.length() - i);
            int i5 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i5 < min) {
                int i6 = i + i5;
                char charAt2 = charSequence.charAt(i6);
                if (i5 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.iSigned)) {
                    break;
                }
                boolean z4 = true;
                if (charAt2 == '-') {
                    z = true;
                } else {
                    z = false;
                }
                if (charAt2 != '+') {
                    z4 = false;
                }
                int i7 = i5 + 1;
                if (i7 < min && (charAt = charSequence.charAt(i6 + 1)) >= '0' && charAt <= '9') {
                    min = Math.min(min + 1, charSequence.length() - i);
                    i5 = i7;
                    boolean z5 = z;
                    z3 = z4;
                    z2 = z5;
                } else {
                    boolean z6 = z;
                    z3 = z4;
                    z2 = z6;
                    break;
                }
            }
            if (i5 == 0) {
                return ~i;
            }
            if (i5 >= 9) {
                if (z3) {
                    i3 = i + i5;
                    i4 = Integer.parseInt(charSequence.subSequence(i + 1, i3).toString());
                } else {
                    int i8 = i + i5;
                    i4 = Integer.parseInt(charSequence.subSequence(i, i8).toString());
                    i3 = i8;
                }
            } else {
                if (!z2 && !z3) {
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                int i9 = i2 + 1;
                try {
                    int charAt3 = charSequence.charAt(i2) - '0';
                    i3 = i + i5;
                    while (i9 < i3) {
                        i9++;
                        charAt3 = (((charAt3 << 3) + (charAt3 << 1)) + charSequence.charAt(i9)) - 48;
                    }
                    if (z2) {
                        i4 = -charAt3;
                    } else {
                        i4 = charAt3;
                    }
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i;
                }
            }
            dateTimeParserBucket.saveField(this.iFieldType, i4);
            return i3;
        }
    }

    /* loaded from: classes8.dex */
    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iValue)) {
                return i + this.iValue.length();
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    /* loaded from: classes8.dex */
    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;
        
        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String str : arrayList) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    indexOf = indexOf < str.length() ? indexOf + 1 : indexOf;
                    i2 = Math.max(i2, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(substring)) {
                        map.put(substring, new ArrayList());
                    }
                    map.get(substring).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
            MAX_PREFIX_LENGTH = i2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            String str;
            int i2;
            int i3;
            String str2;
            List<String> list = BASE_GROUPED_IDS;
            int length = charSequence.length();
            int min = Math.min(length, MAX_PREFIX_LENGTH + i);
            int i4 = i;
            while (true) {
                if (i4 < min) {
                    if (charSequence.charAt(i4) == '/') {
                        str = charSequence.subSequence(i, i4 + 1).toString();
                        i2 = str.length() + i;
                        if (i4 < length - 1) {
                            str2 = str + charSequence.charAt(i3);
                        } else {
                            str2 = str;
                        }
                        list = GROUPED_IDS.get(str2);
                        if (list == null) {
                            return ~i;
                        }
                    } else {
                        i4++;
                    }
                } else {
                    str = "";
                    i2 = i;
                    break;
                }
            }
            String str3 = null;
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str4 = list.get(i5);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i2, str4) && (str3 == null || str4.length() > str3.length())) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                dateTimeParserBucket.setZone(DateTimeZone.forID(str + str3));
                return i2 + str3.length();
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.iType;
            if (i != 0) {
                if (i != 1) {
                    return "";
                }
                return dateTimeZone.getShortName(j, locale);
            }
            return dateTimeZone.getName(j, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> map = this.iParseLookup;
            if (map == null) {
                map = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : map.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str != null) {
                dateTimeParserBucket.setZone(map.get(str));
                return i + str.length();
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j - i, dateTimeZone, locale));
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i > 0 && i2 >= i) {
                if (i > 4) {
                    i = 4;
                    i2 = 4;
                }
                this.iMinFields = i;
                this.iMaxFields = i2;
                return;
            }
            throw new IllegalArgumentException();
        }

        private int digitCount(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i = this.iMinFields;
            int i2 = (i + 1) << 1;
            if (this.iShowSeparators) {
                i2 += i - 1;
            }
            String str = this.iZeroOffsetPrintText;
            if (str != null && str.length() > i2) {
                return this.iZeroOffsetPrintText.length();
            }
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
            if (r6 <= '9') goto L36;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            boolean z;
            char charAt;
            int length = charSequence.length() - i;
            String str = this.iZeroOffsetParseText;
            boolean z2 = false;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((charAt = charSequence.charAt(i)) != '-' && charAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return i + this.iZeroOffsetParseText.length();
                }
            }
            if (length <= 1) {
                return ~i;
            }
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == '-') {
                z = true;
            } else if (charAt2 == '+') {
                z = false;
            } else {
                return ~i;
            }
            int i2 = length - 1;
            int i3 = i + 1;
            if (digitCount(charSequence, i3, 2) < 2) {
                return ~i3;
            }
            int parseTwoDigits = FormatUtils.parseTwoDigits(charSequence, i3);
            if (parseTwoDigits > 23) {
                return ~i3;
            }
            int i4 = parseTwoDigits * DateTimeConstants.MILLIS_PER_HOUR;
            int i5 = i2 - 2;
            int i6 = i3 + 2;
            if (i5 > 0) {
                char charAt3 = charSequence.charAt(i6);
                if (charAt3 == ':') {
                    i5--;
                    i6++;
                    z2 = true;
                } else if (charAt3 >= '0') {
                }
                int digitCount = digitCount(charSequence, i6, 2);
                if (digitCount != 0 || z2) {
                    if (digitCount < 2) {
                        return ~i6;
                    }
                    int parseTwoDigits2 = FormatUtils.parseTwoDigits(charSequence, i6);
                    if (parseTwoDigits2 > 59) {
                        return ~i6;
                    }
                    i4 += parseTwoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE;
                    int i7 = i5 - 2;
                    i6 += 2;
                    if (i7 > 0) {
                        if (z2) {
                            if (charSequence.charAt(i6) == ':') {
                                i7--;
                                i6++;
                            }
                        }
                        int digitCount2 = digitCount(charSequence, i6, 2);
                        if (digitCount2 != 0 || z2) {
                            if (digitCount2 < 2) {
                                return ~i6;
                            }
                            int parseTwoDigits3 = FormatUtils.parseTwoDigits(charSequence, i6);
                            if (parseTwoDigits3 > 59) {
                                return ~i6;
                            }
                            i4 += parseTwoDigits3 * 1000;
                            i6 += 2;
                            if (i7 - 2 > 0) {
                                if (z2) {
                                    if (charSequence.charAt(i6) == '.' || charSequence.charAt(i6) == ',') {
                                        i6++;
                                    }
                                }
                                int digitCount3 = digitCount(charSequence, i6, 3);
                                if (digitCount3 != 0 || z2) {
                                    if (digitCount3 < 1) {
                                        return ~i6;
                                    }
                                    int i8 = i6 + 1;
                                    i4 += (charSequence.charAt(i6) - '0') * 100;
                                    if (digitCount3 > 1) {
                                        i6 = i8 + 1;
                                        i4 += (charSequence.charAt(i8) - '0') * 10;
                                        if (digitCount3 > 2) {
                                            i4 += charSequence.charAt(i6) - '0';
                                            i6++;
                                        }
                                    } else {
                                        i6 = i8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                i4 = -i4;
            }
            dateTimeParserBucket.setOffset(Integer.valueOf(i4));
            return i6;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append(CoreConstants.DASH_CHAR);
                i = -i;
            }
            int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i2, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i3 != 0 || this.iMinFields > 1) {
                int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(CoreConstants.COLON_CHAR);
                }
                FormatUtils.appendPaddedInteger(appendable, i4, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i5 != 0 || this.iMinFields > 2) {
                    int i6 = i5 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(CoreConstants.COLON_CHAR);
                    }
                    FormatUtils.appendPaddedInteger(appendable, i6, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i7 = i5 - (i6 * 1000);
                    if (i7 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append(CoreConstants.DOT);
                        }
                        FormatUtils.appendPaddedInteger(appendable, i7, 3);
                    }
                }
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            appendable.append((char) 65533);
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object obj = this.iFormatter;
        if (obj == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj2 = this.iElementPairs.get(0);
                Object obj3 = this.iElementPairs.get(1);
                if (obj2 != null) {
                    if (obj2 == obj3 || obj3 == null) {
                        obj = obj2;
                    }
                } else {
                    obj = obj3;
                }
            }
            if (obj == null) {
                obj = new Composite(this.iElementPairs);
            }
            this.iFormatter = obj;
        }
        return obj;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (obj instanceof InternalParser) {
            if (obj instanceof Composite) {
                return ((Composite) obj).isParser();
            }
            return true;
        }
        return false;
    }

    private boolean isPrinter(Object obj) {
        if (obj instanceof InternalPrinter) {
            if (obj instanceof Composite) {
                return ((Composite) obj).isPrinter();
            }
            return true;
        }
        return false;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                if (i <= 1) {
                    return append0(new UnpaddedNumber(dateTimeFieldType, i2, false));
                }
                return append0(new PaddedNumber(dateTimeFieldType, i2, false, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            if (i > 0) {
                return append0(new FixedNumber(dateTimeFieldType, i, false));
            }
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            if (i > 0) {
                return append0(new FixedNumber(dateTimeFieldType, i, true));
            }
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return append0(new Fraction(dateTimeFieldType, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.m20424of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                if (i <= 1) {
                    return append0(new UnpaddedNumber(dateTimeFieldType, i2, true));
                }
                return append0(new PaddedNumber(dateTimeFieldType, i2, true, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        InternalPrinter internalPrinter;
        Object formatter = getFormatter();
        InternalParser internalParser = null;
        if (isPrinter(formatter)) {
            internalPrinter = (InternalPrinter) formatter;
        } else {
            internalPrinter = null;
        }
        if (isParser(formatter)) {
            internalParser = (InternalParser) formatter;
        }
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.m20422of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.m20421of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    /* loaded from: classes8.dex */
    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            if (this.iShort) {
                return field.getAsShortText(j, locale);
            }
            return field.getAsText(j, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int intValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> map2 = cParseCache.get(locale);
            if (map2 == null) {
                map2 = new ConcurrentHashMap<>();
                cParseCache.put(locale, map2);
            }
            Object[] objArr = map2.get(this.iFieldType);
            if (objArr == null) {
                map = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                intValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    map.put(asShortText, bool);
                    map.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    map.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    map.put(property.getAsText(locale), bool);
                    map.put(property.getAsText(locale).toLowerCase(locale), bool);
                    map.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    map.put("BCE", bool2);
                    map.put("bce", bool2);
                    map.put("CE", bool2);
                    map.put("ce", bool2);
                    intValue = 3;
                }
                map2.put(this.iFieldType, new Object[]{map, Integer.valueOf(intValue)});
            } else {
                intValue = ((Integer) objArr[1]).intValue();
                map = (Map) objArr[0];
            }
            for (int min = Math.min(charSequence.length(), intValue + i); min > i; min--) {
                String charSequence2 = charSequence.subSequence(i, min).toString();
                if (map.containsKey(charSequence2)) {
                    dateTimeParserBucket.saveField(this.iFieldType, charSequence2, locale);
                    return min;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
                if (this.iShort) {
                    return field.getAsShortText(readablePartial, locale);
                }
                return field.getAsText(readablePartial, locale);
            }
            return "�";
        }
    }

    /* loaded from: classes8.dex */
    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z;
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int length = charSequence.length() - i;
            int i6 = 0;
            if (!this.iLenientParse) {
                if (Math.min(2, length) < 2) {
                    return ~i;
                }
            } else {
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < length) {
                    char charAt = charSequence.charAt(i + i7);
                    if (i7 == 0 && (charAt == '-' || charAt == '+')) {
                        if (charAt == '-') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7++;
                        } else {
                            i++;
                            length--;
                        }
                        z = true;
                    } else if (charAt < '0' || charAt > '9') {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 == 0) {
                    return ~i;
                }
                if (z || i7 != 2) {
                    if (i7 >= 9) {
                        i3 = i7 + i;
                        i4 = Integer.parseInt(charSequence.subSequence(i, i3).toString());
                    } else {
                        if (z2) {
                            i2 = i + 1;
                        } else {
                            i2 = i;
                        }
                        int i8 = i2 + 1;
                        try {
                            int charAt2 = charSequence.charAt(i2) - '0';
                            i3 = i7 + i;
                            while (i8 < i3) {
                                i8++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + charSequence.charAt(i8)) - 48;
                            }
                            if (z2) {
                                i4 = -charAt2;
                            } else {
                                i4 = charAt2;
                            }
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i4);
                    return i3;
                }
            }
            char charAt3 = charSequence.charAt(i);
            if (charAt3 >= '0' && charAt3 <= '9') {
                int i9 = charAt3 - '0';
                char charAt4 = charSequence.charAt(i + 1);
                if (charAt4 >= '0' && charAt4 <= '9') {
                    int i10 = (((i9 << 3) + (i9 << 1)) + charAt4) - 48;
                    int i11 = this.iPivot;
                    if (dateTimeParserBucket.getPivotYear() != null) {
                        i11 = dateTimeParserBucket.getPivotYear().intValue();
                    }
                    int i12 = i11 - 50;
                    if (i12 >= 0) {
                        i5 = i12 % 100;
                    } else {
                        i5 = ((i12 + 1) % 100) + 99;
                    }
                    if (i10 < i5) {
                        i6 = 100;
                    }
                    dateTimeParserBucket.saveField(this.iType, i10 + ((i12 + i6) - i5));
                    return i + 2;
                }
                return ~i;
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (readablePartial.isSupported(this.iType)) {
                try {
                    int i = readablePartial.get(this.iType);
                    if (i < 0) {
                        i = -i;
                    }
                    return i % 100;
                } catch (RuntimeException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                if (length != 1) {
                    return append0(new StringLiteral(str));
                }
                return append0(new CharacterLiteral(str.charAt(0)));
            }
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str2, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z));
    }

    /* loaded from: classes8.dex */
    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.iMinPrintedDigits = i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                    return;
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    /* loaded from: classes8.dex */
    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                    appendable.append((char) 65533);
                    return;
                }
            }
            appendable.append((char) 65533);
        }
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.m20423of(dateTimePrinter), null);
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    /* loaded from: classes8.dex */
    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (!arrayList.contains(null) && !arrayList.isEmpty()) {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i2);
                    i += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i2] = internalPrinter;
                }
                this.iPrintedLengthEstimate = i;
            } else {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            }
            if (!arrayList2.contains(null) && !arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                this.iParsers = new InternalParser[size2];
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    InternalParser internalParser = (InternalParser) arrayList2.get(i4);
                    i3 += internalParser.estimateParsedLength();
                    this.iParsers[i4] = internalParser;
                }
                this.iParsedLengthEstimate = i3;
                return;
            }
            this.iParsers = null;
            this.iParsedLengthEstimate = 0;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr != null) {
                int length = internalParserArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = internalParserArr[i2].parseInto(dateTimeParserBucket, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                Locale locale2 = locale == null ? Locale.getDefault() : locale;
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, j, chronology, i, dateTimeZone, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.m20424of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.m20423of(dateTimePrinter), DateTimeParserInternalParser.m20424of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i = 0;
            if (length == 1) {
                if (dateTimeParserArr[0] != null) {
                    return append0(DateTimePrinterInternalPrinter.m20423of(dateTimePrinter), DateTimeParserInternalParser.m20424of(dateTimeParserArr[0]));
                }
                throw new IllegalArgumentException("No parser supplied");
            }
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i < length - 1) {
                InternalParser m20424of = DateTimeParserInternalParser.m20424of(dateTimeParserArr[i]);
                internalParserArr[i] = m20424of;
                if (m20424of == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i++;
            }
            internalParserArr[i] = DateTimeParserInternalParser.m20424of(dateTimeParserArr[i]);
            return append0(DateTimePrinterInternalPrinter.m20423of(dateTimePrinter), new MatchingParser(internalParserArr));
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
}
