package p000;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.EncoderException;
/* renamed from: LL1 */
/* loaded from: classes8.dex */
public class LL1 {

    /* renamed from: a */
    public static final NL1 f21295a = new NL1();

    /* renamed from: a */
    public static byte[] m97054a(byte[] bArr) {
        return m97053b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static byte[] m97053b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f21295a.m94051a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m97052c(byte[] bArr) {
        return m97051d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static String m97051d(byte[] bArr, int i, int i2) {
        return C46876pS5.m19298b(m97053b(bArr, i, i2));
    }
}
