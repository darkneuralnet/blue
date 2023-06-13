package com.stripe.android.payments;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@"}, m28432d2 = {"Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/StripeIntentResult;", "S", "LZC0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", m28418f = "PaymentFlowResultProcessor.kt", m28417i = {0, 0, 1, 2}, m28416l = {55, 71, 95}, m28415m = "invokeSuspend", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "requestOptions", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0", "L$1", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nPaymentFlowResultProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowResultProcessor.kt\ncom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1#2:415\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentFlowResultProcessor$processResult$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super S>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $unvalidatedResult;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFlowResultProcessor$processResult$2(PaymentFlowResult.Unvalidated unvalidated, PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Continuation<? super PaymentFlowResultProcessor$processResult$2> continuation) {
        super(2, continuation);
        this.$unvalidatedResult = unvalidated;
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentFlowResultProcessor$processResult$2(this.$unvalidatedResult, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super S> continuation) {
        return ((PaymentFlowResultProcessor$processResult$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        PaymentFlowResult.Validated validate$payments_core_release;
        ApiRequest.Options options;
        Y94 y94;
        Object retrieveStripeIntent;
        PaymentFlowFailureMessageFactory paymentFlowFailureMessageFactory;
        boolean shouldRefreshIntent;
        boolean shouldCancelIntentSource;
        PaymentFlowFailureMessageFactory paymentFlowFailureMessageFactory2;
        Logger logger;
        StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2;
        Object cancelStripeIntentSource;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        String publishableKey;
        String threeDS2IntentId;
        Object refreshStripeIntentUntilTerminalState;
        PaymentFlowResultProcessor paymentFlowResultProcessor2;
        int determineFlowOutcome;
        PaymentFlowFailureMessageFactory paymentFlowFailureMessageFactory3;
        PaymentFlowFailureMessageFactory paymentFlowFailureMessageFactory4;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.L$1;
                        validate$payments_core_release = (PaymentFlowResult.Validated) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        cancelStripeIntentSource = obj;
                        if (cancelStripeIntentSource == null) {
                            StripeIntent stripeIntent = (StripeIntent) cancelStripeIntentSource;
                            int flowOutcome$payments_core_release = validate$payments_core_release.getFlowOutcome$payments_core_release();
                            paymentFlowFailureMessageFactory4 = paymentFlowResultProcessor.failureMessageFactory;
                            return paymentFlowResultProcessor.createStripeIntentResult(stripeIntent, flowOutcome$payments_core_release, paymentFlowFailureMessageFactory4.create(stripeIntent, validate$payments_core_release.getFlowOutcome$payments_core_release()));
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentFlowResultProcessor2 = (PaymentFlowResultProcessor) this.L$1;
                validate$payments_core_release = (PaymentFlowResult.Validated) this.L$0;
                ResultKt.throwOnFailure(obj);
                refreshStripeIntentUntilTerminalState = obj;
                StripeIntent stripeIntent2 = (StripeIntent) refreshStripeIntentUntilTerminalState;
                determineFlowOutcome = paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent2, validate$payments_core_release.getFlowOutcome$payments_core_release());
                paymentFlowFailureMessageFactory3 = paymentFlowResultProcessor2.failureMessageFactory;
                return paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent2, determineFlowOutcome, paymentFlowFailureMessageFactory3.create(stripeIntent2, validate$payments_core_release.getFlowOutcome$payments_core_release()));
            }
            ResultKt.throwOnFailure(obj);
            options = (ApiRequest.Options) this.L$1;
            validate$payments_core_release = (PaymentFlowResult.Validated) this.L$0;
            retrieveStripeIntent = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            validate$payments_core_release = this.$unvalidatedResult.validate$payments_core_release();
            y94 = ((PaymentFlowResultProcessor) this.this$0).publishableKeyProvider;
            Object obj2 = y94.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "publishableKeyProvider.get()");
            options = new ApiRequest.Options((String) obj2, validate$payments_core_release.getStripeAccountId$payments_core_release(), null, 4, null);
            PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor3 = this.this$0;
            String clientSecret = validate$payments_core_release.getClientSecret();
            List<String> expand_payment_method = PaymentFlowResultProcessor.Companion.getEXPAND_PAYMENT_METHOD();
            this.L$0 = validate$payments_core_release;
            this.L$1 = options;
            this.label = 1;
            retrieveStripeIntent = paymentFlowResultProcessor3.retrieveStripeIntent(clientSecret, options, expand_payment_method, this);
            if (retrieveStripeIntent == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (retrieveStripeIntent != null) {
            PaymentFlowResultProcessor paymentFlowResultProcessor4 = this.this$0;
            StripeIntent stripeIntent3 = (StripeIntent) retrieveStripeIntent;
            if (stripeIntent3.getStatus() != StripeIntent.Status.Succeeded && stripeIntent3.getStatus() != StripeIntent.Status.RequiresCapture) {
                shouldRefreshIntent = paymentFlowResultProcessor4.shouldRefreshIntent(stripeIntent3, validate$payments_core_release.getFlowOutcome$payments_core_release());
                if (shouldRefreshIntent) {
                    String clientSecret2 = validate$payments_core_release.getClientSecret();
                    this.L$0 = validate$payments_core_release;
                    this.L$1 = paymentFlowResultProcessor4;
                    this.label = 2;
                    refreshStripeIntentUntilTerminalState = paymentFlowResultProcessor4.refreshStripeIntentUntilTerminalState(stripeIntent3, clientSecret2, options, this);
                    if (refreshStripeIntentUntilTerminalState == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentFlowResultProcessor2 = paymentFlowResultProcessor4;
                    StripeIntent stripeIntent22 = (StripeIntent) refreshStripeIntentUntilTerminalState;
                    determineFlowOutcome = paymentFlowResultProcessor2.determineFlowOutcome(stripeIntent22, validate$payments_core_release.getFlowOutcome$payments_core_release());
                    paymentFlowFailureMessageFactory3 = paymentFlowResultProcessor2.failureMessageFactory;
                    return paymentFlowResultProcessor2.createStripeIntentResult(stripeIntent22, determineFlowOutcome, paymentFlowFailureMessageFactory3.create(stripeIntent22, validate$payments_core_release.getFlowOutcome$payments_core_release()));
                }
                shouldCancelIntentSource = paymentFlowResultProcessor4.shouldCancelIntentSource(stripeIntent3, validate$payments_core_release.getCanCancelSource$payments_core_release());
                if (shouldCancelIntentSource) {
                    String sourceId$payments_core_release = validate$payments_core_release.getSourceId$payments_core_release();
                    String str = "";
                    if (sourceId$payments_core_release == null) {
                        sourceId$payments_core_release = "";
                    }
                    logger = paymentFlowResultProcessor4.logger;
                    String simpleName = stripeIntent3.getClass().getSimpleName();
                    logger.debug("Canceling source '" + sourceId$payments_core_release + "' for '" + simpleName + "'");
                    StripeIntent.NextActionData nextActionData = stripeIntent3.getNextActionData();
                    if (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS2) {
                        use3DS2 = (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData;
                    } else {
                        use3DS2 = null;
                    }
                    if (use3DS2 != null && (threeDS2IntentId = use3DS2.getThreeDS2IntentId()) != null) {
                        str = threeDS2IntentId;
                    } else {
                        String id = stripeIntent3.getId();
                        if (id != null) {
                            str = id;
                        }
                    }
                    if (use3DS2 != null && (publishableKey = use3DS2.getPublishableKey()) != null) {
                        options = new ApiRequest.Options(publishableKey, null, null, 6, null);
                    }
                    this.L$0 = validate$payments_core_release;
                    this.L$1 = paymentFlowResultProcessor4;
                    this.label = 3;
                    cancelStripeIntentSource = paymentFlowResultProcessor4.cancelStripeIntentSource(str, options, sourceId$payments_core_release, this);
                    if (cancelStripeIntentSource == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paymentFlowResultProcessor = paymentFlowResultProcessor4;
                    if (cancelStripeIntentSource == null) {
                    }
                } else {
                    int flowOutcome$payments_core_release2 = validate$payments_core_release.getFlowOutcome$payments_core_release();
                    paymentFlowFailureMessageFactory2 = paymentFlowResultProcessor4.failureMessageFactory;
                    return paymentFlowResultProcessor4.createStripeIntentResult(stripeIntent3, flowOutcome$payments_core_release2, paymentFlowFailureMessageFactory2.create(stripeIntent3, validate$payments_core_release.getFlowOutcome$payments_core_release()));
                }
            } else {
                paymentFlowFailureMessageFactory = paymentFlowResultProcessor4.failureMessageFactory;
                return paymentFlowResultProcessor4.createStripeIntentResult(stripeIntent3, 1, paymentFlowFailureMessageFactory.create(stripeIntent3, validate$payments_core_release.getFlowOutcome$payments_core_release()));
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
