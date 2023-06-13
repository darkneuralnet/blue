package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
/* renamed from: Og2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34945Og2 {

    /* renamed from: t */
    public static boolean[] f27029t;

    /* renamed from: u */
    public static boolean[] f27030u;

    /* renamed from: v */
    public static boolean[] f27031v;

    /* renamed from: w */
    public static boolean[] f27032w;

    /* renamed from: x */
    public static boolean[] f27033x;

    /* renamed from: a */
    public char f27034a;

    /* renamed from: b */
    public C40512ej2 f27035b;

    /* renamed from: c */
    public String f27036c;

    /* renamed from: d */
    public final C6096a f27037d = new C6096a(15);

    /* renamed from: e */
    public Object f27038e;

    /* renamed from: f */
    public String f27039f;

    /* renamed from: g */
    public int f27040g;

    /* renamed from: h */
    public final boolean f27041h;

    /* renamed from: i */
    public final boolean f27042i;

    /* renamed from: j */
    public final boolean f27043j;

    /* renamed from: k */
    public final boolean f27044k;

    /* renamed from: l */
    public final boolean f27045l;

    /* renamed from: m */
    public final boolean f27046m;

    /* renamed from: n */
    public final boolean f27047n;

    /* renamed from: o */
    public final boolean f27048o;

    /* renamed from: p */
    public final boolean f27049p;

    /* renamed from: q */
    public final boolean f27050q;

    /* renamed from: r */
    public final boolean f27051r;

    /* renamed from: s */
    public final boolean f27052s;

    /* renamed from: Og2$a */
    /* loaded from: classes6.dex */
    public static class C6096a {

        /* renamed from: a */
        public char[] f27053a;

        /* renamed from: b */
        public int f27054b = -1;

        public C6096a(int i) {
            this.f27053a = new char[i];
        }

        /* renamed from: a */
        public void m91686a(char c) {
            int i = this.f27054b + 1;
            this.f27054b = i;
            char[] cArr = this.f27053a;
            if (cArr.length <= i) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f27053a = cArr2;
            }
            this.f27053a[this.f27054b] = c;
        }

        /* renamed from: b */
        public void m91685b() {
            this.f27054b = -1;
        }

        public String toString() {
            return new String(this.f27053a, 0, this.f27054b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f27029t = zArr;
        boolean[] zArr2 = new boolean[126];
        f27030u = zArr2;
        boolean[] zArr3 = new boolean[126];
        f27031v = zArr3;
        boolean[] zArr4 = new boolean[126];
        f27032w = zArr4;
        boolean[] zArr5 = new boolean[126];
        f27033x = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public AbstractC34945Og2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if ((i & 4) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f27042i = z;
        if ((i & 2) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f27043j = z2;
        if ((i & 1) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f27044k = z3;
        if ((i & 8) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f27048o = z4;
        if ((i & 16) > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f27050q = z5;
        if ((i & 32) > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f27041h = z6;
        if ((i & 64) > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f27045l = z7;
        if ((i & 128) > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f27049p = z8;
        if ((i & 768) != 768) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27046m = z9;
        if ((i & 512) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27047n = z10;
        if ((i & 1024) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27051r = z11;
        this.f27052s = (i & 2048) > 0;
    }

    /* renamed from: a */
    public void m91700a() throws ParseException {
        if (this.f27048o) {
            return;
        }
        int length = this.f27039f.length();
        for (int i = 0; i < length; i++) {
            char charAt = this.f27039f.charAt(i);
            if (charAt >= 0) {
                if (charAt > 31) {
                    if (charAt == 127 && this.f27051r) {
                        throw new ParseException(this.f27040g + i, 0, Character.valueOf(charAt));
                    }
                } else {
                    throw new ParseException(this.f27040g + i, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    /* renamed from: b */
    public void m91699b() throws ParseException {
        int length = this.f27039f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (!this.f27039f.equals("00")) {
                return;
            }
            throw new ParseException(this.f27040g, 6, this.f27039f);
        }
        char charAt = this.f27039f.charAt(0);
        char charAt2 = this.f27039f.charAt(1);
        if (charAt == '-') {
            char charAt3 = this.f27039f.charAt(2);
            if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
                throw new ParseException(this.f27040g, 6, this.f27039f);
            }
        } else if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
            throw new ParseException(this.f27040g, 6, this.f27039f);
        }
    }

    /* renamed from: c */
    public Number m91698c() throws ParseException {
        if (!this.f27041h) {
            m91699b();
        }
        try {
            if (!this.f27049p) {
                return Float.valueOf(Float.parseFloat(this.f27039f));
            }
            if (this.f27039f.length() > 18) {
                BigDecimal bigDecimal = new BigDecimal(this.f27039f);
                if (!this.f27052s) {
                    double parseDouble = Double.parseDouble(this.f27039f);
                    if (String.valueOf(parseDouble).equals(this.f27039f)) {
                        return Double.valueOf(parseDouble);
                    }
                    return bigDecimal;
                }
                return bigDecimal;
            }
            return Double.valueOf(Double.parseDouble(this.f27039f));
        } catch (NumberFormatException unused) {
            throw new ParseException(this.f27040g, 1, this.f27039f);
        }
    }

    /* renamed from: d */
    public <T> T m91697d(AbstractC41105fj2<T> abstractC41105fj2) throws ParseException {
        this.f27040g = -1;
        try {
            mo88203f();
            T t = (T) m91694h(abstractC41105fj2);
            if (this.f27046m) {
                if (!this.f27047n) {
                    m91687t();
                }
                if (this.f27034a != 26) {
                    throw new ParseException(this.f27040g - 1, 1, Character.valueOf(this.f27034a));
                }
            }
            this.f27039f = null;
            this.f27038e = null;
            return t;
        } catch (IOException e) {
            throw new ParseException(this.f27040g, e);
        }
    }

    /* renamed from: e */
    public Number m91696e(String str) throws ParseException {
        int i;
        int i2;
        boolean z;
        int length = str.length();
        boolean z2 = false;
        if (str.charAt(0) == '-') {
            if (!this.f27041h && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.f27040g, 6, str);
            }
            i = 20;
            i2 = 1;
        } else if (!this.f27041h && length >= 2 && str.charAt(0) == '0') {
            throw new ParseException(this.f27040g, 6, str);
        } else {
            i = 19;
            i2 = 0;
        }
        int i3 = i2;
        if (length < i) {
            z = false;
        } else if (length > i) {
            return new BigInteger(str, 10);
        } else {
            length--;
            z = true;
        }
        long j = 0;
        while (i2 < length) {
            j = (j * 10) + ('0' - str.charAt(i2));
            i2++;
        }
        if (z) {
            int i4 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
            if (i4 <= 0) {
                if (i4 >= 0) {
                    if (i3 != 0) {
                    }
                }
                z2 = true;
            }
            if (z2) {
                return new BigInteger(str, 10);
            }
            j = (j * 10) + ('0' - str.charAt(i2));
        }
        if (i3 != 0) {
            if (this.f27050q && j >= -2147483648L) {
                return Integer.valueOf((int) j);
            }
            return Long.valueOf(j);
        }
        long j2 = -j;
        if (this.f27050q && j2 <= 2147483647L) {
            return Integer.valueOf((int) j2);
        }
        return Long.valueOf(j2);
    }

    /* renamed from: f */
    public abstract void mo88203f() throws IOException;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r4 == ':') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r4 == ']') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r4 == '}') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r1 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r7.f27045l == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.f27040g, 0, java.lang.Character.valueOf(r7.f27034a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
        mo88203f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
        return r8.mo36570b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.f27040g, 0, java.lang.Character.valueOf(r7.f27034a));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T m91695g(AbstractC41105fj2<T> abstractC41105fj2) throws ParseException, IOException {
        Object mo40996c = abstractC41105fj2.mo40996c();
        if (this.f27034a == '[') {
            mo88203f();
            if (this.f27034a == ',' && !this.f27045l) {
                throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
            }
            while (true) {
                boolean z = false;
                while (true) {
                    char c = this.f27034a;
                    if (c != '\t' && c != '\n' && c != '\r') {
                        if (c != 26) {
                            if (c != ' ') {
                                if (c != ',') {
                                    break;
                                } else if (z && !this.f27045l) {
                                    throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
                                } else {
                                    mo88203f();
                                    z = true;
                                }
                            }
                        } else {
                            throw new ParseException(this.f27040g - 1, 3, "EOF");
                        }
                    }
                    mo88203f();
                }
                abstractC41105fj2.mo40997a(mo40996c, m91693i(abstractC41105fj2, f27030u));
            }
        } else {
            throw new RuntimeException("Internal Error");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.f27040g, 0, java.lang.Character.valueOf(r3.f27034a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
        r0 = mo89938l(p000.AbstractC34945Og2.f27033x);
        r3.f27038e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        return r4.mo36570b(r0);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T m91694h(AbstractC41105fj2<T> abstractC41105fj2) throws ParseException, IOException {
        while (true) {
            char c = this.f27034a;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        mo89937o();
                        return abstractC41105fj2.mo36570b(this.f27039f);
                    case '-':
                        break;
                    case 'N':
                        mo89939j(f27033x);
                        if (this.f27042i) {
                            if ("NaN".equals(this.f27039f)) {
                                return abstractC41105fj2.mo36570b(Float.valueOf(Float.NaN));
                            }
                            if (this.f27043j) {
                                return abstractC41105fj2.mo36570b(this.f27039f);
                            }
                            throw new ParseException(this.f27040g, 1, this.f27039f);
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case '[':
                        return (T) m91695g(abstractC41105fj2);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        mo89939j(f27033x);
                        if ("false".equals(this.f27039f)) {
                            return abstractC41105fj2.mo36570b(Boolean.FALSE);
                        }
                        if (this.f27043j) {
                            return abstractC41105fj2.mo36570b(this.f27039f);
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case 'n':
                        mo89939j(f27033x);
                        if ("null".equals(this.f27039f)) {
                            return null;
                        }
                        if (this.f27043j) {
                            return abstractC41105fj2.mo36570b(this.f27039f);
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case 't':
                        mo89939j(f27033x);
                        if ("true".equals(this.f27039f)) {
                            return abstractC41105fj2.mo36570b(Boolean.TRUE);
                        }
                        if (this.f27043j) {
                            return abstractC41105fj2.mo36570b(this.f27039f);
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case '{':
                        return (T) m91692m(abstractC41105fj2);
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                mo89939j(f27033x);
                                if (this.f27043j) {
                                    return abstractC41105fj2.mo36570b(this.f27039f);
                                }
                                throw new ParseException(this.f27040g, 1, this.f27039f);
                        }
                }
            }
            mo88203f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r2.f27040g, 0, java.lang.Character.valueOf(r2.f27034a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        return mo89938l(r4);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m91693i(AbstractC41105fj2<?> abstractC41105fj2, boolean[] zArr) throws ParseException, IOException {
        while (true) {
            char c = this.f27034a;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        mo89937o();
                        return this.f27039f;
                    case '-':
                        break;
                    case 'N':
                        mo89939j(zArr);
                        if (this.f27042i) {
                            if ("NaN".equals(this.f27039f)) {
                                return Float.valueOf(Float.NaN);
                            }
                            if (this.f27043j) {
                                return this.f27039f;
                            }
                            throw new ParseException(this.f27040g, 1, this.f27039f);
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case '[':
                        return m91695g(abstractC41105fj2.mo40993f(this.f27036c));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        mo89939j(zArr);
                        if ("false".equals(this.f27039f)) {
                            return Boolean.FALSE;
                        }
                        if (this.f27043j) {
                            return this.f27039f;
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case 'n':
                        mo89939j(zArr);
                        if ("null".equals(this.f27039f)) {
                            return null;
                        }
                        if (this.f27043j) {
                            return this.f27039f;
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case 't':
                        mo89939j(zArr);
                        if ("true".equals(this.f27039f)) {
                            return Boolean.TRUE;
                        }
                        if (this.f27043j) {
                            return this.f27039f;
                        }
                        throw new ParseException(this.f27040g, 1, this.f27039f);
                    case '{':
                        return m91692m(abstractC41105fj2.mo40992g(this.f27036c));
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                mo89939j(zArr);
                                if (this.f27043j) {
                                    return this.f27039f;
                                }
                                throw new ParseException(this.f27040g, 1, this.f27039f);
                        }
                }
            }
            mo88203f();
        }
    }

    /* renamed from: j */
    public abstract void mo89939j(boolean[] zArr) throws IOException;

    /* renamed from: k */
    public abstract void mo88202k() throws ParseException, IOException;

    /* renamed from: l */
    public abstract Object mo89938l(boolean[] zArr) throws ParseException, IOException;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r12.f27040g, 0, java.lang.Character.valueOf(r12.f27034a));
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T m91692m(AbstractC41105fj2<T> abstractC41105fj2) throws ParseException, IOException {
        if (this.f27034a == '{') {
            Object mo40995d = abstractC41105fj2.mo40995d();
            boolean z = false;
            while (true) {
                mo88203f();
                char c = this.f27034a;
                if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                    if (c != ',') {
                        if (c == ':' || c == '[' || c == ']' || c == '{') {
                            break;
                        } else if (c != '}') {
                            if (c != '\"' && c != '\'') {
                                mo89939j(f27031v);
                                if (!this.f27043j) {
                                    throw new ParseException(this.f27040g, 1, this.f27039f);
                                }
                            } else {
                                mo89937o();
                            }
                            String str = this.f27039f;
                            m91687t();
                            char c2 = this.f27034a;
                            if (c2 != ':') {
                                if (c2 == 26) {
                                    throw new ParseException(this.f27040g - 1, 3, null);
                                }
                                throw new ParseException(this.f27040g - 1, 0, Character.valueOf(this.f27034a));
                            }
                            mo88202k();
                            this.f27036c = str;
                            abstractC41105fj2.mo40994e(mo40995d, str, m91693i(abstractC41105fj2, f27032w));
                            this.f27036c = null;
                            m91687t();
                            char c3 = this.f27034a;
                            if (c3 == '}') {
                                mo88203f();
                                return abstractC41105fj2.mo36570b(mo40995d);
                            } else if (c3 != 26) {
                                if (c3 != ',') {
                                    throw new ParseException(this.f27040g - 1, 1, Character.valueOf(this.f27034a));
                                }
                            } else {
                                throw new ParseException(this.f27040g - 1, 3, null);
                            }
                        } else if (z && !this.f27045l) {
                            throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
                        } else {
                            mo88203f();
                            return abstractC41105fj2.mo36570b(mo40995d);
                        }
                    } else if (z && !this.f27045l) {
                        throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
                    }
                    z = true;
                }
            }
        } else {
            throw new RuntimeException("Internal Error");
        }
    }

    /* renamed from: n */
    public abstract void mo88201n() throws IOException;

    /* renamed from: o */
    public abstract void mo89937o() throws ParseException, IOException;

    /* renamed from: p */
    public void m91691p() throws ParseException, IOException {
        char c = this.f27034a;
        while (true) {
            mo88203f();
            char c2 = this.f27034a;
            if (c2 != '\"' && c2 != '\'') {
                if (c2 != '\\') {
                    if (c2 != 127) {
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case '\b':
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (!this.f27048o) {
                                    throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
                                }
                                break;
                            case 26:
                                throw new ParseException(this.f27040g - 1, 3, null);
                            default:
                                this.f27037d.m91686a(c2);
                                break;
                        }
                    } else if (this.f27048o) {
                        continue;
                    } else {
                        if (this.f27051r) {
                            throw new ParseException(this.f27040g, 0, Character.valueOf(this.f27034a));
                        }
                        this.f27037d.m91686a(c2);
                    }
                } else {
                    mo88203f();
                    char c3 = this.f27034a;
                    if (c3 != '\"') {
                        if (c3 != '\'') {
                            if (c3 != '/') {
                                if (c3 != '\\') {
                                    if (c3 != 'b') {
                                        if (c3 != 'f') {
                                            if (c3 != 'n') {
                                                if (c3 != 'r') {
                                                    if (c3 != 'x') {
                                                        if (c3 != 't') {
                                                            if (c3 == 'u') {
                                                                this.f27037d.m91686a(m91690q(4));
                                                            }
                                                        } else {
                                                            this.f27037d.m91686a('\t');
                                                        }
                                                    } else {
                                                        this.f27037d.m91686a(m91690q(2));
                                                    }
                                                } else {
                                                    this.f27037d.m91686a('\r');
                                                }
                                            } else {
                                                this.f27037d.m91686a('\n');
                                            }
                                        } else {
                                            this.f27037d.m91686a('\f');
                                        }
                                    } else {
                                        this.f27037d.m91686a('\b');
                                    }
                                } else {
                                    this.f27037d.m91686a(CoreConstants.ESCAPE_CHAR);
                                }
                            } else {
                                this.f27037d.m91686a(JsonPointer.SEPARATOR);
                            }
                        } else {
                            this.f27037d.m91686a(CoreConstants.SINGLE_QUOTE_CHAR);
                        }
                    } else {
                        this.f27037d.m91686a('\"');
                    }
                }
            } else if (c == c2) {
                mo88203f();
                this.f27039f = this.f27037d.toString();
                return;
            } else {
                this.f27037d.m91686a(c2);
            }
        }
    }

    /* renamed from: q */
    public char m91690q(int i) throws ParseException, IOException {
        int i2;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 * 16;
            mo88203f();
            char c = this.f27034a;
            if (c <= '9' && c >= '0') {
                i3 = c - '0';
            } else {
                if (c <= 'F' && c >= 'A') {
                    i2 = c - 'A';
                } else if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new ParseException(this.f27040g, 3, "EOF");
                    } else {
                        throw new ParseException(this.f27040g, 4, Character.valueOf(this.f27034a));
                    }
                } else {
                    i2 = c - 'a';
                }
                i3 = i2 + 10;
            }
            i4 = i6 + i3;
        }
        return (char) i4;
    }

    /* renamed from: r */
    public void m91689r() throws IOException {
        while (true) {
            char c = this.f27034a;
            if (c >= '0' && c <= '9') {
                mo88201n();
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public void m91688s(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.f27034a;
            if (c != 26) {
                if (c < 0 || c >= '~' || !zArr[c]) {
                    mo88201n();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public void m91687t() throws IOException {
        while (true) {
            char c = this.f27034a;
            if (c <= ' ' && c != 26) {
                mo88201n();
            } else {
                return;
            }
        }
    }
}
