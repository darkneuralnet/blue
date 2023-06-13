package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: yI8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52124yI8 {

    /* renamed from: a */
    public static final Charset f119325a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: b */
    public static final Charset f119326b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f119327c;

    /* renamed from: d */
    public static final ByteBuffer f119328d;

    /* renamed from: e */
    public static final WB8 f119329e;

    static {
        byte[] bArr = new byte[0];
        f119327c = bArr;
        f119328d = ByteBuffer.wrap(bArr);
        f119329e = WB8.m78739c(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static int m3694a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static int m3693b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static int m3692c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static <T> T m3691d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    public static Object m3690e(Object obj, Object obj2) {
        return ((InterfaceC44489lQ8) obj).mo27297d().mo85476K((InterfaceC44489lQ8) obj2).zze();
    }

    /* renamed from: f */
    public static <T> T m3689f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static boolean m3688g(InterfaceC44489lQ8 interfaceC44489lQ8) {
        if (interfaceC44489lQ8 instanceof AbstractC32980Fv8) {
            AbstractC32980Fv8 abstractC32980Fv8 = (AbstractC32980Fv8) interfaceC44489lQ8;
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m3687h(byte[] bArr) {
        return C49582u09.m11098f(bArr);
    }

    /* renamed from: i */
    public static String m3686i(byte[] bArr) {
        return new String(bArr, f119325a);
    }

    /* renamed from: j */
    public static int m3685j(byte[] bArr) {
        int length = bArr.length;
        int m3694a = m3694a(length, bArr, 0, length);
        if (m3694a == 0) {
            return 1;
        }
        return m3694a;
    }
}
