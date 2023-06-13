package p000;

import java.util.UUID;
import kotlin.UByte;
/* renamed from: pd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46979pd6 {
    private C46979pd6() {
    }

    /* renamed from: a */
    public static UUID m19043a(byte[] bArr) {
        return m19042b(bArr, 0);
    }

    /* renamed from: b */
    public static UUID m19042b(byte[] bArr, int i) {
        return m19041c(bArr, i, true);
    }

    /* renamed from: c */
    public static UUID m19041c(byte[] bArr, int i, boolean z) {
        int i2;
        String format;
        if (bArr != null && i >= 0 && bArr.length > (i2 = i + 15) && 2147483632 >= i) {
            if (z) {
                format = String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Integer.valueOf(bArr[i2] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 14] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 13] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 12] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 11] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 10] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 9] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 8] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 7] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 6] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 5] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 4] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 3] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 2] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 1] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 0] & UByte.MAX_VALUE));
            } else {
                format = String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Integer.valueOf(bArr[i + 0] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 1] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 2] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 3] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 4] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 5] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 6] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 7] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 8] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 9] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 10] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 11] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 12] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 13] & UByte.MAX_VALUE), Integer.valueOf(bArr[i + 14] & UByte.MAX_VALUE), Integer.valueOf(bArr[i2] & UByte.MAX_VALUE));
            }
            return UUID.fromString(format);
        }
        return null;
    }

    /* renamed from: d */
    public static UUID m19040d(byte[] bArr) {
        return m19039e(bArr, 0);
    }

    /* renamed from: e */
    public static UUID m19039e(byte[] bArr, int i) {
        return m19038f(bArr, i, true);
    }

    /* renamed from: f */
    public static UUID m19038f(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        byte b;
        if (bArr != null && i >= 0 && bArr.length > (i2 = i + 1) && Integer.MAX_VALUE != i) {
            if (z) {
                i3 = bArr[i2] & UByte.MAX_VALUE;
                b = bArr[i + 0];
            } else {
                i3 = bArr[i + 0] & UByte.MAX_VALUE;
                b = bArr[i2];
            }
            return m19034j(0, 0, i3, b & UByte.MAX_VALUE);
        }
        return null;
    }

    /* renamed from: g */
    public static UUID m19037g(byte[] bArr) {
        return m19036h(bArr, 0);
    }

    /* renamed from: h */
    public static UUID m19036h(byte[] bArr, int i) {
        return m19035i(bArr, i, true);
    }

    /* renamed from: i */
    public static UUID m19035i(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (bArr != null && i >= 0 && bArr.length > (i2 = i + 3) && 2147483644 >= i) {
            if (z) {
                i3 = bArr[i2] & UByte.MAX_VALUE;
                i4 = bArr[i + 2] & UByte.MAX_VALUE;
                i6 = bArr[i + 1] & UByte.MAX_VALUE;
                i5 = bArr[i + 0] & UByte.MAX_VALUE;
            } else {
                i3 = bArr[i + 0] & UByte.MAX_VALUE;
                i4 = bArr[i + 1] & UByte.MAX_VALUE;
                int i7 = bArr[i + 2] & UByte.MAX_VALUE;
                i5 = bArr[i2] & UByte.MAX_VALUE;
                i6 = i7;
            }
            return m19034j(i3, i4, i6, i5);
        }
        return null;
    }

    /* renamed from: j */
    public static UUID m19034j(int i, int i2, int i3, int i4) {
        return UUID.fromString(String.format("%02x%02x%02x%02x-0000-1000-8000-00805f9b34fb", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }
}
