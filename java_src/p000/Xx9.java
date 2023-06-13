package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
/* renamed from: Xx9 */
/* loaded from: classes5.dex */
public final class Xx9 implements Closeable, Flushable {

    /* renamed from: h */
    public static final String[] f44294h = new String[128];

    /* renamed from: i */
    public static final String[] f44295i;

    /* renamed from: b */
    public final Writer f44296b;

    /* renamed from: c */
    public int[] f44297c = new int[32];

    /* renamed from: d */
    public int f44298d = 0;

    /* renamed from: e */
    public final String f44299e;

    /* renamed from: f */
    public boolean f44300f;

    /* renamed from: g */
    public String f44301g;

    static {
        for (int i = 0; i <= 31; i++) {
            f44294h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f44294h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f44295i = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public Xx9(Writer writer) {
        m76006s(6);
        this.f44299e = ":";
        this.f44296b = writer;
    }

    /* renamed from: a */
    public final Xx9 m76020a() throws IOException {
        m76003v();
        m76008q(1, '[');
        return this;
    }

    /* renamed from: b */
    public final Xx9 m76019b() throws IOException {
        m76003v();
        m76008q(3, CoreConstants.CURLY_LEFT);
        return this;
    }

    /* renamed from: c */
    public final Xx9 m76018c() throws IOException {
        m76009p(1, 2, ']');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f44296b.close();
        int i = this.f44298d;
        if (i <= 1 && (i != 1 || this.f44297c[0] == 7)) {
            this.f44298d = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final Xx9 m76017d() throws IOException {
        m76009p(3, 5, CoreConstants.CURLY_RIGHT);
        return this;
    }

    /* renamed from: f */
    public final Xx9 m76016f(String str) throws IOException {
        if (str != null) {
            if (this.f44301g == null) {
                if (this.f44298d != 0) {
                    this.f44301g = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f44298d != 0) {
            this.f44296b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final Xx9 m76015g() throws IOException {
        if (this.f44301g != null) {
            m76003v();
        }
        m76007r();
        this.f44296b.write("null");
        return this;
    }

    /* renamed from: i */
    public final Xx9 m76014i(Number number) throws IOException {
        m76003v();
        String obj = number.toString();
        if (!this.f44300f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(number.toString()));
        }
        m76007r();
        this.f44296b.append((CharSequence) obj);
        return this;
    }

    /* renamed from: k */
    public final Xx9 m76013k(String str) throws IOException {
        if (str == null) {
            m76015g();
            return this;
        }
        m76003v();
        m76007r();
        m76004u(str);
        return this;
    }

    /* renamed from: l */
    public final Xx9 m76012l(boolean z) throws IOException {
        String str;
        m76003v();
        m76007r();
        Writer writer = this.f44296b;
        if (true != z) {
            str = "false";
        } else {
            str = "true";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: m */
    public final void m76011m(boolean z) {
        this.f44300f = true;
    }

    /* renamed from: n */
    public final int m76010n() {
        int i = this.f44298d;
        if (i != 0) {
            return this.f44297c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: p */
    public final Xx9 m76009p(int i, int i2, char c) throws IOException {
        String str;
        int m76010n = m76010n();
        if (m76010n != i2 && m76010n != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str2 = this.f44301g;
        if (str2 != null) {
            if (str2.length() != 0) {
                str = "Dangling name: ".concat(str2);
            } else {
                str = new String("Dangling name: ");
            }
            throw new IllegalStateException(str);
        }
        this.f44298d--;
        this.f44296b.write(c);
        return this;
    }

    /* renamed from: q */
    public final Xx9 m76008q(int i, char c) throws IOException {
        m76007r();
        m76006s(i);
        this.f44296b.write(c);
        return this;
    }

    /* renamed from: r */
    public final void m76007r() throws IOException {
        int m76010n = m76010n();
        if (m76010n != 1) {
            if (m76010n != 2) {
                if (m76010n != 4) {
                    if (m76010n != 6) {
                        if (m76010n == 7) {
                            if (!this.f44300f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m76005t(7);
                    return;
                }
                this.f44296b.append((CharSequence) this.f44299e);
                m76005t(5);
                return;
            }
            this.f44296b.append(CoreConstants.COMMA_CHAR);
            return;
        }
        m76005t(2);
    }

    /* renamed from: s */
    public final void m76006s(int i) {
        int i2 = this.f44298d;
        int[] iArr = this.f44297c;
        if (i2 == iArr.length) {
            this.f44297c = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.f44297c;
        int i3 = this.f44298d;
        this.f44298d = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: t */
    public final void m76005t(int i) {
        this.f44297c[this.f44298d - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m76004u(String str) throws IOException {
        String str2;
        String[] strArr = f44294h;
        this.f44296b.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.f44296b.write(str, i, i2 - i);
                }
                this.f44296b.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.f44296b.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f44296b.write(str, i, length - i);
        }
        this.f44296b.write(34);
    }

    /* renamed from: v */
    public final void m76003v() throws IOException {
        if (this.f44301g != null) {
            int m76010n = m76010n();
            if (m76010n == 5) {
                this.f44296b.write(44);
            } else if (m76010n != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m76005t(4);
            m76004u(this.f44301g);
            this.f44301g = null;
        }
    }
}
