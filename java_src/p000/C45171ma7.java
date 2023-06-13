package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: ma7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45171ma7 {
    /* renamed from: a */
    public static int m25404a(byte[] bArr, int i, C44578la7 c44578la7) throws zbuw {
        int m25395j = m25395j(bArr, i, c44578la7);
        int i2 = c44578la7.f96359a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m25395j) {
                if (i2 == 0) {
                    c44578la7.f96361c = AbstractC32088Ca7.f4281c;
                    return m25395j;
                }
                c44578la7.f96361c = AbstractC32088Ca7.m112096v(bArr, m25395j, i2);
                return m25395j + i2;
            }
            throw zbuw.m51256g();
        }
        throw zbuw.m51259d();
    }

    /* renamed from: b */
    public static int m25403b(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* renamed from: c */
    public static int m25402c(InterfaceC42819ic7 interfaceC42819ic7, byte[] bArr, int i, int i2, int i3, C44578la7 c44578la7) throws IOException {
        Object mo33748B = interfaceC42819ic7.mo33748B();
        int m25391n = m25391n(mo33748B, interfaceC42819ic7, bArr, i, i2, i3, c44578la7);
        interfaceC42819ic7.mo33742f(mo33748B);
        c44578la7.f96361c = mo33748B;
        return m25391n;
    }

    /* renamed from: d */
    public static int m25401d(InterfaceC42819ic7 interfaceC42819ic7, byte[] bArr, int i, int i2, C44578la7 c44578la7) throws IOException {
        Object mo33748B = interfaceC42819ic7.mo33748B();
        int m25390o = m25390o(mo33748B, interfaceC42819ic7, bArr, i, i2, c44578la7);
        interfaceC42819ic7.mo33742f(mo33748B);
        c44578la7.f96361c = mo33748B;
        return m25390o;
    }

    /* renamed from: e */
    public static int m25400e(InterfaceC42819ic7 interfaceC42819ic7, int i, byte[] bArr, int i2, int i3, InterfaceC46367ob7 interfaceC46367ob7, C44578la7 c44578la7) throws IOException {
        int m25401d = m25401d(interfaceC42819ic7, bArr, i2, i3, c44578la7);
        interfaceC46367ob7.add(c44578la7.f96361c);
        while (m25401d < i3) {
            int m25395j = m25395j(bArr, m25401d, c44578la7);
            if (i != c44578la7.f96359a) {
                break;
            }
            m25401d = m25401d(interfaceC42819ic7, bArr, m25395j, i3, c44578la7);
            interfaceC46367ob7.add(c44578la7.f96361c);
        }
        return m25401d;
    }

    /* renamed from: f */
    public static int m25399f(byte[] bArr, int i, InterfaceC46367ob7 interfaceC46367ob7, C44578la7 c44578la7) throws IOException {
        C41623gb7 c41623gb7 = (C41623gb7) interfaceC46367ob7;
        int m25395j = m25395j(bArr, i, c44578la7);
        int i2 = c44578la7.f96359a + m25395j;
        while (m25395j < i2) {
            m25395j = m25395j(bArr, m25395j, c44578la7);
            c41623gb7.m37986e(c44578la7.f96359a);
        }
        if (m25395j == i2) {
            return m25395j;
        }
        throw zbuw.m51256g();
    }

    /* renamed from: g */
    public static int m25398g(byte[] bArr, int i, C44578la7 c44578la7) throws zbuw {
        int m25395j = m25395j(bArr, i, c44578la7);
        int i2 = c44578la7.f96359a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c44578la7.f96361c = "";
                return m25395j;
            }
            c44578la7.f96361c = new String(bArr, m25395j, i2, C46960pb7.f103840b);
            return m25395j + i2;
        }
        throw zbuw.m51259d();
    }

    /* renamed from: h */
    public static int m25397h(byte[] bArr, int i, C44578la7 c44578la7) throws zbuw {
        int m25395j = m25395j(bArr, i, c44578la7);
        int i2 = c44578la7.f96359a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c44578la7.f96361c = "";
                return m25395j;
            }
            AbstractC34680Nc7 abstractC34680Nc7 = C35382Qc7.f30590a;
            int length = bArr.length;
            if ((((length - m25395j) - i2) | m25395j | i2) >= 0) {
                int i3 = m25395j + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (m25395j < i3) {
                    byte b = bArr[m25395j];
                    if (!C34446Mc7.m95120d(b)) {
                        break;
                    }
                    m25395j++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (m25395j < i3) {
                    int i5 = m25395j + 1;
                    byte b2 = bArr[m25395j];
                    if (C34446Mc7.m95120d(b2)) {
                        int i6 = i4 + 1;
                        cArr[i4] = (char) b2;
                        m25395j = i5;
                        while (true) {
                            i4 = i6;
                            if (m25395j < i3) {
                                byte b3 = bArr[m25395j];
                                if (C34446Mc7.m95120d(b3)) {
                                    m25395j++;
                                    i6 = i4 + 1;
                                    cArr[i4] = (char) b3;
                                }
                            }
                        }
                    } else if (b2 < -32) {
                        if (i5 < i3) {
                            C34446Mc7.m95121c(b2, bArr[i5], cArr, i4);
                            m25395j = i5 + 1;
                            i4++;
                        } else {
                            throw zbuw.m51260c();
                        }
                    } else if (b2 < -16) {
                        if (i5 < i3 - 1) {
                            int i7 = i5 + 1;
                            C34446Mc7.m95122b(b2, bArr[i5], bArr[i7], cArr, i4);
                            m25395j = i7 + 1;
                            i4++;
                        } else {
                            throw zbuw.m51260c();
                        }
                    } else if (i5 < i3 - 2) {
                        int i8 = i5 + 1;
                        byte b4 = bArr[i5];
                        int i9 = i8 + 1;
                        C34446Mc7.m95123a(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        m25395j = i9 + 1;
                    } else {
                        throw zbuw.m51260c();
                    }
                }
                c44578la7.f96361c = new String(cArr, 0, i4);
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m25395j), Integer.valueOf(i2)));
        }
        throw zbuw.m51259d();
    }

    /* renamed from: i */
    public static int m25396i(int i, byte[] bArr, int i2, int i3, C32106Cc7 c32106Cc7, C44578la7 c44578la7) throws zbuw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c32106Cc7.m111973j(i, Integer.valueOf(m25403b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zbuw.m51261b();
                        }
                        int i5 = (i & (-8)) | 4;
                        C32106Cc7 m111977f = C32106Cc7.m111977f();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m25395j = m25395j(bArr, i2, c44578la7);
                            int i7 = c44578la7.f96359a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m25396i = m25396i(i6, bArr, m25395j, i3, m111977f, c44578la7);
                                i6 = i7;
                                i2 = m25396i;
                            } else {
                                i2 = m25395j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c32106Cc7.m111973j(i, m111977f);
                            return i2;
                        }
                        throw zbuw.m51258e();
                    }
                    int m25395j2 = m25395j(bArr, i2, c44578la7);
                    int i8 = c44578la7.f96359a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m25395j2) {
                            if (i8 == 0) {
                                c32106Cc7.m111973j(i, AbstractC32088Ca7.f4281c);
                            } else {
                                c32106Cc7.m111973j(i, AbstractC32088Ca7.m112096v(bArr, m25395j2, i8));
                            }
                            return m25395j2 + i8;
                        }
                        throw zbuw.m51256g();
                    }
                    throw zbuw.m51259d();
                }
                c32106Cc7.m111973j(i, Long.valueOf(m25388q(bArr, i2)));
                return i2 + 8;
            }
            int m25392m = m25392m(bArr, i2, c44578la7);
            c32106Cc7.m111973j(i, Long.valueOf(c44578la7.f96360b));
            return m25392m;
        }
        throw zbuw.m51261b();
    }

    /* renamed from: j */
    public static int m25395j(byte[] bArr, int i, C44578la7 c44578la7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c44578la7.f96359a = b;
            return i2;
        }
        return m25394k(b, bArr, i2, c44578la7);
    }

    /* renamed from: k */
    public static int m25394k(int i, byte[] bArr, int i2, C44578la7 c44578la7) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c44578la7.f96359a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c44578la7.f96359a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c44578la7.f96359a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c44578la7.f96359a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c44578la7.f96359a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m25393l(int i, byte[] bArr, int i2, int i3, InterfaceC46367ob7 interfaceC46367ob7, C44578la7 c44578la7) {
        C41623gb7 c41623gb7 = (C41623gb7) interfaceC46367ob7;
        int m25395j = m25395j(bArr, i2, c44578la7);
        c41623gb7.m37986e(c44578la7.f96359a);
        while (m25395j < i3) {
            int m25395j2 = m25395j(bArr, m25395j, c44578la7);
            if (i != c44578la7.f96359a) {
                break;
            }
            m25395j = m25395j(bArr, m25395j2, c44578la7);
            c41623gb7.m37986e(c44578la7.f96359a);
        }
        return m25395j;
    }

    /* renamed from: m */
    public static int m25392m(byte[] bArr, int i, C44578la7 c44578la7) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c44578la7.f96360b = j;
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
        c44578la7.f96360b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m25391n(Object obj, InterfaceC42819ic7 interfaceC42819ic7, byte[] bArr, int i, int i2, int i3, C44578la7 c44578la7) throws IOException {
        int m72892G = ((C37479Zb7) interfaceC42819ic7).m72892G(obj, bArr, i, i2, i3, c44578la7);
        c44578la7.f96361c = obj;
        return m72892G;
    }

    /* renamed from: o */
    public static int m25390o(Object obj, InterfaceC42819ic7 interfaceC42819ic7, byte[] bArr, int i, int i2, C44578la7 c44578la7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m25394k(i4, bArr, i3, c44578la7);
            i4 = c44578la7.f96359a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            interfaceC42819ic7.mo33744d(obj, bArr, i5, i6, c44578la7);
            c44578la7.f96361c = obj;
            return i6;
        }
        throw zbuw.m51256g();
    }

    /* renamed from: p */
    public static int m25389p(int i, byte[] bArr, int i2, int i3, C44578la7 c44578la7) throws zbuw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zbuw.m51261b();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m25395j(bArr, i2, c44578la7);
                            i6 = c44578la7.f96359a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m25389p(i6, bArr, i2, i3, c44578la7);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zbuw.m51258e();
                    }
                    return m25395j(bArr, i2, c44578la7) + c44578la7.f96359a;
                }
                return i2 + 8;
            }
            return m25392m(bArr, i2, c44578la7);
        }
        throw zbuw.m51261b();
    }

    /* renamed from: q */
    public static long m25388q(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
