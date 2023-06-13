package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTimeFieldType;
/* loaded from: classes8.dex */
public class ISODateTimeFormat {

    /* loaded from: classes8.dex */
    public static final class Constants {

        /* renamed from: ye */
        private static final DateTimeFormatter f102652ye = yearElement();
        private static final DateTimeFormatter mye = monthElement();
        private static final DateTimeFormatter dme = dayOfMonthElement();

        /* renamed from: we */
        private static final DateTimeFormatter f102650we = weekyearElement();
        private static final DateTimeFormatter wwe = weekElement();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter hde = hourElement();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter sme = secondElement();
        private static final DateTimeFormatter fse = fractionElement();

        /* renamed from: ze */
        private static final DateTimeFormatter f102654ze = offsetElement();
        private static final DateTimeFormatter lte = literalTElement();

        /* renamed from: ym */
        private static final DateTimeFormatter f102653ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();

        /* renamed from: ww */
        private static final DateTimeFormatter f102651ww = weekyearWeek();
        private static final DateTimeFormatter wwd = weekyearWeekDay();

        /* renamed from: hm */
        private static final DateTimeFormatter f102644hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();

        /* renamed from: dh */
        private static final DateTimeFormatter f102641dh = dateHour();
        private static final DateTimeFormatter dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();

        /* renamed from: t */
        private static final DateTimeFormatter f102646t = time();

        /* renamed from: tx */
        private static final DateTimeFormatter f102649tx = timeNoMillis();

        /* renamed from: tt */
        private static final DateTimeFormatter f102648tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();

        /* renamed from: dt */
        private static final DateTimeFormatter f102643dt = dateTime();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();

        /* renamed from: od */
        private static final DateTimeFormatter f102645od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();

        /* renamed from: bd */
        private static final DateTimeFormatter f102639bd = basicDate();

        /* renamed from: bt */
        private static final DateTimeFormatter f102640bt = basicTime();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        private static final DateTimeFormatter bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        private static final DateTimeFormatter bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        private static final DateTimeFormatter dpe = dateElementParser();
        private static final DateTimeFormatter tpe = timeElementParser();

        /* renamed from: dp */
        private static final DateTimeFormatter f102642dp = dateParser();
        private static final DateTimeFormatter ldp = localDateParser();

        /* renamed from: tp */
        private static final DateTimeFormatter f102647tp = timeParser();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = f102639bd;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = bod;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = f102640bt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = bwd;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = dpe;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = f102641dh;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = dhm;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = f102642dp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = f102643dt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = dme;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfMonth(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfWeek(1).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = dye;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfYear(3).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = fse;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 9).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = hde;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = f102644hm;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 3).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = lte;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral('T').toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            if (dateTimeFormatter == null) {
                return dateElementParser().withZoneUTC();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = mhe;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendMinuteOfHour(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = mye;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendMonthOfYear(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = f102654ze;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = f102645od;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendSecondOfMinute(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = f102648tt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = f102646t;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = tpe;
            if (dateTimeFormatter == null) {
                DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DOT).toParser(), new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COMMA_CHAR).toParser()}).toParser();
                return new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = f102649tx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = f102647tp;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = wwe;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = f102650we;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = f102651ww;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = wwd;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = f102652ye;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = f102653ym;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter();
            }
            return dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            if (dateTimeFormatter == null) {
                return new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter();
            }
            return dateTimeFormatter;
        }
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        if (z) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.f102639bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.f102640bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z) {
        if (z) {
            throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.f102652ye);
            if (collection.remove(DateTimeFieldType.monthOfYear())) {
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendMonthOfYear(2);
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                } else {
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendMonthOfYear(2);
                    return true;
                }
            } else if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            } else {
                checkNotStrictISO(collection, z2);
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                dateTimeFormatterBuilder.appendDayOfMonth(2);
            }
        } else if (collection.remove(DateTimeFieldType.monthOfYear())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
        } else if (collection.remove(DateTimeFieldType.dayOfMonth())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
        }
        return false;
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.f102652ye);
            if (collection.remove(DateTimeFieldType.dayOfYear())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfYear(3);
            } else {
                return true;
            }
        } else if (collection.remove(DateTimeFieldType.dayOfYear())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendDayOfYear(3);
        }
        return false;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.weekyear())) {
            dateTimeFormatterBuilder.append(Constants.f102650we);
            if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
                if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                    return true;
                }
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfWeek(1);
            } else if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            } else {
                checkNotStrictISO(collection, z2);
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                dateTimeFormatterBuilder.appendDayOfWeek(1);
            }
        } else if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
        } else if (collection.remove(DateTimeFieldType.dayOfWeek())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
        }
        return false;
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.f102641dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.f102642dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.f102643dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DateTimeFormatter forFields(Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        boolean z3;
        boolean dateByWeek;
        boolean z4;
        if (collection != null && collection.size() != 0) {
            HashSet hashSet = new HashSet(collection);
            int size = hashSet.size();
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            if (hashSet.contains(DateTimeFieldType.monthOfYear())) {
                dateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
            } else if (hashSet.contains(DateTimeFieldType.dayOfYear())) {
                dateByWeek = dateByOrdinal(dateTimeFormatterBuilder, hashSet, z, z2);
            } else if (hashSet.contains(DateTimeFieldType.weekOfWeekyear())) {
                dateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
            } else if (hashSet.contains(DateTimeFieldType.dayOfMonth())) {
                dateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z2);
            } else if (hashSet.contains(DateTimeFieldType.dayOfWeek())) {
                dateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z2);
            } else {
                if (hashSet.remove(DateTimeFieldType.year())) {
                    dateTimeFormatterBuilder.append(Constants.f102652ye);
                } else if (hashSet.remove(DateTimeFieldType.weekyear())) {
                    dateTimeFormatterBuilder.append(Constants.f102650we);
                } else {
                    z3 = false;
                    if (hashSet.size() < size) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    time(dateTimeFormatterBuilder, hashSet, z, z2, z3, z4);
                    if (dateTimeFormatterBuilder.canBuildFormatter()) {
                        try {
                            collection.retainAll(hashSet);
                        } catch (UnsupportedOperationException unused) {
                        }
                        return dateTimeFormatterBuilder.toFormatter();
                    }
                    throw new IllegalArgumentException("No valid format for fields: " + collection);
                }
                z3 = true;
                if (hashSet.size() < size) {
                }
                time(dateTimeFormatterBuilder, hashSet, z, z2, z3, z4);
                if (dateTimeFormatterBuilder.canBuildFormatter()) {
                }
            }
            z3 = dateByWeek;
            if (hashSet.size() < size) {
            }
            time(dateTimeFormatterBuilder, hashSet, z, z2, z3, z4);
            if (dateTimeFormatterBuilder.canBuildFormatter()) {
            }
        } else {
            throw new IllegalArgumentException("The fields must not be null or empty");
        }
    }

    public static DateTimeFormatter hour() {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.f102644hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.f102645od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.f102648tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean remove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean remove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean remove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean remove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (remove || remove2 || remove3 || remove4) {
            if (remove || remove2 || remove3 || remove4) {
                if (z2 && z3) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + collection);
                } else if (z4) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!remove || !remove2 || !remove3) && (!remove || remove3 || remove4)) {
                if (z2 && z4) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + collection);
                } else if ((remove || ((!remove2 || !remove3) && ((!remove2 || remove4) && !remove3))) && z2) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
                }
            }
            if (remove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (remove2 || remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (z && remove && remove2) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (remove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (z && remove2 && remove3) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (remove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (remove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (remove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DOT);
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.f102649tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.f102647tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.f102650we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.f102651ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.f102652ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.f102653ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }

    public static DateTimeFormatter time() {
        return Constants.f102646t;
    }
}
