package p000;

import com.nimbusds.jose.util.IntegerOverflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
/* renamed from: c */
/* loaded from: classes6.dex */
public class C13360c {
    /* renamed from: a */
    public static byte[] m62053a(C3824Iy c3824Iy) {
        return c3824Iy.toString().getBytes(StandardCharsets.US_ASCII);
    }

    /* renamed from: b */
    public static byte[] m62052b(C38696bh2 c38696bh2) {
        return m62053a(c38696bh2.m3723h());
    }

    /* renamed from: c */
    public static byte[] m62051c(byte[] bArr) throws IntegerOverflowException {
        return ByteBuffer.allocate(8).putLong(N70.m94355f(bArr)).array();
    }
}
