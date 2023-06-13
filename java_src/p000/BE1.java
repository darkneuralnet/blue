package p000;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: BE1 */
/* loaded from: classes6.dex */
public class BE1 {
    /* renamed from: a */
    public static byte[] m114199a(String str, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        return m114198b(new SecretKeySpec(bArr, str), bArr2, provider);
    }

    /* renamed from: b */
    public static byte[] m114198b(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        Mac m114197c = m114197c(secretKey, provider);
        m114197c.update(bArr);
        return m114197c.doFinal();
    }

    /* renamed from: c */
    public static Mac m114197c(SecretKey secretKey, Provider provider) throws JOSEException {
        Mac mac;
        try {
            if (provider != null) {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } else {
                mac = Mac.getInstance(secretKey.getAlgorithm());
            }
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }
}
