package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ReadablePeriodConverter extends AbstractConverter implements PeriodConverter {
    static final ReadablePeriodConverter INSTANCE = new ReadablePeriodConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PeriodConverter
    public PeriodType getPeriodType(Object obj) {
        return ((ReadablePeriod) obj).getPeriodType();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadablePeriod.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) obj);
    }
}
