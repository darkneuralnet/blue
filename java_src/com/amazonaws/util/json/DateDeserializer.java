package com.amazonaws.util.json;

import com.amazonaws.util.DateUtils;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/* loaded from: classes4.dex */
public class DateDeserializer implements InterfaceC50581vi2<Date>, InterfaceC44663lj2<Date> {
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN);
    private SimpleDateFormat mSimpleDateFormat;

    public DateDeserializer(String[] strArr) {
        this.dateFormats = Arrays.asList(strArr);
    }

    @Override // p000.InterfaceC50581vi2
    public Date deserialize(AbstractC52360yi2 abstractC52360yi2, Type type, InterfaceC49989ui2 interfaceC49989ui2) {
        String mo2882j = abstractC52360yi2.mo2882j();
        for (String str : this.dateFormats) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                this.mSimpleDateFormat = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(mo2882j).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(mo2882j);
        } catch (ParseException e) {
            throw new JsonParseException(e.getMessage(), e);
        }
    }

    @Override // p000.InterfaceC44663lj2
    public AbstractC52360yi2 serialize(Date date, Type type, InterfaceC44070kj2 interfaceC44070kj2) {
        C37537Zi2 c37537Zi2;
        synchronized (this.mIso8601DateFormat) {
            c37537Zi2 = new C37537Zi2(this.mIso8601DateFormat.format(date));
        }
        return c37537Zi2;
    }
}
