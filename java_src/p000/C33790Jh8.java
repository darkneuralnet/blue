package p000;

import java.nio.ByteBuffer;
/* renamed from: Jh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33790Jh8 extends AbstractC35419Qg8 {
    /* renamed from: f */
    public static int m99937f(byte[] bArr, int i, long j, int i2) {
        int m113682d;
        int m113674l;
        int m113680f;
        if (i2 == 0) {
            m113682d = C31909Bg8.m113682d(i);
            return m113682d;
        } else if (i2 == 1) {
            m113674l = C31909Bg8.m113674l(i, C35410Qf8.m88245a(bArr, j));
            return m113674l;
        } else if (i2 == 2) {
            m113680f = C31909Bg8.m113680f(i, C35410Qf8.m88245a(bArr, j), C35410Qf8.m88245a(bArr, j + 1));
            return m113680f;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return -1;
     */
    @Override // p000.AbstractC35419Qg8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo37892a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if ((i2 | i3 | (bArr.length - i3)) >= 0) {
            long j = i2;
            int i5 = (int) (i3 - j);
            if (i5 >= 16) {
                i4 = 0;
                long j2 = j;
                while (true) {
                    if (i4 >= i5) {
                        i4 = i5;
                        break;
                    }
                    long j3 = j2 + 1;
                    if (C35410Qf8.m88245a(bArr, j2) < 0) {
                        break;
                    }
                    i4++;
                    j2 = j3;
                }
            } else {
                i4 = 0;
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
                    byte m88245a = C35410Qf8.m88245a(bArr, j4);
                    if (m88245a < 0) {
                        b = m88245a;
                        j4 = j5;
                        break;
                    }
                    i6--;
                    b = m88245a;
                    j4 = j5;
                }
                if (i6 != 0) {
                    int i7 = i6 - 1;
                    if (b >= -32) {
                        if (b >= -16) {
                            if (i7 >= 3) {
                                i6 = i7 - 3;
                                long j6 = j4 + 1;
                                byte m88245a2 = C35410Qf8.m88245a(bArr, j4);
                                if (m88245a2 > -65 || (((b << 28) + (m88245a2 + 112)) >> 30) != 0) {
                                    break;
                                }
                                long j7 = j6 + 1;
                                if (C35410Qf8.m88245a(bArr, j6) > -65) {
                                    break;
                                }
                                j4 = j7 + 1;
                                if (C35410Qf8.m88245a(bArr, j7) > -65) {
                                    break;
                                }
                            } else {
                                return m99937f(bArr, b, j4, i7);
                            }
                        } else if (i7 >= 2) {
                            i6 = i7 - 2;
                            long j8 = j4 + 1;
                            byte m88245a3 = C35410Qf8.m88245a(bArr, j4);
                            if (m88245a3 > -65 || ((b == -32 && m88245a3 < -96) || (b == -19 && m88245a3 >= -96))) {
                                break;
                            }
                            j4 = j8 + 1;
                            if (C35410Qf8.m88245a(bArr, j8) > -65) {
                                break;
                            }
                        } else {
                            return m99937f(bArr, b, j4, i7);
                        }
                    } else if (i7 != 0) {
                        i6 = i7 - 1;
                        if (b < -62) {
                            break;
                        }
                        long j9 = j4 + 1;
                        if (C35410Qf8.m88245a(bArr, j4) > -65) {
                            break;
                        }
                        j4 = j9;
                    } else {
                        return b;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // p000.AbstractC35419Qg8
    /* renamed from: b */
    public final int mo37891b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            C35410Qf8.m88235k(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < c && j4 < j5) {
                long j6 = j4 + j;
                C35410Qf8.m88235k(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j6;
                c2 = c;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j7 = j4 + j;
                C35410Qf8.m88235k(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                long j8 = j7 + j;
                C35410Qf8.m88235k(bArr, j7, (byte) ((charAt3 & '?') | 128));
                long j9 = j;
                c2 = 128;
                j2 = j8;
                j3 = j9;
            } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                if (j4 > j5 - 4) {
                    if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    throw new C49985uh8(i4, length);
                }
                int i5 = i4 + 1;
                if (i5 != length) {
                    char charAt4 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j10 = j4 + 1;
                        C35410Qf8.m88235k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                        long j11 = j10 + 1;
                        c2 = 128;
                        C35410Qf8.m88235k(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j12 = j11 + 1;
                        C35410Qf8.m88235k(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j12 + 1;
                        C35410Qf8.m88235k(bArr, j12, (byte) ((codePoint & 63) | 128));
                        i4 = i5;
                    } else {
                        i4 = i5;
                    }
                }
                throw new C49985uh8(i4 - 1, length);
            } else {
                long j13 = j4 + j;
                C35410Qf8.m88235k(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                long j14 = j13 + j;
                C35410Qf8.m88235k(bArr, j13, (byte) (((charAt3 >>> 6) & 63) | 128));
                C35410Qf8.m88235k(bArr, j14, (byte) ((charAt3 & '?') | 128));
                j2 = j14 + 1;
                j3 = 1;
                c2 = 128;
            }
            i4++;
            c = c2;
            long j15 = j3;
            j4 = j2;
            j = j15;
        }
        return (int) j4;
    }

    @Override // p000.AbstractC35419Qg8
    /* renamed from: c */
    public final void mo37890c(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        int i;
        long j;
        int i2;
        int i3;
        long j2;
        char c2;
        char charAt;
        ByteBuffer byteBuffer2 = byteBuffer;
        long m88231o = C35410Qf8.m88231o(byteBuffer);
        long position = byteBuffer.position() + m88231o;
        long limit = byteBuffer.limit() + m88231o;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            C35410Qf8.m88243c(position, (byte) charAt);
            i4++;
            position++;
        }
        if (i4 == length) {
            i = (int) (position - m88231o);
        } else {
            while (i4 < length) {
                char charAt3 = charSequence.charAt(i4);
                if (charAt3 >= c || position >= limit) {
                    if (charAt3 >= 2048 || position > limit - 2) {
                        j = m88231o;
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                            if (position > limit - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i2 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i2)))) {
                                    throw new C49985uh8(i4, length);
                                }
                                StringBuilder sb2 = new StringBuilder(46);
                                sb2.append("Failed writing ");
                                sb2.append(charAt3);
                                sb2.append(" at index ");
                                sb2.append(position);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i3 = i4 + 1;
                            if (i3 != length) {
                                char charAt4 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    j2 = limit;
                                    long j3 = position + 1;
                                    C35410Qf8.m88243c(position, (byte) ((codePoint >>> 18) | 240));
                                    long j4 = j3 + 1;
                                    c2 = 128;
                                    C35410Qf8.m88243c(j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = j4 + 1;
                                    C35410Qf8.m88243c(j4, (byte) (((codePoint >>> 6) & 63) | 128));
                                    C35410Qf8.m88243c(j5, (byte) ((codePoint & 63) | 128));
                                    position = j5 + 1;
                                } else {
                                    i4 = i3;
                                }
                            }
                            throw new C49985uh8(i4 - 1, length);
                        }
                        long j6 = position + 1;
                        C35410Qf8.m88243c(position, (byte) ((charAt3 >>> '\f') | 480));
                        long j7 = j6 + 1;
                        C35410Qf8.m88243c(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                        C35410Qf8.m88243c(j7, (byte) ((charAt3 & '?') | 128));
                        position = j7 + 1;
                    } else {
                        j = m88231o;
                        long j8 = position + 1;
                        C35410Qf8.m88243c(position, (byte) ((charAt3 >>> 6) | 960));
                        C35410Qf8.m88243c(j8, (byte) ((charAt3 & '?') | 128));
                        position = j8 + 1;
                    }
                    j2 = limit;
                    i3 = i4;
                    c2 = 128;
                } else {
                    C35410Qf8.m88243c(position, (byte) charAt3);
                    j2 = limit;
                    i3 = i4;
                    c2 = c;
                    position++;
                    j = m88231o;
                }
                c = c2;
                m88231o = j;
                limit = j2;
                i4 = i3 + 1;
            }
            i = (int) (position - m88231o);
            byteBuffer2 = byteBuffer;
        }
        byteBuffer2.position(i);
    }
}
