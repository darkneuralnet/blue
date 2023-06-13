package p000;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p000.C32447Do6;
/* renamed from: qb1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47547qb1 {

    /* renamed from: a */
    public static final int[] f105451a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: qb1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C27630a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f105452a;

        static {
            int[] iArr = new int[NU2.values().length];
            f105452a = iArr;
            try {
                iArr[NU2.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105452a[NU2.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105452a[NU2.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105452a[NU2.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private C47547qb1() {
    }

    /* renamed from: a */
    public static void m17374a(String str, C1027CT c1027ct, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                c1027ct.m112221f(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: b */
    public static void m17373b(CharSequence charSequence, C1027CT c1027ct) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int m17359p = m17359p(charSequence.charAt(i));
            if (m17359p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int m17359p2 = m17359p(charSequence.charAt(i2));
                    if (m17359p2 != -1) {
                        c1027ct.m112221f((m17359p * 45) + m17359p2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    c1027ct.m112221f(m17359p, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    public static void m17372c(String str, NU2 nu2, C1027CT c1027ct, String str2) throws WriterException {
        int i = C27630a.f105452a[nu2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m17370e(str, c1027ct);
                        return;
                    }
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(nu2)));
                }
                m17374a(str, c1027ct, str2);
                return;
            }
            m17373b(str, c1027ct);
            return;
        }
        m17367h(str, c1027ct);
    }

    /* renamed from: d */
    public static void m17371d(EnumC38704bi0 enumC38704bi0, C1027CT c1027ct) {
        c1027ct.m112221f(NU2.ECI.m93859b(), 4);
        c1027ct.m112221f(enumC38704bi0.m64110c(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17370e(String str, C1027CT c1027ct) throws WriterException {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & UByte.MAX_VALUE) << 8) | (bytes[i2 + 1] & UByte.MAX_VALUE);
                int i4 = 33088;
                if (i3 < 33088 || i3 > 40956) {
                    if (i3 >= 57408 && i3 <= 60351) {
                        i4 = 49472;
                    } else {
                        i = -1;
                        if (i == -1) {
                            c1027ct.m112221f(((i >> 8) * 192) + (i & KotlinVersion.MAX_COMPONENT_VALUE), 13);
                        } else {
                            throw new WriterException("Invalid byte sequence");
                        }
                    }
                }
                i = i3 - i4;
                if (i == -1) {
                }
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: f */
    public static void m17369f(int i, C32447Do6 c32447Do6, NU2 nu2, C1027CT c1027ct) throws WriterException {
        int m93858c = nu2.m93858c(c32447Do6);
        int i2 = 1 << m93858c;
        if (i < i2) {
            c1027ct.m112221f(i, m93858c);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    public static void m17368g(NU2 nu2, C1027CT c1027ct) {
        c1027ct.m112221f(nu2.m93859b(), 4);
    }

    /* renamed from: h */
    public static void m17367h(CharSequence charSequence, C1027CT c1027ct) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                c1027ct.m112221f((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c1027ct.m112221f((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    c1027ct.m112221f(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    public static int m17366i(NU2 nu2, C1027CT c1027ct, C1027CT c1027ct2, C32447Do6 c32447Do6) {
        return c1027ct.m112213o() + nu2.m93858c(c32447Do6) + c1027ct2.m112213o();
    }

    /* renamed from: j */
    public static int m17365j(G70 g70) {
        return C48597sM2.m14313a(g70) + C48597sM2.m14311c(g70) + C48597sM2.m14310d(g70) + C48597sM2.m14309e(g70);
    }

    /* renamed from: k */
    public static int m17364k(C1027CT c1027ct, EnumC41074fg1 enumC41074fg1, C32447Do6 c32447Do6, G70 g70) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C46828pN2.m19382a(c1027ct, enumC41074fg1, c32447Do6, i3, g70);
            int m17365j = m17365j(g70);
            if (m17365j < i) {
                i2 = i3;
                i = m17365j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static NU2 m17363l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m17356s(str)) {
            return NU2.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m17359p(charAt) != -1) {
                z = true;
            } else {
                return NU2.BYTE;
            }
        }
        if (z) {
            return NU2.ALPHANUMERIC;
        }
        if (z2) {
            return NU2.NUMERIC;
        }
        return NU2.BYTE;
    }

    /* renamed from: m */
    public static C32447Do6 m17362m(int i, EnumC41074fg1 enumC41074fg1) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C32447Do6 m109907i = C32447Do6.m109907i(i2);
            if (m17353v(i, m109907i, enumC41074fg1)) {
                return m109907i;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C45771nb4 m17361n(String str, EnumC41074fg1 enumC41074fg1, Map<EnumC40431eb1, ?> map) throws WriterException {
        boolean z;
        String str2;
        C32447Do6 m17355t;
        int length;
        EnumC38704bi0 m64112a;
        boolean z2 = true;
        if (map != null && map.containsKey(EnumC40431eb1.CHARACTER_SET)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = map.get(EnumC40431eb1.CHARACTER_SET).toString();
        } else {
            str2 = "ISO-8859-1";
        }
        NU2 m17363l = m17363l(str, str2);
        C1027CT c1027ct = new C1027CT();
        NU2 nu2 = NU2.BYTE;
        if (m17363l == nu2 && z && (m64112a = EnumC38704bi0.m64112a(str2)) != null) {
            m17371d(m64112a, c1027ct);
        }
        if (map == null || !map.containsKey(EnumC40431eb1.GS1_FORMAT)) {
            z2 = false;
        }
        if (z2 && Boolean.valueOf(map.get(EnumC40431eb1.GS1_FORMAT).toString()).booleanValue()) {
            m17368g(NU2.FNC1_FIRST_POSITION, c1027ct);
        }
        m17368g(m17363l, c1027ct);
        C1027CT c1027ct2 = new C1027CT();
        m17372c(str, m17363l, c1027ct2, str2);
        if (map != null) {
            EnumC40431eb1 enumC40431eb1 = EnumC40431eb1.QR_VERSION;
            if (map.containsKey(enumC40431eb1)) {
                m17355t = C32447Do6.m109907i(Integer.parseInt(map.get(enumC40431eb1).toString()));
                if (!m17353v(m17366i(m17363l, c1027ct, c1027ct2, m17355t), m17355t, enumC41074fg1)) {
                    throw new WriterException("Data too big for requested version");
                }
                C1027CT c1027ct3 = new C1027CT();
                c1027ct3.m112222e(c1027ct);
                if (m17363l != nu2) {
                    length = c1027ct2.m112212p();
                } else {
                    length = str.length();
                }
                m17369f(length, m17355t, m17363l, c1027ct3);
                c1027ct3.m112222e(c1027ct2);
                C32447Do6.C1619b m109910f = m17355t.m109910f(enumC41074fg1);
                int m109908h = m17355t.m109908h() - m109910f.m109900d();
                m17354u(m109908h, c1027ct3);
                C1027CT m17357r = m17357r(c1027ct3, m17355t.m109908h(), m109908h, m109910f.m109901c());
                C45771nb4 c45771nb4 = new C45771nb4();
                c45771nb4.m23481c(enumC41074fg1);
                c45771nb4.m23478f(m17363l);
                c45771nb4.m23477g(m17355t);
                int m109911e = m17355t.m109911e();
                G70 g70 = new G70(m109911e, m109911e);
                int m17364k = m17364k(m17357r, enumC41074fg1, m17355t, g70);
                c45771nb4.m23480d(m17364k);
                C46828pN2.m19382a(m17357r, enumC41074fg1, m17355t, m17364k, g70);
                c45771nb4.m23479e(g70);
                return c45771nb4;
            }
        }
        m17355t = m17355t(enumC41074fg1, m17363l, c1027ct, c1027ct2);
        C1027CT c1027ct32 = new C1027CT();
        c1027ct32.m112222e(c1027ct);
        if (m17363l != nu2) {
        }
        m17369f(length, m17355t, m17363l, c1027ct32);
        c1027ct32.m112222e(c1027ct2);
        C32447Do6.C1619b m109910f2 = m17355t.m109910f(enumC41074fg1);
        int m109908h2 = m17355t.m109908h() - m109910f2.m109900d();
        m17354u(m109908h2, c1027ct32);
        C1027CT m17357r2 = m17357r(c1027ct32, m17355t.m109908h(), m109908h2, m109910f2.m109901c());
        C45771nb4 c45771nb42 = new C45771nb4();
        c45771nb42.m23481c(enumC41074fg1);
        c45771nb42.m23478f(m17363l);
        c45771nb42.m23477g(m17355t);
        int m109911e2 = m17355t.m109911e();
        G70 g702 = new G70(m109911e2, m109911e2);
        int m17364k2 = m17364k(m17357r2, enumC41074fg1, m17355t, g702);
        c45771nb42.m23480d(m17364k2);
        C46828pN2.m19382a(m17357r2, enumC41074fg1, m17355t, m17364k2, g702);
        c45771nb42.m23479e(g702);
        return c45771nb42;
    }

    /* renamed from: o */
    public static byte[] m17360o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & UByte.MAX_VALUE;
        }
        new C43579jt4(C49683uB1.f111918l).m29779b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    public static int m17359p(int i) {
        int[] iArr = f105451a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    public static void m17358q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 == i12) {
                if (i3 == i6 + i5) {
                    if (i == ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                        if (i4 < i6) {
                            iArr[0] = i9;
                            iArr2[0] = i11;
                            return;
                        }
                        iArr[0] = i10;
                        iArr2[0] = i12;
                        return;
                    }
                    throw new WriterException("Total bytes mismatch");
                }
                throw new WriterException("RS blocks mismatch");
            }
            throw new WriterException("EC bytes mismatch");
        }
        throw new WriterException("Block ID too large");
    }

    /* renamed from: r */
    public static C1027CT m17357r(C1027CT c1027ct, int i, int i2, int i3) throws WriterException {
        if (c1027ct.m112212p() == i2) {
            ArrayList<C7184RW> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m17358q(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                c1027ct.m112206z(i4 << 3, bArr, 0, i8);
                byte[] m17360o = m17360o(bArr, iArr2[0]);
                arrayList.add(new C7184RW(bArr, m17360o));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, m17360o.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                C1027CT c1027ct2 = new C1027CT();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (C7184RW c7184rw : arrayList) {
                        byte[] m86680a = c7184rw.m86680a();
                        if (i9 < m86680a.length) {
                            c1027ct2.m112221f(m86680a[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (C7184RW c7184rw2 : arrayList) {
                        byte[] m86679b = c7184rw2.m86679b();
                        if (i10 < m86679b.length) {
                            c1027ct2.m112221f(m86679b[i10], 8);
                        }
                    }
                }
                if (i == c1027ct2.m112212p()) {
                    return c1027ct2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + c1027ct2.m112212p() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    public static boolean m17356s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & UByte.MAX_VALUE;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static C32447Do6 m17355t(EnumC41074fg1 enumC41074fg1, NU2 nu2, C1027CT c1027ct, C1027CT c1027ct2) throws WriterException {
        return m17362m(m17366i(nu2, c1027ct, c1027ct2, m17362m(m17366i(nu2, c1027ct, c1027ct2, C32447Do6.m109907i(1)), enumC41074fg1)), enumC41074fg1);
    }

    /* renamed from: u */
    public static void m17354u(int i, C1027CT c1027ct) throws WriterException {
        int i2;
        int i3 = i << 3;
        if (c1027ct.m112213o() <= i3) {
            for (int i4 = 0; i4 < 4 && c1027ct.m112213o() < i3; i4++) {
                c1027ct.m112223d(false);
            }
            int m112213o = c1027ct.m112213o() & 7;
            if (m112213o > 0) {
                while (m112213o < 8) {
                    c1027ct.m112223d(false);
                    m112213o++;
                }
            }
            int m112212p = i - c1027ct.m112212p();
            for (int i5 = 0; i5 < m112212p; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                c1027ct.m112221f(i2, 8);
            }
            if (c1027ct.m112213o() == i3) {
                return;
            }
            throw new WriterException("Bits size does not equal capacity");
        }
        throw new WriterException("data bits cannot fit in the QR Code" + c1027ct.m112213o() + " > " + i3);
    }

    /* renamed from: v */
    public static boolean m17353v(int i, C32447Do6 c32447Do6, EnumC41074fg1 enumC41074fg1) {
        if (c32447Do6.m109908h() - c32447Do6.m109910f(enumC41074fg1).m109900d() >= (i + 7) / 8) {
            return true;
        }
        return false;
    }
}
