package p000;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
/* renamed from: KR5 */
/* loaded from: classes6.dex */
public final class KR5 {
    private KR5() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static AbstractC52360yi2 m98885a(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return TypeAdapters.f74599V.read(jsonReader);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return C35431Qi2.f30779b;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    /* renamed from: b */
    public static void m98884b(AbstractC52360yi2 abstractC52360yi2, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.f74599V.write(jsonWriter, abstractC52360yi2);
    }

    /* renamed from: c */
    public static Writer m98883c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C4437b(appendable);
    }

    /* renamed from: KR5$b */
    /* loaded from: classes6.dex */
    public static final class C4437b extends Writer {

        /* renamed from: b */
        public final Appendable f19592b;

        /* renamed from: c */
        public final C4438a f19593c = new C4438a();

        /* renamed from: KR5$b$a */
        /* loaded from: classes6.dex */
        public static class C4438a implements CharSequence {

            /* renamed from: b */
            public char[] f19594b;

            /* renamed from: c */
            public String f19595c;

            private C4438a() {
            }

            /* renamed from: a */
            public void m98882a(char[] cArr) {
                this.f19594b = cArr;
                this.f19595c = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f19594b[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f19594b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f19594b, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f19595c == null) {
                    this.f19595c = new String(this.f19594b);
                }
                return this.f19595c;
            }
        }

        public C4437b(Appendable appendable) {
            this.f19592b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.f19593c.m98882a(cArr);
            this.f19592b.append(this.f19593c, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f19592b.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f19592b.append((char) i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
            this.f19592b.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) throws IOException {
            Objects.requireNonNull(str);
            this.f19592b.append(str, i, i2 + i);
        }
    }
}
