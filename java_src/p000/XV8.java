package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.measurement.zzll;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: XV8 */
/* loaded from: classes5.dex */
public final class XV8 {

    /* renamed from: a */
    public static final Charset f43341a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f43342b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f43343c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f43344d;

    /* renamed from: e */
    public static final ByteBuffer f43345e;

    /* renamed from: f */
    public static final ZO8 f43346f;

    static {
        byte[] bArr = new byte[0];
        f43344d = bArr;
        f43345e = ByteBuffer.wrap(bArr);
        int i = ZO8.f48492a;
        DO8 do8 = new DO8(bArr, 0, 0, false, null);
        try {
            do8.m110543c(0);
            f43346f = do8;
        } catch (zzll e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m76919a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m76918b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m76917c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m76916d(byte[] bArr) {
        return new String(bArr, f43342b);
    }
}
