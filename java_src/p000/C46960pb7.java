package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: pb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46960pb7 {

    /* renamed from: a */
    public static final Charset f103839a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f103840b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f103841c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f103842d;

    /* renamed from: e */
    public static final ByteBuffer f103843e;

    /* renamed from: f */
    public static final C33024Ga7 f103844f;

    static {
        byte[] bArr = new byte[0];
        f103842d = bArr;
        f103843e = ByteBuffer.wrap(bArr);
        int i = C33024Ga7.f12118a;
        C32556Ea7 c32556Ea7 = new C32556Ea7(bArr, 0, 0, false, null);
        try {
            c32556Ea7.m108743c(0);
            f103844f = c32556Ea7;
        } catch (zbuw e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m19081a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m19080b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m19079c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m19078d(byte[] bArr) {
        return new String(bArr, f103840b);
    }

    /* renamed from: e */
    public static boolean m19077e(InterfaceC36075Tb7 interfaceC36075Tb7) {
        if (!(interfaceC36075Tb7 instanceof AbstractC41020fa7)) {
            return false;
        }
        AbstractC41020fa7 abstractC41020fa7 = (AbstractC41020fa7) interfaceC36075Tb7;
        throw null;
    }
}
