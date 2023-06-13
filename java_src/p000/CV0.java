package p000;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Arrays;
/* renamed from: CV0 */
/* loaded from: classes6.dex */
public final class CV0 {

    /* renamed from: b */
    public static final String[] f4117b = {"CTRL_PS", " ", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f4118c = {"CTRL_PS", " ", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f4119d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f4120e = {"", "\r", FileUploadRequest.LINE_BREAK, ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", Detail.EMPTY_CHAR, InstructionFileId.DOT, "/", ":", ";", "<", "=", ">", CallerData.f61059NA, "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f4121f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", InstructionFileId.DOT, "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    public C12188av f4122a;

    /* renamed from: CV0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C1031a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4123a;

        static {
            int[] iArr = new int[EnumC1032b.values().length];
            f4123a = iArr;
            try {
                iArr[EnumC1032b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4123a[EnumC1032b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4123a[EnumC1032b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4123a[EnumC1032b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4123a[EnumC1032b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: CV0$b */
    /* loaded from: classes6.dex */
    public enum EnumC1032b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    public static byte[] m112197a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m112190h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: e */
    public static String m112193e(EnumC1032b enumC1032b, int i) {
        int i2 = C1031a.f4123a[enumC1032b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f4121f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f4120e[i];
                }
                return f4119d[i];
            }
            return f4118c[i];
        }
        return f4117b[i];
    }

    /* renamed from: f */
    public static String m112192f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        EnumC1032b enumC1032b = EnumC1032b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        EnumC1032b enumC1032b2 = enumC1032b;
        int i2 = 0;
        while (i2 < length) {
            if (enumC1032b == EnumC1032b.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int m112189i = m112189i(zArr, i2, 5);
                i2 += 5;
                if (m112189i == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    m112189i = m112189i(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= m112189i) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb.append((char) m112189i(zArr, i2, 8));
                        i2 += 8;
                        i3++;
                    }
                }
                enumC1032b = enumC1032b2;
            } else {
                if (enumC1032b == EnumC1032b.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int m112189i2 = m112189i(zArr, i2, i);
                i2 += i;
                String m112193e = m112193e(enumC1032b, m112189i2);
                if (m112193e.startsWith("CTRL_")) {
                    enumC1032b2 = m112191g(m112193e.charAt(5));
                    if (m112193e.charAt(6) != 'L') {
                        enumC1032b2 = enumC1032b;
                        enumC1032b = enumC1032b2;
                    }
                } else {
                    sb.append(m112193e);
                }
                enumC1032b = enumC1032b2;
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static EnumC1032b m112191g(char c) {
        if (c != 'B') {
            if (c != 'D') {
                if (c != 'P') {
                    if (c != 'L') {
                        if (c != 'M') {
                            return EnumC1032b.UPPER;
                        }
                        return EnumC1032b.MIXED;
                    }
                    return EnumC1032b.LOWER;
                }
                return EnumC1032b.PUNCT;
            }
            return EnumC1032b.DIGIT;
        }
        return EnumC1032b.BINARY;
    }

    /* renamed from: h */
    public static byte m112190h(boolean[] zArr, int i) {
        int m112189i;
        int length = zArr.length - i;
        if (length >= 8) {
            m112189i = m112189i(zArr, i, 8);
        } else {
            m112189i = m112189i(zArr, i, length) << (8 - length);
        }
        return (byte) m112189i;
    }

    /* renamed from: i */
    public static int m112189i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    public static int m112188j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: b */
    public final boolean[] m112196b(boolean[] zArr) throws FormatException {
        int i;
        C49683uB1 c49683uB1;
        boolean z;
        boolean z2;
        if (this.f4122a.m65285d() <= 2) {
            c49683uB1 = C49683uB1.f111916j;
            i = 6;
        } else {
            i = 8;
            if (this.f4122a.m65285d() <= 8) {
                c49683uB1 = C49683uB1.f111920n;
            } else if (this.f4122a.m65285d() <= 22) {
                c49683uB1 = C49683uB1.f111915i;
                i = 10;
            } else {
                c49683uB1 = C49683uB1.f111914h;
                i = 12;
            }
        }
        int m65286c = this.f4122a.m65286c();
        int length = zArr.length / i;
        if (length >= m65286c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m112189i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C42986it4(c49683uB1).m31679a(iArr, length - m65286c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < m65286c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 != 0 && i6 != i3) {
                        if (i6 == 1 || i6 == i3 - 1) {
                            i4++;
                        }
                    } else {
                        throw FormatException.m45945a();
                    }
                }
                boolean[] zArr2 = new boolean[(m65286c * i) - i4];
                int i7 = 0;
                for (int i8 = 0; i8 < m65286c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 != 1 && i9 != i3 - 1) {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            if (((1 << i10) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i10--;
                            i7 = i11;
                        }
                    } else {
                        int i12 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i12, z);
                        i7 += i - 1;
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.m45944b(e);
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: c */
    public HV0 m112195c(C12188av c12188av) throws FormatException {
        this.f4122a = c12188av;
        boolean[] m112196b = m112196b(m112194d(c12188av.m62007a()));
        HV0 hv0 = new HV0(m112197a(m112196b), m112192f(m112196b), null, null);
        hv0.m103812l(m112196b.length);
        return hv0;
    }

    /* renamed from: d */
    public final boolean[] m112194d(C1837ET c1837et) {
        int i;
        int i2;
        boolean m65284e = this.f4122a.m65284e();
        int m65285d = this.f4122a.m65285d();
        if (m65284e) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (m65285d << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m112188j(m65285d, m65284e)];
        int i4 = 2;
        if (m65284e) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < m65285d) {
            int i12 = (m65285d - i10) << i4;
            if (m65284e) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = c1837et.m108959h(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = m65284e;
                    zArr[(i13 * 2) + i11 + i17 + i18] = c1837et.m108959h(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = c1837et.m108959h(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = c1837et.m108959h(iArr[i24], iArr[i19]);
                    i18++;
                    m65285d = m65285d;
                    m65284e = z;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }
}
