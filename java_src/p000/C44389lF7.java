package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: lF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44389lF7 {

    /* renamed from: a */
    public static final Charset f95796a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: b */
    public static final Charset f95797b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f95798c;

    /* renamed from: d */
    public static final ByteBuffer f95799d;

    /* renamed from: e */
    public static final AbstractC36642Vm7 f95800e;

    static {
        byte[] bArr = new byte[0];
        f95798c = bArr;
        f95799d = ByteBuffer.wrap(bArr);
        f95800e = AbstractC36642Vm7.m79424c(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static <T> T m27619a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static int m27618b(byte[] bArr) {
        int length = bArr.length;
        int m27617c = m27617c(length, bArr, 0, length);
        if (m27617c == 0) {
            return 1;
        }
        return m27617c;
    }

    /* renamed from: c */
    public static int m27617c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    public static Object m27616d(Object obj, Object obj2) {
        return ((InterfaceC52815zT7) obj).mo1331e().mo27253h3((InterfaceC52815zT7) obj2).mo27251v();
    }

    /* renamed from: e */
    public static <T> T m27615e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static int m27614f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static boolean m27613g(byte[] bArr) {
        return U68.m81957g(bArr);
    }

    /* renamed from: h */
    public static String m27612h(byte[] bArr) {
        return new String(bArr, f95796a);
    }

    /* renamed from: i */
    public static boolean m27611i(InterfaceC52815zT7 interfaceC52815zT7) {
        return false;
    }

    /* renamed from: j */
    public static int m27610j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
