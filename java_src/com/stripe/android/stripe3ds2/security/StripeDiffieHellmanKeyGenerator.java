package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "generate", "Ljavax/crypto/SecretKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "sdkPrivateKey", "Ljava/security/interfaces/ECPrivateKey;", "agreementInfo", "", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeDiffieHellmanKeyGenerator implements DiffieHellmanKeyGenerator {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HASH_ALGO = "SHA-256";
    @Deprecated
    private static final int KEY_LENGTH = 256;
    private final ErrorReporter errorReporter;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator$Companion;", "", "()V", "HASH_ALGO", "", "KEY_LENGTH", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeDiffieHellmanKeyGenerator(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator
    public SecretKey generate(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(sdkPrivateKey, "sdkPrivateKey");
        Intrinsics.checkNotNullParameter(agreementInfo, "agreementInfo");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(new C51292wu0(HASH_ALGO).m6135f(M81.m95690a(acsPublicKey, sdkPrivateKey, null), 256, C51292wu0.m6130k(null), C51292wu0.m6134g(null), C51292wu0.m6134g(C3824Iy.m101443d(agreementInfo)), C51292wu0.m6132i(256), C51292wu0.m6131j()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.errorReporter.reportError(m116786exceptionOrNullimpl);
        }
        Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl2 == null) {
            Intrinsics.checkNotNullExpressionValue(m116783constructorimpl, "runCatching {\n          …meException(it)\n        }");
            return (SecretKey) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }
}
