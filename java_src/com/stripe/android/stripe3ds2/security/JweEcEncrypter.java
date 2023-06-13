package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C38696bh2;
import p000.Q81;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;", "", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "dhKeyGenerator", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;)V", "encrypt", "", "payload", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "directoryServerId", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class JweEcEncrypter {
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final EphemeralKeyPairGenerator ephemeralKeyPairGenerator;

    private JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator) {
        this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator;
        this.dhKeyGenerator = diffieHellmanKeyGenerator;
    }

    public final String encrypt(String payload, ECPublicKey acsPublicKey, String directoryServerId) throws ParseException, JOSEException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        C44643lh2.m26994e(payload);
        KeyPair generate = this.ephemeralKeyPairGenerator.generate();
        DiffieHellmanKeyGenerator diffieHellmanKeyGenerator = this.dhKeyGenerator;
        PrivateKey privateKey = generate.getPrivate();
        Intrinsics.checkNotNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey generate2 = diffieHellmanKeyGenerator.generate(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        C41417gF0 c41417gF0 = C41417gF0.f81831e;
        PublicKey publicKey = generate.getPublic();
        Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        C39900dh2 c39900dh2 = new C39900dh2(new C38696bh2.C12474a(C37051Xg2.f43559m, C36312Uc1.f37664f).m64153i(Q81.m88889v(new Q81.C6685a(c41417gF0, (ECPublicKey) publicKey).m88884a().m41022n())).m64158d(), new C50367vL3(payload));
        c39900dh2.m43895g(new C40720f41(generate2));
        String m43884r = c39900dh2.m43884r();
        Intrinsics.checkNotNullExpressionValue(m43884r, "jweObject.serialize()");
        return m43884r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JweEcEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, ErrorReporter errorReporter) {
        this(ephemeralKeyPairGenerator, new StripeDiffieHellmanKeyGenerator(errorReporter));
        Intrinsics.checkNotNullParameter(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
    }
}
