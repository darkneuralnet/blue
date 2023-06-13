package p000;

import java.io.IOException;
/* renamed from: Wg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36817Wg2 {

    /* renamed from: a */
    public static final C9143e f41489a = new C9143e();

    /* renamed from: b */
    public static final C9144f f41490b = new C9144f();

    /* renamed from: c */
    public static final C9142d f41491c = new C9142d();

    /* renamed from: d */
    public static final C9141c f41492d = new C9141c();

    /* renamed from: e */
    public static final C9140b f41493e = new C9140b();

    /* renamed from: Wg2$b */
    /* loaded from: classes6.dex */
    public static class C9140b implements InterfaceC9146h {
        private C9140b() {
        }

        @Override // p000.C36817Wg2.InterfaceC9146h
        /* renamed from: a */
        public void mo78010a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt != '\f') {
                        if (charAt != '\r') {
                            if (charAt != '\"') {
                                if (charAt != '/') {
                                    if (charAt != '\\') {
                                        switch (charAt) {
                                            case '\b':
                                                appendable.append("\\b");
                                                continue;
                                            case '\t':
                                                appendable.append("\\t");
                                                continue;
                                            case '\n':
                                                appendable.append("\\n");
                                                continue;
                                            default:
                                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                                    appendable.append("\\u");
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                                    continue;
                                                } else {
                                                    appendable.append(charAt);
                                                    break;
                                                }
                                                break;
                                        }
                                    } else {
                                        appendable.append("\\\\");
                                    }
                                } else {
                                    appendable.append("\\/");
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* renamed from: Wg2$c */
    /* loaded from: classes6.dex */
    public static class C9141c implements InterfaceC9146h {
        private C9141c() {
        }

        @Override // p000.C36817Wg2.InterfaceC9146h
        /* renamed from: a */
        public void mo78010a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt != '\f') {
                        if (charAt != '\r') {
                            if (charAt != '\"') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            appendable.append("\\b");
                                            continue;
                                        case '\t':
                                            appendable.append("\\t");
                                            continue;
                                        case '\n':
                                            appendable.append("\\n");
                                            continue;
                                        default:
                                            if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                                appendable.append("\\u");
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> 0) & 15));
                                                continue;
                                            } else {
                                                appendable.append(charAt);
                                                break;
                                            }
                                    }
                                } else {
                                    appendable.append("\\\\");
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    /* renamed from: Wg2$d */
    /* loaded from: classes6.dex */
    public static class C9142d implements InterfaceC9145g {
        private C9142d() {
        }

        @Override // p000.C36817Wg2.InterfaceC9145g
        /* renamed from: a */
        public boolean mo78011a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if (C36817Wg2.m78015c(charAt) || C36817Wg2.m78012f(charAt)) {
                return true;
            }
            for (int i = 1; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (C36817Wg2.m78013e(charAt2) || C36817Wg2.m78012f(charAt2)) {
                    return true;
                }
            }
            if (C36817Wg2.m78017a(str)) {
                return true;
            }
            char charAt3 = str.charAt(0);
            if ((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '-') {
                int i2 = 1;
                while (i2 < length) {
                    charAt3 = str.charAt(i2);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (charAt3 == '.') {
                    i2++;
                }
                while (i2 < length) {
                    charAt3 = str.charAt(i2);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (charAt3 == 'E' || charAt3 == 'e') {
                    i2++;
                    if (i2 == length) {
                        return false;
                    }
                    char charAt4 = str.charAt(i2);
                    if (charAt4 == '+' || charAt4 == '-') {
                        i2++;
                        str.charAt(i2);
                    }
                }
                if (i2 == length) {
                    return false;
                }
                while (i2 < length) {
                    char charAt5 = str.charAt(i2);
                    if (charAt5 < '0' || charAt5 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: Wg2$e */
    /* loaded from: classes6.dex */
    public static class C9143e implements InterfaceC9145g {
        private C9143e() {
        }

        @Override // p000.C36817Wg2.InterfaceC9145g
        /* renamed from: a */
        public boolean mo78011a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (C36817Wg2.m78016b(charAt2) || C36817Wg2.m78015c(charAt2) || C36817Wg2.m78014d(charAt2) || C36817Wg2.m78012f(charAt2)) {
                    return true;
                }
            }
            if (!C36817Wg2.m78017a(str)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: Wg2$f */
    /* loaded from: classes6.dex */
    public static class C9144f implements InterfaceC9145g {
        private C9144f() {
        }

        @Override // p000.C36817Wg2.InterfaceC9145g
        /* renamed from: a */
        public boolean mo78011a(String str) {
            return true;
        }
    }

    /* renamed from: Wg2$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC9145g {
        /* renamed from: a */
        boolean mo78011a(String str);
    }

    /* renamed from: Wg2$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC9146h {
        /* renamed from: a */
        void mo78010a(String str, Appendable appendable);
    }

    /* renamed from: a */
    public static boolean m78017a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals("null");
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals("false");
        }
        if (charAt != 'N') {
            return false;
        }
        return str.equals("NaN");
    }

    /* renamed from: b */
    public static boolean m78016b(char c) {
        return c == '\r' || c == '\n' || c == '\t' || c == ' ';
    }

    /* renamed from: c */
    public static boolean m78015c(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    /* renamed from: d */
    public static boolean m78014d(char c) {
        return c == '\b' || c == '\f' || c == '\n';
    }

    /* renamed from: e */
    public static boolean m78013e(char c) {
        return c == '}' || c == ']' || c == ',' || c == ':';
    }

    /* renamed from: f */
    public static boolean m78012f(char c) {
        return (c >= 0 && c <= 31) || (c >= 127 && c <= 159) || (c >= 8192 && c <= 8447);
    }
}
