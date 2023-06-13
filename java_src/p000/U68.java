package p000;

import com.google.android.gms.internal.places.zzbk;
/* renamed from: U68 */
/* loaded from: classes5.dex */
public final class U68 {

    /* renamed from: a */
    public static final AbstractC52022y78 f36871a;

    static {
        boolean z;
        AbstractC52022y78 c43129j78;
        if (C49038t58.m13106o() && C49038t58.m13105p()) {
            z = true;
        } else {
            z = false;
        }
        if (z && !C41645gd9.m37944b()) {
            c43129j78 = new O78();
        } else {
            c43129j78 = new C43129j78();
        }
        f36871a = c43129j78;
    }

    /* renamed from: a */
    public static int m81963a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: c */
    public static int m81961c(CharSequence charSequence) {
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
                                throw new C40174e88(i2, length2);
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

    /* renamed from: d */
    public static int m81960d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f36871a.mo4110b(charSequence, bArr, i, i2);
    }

    /* renamed from: e */
    public static int m81959e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: g */
    public static boolean m81957g(byte[] bArr) {
        return f36871a.m4109c(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static boolean m81956h(byte[] bArr, int i, int i2) {
        return f36871a.m4109c(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m81955i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m81959e(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m81952l(b, bArr[i]);
        }
        return m81963a(b);
    }

    /* renamed from: j */
    public static String m81954j(byte[] bArr, int i, int i2) throws zzbk {
        return f36871a.mo4108d(bArr, i, i2);
    }

    /* renamed from: l */
    public static int m81952l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
