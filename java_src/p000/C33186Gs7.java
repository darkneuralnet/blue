package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: Gs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33186Gs7 {
    /* renamed from: a */
    public static int m104640a(byte[] bArr, int i, C32952Fs7 c32952Fs7) throws zzaqw {
        int m104631j = m104631j(bArr, i, c32952Fs7);
        int i2 = c32952Fs7.f10390a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m104631j) {
                if (i2 == 0) {
                    c32952Fs7.f10392c = AbstractC44175kt7.f95165c;
                    return m104631j;
                }
                c32952Fs7.f10392c = AbstractC44175kt7.m28227D(bArr, m104631j, i2);
                return m104631j + i2;
            }
            throw zzaqw.m51278j();
        }
        throw zzaqw.m51282f();
    }

    /* renamed from: b */
    public static int m104639b(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: c */
    public static int m104638c(InterfaceC34851Nv7 interfaceC34851Nv7, byte[] bArr, int i, int i2, int i3, C32952Fs7 c32952Fs7) throws IOException {
        C43009iv7 c43009iv7 = (C43009iv7) interfaceC34851Nv7;
        Object zze = c43009iv7.zze();
        int m31637F = c43009iv7.m31637F(zze, bArr, i, i2, i3, c32952Fs7);
        c43009iv7.zzf(zze);
        c32952Fs7.f10392c = zze;
        return m31637F;
    }

    /* renamed from: d */
    public static int m104637d(InterfaceC34851Nv7 interfaceC34851Nv7, byte[] bArr, int i, int i2, C32952Fs7 c32952Fs7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m104630k(i4, bArr, i3, c32952Fs7);
            i4 = c32952Fs7.f10390a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zze = interfaceC34851Nv7.zze();
            int i6 = i4 + i5;
            interfaceC34851Nv7.mo29759e(zze, bArr, i5, i6, c32952Fs7);
            interfaceC34851Nv7.zzf(zze);
            c32952Fs7.f10392c = zze;
            return i6;
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: e */
    public static int m104636e(InterfaceC34851Nv7 interfaceC34851Nv7, int i, byte[] bArr, int i2, int i3, InterfaceC45964nu7 interfaceC45964nu7, C32952Fs7 c32952Fs7) throws IOException {
        int m104637d = m104637d(interfaceC34851Nv7, bArr, i2, i3, c32952Fs7);
        interfaceC45964nu7.add(c32952Fs7.f10392c);
        while (m104637d < i3) {
            int m104631j = m104631j(bArr, m104637d, c32952Fs7);
            if (i != c32952Fs7.f10390a) {
                break;
            }
            m104637d = m104637d(interfaceC34851Nv7, bArr, m104631j, i3, c32952Fs7);
            interfaceC45964nu7.add(c32952Fs7.f10392c);
        }
        return m104637d;
    }

    /* renamed from: f */
    public static int m104635f(byte[] bArr, int i, InterfaceC45964nu7 interfaceC45964nu7, C32952Fs7 c32952Fs7) throws IOException {
        C41220fu7 c41220fu7 = (C41220fu7) interfaceC45964nu7;
        int m104631j = m104631j(bArr, i, c32952Fs7);
        int i2 = c32952Fs7.f10390a + m104631j;
        while (m104631j < i2) {
            m104631j = m104631j(bArr, m104631j, c32952Fs7);
            c41220fu7.m40571e(c32952Fs7.f10390a);
        }
        if (m104631j == i2) {
            return m104631j;
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: g */
    public static int m104634g(byte[] bArr, int i, C32952Fs7 c32952Fs7) throws zzaqw {
        int m104631j = m104631j(bArr, i, c32952Fs7);
        int i2 = c32952Fs7.f10390a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c32952Fs7.f10392c = "";
                return m104631j;
            }
            c32952Fs7.f10392c = new String(bArr, m104631j, i2, C46557ou7.f102752b);
            return m104631j + i2;
        }
        throw zzaqw.m51282f();
    }

    /* renamed from: h */
    public static int m104633h(byte[] bArr, int i, C32952Fs7 c32952Fs7) throws zzaqw {
        int m104631j = m104631j(bArr, i, c32952Fs7);
        int i2 = c32952Fs7.f10390a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c32952Fs7.f10392c = "";
                return m104631j;
            }
            c32952Fs7.f10392c = C33456Hw7.m103208g(bArr, m104631j, i2);
            return m104631j + i2;
        }
        throw zzaqw.m51282f();
    }

    /* renamed from: i */
    public static int m104632i(int i, byte[] bArr, int i2, int i3, C49541tw7 c49541tw7, C32952Fs7 c32952Fs7) throws zzaqw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c49541tw7.m11179h(i, Integer.valueOf(m104639b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzaqw.m51285c();
                        }
                        int i5 = (i & (-8)) | 4;
                        C49541tw7 m11182e = C49541tw7.m11182e();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m104631j = m104631j(bArr, i2, c32952Fs7);
                            int i7 = c32952Fs7.f10390a;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = m104631j;
                                break;
                            }
                            i6 = i7;
                            i2 = m104632i(i7, bArr, m104631j, i3, m11182e, c32952Fs7);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c49541tw7.m11179h(i, m11182e);
                            return i2;
                        }
                        throw zzaqw.m51281g();
                    }
                    int m104631j2 = m104631j(bArr, i2, c32952Fs7);
                    int i8 = c32952Fs7.f10390a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m104631j2) {
                            if (i8 == 0) {
                                c49541tw7.m11179h(i, AbstractC44175kt7.f95165c);
                            } else {
                                c49541tw7.m11179h(i, AbstractC44175kt7.m28227D(bArr, m104631j2, i8));
                            }
                            return m104631j2 + i8;
                        }
                        throw zzaqw.m51278j();
                    }
                    throw zzaqw.m51282f();
                }
                c49541tw7.m11179h(i, Long.valueOf(m104626o(bArr, i2)));
                return i2 + 8;
            }
            int m104628m = m104628m(bArr, i2, c32952Fs7);
            c49541tw7.m11179h(i, Long.valueOf(c32952Fs7.f10391b));
            return m104628m;
        }
        throw zzaqw.m51285c();
    }

    /* renamed from: j */
    public static int m104631j(byte[] bArr, int i, C32952Fs7 c32952Fs7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c32952Fs7.f10390a = b;
            return i2;
        }
        return m104630k(b, bArr, i2, c32952Fs7);
    }

    /* renamed from: k */
    public static int m104630k(int i, byte[] bArr, int i2, C32952Fs7 c32952Fs7) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c32952Fs7.f10390a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c32952Fs7.f10390a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c32952Fs7.f10390a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c32952Fs7.f10390a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c32952Fs7.f10390a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m104629l(int i, byte[] bArr, int i2, int i3, InterfaceC45964nu7 interfaceC45964nu7, C32952Fs7 c32952Fs7) {
        C41220fu7 c41220fu7 = (C41220fu7) interfaceC45964nu7;
        int m104631j = m104631j(bArr, i2, c32952Fs7);
        c41220fu7.m40571e(c32952Fs7.f10390a);
        while (m104631j < i3) {
            int m104631j2 = m104631j(bArr, m104631j, c32952Fs7);
            if (i != c32952Fs7.f10390a) {
                break;
            }
            m104631j = m104631j(bArr, m104631j2, c32952Fs7);
            c41220fu7.m40571e(c32952Fs7.f10390a);
        }
        return m104631j;
    }

    /* renamed from: m */
    public static int m104628m(byte[] bArr, int i, C32952Fs7 c32952Fs7) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c32952Fs7.f10391b = j;
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
        c32952Fs7.f10391b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m104627n(int i, byte[] bArr, int i2, int i3, C32952Fs7 c32952Fs7) throws zzaqw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzaqw.m51285c();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m104631j(bArr, i2, c32952Fs7);
                            i6 = c32952Fs7.f10390a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m104627n(i6, bArr, i2, i3, c32952Fs7);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzaqw.m51281g();
                    }
                    return m104631j(bArr, i2, c32952Fs7) + c32952Fs7.f10390a;
                }
                return i2 + 8;
            }
            return m104628m(bArr, i2, c32952Fs7);
        }
        throw zzaqw.m51285c();
    }

    /* renamed from: o */
    public static long m104626o(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
