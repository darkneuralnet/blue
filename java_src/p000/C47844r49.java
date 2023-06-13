package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: r49  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47844r49 {
    /* renamed from: a */
    public static int m16530a(byte[] bArr, int i, C43100j49 c43100j49) throws zzov {
        int m16521j = m16521j(bArr, i, c43100j49);
        int i2 = c43100j49.f92111a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m16521j) {
                if (i2 == 0) {
                    c43100j49.f92113c = T69.f34797c;
                    return m16521j;
                }
                c43100j49.f92113c = T69.m84303v(bArr, m16521j, i2);
                return m16521j + i2;
            }
            throw zzov.m51289g();
        }
        throw zzov.m51292d();
    }

    /* renamed from: b */
    public static int m16529b(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: c */
    public static int m16528c(Ei9 ei9, byte[] bArr, int i, int i2, int i3, C43100j49 c43100j49) throws IOException {
        Lg9 lg9 = (Lg9) ei9;
        Object zze = lg9.zze();
        int m96438z = lg9.m96438z(zze, bArr, i, i2, i3, c43100j49);
        lg9.zzf(zze);
        c43100j49.f92113c = zze;
        return m96438z;
    }

    /* renamed from: d */
    public static int m16527d(Ei9 ei9, byte[] bArr, int i, int i2, C43100j49 c43100j49) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m16520k(i4, bArr, i3, c43100j49);
            i4 = c43100j49.f92111a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zze = ei9.zze();
            int i6 = i4 + i5;
            ei9.mo83165b(zze, bArr, i5, i6, c43100j49);
            ei9.zzf(zze);
            c43100j49.f92113c = zze;
            return i6;
        }
        throw zzov.m51289g();
    }

    /* renamed from: e */
    public static int m16526e(Ei9 ei9, int i, byte[] bArr, int i2, int i3, InterfaceC39857dc9 interfaceC39857dc9, C43100j49 c43100j49) throws IOException {
        int m16527d = m16527d(ei9, bArr, i2, i3, c43100j49);
        interfaceC39857dc9.add(c43100j49.f92113c);
        while (m16527d < i3) {
            int m16521j = m16521j(bArr, m16527d, c43100j49);
            if (i != c43100j49.f92111a) {
                break;
            }
            m16527d = m16527d(ei9, bArr, m16521j, i3, c43100j49);
            interfaceC39857dc9.add(c43100j49.f92113c);
        }
        return m16527d;
    }

    /* renamed from: f */
    public static int m16525f(byte[] bArr, int i, InterfaceC39857dc9 interfaceC39857dc9, C43100j49 c43100j49) throws IOException {
        Bb9 bb9 = (Bb9) interfaceC39857dc9;
        int m16521j = m16521j(bArr, i, c43100j49);
        int i2 = c43100j49.f92111a + m16521j;
        while (m16521j < i2) {
            m16521j = m16521j(bArr, m16521j, c43100j49);
            bb9.m113809c(c43100j49.f92111a);
        }
        if (m16521j == i2) {
            return m16521j;
        }
        throw zzov.m51289g();
    }

    /* renamed from: g */
    public static int m16524g(byte[] bArr, int i, C43100j49 c43100j49) throws zzov {
        int m16521j = m16521j(bArr, i, c43100j49);
        int i2 = c43100j49.f92111a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c43100j49.f92113c = "";
                return m16521j;
            }
            c43100j49.f92113c = new String(bArr, m16521j, i2, C44007kc9.f94654b);
            return m16521j + i2;
        }
        throw zzov.m51292d();
    }

    /* renamed from: h */
    public static int m16523h(byte[] bArr, int i, C43100j49 c43100j49) throws zzov {
        int m16521j = m16521j(bArr, i, c43100j49);
        int i2 = c43100j49.f92111a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c43100j49.f92113c = "";
                return m16521j;
            }
            c43100j49.f92113c = Zm9.m72528d(bArr, m16521j, i2);
            return m16521j + i2;
        }
        throw zzov.m51292d();
    }

    /* renamed from: i */
    public static int m16522i(int i, byte[] bArr, int i2, int i3, Sk9 sk9, C43100j49 c43100j49) throws zzov {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                sk9.m84910h(i, Integer.valueOf(m16529b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzov.m51294b();
                        }
                        int i5 = (i & (-8)) | 4;
                        Sk9 m84913e = Sk9.m84913e();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m16521j = m16521j(bArr, i2, c43100j49);
                            int i7 = c43100j49.f92111a;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = m16521j;
                                break;
                            }
                            i6 = i7;
                            i2 = m16522i(i7, bArr, m16521j, i3, m84913e, c43100j49);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            sk9.m84910h(i, m84913e);
                            return i2;
                        }
                        throw zzov.m51291e();
                    }
                    int m16521j2 = m16521j(bArr, i2, c43100j49);
                    int i8 = c43100j49.f92111a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m16521j2) {
                            if (i8 == 0) {
                                sk9.m84910h(i, T69.f34797c);
                            } else {
                                sk9.m84910h(i, T69.m84303v(bArr, m16521j2, i8));
                            }
                            return m16521j2 + i8;
                        }
                        throw zzov.m51289g();
                    }
                    throw zzov.m51292d();
                }
                sk9.m84910h(i, Long.valueOf(m16516o(bArr, i2)));
                return i2 + 8;
            }
            int m16518m = m16518m(bArr, i2, c43100j49);
            sk9.m84910h(i, Long.valueOf(c43100j49.f92112b));
            return m16518m;
        }
        throw zzov.m51294b();
    }

    /* renamed from: j */
    public static int m16521j(byte[] bArr, int i, C43100j49 c43100j49) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c43100j49.f92111a = b;
            return i2;
        }
        return m16520k(b, bArr, i2, c43100j49);
    }

    /* renamed from: k */
    public static int m16520k(int i, byte[] bArr, int i2, C43100j49 c43100j49) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c43100j49.f92111a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c43100j49.f92111a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c43100j49.f92111a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c43100j49.f92111a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c43100j49.f92111a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m16519l(int i, byte[] bArr, int i2, int i3, InterfaceC39857dc9 interfaceC39857dc9, C43100j49 c43100j49) {
        Bb9 bb9 = (Bb9) interfaceC39857dc9;
        int m16521j = m16521j(bArr, i2, c43100j49);
        bb9.m113809c(c43100j49.f92111a);
        while (m16521j < i3) {
            int m16521j2 = m16521j(bArr, m16521j, c43100j49);
            if (i != c43100j49.f92111a) {
                break;
            }
            m16521j = m16521j(bArr, m16521j2, c43100j49);
            bb9.m113809c(c43100j49.f92111a);
        }
        return m16521j;
    }

    /* renamed from: m */
    public static int m16518m(byte[] bArr, int i, C43100j49 c43100j49) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c43100j49.f92112b = j;
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
        c43100j49.f92112b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m16517n(int i, byte[] bArr, int i2, int i3, C43100j49 c43100j49) throws zzov {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzov.m51294b();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m16521j(bArr, i2, c43100j49);
                            i6 = c43100j49.f92111a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m16517n(i6, bArr, i2, i3, c43100j49);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzov.m51291e();
                    }
                    return m16521j(bArr, i2, c43100j49) + c43100j49.f92111a;
                }
                return i2 + 8;
            }
            return m16518m(bArr, i2, c43100j49);
        }
        throw zzov.m51294b();
    }

    /* renamed from: o */
    public static long m16516o(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
