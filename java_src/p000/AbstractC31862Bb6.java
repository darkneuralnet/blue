package p000;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
/* renamed from: Bb6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31862Bb6<T> {

    /* renamed from: Bb6$a */
    /* loaded from: classes6.dex */
    public class C0649a extends AbstractC31862Bb6<T> {
        public C0649a() {
        }

        @Override // p000.AbstractC31862Bb6
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) AbstractC31862Bb6.this.read(jsonReader);
        }

        @Override // p000.AbstractC31862Bb6
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                AbstractC31862Bb6.this.write(jsonWriter, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC31862Bb6<T> m113814a() {
        return new C0649a();
    }

    /* renamed from: b */
    public final String m113813b(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            m113812c(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: c */
    public final void m113812c(Writer writer, T t) throws IOException {
        write(new JsonWriter(writer), t);
    }

    /* renamed from: d */
    public final AbstractC52360yi2 m113811d(T t) {
        try {
            C51777xj2 c51777xj2 = new C51777xj2();
            write(c51777xj2, t);
            return c51777xj2.m4790a();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;
}
