package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes6.dex */
public final class TypeAdapters {

    /* renamed from: A */
    public static final AbstractC31862Bb6<BigInteger> f74578A;

    /* renamed from: B */
    public static final AbstractC31862Bb6<C37105Xm2> f74579B;

    /* renamed from: C */
    public static final InterfaceC32096Cb6 f74580C;

    /* renamed from: D */
    public static final AbstractC31862Bb6<StringBuilder> f74581D;

    /* renamed from: E */
    public static final InterfaceC32096Cb6 f74582E;

    /* renamed from: F */
    public static final AbstractC31862Bb6<StringBuffer> f74583F;

    /* renamed from: G */
    public static final InterfaceC32096Cb6 f74584G;

    /* renamed from: H */
    public static final AbstractC31862Bb6<URL> f74585H;

    /* renamed from: I */
    public static final InterfaceC32096Cb6 f74586I;

    /* renamed from: J */
    public static final AbstractC31862Bb6<URI> f74587J;

    /* renamed from: K */
    public static final InterfaceC32096Cb6 f74588K;

    /* renamed from: L */
    public static final AbstractC31862Bb6<InetAddress> f74589L;

    /* renamed from: M */
    public static final InterfaceC32096Cb6 f74590M;

    /* renamed from: N */
    public static final AbstractC31862Bb6<UUID> f74591N;

    /* renamed from: O */
    public static final InterfaceC32096Cb6 f74592O;

    /* renamed from: P */
    public static final AbstractC31862Bb6<Currency> f74593P;

    /* renamed from: Q */
    public static final InterfaceC32096Cb6 f74594Q;

    /* renamed from: R */
    public static final AbstractC31862Bb6<Calendar> f74595R;

    /* renamed from: S */
    public static final InterfaceC32096Cb6 f74596S;

    /* renamed from: T */
    public static final AbstractC31862Bb6<Locale> f74597T;

    /* renamed from: U */
    public static final InterfaceC32096Cb6 f74598U;

    /* renamed from: V */
    public static final AbstractC31862Bb6<AbstractC52360yi2> f74599V;

    /* renamed from: W */
    public static final InterfaceC32096Cb6 f74600W;

    /* renamed from: X */
    public static final InterfaceC32096Cb6 f74601X;

    /* renamed from: a */
    public static final AbstractC31862Bb6<Class> f74602a;

    /* renamed from: b */
    public static final InterfaceC32096Cb6 f74603b;

    /* renamed from: c */
    public static final AbstractC31862Bb6<BitSet> f74604c;

    /* renamed from: d */
    public static final InterfaceC32096Cb6 f74605d;

    /* renamed from: e */
    public static final AbstractC31862Bb6<Boolean> f74606e;

    /* renamed from: f */
    public static final AbstractC31862Bb6<Boolean> f74607f;

    /* renamed from: g */
    public static final InterfaceC32096Cb6 f74608g;

    /* renamed from: h */
    public static final AbstractC31862Bb6<Number> f74609h;

    /* renamed from: i */
    public static final InterfaceC32096Cb6 f74610i;

    /* renamed from: j */
    public static final AbstractC31862Bb6<Number> f74611j;

    /* renamed from: k */
    public static final InterfaceC32096Cb6 f74612k;

    /* renamed from: l */
    public static final AbstractC31862Bb6<Number> f74613l;

    /* renamed from: m */
    public static final InterfaceC32096Cb6 f74614m;

    /* renamed from: n */
    public static final AbstractC31862Bb6<AtomicInteger> f74615n;

    /* renamed from: o */
    public static final InterfaceC32096Cb6 f74616o;

    /* renamed from: p */
    public static final AbstractC31862Bb6<AtomicBoolean> f74617p;

    /* renamed from: q */
    public static final InterfaceC32096Cb6 f74618q;

    /* renamed from: r */
    public static final AbstractC31862Bb6<AtomicIntegerArray> f74619r;

    /* renamed from: s */
    public static final InterfaceC32096Cb6 f74620s;

    /* renamed from: t */
    public static final AbstractC31862Bb6<Number> f74621t;

    /* renamed from: u */
    public static final AbstractC31862Bb6<Number> f74622u;

    /* renamed from: v */
    public static final AbstractC31862Bb6<Number> f74623v;

    /* renamed from: w */
    public static final AbstractC31862Bb6<Character> f74624w;

    /* renamed from: x */
    public static final InterfaceC32096Cb6 f74625x;

    /* renamed from: y */
    public static final AbstractC31862Bb6<String> f74626y;

    /* renamed from: z */
    public static final AbstractC31862Bb6<BigDecimal> f74627z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$A */
    /* loaded from: classes6.dex */
    public class C18416A extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.intValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$B */
    /* loaded from: classes6.dex */
    public class C18417B extends AbstractC31862Bb6<AtomicInteger> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AtomicInteger read(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$C */
    /* loaded from: classes6.dex */
    public class C18418C extends AbstractC31862Bb6<AtomicBoolean> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$D */
    /* loaded from: classes6.dex */
    public static final class C18419D<T extends Enum<T>> extends AbstractC31862Bb6<T> {

        /* renamed from: a */
        public final Map<String, T> f74642a = new HashMap();

        /* renamed from: b */
        public final Map<String, T> f74643b = new HashMap();

        /* renamed from: c */
        public final Map<T, String> f74644c = new HashMap();

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$D$a */
        /* loaded from: classes6.dex */
        public class C18420a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            public final /* synthetic */ Class f74645a;

            public C18420a(Class cls) {
                this.f74645a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f74645a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C18419D(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new C18420a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    String str = r4.toString();
                    InterfaceC41208ft5 interfaceC41208ft5 = (InterfaceC41208ft5) field.getAnnotation(InterfaceC41208ft5.class);
                    if (interfaceC41208ft5 != null) {
                        name = interfaceC41208ft5.value();
                        for (String str2 : interfaceC41208ft5.alternate()) {
                            this.f74642a.put(str2, r4);
                        }
                    }
                    this.f74642a.put(name, r4);
                    this.f74643b.put(str, r4);
                    this.f74644c.put(r4, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            T t = this.f74642a.get(nextString);
            if (t == null) {
                return this.f74643b.get(nextString);
            }
            return t;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.f74644c.get(t));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    /* loaded from: classes6.dex */
    public class C18421a extends AbstractC31862Bb6<AtomicIntegerArray> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b */
    /* loaded from: classes6.dex */
    public class C18422b extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.longValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c */
    /* loaded from: classes6.dex */
    public class C18423c extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d */
    /* loaded from: classes6.dex */
    public class C18424d extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.doubleValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$e */
    /* loaded from: classes6.dex */
    public class C18425e extends AbstractC31862Bb6<Character> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Character read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + nextString + "; at " + jsonReader.getPreviousPath());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Character ch2) throws IOException {
            jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$f */
    /* loaded from: classes6.dex */
    public class C18426f extends AbstractC31862Bb6<String> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public String read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$g */
    /* loaded from: classes6.dex */
    public class C18427g extends AbstractC31862Bb6<BigDecimal> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            try {
                return new BigDecimal(nextString);
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$h */
    /* loaded from: classes6.dex */
    public class C18428h extends AbstractC31862Bb6<BigInteger> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            try {
                return new BigInteger(nextString);
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$i */
    /* loaded from: classes6.dex */
    public class C18429i extends AbstractC31862Bb6<C37105Xm2> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public C37105Xm2 read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new C37105Xm2(jsonReader.nextString());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, C37105Xm2 c37105Xm2) throws IOException {
            jsonWriter.value(c37105Xm2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$j */
    /* loaded from: classes6.dex */
    public class C18430j extends AbstractC31862Bb6<StringBuilder> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            jsonWriter.value(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$k */
    /* loaded from: classes6.dex */
    public class C18431k extends AbstractC31862Bb6<Class> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$l */
    /* loaded from: classes6.dex */
    public class C18432l extends AbstractC31862Bb6<StringBuffer> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$m */
    /* loaded from: classes6.dex */
    public class C18433m extends AbstractC31862Bb6<URL> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public URL read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$n */
    /* loaded from: classes6.dex */
    public class C18434n extends AbstractC31862Bb6<URI> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public URI read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$o */
    /* loaded from: classes6.dex */
    public class C18435o extends AbstractC31862Bb6<InetAddress> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$p */
    /* loaded from: classes6.dex */
    public class C18436p extends AbstractC31862Bb6<UUID> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            try {
                return UUID.fromString(nextString);
            } catch (IllegalArgumentException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$q */
    /* loaded from: classes6.dex */
    public class C18437q extends AbstractC31862Bb6<Currency> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Currency read(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            try {
                return Currency.getInstance(nextString);
            } catch (IllegalArgumentException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$r */
    /* loaded from: classes6.dex */
    public class C18438r extends AbstractC31862Bb6<Calendar> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Calendar read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i = nextInt;
                } else if ("month".equals(nextName)) {
                    i2 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i3 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i4 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i5 = nextInt;
                } else if ("second".equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$s */
    /* loaded from: classes6.dex */
    public class C18439s extends AbstractC31862Bb6<Locale> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Locale read(JsonReader jsonReader) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$t */
    /* loaded from: classes6.dex */
    public class C18440t extends AbstractC31862Bb6<AbstractC52360yi2> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AbstractC52360yi2 read(JsonReader jsonReader) throws IOException {
            String str;
            boolean z;
            if (jsonReader instanceof C50591vj2) {
                return ((C50591vj2) jsonReader).m8235b();
            }
            JsonToken peek = jsonReader.peek();
            AbstractC52360yi2 m46786g = m46786g(jsonReader, peek);
            if (m46786g == null) {
                return m46787f(jsonReader, peek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (m46786g instanceof C36133Ti2) {
                        str = jsonReader.nextName();
                    } else {
                        str = null;
                    }
                    JsonToken peek2 = jsonReader.peek();
                    AbstractC52360yi2 m46786g2 = m46786g(jsonReader, peek2);
                    if (m46786g2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m46786g2 == null) {
                        m46786g2 = m46787f(jsonReader, peek2);
                    }
                    if (m46786g instanceof C41095fi2) {
                        ((C41095fi2) m46786g).m41013w(m46786g2);
                    } else {
                        ((C36133Ti2) m46786g).m83137w(str, m46786g2);
                    }
                    if (z) {
                        arrayDeque.addLast(m46786g);
                        m46786g = m46786g2;
                    }
                } else {
                    if (m46786g instanceof C41095fi2) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return m46786g;
                    }
                    m46786g = (AbstractC52360yi2) arrayDeque.removeLast();
                }
            }
        }

        /* renamed from: f */
        public final AbstractC52360yi2 m46787f(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i = C18442v.f74647a[jsonToken.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            jsonReader.nextNull();
                            return C35431Qi2.f30779b;
                        }
                        throw new IllegalStateException("Unexpected token: " + jsonToken);
                    }
                    return new C37537Zi2(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                return new C37537Zi2(jsonReader.nextString());
            }
            return new C37537Zi2(new C37105Xm2(jsonReader.nextString()));
        }

        /* renamed from: g */
        public final AbstractC52360yi2 m46786g(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i = C18442v.f74647a[jsonToken.ordinal()];
            if (i != 4) {
                if (i != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new C36133Ti2();
            }
            jsonReader.beginArray();
            return new C41095fi2();
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: h */
        public void write(JsonWriter jsonWriter, AbstractC52360yi2 abstractC52360yi2) throws IOException {
            if (abstractC52360yi2 != null && !abstractC52360yi2.m2880s()) {
                if (abstractC52360yi2.m2878v()) {
                    C37537Zi2 m2884f = abstractC52360yi2.m2884f();
                    if (m2884f.m72659A()) {
                        jsonWriter.value(m2884f.m72656x());
                        return;
                    } else if (m2884f.m72655y()) {
                        jsonWriter.value(m2884f.mo2888a());
                        return;
                    } else {
                        jsonWriter.value(m2884f.mo2882j());
                        return;
                    }
                } else if (abstractC52360yi2.m2881o()) {
                    jsonWriter.beginArray();
                    Iterator<AbstractC52360yi2> it = abstractC52360yi2.m2886c().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                } else if (abstractC52360yi2.m2879u()) {
                    jsonWriter.beginObject();
                    for (Map.Entry<String, AbstractC52360yi2> entry : abstractC52360yi2.m2885e().entrySet()) {
                        jsonWriter.name(entry.getKey());
                        write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + abstractC52360yi2.getClass());
                }
            }
            jsonWriter.nullValue();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$u */
    /* loaded from: classes6.dex */
    public class C18441u extends AbstractC31862Bb6<BitSet> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public BitSet read(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken peek = jsonReader.peek();
            int i = 0;
            while (peek != JsonToken.END_ARRAY) {
                int i2 = C18442v.f74647a[peek.ordinal()];
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        z = jsonReader.nextBoolean();
                    } else {
                        throw new JsonSyntaxException("Invalid bitset value type: " + peek + "; at path " + jsonReader.getPath());
                    }
                } else {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt == 0) {
                        z = false;
                    } else if (nextInt != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + nextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                    }
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                peek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet.get(i) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$v */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18442v {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74647a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f74647a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74647a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74647a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74647a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74647a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74647a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$w */
    /* loaded from: classes6.dex */
    public class C18443w extends AbstractC31862Bb6<Boolean> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Boolean read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$x */
    /* loaded from: classes6.dex */
    public class C18444x extends AbstractC31862Bb6<Boolean> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            String bool2;
            if (bool == null) {
                bool2 = "null";
            } else {
                bool2 = bool.toString();
            }
            jsonWriter.value(bool2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$y */
    /* loaded from: classes6.dex */
    public class C18445y extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int nextInt = jsonReader.nextInt();
                if (nextInt <= 255 && nextInt >= -128) {
                    return Byte.valueOf((byte) nextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + nextInt + " to byte; at path " + jsonReader.getPreviousPath());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.byteValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$z */
    /* loaded from: classes6.dex */
    public class C18446z extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int nextInt = jsonReader.nextInt();
                if (nextInt <= 65535 && nextInt >= -32768) {
                    return Short.valueOf((short) nextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + nextInt + " to short; at path " + jsonReader.getPreviousPath());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.shortValue());
            }
        }
    }

    static {
        AbstractC31862Bb6<Class> m113814a = new C18431k().m113814a();
        f74602a = m113814a;
        f74603b = m46839b(Class.class, m113814a);
        AbstractC31862Bb6<BitSet> m113814a2 = new C18441u().m113814a();
        f74604c = m113814a2;
        f74605d = m46839b(BitSet.class, m113814a2);
        C18443w c18443w = new C18443w();
        f74606e = c18443w;
        f74607f = new C18444x();
        f74608g = m46838c(Boolean.TYPE, Boolean.class, c18443w);
        C18445y c18445y = new C18445y();
        f74609h = c18445y;
        f74610i = m46838c(Byte.TYPE, Byte.class, c18445y);
        C18446z c18446z = new C18446z();
        f74611j = c18446z;
        f74612k = m46838c(Short.TYPE, Short.class, c18446z);
        C18416A c18416a = new C18416A();
        f74613l = c18416a;
        f74614m = m46838c(Integer.TYPE, Integer.class, c18416a);
        AbstractC31862Bb6<AtomicInteger> m113814a3 = new C18417B().m113814a();
        f74615n = m113814a3;
        f74616o = m46839b(AtomicInteger.class, m113814a3);
        AbstractC31862Bb6<AtomicBoolean> m113814a4 = new C18418C().m113814a();
        f74617p = m113814a4;
        f74618q = m46839b(AtomicBoolean.class, m113814a4);
        AbstractC31862Bb6<AtomicIntegerArray> m113814a5 = new C18421a().m113814a();
        f74619r = m113814a5;
        f74620s = m46839b(AtomicIntegerArray.class, m113814a5);
        f74621t = new C18422b();
        f74622u = new C18423c();
        f74623v = new C18424d();
        C18425e c18425e = new C18425e();
        f74624w = c18425e;
        f74625x = m46838c(Character.TYPE, Character.class, c18425e);
        C18426f c18426f = new C18426f();
        f74626y = c18426f;
        f74627z = new C18427g();
        f74578A = new C18428h();
        f74579B = new C18429i();
        f74580C = m46839b(String.class, c18426f);
        C18430j c18430j = new C18430j();
        f74581D = c18430j;
        f74582E = m46839b(StringBuilder.class, c18430j);
        C18432l c18432l = new C18432l();
        f74583F = c18432l;
        f74584G = m46839b(StringBuffer.class, c18432l);
        C18433m c18433m = new C18433m();
        f74585H = c18433m;
        f74586I = m46839b(URL.class, c18433m);
        C18434n c18434n = new C18434n();
        f74587J = c18434n;
        f74588K = m46839b(URI.class, c18434n);
        C18435o c18435o = new C18435o();
        f74589L = c18435o;
        f74590M = m46836e(InetAddress.class, c18435o);
        C18436p c18436p = new C18436p();
        f74591N = c18436p;
        f74592O = m46839b(UUID.class, c18436p);
        AbstractC31862Bb6<Currency> m113814a6 = new C18437q().m113814a();
        f74593P = m113814a6;
        f74594Q = m46839b(Currency.class, m113814a6);
        C18438r c18438r = new C18438r();
        f74595R = c18438r;
        f74596S = m46837d(Calendar.class, GregorianCalendar.class, c18438r);
        C18439s c18439s = new C18439s();
        f74597T = c18439s;
        f74598U = m46839b(Locale.class, c18439s);
        C18440t c18440t = new C18440t();
        f74599V = c18440t;
        f74600W = m46836e(AbstractC52360yi2.class, c18440t);
        f74601X = new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                Class rawType = c32798Fb6.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = (Class<? super Object>) rawType.getSuperclass();
                    }
                    return new C18419D(rawType);
                }
                return null;
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <TT> InterfaceC32096Cb6 m46840a(final C32798Fb6<TT> c32798Fb6, final AbstractC31862Bb6<TT> abstractC31862Bb6) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb62) {
                if (c32798Fb62.equals(C32798Fb6.this)) {
                    return abstractC31862Bb6;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> InterfaceC32096Cb6 m46839b(final Class<TT> cls, final AbstractC31862Bb6<TT> abstractC31862Bb6) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                if (c32798Fb6.getRawType() == cls) {
                    return abstractC31862Bb6;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC31862Bb6 + "]";
            }
        };
    }

    /* renamed from: c */
    public static <TT> InterfaceC32096Cb6 m46838c(final Class<TT> cls, final Class<TT> cls2, final AbstractC31862Bb6<? super TT> abstractC31862Bb6) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                Class<? super T> rawType = c32798Fb6.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return abstractC31862Bb6;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + abstractC31862Bb6 + "]";
            }
        };
    }

    /* renamed from: d */
    public static <TT> InterfaceC32096Cb6 m46837d(final Class<TT> cls, final Class<? extends TT> cls2, final AbstractC31862Bb6<? super TT> abstractC31862Bb6) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
                Class<? super T> rawType = c32798Fb6.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return abstractC31862Bb6;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + abstractC31862Bb6 + "]";
            }
        };
    }

    /* renamed from: e */
    public static <T1> InterfaceC32096Cb6 m46836e(final Class<T1> cls, final AbstractC31862Bb6<T1> abstractC31862Bb6) {
        return new InterfaceC32096Cb6() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            /* loaded from: classes6.dex */
            public class C18415a extends AbstractC31862Bb6<T1> {

                /* renamed from: a */
                public final /* synthetic */ Class f74640a;

                public C18415a(Class cls) {
                    this.f74640a = cls;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, T1] */
                @Override // p000.AbstractC31862Bb6
                public T1 read(JsonReader jsonReader) throws IOException {
                    ?? read = abstractC31862Bb6.read(jsonReader);
                    if (read != 0 && !this.f74640a.isInstance(read)) {
                        throw new JsonSyntaxException("Expected a " + this.f74640a.getName() + " but was " + read.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                    }
                    return read;
                }

                @Override // p000.AbstractC31862Bb6
                public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
                    abstractC31862Bb6.write(jsonWriter, t1);
                }
            }

            @Override // p000.InterfaceC32096Cb6
            /* renamed from: d */
            public <T2> AbstractC31862Bb6<T2> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T2> c32798Fb6) {
                Class<? super T2> rawType = c32798Fb6.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C18415a(rawType);
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC31862Bb6 + "]";
            }
        };
    }
}
