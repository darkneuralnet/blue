package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;
/* loaded from: classes8.dex */
final class DateConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final DateConverter INSTANCE = new DateConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Date.class;
    }
}
