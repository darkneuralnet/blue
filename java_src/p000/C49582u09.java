package p000;

import com.google.android.gms.internal.vision.zzjk;
/* renamed from: u09  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49582u09 {

    /* renamed from: a */
    public static final E09 f111478a;

    static {
        boolean z;
        E09 c41291g19;
        if (SZ8.m85251m() && SZ8.m85246r()) {
            z = true;
        } else {
            z = false;
        }
        if (z && !C36256Tv8.m82238b()) {
            c41291g19 = new C52556z19();
        } else {
            c41291g19 = new C41291g19();
        }
        f111478a = c41291g19;
    }

    /* renamed from: d */
    public static int m11100d(CharSequence charSequence) {
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
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new X09(i2, length2);
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public static int m11099e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f111478a.mo1993b(charSequence, bArr, i, i2);
    }

    /* renamed from: f */
    public static boolean m11098f(byte[] bArr) {
        return f111478a.m109496c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m11097g(byte[] bArr, int i, int i2) {
        return f111478a.m109496c(bArr, i, i2);
    }

    /* renamed from: h */
    public static int m11096h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: i */
    public static int m11095i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: j */
    public static int m11094j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: k */
    public static String m11093k(byte[] bArr, int i, int i2) throws zzjk {
        return f111478a.mo1992d(bArr, i, i2);
    }

    /* renamed from: m */
    public static int m11091m(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m11094j(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m11095i(b, bArr[i]);
        }
        return m11096h(b);
    }
}
