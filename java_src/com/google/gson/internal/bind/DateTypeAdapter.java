package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class DateTypeAdapter extends AbstractC31862Bb6<Date> {

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74521b = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            if (c32798Fb6.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final List<DateFormat> f74522a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f74522a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C51164wh2.m6481d()) {
            arrayList.add(C38618bZ3.m64352c(2, 2));
        }
    }

    /* renamed from: e */
    public final Date m46874e(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        synchronized (this.f74522a) {
            for (DateFormat dateFormat : this.f74522a) {
                try {
                    return dateFormat.parse(nextString);
                } catch (ParseException unused) {
                }
            }
            try {
                return C39730dP1.m44306c(nextString, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as Date; at path " + jsonReader.getPreviousPath(), e);
            }
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return m46874e(jsonReader);
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: g */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.f74522a.get(0);
        synchronized (this.f74522a) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }
}
