package p000;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/* renamed from: Wi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36835Wi2 {
    /* renamed from: b */
    public static AbstractC52360yi2 m77959b(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return KR5.m98885a(jsonReader);
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    /* renamed from: c */
    public static AbstractC52360yi2 m77958c(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            AbstractC52360yi2 m77959b = m77959b(jsonReader);
            if (!m77959b.m2880s() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return m77959b;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    /* renamed from: d */
    public static AbstractC52360yi2 m77957d(String str) throws JsonSyntaxException {
        return m77958c(new StringReader(str));
    }

    @Deprecated
    /* renamed from: a */
    public AbstractC52360yi2 m77960a(String str) throws JsonSyntaxException {
        return m77957d(str);
    }
}
