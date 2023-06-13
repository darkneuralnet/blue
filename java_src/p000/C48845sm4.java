package p000;

import com.nimbusds.jose.JOSEException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
/* renamed from: sm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48845sm4 {
    private C48845sm4() {
    }

    /* renamed from: a */
    public static byte[] m13698a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher m8239a = C50589vj0.m8239a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            m8239a.init(1, rSAPublicKey, new SecureRandom());
            return m8239a.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
