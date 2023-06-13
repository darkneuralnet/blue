package p000;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.zxing.FormatException;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* renamed from: wV0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51047wV0 {

    /* renamed from: a */
    public static final char[] f116039a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f116040b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final BigInteger[] f116041c;

    /* renamed from: wV0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C29891a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116042a;

        static {
            int[] iArr = new int[EnumC29892b.values().length];
            f116042a = iArr;
            try {
                iArr[EnumC29892b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116042a[EnumC29892b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116042a[EnumC29892b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116042a[EnumC29892b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116042a[EnumC29892b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116042a[EnumC29892b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: wV0$b */
    /* loaded from: classes6.dex */
    public enum EnumC29892b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f116041c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f116041c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    private C51047wV0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m6785a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j = 900;
        int i5 = 6;
        if (i != 901) {
            if (i != 924) {
                i4 = i2;
            } else {
                i4 = i2;
                boolean z = false;
                int i6 = 0;
                while (true) {
                    long j2 = 0;
                    while (i4 < iArr[0] && !z) {
                        int i7 = i4 + 1;
                        int i8 = iArr[i4];
                        if (i8 < 900) {
                            i6++;
                            j2 = (j2 * 900) + i8;
                        } else {
                            if (i8 != 928) {
                                switch (i8) {
                                    default:
                                        switch (i8) {
                                        }
                                    case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                                    case 901:
                                    case 902:
                                        i4 = i7 - 1;
                                        z = true;
                                        break;
                                }
                                if (i6 % 5 == 0 && i6 > 0) {
                                    for (int i9 = 0; i9 < 6; i9++) {
                                        byteArrayOutputStream.write((byte) (j2 >> ((5 - i9) * 8)));
                                    }
                                    i6 = 0;
                                }
                            }
                            i4 = i7 - 1;
                            z = true;
                            if (i6 % 5 == 0) {
                            }
                        }
                        i4 = i7;
                        if (i6 % 5 == 0) {
                        }
                    }
                }
            }
        } else {
            int[] iArr2 = new int[6];
            int i10 = i2 + 1;
            int i11 = iArr[i2];
            boolean z2 = false;
            int i12 = 0;
            while (true) {
                long j3 = 0;
                while (true) {
                    i3 = iArr[0];
                    if (i10 < i3 && !z2) {
                        int i13 = i12 + 1;
                        iArr2[i12] = i11;
                        j3 = (j3 * j) + i11;
                        int i14 = i10 + 1;
                        i11 = iArr[i10];
                        if (i11 != 928) {
                            switch (i11) {
                                case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i11) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                        default:
                                            if (i13 % 5 == 0 && i13 > 0) {
                                                int i15 = 0;
                                                while (i15 < i5) {
                                                    byteArrayOutputStream.write((byte) (j3 >> ((5 - i15) * 8)));
                                                    i15++;
                                                    i5 = 6;
                                                }
                                                i10 = i14;
                                                i12 = 0;
                                                j = 900;
                                            } else {
                                                i10 = i14;
                                                i12 = i13;
                                                j = 900;
                                                i5 = 6;
                                            }
                                    }
                            }
                        }
                        i10 = i14 - 1;
                        i12 = i13;
                        j = 900;
                        i5 = 6;
                        z2 = true;
                    }
                }
            }
            if (i10 == i3 && i11 < 900) {
                iArr2[i12] = i11;
                i12++;
            }
            for (int i16 = 0; i16 < i12; i16++) {
                byteArrayOutputStream.write((byte) iArr2[i16]);
            }
            i4 = i10;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HV0 m6784b(int[] iArr, String str) throws FormatException {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        C50295vD3 c50295vD3 = new C50295vD3();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                        i = m6779g(iArr, i3, sb);
                        break;
                    case 901:
                        i = m6785a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = m6780f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.m45945a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(EnumC38704bi0.m64111b(iArr[i3]).name());
                                break;
                            case 928:
                                i = m6782d(iArr, i3, c50295vD3);
                                break;
                            default:
                                i = m6779g(iArr, i3 - 1, sb);
                                break;
                        }
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.m45945a();
            }
        }
        if (sb.length() != 0) {
            HV0 hv0 = new HV0(null, sb.toString(), null, str);
            hv0.m103811m(c50295vD3);
            return hv0;
        }
        throw FormatException.m45945a();
    }

    /* renamed from: c */
    public static String m6783c(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f116041c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.m45945a();
    }

    /* renamed from: d */
    public static int m6782d(int[] iArr, int i, C50295vD3 c50295vD3) throws FormatException {
        int i2;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i];
                i3++;
                i++;
            }
            c50295vD3.m9013j(Integer.parseInt(m6783c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int m6779g = m6779g(iArr, i, sb);
            c50295vD3.m9019d(sb.toString());
            if (iArr[m6779g] == 923) {
                i2 = m6779g + 1;
            } else {
                i2 = -1;
            }
            while (m6779g < iArr[0]) {
                int i4 = iArr[m6779g];
                if (i4 != 922) {
                    if (i4 == 923) {
                        int i5 = m6779g + 1;
                        switch (iArr[i5]) {
                            case 0:
                                StringBuilder sb2 = new StringBuilder();
                                m6779g = m6779g(iArr, i5 + 1, sb2);
                                c50295vD3.m9018e(sb2.toString());
                                continue;
                            case 1:
                                StringBuilder sb3 = new StringBuilder();
                                m6779g = m6780f(iArr, i5 + 1, sb3);
                                c50295vD3.m9014i(Integer.parseInt(sb3.toString()));
                                continue;
                            case 2:
                                StringBuilder sb4 = new StringBuilder();
                                m6779g = m6780f(iArr, i5 + 1, sb4);
                                c50295vD3.m9011l(Long.parseLong(sb4.toString()));
                                continue;
                            case 3:
                                StringBuilder sb5 = new StringBuilder();
                                m6779g = m6779g(iArr, i5 + 1, sb5);
                                c50295vD3.m9012k(sb5.toString());
                                continue;
                            case 4:
                                StringBuilder sb6 = new StringBuilder();
                                m6779g = m6779g(iArr, i5 + 1, sb6);
                                c50295vD3.m9021b(sb6.toString());
                                continue;
                            case 5:
                                StringBuilder sb7 = new StringBuilder();
                                m6779g = m6780f(iArr, i5 + 1, sb7);
                                c50295vD3.m9017f(Long.parseLong(sb7.toString()));
                                continue;
                            case 6:
                                StringBuilder sb8 = new StringBuilder();
                                m6779g = m6780f(iArr, i5 + 1, sb8);
                                c50295vD3.m9020c(Integer.parseInt(sb8.toString()));
                                continue;
                            default:
                                throw FormatException.m45945a();
                        }
                    } else {
                        throw FormatException.m45945a();
                    }
                } else {
                    m6779g++;
                    c50295vD3.m9016g(true);
                }
            }
            if (i2 != -1) {
                int i6 = m6779g - i2;
                if (c50295vD3.m9022a()) {
                    i6--;
                }
                c50295vD3.m9015h(Arrays.copyOfRange(iArr, i2, i6 + i2));
            }
            return m6779g;
        }
        throw FormatException.m45945a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public static void m6781e(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        EnumC29892b enumC29892b;
        int i2;
        EnumC29892b enumC29892b2 = EnumC29892b.ALPHA;
        EnumC29892b enumC29892b3 = enumC29892b2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C29891a.f116042a[enumC29892b2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        enumC29892b2 = EnumC29892b.LOWER;
                                        break;
                                    case 28:
                                        enumC29892b2 = EnumC29892b.MIXED;
                                        break;
                                    case 29:
                                        enumC29892b = EnumC29892b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC29892b enumC29892b4 = enumC29892b;
                                        enumC29892b3 = enumC29892b2;
                                        enumC29892b2 = enumC29892b4;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        enumC29892b = EnumC29892b.ALPHA_SHIFT;
                                        c = 0;
                                        EnumC29892b enumC29892b42 = enumC29892b;
                                        enumC29892b3 = enumC29892b2;
                                        enumC29892b2 = enumC29892b42;
                                        break;
                                    case 28:
                                        enumC29892b2 = EnumC29892b.MIXED;
                                        break;
                                    case 29:
                                        enumC29892b = EnumC29892b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC29892b enumC29892b422 = enumC29892b;
                                        enumC29892b3 = enumC29892b2;
                                        enumC29892b2 = enumC29892b422;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 3:
                    if (i4 < 25) {
                        c = f116040b[i4];
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 25:
                                        enumC29892b2 = EnumC29892b.PUNCT;
                                        break;
                                    case 27:
                                        enumC29892b2 = EnumC29892b.LOWER;
                                        break;
                                    case 28:
                                        enumC29892b2 = EnumC29892b.ALPHA;
                                        break;
                                    case 29:
                                        enumC29892b = EnumC29892b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC29892b enumC29892b4222 = enumC29892b;
                                        enumC29892b3 = enumC29892b2;
                                        enumC29892b2 = enumC29892b4222;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i3]);
                            }
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 4:
                    if (i4 < 29) {
                        c = f116039a[i4];
                        break;
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb.append((char) iArr2[i3]);
                                }
                            } else {
                                enumC29892b2 = EnumC29892b.ALPHA;
                            }
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 != 900) {
                            enumC29892b2 = enumC29892b3;
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    enumC29892b2 = enumC29892b3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = f116039a[i4];
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb.append((char) iArr2[i3]);
                                }
                                c = 0;
                            } else {
                                enumC29892b2 = EnumC29892b.ALPHA;
                            }
                        } else {
                            enumC29892b2 = EnumC29892b.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    enumC29892b2 = enumC29892b3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    /* renamed from: f */
    public static int m6780f(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                        }
                    }
                    i4--;
                    z = true;
                }
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb.append(m6783c(iArr2, i2));
                    i2 = 0;
                }
                i = i4;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m6779g(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS /* 900 */:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m6781e(iArr2, iArr3, i3, sb);
        return i;
    }
}
