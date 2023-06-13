package p000;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: So2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35953So2 {
    private C35953So2() {
    }

    /* renamed from: a */
    public static C25075k m84813a(SecretKey secretKey, boolean z) {
        C25075k c25075k = new C25075k();
        c25075k.mo29505c(z, new C52973zk2(secretKey.getEncoded()));
        return c25075k;
    }

    /* renamed from: b */
    public static JA1 m84812b(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        JA1 ja1 = new JA1(m84813a(secretKey, z));
        ja1.m101062i(z, new C22857i(new C52973zk2(secretKey.getEncoded()), 128, bArr, bArr2));
        return ja1;
    }

    /* renamed from: c */
    public static byte[] m84811c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        JA1 m84812b = m84812b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[m84812b.m101063h(length)];
        try {
            m84812b.m101069b(bArr6, m84812b.m101058m(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (InvalidCipherTextException e) {
            throw new JOSEException("Couldn't validate GCM authentication tag: " + e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public static C1996Eq m84810d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        JA1 m84812b = m84812b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[m84812b.m101063h(bArr2.length)];
        int m101058m = m84812b.m101058m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int m101069b = (m101058m + m84812b.m101069b(bArr4, m101058m)) - 16;
            byte[] bArr5 = new byte[m101069b];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, m101069b);
            System.arraycopy(bArr4, m101069b, bArr6, 0, 16);
            return new C1996Eq(bArr5, bArr6);
        } catch (InvalidCipherTextException e) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e.getMessage(), e);
        }
    }
}
