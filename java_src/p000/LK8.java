package p000;

import com.google.android.gms.internal.measurement.zzll;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: LK8 */
/* loaded from: classes5.dex */
public final class LK8 {
    /* renamed from: a */
    public static int m97070a(byte[] bArr, int i, C52735zK8 c52735zK8) throws zzll {
        int m97061j = m97061j(bArr, i, c52735zK8);
        int i2 = c52735zK8.f121110a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m97061j) {
                if (i2 == 0) {
                    c52735zK8.f121112c = AbstractC40913fO8.f80055c;
                    return m97061j;
                }
                c52735zK8.f121112c = AbstractC40913fO8.m41429v(bArr, m97061j, i2);
                return m97061j + i2;
            }
            throw zzll.m51339f();
        }
        throw zzll.m51341d();
    }

    /* renamed from: b */
    public static int m97069b(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* renamed from: c */
    public static int m97068c(F39 f39, byte[] bArr, int i, int i2, int i3, C52735zK8 c52735zK8) throws IOException {
        Object zze = f39.zze();
        int m97057n = m97057n(zze, f39, bArr, i, i2, i3, c52735zK8);
        f39.zzf(zze);
        c52735zK8.f121112c = zze;
        return m97057n;
    }

    /* renamed from: d */
    public static int m97067d(F39 f39, byte[] bArr, int i, int i2, C52735zK8 c52735zK8) throws IOException {
        Object zze = f39.zze();
        int m97056o = m97056o(zze, f39, bArr, i, i2, c52735zK8);
        f39.zzf(zze);
        c52735zK8.f121112c = zze;
        return m97056o;
    }

    /* renamed from: e */
    public static int m97066e(F39 f39, int i, byte[] bArr, int i2, int i3, NV8 nv8, C52735zK8 c52735zK8) throws IOException {
        int m97067d = m97067d(f39, bArr, i2, i3, c52735zK8);
        nv8.add(c52735zK8.f121112c);
        while (m97067d < i3) {
            int m97061j = m97061j(bArr, m97067d, c52735zK8);
            if (i != c52735zK8.f121110a) {
                break;
            }
            m97067d = m97067d(f39, bArr, m97061j, i3, c52735zK8);
            nv8.add(c52735zK8.f121112c);
        }
        return m97067d;
    }

    /* renamed from: f */
    public static int m97065f(byte[] bArr, int i, NV8 nv8, C52735zK8 c52735zK8) throws IOException {
        AU8 au8 = (AU8) nv8;
        int m97061j = m97061j(bArr, i, c52735zK8);
        int i2 = c52735zK8.f121110a + m97061j;
        while (m97061j < i2) {
            m97061j = m97061j(bArr, m97061j, c52735zK8);
            au8.zzh(c52735zK8.f121110a);
        }
        if (m97061j == i2) {
            return m97061j;
        }
        throw zzll.m51339f();
    }

    /* renamed from: g */
    public static int m97064g(byte[] bArr, int i, C52735zK8 c52735zK8) throws zzll {
        int m97061j = m97061j(bArr, i, c52735zK8);
        int i2 = c52735zK8.f121110a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c52735zK8.f121112c = "";
                return m97061j;
            }
            c52735zK8.f121112c = new String(bArr, m97061j, i2, XV8.f43342b);
            return m97061j + i2;
        }
        throw zzll.m51341d();
    }

    /* renamed from: h */
    public static int m97063h(byte[] bArr, int i, C52735zK8 c52735zK8) throws zzll {
        int m97061j = m97061j(bArr, i, c52735zK8);
        int i2 = c52735zK8.f121110a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c52735zK8.f121112c = "";
                return m97061j;
            }
            C89 c89 = Z89.f47898a;
            int length = bArr.length;
            if ((((length - m97061j) - i2) | m97061j | i2) >= 0) {
                int i3 = m97061j + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (m97061j < i3) {
                    byte b = bArr[m97061j];
                    if (!C49662u89.m10792d(b)) {
                        break;
                    }
                    m97061j++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (m97061j < i3) {
                    int i5 = m97061j + 1;
                    byte b2 = bArr[m97061j];
                    if (C49662u89.m10792d(b2)) {
                        int i6 = i4 + 1;
                        cArr[i4] = (char) b2;
                        m97061j = i5;
                        while (true) {
                            i4 = i6;
                            if (m97061j < i3) {
                                byte b3 = bArr[m97061j];
                                if (C49662u89.m10792d(b3)) {
                                    m97061j++;
                                    i6 = i4 + 1;
                                    cArr[i4] = (char) b3;
                                }
                            }
                        }
                    } else if (b2 < -32) {
                        if (i5 < i3) {
                            C49662u89.m10793c(b2, bArr[i5], cArr, i4);
                            m97061j = i5 + 1;
                            i4++;
                        } else {
                            throw zzll.m51342c();
                        }
                    } else if (b2 < -16) {
                        if (i5 < i3 - 1) {
                            int i7 = i5 + 1;
                            C49662u89.m10794b(b2, bArr[i5], bArr[i7], cArr, i4);
                            m97061j = i7 + 1;
                            i4++;
                        } else {
                            throw zzll.m51342c();
                        }
                    } else if (i5 < i3 - 2) {
                        int i8 = i5 + 1;
                        byte b4 = bArr[i5];
                        int i9 = i8 + 1;
                        C49662u89.m10795a(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        m97061j = i9 + 1;
                    } else {
                        throw zzll.m51342c();
                    }
                }
                c52735zK8.f121112c = new String(cArr, 0, i4);
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m97061j), Integer.valueOf(i2)));
        }
        throw zzll.m51341d();
    }

    /* renamed from: i */
    public static int m97062i(int i, byte[] bArr, int i2, int i3, Y69 y69, C52735zK8 c52735zK8) throws zzll {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                y69.m75680j(i, Integer.valueOf(m97069b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzll.m51343b();
                        }
                        int i5 = (i & (-8)) | 4;
                        Y69 m75684f = Y69.m75684f();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m97061j = m97061j(bArr, i2, c52735zK8);
                            int i7 = c52735zK8.f121110a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m97062i = m97062i(i6, bArr, m97061j, i3, m75684f, c52735zK8);
                                i6 = i7;
                                i2 = m97062i;
                            } else {
                                i2 = m97061j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            y69.m75680j(i, m75684f);
                            return i2;
                        }
                        throw zzll.m51340e();
                    }
                    int m97061j2 = m97061j(bArr, i2, c52735zK8);
                    int i8 = c52735zK8.f121110a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m97061j2) {
                            if (i8 == 0) {
                                y69.m75680j(i, AbstractC40913fO8.f80055c);
                            } else {
                                y69.m75680j(i, AbstractC40913fO8.m41429v(bArr, m97061j2, i8));
                            }
                            return m97061j2 + i8;
                        }
                        throw zzll.m51339f();
                    }
                    throw zzll.m51341d();
                }
                y69.m75680j(i, Long.valueOf(m97055p(bArr, i2)));
                return i2 + 8;
            }
            int m97058m = m97058m(bArr, i2, c52735zK8);
            y69.m75680j(i, Long.valueOf(c52735zK8.f121111b));
            return m97058m;
        }
        throw zzll.m51343b();
    }

    /* renamed from: j */
    public static int m97061j(byte[] bArr, int i, C52735zK8 c52735zK8) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c52735zK8.f121110a = b;
            return i2;
        }
        return m97060k(b, bArr, i2, c52735zK8);
    }

    /* renamed from: k */
    public static int m97060k(int i, byte[] bArr, int i2, C52735zK8 c52735zK8) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c52735zK8.f121110a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c52735zK8.f121110a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c52735zK8.f121110a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c52735zK8.f121110a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c52735zK8.f121110a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m97059l(int i, byte[] bArr, int i2, int i3, NV8 nv8, C52735zK8 c52735zK8) {
        AU8 au8 = (AU8) nv8;
        int m97061j = m97061j(bArr, i2, c52735zK8);
        au8.zzh(c52735zK8.f121110a);
        while (m97061j < i3) {
            int m97061j2 = m97061j(bArr, m97061j, c52735zK8);
            if (i != c52735zK8.f121110a) {
                break;
            }
            m97061j = m97061j(bArr, m97061j2, c52735zK8);
            au8.zzh(c52735zK8.f121110a);
        }
        return m97061j;
    }

    /* renamed from: m */
    public static int m97058m(byte[] bArr, int i, C52735zK8 c52735zK8) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c52735zK8.f121111b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & ByteCompanionObject.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        c52735zK8.f121111b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m97057n(Object obj, F39 f39, byte[] bArr, int i, int i2, int i3, C52735zK8 c52735zK8) throws IOException {
        int m82095B = ((U19) f39).m82095B(obj, bArr, i, i2, i3, c52735zK8);
        c52735zK8.f121112c = obj;
        return m82095B;
    }

    /* renamed from: o */
    public static int m97056o(Object obj, F39 f39, byte[] bArr, int i, int i2, C52735zK8 c52735zK8) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m97060k(i4, bArr, i3, c52735zK8);
            i4 = c52735zK8.f121110a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            f39.mo43315e(obj, bArr, i5, i6, c52735zK8);
            c52735zK8.f121112c = obj;
            return i6;
        }
        throw zzll.m51339f();
    }

    /* renamed from: p */
    public static long m97055p(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
