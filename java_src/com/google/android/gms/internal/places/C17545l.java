package com.google.android.gms.internal.places;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.android.gms.internal.places.l */
/* loaded from: classes5.dex */
public final class C17545l {
    /* renamed from: a */
    public static int m51138a(int i, byte[] bArr, int i2, int i3, BI7<?> bi7, C49433tl9 c49433tl9) {
        C38451bG7 c38451bG7 = (C38451bG7) bi7;
        int m51129j = m51129j(bArr, i2, c49433tl9);
        c38451bG7.m64735b(c49433tl9.f110994a);
        while (m51129j < i3) {
            int m51129j2 = m51129j(bArr, m51129j, c49433tl9);
            if (i != c49433tl9.f110994a) {
                break;
            }
            m51129j = m51129j(bArr, m51129j2, c49433tl9);
            c38451bG7.m64735b(c49433tl9.f110994a);
        }
        return m51129j;
    }

    /* renamed from: b */
    public static int m51137b(int i, byte[] bArr, int i2, int i3, C49611u38 c49611u38, C49433tl9 c49433tl9) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c49611u38.m10926f(i, Integer.valueOf(m51131h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzbk.m51036c();
                        }
                        C49611u38 m10922j = C49611u38.m10922j();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m51129j = m51129j(bArr, i2, c49433tl9);
                            int i7 = c49433tl9.f110994a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m51137b = m51137b(i6, bArr, m51129j, i3, m10922j, c49433tl9);
                                i6 = i7;
                                i2 = m51137b;
                            } else {
                                i2 = m51129j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c49611u38.m10926f(i, m10922j);
                            return i2;
                        }
                        throw zzbk.m51034e();
                    }
                    int m51129j2 = m51129j(bArr, i2, c49433tl9);
                    int i8 = c49433tl9.f110994a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m51129j2) {
                            if (i8 == 0) {
                                c49611u38.m10926f(i, AbstractC43604jv9.f93538c);
                            } else {
                                c49611u38.m10926f(i, AbstractC43604jv9.m29743x(bArr, m51129j2, i8));
                            }
                            return m51129j2 + i8;
                        }
                        throw zzbk.m51038a();
                    }
                    throw zzbk.m51037b();
                }
                c49611u38.m10926f(i, Long.valueOf(m51127l(bArr, i2)));
                return i2 + 8;
            }
            int m51128k = m51128k(bArr, i2, c49433tl9);
            c49611u38.m10926f(i, Long.valueOf(c49433tl9.f110995b));
            return m51128k;
        }
        throw zzbk.m51036c();
    }

    /* renamed from: c */
    public static int m51136c(int i, byte[] bArr, int i2, int i3, C49433tl9 c49433tl9) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzbk.m51036c();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m51129j(bArr, i2, c49433tl9);
                            i6 = c49433tl9.f110994a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m51136c(i6, bArr, i2, i3, c49433tl9);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzbk.m51034e();
                    }
                    return m51129j(bArr, i2, c49433tl9) + c49433tl9.f110994a;
                }
                return i2 + 8;
            }
            return m51128k(bArr, i2, c49433tl9);
        }
        throw zzbk.m51036c();
    }

    /* renamed from: d */
    public static int m51135d(int i, byte[] bArr, int i2, C49433tl9 c49433tl9) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c49433tl9.f110994a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c49433tl9.f110994a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c49433tl9.f110994a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c49433tl9.f110994a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c49433tl9.f110994a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m51134e(LY7<?> ly7, int i, byte[] bArr, int i2, int i3, BI7<?> bi7, C49433tl9 c49433tl9) throws IOException {
        int m51132g = m51132g(ly7, bArr, i2, i3, c49433tl9);
        bi7.add(c49433tl9.f110996c);
        while (m51132g < i3) {
            int m51129j = m51129j(bArr, m51132g, c49433tl9);
            if (i != c49433tl9.f110994a) {
                break;
            }
            m51132g = m51132g(ly7, bArr, m51129j, i3, c49433tl9);
            bi7.add(c49433tl9.f110996c);
        }
        return m51132g;
    }

    /* renamed from: f */
    public static int m51133f(LY7 ly7, byte[] bArr, int i, int i2, int i3, C49433tl9 c49433tl9) throws IOException {
        C17537e c17537e = (C17537e) ly7;
        Object mo51169d = c17537e.mo51169d();
        int m51181r = c17537e.m51181r(mo51169d, bArr, i, i2, i3, c49433tl9);
        c17537e.mo51172a(mo51169d);
        c49433tl9.f110996c = mo51169d;
        return m51181r;
    }

    /* renamed from: g */
    public static int m51132g(LY7 ly7, byte[] bArr, int i, int i2, C49433tl9 c49433tl9) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m51135d(i4, bArr, i3, c49433tl9);
            i4 = c49433tl9.f110994a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo51169d = ly7.mo51169d();
            int i6 = i4 + i5;
            ly7.mo51170c(mo51169d, bArr, i5, i6, c49433tl9);
            ly7.mo51172a(mo51169d);
            c49433tl9.f110996c = mo51169d;
            return i6;
        }
        throw zzbk.m51038a();
    }

    /* renamed from: h */
    public static int m51131h(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: i */
    public static int m51130i(byte[] bArr, int i, BI7<?> bi7, C49433tl9 c49433tl9) throws IOException {
        C38451bG7 c38451bG7 = (C38451bG7) bi7;
        int m51129j = m51129j(bArr, i, c49433tl9);
        int i2 = c49433tl9.f110994a + m51129j;
        while (m51129j < i2) {
            m51129j = m51129j(bArr, m51129j, c49433tl9);
            c38451bG7.m64735b(c49433tl9.f110994a);
        }
        if (m51129j == i2) {
            return m51129j;
        }
        throw zzbk.m51038a();
    }

    /* renamed from: j */
    public static int m51129j(byte[] bArr, int i, C49433tl9 c49433tl9) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c49433tl9.f110994a = b;
            return i2;
        }
        return m51135d(b, bArr, i2, c49433tl9);
    }

    /* renamed from: k */
    public static int m51128k(byte[] bArr, int i, C49433tl9 c49433tl9) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c49433tl9.f110995b = j;
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
        c49433tl9.f110995b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m51127l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public static double m51126m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m51127l(bArr, i));
    }

    /* renamed from: n */
    public static int m51125n(byte[] bArr, int i, C49433tl9 c49433tl9) throws zzbk {
        int m51129j = m51129j(bArr, i, c49433tl9);
        int i2 = c49433tl9.f110994a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c49433tl9.f110996c = "";
                return m51129j;
            }
            c49433tl9.f110996c = new String(bArr, m51129j, i2, C44389lF7.f95796a);
            return m51129j + i2;
        }
        throw zzbk.m51037b();
    }

    /* renamed from: o */
    public static float m51124o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m51131h(bArr, i));
    }

    /* renamed from: p */
    public static int m51123p(byte[] bArr, int i, C49433tl9 c49433tl9) throws zzbk {
        int m51129j = m51129j(bArr, i, c49433tl9);
        int i2 = c49433tl9.f110994a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c49433tl9.f110996c = "";
                return m51129j;
            }
            c49433tl9.f110996c = U68.m81954j(bArr, m51129j, i2);
            return m51129j + i2;
        }
        throw zzbk.m51037b();
    }

    /* renamed from: q */
    public static int m51122q(byte[] bArr, int i, C49433tl9 c49433tl9) throws zzbk {
        int m51129j = m51129j(bArr, i, c49433tl9);
        int i2 = c49433tl9.f110994a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m51129j) {
                if (i2 == 0) {
                    c49433tl9.f110996c = AbstractC43604jv9.f93538c;
                    return m51129j;
                }
                c49433tl9.f110996c = AbstractC43604jv9.m29743x(bArr, m51129j, i2);
                return m51129j + i2;
            }
            throw zzbk.m51038a();
        }
        throw zzbk.m51037b();
    }
}
