package p000;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* renamed from: oE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46153oE1 {

    /* renamed from: A */
    public static final InterfaceC36852Wk1 f101623A = EnumC36618Vk1.f39675b;

    /* renamed from: B */
    public static final InterfaceC39550d56 f101624B = EnumC38939c56.f60073b;

    /* renamed from: C */
    public static final InterfaceC39550d56 f101625C = EnumC38939c56.f60074c;

    /* renamed from: z */
    public static final String f101626z = null;

    /* renamed from: a */
    public final ThreadLocal<Map<C32798Fb6<?>, AbstractC31862Bb6<?>>> f101627a;

    /* renamed from: b */
    public final ConcurrentMap<C32798Fb6<?>, AbstractC31862Bb6<?>> f101628b;

    /* renamed from: c */
    public final C47193pz0 f101629c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f101630d;

    /* renamed from: e */
    public final List<InterfaceC32096Cb6> f101631e;

    /* renamed from: f */
    public final Excluder f101632f;

    /* renamed from: g */
    public final InterfaceC36852Wk1 f101633g;

    /* renamed from: h */
    public final Map<Type, InterfaceC38342b52<?>> f101634h;

    /* renamed from: i */
    public final boolean f101635i;

    /* renamed from: j */
    public final boolean f101636j;

    /* renamed from: k */
    public final boolean f101637k;

    /* renamed from: l */
    public final boolean f101638l;

    /* renamed from: m */
    public final boolean f101639m;

    /* renamed from: n */
    public final boolean f101640n;

    /* renamed from: o */
    public final boolean f101641o;

    /* renamed from: p */
    public final boolean f101642p;

    /* renamed from: q */
    public final String f101643q;

    /* renamed from: r */
    public final int f101644r;

    /* renamed from: s */
    public final int f101645s;

    /* renamed from: t */
    public final EnumC45416mz2 f101646t;

    /* renamed from: u */
    public final List<InterfaceC32096Cb6> f101647u;

    /* renamed from: v */
    public final List<InterfaceC32096Cb6> f101648v;

    /* renamed from: w */
    public final InterfaceC39550d56 f101649w;

    /* renamed from: x */
    public final InterfaceC39550d56 f101650x;

    /* renamed from: y */
    public final List<InterfaceC46544ot4> f101651y;

    /* renamed from: oE1$a */
    /* loaded from: classes6.dex */
    public class C26867a extends AbstractC31862Bb6<Number> {
        public C26867a() {
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Double read(JsonReader jsonReader) throws IOException {
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
                return;
            }
            double doubleValue = number.doubleValue();
            C46153oE1.m21565d(doubleValue);
            jsonWriter.value(doubleValue);
        }
    }

    /* renamed from: oE1$b */
    /* loaded from: classes6.dex */
    public class C26868b extends AbstractC31862Bb6<Number> {
        public C26868b() {
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Float read(JsonReader jsonReader) throws IOException {
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
            float floatValue = number.floatValue();
            C46153oE1.m21565d(floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            jsonWriter.value(number);
        }
    }

    /* renamed from: oE1$c */
    /* loaded from: classes6.dex */
    public class C26869c extends AbstractC31862Bb6<Number> {
        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* renamed from: oE1$d */
    /* loaded from: classes6.dex */
    public class C26870d extends AbstractC31862Bb6<AtomicLong> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC31862Bb6 f101654a;

        public C26870d(AbstractC31862Bb6 abstractC31862Bb6) {
            this.f101654a = abstractC31862Bb6;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AtomicLong read(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f101654a.read(jsonReader)).longValue());
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f101654a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: oE1$e */
    /* loaded from: classes6.dex */
    public class C26871e extends AbstractC31862Bb6<AtomicLongArray> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC31862Bb6 f101655a;

        public C26871e(AbstractC31862Bb6 abstractC31862Bb6) {
            this.f101655a = abstractC31862Bb6;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: e */
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f101655a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // p000.AbstractC31862Bb6
        /* renamed from: f */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f101655a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: oE1$f */
    /* loaded from: classes6.dex */
    public static class C26872f<T> extends AbstractC39430ct5<T> {

        /* renamed from: a */
        public AbstractC31862Bb6<T> f101656a = null;

        @Override // p000.AbstractC39430ct5
        /* renamed from: e */
        public AbstractC31862Bb6<T> mo21532e() {
            return m21531f();
        }

        /* renamed from: f */
        public final AbstractC31862Bb6<T> m21531f() {
            AbstractC31862Bb6<T> abstractC31862Bb6 = this.f101656a;
            if (abstractC31862Bb6 != null) {
                return abstractC31862Bb6;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        /* renamed from: g */
        public void m21530g(AbstractC31862Bb6<T> abstractC31862Bb6) {
            if (this.f101656a == null) {
                this.f101656a = abstractC31862Bb6;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }

        @Override // p000.AbstractC31862Bb6
        public T read(JsonReader jsonReader) throws IOException {
            return m21531f().read(jsonReader);
        }

        @Override // p000.AbstractC31862Bb6
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            m21531f().write(jsonWriter, t);
        }
    }

    public C46153oE1() {
        this(Excluder.f74502h, f101623A, Collections.emptyMap(), false, false, false, true, false, false, false, true, EnumC45416mz2.f99191b, f101626z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f101624B, f101625C, Collections.emptyList());
    }

    /* renamed from: a */
    public static void m21568a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    /* renamed from: b */
    public static AbstractC31862Bb6<AtomicLong> m21567b(AbstractC31862Bb6<Number> abstractC31862Bb6) {
        return new C26870d(abstractC31862Bb6).m113814a();
    }

    /* renamed from: c */
    public static AbstractC31862Bb6<AtomicLongArray> m21566c(AbstractC31862Bb6<Number> abstractC31862Bb6) {
        return new C26871e(abstractC31862Bb6).m113814a();
    }

    /* renamed from: d */
    public static void m21565d(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* renamed from: s */
    public static AbstractC31862Bb6<Number> m21550s(EnumC45416mz2 enumC45416mz2) {
        if (enumC45416mz2 == EnumC45416mz2.f99191b) {
            return TypeAdapters.f74621t;
        }
        return new C26869c();
    }

    /* renamed from: A */
    public void m21573A(AbstractC52360yi2 abstractC52360yi2, Appendable appendable) throws JsonIOException {
        try {
            m21543z(abstractC52360yi2, m21547v(KR5.m98883c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: B */
    public void m21572B(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            m21570D(obj, obj.getClass(), appendable);
        } else {
            m21573A(C35431Qi2.f30779b, appendable);
        }
    }

    /* renamed from: C */
    public void m21571C(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        AbstractC31862Bb6 m21553p = m21553p(C32798Fb6.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f101638l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f101635i);
        try {
            try {
                m21553p.write(jsonWriter, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: D */
    public void m21570D(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m21571C(obj, type, m21547v(KR5.m98883c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: E */
    public AbstractC52360yi2 m21569E(Object obj, Type type) {
        C51777xj2 c51777xj2 = new C51777xj2();
        m21571C(obj, type, c51777xj2);
        return c51777xj2.m4790a();
    }

    /* renamed from: e */
    public final AbstractC31862Bb6<Number> m21564e(boolean z) {
        if (z) {
            return TypeAdapters.f74623v;
        }
        return new C26867a();
    }

    /* renamed from: f */
    public final AbstractC31862Bb6<Number> m21563f(boolean z) {
        if (z) {
            return TypeAdapters.f74622u;
        }
        return new C26868b();
    }

    /* renamed from: g */
    public <T> T m21562g(AbstractC52360yi2 abstractC52360yi2, C32798Fb6<T> c32798Fb6) throws JsonSyntaxException {
        if (abstractC52360yi2 == null) {
            return null;
        }
        return (T) m21559j(new C50591vj2(abstractC52360yi2), c32798Fb6);
    }

    /* renamed from: h */
    public <T> T m21561h(AbstractC52360yi2 abstractC52360yi2, Class<T> cls) throws JsonSyntaxException {
        return (T) L24.m97905b(cls).cast(m21562g(abstractC52360yi2, C32798Fb6.get((Class) cls)));
    }

    /* renamed from: i */
    public <T> T m21560i(AbstractC52360yi2 abstractC52360yi2, Type type) throws JsonSyntaxException {
        return (T) m21562g(abstractC52360yi2, C32798Fb6.get(type));
    }

    /* renamed from: j */
    public <T> T m21559j(JsonReader jsonReader, C32798Fb6<T> c32798Fb6) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    return m21553p(c32798Fb6).read(jsonReader);
                } catch (EOFException e) {
                    if (z) {
                        jsonReader.setLenient(isLenient);
                        return null;
                    }
                    throw new JsonSyntaxException(e);
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                }
            } catch (IOException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    /* renamed from: k */
    public <T> T m21558k(Reader reader, C32798Fb6<T> c32798Fb6) throws JsonIOException, JsonSyntaxException {
        JsonReader m21548u = m21548u(reader);
        T t = (T) m21559j(m21548u, c32798Fb6);
        m21568a(t, m21548u);
        return t;
    }

    /* renamed from: l */
    public <T> T m21557l(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        return (T) m21558k(reader, C32798Fb6.get(type));
    }

    /* renamed from: m */
    public <T> T m21556m(String str, C32798Fb6<T> c32798Fb6) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m21558k(new StringReader(str), c32798Fb6);
    }

    /* renamed from: n */
    public <T> T m21555n(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) L24.m97905b(cls).cast(m21556m(str, C32798Fb6.get((Class) cls)));
    }

    /* renamed from: o */
    public <T> T m21554o(String str, Type type) throws JsonSyntaxException {
        return (T) m21556m(str, C32798Fb6.get(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        r2.m21530g(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> AbstractC31862Bb6<T> m21553p(C32798Fb6<T> c32798Fb6) {
        boolean z;
        Objects.requireNonNull(c32798Fb6, "type must not be null");
        AbstractC31862Bb6<T> abstractC31862Bb6 = (AbstractC31862Bb6<T>) this.f101628b.get(c32798Fb6);
        if (abstractC31862Bb6 != null) {
            return abstractC31862Bb6;
        }
        Map<C32798Fb6<?>, AbstractC31862Bb6<?>> map = this.f101627a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f101627a.set(map);
            z = true;
        } else {
            AbstractC31862Bb6<T> abstractC31862Bb62 = (AbstractC31862Bb6<T>) map.get(c32798Fb6);
            if (abstractC31862Bb62 != null) {
                return abstractC31862Bb62;
            }
            z = false;
        }
        try {
            C26872f c26872f = new C26872f();
            map.put(c32798Fb6, c26872f);
            Iterator<InterfaceC32096Cb6> it = this.f101631e.iterator();
            AbstractC31862Bb6<T> abstractC31862Bb63 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC31862Bb63 = it.next().mo46766d(this, c32798Fb6);
                if (abstractC31862Bb63 != null) {
                    break;
                }
            }
            if (abstractC31862Bb63 != null) {
                if (z) {
                    this.f101628b.putAll(map);
                }
                return abstractC31862Bb63;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c32798Fb6);
        } finally {
            if (z) {
                this.f101627a.remove();
            }
        }
    }

    /* renamed from: q */
    public <T> AbstractC31862Bb6<T> m21552q(Class<T> cls) {
        return m21553p(C32798Fb6.get((Class) cls));
    }

    /* renamed from: r */
    public <T> AbstractC31862Bb6<T> m21551r(InterfaceC32096Cb6 interfaceC32096Cb6, C32798Fb6<T> c32798Fb6) {
        if (!this.f101631e.contains(interfaceC32096Cb6)) {
            interfaceC32096Cb6 = this.f101630d;
        }
        boolean z = false;
        for (InterfaceC32096Cb6 interfaceC32096Cb62 : this.f101631e) {
            if (!z) {
                if (interfaceC32096Cb62 == interfaceC32096Cb6) {
                    z = true;
                }
            } else {
                AbstractC31862Bb6<T> mo46766d = interfaceC32096Cb62.mo46766d(this, c32798Fb6);
                if (mo46766d != null) {
                    return mo46766d;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c32798Fb6);
    }

    /* renamed from: t */
    public C46746pE1 m21549t() {
        return new C46746pE1(this);
    }

    public String toString() {
        return "{serializeNulls:" + this.f101635i + ",factories:" + this.f101631e + ",instanceCreators:" + this.f101629c + "}";
    }

    /* renamed from: u */
    public JsonReader m21548u(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f101640n);
        return jsonReader;
    }

    /* renamed from: v */
    public JsonWriter m21547v(Writer writer) throws IOException {
        if (this.f101637k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f101639m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.f101638l);
        jsonWriter.setLenient(this.f101640n);
        jsonWriter.setSerializeNulls(this.f101635i);
        return jsonWriter;
    }

    /* renamed from: w */
    public String m21546w(AbstractC52360yi2 abstractC52360yi2) {
        StringWriter stringWriter = new StringWriter();
        m21573A(abstractC52360yi2, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: x */
    public String m21545x(Object obj) {
        if (obj == null) {
            return m21546w(C35431Qi2.f30779b);
        }
        return m21544y(obj, obj.getClass());
    }

    /* renamed from: y */
    public String m21544y(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m21570D(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: z */
    public void m21543z(AbstractC52360yi2 abstractC52360yi2, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f101638l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f101635i);
        try {
            try {
                KR5.m98884b(abstractC52360yi2, jsonWriter);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public C46153oE1(Excluder excluder, InterfaceC36852Wk1 interfaceC36852Wk1, Map<Type, InterfaceC38342b52<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, EnumC45416mz2 enumC45416mz2, String str, int i, int i2, List<InterfaceC32096Cb6> list, List<InterfaceC32096Cb6> list2, List<InterfaceC32096Cb6> list3, InterfaceC39550d56 interfaceC39550d56, InterfaceC39550d56 interfaceC39550d562, List<InterfaceC46544ot4> list4) {
        this.f101627a = new ThreadLocal<>();
        this.f101628b = new ConcurrentHashMap();
        this.f101632f = excluder;
        this.f101633g = interfaceC36852Wk1;
        this.f101634h = map;
        C47193pz0 c47193pz0 = new C47193pz0(map, z8, list4);
        this.f101629c = c47193pz0;
        this.f101635i = z;
        this.f101636j = z2;
        this.f101637k = z3;
        this.f101638l = z4;
        this.f101639m = z5;
        this.f101640n = z6;
        this.f101641o = z7;
        this.f101642p = z8;
        this.f101646t = enumC45416mz2;
        this.f101643q = str;
        this.f101644r = i;
        this.f101645s = i2;
        this.f101647u = list;
        this.f101648v = list2;
        this.f101649w = interfaceC39550d56;
        this.f101650x = interfaceC39550d562;
        this.f101651y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f74600W);
        arrayList.add(ObjectTypeAdapter.m46862e(interfaceC39550d56));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f74580C);
        arrayList.add(TypeAdapters.f74614m);
        arrayList.add(TypeAdapters.f74608g);
        arrayList.add(TypeAdapters.f74610i);
        arrayList.add(TypeAdapters.f74612k);
        AbstractC31862Bb6<Number> m21550s = m21550s(enumC45416mz2);
        arrayList.add(TypeAdapters.m46838c(Long.TYPE, Long.class, m21550s));
        arrayList.add(TypeAdapters.m46838c(Double.TYPE, Double.class, m21564e(z7)));
        arrayList.add(TypeAdapters.m46838c(Float.TYPE, Float.class, m21563f(z7)));
        arrayList.add(NumberTypeAdapter.m46866e(interfaceC39550d562));
        arrayList.add(TypeAdapters.f74616o);
        arrayList.add(TypeAdapters.f74618q);
        arrayList.add(TypeAdapters.m46839b(AtomicLong.class, m21567b(m21550s)));
        arrayList.add(TypeAdapters.m46839b(AtomicLongArray.class, m21566c(m21550s)));
        arrayList.add(TypeAdapters.f74620s);
        arrayList.add(TypeAdapters.f74625x);
        arrayList.add(TypeAdapters.f74582E);
        arrayList.add(TypeAdapters.f74584G);
        arrayList.add(TypeAdapters.m46839b(BigDecimal.class, TypeAdapters.f74627z));
        arrayList.add(TypeAdapters.m46839b(BigInteger.class, TypeAdapters.f74578A));
        arrayList.add(TypeAdapters.m46839b(C37105Xm2.class, TypeAdapters.f74579B));
        arrayList.add(TypeAdapters.f74586I);
        arrayList.add(TypeAdapters.f74588K);
        arrayList.add(TypeAdapters.f74592O);
        arrayList.add(TypeAdapters.f74594Q);
        arrayList.add(TypeAdapters.f74598U);
        arrayList.add(TypeAdapters.f74590M);
        arrayList.add(TypeAdapters.f74605d);
        arrayList.add(DateTypeAdapter.f74521b);
        arrayList.add(TypeAdapters.f74596S);
        if (C44468lO5.f95983a) {
            arrayList.add(C44468lO5.f95987e);
            arrayList.add(C44468lO5.f95986d);
            arrayList.add(C44468lO5.f95988f);
        }
        arrayList.add(ArrayTypeAdapter.f74515c);
        arrayList.add(TypeAdapters.f74603b);
        arrayList.add(new CollectionTypeAdapterFactory(c47193pz0));
        arrayList.add(new MapTypeAdapterFactory(c47193pz0, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(c47193pz0);
        this.f101630d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f74601X);
        arrayList.add(new ReflectiveTypeAdapterFactory(c47193pz0, interfaceC36852Wk1, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f101631e = Collections.unmodifiableList(arrayList);
    }
}
