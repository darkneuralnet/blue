package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: aT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37975aT7 {

    /* renamed from: a */
    public static final Charset f50512a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: b */
    public static final Charset f50513b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f50514c;

    /* renamed from: d */
    public static final ByteBuffer f50515d;

    /* renamed from: e */
    public static final HK7 f50516e;

    static {
        byte[] bArr = new byte[0];
        f50514c = bArr;
        f50515d = ByteBuffer.wrap(bArr);
        f50516e = HK7.m103990b(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static <T> T m71332a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static int m71331b(byte[] bArr) {
        int length = bArr.length;
        int m71330c = m71330c(length, bArr, 0, length);
        if (m71330c == 0) {
            return 1;
        }
        return m71330c;
    }

    /* renamed from: c */
    public static int m71330c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    public static Object m71329d(Object obj, Object obj2) {
        return ((H28) obj).mo51556l().mo37303g3((H28) obj2).mo51551c2();
    }

    /* renamed from: e */
    public static <T> T m71328e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static int m71327f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static boolean m71326g(byte[] bArr) {
        return C31909Bg8.m113678h(bArr);
    }

    /* renamed from: h */
    public static String m71325h(byte[] bArr) {
        return new String(bArr, f50512a);
    }

    /* renamed from: i */
    public static boolean m71324i(H28 h28) {
        return false;
    }

    /* renamed from: j */
    public static int m71323j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
