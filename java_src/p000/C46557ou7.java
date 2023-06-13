package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: ou7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46557ou7 {

    /* renamed from: a */
    public static final Charset f102751a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f102752b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f102753c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f102754d;

    /* renamed from: e */
    public static final ByteBuffer f102755e;

    /* renamed from: f */
    public static final AbstractC46547ot7 f102756f;

    static {
        byte[] bArr = new byte[0];
        f102754d = bArr;
        f102755e = ByteBuffer.wrap(bArr);
        f102756f = AbstractC46547ot7.m20345g(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m20297a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m20296b(byte[] bArr) {
        int length = bArr.length;
        int m20294d = m20294d(length, bArr, 0, length);
        if (m20294d == 0) {
            return 1;
        }
        return m20294d;
    }

    /* renamed from: c */
    public static int m20295c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m20294d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m20293e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    public static Object m20292f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m20291g(Object obj, Object obj2) {
        return ((InterfaceC41230fv7) obj).mo189z().mo4530D0((InterfaceC41230fv7) obj2).zzv();
    }

    /* renamed from: h */
    public static String m20290h(byte[] bArr) {
        return new String(bArr, f102752b);
    }

    /* renamed from: i */
    public static boolean m20289i(InterfaceC41230fv7 interfaceC41230fv7) {
        if (!(interfaceC41230fv7 instanceof AbstractC53058zs7)) {
            return false;
        }
        AbstractC53058zs7 abstractC53058zs7 = (AbstractC53058zs7) interfaceC41230fv7;
        throw null;
    }

    /* renamed from: j */
    public static boolean m20288j(byte[] bArr) {
        return C33456Hw7.m103207h(bArr);
    }
}
