package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: kc9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44007kc9 {

    /* renamed from: a */
    public static final Charset f94653a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f94654b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f94655c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f94656d;

    /* renamed from: e */
    public static final ByteBuffer f94657e;

    /* renamed from: f */
    public static final C50837w79 f94658f;

    static {
        byte[] bArr = new byte[0];
        f94656d = bArr;
        f94657e = ByteBuffer.wrap(bArr);
        int i = C50837w79.f115394a;
        C41944h79 c41944h79 = new C41944h79(bArr, 0, 0, false, null);
        try {
            c41944h79.m36836c(0);
            f94658f = c41944h79;
        } catch (zzov e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m28739a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m28738b(byte[] bArr) {
        int length = bArr.length;
        int m28736d = m28736d(length, bArr, 0, length);
        if (m28736d == 0) {
            return 1;
        }
        return m28736d;
    }

    /* renamed from: c */
    public static int m28737c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m28736d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static Object m28735e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    public static Object m28734f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m28733g(Object obj, Object obj2) {
        return ((InterfaceC47012pg9) obj).mo9981r().mo16552Y0((InterfaceC47012pg9) obj2).zzs();
    }

    /* renamed from: h */
    public static String m28732h(byte[] bArr) {
        return new String(bArr, f94654b);
    }

    /* renamed from: i */
    public static boolean m28731i(InterfaceC47012pg9 interfaceC47012pg9) {
        if (!(interfaceC47012pg9 instanceof J39)) {
            return false;
        }
        J39 j39 = (J39) interfaceC47012pg9;
        throw null;
    }

    /* renamed from: j */
    public static boolean m28730j(byte[] bArr) {
        return Zm9.m72527e(bArr);
    }
}
