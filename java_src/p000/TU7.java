package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: TU7 */
/* loaded from: classes5.dex */
public final class TU7 {
    /* renamed from: a */
    public static int m83561a(byte[] bArr, int i, FU7 fu7) throws zzeo {
        int m83552j = m83552j(bArr, i, fu7);
        int i2 = fu7.f9512a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m83552j) {
                if (i2 == 0) {
                    fu7.f9514c = AbstractC41604gZ7.f82424c;
                    return m83552j;
                }
                fu7.f9514c = AbstractC41604gZ7.m39166C(bArr, m83552j, i2);
                return m83552j + i2;
            }
            throw zzeo.m51315g();
        }
        throw zzeo.m51318d();
    }

    /* renamed from: b */
    public static int m83560b(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* renamed from: c */
    public static int m83559c(InterfaceC32449Do8 interfaceC32449Do8, byte[] bArr, int i, int i2, int i3, FU7 fu7) throws IOException {
        Object zze = interfaceC32449Do8.zze();
        int m83548n = m83548n(zze, interfaceC32449Do8, bArr, i, i2, i3, fu7);
        interfaceC32449Do8.zzf(zze);
        fu7.f9514c = zze;
        return m83548n;
    }

    /* renamed from: d */
    public static int m83558d(InterfaceC32449Do8 interfaceC32449Do8, byte[] bArr, int i, int i2, FU7 fu7) throws IOException {
        Object zze = interfaceC32449Do8.zze();
        int m83547o = m83547o(zze, interfaceC32449Do8, bArr, i, i2, fu7);
        interfaceC32449Do8.zzf(zze);
        fu7.f9514c = zze;
        return m83547o;
    }

    /* renamed from: e */
    public static int m83557e(InterfaceC32449Do8 interfaceC32449Do8, int i, byte[] bArr, int i2, int i3, InterfaceC47544qa8 interfaceC47544qa8, FU7 fu7) throws IOException {
        int m83558d = m83558d(interfaceC32449Do8, bArr, i2, i3, fu7);
        interfaceC47544qa8.add(fu7.f9514c);
        while (m83558d < i3) {
            int m83552j = m83552j(bArr, m83558d, fu7);
            if (i != fu7.f9512a) {
                break;
            }
            m83558d = m83558d(interfaceC32449Do8, bArr, m83552j, i3, fu7);
            interfaceC47544qa8.add(fu7.f9514c);
        }
        return m83558d;
    }

    /* renamed from: f */
    public static int m83556f(byte[] bArr, int i, InterfaceC47544qa8 interfaceC47544qa8, FU7 fu7) throws IOException {
        C44325l88 c44325l88 = (C44325l88) interfaceC47544qa8;
        int m83552j = m83552j(bArr, i, fu7);
        int i2 = fu7.f9512a + m83552j;
        while (m83552j < i2) {
            m83552j = m83552j(bArr, m83552j, fu7);
            c44325l88.m27744e(fu7.f9512a);
        }
        if (m83552j == i2) {
            return m83552j;
        }
        throw zzeo.m51315g();
    }

    /* renamed from: g */
    public static int m83555g(byte[] bArr, int i, FU7 fu7) throws zzeo {
        int m83552j = m83552j(bArr, i, fu7);
        int i2 = fu7.f9512a;
        if (i2 >= 0) {
            if (i2 == 0) {
                fu7.f9514c = "";
                return m83552j;
            }
            fu7.f9514c = new String(bArr, m83552j, i2, C32791Fa8.f9737b);
            return m83552j + i2;
        }
        throw zzeo.m51318d();
    }

    /* renamed from: h */
    public static int m83554h(byte[] bArr, int i, FU7 fu7) throws zzeo {
        int m83552j = m83552j(bArr, i, fu7);
        int i2 = fu7.f9512a;
        if (i2 >= 0) {
            if (i2 == 0) {
                fu7.f9514c = "";
                return m83552j;
            }
            int length = bArr.length;
            AbstractC52506yw8 abstractC52506yw8 = C43623jx8.f93624a;
            if ((m83552j | i2 | ((length - m83552j) - i2)) >= 0) {
                int i3 = m83552j + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (m83552j < i3) {
                    byte b = bArr[m83552j];
                    if (!C44206kw8.m28111d(b)) {
                        break;
                    }
                    m83552j++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (m83552j < i3) {
                    int i5 = m83552j + 1;
                    byte b2 = bArr[m83552j];
                    if (C44206kw8.m28111d(b2)) {
                        int i6 = i4 + 1;
                        cArr[i4] = (char) b2;
                        m83552j = i5;
                        while (true) {
                            i4 = i6;
                            if (m83552j < i3) {
                                byte b3 = bArr[m83552j];
                                if (C44206kw8.m28111d(b3)) {
                                    m83552j++;
                                    i6 = i4 + 1;
                                    cArr[i4] = (char) b3;
                                }
                            }
                        }
                    } else if (b2 < -32) {
                        if (i5 < i3) {
                            C44206kw8.m28112c(b2, bArr[i5], cArr, i4);
                            m83552j = i5 + 1;
                            i4++;
                        } else {
                            throw zzeo.m51319c();
                        }
                    } else if (b2 < -16) {
                        if (i5 < i3 - 1) {
                            int i7 = i5 + 1;
                            C44206kw8.m28113b(b2, bArr[i5], bArr[i7], cArr, i4);
                            m83552j = i7 + 1;
                            i4++;
                        } else {
                            throw zzeo.m51319c();
                        }
                    } else if (i5 < i3 - 2) {
                        int i8 = i5 + 1;
                        byte b4 = bArr[i5];
                        int i9 = i8 + 1;
                        C44206kw8.m28114a(b2, b4, bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        m83552j = i9 + 1;
                    } else {
                        throw zzeo.m51319c();
                    }
                }
                fu7.f9514c = new String(cArr, 0, i4);
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m83552j), Integer.valueOf(i2)));
        }
        throw zzeo.m51318d();
    }

    /* renamed from: i */
    public static int m83553i(int i, byte[] bArr, int i2, int i3, C36463Us8 c36463Us8, FU7 fu7) throws zzeo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c36463Us8.m80673j(i, Integer.valueOf(m83560b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzeo.m51320b();
                        }
                        int i5 = (i & (-8)) | 4;
                        C36463Us8 m80677f = C36463Us8.m80677f();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m83552j = m83552j(bArr, i2, fu7);
                            int i7 = fu7.f9512a;
                            i6 = i7;
                            if (i7 != i5) {
                                int m83553i = m83553i(i6, bArr, m83552j, i3, m80677f, fu7);
                                i6 = i7;
                                i2 = m83553i;
                            } else {
                                i2 = m83552j;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c36463Us8.m80673j(i, m80677f);
                            return i2;
                        }
                        throw zzeo.m51317e();
                    }
                    int m83552j2 = m83552j(bArr, i2, fu7);
                    int i8 = fu7.f9512a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m83552j2) {
                            if (i8 == 0) {
                                c36463Us8.m80673j(i, AbstractC41604gZ7.f82424c);
                            } else {
                                c36463Us8.m80673j(i, AbstractC41604gZ7.m39166C(bArr, m83552j2, i8));
                            }
                            return m83552j2 + i8;
                        }
                        throw zzeo.m51315g();
                    }
                    throw zzeo.m51318d();
                }
                c36463Us8.m80673j(i, Long.valueOf(m83545q(bArr, i2)));
                return i2 + 8;
            }
            int m83549m = m83549m(bArr, i2, fu7);
            c36463Us8.m80673j(i, Long.valueOf(fu7.f9513b));
            return m83549m;
        }
        throw zzeo.m51320b();
    }

    /* renamed from: j */
    public static int m83552j(byte[] bArr, int i, FU7 fu7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            fu7.f9512a = b;
            return i2;
        }
        return m83551k(b, bArr, i2, fu7);
    }

    /* renamed from: k */
    public static int m83551k(int i, byte[] bArr, int i2, FU7 fu7) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            fu7.f9512a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            fu7.f9512a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            fu7.f9512a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            fu7.f9512a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                fu7.f9512a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m83550l(int i, byte[] bArr, int i2, int i3, InterfaceC47544qa8 interfaceC47544qa8, FU7 fu7) {
        C44325l88 c44325l88 = (C44325l88) interfaceC47544qa8;
        int m83552j = m83552j(bArr, i2, fu7);
        c44325l88.m27744e(fu7.f9512a);
        while (m83552j < i3) {
            int m83552j2 = m83552j(bArr, m83552j, fu7);
            if (i != fu7.f9512a) {
                break;
            }
            m83552j = m83552j(bArr, m83552j2, fu7);
            c44325l88.m27744e(fu7.f9512a);
        }
        return m83552j;
    }

    /* renamed from: m */
    public static int m83549m(byte[] bArr, int i, FU7 fu7) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            fu7.f9513b = j;
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
        fu7.f9513b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m83548n(Object obj, InterfaceC32449Do8 interfaceC32449Do8, byte[] bArr, int i, int i2, int i3, FU7 fu7) throws IOException {
        int m84975B = ((C35914Sj8) interfaceC32449Do8).m84975B(obj, bArr, i, i2, i3, fu7);
        fu7.f9514c = obj;
        return m84975B;
    }

    /* renamed from: o */
    public static int m83547o(Object obj, InterfaceC32449Do8 interfaceC32449Do8, byte[] bArr, int i, int i2, FU7 fu7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m83551k(i4, bArr, i3, fu7);
            i4 = fu7.f9512a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            interfaceC32449Do8.mo40916d(obj, bArr, i5, i6, fu7);
            fu7.f9514c = obj;
            return i6;
        }
        throw zzeo.m51315g();
    }

    /* renamed from: p */
    public static int m83546p(int i, byte[] bArr, int i2, int i3, FU7 fu7) throws zzeo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzeo.m51320b();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m83552j(bArr, i2, fu7);
                            i6 = fu7.f9512a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m83546p(i6, bArr, i2, i3, fu7);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzeo.m51317e();
                    }
                    return m83552j(bArr, i2, fu7) + fu7.f9512a;
                }
                return i2 + 8;
            }
            return m83549m(bArr, i2, fu7);
        }
        throw zzeo.m51320b();
    }

    /* renamed from: q */
    public static long m83545q(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
