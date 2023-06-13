package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeEphemeralKeyPairGenerator;", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "generate", "Ljava/security/KeyPair;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeEphemeralKeyPairGenerator implements EphemeralKeyPairGenerator {
    private final ErrorReporter errorReporter;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String ALGORITHM = Algorithm.EC.toString();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeEphemeralKeyPairGenerator$Companion;", "", "()V", "ALGORITHM", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StripeEphemeralKeyPairGenerator(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator
    public KeyPair generate() {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            keyPairGenerator.initialize(new ECGenParameterSpec(C41417gF0.f81831e.m39800c()));
            m116783constructorimpl = Result.m116783constructorimpl(keyPairGenerator.generateKeyPair());
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
            return (KeyPair) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }
}
