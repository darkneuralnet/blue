package p000;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.p053io.encoding.Base64;
/* renamed from: Hy */
/* loaded from: classes6.dex */
public final class C3291Hy {
    /* renamed from: a */
    public static int m103162a(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }

    /* renamed from: b */
    public static int m103161b(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (z) {
            int i2 = (i / 3) << 2;
            int i3 = i % 3;
            if (i3 != 0) {
                return i2 + i3 + 1;
            }
            return i2;
        }
        return (((i - 1) / 3) + 1) << 2;
    }

    /* renamed from: c */
    public static byte[] m103160c(String str) {
        if (str != null && !str.isEmpty()) {
            byte[] bytes = str.getBytes(C48618sO5.f108725a);
            int length = bytes.length;
            byte[] bArr = new byte[m103162a((length * 6) >> 3)];
            int i = 0;
            int i2 = 0;
            while (i < bytes.length) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < 4 && i < length) {
                    int i5 = i + 1;
                    int m103159d = m103159d(bytes[i]);
                    if (m103159d >= 0) {
                        i4 |= m103159d << (18 - (i3 * 6));
                        i3++;
                    }
                    i = i5;
                }
                if (i3 >= 2) {
                    int i6 = i2 + 1;
                    bArr[i2] = (byte) (i4 >> 16);
                    if (i3 >= 3) {
                        i2 = i6 + 1;
                        bArr[i6] = (byte) (i4 >> 8);
                        if (i3 >= 4) {
                            bArr[i2] = (byte) i4;
                            i2++;
                        }
                    } else {
                        i2 = i6;
                    }
                }
            }
            return Arrays.copyOf(bArr, i2);
        }
        return new byte[0];
    }

    /* renamed from: d */
    public static int m103159d(byte b) {
        int m103154i = m103154i(b, 64) & m103153j(b, 91);
        int m103154i2 = m103154i(b, 96) & m103153j(b, 123);
        int m103154i3 = m103154i(b, 47) & m103153j(b, 58);
        int m103155h = m103155h(b, 45) | m103155h(b, 43);
        int m103155h2 = m103155h(b, 47) | m103155h(b, 95);
        return m103152k(m103154i3, (b - 48) + 52, 0) | m103152k(m103154i, b + ByteSourceJsonBootstrapper.UTF8_BOM_3 + 0, 0) | m103152k(m103154i2, (b - 97) + 26, 0) | m103152k(m103155h, 62, 0) | m103152k(m103155h2, 63, 0) | m103152k(m103154i | m103154i2 | m103154i3 | m103155h | m103155h2, 0, -1);
    }

    /* renamed from: e */
    public static byte m103158e(int i) {
        int m103153j = m103153j(i, 26);
        int m103154i = m103154i(i, 25) & m103153j(i, 52);
        int m103154i2 = m103154i(i, 51) & m103153j(i, 62);
        int m103155h = m103155h(i, 62);
        int m103155h2 = m103155h(i, 63);
        return (byte) (m103152k(m103154i2, (i - 52) + 48, 0) | m103152k(m103153j, i + 0 + 65, 0) | m103152k(m103154i, (i - 26) + 97, 0) | m103152k(m103155h, 43, 0) | m103152k(m103155h2, 47, 0));
    }

    /* renamed from: f */
    public static byte m103157f(int i) {
        int m103153j = m103153j(i, 26);
        int m103154i = m103154i(i, 25) & m103153j(i, 52);
        int m103154i2 = m103154i(i, 51) & m103153j(i, 62);
        int m103155h = m103155h(i, 62);
        int m103155h2 = m103155h(i, 63);
        return (byte) (m103152k(m103154i2, (i - 52) + 48, 0) | m103152k(m103153j, i + 0 + 65, 0) | m103152k(m103154i, (i - 26) + 97, 0) | m103152k(m103155h, 45, 0) | m103152k(m103155h2, 95, 0));
    }

    /* renamed from: g */
    public static String m103156g(byte[] bArr, boolean z) {
        int i;
        byte b;
        int i2 = 0;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i == 0) {
            return "";
        }
        int i3 = (i / 3) * 3;
        int m103161b = m103161b(i, z);
        byte[] bArr2 = new byte[m103161b];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i4] & UByte.MAX_VALUE) << 16) | ((bArr[i6] & UByte.MAX_VALUE) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & UByte.MAX_VALUE);
            if (z) {
                int i11 = i5 + 1;
                bArr2[i5] = m103157f((i10 >>> 18) & 63);
                int i12 = i11 + 1;
                bArr2[i11] = m103157f((i10 >>> 12) & 63);
                int i13 = i12 + 1;
                bArr2[i12] = m103157f((i10 >>> 6) & 63);
                i5 = i13 + 1;
                bArr2[i13] = m103157f(i10 & 63);
            } else {
                int i14 = i5 + 1;
                bArr2[i5] = m103158e((i10 >>> 18) & 63);
                int i15 = i14 + 1;
                bArr2[i14] = m103158e((i10 >>> 12) & 63);
                int i16 = i15 + 1;
                bArr2[i15] = m103158e((i10 >>> 6) & 63);
                i5 = i16 + 1;
                bArr2[i16] = m103158e(i10 & 63);
            }
            i4 = i9;
        }
        int i17 = i - i3;
        if (i17 > 0) {
            int i18 = (bArr[i3] & UByte.MAX_VALUE) << 10;
            if (i17 == 2) {
                i2 = (bArr[i - 1] & UByte.MAX_VALUE) << 2;
            }
            int i19 = i18 | i2;
            if (z) {
                if (i17 == 2) {
                    bArr2[m103161b - 3] = m103157f(i19 >> 12);
                    bArr2[m103161b - 2] = m103157f((i19 >>> 6) & 63);
                    bArr2[m103161b - 1] = m103157f(i19 & 63);
                } else {
                    bArr2[m103161b - 2] = m103157f(i19 >> 12);
                    bArr2[m103161b - 1] = m103157f((i19 >>> 6) & 63);
                }
            } else {
                bArr2[m103161b - 4] = m103158e(i19 >> 12);
                bArr2[m103161b - 3] = m103158e((i19 >>> 6) & 63);
                int i20 = m103161b - 2;
                if (i17 == 2) {
                    b = m103158e(i19 & 63);
                } else {
                    b = 61;
                }
                bArr2[i20] = b;
                bArr2[m103161b - 1] = Base64.padSymbol;
            }
        }
        return new String(bArr2, C48618sO5.f108725a);
    }

    /* renamed from: h */
    public static int m103155h(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    /* renamed from: i */
    public static int m103154i(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    /* renamed from: j */
    public static int m103153j(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    /* renamed from: k */
    public static int m103152k(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }
}
