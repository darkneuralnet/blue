package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
/* renamed from: MM1 */
/* loaded from: classes6.dex */
public final class MM1 {
    private MM1() {
    }

    /* renamed from: a */
    public static int m95423a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m95418f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m95422b(String str, EnumC52256yX5 enumC52256yX5, X31 x31, X31 x312) {
        int i = 0;
        InterfaceC46954pb1[] interfaceC46954pb1Arr = {new C30807z(), new V70(), new C38899c16(), new C47371qH6(), new M91(), new C1676Dy()};
        C50510vb1 c50510vb1 = new C50510vb1(str);
        c50510vb1.m8405n(enumC52256yX5);
        c50510vb1.m8407l(x31, x312);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c50510vb1.m8401r((char) 236);
            c50510vb1.m8406m(2);
            c50510vb1.f114361f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c50510vb1.m8401r((char) 237);
            c50510vb1.m8406m(2);
            c50510vb1.f114361f += 7;
        }
        while (c50510vb1.m8410i()) {
            interfaceC46954pb1Arr[i].mo2127a(c50510vb1);
            if (c50510vb1.m8414e() >= 0) {
                i = c50510vb1.m8414e();
                c50510vb1.m8409j();
            }
        }
        int m8418a = c50510vb1.m8418a();
        c50510vb1.m8403p();
        int m6696a = c50510vb1.m8412g().m6696a();
        if (m8418a < m6696a && i != 0 && i != 5 && i != 4) {
            c50510vb1.m8401r((char) 254);
        }
        StringBuilder m8417b = c50510vb1.m8417b();
        if (m8417b.length() < m6696a) {
            m8417b.append((char) 129);
        }
        while (m8417b.length() < m6696a) {
            m8417b.append(m95409o((char) 129, m8417b.length() + 1));
        }
        return c50510vb1.m8417b().toString();
    }

    /* renamed from: c */
    public static int m95421c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m95420d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: e */
    public static void m95419e(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* renamed from: f */
    public static boolean m95418f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    public static boolean m95417g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    public static boolean m95416h(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'A' && c <= 'Z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m95415i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    public static boolean m95414j(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'a' && c <= 'z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m95413k(char c) {
        if (m95411m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m95412l(char c) {
        return false;
    }

    /* renamed from: m */
    public static boolean m95411m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* renamed from: n */
    public static int m95410n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        int i3 = 6;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int m95421c = m95421c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int m95420d = m95420d(bArr);
                if (iArr[0] == m95421c) {
                    return 0;
                }
                if (m95420d == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (m95420d == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (m95420d == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (m95420d == 1 && bArr[3] > 0) {
                    return 3;
                }
                return 1;
            }
            char charAt = charSequence.charAt(i5);
            i4++;
            if (m95418f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m95417g(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m95416h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m95417g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m95414j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m95417g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m95413k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m95417g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m95415i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m95417g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m95412l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                m95421c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int m95420d2 = m95420d(bArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[c];
                if (i6 < i7 && i6 < iArr2[1] && i6 < iArr2[2] && i6 < iArr2[3] && i6 < iArr2[4]) {
                    return 0;
                }
                if (i7 >= i6) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (m95420d2 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (m95420d2 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (m95420d2 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i8 = iArr2[1];
                        if (i8 + 1 < i6 && i8 + 1 < i7 && i8 + 1 < iArr2[4] && i8 + 1 < iArr2[2]) {
                            int i9 = iArr2[3];
                            if (i8 < i9) {
                                return 1;
                            }
                            if (i8 == i9) {
                                for (int i10 = i + i4 + 1; i10 < charSequence.length(); i10++) {
                                    char charAt2 = charSequence.charAt(i10);
                                    if (m95411m(charAt2)) {
                                        return 3;
                                    }
                                    if (!m95413k(charAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    } else {
                        return 5;
                    }
                } else {
                    return 5;
                }
            }
            i3 = 6;
        }
    }

    /* renamed from: o */
    public static char m95409o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
