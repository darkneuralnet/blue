package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: Fa8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32791Fa8 {

    /* renamed from: a */
    public static final Charset f9736a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f9737b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f9738c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f9739d;

    /* renamed from: e */
    public static final ByteBuffer f9740e;

    /* renamed from: f */
    public static final C44245l08 f9741f;

    static {
        byte[] bArr = new byte[0];
        f9739d = bArr;
        f9740e = ByteBuffer.wrap(bArr);
        int i = C44245l08.f95356a;
        IZ7 iz7 = new IZ7(bArr, 0, 0, false, null);
        try {
            iz7.m101925c(0);
            f9741f = iz7;
        } catch (zzeo e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m106928a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m106927b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m106926c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m106925d(byte[] bArr) {
        return new String(bArr, f9737b);
    }
}
