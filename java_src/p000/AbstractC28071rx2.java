package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;
/* renamed from: rx2 */
/* loaded from: classes5.dex */
public abstract class AbstractC28071rx2 {
    /* renamed from: a */
    public static AbstractC28071rx2 m14986a(long j) {
        return new C5732Nt(j);
    }

    /* renamed from: b */
    public static AbstractC28071rx2 m14985b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m14986a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m14986a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo14984c();
}
