package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: M52 */
/* loaded from: classes8.dex */
public final class M52 {

    /* renamed from: a */
    public static final BigInteger f22608a = BigInteger.valueOf(0);

    /* renamed from: b */
    public static final BigInteger f22609b = BigInteger.valueOf(1);

    /* renamed from: c */
    public static final BigInteger f22610c = BigInteger.valueOf(2);

    /* renamed from: d */
    public static final BigInteger f22611d = BigInteger.valueOf(4);

    /* renamed from: e */
    public static final int[] f22612e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: f */
    public static SecureRandom f22613f = null;

    /* renamed from: g */
    public static final int[] f22614g = {0, 1, 0, -1, 0, -1, 0, 1};

    private M52() {
    }

    /* renamed from: a */
    public static int m95835a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
