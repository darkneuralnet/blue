package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;", "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "jweRsaEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "jweEcEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;", "(Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "encrypt", "", "payload", "acsPublicKey", "Ljava/security/PublicKey;", "directoryServerId", "keyId", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultJweEncrypter implements JweEncrypter {
    private final ErrorReporter errorReporter;
    private final JweEcEncrypter jweEcEncrypter;
    private final JweRsaEncrypter jweRsaEncrypter;

    private DefaultJweEncrypter(JweRsaEncrypter jweRsaEncrypter, JweEcEncrypter jweEcEncrypter, ErrorReporter errorReporter) {
        this.jweRsaEncrypter = jweRsaEncrypter;
        this.jweEcEncrypter = jweEcEncrypter;
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.JweEncrypter
    public String encrypt(String payload, PublicKey acsPublicKey, String directoryServerId, String str) throws JOSEException, ParseException {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(this.jweRsaEncrypter.encrypt(payload, (RSAPublicKey) acsPublicKey, str));
        } else if (acsPublicKey instanceof ECPublicKey) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(this.jweEcEncrypter.encrypt(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            Result.Companion companion3 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(new SDKRuntimeException("Unsupported public key algorithm: " + acsPublicKey.getAlgorithm(), null, 2, null)));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.errorReporter.reportError(m116786exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(m116783constructorimpl);
        return (String) m116783constructorimpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultJweEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, ErrorReporter errorReporter) {
        this(new JweRsaEncrypter(), new JweEcEncrypter(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        Intrinsics.checkNotNullParameter(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
    }
}
