package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C42864ih2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J&\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "Ljh2;", "jwsObject", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "", "isValid", "Lih2;", "jwsHeader", "Lkh2;", "getVerifier", "Ljava/security/PublicKey;", "getPublicKeyFromHeader", "", "jws", "Lorg/json/JSONObject;", "getPayload", "LGy;", "encodedChainCerts", "isCertificateChainValid", "isLiveMode", "Z", "Ljava/util/List;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class DefaultJwsValidator implements JwsValidator {
    public static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final boolean isLiveMode;
    private final List<X509Certificate> rootCerts;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;", "", "", "LGy;", "encodedChainCerts", "Ljava/security/cert/X509Certificate;", "rootCerts", "", "validateChain", "Ljava/security/KeyStore;", "createKeyStore", "Lih2;", "jwsHeader", "sanitizedJwsHeader$3ds2sdk_release", "(Lih2;)Lih2;", "sanitizedJwsHeader", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateChain(List<? extends C2990Gy> list, List<? extends X509Certificate> list2) throws GeneralSecurityException, IOException, ParseException {
            List<X509Certificate> m16114a = C47964rH6.m16114a(list);
            KeyStore createKeyStore = createKeyStore(list2);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(m16114a.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(createKeyStore, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(m16114a)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore createKeyStore(List<? extends X509Certificate> rootCerts) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i = 0;
            for (Object obj : rootCerts) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                keyStore.setCertificateEntry(format, rootCerts.get(i));
                i = i2;
            }
            Intrinsics.checkNotNullExpressionValue(keyStore, "keyStore");
            return keyStore;
        }

        public final C42864ih2 sanitizedJwsHeader$3ds2sdk_release(C42864ih2 jwsHeader) {
            Intrinsics.checkNotNullParameter(jwsHeader, "jwsHeader");
            C42864ih2 m33570b = new C42864ih2.C23328a(jwsHeader).m33566f(null).m33570b();
            Intrinsics.checkNotNullExpressionValue(m33570b, "Builder(jwsHeader)\n     …\n                .build()");
            return m33570b;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultJwsValidator(boolean z, List<? extends X509Certificate> rootCerts, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.isLiveMode = z;
        this.rootCerts = rootCerts;
        this.errorReporter = errorReporter;
    }

    private final PublicKey getPublicKeyFromHeader(C42864ih2 c42864ih2) throws CertificateException {
        Object first;
        List mo33581m = c42864ih2.mo33581m();
        Intrinsics.checkNotNullExpressionValue(mo33581m, "jwsHeader.x509CertChain");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) mo33581m);
        PublicKey publicKey = C48556sH6.m14484b(((C2990Gy) first).m104549a()).getPublicKey();
        Intrinsics.checkNotNullExpressionValue(publicKey, "parseWithException(\n    …ode()\n        ).publicKey");
        return publicKey;
    }

    private final InterfaceC44050kh2 getVerifier(C42864ih2 c42864ih2) throws JOSEException, CertificateException {
        RX0 rx0 = new RX0();
        rx0.getJCAContext().m113688c(C47795r00.m16701a());
        InterfaceC44050kh2 m86643c = rx0.m86643c(c42864ih2, getPublicKeyFromHeader(c42864ih2));
        Intrinsics.checkNotNullExpressionValue(m86643c, "verifierFactory.createJW…KeyFromHeader(jwsHeader))");
        return m86643c;
    }

    private final boolean isValid(C43457jh2 c43457jh2, List<? extends X509Certificate> list) throws JOSEException, CertificateException {
        if (c43457jh2.m30101h().mo33584j() != null) {
            ErrorReporter errorReporter = this.errorReporter;
            errorReporter.reportError(new IllegalArgumentException("Encountered a JWK in " + c43457jh2.m30101h()));
        }
        Companion companion = Companion;
        C42864ih2 m30101h = c43457jh2.m30101h();
        Intrinsics.checkNotNullExpressionValue(m30101h, "jwsObject.header");
        C42864ih2 sanitizedJwsHeader$3ds2sdk_release = companion.sanitizedJwsHeader$3ds2sdk_release(m30101h);
        if (!isCertificateChainValid(sanitizedJwsHeader$3ds2sdk_release.mo33581m(), list)) {
            return false;
        }
        return c43457jh2.m30095n(getVerifier(sanitizedJwsHeader$3ds2sdk_release));
    }

    @Override // com.stripe.android.stripe3ds2.transaction.JwsValidator
    public JSONObject getPayload(String jws) throws JSONException, ParseException, JOSEException, CertificateException {
        Intrinsics.checkNotNullParameter(jws, "jws");
        C43457jh2 jwsObject = C43457jh2.m30098k(jws);
        if (this.isLiveMode) {
            Intrinsics.checkNotNullExpressionValue(jwsObject, "jwsObject");
            if (!isValid(jwsObject, this.rootCerts)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(jwsObject.m106754b().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0005, B:5:0x000d, B:10:0x0017, B:12:0x001a, B:14:0x0024, B:15:0x0030, B:16:0x003b, B:17:0x003c, B:18:0x0047), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0005, B:5:0x000d, B:10:0x0017, B:12:0x001a, B:14:0x0024, B:15:0x0030, B:16:0x003b, B:17:0x003c, B:18:0x0047), top: B:26:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isCertificateChainValid(List<? extends C2990Gy> list, List<? extends X509Certificate> rootCerts) {
        Object m116783constructorimpl;
        List<? extends C2990Gy> list2;
        boolean z;
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        try {
            Result.Companion companion = Result.Companion;
            list2 = list;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (list2 != null && !list2.isEmpty()) {
            z = false;
            if (!(!z)) {
                if (!rootCerts.isEmpty()) {
                    Companion.validateChain(list, rootCerts);
                    m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                        this.errorReporter.reportError(m116786exceptionOrNullimpl);
                    }
                    return Result.m116790isSuccessimpl(m116783constructorimpl);
                }
                throw new IllegalArgumentException("Root certificates are empty".toString());
            }
            throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty".toString());
        }
        z = true;
        if (!(!z)) {
        }
    }
}
