package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: M81 */
/* loaded from: classes6.dex */
public class M81 {
    private M81() {
    }

    /* renamed from: a */
    public static SecretKey m95690a(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
        KeyAgreement keyAgreement;
        try {
            if (provider != null) {
                keyAgreement = KeyAgreement.getInstance("ECDH", provider);
            } else {
                keyAgreement = KeyAgreement.getInstance("ECDH");
            }
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            } catch (InvalidKeyException e) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e.getMessage(), e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e2.getMessage(), e2);
        }
    }
}
