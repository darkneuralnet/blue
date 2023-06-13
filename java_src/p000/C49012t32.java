package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.V46;
/* renamed from: t32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49012t32 {

    /* renamed from: c */
    public static final V46.EnumC8541b f109777c = V46.EnumC8541b.f38571c;

    /* renamed from: d */
    public static final ThreadLocal<Cipher> f109778d = new C28513a();

    /* renamed from: a */
    public final SecretKey f109779a;

    /* renamed from: b */
    public final boolean f109780b;

    /* renamed from: t32$a */
    /* loaded from: classes6.dex */
    public class C28513a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C32577Ed1.f7880e.m108639a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C49012t32(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (f109777c.mo80443a()) {
            C31700Aj6.m115338a(bArr.length);
            this.f109779a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            this.f109780b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m13188c(byte[] bArr) throws GeneralSecurityException {
        return m13187d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m13187d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (C50441vT5.m8617b() && C50441vT5.m8618a() <= 19) {
            return new IvParameterSpec(bArr, i, i2);
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    /* renamed from: a */
    public byte[] m13190a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int length;
        if (bArr.length == 12) {
            boolean z = this.f109780b;
            if (z) {
                i = 28;
            } else {
                i = 16;
            }
            if (bArr2.length >= i) {
                int i2 = 0;
                if (z && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec m13188c = m13188c(bArr);
                ThreadLocal<Cipher> threadLocal = f109778d;
                threadLocal.get().init(2, this.f109779a, m13188c);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                boolean z2 = this.f109780b;
                if (z2) {
                    i2 = 12;
                }
                if (z2) {
                    length = bArr2.length - 12;
                } else {
                    length = bArr2.length;
                }
                return threadLocal.get().doFinal(bArr2, i2, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    /* renamed from: b */
    public byte[] m13189b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length;
        int i;
        if (bArr.length == 12) {
            if (bArr2.length <= 2147483619) {
                boolean z = this.f109780b;
                if (z) {
                    length = bArr2.length + 12;
                } else {
                    length = bArr2.length;
                }
                byte[] bArr4 = new byte[length + 16];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec m13188c = m13188c(bArr);
                ThreadLocal<Cipher> threadLocal = f109778d;
                threadLocal.get().init(1, this.f109779a, m13188c);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                if (this.f109780b) {
                    i = 12;
                } else {
                    i = 0;
                }
                int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i);
                if (doFinal == bArr2.length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
