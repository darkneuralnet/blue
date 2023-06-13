package p000;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* renamed from: xV0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51640xV0 {

    /* renamed from: a */
    public static final char[] f117713a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: xV0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30214a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f117714a;

        static {
            int[] iArr = new int[NU2.values().length];
            f117714a = iArr;
            try {
                iArr[NU2.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117714a[NU2.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117714a[NU2.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117714a[NU2.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117714a[NU2.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f117714a[NU2.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f117714a[NU2.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f117714a[NU2.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f117714a[NU2.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f117714a[NU2.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private C51640xV0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static HV0 m5126a(byte[] bArr, C32447Do6 c32447Do6, EnumC41074fg1 enumC41074fg1, Map<EnumC47491qV0, ?> map) throws FormatException {
        NU2 m93860a;
        NU2 nu2;
        ArrayList arrayList;
        String obj;
        C4088JT c4088jt = new C4088JT(bArr);
        StringBuilder sb = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        EnumC38704bi0 enumC38704bi0 = null;
        while (true) {
            try {
                if (c4088jt.m100426a() < 4) {
                    m93860a = NU2.TERMINATOR;
                } else {
                    m93860a = NU2.m93860a(c4088jt.m100423d(4));
                }
                NU2 nu22 = m93860a;
                int[] iArr = C30214a.f117714a;
                switch (iArr[nu22.ordinal()]) {
                    case 5:
                        nu2 = nu22;
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        nu2 = nu22;
                        break;
                    case 8:
                        if (c4088jt.m100426a() >= 16) {
                            int m100423d = c4088jt.m100423d(8);
                            i2 = c4088jt.m100423d(8);
                            i = m100423d;
                            nu2 = nu22;
                            break;
                        } else {
                            throw FormatException.m45945a();
                        }
                    case 9:
                        enumC38704bi0 = EnumC38704bi0.m64111b(m5120g(c4088jt));
                        if (enumC38704bi0 == null) {
                            throw FormatException.m45945a();
                        }
                        nu2 = nu22;
                        break;
                    case 10:
                        int m100423d2 = c4088jt.m100423d(4);
                        int m100423d3 = c4088jt.m100423d(nu22.m93858c(c32447Do6));
                        if (m100423d2 == z) {
                            m5123d(c4088jt, sb, m100423d3);
                        }
                        nu2 = nu22;
                        break;
                    default:
                        int m100423d4 = c4088jt.m100423d(nu22.m93858c(c32447Do6));
                        int i3 = iArr[nu22.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        m5122e(c4088jt, sb, m100423d4);
                                        nu2 = nu22;
                                        break;
                                    } else {
                                        throw FormatException.m45945a();
                                    }
                                } else {
                                    nu2 = nu22;
                                    m5124c(c4088jt, sb, m100423d4, enumC38704bi0, arrayList2, map);
                                    break;
                                }
                            } else {
                                nu2 = nu22;
                                m5125b(c4088jt, sb, m100423d4, z2);
                                break;
                            }
                        } else {
                            nu2 = nu22;
                            m5121f(c4088jt, sb, m100423d4);
                            break;
                        }
                }
                if (nu2 == NU2.TERMINATOR) {
                    String sb2 = sb.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (enumC41074fg1 == null) {
                        obj = null;
                    } else {
                        obj = enumC41074fg1.toString();
                    }
                    return new HV0(bArr, sb2, arrayList, obj, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.m45945a();
            }
        }
    }

    /* renamed from: b */
    public static void m5125b(C4088JT c4088jt, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (c4088jt.m100426a() >= 11) {
                int m100423d = c4088jt.m100423d(11);
                sb.append(m5119h(m100423d / 45));
                sb.append(m5119h(m100423d % 45));
                i -= 2;
            } else {
                throw FormatException.m45945a();
            }
        }
        if (i == 1) {
            if (c4088jt.m100426a() >= 6) {
                sb.append(m5119h(c4088jt.m100423d(6)));
            } else {
                throw FormatException.m45945a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m5124c(C4088JT c4088jt, StringBuilder sb, int i, EnumC38704bi0 enumC38704bi0, Collection<byte[]> collection, Map<EnumC47491qV0, ?> map) throws FormatException {
        String name;
        if ((i << 3) <= c4088jt.m100426a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) c4088jt.m100423d(8);
            }
            if (enumC38704bi0 == null) {
                name = C43911kS5.m28953a(bArr, map);
            } else {
                name = enumC38704bi0.name();
            }
            try {
                sb.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m45945a();
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: d */
    public static void m5123d(C4088JT c4088jt, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= c4088jt.m100426a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int m100423d = c4088jt.m100423d(13);
                int i4 = (m100423d % 96) | ((m100423d / 96) << 8);
                if (i4 < 959) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m45945a();
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: e */
    public static void m5122e(C4088JT c4088jt, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= c4088jt.m100426a()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int m100423d = c4088jt.m100423d(13);
                int i4 = (m100423d % 192) | ((m100423d / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m45945a();
            }
        }
        throw FormatException.m45945a();
    }

    /* renamed from: f */
    public static void m5121f(C4088JT c4088jt, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (c4088jt.m100426a() >= 10) {
                int m100423d = c4088jt.m100423d(10);
                if (m100423d < 1000) {
                    sb.append(m5119h(m100423d / 100));
                    sb.append(m5119h((m100423d / 10) % 10));
                    sb.append(m5119h(m100423d % 10));
                    i -= 3;
                } else {
                    throw FormatException.m45945a();
                }
            } else {
                throw FormatException.m45945a();
            }
        }
        if (i == 2) {
            if (c4088jt.m100426a() >= 7) {
                int m100423d2 = c4088jt.m100423d(7);
                if (m100423d2 < 100) {
                    sb.append(m5119h(m100423d2 / 10));
                    sb.append(m5119h(m100423d2 % 10));
                    return;
                }
                throw FormatException.m45945a();
            }
            throw FormatException.m45945a();
        } else if (i == 1) {
            if (c4088jt.m100426a() >= 4) {
                int m100423d3 = c4088jt.m100423d(4);
                if (m100423d3 < 10) {
                    sb.append(m5119h(m100423d3));
                    return;
                }
                throw FormatException.m45945a();
            }
            throw FormatException.m45945a();
        }
    }

    /* renamed from: g */
    public static int m5120g(C4088JT c4088jt) throws FormatException {
        int m100423d = c4088jt.m100423d(8);
        if ((m100423d & 128) == 0) {
            return m100423d & 127;
        }
        if ((m100423d & 192) == 128) {
            return c4088jt.m100423d(8) | ((m100423d & 63) << 8);
        }
        if ((m100423d & 224) == 192) {
            return c4088jt.m100423d(16) | ((m100423d & 31) << 16);
        }
        throw FormatException.m45945a();
    }

    /* renamed from: h */
    public static char m5119h(int i) throws FormatException {
        char[] cArr = f117713a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m45945a();
    }
}
