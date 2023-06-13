package com.stripe.android.stripe3ds2.transaction;

import com.google.android.gms.location.places.Place;
import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BW\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "acsDataParser", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "challengeRequestResultRepository", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;", "errorRequestExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V", "createCreqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "startChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "args", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultInitChallengeRepository implements InitChallengeRepository {
    private final AcsDataParser acsDataParser;
    private final ChallengeRequestResultRepository challengeRequestResultRepository;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor.Factory errorRequestExecutorFactory;
    private final JwsValidator jwsValidator;
    private final Logger logger;
    private final MessageTransformer messageTransformer;
    private final MessageVersionRegistry messageVersionRegistry;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;

    public DefaultInitChallengeRepository(SdkTransactionId sdkTransactionId, MessageVersionRegistry messageVersionRegistry, JwsValidator jwsValidator, MessageTransformer messageTransformer, AcsDataParser acsDataParser, ChallengeRequestResultRepository challengeRequestResultRepository, ErrorRequestExecutor.Factory errorRequestExecutorFactory, StripeUiCustomization uiCustomization, ErrorReporter errorReporter, Logger logger) {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(jwsValidator, "jwsValidator");
        Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
        Intrinsics.checkNotNullParameter(acsDataParser, "acsDataParser");
        Intrinsics.checkNotNullParameter(challengeRequestResultRepository, "challengeRequestResultRepository");
        Intrinsics.checkNotNullParameter(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.sdkTransactionId = sdkTransactionId;
        this.messageVersionRegistry = messageVersionRegistry;
        this.jwsValidator = jwsValidator;
        this.messageTransformer = messageTransformer;
        this.acsDataParser = acsDataParser;
        this.challengeRequestResultRepository = challengeRequestResultRepository;
        this.errorRequestExecutorFactory = errorRequestExecutorFactory;
        this.uiCustomization = uiCustomization;
        this.errorReporter = errorReporter;
        this.logger = logger;
    }

    private final ChallengeRequestData createCreqData(SdkTransactionId sdkTransactionId, ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId != null) {
            String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
            if (threeDsServerTransactionId != null) {
                return new ChallengeRequestData(this.messageVersionRegistry.getCurrent(), threeDsServerTransactionId, acsTransactionId, sdkTransactionId, null, null, null, null, null, null, Place.TYPE_INTERSECTION, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:12:0x003e, B:27:0x00d2, B:29:0x00d8, B:39:0x0157, B:30:0x0100, B:32:0x0104, B:33:0x0123, B:35:0x0127, B:36:0x013f, B:38:0x0143, B:40:0x015c, B:41:0x0161), top: B:59:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:12:0x003e, B:27:0x00d2, B:29:0x00d8, B:39:0x0157, B:30:0x0100, B:32:0x0104, B:33:0x0123, B:35:0x0127, B:36:0x013f, B:38:0x0143, B:40:0x015c, B:41:0x0161), top: B:59:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.stripe3ds2.transaction.JwsValidator] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    @Override // com.stripe.android.stripe3ds2.transaction.InitChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        DefaultInitChallengeRepository$startChallenge$1 defaultInitChallengeRepository$startChallenge$1;
        Object coroutine_suspended;
        int i;
        InitChallengeArgs initChallengeArgs2;
        DefaultInitChallengeRepository defaultInitChallengeRepository;
        DefaultInitChallengeRepository defaultInitChallengeRepository2;
        ErrorRequestExecutor errorRequestExecutor;
        ChallengeRequestExecutor.Config config;
        Object m116783constructorimpl;
        InitChallengeArgs initChallengeArgs3;
        Throwable m116786exceptionOrNullimpl;
        ChallengeRequestResult challengeRequestResult;
        Object end;
        if (continuation instanceof DefaultInitChallengeRepository$startChallenge$1) {
            defaultInitChallengeRepository$startChallenge$1 = (DefaultInitChallengeRepository$startChallenge$1) continuation;
            int i2 = defaultInitChallengeRepository$startChallenge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultInitChallengeRepository$startChallenge$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultInitChallengeRepository$startChallenge$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultInitChallengeRepository$startChallenge$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ChallengeRequestExecutor.Config config2 = (ChallengeRequestExecutor.Config) defaultInitChallengeRepository$startChallenge$1.L$4;
                        errorRequestExecutor = (ErrorRequestExecutor) defaultInitChallengeRepository$startChallenge$1.L$3;
                        defaultInitChallengeRepository2 = (DefaultInitChallengeRepository) defaultInitChallengeRepository$startChallenge$1.L$2;
                        initChallengeArgs2 = (InitChallengeArgs) defaultInitChallengeRepository$startChallenge$1.L$1;
                        defaultInitChallengeRepository = (DefaultInitChallengeRepository) defaultInitChallengeRepository$startChallenge$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            config = config2;
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            initChallengeArgs3 = initChallengeArgs2;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.logger.info("Make initial challenge request.");
                    try {
                        Result.Companion companion2 = Result.Companion;
                        AcsDataParser acsDataParser = this.acsDataParser;
                        ?? r4 = this.jwsValidator;
                        initChallengeArgs2 = initChallengeArgs.getChallengeParameters$3ds2sdk_release().getAcsSignedContent();
                        try {
                            if (initChallengeArgs2 != 0) {
                                AcsData parse = acsDataParser.parse(r4.getPayload(initChallengeArgs2));
                                String component1 = parse.component1();
                                ECPublicKey component2 = parse.component2();
                                ChallengeRequestData createCreqData = createCreqData(this.sdkTransactionId, initChallengeArgs.getChallengeParameters$3ds2sdk_release());
                                ErrorRequestExecutor create = this.errorRequestExecutorFactory.create(component1, this.errorReporter);
                                MessageTransformer messageTransformer = this.messageTransformer;
                                String sdkReferenceNumber$3ds2sdk_release = initChallengeArgs.getSdkReferenceNumber$3ds2sdk_release();
                                byte[] encoded = initChallengeArgs.getSdkKeyPair$3ds2sdk_release().getPrivate().getEncoded();
                                Intrinsics.checkNotNullExpressionValue(encoded, "args.sdkKeyPair.private.encoded");
                                byte[] encoded2 = component2.getEncoded();
                                Intrinsics.checkNotNullExpressionValue(encoded2, "acsEphemPubKey.encoded");
                                ChallengeRequestExecutor.Config config3 = new ChallengeRequestExecutor.Config(messageTransformer, sdkReferenceNumber$3ds2sdk_release, createCreqData, component1, new ChallengeRequestExecutor.Config.Keys(encoded, encoded2));
                                ChallengeRequestResultRepository challengeRequestResultRepository = this.challengeRequestResultRepository;
                                defaultInitChallengeRepository$startChallenge$1.L$0 = this;
                                initChallengeArgs2 = initChallengeArgs;
                                defaultInitChallengeRepository$startChallenge$1.L$1 = initChallengeArgs2;
                                defaultInitChallengeRepository$startChallenge$1.L$2 = this;
                                defaultInitChallengeRepository$startChallenge$1.L$3 = create;
                                defaultInitChallengeRepository$startChallenge$1.L$4 = config3;
                                defaultInitChallengeRepository$startChallenge$1.label = 1;
                                obj = challengeRequestResultRepository.get(config3, createCreqData, defaultInitChallengeRepository$startChallenge$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                defaultInitChallengeRepository = this;
                                defaultInitChallengeRepository2 = defaultInitChallengeRepository;
                                errorRequestExecutor = create;
                                config = config3;
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            defaultInitChallengeRepository = this;
                            Result.Companion companion3 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            initChallengeArgs3 = initChallengeArgs2;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl == null) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        initChallengeArgs2 = initChallengeArgs;
                    }
                }
                challengeRequestResult = (ChallengeRequestResult) obj;
                if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                    end = new InitChallengeResult.Start(new ChallengeViewArgs(((ChallengeRequestResult.Success) challengeRequestResult).getCresData(), ((ChallengeRequestResult.Success) challengeRequestResult).getCreqData(), defaultInitChallengeRepository2.uiCustomization, config, new StripeChallengeRequestExecutor.Factory(config), initChallengeArgs2.getTimeoutMins$3ds2sdk_release(), initChallengeArgs2.getIntentData$3ds2sdk_release()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                    errorRequestExecutor.executeAsync(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
                    end = new InitChallengeResult.End(new ChallengeResult.ProtocolError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData(), null, initChallengeArgs2.getIntentData$3ds2sdk_release()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
                    errorRequestExecutor.executeAsync(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
                    end = new InitChallengeResult.End(new ChallengeResult.Timeout(null, null, initChallengeArgs2.getIntentData$3ds2sdk_release()));
                } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
                    end = new InitChallengeResult.End(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable(), null, initChallengeArgs2.getIntentData$3ds2sdk_release()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                m116783constructorimpl = Result.m116783constructorimpl(end);
                initChallengeArgs3 = initChallengeArgs2;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl == null) {
                    defaultInitChallengeRepository.errorReporter.reportError(m116786exceptionOrNullimpl);
                    defaultInitChallengeRepository.logger.error("Exception during initial challenge request.", m116786exceptionOrNullimpl);
                    return new InitChallengeResult.End(new ChallengeResult.RuntimeError(m116786exceptionOrNullimpl, null, initChallengeArgs3.getIntentData$3ds2sdk_release()));
                }
                return m116783constructorimpl;
            }
        }
        defaultInitChallengeRepository$startChallenge$1 = new DefaultInitChallengeRepository$startChallenge$1(this, continuation);
        Object obj2 = defaultInitChallengeRepository$startChallenge$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultInitChallengeRepository$startChallenge$1.label;
        if (i == 0) {
        }
        challengeRequestResult = (ChallengeRequestResult) obj2;
        if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
        }
        m116783constructorimpl = Result.m116783constructorimpl(end);
        initChallengeArgs3 = initChallengeArgs2;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
        }
    }
}
