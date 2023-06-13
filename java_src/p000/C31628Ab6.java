package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Method;
/* renamed from: Ab6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31628Ab6 {

    /* renamed from: e */
    public static final C31628Ab6 f839e = new C31628Ab6(0, "VZCBSIFJD", 0, 1);

    /* renamed from: f */
    public static final C31628Ab6 f840f = new C31628Ab6(1, "VZCBSIFJD", 1, 2);

    /* renamed from: g */
    public static final C31628Ab6 f841g = new C31628Ab6(2, "VZCBSIFJD", 2, 3);

    /* renamed from: h */
    public static final C31628Ab6 f842h = new C31628Ab6(3, "VZCBSIFJD", 3, 4);

    /* renamed from: i */
    public static final C31628Ab6 f843i = new C31628Ab6(4, "VZCBSIFJD", 4, 5);

    /* renamed from: j */
    public static final C31628Ab6 f844j = new C31628Ab6(5, "VZCBSIFJD", 5, 6);

    /* renamed from: k */
    public static final C31628Ab6 f845k = new C31628Ab6(6, "VZCBSIFJD", 6, 7);

    /* renamed from: l */
    public static final C31628Ab6 f846l = new C31628Ab6(7, "VZCBSIFJD", 7, 8);

    /* renamed from: m */
    public static final C31628Ab6 f847m = new C31628Ab6(8, "VZCBSIFJD", 8, 9);

    /* renamed from: a */
    public final int f848a;

    /* renamed from: b */
    public final String f849b;

    /* renamed from: c */
    public final int f850c;

    /* renamed from: d */
    public final int f851d;

    public C31628Ab6(int i, String str, int i2, int i3) {
        this.f848a = i;
        this.f849b = str;
        this.f850c = i2;
        this.f851d = i3;
    }

    /* renamed from: a */
    public static void m115483a(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c = 'I';
            } else if (cls == Void.TYPE) {
                c = 'V';
            } else if (cls == Boolean.TYPE) {
                c = 'Z';
            } else if (cls == Byte.TYPE) {
                c = 'B';
            } else if (cls == Character.TYPE) {
                c = 'C';
            } else if (cls == Short.TYPE) {
                c = 'S';
            } else if (cls == Double.TYPE) {
                c = 'D';
            } else if (cls == Float.TYPE) {
                c = 'F';
            } else if (cls == Long.TYPE) {
                c = 'J';
            } else {
                throw new AssertionError();
            }
            sb.append(c);
            return;
        }
        sb.append('L');
        sb.append(m115477g(cls));
        sb.append(';');
    }

    /* renamed from: b */
    public static C31628Ab6[] m115482b(String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (str.charAt(i3) != ')') {
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            if (str.charAt(i3) == 'L') {
                i3 = Math.max(i4, str.indexOf(59, i4) + 1);
            } else {
                i3 = i4;
            }
            i2++;
        }
        C31628Ab6[] c31628Ab6Arr = new C31628Ab6[i2];
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int i7 = i6 + 1;
            if (str.charAt(i6) == 'L') {
                i7 = Math.max(i7, str.indexOf(59, i7) + 1);
            }
            c31628Ab6Arr[i] = m115469o(str, i5, i7);
            i++;
            i5 = i7;
        }
        return c31628Ab6Arr;
    }

    /* renamed from: c */
    public static int m115481c(String str) {
        int i = 1;
        char charAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (charAt != ')') {
            if (charAt != 'J' && charAt != 'D') {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i4 = Math.max(i4, str.indexOf(59, i4) + 1);
                }
                i3++;
                i2 = i4;
            } else {
                i2++;
                i3 += 2;
            }
            charAt = str.charAt(i2);
        }
        char charAt2 = str.charAt(i2 + 1);
        if (charAt2 == 'V') {
            return i3 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i = 2;
        }
        return (i3 << 2) | i;
    }

    /* renamed from: e */
    public static String m115479e(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        m115483a(cls, sb);
        return sb.toString();
    }

    /* renamed from: g */
    public static String m115477g(Class<?> cls) {
        return cls.getName().replace(CoreConstants.DOT, JsonPointer.SEPARATOR);
    }

    /* renamed from: h */
    public static String m115476h(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        for (Class<?> cls : method.getParameterTypes()) {
            m115483a(cls, sb);
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        m115483a(method.getReturnType(), sb);
        return sb.toString();
    }

    /* renamed from: i */
    public static C31628Ab6 m115475i(String str) {
        return new C31628Ab6(11, str, 0, str.length());
    }

    /* renamed from: j */
    public static C31628Ab6 m115474j(String str) {
        int i;
        if (str.charAt(0) == '[') {
            i = 9;
        } else {
            i = 12;
        }
        return new C31628Ab6(i, str, 0, str.length());
    }

    /* renamed from: k */
    public static int m115473k(String str) {
        int i = 1;
        while (str.charAt(i) != ')') {
            while (str.charAt(i) == '[') {
                i++;
            }
            int i2 = i + 1;
            if (str.charAt(i) == 'L') {
                i = Math.max(i2, str.indexOf(59, i2) + 1);
            } else {
                i = i2;
            }
        }
        return i + 1;
    }

    /* renamed from: m */
    public static C31628Ab6 m115471m(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f844j;
            }
            if (cls == Void.TYPE) {
                return f839e;
            }
            if (cls == Boolean.TYPE) {
                return f840f;
            }
            if (cls == Byte.TYPE) {
                return f842h;
            }
            if (cls == Character.TYPE) {
                return f841g;
            }
            if (cls == Short.TYPE) {
                return f843i;
            }
            if (cls == Double.TYPE) {
                return f847m;
            }
            if (cls == Float.TYPE) {
                return f845k;
            }
            if (cls == Long.TYPE) {
                return f846l;
            }
            throw new AssertionError();
        }
        return m115470n(m115479e(cls));
    }

    /* renamed from: n */
    public static C31628Ab6 m115470n(String str) {
        return m115469o(str, 0, str.length());
    }

    /* renamed from: o */
    public static C31628Ab6 m115469o(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return f842h;
                                                case 'C':
                                                    return f841g;
                                                case 'D':
                                                    return f847m;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new C31628Ab6(9, str, i, i2);
                                    }
                                    return f840f;
                                }
                                return f846l;
                            }
                            return f844j;
                        }
                        return f839e;
                    }
                    return f843i;
                }
                return new C31628Ab6(10, str, i + 1, i2 - 1);
            }
            return f845k;
        }
        return new C31628Ab6(11, str, i, i2);
    }

    /* renamed from: d */
    public String m115480d() {
        int i = this.f848a;
        if (i == 10) {
            return this.f849b.substring(this.f850c - 1, this.f851d + 1);
        }
        if (i == 12) {
            return 'L' + this.f849b.substring(this.f850c, this.f851d) + ';';
        }
        return this.f849b.substring(this.f850c, this.f851d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31628Ab6)) {
            return false;
        }
        C31628Ab6 c31628Ab6 = (C31628Ab6) obj;
        int i = this.f848a;
        int i2 = 10;
        if (i == 12) {
            i = 10;
        }
        int i3 = c31628Ab6.f848a;
        if (i3 != 12) {
            i2 = i3;
        }
        if (i != i2) {
            return false;
        }
        int i4 = this.f850c;
        int i5 = this.f851d;
        int i6 = c31628Ab6.f850c;
        if (i5 - i4 != c31628Ab6.f851d - i6) {
            return false;
        }
        while (i4 < i5) {
            if (this.f849b.charAt(i4) != c31628Ab6.f849b.charAt(i6)) {
                return false;
            }
            i4++;
            i6++;
        }
        return true;
    }

    /* renamed from: f */
    public String m115478f() {
        return this.f849b.substring(this.f850c, this.f851d);
    }

    public int hashCode() {
        int i;
        int i2 = this.f848a;
        if (i2 == 12) {
            i = 10;
        } else {
            i = i2;
        }
        int i3 = i * 13;
        if (i2 >= 9) {
            int i4 = this.f851d;
            for (int i5 = this.f850c; i5 < i4; i5++) {
                i3 = (i3 + this.f849b.charAt(i5)) * 17;
            }
        }
        return i3;
    }

    /* renamed from: l */
    public int m115472l() {
        int i = this.f848a;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    public String toString() {
        return m115480d();
    }
}
