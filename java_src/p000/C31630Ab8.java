package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
/* renamed from: Ab8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31630Ab8 implements Closeable, Flushable {

    /* renamed from: h */
    public static final String[] f852h = new String[128];

    /* renamed from: i */
    public static final String[] f853i;

    /* renamed from: b */
    public final Writer f854b;

    /* renamed from: c */
    public int[] f855c = new int[32];

    /* renamed from: d */
    public int f856d = 0;

    /* renamed from: e */
    public final String f857e;

    /* renamed from: f */
    public boolean f858f;

    /* renamed from: g */
    public String f859g;

    static {
        for (int i = 0; i <= 31; i++) {
            f852h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f852h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f853i = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C31630Ab8(Writer writer) {
        m115454s(6);
        this.f857e = ":";
        this.f854b = writer;
    }

    /* renamed from: a */
    public final C31630Ab8 m115468a() throws IOException {
        m115451v();
        m115456q(1, '[');
        return this;
    }

    /* renamed from: b */
    public final C31630Ab8 m115467b() throws IOException {
        m115451v();
        m115456q(3, CoreConstants.CURLY_LEFT);
        return this;
    }

    /* renamed from: c */
    public final C31630Ab8 m115466c() throws IOException {
        m115457p(1, 2, ']');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f854b.close();
        int i = this.f856d;
        if (i <= 1 && (i != 1 || this.f855c[0] == 7)) {
            this.f856d = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final C31630Ab8 m115465d() throws IOException {
        m115457p(3, 5, CoreConstants.CURLY_RIGHT);
        return this;
    }

    /* renamed from: f */
    public final C31630Ab8 m115464f(String str) throws IOException {
        if (str != null) {
            if (this.f859g == null) {
                if (this.f856d != 0) {
                    this.f859g = str;
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
        if (this.f856d != 0) {
            this.f854b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final C31630Ab8 m115463g() throws IOException {
        if (this.f859g != null) {
            m115451v();
        }
        m115455r();
        this.f854b.write("null");
        return this;
    }

    /* renamed from: i */
    public final C31630Ab8 m115462i(Number number) throws IOException {
        m115451v();
        String obj = number.toString();
        if (!this.f858f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(number.toString()));
        }
        m115455r();
        this.f854b.append((CharSequence) obj);
        return this;
    }

    /* renamed from: k */
    public final C31630Ab8 m115461k(String str) throws IOException {
        if (str == null) {
            m115463g();
            return this;
        }
        m115451v();
        m115455r();
        m115452u(str);
        return this;
    }

    /* renamed from: l */
    public final C31630Ab8 m115460l(boolean z) throws IOException {
        String str;
        m115451v();
        m115455r();
        Writer writer = this.f854b;
        if (true != z) {
            str = "false";
        } else {
            str = "true";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: m */
    public final void m115459m(boolean z) {
        this.f858f = true;
    }

    /* renamed from: n */
    public final int m115458n() {
        int i = this.f856d;
        if (i != 0) {
            return this.f855c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: p */
    public final C31630Ab8 m115457p(int i, int i2, char c) throws IOException {
        String str;
        int m115458n = m115458n();
        if (m115458n != i2 && m115458n != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str2 = this.f859g;
        if (str2 != null) {
            if (str2.length() != 0) {
                str = "Dangling name: ".concat(str2);
            } else {
                str = new String("Dangling name: ");
            }
            throw new IllegalStateException(str);
        }
        this.f856d--;
        this.f854b.write(c);
        return this;
    }

    /* renamed from: q */
    public final C31630Ab8 m115456q(int i, char c) throws IOException {
        m115455r();
        m115454s(i);
        this.f854b.write(c);
        return this;
    }

    /* renamed from: r */
    public final void m115455r() throws IOException {
        int m115458n = m115458n();
        if (m115458n != 1) {
            if (m115458n != 2) {
                if (m115458n != 4) {
                    if (m115458n != 6) {
                        if (m115458n == 7) {
                            if (!this.f858f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m115453t(7);
                    return;
                }
                this.f854b.append((CharSequence) this.f857e);
                m115453t(5);
                return;
            }
            this.f854b.append(CoreConstants.COMMA_CHAR);
            return;
        }
        m115453t(2);
    }

    /* renamed from: s */
    public final void m115454s(int i) {
        int i2 = this.f856d;
        int[] iArr = this.f855c;
        if (i2 == iArr.length) {
            this.f855c = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.f855c;
        int i3 = this.f856d;
        this.f856d = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: t */
    public final void m115453t(int i) {
        this.f855c[this.f856d - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m115452u(String str) throws IOException {
        String str2;
        String[] strArr = f852h;
        this.f854b.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.f854b.write(str, i, i2 - i);
                }
                this.f854b.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.f854b.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f854b.write(str, i, length - i);
        }
        this.f854b.write(34);
    }

    /* renamed from: v */
    public final void m115451v() throws IOException {
        if (this.f859g != null) {
            int m115458n = m115458n();
            if (m115458n == 5) {
                this.f854b.write(44);
            } else if (m115458n != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m115453t(4);
            m115452u(this.f859g);
            this.f859g = null;
        }
    }
}
