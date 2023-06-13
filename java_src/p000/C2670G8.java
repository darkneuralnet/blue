package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.V46;
/* renamed from: G8 */
/* loaded from: classes6.dex */
public final class C2670G8 implements InterfaceC43656k12 {

    /* renamed from: d */
    public static final V46.EnumC8541b f11033d = V46.EnumC8541b.f38571c;

    /* renamed from: e */
    public static final ThreadLocal<Cipher> f11034e = new C2671a();

    /* renamed from: a */
    public final SecretKeySpec f11035a;

    /* renamed from: b */
    public final int f11036b;

    /* renamed from: c */
    public final int f11037c;

    /* renamed from: G8$a */
    /* loaded from: classes6.dex */
    public class C2671a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C32577Ed1.f7880e.m108639a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C2670G8(byte[] bArr, int i) throws GeneralSecurityException {
        if (f11033d.mo80443a()) {
            C31700Aj6.m115338a(bArr.length);
            this.f11035a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            int blockSize = f11034e.get().getBlockSize();
            this.f11037c = blockSize;
            if (i >= 12 && i <= blockSize) {
                this.f11036b = i;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // p000.InterfaceC43656k12
    /* renamed from: a */
    public byte[] mo29455a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f11036b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[bArr.length + i];
            byte[] m43714c = C39961dn4.m43714c(i);
            System.arraycopy(m43714c, 0, bArr2, 0, this.f11036b);
            m105719c(bArr, 0, bArr.length, bArr2, this.f11036b, m43714c, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f11036b));
    }

    @Override // p000.InterfaceC43656k12
    /* renamed from: b */
    public byte[] mo29454b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f11036b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f11036b;
            byte[] bArr3 = new byte[length2 - i2];
            m105719c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: c */
    public final void m105719c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = f11034e.get();
        byte[] bArr4 = new byte[this.f11037c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f11036b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f11035a, ivParameterSpec);
        } else {
            cipher.init(2, this.f11035a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
