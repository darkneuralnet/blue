package p000;
/* renamed from: jx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43623jx8 {

    /* renamed from: a */
    public static final AbstractC52506yw8 f93624a;

    static {
        if (C37192Xv8.m76081C() && C37192Xv8.m76080D()) {
            int i = C49267tU7.f110543a;
        }
        f93624a = new C34159Kw8();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m29600c(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m29593j(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m29594i(b, bArr[i]);
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
        return r9 + r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m29599d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = 0;
        while (true) {
            i3 = i + i2;
            if (i7 >= length || (i6 = i7 + i) >= i3 || (charAt = charSequence.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i7++;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i3) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else {
                if (charAt2 < 2048 && i8 <= i3 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i3 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i3 - 4) {
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
                    throw new C37435Yw8(i7 - 1, length);
                } else if (charAt2 >= 55296 && charAt2 <= 57343 && ((i5 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                    throw new C37435Yw8(i7, length);
                } else {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                }
                i7++;
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* renamed from: e */
    public static int m29598e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C37435Yw8(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* renamed from: f */
    public static int m29597f(int i, byte[] bArr, int i2, int i3) {
        return f93624a.mo2235a(i, bArr, i2, i3);
    }

    /* renamed from: g */
    public static boolean m29596g(byte[] bArr) {
        return f93624a.m2234b(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static boolean m29595h(byte[] bArr, int i, int i2) {
        return f93624a.m2234b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m29594i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: j */
    public static int m29593j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
