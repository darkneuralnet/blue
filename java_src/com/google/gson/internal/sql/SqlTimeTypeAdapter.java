package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes6.dex */
public final class SqlTimeTypeAdapter extends AbstractC31862Bb6<Time> {

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74653b = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            if (c32798Fb6.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f74654a;

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.f74654a.parse(nextString).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e);
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.f74654a.format((Date) time);
        }
        jsonWriter.value(format);
    }

    private SqlTimeTypeAdapter() {
        this.f74654a = new SimpleDateFormat("hh:mm:ss a");
    }
}
