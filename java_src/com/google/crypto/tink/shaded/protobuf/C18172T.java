package com.google.crypto.tink.shaded.protobuf;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.location.places.Place;
/* renamed from: com.google.crypto.tink.shaded.protobuf.T */
/* loaded from: classes6.dex */
public final class C18172T {

    /* renamed from: a */
    public static final AbstractC18174b f74084a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.T$a */
    /* loaded from: classes6.dex */
    public static class C18173a {
        private C18173a() {
        }

        /* renamed from: h */
        public static void m47824h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m47819m(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m47819m(b3) && !m47819m(b4)) {
                int m47814r = ((b & 7) << 18) | (m47814r(b2) << 12) | (m47814r(b3) << 6) | m47814r(b4);
                cArr[i] = m47820l(m47814r);
                cArr[i + 1] = m47815q(m47814r);
                return;
            }
            throw InvalidProtocolBufferException.m48008d();
        }

        /* renamed from: i */
        public static void m47823i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m47822j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m47819m(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m47819m(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (m47814r(b2) << 6) | m47814r(b3));
                return;
            }
            throw InvalidProtocolBufferException.m48008d();
        }

        /* renamed from: k */
        public static void m47821k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b >= -62 && !m47819m(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | m47814r(b2));
                return;
            }
            throw InvalidProtocolBufferException.m48008d();
        }

        /* renamed from: l */
        public static char m47820l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        /* renamed from: m */
        public static boolean m47819m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m47818n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m47817o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m47816p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m47815q(int i) {
            return (char) ((i & Place.TYPE_SUBLOCALITY_LEVEL_1) + GeneratorBase.SURR2_FIRST);
        }

        /* renamed from: r */
        public static int m47814r(byte b) {
            return b & 63;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.T$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18174b {
        /* renamed from: a */
        public abstract String mo47810a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: b */
        public abstract int mo47809b(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: c */
        public final boolean m47813c(byte[] bArr, int i, int i2) {
            return mo47808d(0, bArr, i, i2) == 0;
        }

        /* renamed from: d */
        public abstract int mo47808d(int i, byte[] bArr, int i2, int i3);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.T$c */
    /* loaded from: classes6.dex */
    public static final class C18175c extends AbstractC18174b {
        /* renamed from: e */
        public static int m47812e(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m47811f(bArr, i, i2);
        }

        /* renamed from: f */
        public static int m47811f(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return C18172T.m47834l(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return C18172T.m47834l(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: a */
        public String mo47810a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!C18173a.m47818n(b)) {
                        break;
                    }
                    i++;
                    C18173a.m47823i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (C18173a.m47818n(b2)) {
                        int i7 = i5 + 1;
                        C18173a.m47823i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!C18173a.m47818n(b3)) {
                                break;
                            }
                            i6++;
                            C18173a.m47823i(b3, cArr, i7);
                            i7++;
                        }
                        i = i6;
                        i5 = i7;
                    } else if (C18173a.m47816p(b2)) {
                        if (i6 < i3) {
                            C18173a.m47821k(b2, bArr[i6], cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m48008d();
                        }
                    } else if (C18173a.m47817o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C18173a.m47822j(b2, bArr[i6], bArr[i8], cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m48008d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C18173a.m47824h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m48008d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo47809b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else {
                    if (charAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                        int i10 = i8 + 1;
                        bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i3 = i11 + 1;
                        bArr[i11] = (byte) ((charAt2 & '?') | 128);
                    } else if (i8 <= i6 - 4) {
                        int i12 = i7 + 1;
                        if (i12 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i13 = i8 + 1;
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                int i14 = i13 + 1;
                                bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i15 = i14 + 1;
                                bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 = i15 + 1;
                                bArr[i15] = (byte) ((codePoint & 63) | 128);
                                i7 = i12;
                            } else {
                                i7 = i12;
                            }
                        }
                        throw new C18176d(i7 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                        throw new C18176d(i7, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                    }
                    i7++;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
            if (r8[r7] > (-65)) goto L51;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo47808d(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i6 >= i3) {
                            return C18172T.m47836j(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i4 = i2 + 1;
                        b5 = bArr[i2];
                        if (i4 >= i3) {
                            return C18172T.m47836j(b2, b5);
                        }
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                        i4 = i2;
                    }
                    if (b == 0) {
                        int i7 = i4 + 1;
                        byte b6 = bArr[i4];
                        if (i7 >= i3) {
                            return C18172T.m47835k(b2, b5, b6);
                        }
                        b = b6;
                        i4 = i7;
                    }
                    if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                    return -1;
                }
                i2 = i5;
            }
            return m47812e(bArr, i2, i3);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.T$d */
    /* loaded from: classes6.dex */
    public static class C18176d extends IllegalArgumentException {
        public C18176d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.T$e */
    /* loaded from: classes6.dex */
    public static final class C18177e extends AbstractC18174b {
        /* renamed from: e */
        public static boolean m47807e() {
            return C52917ze6.m930E() && C52917ze6.m929F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m47806f(byte[] bArr, long j, int i) {
            long j2;
            int m47805g = m47805g(bArr, j, i);
            int i2 = i - m47805g;
            long j3 = j + m47805g;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j4 = j3 + 1;
                    b = C52917ze6.m894u(bArr, j3);
                    if (b >= 0) {
                        i2--;
                        j3 = j4;
                    } else {
                        j3 = j4;
                        break;
                    }
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b < -32) {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 = i3 - 1;
                    if (b < -62) {
                        break;
                    }
                    j2 = 1 + j3;
                    if (C52917ze6.m894u(bArr, j3) > -65) {
                        break;
                    }
                } else if (b < -16) {
                    if (i3 < 2) {
                        return m47804h(bArr, b, j3, i3);
                    }
                    i2 = i3 - 2;
                    long j5 = j3 + 1;
                    byte m894u = C52917ze6.m894u(bArr, j3);
                    if (m894u > -65 || ((b == -32 && m894u < -96) || (b == -19 && m894u >= -96))) {
                        break;
                    }
                    j2 = 1 + j5;
                    if (C52917ze6.m894u(bArr, j5) > -65) {
                        break;
                    }
                } else if (i3 < 3) {
                    return m47804h(bArr, b, j3, i3);
                } else {
                    i2 = i3 - 3;
                    long j6 = j3 + 1;
                    byte m894u2 = C52917ze6.m894u(bArr, j3);
                    if (m894u2 > -65 || (((b << 28) + (m894u2 + 112)) >> 30) != 0) {
                        break;
                    }
                    long j7 = j6 + 1;
                    if (C52917ze6.m894u(bArr, j6) > -65) {
                        break;
                    }
                    j2 = 1 + j7;
                    if (C52917ze6.m894u(bArr, j7) > -65) {
                        break;
                    }
                }
                j3 = j2;
            }
        }

        /* renamed from: g */
        public static int m47805g(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (true) {
                int i3 = i2 + 8;
                if (i3 > i || (C52917ze6.m934A(bArr, C52917ze6.f121699h + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i3;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (C52917ze6.m894u(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: h */
        public static int m47804h(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C18172T.m47835k(i, C52917ze6.m894u(bArr, j), C52917ze6.m894u(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return C18172T.m47836j(i, C52917ze6.m894u(bArr, j));
            }
            return C18172T.m47837i(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: a */
        public String mo47810a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int m47805g = m47805g(bArr, i, i2) + i;
                int i3 = i + i2;
                while (m47805g < i3 && C52917ze6.m894u(bArr, m47805g) >= 0) {
                    m47805g++;
                }
                if (m47805g == i3) {
                    return new String(bArr, i, i2, C18238v.f74217a);
                }
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < m47805g) {
                    C18173a.m47823i(C52917ze6.m894u(bArr, i), cArr, i4);
                    i++;
                    i4++;
                }
                int i5 = i4;
                while (m47805g < i3) {
                    int i6 = m47805g + 1;
                    byte m894u = C52917ze6.m894u(bArr, m47805g);
                    if (C18173a.m47818n(m894u)) {
                        int i7 = i5 + 1;
                        C18173a.m47823i(m894u, cArr, i5);
                        while (i6 < i3) {
                            byte m894u2 = C52917ze6.m894u(bArr, i6);
                            if (!C18173a.m47818n(m894u2)) {
                                break;
                            }
                            i6++;
                            C18173a.m47823i(m894u2, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        m47805g = i6;
                    } else if (C18173a.m47816p(m894u)) {
                        if (i6 < i3) {
                            m47805g = i6 + 1;
                            C18173a.m47821k(m894u, C52917ze6.m894u(bArr, i6), cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m48008d();
                        }
                    } else if (C18173a.m47817o(m894u)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C18173a.m47822j(m894u, C52917ze6.m894u(bArr, i6), C52917ze6.m894u(bArr, i8), cArr, i5);
                            m47805g = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m48008d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        m47805g = i10 + 1;
                        C18173a.m47824h(m894u, C52917ze6.m894u(bArr, i6), C52917ze6.m894u(bArr, i9), C52917ze6.m894u(bArr, i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m48008d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: b */
        public int mo47809b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                    C52917ze6.m924K(bArr, j4, (byte) charAt);
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
                        C52917ze6.m924K(bArr, j4, (byte) charAt2);
                        j3 = j;
                        j2 = j6;
                        c2 = c;
                    } else if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j7 = j4 + j;
                        C52917ze6.m924K(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        long j8 = j7 + j;
                        C52917ze6.m924K(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        long j9 = j;
                        c2 = 128;
                        j2 = j8;
                        j3 = j9;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                        long j10 = j4 + j;
                        C52917ze6.m924K(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        C52917ze6.m924K(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        C52917ze6.m924K(bArr, j11, (byte) ((charAt2 & '?') | 128));
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
                                C52917ze6.m924K(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j13 = j12 + 1;
                                c2 = 128;
                                C52917ze6.m924K(bArr, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j13 + 1;
                                C52917ze6.m924K(bArr, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j14 + 1;
                                C52917ze6.m924K(bArr, j14, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C18176d(i4 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                        throw new C18176d(i4, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                    }
                    i4++;
                    c = c2;
                    long j15 = j3;
                    j4 = j2;
                    j = j15;
                }
                return (int) j4;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (p000.C52917ze6.m894u(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (p000.C52917ze6.m894u(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.C18172T.AbstractC18174b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo47808d(int i, byte[] bArr, int i2, int i3) {
            long j;
            byte b = 0;
            if ((i2 | i3 | (bArr.length - i3)) >= 0) {
                long j2 = i2;
                long j3 = i3;
                if (i != 0) {
                    if (j2 >= j3) {
                        return i;
                    }
                    byte b2 = (byte) i;
                    if (b2 < -32) {
                        if (b2 >= -62) {
                            long j4 = 1 + j2;
                            if (C52917ze6.m894u(bArr, j2) <= -65) {
                                j2 = j4;
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        byte b3 = (byte) (~(i >> 8));
                        if (b3 == 0) {
                            long j5 = j2 + 1;
                            b3 = C52917ze6.m894u(bArr, j2);
                            if (j5 >= j3) {
                                return C18172T.m47836j(b2, b3);
                            }
                            j2 = j5;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            j = j2 + 1;
                        }
                        return -1;
                    }
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j6 = j2 + 1;
                        b4 = C52917ze6.m894u(bArr, j2);
                        if (j6 >= j3) {
                            return C18172T.m47836j(b2, b4);
                        }
                        j2 = j6;
                    } else {
                        b = (byte) (i >> 16);
                    }
                    if (b == 0) {
                        long j7 = j2 + 1;
                        b = C52917ze6.m894u(bArr, j2);
                        if (j7 >= j3) {
                            return C18172T.m47835k(b2, b4, b);
                        }
                        j2 = j7;
                    }
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                        j = j2 + 1;
                    }
                    return -1;
                    j2 = j;
                }
                return m47806f(bArr, j2, (int) (j3 - j2));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    static {
        AbstractC18174b c18175c;
        if (C18177e.m47807e() && !C23288ib.m33779c()) {
            c18175c = new C18177e();
        } else {
            c18175c = new C18175c();
        }
        f74084a = c18175c;
    }

    private C18172T() {
    }

    /* renamed from: e */
    public static String m47841e(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f74084a.mo47810a(bArr, i, i2);
    }

    /* renamed from: f */
    public static int m47840f(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f74084a.mo47809b(charSequence, bArr, i, i2);
    }

    /* renamed from: g */
    public static int m47839g(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt < 2048) {
                    i2 += (127 - charAt) >>> 31;
                    i++;
                } else {
                    i2 += m47838h(charSequence, i);
                    break;
                }
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    /* renamed from: h */
    public static int m47838h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new C18176d(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static int m47837i(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: j */
    public static int m47836j(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: k */
    public static int m47835k(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: l */
    public static int m47834l(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m47835k(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m47836j(b, bArr[i]);
        }
        return m47837i(b);
    }

    /* renamed from: m */
    public static boolean m47833m(byte[] bArr) {
        return f74084a.m47813c(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static boolean m47832n(byte[] bArr, int i, int i2) {
        return f74084a.m47813c(bArr, i, i2);
    }
}
