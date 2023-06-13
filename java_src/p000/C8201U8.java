package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: U8 */
/* loaded from: classes6.dex */
public final class C8201U8 implements InterfaceC27152p8 {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f36883b = new C8202a();

    /* renamed from: a */
    public final SecretKey f36884a;

    /* renamed from: U8$a */
    /* loaded from: classes6.dex */
    public class C8202a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C32577Ed1.f7880e.m108639a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C8201U8(byte[] bArr) throws GeneralSecurityException {
        C31700Aj6.m115338a(bArr.length);
        this.f36884a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m81932c(byte[] bArr) throws GeneralSecurityException {
        return m81931d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m81931d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i, i2);
        } catch (ClassNotFoundException unused) {
            if (C50441vT5.m8617b()) {
                return new IvParameterSpec(bArr, i, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] m43714c = C39961dn4.m43714c(12);
            System.arraycopy(m43714c, 0, bArr3, 0, 12);
            AlgorithmParameterSpec m81932c = m81932c(m43714c);
            ThreadLocal<Cipher> threadLocal = f36883b;
            threadLocal.get().init(1, this.f36884a, m81932c);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec m81931d = m81931d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f36883b;
            threadLocal.get().init(2, this.f36884a, m81931d);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
