package org.joda.time.format;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
/* loaded from: classes8.dex */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.m20423of(dateTimePrinter), DateTimeParserInternalParser.m20424of(dateTimeParser));
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone != null) {
            return chronology2.withZone(dateTimeZone);
        }
        return chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.m20422of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.m20421of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    public DateTime parseDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                    selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
                }
                DateTime dateTime = new DateTime(computeMillis, selectChronology);
                DateTimeZone dateTimeZone = this.iZone;
                if (dateTimeZone != null) {
                    return dateTime.withZone(dateTimeZone);
                }
                return dateTime;
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i) {
        InternalParser requireParser = requireParser();
        if (readWritableInstant != null) {
            long millis = readWritableInstant.getMillis();
            Chronology chronology = readWritableInstant.getChronology();
            int i2 = DateTimeUtils.getChronology(chronology).year().get(millis);
            long offset = millis + chronology.getZone().getOffset(millis);
            Chronology selectChronology = selectChronology(chronology);
            DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(offset, selectChronology, this.iLocale, this.iPivotYear, i2);
            int parseInto = requireParser.parseInto(dateTimeParserBucket, str, i);
            readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
            }
            readWritableInstant.setChronology(selectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                readWritableInstant.setZone(dateTimeZone);
            }
            return parseInto;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology withUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, withUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (dateTimeParserBucket.getOffsetInteger() != null) {
                    withUTC = withUTC.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    withUTC = withUTC.withZone(dateTimeParserBucket.getZone());
                }
                return new LocalDateTime(computeMillis, withUTC);
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    public MutableDateTime parseMutableDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                    selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
                }
                MutableDateTime mutableDateTime = new MutableDateTime(computeMillis, selectChronology);
                DateTimeZone dateTimeZone = this.iZone;
                if (dateTimeZone != null) {
                    mutableDateTime.setZone(dateTimeZone);
                }
                return mutableDateTime;
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        if (this.iChrono == chronology) {
            return this;
        }
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (locale != getLocale() && (locale == null || !locale.equals(getLocale()))) {
            return new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
        }
        return this;
    }

    public DateTimeFormatter withOffsetParsed() {
        if (this.iOffsetParsed) {
            return this;
        }
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == null ? Long.MIN_VALUE : (long) num2.intValue()) == (num != null ? (long) num.intValue() : Long.MIN_VALUE) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        if (this.iZone == dateTimeZone) {
            return this;
        }
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
    }

    public void printTo(StringBuilder sb, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public String print(long j) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public DateTimeFormatter withPivotYear(int i) {
        return withPivotYear(Integer.valueOf(i));
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, long j) {
        try {
            printTo((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, long j) {
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, long j) throws IOException {
        printTo((Appendable) writer, j);
    }

    public void printTo(Appendable appendable, long j) throws IOException {
        printTo(appendable, j, null);
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i;
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter requirePrinter = requirePrinter();
        if (readablePartial != null) {
            requirePrinter.printTo(appendable, readablePartial, this.iLocale);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    private void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
        InternalPrinter requirePrinter = requirePrinter();
        Chronology selectChronology = selectChronology(chronology);
        DateTimeZone zone = selectChronology.getZone();
        int offset = zone.getOffset(j);
        long j2 = offset;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j3 = j;
        }
        requirePrinter.printTo(appendable, j3, selectChronology.withUTC(), offset, zone, this.iLocale);
    }
}
