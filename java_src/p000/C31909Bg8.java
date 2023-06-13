package p000;

import java.nio.ByteBuffer;
/* renamed from: Bg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31909Bg8 {

    /* renamed from: a */
    public static final AbstractC35419Qg8 f2689a;

    static {
        f2689a = C35410Qf8.m88222x() && C35410Qf8.m88221y() ? new C33790Jh8() : new C41684gh8();
    }

    /* renamed from: a */
    public static int m113685a(CharSequence charSequence) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C49985uh8(i2, length2);
                            }
                            i2++;
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m113684b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f2689a.mo37891b(charSequence, bArr, i, i2);
    }

    /* renamed from: c */
    public static void m113683c(CharSequence charSequence, ByteBuffer byteBuffer) {
        AbstractC35419Qg8 abstractC35419Qg8 = f2689a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m113684b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            abstractC35419Qg8.mo37890c(charSequence, byteBuffer);
        } else {
            AbstractC35419Qg8.m88192d(charSequence, byteBuffer);
        }
    }

    /* renamed from: d */
    public static int m113682d(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: f */
    public static int m113680f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: h */
    public static boolean m113678h(byte[] bArr) {
        return f2689a.m88191e(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static boolean m113677i(byte[] bArr, int i, int i2) {
        return f2689a.m88191e(bArr, i, i2);
    }

    /* renamed from: j */
    public static int m113676j(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m113680f(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m113674l(b, bArr[i]);
        }
        return m113682d(b);
    }

    /* renamed from: l */
    public static int m113674l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
