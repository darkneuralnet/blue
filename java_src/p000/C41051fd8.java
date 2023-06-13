package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.auth.zzew;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: fd8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41051fd8 {

    /* renamed from: a */
    public static final Charset f80380a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: b */
    public static final Charset f80381b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f80382c;

    /* renamed from: d */
    public static final ByteBuffer f80383d;

    /* renamed from: e */
    public static final C47883r88 f80384e;

    static {
        byte[] bArr = new byte[0];
        f80382c = bArr;
        f80383d = ByteBuffer.wrap(bArr);
        int i = C47883r88.f106524a;
        C38378b88 c38378b88 = new C38378b88(bArr, 0, 0, false, null);
        try {
            c38378b88.m64930c(0);
            f80384e = c38378b88;
        } catch (zzew e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m41094a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m41093b(byte[] bArr) {
        int length = bArr.length;
        int m41091d = m41091d(length, bArr, 0, length);
        if (m41091d == 0) {
            return 1;
        }
        return m41091d;
    }

    /* renamed from: c */
    public static int m41092c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m41091d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static <T> T m41090e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static <T> T m41089f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m41088g(Object obj, Object obj2) {
        return ((InterfaceC34042Kj8) obj).zze().mo4766J1((InterfaceC34042Kj8) obj2).zzg();
    }

    /* renamed from: h */
    public static String m41087h(byte[] bArr) {
        return new String(bArr, f80380a);
    }

    /* renamed from: i */
    public static boolean m41086i(byte[] bArr) {
        return C35311Pu8.m89444c(bArr);
    }
}
