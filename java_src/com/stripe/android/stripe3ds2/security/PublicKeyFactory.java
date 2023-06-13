package com.stripe.android.stripe3ds2.security;

import android.content.Context;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "create", "Ljava/security/PublicKey;", "directoryServerId", "", "generateCertificate", "Ljava/security/cert/Certificate;", "fileName", "generatePublicKey", "algorithm", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "readFile", "Ljava/io/InputStream;", "readPublicKeyBytes", "", "keyFile", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PublicKeyFactory {
    private final Context context;
    private final ErrorReporter errorReporter;

    public PublicKeyFactory(Context context, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final Certificate generateCertificate(String str) {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            InputStream readFile = readFile(str);
            Intrinsics.checkNotNullExpressionValue(factory, "factory");
            Certificate generateCertificate = factory.generateCertificate(readFile);
            CloseableKt.closeFinally(readFile, null);
            m116783constructorimpl = Result.m116783constructorimpl(generateCertificate);
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
            return (Certificate) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }

    private final PublicKey generatePublicKey(String str, Algorithm algorithm) {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(KeyFactory.getInstance(algorithm.toString()).generatePublic(new X509EncodedKeySpec(readPublicKeyBytes(str))));
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
            return (PublicKey) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }

    private final InputStream readFile(String str) throws IOException {
        InputStream open = this.context.getAssets().open(str);
        Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(fileName)");
        return open;
    }

    private final byte[] readPublicKeyBytes(String str) {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            InputStream readFile = readFile(str);
            String publicKey = new Scanner(readFile).useDelimiter("\\A").next();
            CloseableKt.closeFinally(readFile, null);
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] bytes = publicKey.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            m116783constructorimpl = Result.m116783constructorimpl(Base64.decode(bytes, 0));
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
            return (byte[]) m116783constructorimpl;
        }
        throw new SDKRuntimeException(m116786exceptionOrNullimpl2);
    }

    public final PublicKey create(String directoryServerId) {
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        DirectoryServer lookup = DirectoryServer.Companion.lookup(directoryServerId);
        if (lookup.isCertificate()) {
            PublicKey publicKey = generateCertificate(lookup.getFileName()).getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "{\n            generateCe…Name).publicKey\n        }");
            return publicKey;
        }
        return generatePublicKey(lookup.getFileName(), lookup.getAlgorithm());
    }
}
