package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ReadableInstantConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        Chronology chronology = ((ReadableInstant) obj).getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        if (chronology.getZone() != dateTimeZone) {
            Chronology withZone = chronology.withZone(dateTimeZone);
            return withZone == null ? ISOChronology.getInstance(dateTimeZone) : withZone;
        }
        return chronology;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((ReadableInstant) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableInstant.class;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        return chronology == null ? DateTimeUtils.getChronology(((ReadableInstant) obj).getChronology()) : chronology;
    }
}
