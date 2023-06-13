package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoRuntime */
/* loaded from: classes3.dex */
public class CryptoRuntime {
    private static final String BC_PROVIDER_FQCN = "org.bouncycastle.jce.provider.BouncyCastleProvider";
    static final String BOUNCY_CASTLE_PROVIDER = "BC";
    private static final Log LOGGER = LogFactory.getLog(CryptoRuntime.class);

    /* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoRuntime$AesGcm */
    /* loaded from: classes3.dex */
    public static final class AesGcm {
        private AesGcm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean check(Provider provider) {
            try {
                Cipher.getInstance(ContentCryptoScheme.AES_GCM.getCipherAlgorithm(), provider);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoRuntime$RsaEcbOaepWithSHA256AndMGF1Padding */
    /* loaded from: classes3.dex */
    public static final class RsaEcbOaepWithSHA256AndMGF1Padding {
        private RsaEcbOaepWithSHA256AndMGF1Padding() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean check(Provider provider) {
            try {
                Cipher.getInstance(S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING, provider);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static synchronized void enableBouncyCastle() {
        synchronized (CryptoRuntime.class) {
            if (isBouncyCastleAvailable()) {
                return;
            }
            try {
                String str = C46609p00.f102888b;
                Security.addProvider((Provider) C46609p00.class.newInstance());
            } catch (Exception e) {
                LOGGER.debug("Bouncy Castle not available", e);
            }
        }
    }

    public static boolean isAesGcmAvailable(Provider provider) {
        if (provider == null) {
            provider = Security.getProvider(BOUNCY_CASTLE_PROVIDER);
        }
        return AesGcm.check(provider);
    }

    public static synchronized boolean isBouncyCastleAvailable() {
        boolean z;
        synchronized (CryptoRuntime.class) {
            if (Security.getProvider(BOUNCY_CASTLE_PROVIDER) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static boolean isRsaKeyWrapAvailable(Provider provider) {
        if (provider == null) {
            provider = Security.getProvider(BOUNCY_CASTLE_PROVIDER);
        }
        return RsaEcbOaepWithSHA256AndMGF1Padding.check(provider);
    }
}