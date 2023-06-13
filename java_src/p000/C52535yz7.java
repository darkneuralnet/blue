package p000;

import com.google.android.gms.internal.clearcut.zzco;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: yz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52535yz7 {
    /* renamed from: a */
    public static int m2141a(int i, byte[] bArr, int i2, int i3, C40786fA7 c40786fA7) throws zzco {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzco.m51356b();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m2137e(bArr, i2, c40786fA7);
                            i6 = c40786fA7.f79635a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m2141a(i6, bArr, i2, i3, c40786fA7);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzco.m51354d();
                        }
                        return i2;
                    }
                    return m2137e(bArr, i2, c40786fA7) + c40786fA7.f79635a;
                }
                return i2 + 8;
            }
            return m2135g(bArr, i2, c40786fA7);
        }
        throw zzco.m51356b();
    }

    /* renamed from: b */
    public static int m2140b(int i, byte[] bArr, int i2, int i3, InterfaceC47489qU7<?> interfaceC47489qU7, C40786fA7 c40786fA7) {
        LS7 ls7 = (LS7) interfaceC47489qU7;
        int m2137e = m2137e(bArr, i2, c40786fA7);
        while (true) {
            ls7.m96917b(c40786fA7.f79635a);
            if (m2137e >= i3) {
                break;
            }
            int m2137e2 = m2137e(bArr, m2137e, c40786fA7);
            if (i != c40786fA7.f79635a) {
                break;
            }
            m2137e = m2137e(bArr, m2137e2, c40786fA7);
        }
        return m2137e;
    }

    /* renamed from: c */
    public static int m2139c(int i, byte[] bArr, int i2, int i3, C35626Rd8 c35626Rd8, C40786fA7 c40786fA7) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m2135g = m2135g(bArr, i2, c40786fA7);
                c35626Rd8.m86525e(i, Long.valueOf(c40786fA7.f79636b));
                return m2135g;
            } else if (i4 == 1) {
                c35626Rd8.m86525e(i, Long.valueOf(m2131k(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m2137e = m2137e(bArr, i2, c40786fA7);
                int i5 = c40786fA7.f79635a;
                c35626Rd8.m86525e(i, i5 == 0 ? TD7.f34940c : TD7.m84181j(bArr, m2137e, i5));
                return m2137e + i5;
            } else if (i4 != 3) {
                if (i4 == 5) {
                    c35626Rd8.m86525e(i, Integer.valueOf(m2134h(bArr, i2)));
                    return i2 + 4;
                }
                throw zzco.m51356b();
            } else {
                C35626Rd8 m86521i = C35626Rd8.m86521i();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m2137e2 = m2137e(bArr, i2, c40786fA7);
                    int i8 = c40786fA7.f79635a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = m2137e2;
                        break;
                    }
                    int m2139c = m2139c(i7, bArr, m2137e2, i3, m86521i, c40786fA7);
                    i7 = i8;
                    i2 = m2139c;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzco.m51354d();
                }
                c35626Rd8.m86525e(i, m86521i);
                return i2;
            }
        }
        throw zzco.m51356b();
    }

    /* renamed from: d */
    public static int m2138d(int i, byte[] bArr, int i2, C40786fA7 c40786fA7) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                c40786fA7.f79635a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            c40786fA7.f79635a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        c40786fA7.f79635a = i5 | i4;
        return i6;
    }

    /* renamed from: e */
    public static int m2137e(byte[] bArr, int i, C40786fA7 c40786fA7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c40786fA7.f79635a = b;
            return i2;
        }
        return m2138d(b, bArr, i2, c40786fA7);
    }

    /* renamed from: f */
    public static int m2136f(byte[] bArr, int i, InterfaceC47489qU7<?> interfaceC47489qU7, C40786fA7 c40786fA7) throws IOException {
        LS7 ls7 = (LS7) interfaceC47489qU7;
        int m2137e = m2137e(bArr, i, c40786fA7);
        int i2 = c40786fA7.f79635a + m2137e;
        while (m2137e < i2) {
            m2137e = m2137e(bArr, m2137e, c40786fA7);
            ls7.m96917b(c40786fA7.f79635a);
        }
        if (m2137e == i2) {
            return m2137e;
        }
        throw zzco.m51357a();
    }

    /* renamed from: g */
    public static int m2135g(byte[] bArr, int i, C40786fA7 c40786fA7) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c40786fA7.f79636b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & ByteCompanionObject.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c40786fA7.f79636b = j2;
        return i3;
    }

    /* renamed from: h */
    public static int m2134h(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: i */
    public static int m2133i(byte[] bArr, int i, C40786fA7 c40786fA7) {
        int m2137e = m2137e(bArr, i, c40786fA7);
        int i2 = c40786fA7.f79635a;
        if (i2 == 0) {
            c40786fA7.f79637c = "";
            return m2137e;
        }
        c40786fA7.f79637c = new String(bArr, m2137e, i2, C37975aT7.f50512a);
        return m2137e + i2;
    }

    /* renamed from: j */
    public static int m2132j(byte[] bArr, int i, C40786fA7 c40786fA7) throws IOException {
        int m2137e = m2137e(bArr, i, c40786fA7);
        int i2 = c40786fA7.f79635a;
        if (i2 == 0) {
            c40786fA7.f79637c = "";
            return m2137e;
        }
        int i3 = m2137e + i2;
        if (C31909Bg8.m113677i(bArr, m2137e, i3)) {
            c40786fA7.f79637c = new String(bArr, m2137e, i2, C37975aT7.f50512a);
            return i3;
        }
        throw zzco.m51353e();
    }

    /* renamed from: k */
    public static long m2131k(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: l */
    public static double m2130l(byte[] bArr, int i) {
        return Double.longBitsToDouble(m2131k(bArr, i));
    }

    /* renamed from: m */
    public static int m2129m(byte[] bArr, int i, C40786fA7 c40786fA7) {
        int m2137e = m2137e(bArr, i, c40786fA7);
        int i2 = c40786fA7.f79635a;
        if (i2 == 0) {
            c40786fA7.f79637c = TD7.f34940c;
            return m2137e;
        }
        c40786fA7.f79637c = TD7.m84181j(bArr, m2137e, i2);
        return m2137e + i2;
    }

    /* renamed from: n */
    public static float m2128n(byte[] bArr, int i) {
        return Float.intBitsToFloat(m2134h(bArr, i));
    }
}
