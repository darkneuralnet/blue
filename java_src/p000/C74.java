package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: C74 */
/* loaded from: classes.dex */
public class C74 {

    /* renamed from: a */
    public static final byte[] f3413a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f3414b = {112, 114, 109, 0};

    private C74() {
    }

    /* renamed from: A */
    public static void m112876A(InputStream inputStream) throws IOException {
        C35376Qc1.m88352h(inputStream);
        int m88350j = C35376Qc1.m88350j(inputStream);
        if (m88350j == 6 || m88350j == 7) {
            return;
        }
        while (m88350j > 0) {
            C35376Qc1.m88350j(inputStream);
            for (int m88350j2 = C35376Qc1.m88350j(inputStream); m88350j2 > 0; m88350j2--) {
                C35376Qc1.m88352h(inputStream);
            }
            m88350j--;
        }
    }

    /* renamed from: B */
    public static boolean m112875B(OutputStream outputStream, byte[] bArr, C38321b31[] c38321b31Arr) throws IOException {
        if (Arrays.equals(bArr, F74.f8768a)) {
            m112863N(outputStream, c38321b31Arr);
            return true;
        } else if (Arrays.equals(bArr, F74.f8769b)) {
            m112864M(outputStream, c38321b31Arr);
            return true;
        } else if (Arrays.equals(bArr, F74.f8771d)) {
            m112866K(outputStream, c38321b31Arr);
            return true;
        } else if (Arrays.equals(bArr, F74.f8770c)) {
            m112865L(outputStream, c38321b31Arr);
            return true;
        } else if (Arrays.equals(bArr, F74.f8772e)) {
            m112867J(outputStream, c38321b31Arr);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: C */
    public static void m112874C(OutputStream outputStream, C38321b31 c38321b31) throws IOException {
        int i = 0;
        for (int i2 : c38321b31.f56834h) {
            Integer valueOf = Integer.valueOf(i2);
            C35376Qc1.m88344p(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    /* renamed from: D */
    public static C42627iH6 m112873D(C38321b31[] c38321b31Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C35376Qc1.m88344p(byteArrayOutputStream, c38321b31Arr.length);
            int i = 2;
            for (C38321b31 c38321b31 : c38321b31Arr) {
                C35376Qc1.m88343q(byteArrayOutputStream, c38321b31.f56829c);
                C35376Qc1.m88343q(byteArrayOutputStream, c38321b31.f56830d);
                C35376Qc1.m88343q(byteArrayOutputStream, c38321b31.f56833g);
                String m112852j = m112852j(c38321b31.f56827a, c38321b31.f56828b, F74.f8768a);
                int m88349k = C35376Qc1.m88349k(m112852j);
                C35376Qc1.m88344p(byteArrayOutputStream, m88349k);
                i = i + 4 + 4 + 4 + 2 + (m88349k * 1);
                C35376Qc1.m88346n(byteArrayOutputStream, m112852j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C42627iH6 c42627iH6 = new C42627iH6(EnumC48832sl1.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c42627iH6;
            }
            throw C35376Qc1.m88357c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static void m112872E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f3413a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m112871F(OutputStream outputStream, C38321b31 c38321b31) throws IOException {
        m112868I(outputStream, c38321b31);
        m112874C(outputStream, c38321b31);
        m112869H(outputStream, c38321b31);
    }

    /* renamed from: G */
    public static void m112870G(OutputStream outputStream, C38321b31 c38321b31, String str) throws IOException {
        C35376Qc1.m88344p(outputStream, C35376Qc1.m88349k(str));
        C35376Qc1.m88344p(outputStream, c38321b31.f56831e);
        C35376Qc1.m88343q(outputStream, c38321b31.f56832f);
        C35376Qc1.m88343q(outputStream, c38321b31.f56829c);
        C35376Qc1.m88343q(outputStream, c38321b31.f56833g);
        C35376Qc1.m88346n(outputStream, str);
    }

    /* renamed from: H */
    public static void m112869H(OutputStream outputStream, C38321b31 c38321b31) throws IOException {
        byte[] bArr = new byte[m112851k(c38321b31.f56833g)];
        for (Map.Entry<Integer, Integer> entry : c38321b31.f56835i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                m112836z(bArr, 2, intValue, c38321b31);
            }
            if ((intValue2 & 4) != 0) {
                m112836z(bArr, 4, intValue, c38321b31);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m112868I(OutputStream outputStream, C38321b31 c38321b31) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c38321b31.f56835i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C35376Qc1.m88344p(outputStream, intValue - i);
                C35376Qc1.m88344p(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m112867J(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        C35376Qc1.m88344p(outputStream, c38321b31Arr.length);
        for (C38321b31 c38321b31 : c38321b31Arr) {
            String m112852j = m112852j(c38321b31.f56827a, c38321b31.f56828b, F74.f8772e);
            C35376Qc1.m88344p(outputStream, C35376Qc1.m88349k(m112852j));
            C35376Qc1.m88344p(outputStream, c38321b31.f56835i.size());
            C35376Qc1.m88344p(outputStream, c38321b31.f56834h.length);
            C35376Qc1.m88343q(outputStream, c38321b31.f56829c);
            C35376Qc1.m88346n(outputStream, m112852j);
            for (Integer num : c38321b31.f56835i.keySet()) {
                C35376Qc1.m88344p(outputStream, num.intValue());
            }
            for (int i : c38321b31.f56834h) {
                C35376Qc1.m88344p(outputStream, i);
            }
        }
    }

    /* renamed from: K */
    public static void m112866K(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        C35376Qc1.m88342r(outputStream, c38321b31Arr.length);
        for (C38321b31 c38321b31 : c38321b31Arr) {
            String m112852j = m112852j(c38321b31.f56827a, c38321b31.f56828b, F74.f8771d);
            C35376Qc1.m88344p(outputStream, C35376Qc1.m88349k(m112852j));
            C35376Qc1.m88344p(outputStream, c38321b31.f56834h.length);
            C35376Qc1.m88343q(outputStream, c38321b31.f56835i.size() * 4);
            C35376Qc1.m88343q(outputStream, c38321b31.f56829c);
            C35376Qc1.m88346n(outputStream, m112852j);
            for (Integer num : c38321b31.f56835i.keySet()) {
                C35376Qc1.m88344p(outputStream, num.intValue());
                C35376Qc1.m88344p(outputStream, 0);
            }
            for (int i : c38321b31.f56834h) {
                C35376Qc1.m88344p(outputStream, i);
            }
        }
    }

    /* renamed from: L */
    public static void m112865L(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        byte[] m112860b = m112860b(c38321b31Arr, F74.f8770c);
        C35376Qc1.m88342r(outputStream, c38321b31Arr.length);
        C35376Qc1.m88347m(outputStream, m112860b);
    }

    /* renamed from: M */
    public static void m112864M(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        byte[] m112860b = m112860b(c38321b31Arr, F74.f8769b);
        C35376Qc1.m88342r(outputStream, c38321b31Arr.length);
        C35376Qc1.m88347m(outputStream, m112860b);
    }

    /* renamed from: N */
    public static void m112863N(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        m112862O(outputStream, c38321b31Arr);
    }

    /* renamed from: O */
    public static void m112862O(OutputStream outputStream, C38321b31[] c38321b31Arr) throws IOException {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m112873D(c38321b31Arr));
        arrayList.add(m112859c(c38321b31Arr));
        arrayList.add(m112858d(c38321b31Arr));
        long length2 = F74.f8768a.length + f3413a.length + 4 + (arrayList.size() * 16);
        C35376Qc1.m88343q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C42627iH6 c42627iH6 = (C42627iH6) arrayList.get(i);
            C35376Qc1.m88343q(outputStream, c42627iH6.f87069a.m13713b());
            C35376Qc1.m88343q(outputStream, length2);
            if (c42627iH6.f87072d) {
                byte[] m88358b = C35376Qc1.m88358b(c42627iH6.f87071c);
                arrayList2.add(m88358b);
                C35376Qc1.m88343q(outputStream, m88358b.length);
                C35376Qc1.m88343q(outputStream, bArr.length);
                length = m88358b.length;
            } else {
                arrayList2.add(c42627iH6.f87071c);
                C35376Qc1.m88343q(outputStream, c42627iH6.f87071c.length);
                C35376Qc1.m88343q(outputStream, 0L);
                length = c42627iH6.f87071c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    /* renamed from: a */
    public static int m112861a(C38321b31 c38321b31) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c38321b31.f56835i.entrySet()) {
            i |= entry.getValue().intValue();
        }
        return i;
    }

    /* renamed from: b */
    public static byte[] m112860b(C38321b31[] c38321b31Arr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (C38321b31 c38321b31 : c38321b31Arr) {
            i2 += C35376Qc1.m88349k(m112852j(c38321b31.f56827a, c38321b31.f56828b, bArr)) + 16 + (c38321b31.f56831e * 2) + c38321b31.f56832f + m112851k(c38321b31.f56833g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, F74.f8770c)) {
            int length = c38321b31Arr.length;
            while (i < length) {
                C38321b31 c38321b312 = c38321b31Arr[i];
                m112870G(byteArrayOutputStream, c38321b312, m112852j(c38321b312.f56827a, c38321b312.f56828b, bArr));
                m112871F(byteArrayOutputStream, c38321b312);
                i++;
            }
        } else {
            for (C38321b31 c38321b313 : c38321b31Arr) {
                m112870G(byteArrayOutputStream, c38321b313, m112852j(c38321b313.f56827a, c38321b313.f56828b, bArr));
            }
            int length2 = c38321b31Arr.length;
            while (i < length2) {
                m112871F(byteArrayOutputStream, c38321b31Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C35376Qc1.m88357c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    public static C42627iH6 m112859c(C38321b31[] c38321b31Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c38321b31Arr.length; i2++) {
            try {
                C38321b31 c38321b31 = c38321b31Arr[i2];
                C35376Qc1.m88344p(byteArrayOutputStream, i2);
                C35376Qc1.m88344p(byteArrayOutputStream, c38321b31.f56831e);
                i = i + 2 + 2 + (c38321b31.f56831e * 2);
                m112874C(byteArrayOutputStream, c38321b31);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C42627iH6 c42627iH6 = new C42627iH6(EnumC48832sl1.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c42627iH6;
        }
        throw C35376Qc1.m88357c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    public static C42627iH6 m112858d(C38321b31[] c38321b31Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c38321b31Arr.length; i2++) {
            try {
                C38321b31 c38321b31 = c38321b31Arr[i2];
                int m112861a = m112861a(c38321b31);
                byte[] m112857e = m112857e(c38321b31);
                byte[] m112856f = m112856f(c38321b31);
                C35376Qc1.m88344p(byteArrayOutputStream, i2);
                int length = m112857e.length + 2 + m112856f.length;
                C35376Qc1.m88343q(byteArrayOutputStream, length);
                C35376Qc1.m88344p(byteArrayOutputStream, m112861a);
                byteArrayOutputStream.write(m112857e);
                byteArrayOutputStream.write(m112856f);
                i = i + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C42627iH6 c42627iH6 = new C42627iH6(EnumC48832sl1.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c42627iH6;
        }
        throw C35376Qc1.m88357c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    public static byte[] m112857e(C38321b31 c38321b31) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m112869H(byteArrayOutputStream, c38321b31);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static byte[] m112856f(C38321b31 c38321b31) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m112868I(byteArrayOutputStream, c38321b31);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static String m112855g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    /* renamed from: h */
    public static String m112854h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: i */
    public static C38321b31 m112853i(C38321b31[] c38321b31Arr, String str) {
        if (c38321b31Arr.length <= 0) {
            return null;
        }
        String m112854h = m112854h(str);
        for (int i = 0; i < c38321b31Arr.length; i++) {
            if (c38321b31Arr[i].f56828b.equals(m112854h)) {
                return c38321b31Arr[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m112852j(String str, String str2, byte[] bArr) {
        String m107729a = F74.m107729a(bArr);
        if (str.length() <= 0) {
            return m112855g(str2, m107729a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + F74.m107729a(bArr) + str2;
        }
        return m112855g(str2, m107729a);
    }

    /* renamed from: k */
    public static int m112851k(int i) {
        return m112837y(i * 2) / 8;
    }

    /* renamed from: l */
    public static int m112850l(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw C35376Qc1.m88357c("Unexpected flag: " + i);
            }
            return i2;
        }
        throw C35376Qc1.m88357c("HOT methods are not stored in the bitmap");
    }

    /* renamed from: m */
    public static int[] m112849m(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C35376Qc1.m88352h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m112848n(BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(m112850l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(m112850l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* renamed from: o */
    public static byte[] m112847o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, C35376Qc1.m88356d(inputStream, bArr.length))) {
            return C35376Qc1.m88356d(inputStream, F74.f8769b.length);
        }
        throw C35376Qc1.m88357c("Invalid magic");
    }

    /* renamed from: p */
    public static void m112846p(InputStream inputStream, C38321b31 c38321b31) throws IOException {
        int available = inputStream.available() - c38321b31.f56832f;
        int i = 0;
        while (inputStream.available() > available) {
            i += C35376Qc1.m88352h(inputStream);
            c38321b31.f56835i.put(Integer.valueOf(i), 1);
            for (int m88352h = C35376Qc1.m88352h(inputStream); m88352h > 0; m88352h--) {
                m112876A(inputStream);
            }
        }
        if (inputStream.available() == available) {
            return;
        }
        throw C35376Qc1.m88357c("Read too much data during profile line parse");
    }

    /* renamed from: q */
    public static C38321b31[] m112845q(InputStream inputStream, byte[] bArr, byte[] bArr2, C38321b31[] c38321b31Arr) throws IOException {
        if (Arrays.equals(bArr, F74.f8773f)) {
            if (!Arrays.equals(F74.f8768a, bArr2)) {
                return m112844r(inputStream, bArr, c38321b31Arr);
            }
            throw C35376Qc1.m88357c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, F74.f8774g)) {
            return m112842t(inputStream, bArr2, c38321b31Arr);
        } else {
            throw C35376Qc1.m88357c("Unsupported meta version");
        }
    }

    /* renamed from: r */
    public static C38321b31[] m112844r(InputStream inputStream, byte[] bArr, C38321b31[] c38321b31Arr) throws IOException {
        if (Arrays.equals(bArr, F74.f8773f)) {
            int m88350j = C35376Qc1.m88350j(inputStream);
            byte[] m88355e = C35376Qc1.m88355e(inputStream, (int) C35376Qc1.m88351i(inputStream), (int) C35376Qc1.m88351i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m88355e);
                try {
                    C38321b31[] m112843s = m112843s(byteArrayInputStream, m88350j, c38321b31Arr);
                    byteArrayInputStream.close();
                    return m112843s;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw C35376Qc1.m88357c("Content found after the end of file");
        }
        throw C35376Qc1.m88357c("Unsupported meta version");
    }

    /* renamed from: s */
    public static C38321b31[] m112843s(InputStream inputStream, int i, C38321b31[] c38321b31Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C38321b31[0];
        }
        if (i == c38321b31Arr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int m88352h = C35376Qc1.m88352h(inputStream);
                iArr[i2] = C35376Qc1.m88352h(inputStream);
                strArr[i2] = C35376Qc1.m88354f(inputStream, m88352h);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C38321b31 c38321b31 = c38321b31Arr[i3];
                if (c38321b31.f56828b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c38321b31.f56831e = i4;
                    c38321b31.f56834h = m112849m(inputStream, i4);
                } else {
                    throw C35376Qc1.m88357c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c38321b31Arr;
        }
        throw C35376Qc1.m88357c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: t */
    public static C38321b31[] m112842t(InputStream inputStream, byte[] bArr, C38321b31[] c38321b31Arr) throws IOException {
        int m88352h = C35376Qc1.m88352h(inputStream);
        byte[] m88355e = C35376Qc1.m88355e(inputStream, (int) C35376Qc1.m88351i(inputStream), (int) C35376Qc1.m88351i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m88355e);
            try {
                C38321b31[] m112841u = m112841u(byteArrayInputStream, bArr, m88352h, c38321b31Arr);
                byteArrayInputStream.close();
                return m112841u;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C35376Qc1.m88357c("Content found after the end of file");
    }

    /* renamed from: u */
    public static C38321b31[] m112841u(InputStream inputStream, byte[] bArr, int i, C38321b31[] c38321b31Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C38321b31[0];
        }
        if (i == c38321b31Arr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                C35376Qc1.m88352h(inputStream);
                String m88354f = C35376Qc1.m88354f(inputStream, C35376Qc1.m88352h(inputStream));
                long m88351i = C35376Qc1.m88351i(inputStream);
                int m88352h = C35376Qc1.m88352h(inputStream);
                C38321b31 m112853i = m112853i(c38321b31Arr, m88354f);
                if (m112853i != null) {
                    m112853i.f56830d = m88351i;
                    int[] m112849m = m112849m(inputStream, m88352h);
                    if (Arrays.equals(bArr, F74.f8772e)) {
                        m112853i.f56831e = m88352h;
                        m112853i.f56834h = m112849m;
                    }
                } else {
                    throw C35376Qc1.m88357c("Missing profile key: " + m88354f);
                }
            }
            return c38321b31Arr;
        }
        throw C35376Qc1.m88357c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    public static void m112840v(InputStream inputStream, C38321b31 c38321b31) throws IOException {
        BitSet valueOf = BitSet.valueOf(C35376Qc1.m88356d(inputStream, C35376Qc1.m88359a(c38321b31.f56833g * 2)));
        int i = 0;
        while (true) {
            int i2 = c38321b31.f56833g;
            if (i < i2) {
                int m112848n = m112848n(valueOf, i, i2);
                if (m112848n != 0) {
                    Integer num = c38321b31.f56835i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    c38321b31.f56835i.put(Integer.valueOf(i), Integer.valueOf(m112848n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public static C38321b31[] m112839w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, F74.f8769b)) {
            int m88350j = C35376Qc1.m88350j(inputStream);
            byte[] m88355e = C35376Qc1.m88355e(inputStream, (int) C35376Qc1.m88351i(inputStream), (int) C35376Qc1.m88351i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m88355e);
                try {
                    C38321b31[] m112838x = m112838x(byteArrayInputStream, str, m88350j);
                    byteArrayInputStream.close();
                    return m112838x;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw C35376Qc1.m88357c("Content found after the end of file");
        }
        throw C35376Qc1.m88357c("Unsupported version");
    }

    /* renamed from: x */
    public static C38321b31[] m112838x(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new C38321b31[0];
        }
        C38321b31[] c38321b31Arr = new C38321b31[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m88352h = C35376Qc1.m88352h(inputStream);
            int m88352h2 = C35376Qc1.m88352h(inputStream);
            c38321b31Arr[i2] = new C38321b31(str, C35376Qc1.m88354f(inputStream, m88352h), C35376Qc1.m88351i(inputStream), 0L, m88352h2, (int) C35376Qc1.m88351i(inputStream), (int) C35376Qc1.m88351i(inputStream), new int[m88352h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C38321b31 c38321b31 = c38321b31Arr[i3];
            m112846p(inputStream, c38321b31);
            c38321b31.f56834h = m112849m(inputStream, c38321b31.f56831e);
            m112840v(inputStream, c38321b31);
        }
        return c38321b31Arr;
    }

    /* renamed from: y */
    public static int m112837y(int i) {
        return ((i + 8) - 1) & (-8);
    }

    /* renamed from: z */
    public static void m112836z(byte[] bArr, int i, int i2, C38321b31 c38321b31) {
        int m112850l = m112850l(i, i2, c38321b31.f56833g);
        int i3 = m112850l / 8;
        bArr[i3] = (byte) ((1 << (m112850l % 8)) | bArr[i3]);
    }
}
