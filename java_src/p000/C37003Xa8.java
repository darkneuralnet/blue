package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzeq;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* renamed from: Xa8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37003Xa8 implements Closeable {

    /* renamed from: b */
    public final Reader f43436b;

    /* renamed from: j */
    public long f43444j;

    /* renamed from: k */
    public int f43445k;

    /* renamed from: l */
    public int[] f43446l;

    /* renamed from: n */
    public String[] f43448n;

    /* renamed from: o */
    public int[] f43449o;

    /* renamed from: c */
    public boolean f43437c = false;

    /* renamed from: d */
    public final char[] f43438d = new char[1024];

    /* renamed from: e */
    public int f43439e = 0;

    /* renamed from: f */
    public int f43440f = 0;

    /* renamed from: g */
    public int f43441g = 0;

    /* renamed from: h */
    public int f43442h = 0;

    /* renamed from: i */
    public int f43443i = 0;

    /* renamed from: m */
    public int f43447m = 1;

    static {
        C46914pW7.f103771a = new C33961Ka8();
    }

    public C37003Xa8(Reader reader) {
        int[] iArr = new int[32];
        this.f43446l = iArr;
        iArr[0] = 6;
        this.f43448n = new String[32];
        this.f43449o = new int[32];
        this.f43436b = reader;
    }

    /* renamed from: A */
    public final boolean m76838A(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m76820v();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0211, code lost:
        if (m76838A(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0214, code lost:
        if (r9 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0216, code lost:
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x021c, code lost:
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x021e, code lost:
        if (r16 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0220, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0222, code lost:
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0226, code lost:
        if (r11 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0228, code lost:
        if (r14 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x022b, code lost:
        if (r14 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x022e, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x022f, code lost:
        r19.f43444j = r11;
        r19.f43439e += r10;
        r19.f43443i = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x023d, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x023f, code lost:
        if (r9 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0242, code lost:
        if (r9 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0245, code lost:
        if (r9 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0247, code lost:
        r19.f43445k = r10;
        r19.f43443i = 16;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m76837a() throws IOException {
        int m76824r;
        int i;
        int m76824r2;
        int i2;
        String str;
        String str2;
        int i3;
        char c;
        int i4;
        boolean z;
        int i5;
        int[] iArr = this.f43446l;
        int i6 = this.f43447m - 1;
        int i7 = iArr[i6];
        int i8 = 1;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int m76824r3 = m76824r(true);
            if (m76824r3 != 44) {
                if (m76824r3 != 59) {
                    if (m76824r3 == 93) {
                        this.f43443i = 4;
                        return 4;
                    }
                    throw m76823s("Unterminated array");
                }
                m76820v();
            }
        } else if (i7 != 3 && i7 != 5) {
            if (i7 == 4) {
                iArr[i6] = 5;
                int m76824r4 = m76824r(true);
                if (m76824r4 != 58) {
                    if (m76824r4 == 61) {
                        m76820v();
                        if (this.f43439e < this.f43440f || m76817z(1)) {
                            char[] cArr = this.f43438d;
                            int i9 = this.f43439e;
                            if (cArr[i9] == '>') {
                                this.f43439e = i9 + 1;
                            }
                        }
                    } else {
                        throw m76823s("Expected ':'");
                    }
                }
            } else if (i7 == 6) {
                if (this.f43437c) {
                    m76824r(true);
                    int i10 = this.f43439e - 1;
                    this.f43439e = i10;
                    if (i10 + 5 <= this.f43440f || m76817z(5)) {
                        char[] cArr2 = this.f43438d;
                        if (cArr2[i10] == ')' && cArr2[i10 + 1] == ']' && cArr2[i10 + 2] == '}' && cArr2[i10 + 3] == '\'' && cArr2[i10 + 4] == '\n') {
                            this.f43439e += 5;
                        }
                    }
                }
                this.f43446l[this.f43447m - 1] = 7;
            } else {
                if (i7 == 7) {
                    i = 0;
                    if (m76824r(false) == -1) {
                        this.f43443i = 17;
                        return 17;
                    }
                    m76820v();
                    this.f43439e--;
                } else {
                    i = 0;
                    if (i7 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                m76824r2 = m76824r(true);
                if (m76824r2 == 34) {
                    if (m76824r2 != 39) {
                        if (m76824r2 != 44 && m76824r2 != 59) {
                            if (m76824r2 != 91) {
                                if (m76824r2 != 93) {
                                    if (m76824r2 != 123) {
                                        int i11 = this.f43439e - 1;
                                        this.f43439e = i11;
                                        char c2 = this.f43438d[i11];
                                        if (c2 != 't' && c2 != 'T') {
                                            if (c2 != 'f' && c2 != 'F') {
                                                if (c2 == 'n' || c2 == 'N') {
                                                    str = "null";
                                                    str2 = ActionConst.NULL;
                                                    i3 = 7;
                                                }
                                                i3 = i;
                                                if (i3 != 0) {
                                                    char[] cArr3 = this.f43438d;
                                                    int i12 = this.f43439e;
                                                    int i13 = this.f43440f;
                                                    int i14 = i;
                                                    int i15 = i14;
                                                    int i16 = i15;
                                                    long j = 0;
                                                    boolean z2 = true;
                                                    while (true) {
                                                        if (i12 + i15 == i13) {
                                                            if (i15 == 1024) {
                                                                break;
                                                            } else if (!m76817z(i15 + 1)) {
                                                                break;
                                                            } else {
                                                                int i17 = this.f43439e;
                                                                i13 = this.f43440f;
                                                                i12 = i17;
                                                            }
                                                        }
                                                        char c3 = cArr3[i12 + i15];
                                                        if (c3 != '+') {
                                                            if (c3 != 'E' && c3 != 'e') {
                                                                if (c3 != '-') {
                                                                    if (c3 != '.') {
                                                                        if (c3 < '0' || c3 > '9') {
                                                                            break;
                                                                        }
                                                                        if (i14 != i8 && i14 != 0) {
                                                                            if (i14 == 2) {
                                                                                if (j == 0) {
                                                                                    break;
                                                                                }
                                                                                long j2 = (10 * j) - (c3 - '0');
                                                                                int i18 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                                                                                if (i18 <= 0 && (i18 != 0 || j2 >= j)) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                z2 &= z;
                                                                                j = j2;
                                                                            } else if (i14 == 3) {
                                                                                i14 = 4;
                                                                            } else if (i14 == 5 || i14 == 6) {
                                                                                i14 = 7;
                                                                            }
                                                                        } else {
                                                                            j = -(c3 - '0');
                                                                            i14 = 2;
                                                                        }
                                                                        i15++;
                                                                        i8 = 1;
                                                                    } else if (i14 != 2) {
                                                                        break;
                                                                    } else {
                                                                        i14 = 3;
                                                                        i15++;
                                                                        i8 = 1;
                                                                    }
                                                                } else {
                                                                    i4 = 6;
                                                                    if (i14 == 0) {
                                                                        i14 = 1;
                                                                        i16 = 1;
                                                                        i15++;
                                                                        i8 = 1;
                                                                    } else {
                                                                        if (i14 != 5) {
                                                                            break;
                                                                        }
                                                                        i14 = i4;
                                                                        i15++;
                                                                        i8 = 1;
                                                                    }
                                                                }
                                                            } else if (i14 != 2 && i14 != 4) {
                                                                break;
                                                            } else {
                                                                i14 = 5;
                                                                i15++;
                                                                i8 = 1;
                                                            }
                                                            if (i5 == 0) {
                                                                return i5;
                                                            }
                                                            if (m76838A(this.f43438d[this.f43439e])) {
                                                                m76820v();
                                                                this.f43443i = 10;
                                                                return 10;
                                                            }
                                                            throw m76823s("Expected value");
                                                        }
                                                        i4 = 6;
                                                        if (i14 != 5) {
                                                            break;
                                                        }
                                                        i14 = i4;
                                                        i15++;
                                                        i8 = 1;
                                                    }
                                                    i5 = 0;
                                                    if (i5 == 0) {
                                                    }
                                                } else {
                                                    return i3;
                                                }
                                            } else {
                                                str = "false";
                                                str2 = "FALSE";
                                                i3 = 6;
                                            }
                                        } else {
                                            str = "true";
                                            str2 = "TRUE";
                                            i3 = 5;
                                        }
                                        int length = str.length();
                                        int i19 = 1;
                                        while (true) {
                                            if (i19 < length) {
                                                if ((this.f43439e + i19 >= this.f43440f && !m76817z(i19 + 1)) || ((c = this.f43438d[this.f43439e + i19]) != str.charAt(i19) && c != str2.charAt(i19))) {
                                                    break;
                                                }
                                                i19++;
                                            } else if ((this.f43439e + length >= this.f43440f && !m76817z(length + 1)) || !m76838A(this.f43438d[this.f43439e + length])) {
                                                this.f43439e += length;
                                                this.f43443i = i3;
                                            }
                                        }
                                        if (i3 != 0) {
                                        }
                                    } else {
                                        this.f43443i = 1;
                                        return 1;
                                    }
                                } else {
                                    i2 = 1;
                                    if (i7 == 1) {
                                        this.f43443i = 4;
                                        return 4;
                                    }
                                }
                            } else {
                                this.f43443i = 3;
                                return 3;
                            }
                        } else {
                            i2 = 1;
                        }
                        if (i7 != i2 && i7 != 2) {
                            throw m76823s("Unexpected value");
                        }
                        m76820v();
                        this.f43439e--;
                        this.f43443i = 7;
                        return 7;
                    }
                    m76820v();
                    this.f43443i = 8;
                    return 8;
                }
                this.f43443i = 9;
                return 9;
            }
        } else {
            iArr[i6] = 4;
            if (i7 == 5 && (m76824r = m76824r(true)) != 44) {
                if (m76824r != 59) {
                    if (m76824r == 125) {
                        this.f43443i = 2;
                        return 2;
                    }
                    throw m76823s("Unterminated object");
                }
                m76820v();
            }
            int m76824r5 = m76824r(true);
            if (m76824r5 != 34) {
                if (m76824r5 != 39) {
                    if (m76824r5 != 125) {
                        m76820v();
                        this.f43439e--;
                        if (m76838A((char) m76824r5)) {
                            this.f43443i = 14;
                            return 14;
                        }
                        throw m76823s("Expected name");
                    } else if (i7 != 5) {
                        this.f43443i = 2;
                        return 2;
                    } else {
                        throw m76823s("Expected name");
                    }
                }
                m76820v();
                this.f43443i = 12;
                return 12;
            }
            this.f43443i = 13;
            return 13;
        }
        i = 0;
        m76824r2 = m76824r(true);
        if (m76824r2 == 34) {
        }
    }

    /* renamed from: b */
    public final String m76836b() throws IOException {
        String m76822t;
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 14) {
            m76822t = m76821u();
        } else if (i == 12) {
            m76822t = m76822t(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 13) {
            m76822t = m76822t('\"');
        } else {
            String m27096a = C44589lb8.m27096a(m76825q());
            String zzb = zzb();
            StringBuilder sb = new StringBuilder(m27096a.length() + 24 + zzb.length());
            sb.append("Expected a name but was ");
            sb.append(m27096a);
            sb.append(zzb);
            throw new IllegalStateException(sb.toString());
        }
        this.f43443i = 0;
        this.f43448n[this.f43447m - 1] = m76822t;
        return m76822t;
    }

    /* renamed from: c */
    public final String m76835c() throws IOException {
        String str;
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 10) {
            str = m76821u();
        } else if (i == 8) {
            str = m76822t(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 9) {
            str = m76822t('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.f43444j);
        } else if (i == 16) {
            str = new String(this.f43438d, this.f43439e, this.f43445k);
            this.f43439e += this.f43445k;
        } else {
            String m27096a = C44589lb8.m27096a(m76825q());
            String zzb = zzb();
            StringBuilder sb = new StringBuilder(m27096a.length() + 26 + zzb.length());
            sb.append("Expected a string but was ");
            sb.append(m27096a);
            sb.append(zzb);
            throw new IllegalStateException(sb.toString());
        }
        this.f43443i = 0;
        int[] iArr = this.f43449o;
        int i2 = this.f43447m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43443i = 0;
        this.f43446l[0] = 8;
        this.f43447m = 1;
        this.f43436b.close();
    }

    /* renamed from: d */
    public final void m76834d() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 3) {
            m76819x(1);
            this.f43449o[this.f43447m - 1] = 0;
            this.f43443i = 0;
            return;
        }
        String m27096a = C44589lb8.m27096a(m76825q());
        String zzb = zzb();
        StringBuilder sb = new StringBuilder(m27096a.length() + 29 + zzb.length());
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(m27096a);
        sb.append(zzb);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public final void m76833f() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 1) {
            m76819x(3);
            this.f43443i = 0;
            return;
        }
        String m27096a = C44589lb8.m27096a(m76825q());
        String zzb = zzb();
        StringBuilder sb = new StringBuilder(m27096a.length() + 30 + zzb.length());
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(m27096a);
        sb.append(zzb);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final void m76832g() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 4) {
            int i2 = this.f43447m - 1;
            this.f43447m = i2;
            int[] iArr = this.f43449o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f43443i = 0;
            return;
        }
        String m27096a = C44589lb8.m27096a(m76825q());
        String zzb = zzb();
        StringBuilder sb = new StringBuilder(m27096a.length() + 27 + zzb.length());
        sb.append("Expected END_ARRAY but was ");
        sb.append(m27096a);
        sb.append(zzb);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: i */
    public final void m76831i() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 2) {
            int i2 = this.f43447m - 1;
            this.f43447m = i2;
            this.f43448n[i2] = null;
            int[] iArr = this.f43449o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f43443i = 0;
            return;
        }
        String m27096a = C44589lb8.m27096a(m76825q());
        String zzb = zzb();
        StringBuilder sb = new StringBuilder(m27096a.length() + 28 + zzb.length());
        sb.append("Expected END_OBJECT but was ");
        sb.append(m27096a);
        sb.append(zzb);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public final void m76830k() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 7) {
            this.f43443i = 0;
            int[] iArr = this.f43449o;
            int i2 = this.f43447m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String m27096a = C44589lb8.m27096a(m76825q());
        String zzb = zzb();
        StringBuilder sb = new StringBuilder(m27096a.length() + 22 + zzb.length());
        sb.append("Expected null but was ");
        sb.append(m27096a);
        sb.append(zzb);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public final void m76829l(boolean z) {
        this.f43437c = z;
    }

    /* renamed from: m */
    public final boolean m76828m() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: n */
    public final boolean m76827n() {
        return this.f43437c;
    }

    /* renamed from: p */
    public final boolean m76826p() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        if (i == 5) {
            this.f43443i = 0;
            int[] iArr = this.f43449o;
            int i2 = this.f43447m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f43443i = 0;
            int[] iArr2 = this.f43449o;
            int i3 = this.f43447m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            String m27096a = C44589lb8.m27096a(m76825q());
            String zzb = zzb();
            StringBuilder sb = new StringBuilder(m27096a.length() + 27 + zzb.length());
            sb.append("Expected a boolean but was ");
            sb.append(m27096a);
            sb.append(zzb);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: q */
    public final int m76825q() throws IOException {
        int i = this.f43443i;
        if (i == 0) {
            i = m76837a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* renamed from: r */
    public final int m76824r(boolean z) throws IOException {
        String str;
        char[] cArr = this.f43438d;
        int i = this.f43439e;
        int i2 = this.f43440f;
        while (true) {
            if (i == i2) {
                this.f43439e = i;
                if (!m76817z(1)) {
                    if (z) {
                        String zzb = zzb();
                        if (zzb.length() != 0) {
                            str = "End of input".concat(zzb);
                        } else {
                            str = new String("End of input");
                        }
                        throw new EOFException(str);
                    }
                    return -1;
                }
                i = this.f43439e;
                i2 = this.f43440f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f43441g++;
                this.f43442h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f43439e = i3;
                    if (i3 == i2) {
                        this.f43439e = i3 - 1;
                        boolean m76817z = m76817z(2);
                        this.f43439e++;
                        if (!m76817z) {
                            return 47;
                        }
                    }
                    m76820v();
                    int i4 = this.f43439e;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.f43439e = i4 + 1;
                        m76818y();
                        i = this.f43439e;
                        i2 = this.f43440f;
                    } else {
                        this.f43439e = i4 + 1;
                        while (true) {
                            if (this.f43439e + 2 > this.f43440f && !m76817z(2)) {
                                throw m76823s("Unterminated comment");
                            }
                            char[] cArr2 = this.f43438d;
                            int i5 = this.f43439e;
                            if (cArr2[i5] == '\n') {
                                this.f43441g++;
                                this.f43442h = i5 + 1;
                            } else {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.f43438d[this.f43439e + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                i = 2 + this.f43439e;
                                i2 = this.f43440f;
                                break;
                            }
                            this.f43439e++;
                        }
                    }
                } else if (c == '#') {
                    this.f43439e = i3;
                    m76820v();
                    m76818y();
                    i = this.f43439e;
                    i2 = this.f43440f;
                } else {
                    this.f43439e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: s */
    public final IOException m76823s(String str) throws IOException {
        String zzb = zzb();
        throw new zzeq(zzb.length() != 0 ? str.concat(zzb) : new String(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
        r0 = new java.lang.String(r5, r10.f43439e, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
        if (r0.length() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
        r0 = "\\u".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e9, code lost:
        r0 = new java.lang.String("\\u");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
        throw new java.lang.NumberFormatException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0128, code lost:
        if (r1 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012a, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.f43439e = r2;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m76822t(char c) throws IOException {
        int i;
        char[] cArr = this.f43438d;
        StringBuilder sb = null;
        loop0: do {
            int i2 = this.f43439e;
            int i3 = this.f43440f;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (i2 < i4) {
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f43439e = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        this.f43439e = i6;
                        int i8 = (i6 - i5) - 1;
                        if (sb == null) {
                            int i9 = i8 + 1;
                            sb = new StringBuilder(Math.max(i9 + i9, 16));
                        }
                        sb.append(cArr, i5, i8);
                        if (this.f43439e == this.f43440f && !m76817z(1)) {
                            throw m76823s("Unterminated escape sequence");
                        }
                        char[] cArr2 = this.f43438d;
                        int i10 = this.f43439e;
                        int i11 = i10 + 1;
                        this.f43439e = i11;
                        char c4 = cArr2[i10];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 != 'b') {
                                    if (c4 != 'f') {
                                        if (c4 == 'n') {
                                            continue;
                                        } else if (c4 != 'r') {
                                            if (c4 != 't') {
                                                if (c4 == 'u') {
                                                    if (i11 + 4 > this.f43440f && !m76817z(4)) {
                                                        throw m76823s("Unterminated escape sequence");
                                                    }
                                                    int i12 = this.f43439e;
                                                    int i13 = i12 + 4;
                                                    c3 = 0;
                                                    while (i12 < i13) {
                                                        char[] cArr3 = this.f43438d;
                                                        char c5 = cArr3[i12];
                                                        char c6 = (char) (c3 << 4);
                                                        if (c5 >= '0' && c5 <= '9') {
                                                            i = c5 - '0';
                                                        } else if (c5 >= 'a' && c5 <= 'f') {
                                                            i = c5 - 'W';
                                                        } else if (c5 < 'A' || c5 > 'F') {
                                                            break loop0;
                                                        } else {
                                                            i = c5 - '7';
                                                        }
                                                        c3 = (char) (c6 + i);
                                                        i12++;
                                                    }
                                                    this.f43439e += 4;
                                                } else {
                                                    throw m76823s("Invalid escape sequence");
                                                }
                                            } else {
                                                c3 = '\t';
                                            }
                                        } else {
                                            c3 = '\r';
                                        }
                                    } else {
                                        c3 = '\f';
                                    }
                                } else {
                                    c3 = '\b';
                                }
                                sb.append(c3);
                                i2 = this.f43439e;
                                i3 = this.f43440f;
                            }
                        } else {
                            this.f43441g++;
                            this.f43442h = i11;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i2 = this.f43439e;
                        i3 = this.f43440f;
                    } else {
                        if (c2 == '\n') {
                            this.f43441g++;
                            this.f43442h = i6;
                        }
                        i2 = i6;
                    }
                }
                break;
            }
        } while (m76817z(1));
        throw m76823s("Unterminated string");
    }

    public final String toString() {
        String simpleName = C37003Xa8.class.getSimpleName();
        String zzb = zzb();
        return zzb.length() != 0 ? simpleName.concat(zzb) : new String(simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        m76820v();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m76821u() throws IOException {
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f43439e + i2;
                if (i3 < this.f43440f) {
                    char c = this.f43438d[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < 1024) {
                    if (!m76817z(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.f43438d, this.f43439e, i2);
                    this.f43439e += i2;
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.f43438d, this.f43439e, i);
            } else {
                sb2.append(this.f43438d, this.f43439e, i);
                sb = sb2.toString();
            }
            this.f43439e += i;
            return sb;
        } while (m76817z(1));
        if (sb2 != null) {
        }
        this.f43439e += i;
        return sb;
    }

    /* renamed from: v */
    public final void m76820v() throws IOException {
        if (!this.f43437c) {
            throw m76823s("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: x */
    public final void m76819x(int i) {
        int i2 = this.f43447m;
        int[] iArr = this.f43446l;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.f43446l = Arrays.copyOf(iArr, i3);
            this.f43449o = Arrays.copyOf(this.f43449o, i3);
            this.f43448n = (String[]) Arrays.copyOf(this.f43448n, i3);
        }
        int[] iArr2 = this.f43446l;
        int i4 = this.f43447m;
        this.f43447m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: y */
    public final void m76818y() throws IOException {
        char c;
        do {
            if (this.f43439e < this.f43440f || m76817z(1)) {
                char[] cArr = this.f43438d;
                int i = this.f43439e;
                int i2 = i + 1;
                this.f43439e = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f43441g++;
                    this.f43442h = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: z */
    public final boolean m76817z(int i) throws IOException {
        int i2;
        char[] cArr = this.f43438d;
        int i3 = this.f43442h;
        int i4 = this.f43439e;
        this.f43442h = i3 - i4;
        int i5 = this.f43440f;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f43440f = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f43440f = 0;
        }
        this.f43439e = 0;
        do {
            Reader reader = this.f43436b;
            int i7 = this.f43440f;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f43440f + read;
            this.f43440f = i2;
            if (this.f43441g == 0 && this.f43442h == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f43439e++;
                this.f43442h = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public final String zzb() {
        int i = this.f43441g + 1;
        int i2 = (this.f43439e - this.f43442h) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i3 = 0; i3 < this.f43447m; i3++) {
            int i4 = this.f43446l[i3];
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3 || i4 == 4 || i4 == 5) {
                    sb.append(CoreConstants.DOT);
                    String str = this.f43448n[i3];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                int i5 = this.f43449o[i3];
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(sb2.length() + 45);
        sb3.append(" at line ");
        sb3.append(i);
        sb3.append(" column ");
        sb3.append(i2);
        sb3.append(" path ");
        sb3.append(sb2);
        return sb3.toString();
    }
}
