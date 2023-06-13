package org.joda.time.chrono;

import ch.qos.logback.core.CoreConstants;
import org.joda.time.Chronology;
/* loaded from: classes8.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final long serialVersionUID = 538276888268L;
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += MIN_DAYS_PER_MONTH_ARRAY[i] * CoreConstants.MILLIS_IN_ONE_DAY;
            int i2 = i + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j;
            j2 += MAX_DAYS_PER_MONTH_ARRAY[i] * CoreConstants.MILLIS_IN_ONE_DAY;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j2;
            i = i2;
        }
    }

    public BasicGJChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i) {
        return MAX_DAYS_PER_MONTH_ARRAY[i - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMaxForSet(long j, int i) {
        if (i > 28 || i < 1) {
            return getDaysInMonthMax(j);
        }
        return 28;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i, int i2) {
        if (isLeapYear(i)) {
            return MAX_DAYS_PER_MONTH_ARRAY[i2 - 1];
        }
        return MIN_DAYS_PER_MONTH_ARRAY[i2 - 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r13 < 5062500) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r13 < 12825000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r13 < 20587500) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r13 < 28265625) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (r13 < 4978125) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
        if (r13 < 12740625) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
        if (r13 < 20503125) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
        if (r13 < 28181250) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a8, code lost:
        return 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 11;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMonthOfYear(long j, int i) {
        int yearMillis = (int) ((j - getYearMillis(i)) >> 10);
        if (isLeapYear(i)) {
            if (yearMillis < 15356250) {
                if (yearMillis < 7678125) {
                    if (yearMillis >= 2615625) {
                    }
                    return 1;
                }
                if (yearMillis >= 10209375) {
                }
                return 4;
            } else if (yearMillis < 23118750) {
                if (yearMillis >= 17971875) {
                }
                return 7;
            } else if (yearMillis < 25734375) {
                return 10;
            }
        } else if (yearMillis < 15271875) {
            if (yearMillis < 7593750) {
                if (yearMillis >= 2615625) {
                }
                return 1;
            }
            if (yearMillis >= 10125000) {
            }
            return 4;
        } else if (yearMillis < 23034375) {
            if (yearMillis >= 17887500) {
            }
            return 7;
        } else if (yearMillis < 25650000) {
            return 10;
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i, int i2) {
        if (isLeapYear(i)) {
            return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
        }
        return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        long yearMillis = j - getYearMillis(year);
        long yearMillis2 = j2 - getYearMillis(year2);
        if (yearMillis2 >= FEB_29) {
            if (isLeapYear(year2)) {
                if (!isLeapYear(year)) {
                    yearMillis2 -= CoreConstants.MILLIS_IN_ONE_DAY;
                }
            } else if (yearMillis >= FEB_29 && isLeapYear(year)) {
                yearMillis -= CoreConstants.MILLIS_IN_ONE_DAY;
            }
        }
        int i = year - year2;
        if (yearMillis < yearMillis2) {
            i--;
        }
        return i;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j) {
        return dayOfMonth().get(j) == 29 && monthOfYear().isLeap(j);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j, int i) {
        int year = getYear(j);
        int dayOfYear = getDayOfYear(j, year);
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                if (!isLeapYear(i)) {
                    dayOfYear--;
                }
            } else if (isLeapYear(i)) {
                dayOfYear++;
            }
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + millisOfDay;
    }
}
