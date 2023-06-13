package p000;

import com.google.android.gms.internal.places.zzbk;
/* renamed from: O78 */
/* loaded from: classes5.dex */
public final class O78 extends AbstractC52022y78 {
    /* renamed from: e */
    public static int m92875e(byte[] bArr, int i, long j, int i2) {
        int m81963a;
        int m81952l;
        int m81959e;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    m81959e = U68.m81959e(i, C49038t58.m13120a(bArr, j), C49038t58.m13120a(bArr, j + 1));
                    return m81959e;
                }
                throw new AssertionError();
            }
            m81952l = U68.m81952l(i, C49038t58.m13120a(bArr, j));
            return m81952l;
        }
        m81963a = U68.m81963a(i);
        return m81963a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return -1;
     */
    @Override // p000.AbstractC52022y78
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo4111a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if ((i2 | i3 | (bArr.length - i3)) >= 0) {
            long j = i2;
            int i5 = (int) (i3 - j);
            if (i5 < 16) {
                i4 = 0;
            } else {
                i4 = 0;
                long j2 = j;
                while (true) {
                    if (i4 < i5) {
                        long j3 = j2 + 1;
                        if (C49038t58.m13120a(bArr, j2) < 0) {
                            break;
                        }
                        i4++;
                        j2 = j3;
                    } else {
                        i4 = i5;
                        break;
                    }
                }
            }
            int i6 = i5 - i4;
            long j4 = j + i4;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i6 <= 0) {
                        break;
                    }
                    long j5 = j4 + 1;
                    byte m13120a = C49038t58.m13120a(bArr, j4);
                    if (m13120a >= 0) {
                        i6--;
                        b = m13120a;
                        j4 = j5;
                    } else {
                        b = m13120a;
                        j4 = j5;
                        break;
                    }
                }
                if (i6 == 0) {
                    return 0;
                }
                int i7 = i6 - 1;
                if (b < -32) {
                    if (i7 == 0) {
                        return b;
                    }
                    i6 = i7 - 1;
                    if (b < -62) {
                        break;
                    }
                    long j6 = j4 + 1;
                    if (C49038t58.m13120a(bArr, j4) > -65) {
                        break;
                    }
                    j4 = j6;
                } else if (b < -16) {
                    if (i7 < 2) {
                        return m92875e(bArr, b, j4, i7);
                    }
                    i6 = i7 - 2;
                    long j7 = j4 + 1;
                    byte m13120a2 = C49038t58.m13120a(bArr, j4);
                    if (m13120a2 > -65 || ((b == -32 && m13120a2 < -96) || (b == -19 && m13120a2 >= -96))) {
                        break;
                    }
                    j4 = j7 + 1;
                    if (C49038t58.m13120a(bArr, j7) > -65) {
                        break;
                    }
                } else if (i7 < 3) {
                    return m92875e(bArr, b, j4, i7);
                } else {
                    i6 = i7 - 3;
                    long j8 = j4 + 1;
                    byte m13120a3 = C49038t58.m13120a(bArr, j4);
                    if (m13120a3 > -65 || (((b << 28) + (m13120a3 + 112)) >> 30) != 0) {
                        break;
                    }
                    long j9 = j8 + 1;
                    if (C49038t58.m13120a(bArr, j8) > -65) {
                        break;
                    }
                    j4 = j9 + 1;
                    if (C49038t58.m13120a(bArr, j9) > -65) {
                        break;
                    }
                }
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // p000.AbstractC52022y78
    /* renamed from: b */
    public final int mo4110b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length <= i2 && bArr.length - i2 >= i) {
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                C49038t58.m13112i(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    C49038t58.m13112i(bArr, j4, (byte) charAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (charAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    C49038t58.m13112i(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    C49038t58.m13112i(bArr, j7, (byte) ((charAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                    long j10 = j4 + j;
                    C49038t58.m13112i(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                    long j11 = j10 + j;
                    C49038t58.m13112i(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                    C49038t58.m13112i(bArr, j11, (byte) ((charAt2 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                    c2 = 128;
                } else if (j4 <= j5 - 4) {
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char charAt3 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            long j12 = j4 + 1;
                            C49038t58.m13112i(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            long j13 = j12 + 1;
                            c2 = 128;
                            C49038t58.m13112i(bArr, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j14 = j13 + 1;
                            C49038t58.m13112i(bArr, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                            j3 = 1;
                            j2 = j14 + 1;
                            C49038t58.m13112i(bArr, j14, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new C40174e88(i4 - 1, length);
                } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new C40174e88(i4, length);
                } else {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(j4);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
                i4++;
                c = c2;
                long j15 = j3;
                j4 = j2;
                j = j15;
            }
            return (int) j4;
        }
        char charAt4 = charSequence.charAt(length - 1);
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Failed writing ");
        sb2.append(charAt4);
        sb2.append(" at index ");
        sb2.append(i + i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // p000.AbstractC52022y78
    /* renamed from: d */
    public final String mo4108d(byte[] bArr, int i, int i2) throws zzbk {
        boolean m101156i;
        boolean m101156i2;
        boolean m101155j;
        boolean m101154k;
        boolean m101156i3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte m13120a = C49038t58.m13120a(bArr, i);
                m101156i3 = J58.m101156i(m13120a);
                if (!m101156i3) {
                    break;
                }
                i++;
                J58.m101161d(m13120a, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte m13120a2 = C49038t58.m13120a(bArr, i);
                m101156i = J58.m101156i(m13120a2);
                if (m101156i) {
                    int i7 = i5 + 1;
                    J58.m101161d(m13120a2, cArr, i5);
                    while (i6 < i3) {
                        byte m13120a3 = C49038t58.m13120a(bArr, i6);
                        m101156i2 = J58.m101156i(m13120a3);
                        if (!m101156i2) {
                            break;
                        }
                        i6++;
                        J58.m101161d(m13120a3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else {
                    m101155j = J58.m101155j(m13120a2);
                    if (m101155j) {
                        if (i6 < i3) {
                            J58.m101162c(m13120a2, C49038t58.m13120a(bArr, i6), cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw zzbk.m51033f();
                        }
                    } else {
                        m101154k = J58.m101154k(m13120a2);
                        if (m101154k) {
                            if (i6 < i3 - 1) {
                                int i8 = i6 + 1;
                                J58.m101163b(m13120a2, C49038t58.m13120a(bArr, i6), C49038t58.m13120a(bArr, i8), cArr, i5);
                                i = i8 + 1;
                                i5++;
                            } else {
                                throw zzbk.m51033f();
                            }
                        } else if (i6 < i3 - 2) {
                            int i9 = i6 + 1;
                            int i10 = i9 + 1;
                            J58.m101164a(m13120a2, C49038t58.m13120a(bArr, i6), C49038t58.m13120a(bArr, i9), C49038t58.m13120a(bArr, i10), cArr, i5);
                            i = i10 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw zzbk.m51033f();
                        }
                    }
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
