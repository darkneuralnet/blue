package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
/* renamed from: TW0 */
/* loaded from: classes6.dex */
public final class TW0<T extends Date> extends AbstractC31862Bb6<T> {

    /* renamed from: a */
    public final AbstractC7864b<T> f35587a;

    /* renamed from: b */
    public final List<DateFormat> f35588b;

    /* renamed from: TW0$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC7864b<T extends Date> {

        /* renamed from: b */
        public static final AbstractC7864b<Date> f35589b = new C7865a(Date.class);

        /* renamed from: a */
        public final Class<T> f35590a;

        /* renamed from: TW0$b$a */
        /* loaded from: classes6.dex */
        public class C7865a extends AbstractC7864b<Date> {
            public C7865a(Class cls) {
                super(cls);
            }

            @Override // p000.TW0.AbstractC7864b
            /* renamed from: d */
            public Date mo27340d(Date date) {
                return date;
            }
        }

        public AbstractC7864b(Class<T> cls) {
            this.f35590a = cls;
        }

        /* renamed from: a */
        public final InterfaceC32096Cb6 m83493a(int i, int i2) {
            return m83491c(new TW0<>(this, i, i2));
        }

        /* renamed from: b */
        public final InterfaceC32096Cb6 m83492b(String str) {
            return m83491c(new TW0<>(this, str));
        }

        /* renamed from: c */
        public final InterfaceC32096Cb6 m83491c(TW0<T> tw0) {
            return TypeAdapters.m46839b(this.f35590a, tw0);
        }

        /* renamed from: d */
        public abstract T mo27340d(Date date);
    }

    /* renamed from: e */
    public final Date m83496e(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        synchronized (this.f35588b) {
            for (DateFormat dateFormat : this.f35588b) {
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
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f35587a.mo27340d(m83496e(jsonReader));
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: g */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.f35588b.get(0);
        synchronized (this.f35588b) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    public String toString() {
        DateFormat dateFormat = this.f35588b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TW0(AbstractC7864b<T> abstractC7864b, String str) {
        ArrayList arrayList = new ArrayList();
        this.f35588b = arrayList;
        Objects.requireNonNull(abstractC7864b);
        this.f35587a = abstractC7864b;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public TW0(AbstractC7864b<T> abstractC7864b, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f35588b = arrayList;
        Objects.requireNonNull(abstractC7864b);
        this.f35587a = abstractC7864b;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C51164wh2.m6481d()) {
            arrayList.add(C38618bZ3.m64352c(i, i2));
        }
    }
}
