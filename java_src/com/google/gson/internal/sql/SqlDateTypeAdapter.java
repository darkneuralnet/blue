package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes6.dex */
public final class SqlDateTypeAdapter extends AbstractC31862Bb6<Date> {

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74651b = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            if (c32798Fb6.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };

    /* renamed from: a */
    public final DateFormat f74652a;

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public Date read(JsonReader jsonReader) throws IOException {
        java.util.Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.f74652a.parse(nextString);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e);
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.f74652a.format((java.util.Date) date);
        }
        jsonWriter.value(format);
    }

    private SqlDateTypeAdapter() {
        this.f74652a = new SimpleDateFormat("MMM d, yyyy");
    }
}
