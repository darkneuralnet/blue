package p000;

import com.amazonaws.services.p026s3.internal.crypto.S3KeyWrapScheme;
import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
/* renamed from: tm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49438tm4 {
    private C49438tm4() {
    }

    /* renamed from: a */
    public static byte[] m11795a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i, Provider provider) throws JOSEException {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING;
            str2 = "SHA-256";
        } else if (384 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else if (512 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        } else {
            throw new JOSEException("Unsupported SHA-2 bit size: " + i);
        }
        try {
            AlgorithmParameters m104282a = C3045H9.m104282a("OAEP", provider);
            m104282a.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher m8239a = C50589vj0.m8239a(str, provider);
            m8239a.init(1, rSAPublicKey, m104282a);
            return m8239a.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
