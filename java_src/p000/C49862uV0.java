package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.KotlinVersion;
import kotlin.text.Typography;
/* renamed from: uV0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49862uV0 {

    /* renamed from: a */
    public static final char[] f112461a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    public static final char[] f112462b;

    /* renamed from: c */
    public static final char[] f112463c;

    /* renamed from: d */
    public static final char[] f112464d;

    /* renamed from: e */
    public static final char[] f112465e;

    /* renamed from: uV0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C29204a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f112466a;

        static {
            int[] iArr = new int[EnumC29205b.values().length];
            f112466a = iArr;
            try {
                iArr[EnumC29205b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112466a[EnumC29205b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112466a[EnumC29205b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112466a[EnumC29205b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112466a[EnumC29205b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: uV0$b */
    /* loaded from: classes6.dex */
    public enum EnumC29205b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', CoreConstants.PERCENT_CHAR, Typography.amp, CoreConstants.SINGLE_QUOTE_CHAR, CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR, '*', '+', CoreConstants.COMMA_CHAR, CoreConstants.DASH_CHAR, CoreConstants.DOT, JsonPointer.SEPARATOR, CoreConstants.COLON_CHAR, ';', Typography.less, '=', Typography.greater, '?', '@', '[', CoreConstants.ESCAPE_CHAR, ']', '^', '_'};
        f112462b = cArr;
        f112463c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f112464d = cArr;
        f112465e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', CoreConstants.CURLY_LEFT, '|', CoreConstants.CURLY_RIGHT, '~', 127};
    }

    private C49862uV0() {
    }

    /* renamed from: a */
    public static HV0 m10230a(byte[] bArr) throws FormatException {
        C4088JT c4088jt = new C4088JT(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC29205b enumC29205b = EnumC29205b.ASCII_ENCODE;
        do {
            EnumC29205b enumC29205b2 = EnumC29205b.ASCII_ENCODE;
            if (enumC29205b == enumC29205b2) {
                enumC29205b = m10228c(c4088jt, sb, sb2);
            } else {
                int i = C29204a.f112466a[enumC29205b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    m10227d(c4088jt, sb, arrayList);
                                } else {
                                    throw FormatException.m45945a();
                                }
                            } else {
                                m10225f(c4088jt, sb);
                            }
                        } else {
                            m10229b(c4088jt, sb);
                        }
                    } else {
                        m10224g(c4088jt, sb);
                    }
                } else {
                    m10226e(c4088jt, sb);
                }
                enumC29205b = enumC29205b2;
            }
            if (enumC29205b == EnumC29205b.PAD_ENCODE) {
                break;
            }
        } while (c4088jt.m100426a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new HV0(bArr, sb3, arrayList, null);
    }

    /* renamed from: b */
    public static void m10229b(C4088JT c4088jt, StringBuilder sb) throws FormatException {
        int m100423d;
        int[] iArr = new int[3];
        while (c4088jt.m100426a() != 8 && (m100423d = c4088jt.m100423d(8)) != 254) {
            m10223h(m100423d, c4088jt.m100423d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 < 14) {
                                    sb.append((char) (i2 + 44));
                                } else if (i2 < 40) {
                                    sb.append((char) (i2 + 51));
                                } else {
                                    throw FormatException.m45945a();
                                }
                            } else {
                                sb.append(' ');
                            }
                        } else {
                            sb.append(Typography.greater);
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append('\r');
                }
            }
            if (c4088jt.m100426a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static EnumC29205b m10228c(C4088JT c4088jt, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int m100423d = c4088jt.m100423d(8);
            if (m100423d != 0) {
                if (m100423d <= 128) {
                    if (z) {
                        m100423d += 128;
                    }
                    sb.append((char) (m100423d - 1));
                    return EnumC29205b.ASCII_ENCODE;
                } else if (m100423d == 129) {
                    return EnumC29205b.PAD_ENCODE;
                } else {
                    if (m100423d <= 229) {
                        int i = m100423d - 130;
                        if (i < 10) {
                            sb.append('0');
                        }
                        sb.append(i);
                    } else {
                        switch (m100423d) {
                            case 230:
                                return EnumC29205b.C40_ENCODE;
                            case 231:
                                return EnumC29205b.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return EnumC29205b.ANSIX12_ENCODE;
                            case 239:
                                return EnumC29205b.TEXT_ENCODE;
                            case 240:
                                return EnumC29205b.EDIFACT_ENCODE;
                            default:
                                if (m100423d != 254 || c4088jt.m100426a() != 0) {
                                    throw FormatException.m45945a();
                                }
                                break;
                        }
                    }
                }
            } else {
                throw FormatException.m45945a();
            }
        } while (c4088jt.m100426a() > 0);
        return EnumC29205b.ASCII_ENCODE;
    }

    /* renamed from: d */
    public static void m10227d(C4088JT c4088jt, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int m100424c = c4088jt.m100424c() + 1;
        int i = m100424c + 1;
        int m10222i = m10222i(c4088jt.m100423d(8), m100424c);
        if (m10222i == 0) {
            m10222i = c4088jt.m100426a() / 8;
        } else if (m10222i >= 250) {
            m10222i = ((m10222i - 249) * C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION) + m10222i(c4088jt.m100423d(8), i);
            i++;
        }
        if (m10222i >= 0) {
            byte[] bArr = new byte[m10222i];
            int i2 = 0;
            while (i2 < m10222i) {
                if (c4088jt.m100426a() >= 8) {
                    bArr[i2] = (byte) m10222i(c4088jt.m100423d(8), i);
                    i2++;
                    i++;
                } else {
                    throw FormatException.m45945a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: e */
    public static void m10226e(C4088JT c4088jt, StringBuilder sb) throws FormatException {
        int m100423d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c4088jt.m100426a() != 8 && (m100423d = c4088jt.m100423d(8)) != 254) {
            m10223h(m100423d, c4088jt.m100423d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    sb.append((char) (i3 + 224));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb.append((char) (i3 + 96));
                                    i = 0;
                                }
                            } else {
                                throw FormatException.m45945a();
                            }
                        } else {
                            char[] cArr = f112462b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw FormatException.m45945a();
                                }
                            } else {
                                sb.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f112461a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw FormatException.m45945a();
                    }
                }
            }
            if (c4088jt.m100426a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m10225f(C4088JT c4088jt, StringBuilder sb) {
        while (c4088jt.m100426a() > 16) {
            for (int i = 0; i < 4; i++) {
                int m100423d = c4088jt.m100423d(6);
                if (m100423d == 31) {
                    int m100425b = 8 - c4088jt.m100425b();
                    if (m100425b != 8) {
                        c4088jt.m100423d(m100425b);
                        return;
                    }
                    return;
                }
                if ((m100423d & 32) == 0) {
                    m100423d |= 64;
                }
                sb.append((char) m100423d);
            }
            if (c4088jt.m100426a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m10224g(C4088JT c4088jt, StringBuilder sb) throws FormatException {
        int m100423d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c4088jt.m100426a() != 8 && (m100423d = c4088jt.m100423d(8)) != 254) {
            m10223h(m100423d, c4088jt.m100423d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                char[] cArr = f112465e;
                                if (i3 < cArr.length) {
                                    char c = cArr[i3];
                                    if (z) {
                                        sb.append((char) (c + 128));
                                        z = false;
                                        i = 0;
                                    } else {
                                        sb.append(c);
                                        i = 0;
                                    }
                                } else {
                                    throw FormatException.m45945a();
                                }
                            } else {
                                throw FormatException.m45945a();
                            }
                        } else {
                            char[] cArr2 = f112464d;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                    z = false;
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 != 27) {
                                if (i3 == 30) {
                                    z = true;
                                } else {
                                    throw FormatException.m45945a();
                                }
                            } else {
                                sb.append((char) 29);
                            }
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f112463c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.m45945a();
                    }
                }
            }
            if (c4088jt.m100426a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m10223h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    public static int m10222i(int i, int i2) {
        int i3 = i - (((i2 * 149) % KotlinVersion.MAX_COMPONENT_VALUE) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
