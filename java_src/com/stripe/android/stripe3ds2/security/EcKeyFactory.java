package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "keyFactory", "Ljava/security/KeyFactory;", "createPrivate", "Ljava/security/interfaces/ECPrivateKey;", "privateKeyEncoded", "", "createPublic", "Ljava/security/interfaces/ECPublicKey;", "publicKeyEncoded", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class EcKeyFactory {
    private final ErrorReporter errorReporter;
    private final KeyFactory keyFactory;

    public EcKeyFactory(ErrorReporter errorReporter) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(KeyFactory.getInstance("EC"));
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
            Intrinsics.checkNotNullExpressionValue(m116783constructorimpl, "runCatching {\n          …xception(error)\n        }");
            this.keyFactory = (KeyFactory) m116783constructorimpl;
            return;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }

    public final ECPrivateKey createPrivate(byte[] privateKeyEncoded) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(privateKeyEncoded, "privateKeyEncoded");
        try {
            Result.Companion companion = Result.Companion;
            PrivateKey generatePrivate = this.keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            Intrinsics.checkNotNull(generatePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            m116783constructorimpl = Result.m116783constructorimpl((ECPrivateKey) generatePrivate);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            return (ECPrivateKey) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl);
    }

    public final ECPublicKey createPublic(byte[] publicKeyEncoded) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(publicKeyEncoded, "publicKeyEncoded");
        try {
            Result.Companion companion = Result.Companion;
            PublicKey generatePublic = this.keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            Intrinsics.checkNotNull(generatePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            m116783constructorimpl = Result.m116783constructorimpl((ECPublicKey) generatePublic);
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
            return (ECPublicKey) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }
}
