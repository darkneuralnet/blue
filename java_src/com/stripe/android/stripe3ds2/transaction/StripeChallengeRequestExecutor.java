package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.EcKeyFactory;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&Bc\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "sdkReferenceId", "", "sdkPrivateKey", "Ljava/security/PrivateKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "acsUrl", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "dhKeyGenerator", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "responseProcessorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Ljava/security/PrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;)V", "responseProcessor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "secretKey", "Ljavax/crypto/SecretKey;", "execute", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateSecretKey", "getRequestBody", "payload", "Lorg/json/JSONObject;", "Companion", "Factory", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeChallengeRequestExecutor implements ChallengeRequestExecutor {
    public static final Companion Companion = new Companion(null);
    private static final long TIMEOUT = TimeUnit.SECONDS.toMillis(10);
    private final ECPublicKey acsPublicKey;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final MessageTransformer messageTransformer;
    private final ChallengeResponseProcessor responseProcessor;
    private final PrivateKey sdkPrivateKey;
    private final String sdkReferenceId;
    private final SecretKey secretKey;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Companion;", "", "()V", "TIMEOUT", "", "getTIMEOUT", "()J", "createTimeoutResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChallengeRequestResult.Timeout createTimeoutResult(ChallengeRequestData challengeRequestData) {
            SdkTransactionId sdkTransId = challengeRequestData.getSdkTransId();
            String messageVersion = challengeRequestData.getMessageVersion();
            String acsTransId = challengeRequestData.getAcsTransId();
            String threeDsServerTransId = challengeRequestData.getThreeDsServerTransId();
            ProtocolError protocolError = ProtocolError.TransactionTimedout;
            return new ChallengeRequestResult.Timeout(new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Challenge request timed-out", ChallengeRequestData.MESSAGE_TYPE, messageVersion, sdkTransId, 4, null));
        }

        public final long getTIMEOUT() {
            return StripeChallengeRequestExecutor.TIMEOUT;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "config", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "create", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Factory implements ChallengeRequestExecutor.Factory {
        private final ChallengeRequestExecutor.Config config;

        public Factory(ChallengeRequestExecutor.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Factory
        public ChallengeRequestExecutor create(ErrorReporter errorReporter, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            EcKeyFactory ecKeyFactory = new EcKeyFactory(errorReporter);
            return new StripeChallengeRequestExecutor(this.config.getMessageTransformer$3ds2sdk_release(), this.config.getSdkReferenceId$3ds2sdk_release(), ecKeyFactory.createPrivate(this.config.getKeys$3ds2sdk_release().getSdkPrivateKeyEncoded$3ds2sdk_release()), ecKeyFactory.createPublic(this.config.getKeys$3ds2sdk_release().getAcsPublicKeyEncoded$3ds2sdk_release()), this.config.getAcsUrl$3ds2sdk_release(), errorReporter, new StripeDiffieHellmanKeyGenerator(errorReporter), workContext, null, this.config, null, 1280, null);
        }
    }

    public StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, ErrorReporter errorReporter, DiffieHellmanKeyGenerator dhKeyGenerator, CoroutineContext workContext, HttpClient httpClient, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeResponseProcessorFactory responseProcessorFactory) {
        Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
        Intrinsics.checkNotNullParameter(sdkReferenceId, "sdkReferenceId");
        Intrinsics.checkNotNullParameter(sdkPrivateKey, "sdkPrivateKey");
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(dhKeyGenerator, "dhKeyGenerator");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(responseProcessorFactory, "responseProcessorFactory");
        this.messageTransformer = messageTransformer;
        this.sdkReferenceId = sdkReferenceId;
        this.sdkPrivateKey = sdkPrivateKey;
        this.acsPublicKey = acsPublicKey;
        this.errorReporter = errorReporter;
        this.dhKeyGenerator = dhKeyGenerator;
        this.workContext = workContext;
        this.httpClient = httpClient;
        this.creqExecutorConfig = creqExecutorConfig;
        SecretKey generateSecretKey = generateSecretKey();
        this.secretKey = generateSecretKey;
        this.responseProcessor = responseProcessorFactory.create(generateSecretKey);
    }

    private final SecretKey generateSecretKey() {
        DiffieHellmanKeyGenerator diffieHellmanKeyGenerator = this.dhKeyGenerator;
        ECPublicKey eCPublicKey = this.acsPublicKey;
        PrivateKey privateKey = this.sdkPrivateKey;
        Intrinsics.checkNotNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return diffieHellmanKeyGenerator.generate(eCPublicKey, (ECPrivateKey) privateKey, this.sdkReferenceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequestBody(JSONObject jSONObject) throws JSONException, JOSEException {
        return this.messageTransformer.encrypt(jSONObject, this.secretKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
        StripeChallengeRequestExecutor$execute$1 stripeChallengeRequestExecutor$execute$1;
        Object coroutine_suspended;
        int i;
        ChallengeRequestResult challengeRequestResult;
        if (continuation instanceof StripeChallengeRequestExecutor$execute$1) {
            stripeChallengeRequestExecutor$execute$1 = (StripeChallengeRequestExecutor$execute$1) continuation;
            int i2 = stripeChallengeRequestExecutor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripeChallengeRequestExecutor$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripeChallengeRequestExecutor$execute$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripeChallengeRequestExecutor$execute$1.label;
                if (i == 0) {
                    if (i == 1) {
                        challengeRequestData = (ChallengeRequestData) stripeChallengeRequestExecutor$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    long j = TIMEOUT;
                    StripeChallengeRequestExecutor$execute$2 stripeChallengeRequestExecutor$execute$2 = new StripeChallengeRequestExecutor$execute$2(this, challengeRequestData, null);
                    stripeChallengeRequestExecutor$execute$1.L$0 = challengeRequestData;
                    stripeChallengeRequestExecutor$execute$1.label = 1;
                    obj = N46.m94393c(j, stripeChallengeRequestExecutor$execute$2, stripeChallengeRequestExecutor$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                challengeRequestResult = (ChallengeRequestResult) obj;
                if (challengeRequestResult != null) {
                    return Companion.createTimeoutResult(challengeRequestData);
                }
                return challengeRequestResult;
            }
        }
        stripeChallengeRequestExecutor$execute$1 = new StripeChallengeRequestExecutor$execute$1(this, continuation);
        Object obj2 = stripeChallengeRequestExecutor$execute$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripeChallengeRequestExecutor$execute$1.label;
        if (i == 0) {
        }
        challengeRequestResult = (ChallengeRequestResult) obj2;
        if (challengeRequestResult != null) {
        }
    }

    public /* synthetic */ StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, ErrorReporter errorReporter, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator, CoroutineContext coroutineContext, HttpClient httpClient, ChallengeRequestExecutor.Config config, ChallengeResponseProcessorFactory challengeResponseProcessorFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageTransformer, str, privateKey, eCPublicKey, str2, errorReporter, diffieHellmanKeyGenerator, coroutineContext, (i & 256) != 0 ? new StripeHttpClient(str2, null, errorReporter, coroutineContext, 2, null) : httpClient, config, (i & 1024) != 0 ? new ChallengeResponseProcessorFactory.Default(messageTransformer, errorReporter, config) : challengeResponseProcessorFactory);
    }
}
