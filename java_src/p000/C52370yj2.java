package p000;

import ch.qos.logback.core.joran.action.ActionConst;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.EOFException;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: yj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52370yj2 extends AbstractC39920dj2 {

    /* renamed from: o */
    public static final M70 f120062o = M70.m95809d("'\\");

    /* renamed from: p */
    public static final M70 f120063p = M70.m95809d("\"\\");

    /* renamed from: q */
    public static final M70 f120064q = M70.m95809d("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: r */
    public static final M70 f120065r = M70.m95809d("\n\r");

    /* renamed from: s */
    public static final M70 f120066s = M70.m95809d("*/");

    /* renamed from: i */
    public final InterfaceC46046o30 f120067i;

    /* renamed from: j */
    public final C42488i30 f120068j;

    /* renamed from: k */
    public int f120069k = 0;

    /* renamed from: l */
    public long f120070l;

    /* renamed from: m */
    public int f120071m;

    /* renamed from: n */
    public String f120072n;

    public C52370yj2(InterfaceC46046o30 interfaceC46046o30) {
        if (interfaceC46046o30 != null) {
            this.f120067i = interfaceC46046o30;
            this.f120068j = interfaceC46046o30.mo21947F1();
            m43842r(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    public final int m2783A(String str, AbstractC39920dj2.C19847a c19847a) {
        int length = c19847a.f77120a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c19847a.f77120a[i])) {
                this.f120069k = 0;
                this.f77116d[this.f77114b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final boolean m2782B(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m2757y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f120068j.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f120067i.mo21935o(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        m2757y();
        r3 = r6.f120068j.m34547p(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f120068j.readByte();
        r6.f120068j.readByte();
        m2773O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f120068j.readByte();
        r6.f120068j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (m2774L() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw m43840x("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        m2757y();
        m2773O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2781C(boolean z) throws IOException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.f120067i.mo21935o(i2)) {
                    byte m34547p = this.f120068j.m34547p(i);
                    if (m34547p != 10 && m34547p != 32 && m34547p != 13 && m34547p != 9) {
                        break;
                    }
                    i = i2;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input");
                }
            }
        }
    }

    /* renamed from: D */
    public final String m2780D(M70 m70) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long mo21929x1 = this.f120067i.mo21929x1(m70);
            if (mo21929x1 != -1) {
                if (this.f120068j.m34547p(mo21929x1) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f120068j.m34573G(mo21929x1));
                    this.f120068j.readByte();
                    sb.append(m2776I());
                } else if (sb == null) {
                    String m34573G = this.f120068j.m34573G(mo21929x1);
                    this.f120068j.readByte();
                    return m34573G;
                } else {
                    sb.append(this.f120068j.m34573G(mo21929x1));
                    this.f120068j.readByte();
                    return sb.toString();
                }
            } else {
                throw m43840x("Unterminated string");
            }
        }
    }

    /* renamed from: E */
    public final String m2779E() throws IOException {
        long mo21929x1 = this.f120067i.mo21929x1(f120064q);
        if (mo21929x1 != -1) {
            return this.f120068j.m34573G(mo21929x1);
        }
        return this.f120068j.mo21932r1();
    }

    /* renamed from: F */
    public final int m2778F() throws IOException {
        String str;
        String str2;
        int i;
        byte m34547p = this.f120068j.m34547p(0L);
        if (m34547p != 116 && m34547p != 84) {
            if (m34547p != 102 && m34547p != 70) {
                if (m34547p != 110 && m34547p != 78) {
                    return 0;
                }
                str = "null";
                str2 = ActionConst.NULL;
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f120067i.mo21935o(i3)) {
                return 0;
            }
            byte m34547p2 = this.f120068j.m34547p(i2);
            if (m34547p2 != str.charAt(i2) && m34547p2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f120067i.mo21935o(length + 1) && m2782B(this.f120068j.m34547p(length))) {
            return 0;
        }
        this.f120068j.skip(length);
        this.f120069k = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (m2782B(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r16.f120070l = r8;
        r16.f120068j.skip(r5);
        r16.f120069k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        r16.f120071m = r5;
        r16.f120069k = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2777G() throws IOException {
        char c;
        boolean z;
        char c2 = 1;
        long j = 0;
        int i = 0;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.f120067i.mo21935o(i2)) {
                break;
            }
            byte m34547p = this.f120068j.m34547p(i);
            if (m34547p != 43) {
                if (m34547p != 69 && m34547p != 101) {
                    if (m34547p != 45) {
                        if (m34547p != 46) {
                            if (m34547p < 48 || m34547p > 57) {
                                break;
                            } else if (c3 != c2 && c3 != 0) {
                                if (c3 == 2) {
                                    if (j == 0) {
                                        return 0;
                                    }
                                    long j2 = (10 * j) - (m34547p - 48);
                                    int i3 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                                    if (i3 <= 0 && (i3 != 0 || j2 >= j)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    z3 &= z;
                                    j = j2;
                                } else if (c3 == 3) {
                                    c3 = 4;
                                } else if (c3 == 5 || c3 == 6) {
                                    c3 = 7;
                                }
                            } else {
                                j = -(m34547p - 48);
                                c3 = 2;
                            }
                        } else if (c3 != 2) {
                            return 0;
                        } else {
                            c3 = 3;
                        }
                    } else {
                        c = 6;
                        if (c3 == 0) {
                            c3 = 1;
                            z2 = true;
                        } else if (c3 != 5) {
                            return 0;
                        }
                    }
                } else if (c3 != 2 && c3 != 4) {
                    return 0;
                } else {
                    c3 = 5;
                }
                i = i2;
                c2 = 1;
            } else {
                c = 6;
                if (c3 != 5) {
                    return 0;
                }
            }
            c3 = c;
            i = i2;
            c2 = 1;
        }
    }

    /* renamed from: I */
    public final char m2776I() throws IOException {
        int i;
        int i2;
        if (this.f120067i.mo21935o(1L)) {
            byte readByte = this.f120068j.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f77118f) {
                                        return (char) readByte;
                                    }
                                    throw m43840x("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f120067i.mo21935o(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte m34547p = this.f120068j.m34547p(i3);
                                        char c2 = (char) (c << 4);
                                        if (m34547p >= 48 && m34547p <= 57) {
                                            i2 = m34547p - 48;
                                        } else {
                                            if (m34547p >= 97 && m34547p <= 102) {
                                                i = m34547p - 97;
                                            } else if (m34547p >= 65 && m34547p <= 70) {
                                                i = m34547p + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                                            } else {
                                                throw m43840x("\\u" + this.f120068j.m34573G(4L));
                                            }
                                            i2 = i + 10;
                                        }
                                        c = (char) (c2 + i2);
                                    }
                                    this.f120068j.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw m43840x("Unterminated escape sequence");
    }

    /* renamed from: K */
    public final void m2775K(M70 m70) throws IOException {
        while (true) {
            long mo21929x1 = this.f120067i.mo21929x1(m70);
            if (mo21929x1 != -1) {
                if (this.f120068j.m34547p(mo21929x1) == 92) {
                    this.f120068j.skip(mo21929x1 + 1);
                    m2776I();
                } else {
                    this.f120068j.skip(mo21929x1 + 1);
                    return;
                }
            } else {
                throw m43840x("Unterminated string");
            }
        }
    }

    /* renamed from: L */
    public final boolean m2774L() throws IOException {
        boolean z;
        long size;
        InterfaceC46046o30 interfaceC46046o30 = this.f120067i;
        M70 m70 = f120066s;
        long mo21937e2 = interfaceC46046o30.mo21937e2(m70);
        if (mo21937e2 != -1) {
            z = true;
        } else {
            z = false;
        }
        C42488i30 c42488i30 = this.f120068j;
        if (z) {
            size = mo21937e2 + m70.size();
        } else {
            size = c42488i30.size();
        }
        c42488i30.skip(size);
        return z;
    }

    /* renamed from: O */
    public final void m2773O() throws IOException {
        long size;
        long mo21929x1 = this.f120067i.mo21929x1(f120065r);
        C42488i30 c42488i30 = this.f120068j;
        if (mo21929x1 != -1) {
            size = mo21929x1 + 1;
        } else {
            size = c42488i30.size();
        }
        c42488i30.skip(size);
    }

    /* renamed from: P */
    public final void m2772P() throws IOException {
        long mo21929x1 = this.f120067i.mo21929x1(f120064q);
        C42488i30 c42488i30 = this.f120068j;
        if (mo21929x1 == -1) {
            mo21929x1 = c42488i30.size();
        }
        c42488i30.skip(mo21929x1);
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: b */
    public void mo2771b() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 3) {
            m43842r(1);
            this.f77117e[this.f77114b - 1] = 0;
            this.f120069k = 0;
            return;
        }
        throw new C48211ri2("Expected BEGIN_ARRAY but was " + mo2761q() + " at path " + getPath());
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: c */
    public void mo2770c() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 1) {
            m43842r(3);
            this.f120069k = 0;
            return;
        }
        throw new C48211ri2("Expected BEGIN_OBJECT but was " + mo2761q() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f120069k = 0;
        this.f77115c[0] = 8;
        this.f77114b = 1;
        this.f120068j.m34561d();
        this.f120067i.close();
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: d */
    public void mo2769d() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 4) {
            int i2 = this.f77114b - 1;
            this.f77114b = i2;
            int[] iArr = this.f77117e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f120069k = 0;
            return;
        }
        throw new C48211ri2("Expected END_ARRAY but was " + mo2761q() + " at path " + getPath());
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: f */
    public void mo2768f() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 2) {
            int i2 = this.f77114b - 1;
            this.f77114b = i2;
            this.f77116d[i2] = null;
            int[] iArr = this.f77117e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f120069k = 0;
            return;
        }
        throw new C48211ri2("Expected END_OBJECT but was " + mo2761q() + " at path " + getPath());
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: g */
    public boolean mo2767g() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: i */
    public boolean mo2766i() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 5) {
            this.f120069k = 0;
            int[] iArr = this.f77117e;
            int i2 = this.f77114b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f120069k = 0;
            int[] iArr2 = this.f77117e;
            int i3 = this.f77114b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C48211ri2("Expected a boolean but was " + mo2761q() + " at path " + getPath());
        }
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: k */
    public double mo2765k() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 16) {
            this.f120069k = 0;
            int[] iArr = this.f77117e;
            int i2 = this.f77114b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f120070l;
        }
        if (i == 17) {
            this.f120072n = this.f120068j.m34573G(this.f120071m);
        } else if (i == 9) {
            this.f120072n = m2780D(f120063p);
        } else if (i == 8) {
            this.f120072n = m2780D(f120062o);
        } else if (i == 10) {
            this.f120072n = m2779E();
        } else if (i != 11) {
            throw new C48211ri2("Expected a double but was " + mo2761q() + " at path " + getPath());
        }
        this.f120069k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f120072n);
            if (!this.f77118f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new C32623Ei2("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f120072n = null;
            this.f120069k = 0;
            int[] iArr2 = this.f77117e;
            int i3 = this.f77114b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C48211ri2("Expected a double but was " + this.f120072n + " at path " + getPath());
        }
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: l */
    public int mo2764l() throws IOException {
        String m2780D;
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 16) {
            long j = this.f120070l;
            int i2 = (int) j;
            if (j == i2) {
                this.f120069k = 0;
                int[] iArr = this.f77117e;
                int i3 = this.f77114b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C48211ri2("Expected an int but was " + this.f120070l + " at path " + getPath());
        }
        if (i == 17) {
            this.f120072n = this.f120068j.m34573G(this.f120071m);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new C48211ri2("Expected an int but was " + mo2761q() + " at path " + getPath());
            }
        } else {
            if (i == 9) {
                m2780D = m2780D(f120063p);
            } else {
                m2780D = m2780D(f120062o);
            }
            this.f120072n = m2780D;
            try {
                int parseInt = Integer.parseInt(m2780D);
                this.f120069k = 0;
                int[] iArr2 = this.f77117e;
                int i4 = this.f77114b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f120069k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f120072n);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f120072n = null;
                this.f120069k = 0;
                int[] iArr3 = this.f77117e;
                int i6 = this.f77114b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C48211ri2("Expected an int but was " + this.f120072n + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C48211ri2("Expected an int but was " + this.f120072n + " at path " + getPath());
        }
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: m */
    public String mo2763m() throws IOException {
        String str;
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 14) {
            str = m2779E();
        } else if (i == 13) {
            str = m2780D(f120063p);
        } else if (i == 12) {
            str = m2780D(f120062o);
        } else if (i == 15) {
            str = this.f120072n;
        } else {
            throw new C48211ri2("Expected a name but was " + mo2761q() + " at path " + getPath());
        }
        this.f120069k = 0;
        this.f77116d[this.f77114b - 1] = str;
        return str;
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: n */
    public String mo2762n() throws IOException {
        String m34573G;
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i == 10) {
            m34573G = m2779E();
        } else if (i == 9) {
            m34573G = m2780D(f120063p);
        } else if (i == 8) {
            m34573G = m2780D(f120062o);
        } else if (i == 11) {
            m34573G = this.f120072n;
            this.f120072n = null;
        } else if (i == 16) {
            m34573G = Long.toString(this.f120070l);
        } else if (i == 17) {
            m34573G = this.f120068j.m34573G(this.f120071m);
        } else {
            throw new C48211ri2("Expected a string but was " + mo2761q() + " at path " + getPath());
        }
        this.f120069k = 0;
        int[] iArr = this.f77117e;
        int i2 = this.f77114b - 1;
        iArr[i2] = iArr[i2] + 1;
        return m34573G;
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: q */
    public AbstractC39920dj2.EnumC19848b mo2761q() throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        switch (i) {
            case 1:
                return AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT;
            case 2:
                return AbstractC39920dj2.EnumC19848b.END_OBJECT;
            case 3:
                return AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY;
            case 4:
                return AbstractC39920dj2.EnumC19848b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC39920dj2.EnumC19848b.BOOLEAN;
            case 7:
                return AbstractC39920dj2.EnumC19848b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC39920dj2.EnumC19848b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC39920dj2.EnumC19848b.NAME;
            case 16:
            case 17:
                return AbstractC39920dj2.EnumC19848b.NUMBER;
            case 18:
                return AbstractC39920dj2.EnumC19848b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: s */
    public int mo2760s(AbstractC39920dj2.C19847a c19847a) throws IOException {
        int i = this.f120069k;
        if (i == 0) {
            i = m2756z();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m2783A(this.f120072n, c19847a);
        }
        int mo21944Q2 = this.f120067i.mo21944Q2(c19847a.f77121b);
        if (mo21944Q2 != -1) {
            this.f120069k = 0;
            this.f77116d[this.f77114b - 1] = c19847a.f77120a[mo21944Q2];
            return mo21944Q2;
        }
        String str = this.f77116d[this.f77114b - 1];
        String mo2763m = mo2763m();
        int m2783A = m2783A(mo2763m, c19847a);
        if (m2783A == -1) {
            this.f120069k = 15;
            this.f120072n = mo2763m;
            this.f77116d[this.f77114b - 1] = str;
        }
        return m2783A;
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: t */
    public void mo2759t() throws IOException {
        if (!this.f77119g) {
            int i = this.f120069k;
            if (i == 0) {
                i = m2756z();
            }
            if (i == 14) {
                m2772P();
            } else if (i == 13) {
                m2775K(f120063p);
            } else if (i == 12) {
                m2775K(f120062o);
            } else if (i != 15) {
                throw new C48211ri2("Expected a name but was " + mo2761q() + " at path " + getPath());
            }
            this.f120069k = 0;
            this.f77116d[this.f77114b - 1] = "null";
            return;
        }
        throw new C48211ri2("Cannot skip unexpected " + mo2761q() + " at " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f120067i + ")";
    }

    @Override // p000.AbstractC39920dj2
    /* renamed from: u */
    public void mo2758u() throws IOException {
        if (!this.f77119g) {
            int i = 0;
            do {
                int i2 = this.f120069k;
                if (i2 == 0) {
                    i2 = m2756z();
                }
                if (i2 == 3) {
                    m43842r(1);
                } else if (i2 == 1) {
                    m43842r(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f77114b--;
                        } else {
                            throw new C48211ri2("Expected a value but was " + mo2761q() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f77114b--;
                        } else {
                            throw new C48211ri2("Expected a value but was " + mo2761q() + " at path " + getPath());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.f120068j.skip(this.f120071m);
                                } else if (i2 == 18) {
                                    throw new C48211ri2("Expected a value but was " + mo2761q() + " at path " + getPath());
                                }
                            } else {
                                m2775K(f120062o);
                            }
                        } else {
                            m2775K(f120063p);
                        }
                    } else {
                        m2772P();
                    }
                    this.f120069k = 0;
                }
                i++;
                this.f120069k = 0;
            } while (i != 0);
            int[] iArr = this.f77117e;
            int i3 = this.f77114b;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f77116d[i3 - 1] = "null";
            return;
        }
        throw new C48211ri2("Cannot skip unexpected " + mo2761q() + " at " + getPath());
    }

    /* renamed from: y */
    public final void m2757y() throws IOException {
        if (this.f77118f) {
            return;
        }
        throw m43840x("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: z */
    public final int m2756z() throws IOException {
        int[] iArr = this.f77115c;
        int i = this.f77114b;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m2781C = m2781C(true);
            this.f120068j.readByte();
            if (m2781C != 44) {
                if (m2781C != 59) {
                    if (m2781C == 93) {
                        this.f120069k = 4;
                        return 4;
                    }
                    throw m43840x("Unterminated array");
                }
                m2757y();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m2781C2 = m2781C(true);
                this.f120068j.readByte();
                if (m2781C2 != 58) {
                    if (m2781C2 == 61) {
                        m2757y();
                        if (this.f120067i.mo21935o(1L) && this.f120068j.m34547p(0L) == 62) {
                            this.f120068j.readByte();
                        }
                    } else {
                        throw m43840x("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (m2781C(false) == -1) {
                    this.f120069k = 18;
                    return 18;
                }
                m2757y();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m2781C3 = m2781C(true);
                this.f120068j.readByte();
                if (m2781C3 != 44) {
                    if (m2781C3 != 59) {
                        if (m2781C3 == 125) {
                            this.f120069k = 2;
                            return 2;
                        }
                        throw m43840x("Unterminated object");
                    }
                    m2757y();
                }
            }
            int m2781C4 = m2781C(true);
            if (m2781C4 != 34) {
                if (m2781C4 != 39) {
                    if (m2781C4 != 125) {
                        m2757y();
                        if (m2782B((char) m2781C4)) {
                            this.f120069k = 14;
                            return 14;
                        }
                        throw m43840x("Expected name");
                    } else if (i2 != 5) {
                        this.f120068j.readByte();
                        this.f120069k = 2;
                        return 2;
                    } else {
                        throw m43840x("Expected name");
                    }
                }
                this.f120068j.readByte();
                m2757y();
                this.f120069k = 12;
                return 12;
            }
            this.f120068j.readByte();
            this.f120069k = 13;
            return 13;
        }
        int m2781C5 = m2781C(true);
        if (m2781C5 != 34) {
            if (m2781C5 != 39) {
                if (m2781C5 != 44 && m2781C5 != 59) {
                    if (m2781C5 != 91) {
                        if (m2781C5 != 93) {
                            if (m2781C5 != 123) {
                                int m2778F = m2778F();
                                if (m2778F != 0) {
                                    return m2778F;
                                }
                                int m2777G = m2777G();
                                if (m2777G != 0) {
                                    return m2777G;
                                }
                                if (m2782B(this.f120068j.m34547p(0L))) {
                                    m2757y();
                                    this.f120069k = 10;
                                    return 10;
                                }
                                throw m43840x("Expected value");
                            }
                            this.f120068j.readByte();
                            this.f120069k = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f120068j.readByte();
                            this.f120069k = 4;
                            return 4;
                        }
                    } else {
                        this.f120068j.readByte();
                        this.f120069k = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m43840x("Unexpected value");
                }
                m2757y();
                this.f120069k = 7;
                return 7;
            }
            m2757y();
            this.f120068j.readByte();
            this.f120069k = 8;
            return 8;
        }
        this.f120068j.readByte();
        this.f120069k = 9;
        return 9;
    }
}
