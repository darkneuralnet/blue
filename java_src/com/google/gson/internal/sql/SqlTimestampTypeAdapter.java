package com.google.gson.internal.sql;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes6.dex */
public class SqlTimestampTypeAdapter extends AbstractC31862Bb6<Timestamp> {

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74655b = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // p000.InterfaceC32096Cb6
        /* renamed from: d */
        public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
            if (c32798Fb6.getRawType() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(c46153oE1.m21552q(Date.class));
        }
    };

    /* renamed from: a */
    public final AbstractC31862Bb6<Date> f74656a;

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date read = this.f74656a.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f74656a.write(jsonWriter, timestamp);
    }

    public SqlTimestampTypeAdapter(AbstractC31862Bb6<Date> abstractC31862Bb6) {
        this.f74656a = abstractC31862Bb6;
    }
}
