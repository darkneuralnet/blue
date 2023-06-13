package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* renamed from: vj2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50591vj2 extends JsonReader {

    /* renamed from: f */
    public static final Reader f114544f = new C29615a();

    /* renamed from: g */
    public static final Object f114545g = new Object();

    /* renamed from: b */
    public Object[] f114546b;

    /* renamed from: c */
    public int f114547c;

    /* renamed from: d */
    public String[] f114548d;

    /* renamed from: e */
    public int[] f114549e;

    /* renamed from: vj2$a */
    /* loaded from: classes6.dex */
    public class C29615a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    /* renamed from: vj2$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C29616b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f114550a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f114550a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114550a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f114550a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f114550a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C50591vj2(AbstractC52360yi2 abstractC52360yi2) {
        super(f114544f);
        this.f114546b = new Object[32];
        this.f114547c = 0;
        this.f114548d = new String[32];
        this.f114549e = new int[32];
        m8230i(abstractC52360yi2);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* renamed from: a */
    public final void m8236a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    /* renamed from: b */
    public AbstractC52360yi2 m8235b() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            AbstractC52360yi2 abstractC52360yi2 = (AbstractC52360yi2) m8233d();
            skipValue();
            return abstractC52360yi2;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        m8236a(JsonToken.BEGIN_ARRAY);
        m8230i(((C41095fi2) m8233d()).iterator());
        this.f114549e[this.f114547c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        m8236a(JsonToken.BEGIN_OBJECT);
        m8230i(((C36133Ti2) m8233d()).entrySet().iterator());
    }

    /* renamed from: c */
    public final String m8234c(boolean z) throws IOException {
        String str;
        m8236a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m8233d()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f114548d;
        int i = this.f114547c - 1;
        if (z) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i] = str;
        m8230i(entry.getValue());
        return str2;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f114546b = new Object[]{f114545g};
        this.f114547c = 1;
    }

    /* renamed from: d */
    public final Object m8233d() {
        return this.f114546b[this.f114547c - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        m8236a(JsonToken.END_ARRAY);
        m8232f();
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        m8236a(JsonToken.END_OBJECT);
        this.f114548d[this.f114547c - 1] = null;
        m8232f();
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public final Object m8232f() {
        Object[] objArr = this.f114546b;
        int i = this.f114547c - 1;
        this.f114547c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: g */
    public void m8231g() throws IOException {
        m8236a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m8233d()).next();
        m8230i(entry.getValue());
        m8230i(new C37537Zi2((String) entry.getKey()));
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f114547c;
            if (i < i2) {
                Object[] objArr = this.f114546b;
                Object obj = objArr[i];
                if (obj instanceof C41095fi2) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.f114549e[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof C36133Ti2) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append(CoreConstants.DOT);
                    String str = this.f114548d[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY && peek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m8230i(Object obj) {
        int i = this.f114547c;
        Object[] objArr = this.f114546b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f114546b = Arrays.copyOf(objArr, i2);
            this.f114549e = Arrays.copyOf(this.f114549e, i2);
            this.f114548d = (String[]) Arrays.copyOf(this.f114548d, i2);
        }
        Object[] objArr2 = this.f114546b;
        int i3 = this.f114547c;
        this.f114547c = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        m8236a(JsonToken.BOOLEAN);
        boolean mo2888a = ((C37537Zi2) m8232f()).mo2888a();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo2888a;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double mo2887b = ((C37537Zi2) m8233d()).mo2887b();
        if (!isLenient() && (Double.isNaN(mo2887b) || Double.isInfinite(mo2887b))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + mo2887b);
        }
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo2887b;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int m72657w = ((C37537Zi2) m8233d()).m72657w();
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m72657w;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long mo2883h = ((C37537Zi2) m8233d()).mo2883h();
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo2883h;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return m8234c(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        m8236a(JsonToken.NULL);
        m8232f();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String mo2882j = ((C37537Zi2) m8232f()).mo2882j();
        int i = this.f114547c;
        if (i > 0) {
            int[] iArr = this.f114549e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo2882j;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f114547c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object m8233d = m8233d();
        if (m8233d instanceof Iterator) {
            boolean z = this.f114546b[this.f114547c - 2] instanceof C36133Ti2;
            Iterator it = (Iterator) m8233d;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                m8230i(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (m8233d instanceof C36133Ti2) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (m8233d instanceof C41095fi2) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (m8233d instanceof C37537Zi2) {
                C37537Zi2 c37537Zi2 = (C37537Zi2) m8233d;
                if (c37537Zi2.m72658C()) {
                    return JsonToken.STRING;
                }
                if (c37537Zi2.m72655y()) {
                    return JsonToken.BOOLEAN;
                }
                if (c37537Zi2.m72659A()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (m8233d instanceof C35431Qi2) {
                return JsonToken.NULL;
            } else {
                if (m8233d == f114545g) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new MalformedJsonException("Custom JsonElement subclass " + m8233d.getClass().getName() + " is not supported");
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i = C29616b.f114550a[peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        m8232f();
                        int i2 = this.f114547c;
                        if (i2 > 0) {
                            int[] iArr = this.f114549e;
                            int i3 = i2 - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                endObject();
                return;
            }
            endArray();
            return;
        }
        m8234c(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return C50591vj2.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
