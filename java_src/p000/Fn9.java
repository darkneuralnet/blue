package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: Fn9 */
/* loaded from: classes6.dex */
public final class Fn9 {

    /* renamed from: a */
    public static final Charset f10238a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: b */
    public static final Charset f10239b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f10240c;

    /* renamed from: d */
    public static final ByteBuffer f10241d;

    /* renamed from: e */
    public static final AbstractC49403ti9 f10242e;

    static {
        byte[] bArr = new byte[0];
        f10240c = bArr;
        f10241d = ByteBuffer.wrap(bArr);
        f10242e = AbstractC49403ti9.m11871g(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m106454a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m106453b(byte[] bArr) {
        int length = bArr.length;
        int m106451d = m106451d(length, bArr, 0, length);
        if (m106451d == 0) {
            return 1;
        }
        return m106451d;
    }

    /* renamed from: c */
    public static int m106452c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m106451d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static <T> T m106450e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static <T> T m106449f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m106448g(Object obj, Object obj2) {
        return ((Np9) obj).mo81207t().mo98240p0((Np9) obj2).mo64028b();
    }

    /* renamed from: h */
    public static String m106447h(byte[] bArr) {
        return new String(bArr, f10238a);
    }

    /* renamed from: i */
    public static boolean m106446i(Np9 np9) {
        if (np9 instanceof Ue9) {
            Ue9 ue9 = (Ue9) np9;
            throw null;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m106445j(byte[] bArr) {
        return Ps9.m89656e(bArr);
    }
}
