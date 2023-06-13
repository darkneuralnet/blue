package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.p053io.encoding.Base64;
/* renamed from: tD3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49110tD3 {

    /* renamed from: c */
    public static final byte[] f110179c;

    /* renamed from: a */
    public static final byte[] f110177a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f110178b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    public static final byte[] f110180d = new byte[128];

    /* renamed from: e */
    public static final Charset f110181e = StandardCharsets.ISO_8859_1;

    /* renamed from: tD3$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C28660a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f110182a;

        static {
            int[] iArr = new int[EnumC35492Qp0.values().length];
            f110182a = iArr;
            try {
                iArr[EnumC35492Qp0.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f110182a[EnumC35492Qp0.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f110182a[EnumC35492Qp0.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f110179c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f110177a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f110179c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f110180d, (byte) -1);
        while (true) {
            byte[] bArr3 = f110178b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f110180d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C49110tD3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m12592a(String str, int i, Charset charset) throws WriterException {
        int i2;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i3 = i;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && m12582k(charAt) && (i2 = i3 + (i4 = i4 + 1)) < length) {
                charAt = str.charAt(i2);
            }
            char charAt2 = str.charAt(i3);
            if (newEncoder.canEncode(charAt2)) {
                i3++;
            } else {
                throw new WriterException("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }
        return i3 - i;
    }

    /* renamed from: b */
    public static int m12591b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m12582k(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m12590c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m12582k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 <= 0) {
                if (!m12579n(charSequence.charAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        return i2 - i;
    }

    /* renamed from: d */
    public static void m12589d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & UByte.MAX_VALUE);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & UByte.MAX_VALUE));
            i4++;
        }
    }

    /* renamed from: e */
    public static String m12588e(String str, EnumC35492Qp0 enumC35492Qp0, Charset charset) throws WriterException {
        EnumC38704bi0 m64112a;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f110181e;
        } else if (!f110181e.equals(charset) && (m64112a = EnumC38704bi0.m64112a(charset.name())) != null) {
            m12585h(m64112a.m64110c(), sb);
        }
        int length = str.length();
        int i = C28660a.f110182a[enumC35492Qp0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        int m12591b = m12591b(str, i2);
                        if (m12591b >= 13) {
                            sb.append((char) 902);
                            m12587f(str, i2, m12591b, sb);
                            i2 += m12591b;
                            i3 = 0;
                            i4 = 2;
                        } else {
                            int m12590c = m12590c(str, i2);
                            if (m12590c < 5 && m12591b != length) {
                                int m12592a = m12592a(str, i2, charset);
                                if (m12592a == 0) {
                                    m12592a = 1;
                                }
                                int i5 = m12592a + i2;
                                byte[] bytes = str.substring(i2, i5).getBytes(charset);
                                if (bytes.length == 1 && i4 == 0) {
                                    m12589d(bytes, 0, 1, 0, sb);
                                } else {
                                    m12589d(bytes, 0, bytes.length, i4, sb);
                                    i4 = 1;
                                    i3 = 0;
                                }
                                i2 = i5;
                            } else {
                                if (i4 != 0) {
                                    sb.append((char) 900);
                                    i3 = 0;
                                    i4 = 0;
                                }
                                i3 = m12586g(str, i2, m12590c, sb, i3);
                                i2 += m12590c;
                            }
                        }
                    }
                } else {
                    sb.append((char) 902);
                    m12587f(str, 0, length, sb);
                }
            } else {
                byte[] bytes2 = str.getBytes(charset);
                m12589d(bytes2, 0, bytes2.length, 1, sb);
            }
        } else {
            m12586g(str, 0, length, sb, 0);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static void m12587f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m12586g(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        boolean z;
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char charAt = charSequence.charAt(i6);
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (m12580m(charAt)) {
                            sb2.append((char) f110180d[charAt]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (m12581l(charAt)) {
                        sb2.append((char) f110179c[charAt]);
                    } else if (m12583j(charAt)) {
                        sb2.append((char) 28);
                        i4 = 0;
                    } else if (m12584i(charAt)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else {
                        int i7 = i6 + 1;
                        if (i7 < i2 && m12580m(charSequence.charAt(i7))) {
                            sb2.append((char) 25);
                            i4 = 3;
                        } else {
                            sb2.append((char) 29);
                            sb2.append((char) f110180d[charAt]);
                        }
                    }
                } else if (m12584i(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'a'));
                    }
                } else if (m12583j(charAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (charAt - 'A'));
                } else if (m12581l(charAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f110180d[charAt]);
                }
                i5++;
                if (i5 < i2) {
                    break;
                }
            } else {
                if (m12583j(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'A'));
                    }
                } else if (m12584i(charAt)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (m12581l(charAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f110180d[charAt]);
                }
                i5++;
                if (i5 < i2) {
                }
            }
        }
        int length = sb2.length();
        char c = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c = (char) ((c * 30) + sb2.charAt(i8));
                sb.append(c);
            } else {
                c = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((c * 30) + 29));
        }
        return i4;
    }

    /* renamed from: h */
    public static void m12585h(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS) - 1));
            sb.append((char) (i % STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS));
        } else if (i < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: i */
    public static boolean m12584i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m12583j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m12582k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    public static boolean m12581l(char c) {
        return f110179c[c] != -1;
    }

    /* renamed from: m */
    public static boolean m12580m(char c) {
        return f110180d[c] != -1;
    }

    /* renamed from: n */
    public static boolean m12579n(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
