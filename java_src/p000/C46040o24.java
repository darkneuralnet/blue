package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p000.V46;
/* renamed from: o24  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46040o24 implements InterfaceC45447n24 {

    /* renamed from: d */
    public static final V46.EnumC8541b f101250d = V46.EnumC8541b.f38570b;

    /* renamed from: a */
    public final SecretKey f101251a;

    /* renamed from: b */
    public byte[] f101252b;

    /* renamed from: c */
    public byte[] f101253c;

    public C46040o24(byte[] bArr) throws GeneralSecurityException {
        C31700Aj6.m115338a(bArr.length);
        this.f101251a = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        m21960b();
    }

    /* renamed from: c */
    public static Cipher m21959c() throws GeneralSecurityException {
        if (f101250d.mo80443a()) {
            return C32577Ed1.f7880e.m108639a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // p000.InterfaceC45447n24
    /* renamed from: a */
    public byte[] mo20026a(byte[] bArr, int i) throws GeneralSecurityException {
        boolean z;
        byte[] m84293e;
        if (i <= 16) {
            Cipher m21959c = m21959c();
            m21959c.init(1, this.f101251a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 == bArr.length) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m84293e = T70.m84294d(bArr, (max - 1) * 16, this.f101252b, 0, 16);
            } else {
                m84293e = T70.m84293e(C13411c9.m61908a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f101253c);
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = m21959c.doFinal(T70.m84294d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(m21959c.doFinal(T70.m84293e(m84293e, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    /* renamed from: b */
    public final void m21960b() throws GeneralSecurityException {
        Cipher m21959c = m21959c();
        m21959c.init(1, this.f101251a);
        byte[] m61907b = C13411c9.m61907b(m21959c.doFinal(new byte[16]));
        this.f101252b = m61907b;
        this.f101253c = C13411c9.m61907b(m61907b);
    }
}
