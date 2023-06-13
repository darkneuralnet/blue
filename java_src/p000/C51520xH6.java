package p000;

import com.nimbusds.jose.JOSEException;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
/* renamed from: xH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51520xH6 {
    /* renamed from: a */
    public static byte[] m5572a(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        try {
            try {
                return new C52113yH6(secretKey.getEncoded()).mo3715b(N70.m94357d(bArr, bArr2, bArr4), bArr3);
            } catch (GeneralSecurityException e) {
                throw new JOSEException("XChaCha20Poly1305 decryption failed: " + e.getMessage(), e);
            }
        } catch (GeneralSecurityException e2) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public static C1996Eq m5571b(SecretKey secretKey, C50157uz0<byte[]> c50157uz0, byte[] bArr, byte[] bArr2) throws JOSEException {
        try {
            try {
                byte[] mo3716a = new C52113yH6(secretKey.getEncoded()).mo3716a(bArr, bArr2);
                int length = mo3716a.length - N70.m94358c(128);
                int m94358c = N70.m94358c(192);
                byte[] m94354g = N70.m94354g(mo3716a, 0, m94358c);
                byte[] m94354g2 = N70.m94354g(mo3716a, m94358c, length - m94358c);
                byte[] m94354g3 = N70.m94354g(mo3716a, length, N70.m94358c(128));
                c50157uz0.m9419b(m94354g);
                return new C1996Eq(m94354g2, m94354g3);
            } catch (GeneralSecurityException e) {
                throw new JOSEException("Couldn't encrypt with XChaCha20Poly1305: " + e.getMessage(), e);
            }
        } catch (GeneralSecurityException e2) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e2.getMessage(), e2);
        }
    }
}
