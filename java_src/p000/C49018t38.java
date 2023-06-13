package p000;

import com.google.android.gms.internal.auth.zzew;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: t38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49018t38 {
    /* renamed from: a */
    public static int m13183a(byte[] bArr, int i, C39532d38 c39532d38) throws zzew {
        int m13174j = m13174j(bArr, i, c39532d38);
        int i2 = c39532d38.f76082a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m13174j) {
                if (i2 == 0) {
                    c39532d38.f76084c = AbstractC50836w78.f115390c;
                    return m13174j;
                }
                c39532d38.f76084c = AbstractC50836w78.m7377u(bArr, m13174j, i2);
                return m13174j + i2;
            }
            throw zzew.m51574f();
        }
        throw zzew.m51577c();
    }

    /* renamed from: b */
    public static int m13182b(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: c */
    public static int m13181c(InterfaceC45895nn8 interfaceC45895nn8, byte[] bArr, int i, int i2, int i3, C39532d38 c39532d38) throws IOException {
        C52386yk8 c52386yk8 = (C52386yk8) interfaceC45895nn8;
        Object zzd = c52386yk8.zzd();
        int m2680p = c52386yk8.m2680p(zzd, bArr, i, i2, i3, c39532d38);
        c52386yk8.mo2694b(zzd);
        c39532d38.f76084c = zzd;
        return m2680p;
    }

    /* renamed from: d */
    public static int m13180d(InterfaceC45895nn8 interfaceC45895nn8, byte[] bArr, int i, int i2, C39532d38 c39532d38) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m13173k(i4, bArr, i3, c39532d38);
            i4 = c39532d38.f76082a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zzd = interfaceC45895nn8.zzd();
            int i6 = i4 + i5;
            interfaceC45895nn8.mo2691e(zzd, bArr, i5, i6, c39532d38);
            interfaceC45895nn8.mo2694b(zzd);
            c39532d38.f76084c = zzd;
            return i6;
        }
        throw zzew.m51574f();
    }

    /* renamed from: e */
    public static int m13179e(InterfaceC45895nn8<?> interfaceC45895nn8, int i, byte[] bArr, int i2, int i3, InterfaceC35383Qc8<?> interfaceC35383Qc8, C39532d38 c39532d38) throws IOException {
        int m13180d = m13180d(interfaceC45895nn8, bArr, i2, i3, c39532d38);
        interfaceC35383Qc8.add(c39532d38.f76084c);
        while (m13180d < i3) {
            int m13174j = m13174j(bArr, m13180d, c39532d38);
            if (i != c39532d38.f76082a) {
                break;
            }
            m13180d = m13180d(interfaceC45895nn8, bArr, m13174j, i3, c39532d38);
            interfaceC35383Qc8.add(c39532d38.f76084c);
        }
        return m13180d;
    }

    /* renamed from: f */
    public static int m13178f(byte[] bArr, int i, InterfaceC35383Qc8<?> interfaceC35383Qc8, C39532d38 c39532d38) throws IOException {
        C39856dc8 c39856dc8 = (C39856dc8) interfaceC35383Qc8;
        int m13174j = m13174j(bArr, i, c39532d38);
        int i2 = c39532d38.f76082a + m13174j;
        while (m13174j < i2) {
            m13174j = m13174j(bArr, m13174j, c39532d38);
            c39856dc8.m44016b(c39532d38.f76082a);
        }
        if (m13174j == i2) {
            return m13174j;
        }
        throw zzew.m51574f();
    }

    /* renamed from: g */
    public static int m13177g(byte[] bArr, int i, C39532d38 c39532d38) throws zzew {
        int m13174j = m13174j(bArr, i, c39532d38);
        int i2 = c39532d38.f76082a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c39532d38.f76084c = "";
                return m13174j;
            }
            c39532d38.f76084c = new String(bArr, m13174j, i2, C41051fd8.f80380a);
            return m13174j + i2;
        }
        throw zzew.m51577c();
    }

    /* renamed from: h */
    public static int m13176h(byte[] bArr, int i, C39532d38 c39532d38) throws zzew {
        int m13174j = m13174j(bArr, i, c39532d38);
        int i2 = c39532d38.f76082a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c39532d38.f76084c = "";
                return m13174j;
            }
            c39532d38.f76084c = C35311Pu8.m89445b(bArr, m13174j, i2);
            return m13174j + i2;
        }
        throw zzew.m51577c();
    }

    /* renamed from: i */
    public static int m13175i(int i, byte[] bArr, int i2, int i3, C35275Pq8 c35275Pq8, C39532d38 c39532d38) throws zzew {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c35275Pq8.m89696f(i, Integer.valueOf(m13182b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzew.m51579a();
                        }
                        int i5 = (i & (-8)) | 4;
                        C35275Pq8 m89699c = C35275Pq8.m89699c();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m13174j = m13174j(bArr, i2, c39532d38);
                            int i7 = c39532d38.f76082a;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = m13174j;
                                break;
                            }
                            i6 = i7;
                            i2 = m13175i(i7, bArr, m13174j, i3, m89699c, c39532d38);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c35275Pq8.m89696f(i, m89699c);
                            return i2;
                        }
                        throw zzew.m51576d();
                    }
                    int m13174j2 = m13174j(bArr, i2, c39532d38);
                    int i8 = c39532d38.f76082a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m13174j2) {
                            if (i8 == 0) {
                                c35275Pq8.m89696f(i, AbstractC50836w78.f115390c);
                            } else {
                                c35275Pq8.m89696f(i, AbstractC50836w78.m7377u(bArr, m13174j2, i8));
                            }
                            return m13174j2 + i8;
                        }
                        throw zzew.m51574f();
                    }
                    throw zzew.m51577c();
                }
                c35275Pq8.m89696f(i, Long.valueOf(m13170n(bArr, i2)));
                return i2 + 8;
            }
            int m13171m = m13171m(bArr, i2, c39532d38);
            c35275Pq8.m89696f(i, Long.valueOf(c39532d38.f76083b));
            return m13171m;
        }
        throw zzew.m51579a();
    }

    /* renamed from: j */
    public static int m13174j(byte[] bArr, int i, C39532d38 c39532d38) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c39532d38.f76082a = b;
            return i2;
        }
        return m13173k(b, bArr, i2, c39532d38);
    }

    /* renamed from: k */
    public static int m13173k(int i, byte[] bArr, int i2, C39532d38 c39532d38) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c39532d38.f76082a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c39532d38.f76082a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c39532d38.f76082a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c39532d38.f76082a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c39532d38.f76082a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m13172l(int i, byte[] bArr, int i2, int i3, InterfaceC35383Qc8<?> interfaceC35383Qc8, C39532d38 c39532d38) {
        C39856dc8 c39856dc8 = (C39856dc8) interfaceC35383Qc8;
        int m13174j = m13174j(bArr, i2, c39532d38);
        c39856dc8.m44016b(c39532d38.f76082a);
        while (m13174j < i3) {
            int m13174j2 = m13174j(bArr, m13174j, c39532d38);
            if (i != c39532d38.f76082a) {
                break;
            }
            m13174j = m13174j(bArr, m13174j2, c39532d38);
            c39856dc8.m44016b(c39532d38.f76082a);
        }
        return m13174j;
    }

    /* renamed from: m */
    public static int m13171m(byte[] bArr, int i, C39532d38 c39532d38) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
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
            c39532d38.f76083b = j2;
            return i3;
        }
        c39532d38.f76083b = j;
        return i2;
    }

    /* renamed from: n */
    public static long m13170n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
