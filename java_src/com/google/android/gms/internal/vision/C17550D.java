package com.google.android.gms.internal.vision;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.android.gms.internal.vision.D */
/* loaded from: classes6.dex */
public final class C17550D {
    /* renamed from: a */
    public static int m51015a(int i, byte[] bArr, int i2, int i3, C41844gx8 c41844gx8) throws zzjk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzjk.m50761d();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m51007i(bArr, i2, c41844gx8);
                            i6 = c41844gx8.f84540a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m51015a(i6, bArr, i2, i3, c41844gx8);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzjk.m50758g();
                    }
                    return m51007i(bArr, i2, c41844gx8) + c41844gx8.f84540a;
                }
                return i2 + 8;
            }
            return m51005k(bArr, i2, c41844gx8);
        }
        throw zzjk.m50761d();
    }

    /* renamed from: b */
    public static int m51014b(int i, byte[] bArr, int i2, int i3, RJ8<?> rj8, C41844gx8 c41844gx8) {
        C37877aI8 c37877aI8 = (C37877aI8) rj8;
        int m51007i = m51007i(bArr, i2, c41844gx8);
        c37877aI8.m71672c(c41844gx8.f84540a);
        while (m51007i < i3) {
            int m51007i2 = m51007i(bArr, m51007i, c41844gx8);
            if (i != c41844gx8.f84540a) {
                break;
            }
            m51007i = m51007i(bArr, m51007i2, c41844gx8);
            c37877aI8.m71672c(c41844gx8.f84540a);
        }
        return m51007i;
    }

    /* renamed from: c */
    public static int m51013c(int i, byte[] bArr, int i2, int i3, HY8 hy8, C41844gx8 c41844gx8) throws zzjk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                hy8.m103756c(i, Integer.valueOf(m51008h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzjk.m50761d();
                        }
                        HY8 m103752g = HY8.m103752g();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m51007i = m51007i(bArr, i2, c41844gx8);
                            int i7 = c41844gx8.f84540a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m51013c = m51013c(i6, bArr, m51007i, i3, m103752g, c41844gx8);
                                i6 = i7;
                                i2 = m51013c;
                            } else {
                                i2 = m51007i;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            hy8.m103756c(i, m103752g);
                            return i2;
                        }
                        throw zzjk.m50758g();
                    }
                    int m51007i2 = m51007i(bArr, i2, c41844gx8);
                    int i8 = c41844gx8.f84540a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m51007i2) {
                            if (i8 == 0) {
                                hy8.m103756c(i, AbstractC53119zy8.f122544c);
                            } else {
                                hy8.m103756c(i, AbstractC53119zy8.m37s(bArr, m51007i2, i8));
                            }
                            return m51007i2 + i8;
                        }
                        throw zzjk.m50764a();
                    }
                    throw zzjk.m50763b();
                }
                hy8.m103756c(i, Long.valueOf(m51004l(bArr, i2)));
                return i2 + 8;
            }
            int m51005k = m51005k(bArr, i2, c41844gx8);
            hy8.m103756c(i, Long.valueOf(c41844gx8.f84541b));
            return m51005k;
        }
        throw zzjk.m50761d();
    }

    /* renamed from: d */
    public static int m51012d(int i, byte[] bArr, int i2, C41844gx8 c41844gx8) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c41844gx8.f84540a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c41844gx8.f84540a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c41844gx8.f84540a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c41844gx8.f84540a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c41844gx8.f84540a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    public static int m51011e(InterfaceC52825zU8<?> interfaceC52825zU8, int i, byte[] bArr, int i2, int i3, RJ8<?> rj8, C41844gx8 c41844gx8) throws IOException {
        int m51009g = m51009g(interfaceC52825zU8, bArr, i2, i3, c41844gx8);
        rj8.add(c41844gx8.f84542c);
        while (m51009g < i3) {
            int m51007i = m51007i(bArr, m51009g, c41844gx8);
            if (i != c41844gx8.f84540a) {
                break;
            }
            m51009g = m51009g(interfaceC52825zU8, bArr, m51007i, i3, c41844gx8);
            rj8.add(c41844gx8.f84542c);
        }
        return m51009g;
    }

    /* renamed from: f */
    public static int m51010f(InterfaceC52825zU8 interfaceC52825zU8, byte[] bArr, int i, int i2, int i3, C41844gx8 c41844gx8) throws IOException {
        C17561H c17561h = (C17561H) interfaceC52825zU8;
        Object zza = c17561h.zza();
        int m50943k = c17561h.m50943k(zza, bArr, i, i2, i3, c41844gx8);
        c17561h.zzc(zza);
        c41844gx8.f84542c = zza;
        return m50943k;
    }

    /* renamed from: g */
    public static int m51009g(InterfaceC52825zU8 interfaceC52825zU8, byte[] bArr, int i, int i2, C41844gx8 c41844gx8) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m51012d(i4, bArr, i3, c41844gx8);
            i4 = c41844gx8.f84540a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zza = interfaceC52825zU8.zza();
            int i6 = i4 + i5;
            interfaceC52825zU8.mo1310e(zza, bArr, i5, i6, c41844gx8);
            interfaceC52825zU8.zzc(zza);
            c41844gx8.f84542c = zza;
            return i6;
        }
        throw zzjk.m50764a();
    }

    /* renamed from: h */
    public static int m51008h(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: i */
    public static int m51007i(byte[] bArr, int i, C41844gx8 c41844gx8) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c41844gx8.f84540a = b;
            return i2;
        }
        return m51012d(b, bArr, i2, c41844gx8);
    }

    /* renamed from: j */
    public static int m51006j(byte[] bArr, int i, RJ8<?> rj8, C41844gx8 c41844gx8) throws IOException {
        C37877aI8 c37877aI8 = (C37877aI8) rj8;
        int m51007i = m51007i(bArr, i, c41844gx8);
        int i2 = c41844gx8.f84540a + m51007i;
        while (m51007i < i2) {
            m51007i = m51007i(bArr, m51007i, c41844gx8);
            c37877aI8.m71672c(c41844gx8.f84540a);
        }
        if (m51007i == i2) {
            return m51007i;
        }
        throw zzjk.m50764a();
    }

    /* renamed from: k */
    public static int m51005k(byte[] bArr, int i, C41844gx8 c41844gx8) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c41844gx8.f84541b = j;
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
        c41844gx8.f84541b = j2;
        return i3;
    }

    /* renamed from: l */
    public static long m51004l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: m */
    public static double m51003m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m51004l(bArr, i));
    }

    /* renamed from: n */
    public static int m51002n(byte[] bArr, int i, C41844gx8 c41844gx8) throws zzjk {
        int m51007i = m51007i(bArr, i, c41844gx8);
        int i2 = c41844gx8.f84540a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c41844gx8.f84542c = "";
                return m51007i;
            }
            c41844gx8.f84542c = new String(bArr, m51007i, i2, C52124yI8.f119325a);
            return m51007i + i2;
        }
        throw zzjk.m50763b();
    }

    /* renamed from: o */
    public static float m51001o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m51008h(bArr, i));
    }

    /* renamed from: p */
    public static int m51000p(byte[] bArr, int i, C41844gx8 c41844gx8) throws zzjk {
        int m51007i = m51007i(bArr, i, c41844gx8);
        int i2 = c41844gx8.f84540a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c41844gx8.f84542c = "";
                return m51007i;
            }
            c41844gx8.f84542c = C49582u09.m11093k(bArr, m51007i, i2);
            return m51007i + i2;
        }
        throw zzjk.m50763b();
    }

    /* renamed from: q */
    public static int m50999q(byte[] bArr, int i, C41844gx8 c41844gx8) throws zzjk {
        int m51007i = m51007i(bArr, i, c41844gx8);
        int i2 = c41844gx8.f84540a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m51007i) {
                if (i2 == 0) {
                    c41844gx8.f84542c = AbstractC53119zy8.f122544c;
                    return m51007i;
                }
                c41844gx8.f84542c = AbstractC53119zy8.m37s(bArr, m51007i, i2);
                return m51007i + i2;
            }
            throw zzjk.m50764a();
        }
        throw zzjk.m50763b();
    }
}
