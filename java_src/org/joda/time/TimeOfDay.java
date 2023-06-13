package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;
@Deprecated
/* loaded from: classes8.dex */
public final class TimeOfDay extends BasePartial {
    public static final int HOUR_OF_DAY = 0;
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 3633353405803318660L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()};
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);

    public TimeOfDay() {
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static TimeOfDay fromDateFields(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static TimeOfDay fromMillisOfDay(long j) {
        return fromMillisOfDay(j, null);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i, Chronology chronology) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return chronology.millisOfSecond();
                    }
                    throw new IndexOutOfBoundsException("Invalid index: " + i);
                }
                return chronology.secondOfMinute();
            }
            return chronology.minuteOfHour();
        }
        return chronology.hourOfDay();
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getHourOfDay() {
        return getValue(0);
    }

    public int getMillisOfSecond() {
        return getValue(3);
    }

    public int getMinuteOfHour() {
        return getValue(1);
    }

    public int getSecondOfMinute() {
        return getValue(2);
    }

    public Property hourOfDay() {
        return new Property(this, 0);
    }

    public Property millisOfSecond() {
        return new Property(this, 3);
    }

    public TimeOfDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public TimeOfDay minusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(i));
    }

    public Property minuteOfHour() {
        return new Property(this, 1);
    }

    public TimeOfDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public TimeOfDay plusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), i);
    }

    public TimeOfDay plusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), i);
    }

    public TimeOfDay plusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), i);
    }

    public TimeOfDay plusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public Property secondOfMinute() {
        return new Property(this, 2);
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        return ISODateTimeFormat.tTime().print(this);
    }

    public TimeOfDay withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, withUTC);
        withUTC.validate(timeOfDay, getValues());
        return timeOfDay;
    }

    public TimeOfDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new TimeOfDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i));
    }

    public TimeOfDay withHourOfDay(int i) {
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, getValues(), i));
    }

    public TimeOfDay withMillisOfSecond(int i) {
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, getValues(), i));
    }

    public TimeOfDay withMinuteOfHour(int i) {
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, getValues(), i));
    }

    public TimeOfDay withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null && i != 0) {
            int[] values = getValues();
            for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
                int indexOf = indexOf(readablePeriod.getFieldType(i2));
                if (indexOf >= 0) {
                    values = getField(indexOf).addWrapPartial(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i2), i));
                }
            }
            return new TimeOfDay(this, values);
        }
        return this;
    }

    public TimeOfDay withSecondOfMinute(int i) {
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, getValues(), i));
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static TimeOfDay fromMillisOfDay(long j, Chronology chronology) {
        return new TimeOfDay(j, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(dateTimeZone);
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    @Deprecated
    /* loaded from: classes8.dex */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public Property(TimeOfDay timeOfDay, int i) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i;
        }

        public TimeOfDay addNoWrapToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().add(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapPartial(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addWrapFieldToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapField(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay() {
            return this.iTimeOfDay;
        }

        public TimeOfDay setCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public TimeOfDay setCopy(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), str, locale));
        }

        public TimeOfDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public TimeOfDay(Chronology chronology) {
        super(chronology);
    }

    public TimeOfDay(long j) {
        super(j);
    }

    public TimeOfDay(long j, Chronology chronology) {
        super(j, chronology);
    }

    public TimeOfDay(Object obj) {
        super(obj, null, ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(int i, int i2) {
        this(i, i2, 0, 0, null);
    }

    public TimeOfDay(int i, int i2, Chronology chronology) {
        this(i, i2, 0, 0, chronology);
    }

    public TimeOfDay(int i, int i2, int i3) {
        this(i, i2, i3, 0, null);
    }

    public TimeOfDay(int i, int i2, int i3, Chronology chronology) {
        this(i, i2, i3, 0, chronology);
    }

    public TimeOfDay(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4, Chronology chronology) {
        super(new int[]{i, i2, i3, i4}, chronology);
    }

    public TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super(timeOfDay, iArr);
    }

    public TimeOfDay(TimeOfDay timeOfDay, Chronology chronology) {
        super((BasePartial) timeOfDay, chronology);
    }
}
