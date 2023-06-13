package p000;

import com.nimbusds.jose.JOSEException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
/* renamed from: lm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44695lm4 {
    private C44695lm4() {
    }

    /* renamed from: a */
    public static byte[] m26842a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher m8239a = C50589vj0.m8239a("RSA/ECB/PKCS1Padding", provider);
            m8239a.init(1, rSAPublicKey);
            return m8239a.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException("Couldn't encrypt Content Encryption Key (CEK): " + e2.getMessage(), e2);
        }
    }
}
