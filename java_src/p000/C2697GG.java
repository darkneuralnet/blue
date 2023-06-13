package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;
/* renamed from: GG */
/* loaded from: classes.dex */
public final class C2697GG {

    /* renamed from: d */
    public static final X06 f11435d;

    /* renamed from: e */
    public static final String f11436e;

    /* renamed from: f */
    public static final String f11437f;

    /* renamed from: g */
    public static final C2697GG f11438g;

    /* renamed from: h */
    public static final C2697GG f11439h;

    /* renamed from: a */
    public final boolean f11440a;

    /* renamed from: b */
    public final int f11441b;

    /* renamed from: c */
    public final X06 f11442c;

    /* renamed from: GG$a */
    /* loaded from: classes.dex */
    public static final class C2698a {

        /* renamed from: a */
        public boolean f11443a;

        /* renamed from: b */
        public int f11444b;

        /* renamed from: c */
        public X06 f11445c;

        public C2698a() {
            m105566c(C2697GG.m105575e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static C2697GG m105567b(boolean z) {
            return z ? C2697GG.f11439h : C2697GG.f11438g;
        }

        /* renamed from: a */
        public C2697GG m105568a() {
            if (this.f11444b == 2 && this.f11445c == C2697GG.f11435d) {
                return m105567b(this.f11443a);
            }
            return new C2697GG(this.f11443a, this.f11444b, this.f11445c);
        }

        /* renamed from: c */
        public final void m105566c(boolean z) {
            this.f11443a = z;
            this.f11445c = C2697GG.f11435d;
            this.f11444b = 2;
        }
    }

    /* renamed from: GG$b */
    /* loaded from: classes.dex */
    public static class C2699b {

        /* renamed from: f */
        public static final byte[] f11446f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f11447a;

        /* renamed from: b */
        public final boolean f11448b;

        /* renamed from: c */
        public final int f11449c;

        /* renamed from: d */
        public int f11450d;

        /* renamed from: e */
        public char f11451e;

        static {
            for (int i = 0; i < 1792; i++) {
                f11446f[i] = Character.getDirectionality(i);
            }
        }

        public C2699b(CharSequence charSequence, boolean z) {
            this.f11447a = charSequence;
            this.f11448b = z;
            this.f11449c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m105563c(char c) {
            return c < 1792 ? f11446f[c] : Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte m105565a() {
            char charAt = this.f11447a.charAt(this.f11450d - 1);
            this.f11451e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f11447a, this.f11450d);
                this.f11450d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f11450d--;
            byte m105563c = m105563c(this.f11451e);
            if (this.f11448b) {
                char c = this.f11451e;
                if (c == '>') {
                    return m105558h();
                }
                if (c == ';') {
                    return m105560f();
                }
                return m105563c;
            }
            return m105563c;
        }

        /* renamed from: b */
        public byte m105564b() {
            char charAt = this.f11447a.charAt(this.f11450d);
            this.f11451e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f11447a, this.f11450d);
                this.f11450d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f11450d++;
            byte m105563c = m105563c(this.f11451e);
            if (this.f11448b) {
                char c = this.f11451e;
                if (c == '<') {
                    return m105557i();
                }
                if (c == '&') {
                    return m105559g();
                }
                return m105563c;
            }
            return m105563c;
        }

        /* renamed from: d */
        public int m105562d() {
            this.f11450d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f11450d < this.f11449c && i == 0) {
                byte m105564b = m105564b();
                if (m105564b != 0) {
                    if (m105564b != 1 && m105564b != 2) {
                        if (m105564b != 9) {
                            switch (m105564b) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return 1;
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f11450d > 0) {
                switch (m105565a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        public int m105561e() {
            this.f11450d = this.f11449c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f11450d > 0) {
                    byte m105565a = m105565a();
                    if (m105565a != 0) {
                        if (m105565a != 1 && m105565a != 2) {
                            if (m105565a != 9) {
                                switch (m105565a) {
                                    case 14:
                                    case 15:
                                        if (i2 == i) {
                                            return -1;
                                        }
                                        i--;
                                        break;
                                    case 16:
                                    case 17:
                                        if (i2 == i) {
                                            return 1;
                                        }
                                        i--;
                                        break;
                                    case 18:
                                        i++;
                                        break;
                                    default:
                                        if (i2 != 0) {
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                continue;
                            }
                        } else if (i == 0) {
                            return 1;
                        } else {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: f */
        public final byte m105560f() {
            char charAt;
            int i = this.f11450d;
            do {
                int i2 = this.f11450d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11447a;
                int i3 = i2 - 1;
                this.f11450d = i3;
                charAt = charSequence.charAt(i3);
                this.f11451e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f11450d = i;
            this.f11451e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m105559g() {
            char charAt;
            do {
                int i = this.f11450d;
                if (i >= this.f11449c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f11447a;
                this.f11450d = i + 1;
                charAt = charSequence.charAt(i);
                this.f11451e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m105558h() {
            char charAt;
            int i = this.f11450d;
            while (true) {
                int i2 = this.f11450d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11447a;
                int i3 = i2 - 1;
                this.f11450d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f11451e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f11450d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f11447a;
                            int i5 = i4 - 1;
                            this.f11450d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f11451e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f11450d = i;
            this.f11451e = Typography.greater;
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m105557i() {
            char charAt;
            int i = this.f11450d;
            while (true) {
                int i2 = this.f11450d;
                if (i2 < this.f11449c) {
                    CharSequence charSequence = this.f11447a;
                    this.f11450d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f11451e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f11450d;
                            if (i3 < this.f11449c) {
                                CharSequence charSequence2 = this.f11447a;
                                this.f11450d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f11451e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f11450d = i;
                    this.f11451e = Typography.less;
                    return (byte) 13;
                }
            }
        }
    }

    static {
        X06 x06 = Y06.f44429c;
        f11435d = x06;
        f11436e = Character.toString((char) 8206);
        f11437f = Character.toString((char) 8207);
        f11438g = new C2697GG(false, 2, x06);
        f11439h = new C2697GG(true, 2, x06);
    }

    public C2697GG(boolean z, int i, X06 x06) {
        this.f11440a = z;
        this.f11441b = i;
        this.f11442c = x06;
    }

    /* renamed from: a */
    public static int m105579a(CharSequence charSequence) {
        return new C2699b(charSequence, false).m105562d();
    }

    /* renamed from: b */
    public static int m105578b(CharSequence charSequence) {
        return new C2699b(charSequence, false).m105561e();
    }

    /* renamed from: c */
    public static C2697GG m105577c() {
        return new C2698a().m105568a();
    }

    /* renamed from: e */
    public static boolean m105575e(Locale locale) {
        return P26.m91040a(locale) == 1;
    }

    /* renamed from: d */
    public boolean m105576d() {
        return (this.f11441b & 2) != 0;
    }

    /* renamed from: f */
    public final String m105574f(CharSequence charSequence, X06 x06) {
        boolean mo75856a = x06.mo75856a(charSequence, 0, charSequence.length());
        if (!this.f11440a && (mo75856a || m105578b(charSequence) == 1)) {
            return f11436e;
        }
        if (this.f11440a) {
            if (!mo75856a || m105578b(charSequence) == -1) {
                return f11437f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    public final String m105573g(CharSequence charSequence, X06 x06) {
        boolean mo75856a = x06.mo75856a(charSequence, 0, charSequence.length());
        if (!this.f11440a && (mo75856a || m105579a(charSequence) == 1)) {
            return f11436e;
        }
        if (this.f11440a) {
            if (!mo75856a || m105579a(charSequence) == -1) {
                return f11437f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: h */
    public CharSequence m105572h(CharSequence charSequence) {
        return m105571i(charSequence, this.f11442c, true);
    }

    /* renamed from: i */
    public CharSequence m105571i(CharSequence charSequence, X06 x06, boolean z) {
        X06 x062;
        char c;
        X06 x063;
        if (charSequence == null) {
            return null;
        }
        boolean mo75856a = x06.mo75856a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m105576d() && z) {
            if (mo75856a) {
                x063 = Y06.f44428b;
            } else {
                x063 = Y06.f44427a;
            }
            spannableStringBuilder.append((CharSequence) m105573g(charSequence, x063));
        }
        if (mo75856a != this.f11440a) {
            if (mo75856a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (mo75856a) {
                x062 = Y06.f44428b;
            } else {
                x062 = Y06.f44427a;
            }
            spannableStringBuilder.append((CharSequence) m105574f(charSequence, x062));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m105570j(String str) {
        return m105569k(str, this.f11442c, true);
    }

    /* renamed from: k */
    public String m105569k(String str, X06 x06, boolean z) {
        if (str == null) {
            return null;
        }
        return m105571i(str, x06, z).toString();
    }
}
