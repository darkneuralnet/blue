package com.stripe.android.stripe3ds2.security;

import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "Ljava/io/Serializable;", "generate", "Ljavax/crypto/SecretKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "sdkPrivateKey", "Ljava/security/interfaces/ECPrivateKey;", "agreementInfo", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface DiffieHellmanKeyGenerator extends Serializable {
    SecretKey generate(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, String str);
}
