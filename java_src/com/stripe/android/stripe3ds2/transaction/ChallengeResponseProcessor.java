package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface ChallengeResponseProcessor {

    @Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0015H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "secretKey", "Ljavax/crypto/SecretKey;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljavax/crypto/SecretKey;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "createErrorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "description", "", "detail", "getResponsePayload", "Lorg/json/JSONObject;", "responseBody", "isMessageVersionCorrect", "", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "isValidChallengeResponse", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processPayload", "payload", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Default implements ChallengeResponseProcessor {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;
        private final SecretKey secretKey;

        public Default(MessageTransformer messageTransformer, SecretKey secretKey, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.secretKey = secretKey;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        private final ErrorData createErrorData(ChallengeRequestData challengeRequestData, int i, String str, String str2) {
            String valueOf = String.valueOf(i);
            ErrorData.ErrorComponent errorComponent = ErrorData.ErrorComponent.ThreeDsSdk;
            return new ErrorData(challengeRequestData.getThreeDsServerTransId(), challengeRequestData.getAcsTransId(), null, valueOf, errorComponent, str, str2, ChallengeResponseData.MESSAGE_TYPE, challengeRequestData.getMessageVersion(), challengeRequestData.getSdkTransId(), 4, null);
        }

        private final JSONObject getResponsePayload(String str) throws ParseException, JOSEException, JSONException, ChallengeResponseParseException {
            return this.messageTransformer.decrypt(str, this.secretKey);
        }

        private final boolean isMessageVersionCorrect(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            return Intrinsics.areEqual(challengeRequestData.getMessageVersion(), challengeResponseData.getMessageVersion());
        }

        private final boolean isValidChallengeResponse(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            if (Intrinsics.areEqual(challengeRequestData.getSdkTransId(), challengeResponseData.getSdkTransId()) && Intrinsics.areEqual(challengeRequestData.getThreeDsServerTransId(), challengeResponseData.getServerTransId()) && Intrinsics.areEqual(challengeRequestData.getAcsTransId(), challengeResponseData.getAcsTransId())) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor
        public Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation) {
            Object m116783constructorimpl;
            String trimIndent;
            if (httpResponse.isJsonContentType()) {
                JSONObject jSONObject = new JSONObject(httpResponse.getContent());
                ErrorData.Companion companion = ErrorData.Companion;
                if (companion.isErrorMessage$3ds2sdk_release(jSONObject)) {
                    return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(jSONObject));
                }
                return new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(getResponsePayload(httpResponse.getContent()));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                ErrorReporter errorReporter = this.errorReporter;
                trimIndent = StringsKt__IndentKt.trimIndent("\n                            Failed to process challenge response.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                            ");
                errorReporter.reportError(new RuntimeException(trimIndent, m116786exceptionOrNullimpl));
            }
            Throwable m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl2 == null) {
                return processPayload(challengeRequestData, (JSONObject) m116783constructorimpl);
            }
            ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
            int code = protocolError.getCode();
            String description = protocolError.getDescription();
            String message = m116786exceptionOrNullimpl2.getMessage();
            if (message == null) {
                message = "";
            }
            return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, code, description, message));
        }

        public final ChallengeRequestResult processPayload(ChallengeRequestData creqData, JSONObject payload) {
            Object m116783constructorimpl;
            ChallengeRequestResult.ProtocolError protocolError;
            ChallengeRequestResult success;
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(payload, "payload");
            ErrorData.Companion companion = ErrorData.Companion;
            if (companion.isErrorMessage$3ds2sdk_release(payload)) {
                return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(payload));
            }
            try {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ChallengeResponseData.Companion.fromJson$3ds2sdk_release(payload));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) m116783constructorimpl;
                if (!isValidChallengeResponse(creqData, challengeResponseData)) {
                    ProtocolError protocolError2 = ProtocolError.InvalidTransactionId;
                    success = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError2.getCode(), protocolError2.getDescription(), "The Transaction ID received was invalid."));
                } else if (!isMessageVersionCorrect(creqData, challengeResponseData)) {
                    ProtocolError protocolError3 = ProtocolError.UnsupportedMessageVersion;
                    protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError3.getCode(), protocolError3.getDescription(), creqData.getMessageVersion()));
                } else {
                    success = new ChallengeRequestResult.Success(creqData, challengeResponseData, this.creqExecutorConfig);
                }
                return success;
            } else if (m116786exceptionOrNullimpl instanceof ChallengeResponseParseException) {
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) m116786exceptionOrNullimpl;
                protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            } else {
                return new ChallengeRequestResult.RuntimeError(m116786exceptionOrNullimpl);
            }
            return protocolError;
        }
    }

    Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation);
}
