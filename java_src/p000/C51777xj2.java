package p000;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: xj2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51777xj2 extends JsonWriter {

    /* renamed from: e */
    public static final Writer f118015e = new C30276a();

    /* renamed from: f */
    public static final C37537Zi2 f118016f = new C37537Zi2("closed");

    /* renamed from: b */
    public final List<AbstractC52360yi2> f118017b;

    /* renamed from: c */
    public String f118018c;

    /* renamed from: d */
    public AbstractC52360yi2 f118019d;

    /* renamed from: xj2$a */
    /* loaded from: classes6.dex */
    public class C30276a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C51777xj2() {
        super(f118015e);
        this.f118017b = new ArrayList();
        this.f118019d = C35431Qi2.f30779b;
    }

    /* renamed from: a */
    public AbstractC52360yi2 m4790a() {
        if (this.f118017b.isEmpty()) {
            return this.f118019d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f118017b);
    }

    /* renamed from: b */
    public final AbstractC52360yi2 m4789b() {
        List<AbstractC52360yi2> list = this.f118017b;
        return list.get(list.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        C41095fi2 c41095fi2 = new C41095fi2();
        m4788c(c41095fi2);
        this.f118017b.add(c41095fi2);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        C36133Ti2 c36133Ti2 = new C36133Ti2();
        m4788c(c36133Ti2);
        this.f118017b.add(c36133Ti2);
        return this;
    }

    /* renamed from: c */
    public final void m4788c(AbstractC52360yi2 abstractC52360yi2) {
        if (this.f118018c != null) {
            if (!abstractC52360yi2.m2880s() || getSerializeNulls()) {
                ((C36133Ti2) m4789b()).m83137w(this.f118018c, abstractC52360yi2);
            }
            this.f118018c = null;
        } else if (this.f118017b.isEmpty()) {
            this.f118019d = abstractC52360yi2;
        } else {
            AbstractC52360yi2 m4789b = m4789b();
            if (m4789b instanceof C41095fi2) {
                ((C41095fi2) m4789b).m41013w(abstractC52360yi2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f118017b.isEmpty()) {
            this.f118017b.add(f118016f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (!this.f118017b.isEmpty() && this.f118018c == null) {
            if (m4789b() instanceof C41095fi2) {
                List<AbstractC52360yi2> list = this.f118017b;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (!this.f118017b.isEmpty() && this.f118018c == null) {
            if (m4789b() instanceof C36133Ti2) {
                List<AbstractC52360yi2> list = this.f118017b;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.f118017b.isEmpty() && this.f118018c == null) {
            if (m4789b() instanceof C36133Ti2) {
                this.f118018c = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        m4788c(C35431Qi2.f30779b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m4788c(new C37537Zi2(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        m4788c(new C37537Zi2(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m4788c(new C37537Zi2(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f) throws IOException {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        m4788c(new C37537Zi2(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        m4788c(new C37537Zi2(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) throws IOException {
        m4788c(new C37537Zi2(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m4788c(new C37537Zi2(number));
        return this;
    }
}
