package p000;

import com.nimbusds.jose.util.IntegerOverflowException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* renamed from: N70 */
/* loaded from: classes6.dex */
public class N70 {
    /* renamed from: a */
    public static int m94360a(int i) {
        return i * 8;
    }

    /* renamed from: b */
    public static int m94359b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return m94360a(bArr.length);
    }

    /* renamed from: c */
    public static int m94358c(int i) {
        return i / 8;
    }

    /* renamed from: d */
    public static byte[] m94357d(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public static int m94356e(int i) throws IntegerOverflowException {
        long j = i * 8;
        int i2 = (int) j;
        if (i2 == j) {
            return i2;
        }
        throw new IntegerOverflowException();
    }

    /* renamed from: f */
    public static int m94355f(byte[] bArr) throws IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return m94356e(bArr.length);
    }

    /* renamed from: g */
    public static byte[] m94354g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
