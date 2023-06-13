package p000;

import com.google.android.gms.internal.auth.zzew;
/* renamed from: Pu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35311Pu8 {

    /* renamed from: a */
    public static final AbstractC46558ou8 f29386a;

    static {
        if (C38229at8.m65301u() && C38229at8.m65300v()) {
            int i = Q28.f29740a;
        }
        f29386a = new C32035Bu8();
    }

    /* renamed from: a */
    public static /* synthetic */ int m89446a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b <= -12 && b2 <= -65 && b3 <= -65) {
                        return ((b2 << 8) ^ b) ^ (b3 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b4 = bArr[i];
                if (b <= -12 && b4 <= -65) {
                    return b ^ (b4 << 8);
                }
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public static String m89445b(byte[] bArr, int i, int i2) throws zzew {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C37642Zt8.m72337d(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (C37642Zt8.m72337d(b2)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (!C37642Zt8.m72337d(b3)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                        }
                    }
                } else if (b2 < -32) {
                    if (i5 < i3) {
                        C37642Zt8.m72339b(b2, bArr[i5], cArr, i4);
                        i = i5 + 1;
                        i4++;
                    } else {
                        throw zzew.m51578b();
                    }
                } else if (b2 < -16) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        C37642Zt8.m72338c(b2, bArr[i5], bArr[i7], cArr, i4);
                        i = i7 + 1;
                        i4++;
                    } else {
                        throw zzew.m51578b();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    C37642Zt8.m72340a(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                } else {
                    throw zzew.m51578b();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: c */
    public static boolean m89444c(byte[] bArr) {
        return f29386a.m20286b(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static boolean m89443d(byte[] bArr, int i, int i2) {
        return f29386a.m20286b(bArr, i, i2);
    }
}
