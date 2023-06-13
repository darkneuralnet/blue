package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
/* loaded from: classes8.dex */
public abstract class AbstractPartial implements ReadablePartial, Comparable<ReadablePartial> {
    @Override // org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePartial)) {
            return false;
        }
        ReadablePartial readablePartial = (ReadablePartial) obj;
        if (size() != readablePartial.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != readablePartial.getValue(i) || getFieldType(i) != readablePartial.getFieldType(i)) {
                return false;
            }
        }
        return FieldUtils.equals(getChronology(), readablePartial.getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public DateTimeField getField(int i) {
        return getField(i, getChronology());
    }

    public abstract DateTimeField getField(int i, Chronology chronology);

    @Override // org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i) {
        return getField(i, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i = 0; i < size; i++) {
            dateTimeFieldTypeArr[i] = getFieldType(i);
        }
        return dateTimeFieldTypeArr;
    }

    public DateTimeField[] getFields() {
        int size = size();
        DateTimeField[] dateTimeFieldArr = new DateTimeField[size];
        for (int i = 0; i < size; i++) {
            dateTimeFieldArr[i] = getField(i);
        }
        return dateTimeFieldArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    @Override // org.joda.time.ReadablePartial
    public int hashCode() {
        int size = size();
        int i = 157;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 23) + getValue(i2)) * 23) + getFieldType(i2).hashCode();
        }
        return i + getChronology().hashCode();
    }

    public int indexOf(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i) == dateTimeFieldType) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfSupported(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf != -1) {
            return indexOf;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public boolean isAfter(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            if (compareTo(readablePartial) > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isBefore(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            if (compareTo(readablePartial) < 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isEqual(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            if (compareTo(readablePartial) == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    @Override // org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return indexOf(dateTimeFieldType) != -1;
    }

    @Override // org.joda.time.ReadablePartial
    public DateTime toDateTime(ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        return new DateTime(instantChronology.set(this, DateTimeUtils.getInstantMillis(readableInstant)), instantChronology);
    }

    public String toString(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            return toString();
        }
        return dateTimeFormatter.print(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (size() == readablePartial.size()) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (getFieldType(i) != readablePartial.getFieldType(i)) {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int size2 = size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (getValue(i2) > readablePartial.getValue(i2)) {
                    return 1;
                }
                if (getValue(i2) < readablePartial.getValue(i2)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i).getDurationType() == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfSupported(DurationFieldType durationFieldType) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            return indexOf;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }
}
