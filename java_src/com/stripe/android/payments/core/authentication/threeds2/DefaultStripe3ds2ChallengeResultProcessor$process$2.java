package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2", m28418f = "Stripe3ds2ChallengeResultProcessor.kt", m28417i = {0}, m28416l = {95}, m28415m = "invokeSuspend", m28414n = {"requestOptions"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor$process$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super PaymentFlowResult.Unvalidated>, Object> {
    final /* synthetic */ ChallengeResult $challengeResult;
    Object L$0;
    int label;
    final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripe3ds2ChallengeResultProcessor$process$2(ChallengeResult challengeResult, DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, Continuation<? super DefaultStripe3ds2ChallengeResultProcessor$process$2> continuation) {
        super(2, continuation);
        this.$challengeResult = challengeResult;
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultStripe3ds2ChallengeResultProcessor$process$2(this.$challengeResult, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super PaymentFlowResult.Unvalidated> continuation) {
        return ((DefaultStripe3ds2ChallengeResultProcessor$process$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        AnalyticsRequestExecutor analyticsRequestExecutor2;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        AnalyticsRequestExecutor analyticsRequestExecutor3;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3;
        AnalyticsRequestExecutor analyticsRequestExecutor4;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory4;
        AnalyticsRequestExecutor analyticsRequestExecutor5;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory5;
        AnalyticsRequestExecutor analyticsRequestExecutor6;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory6;
        String str;
        ApiRequest.Options options;
        AnalyticsRequestExecutor analyticsRequestExecutor7;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory7;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                options = (ApiRequest.Options) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ChallengeResult challengeResult = this.$challengeResult;
            if (challengeResult instanceof ChallengeResult.Succeeded) {
                analyticsRequestExecutor7 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory7 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor7.executeAsync(paymentAnalyticsRequestFactory7.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Succeeded) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.Failed) {
                analyticsRequestExecutor5 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory5 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor5.executeAsync(paymentAnalyticsRequestFactory5.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCompleted, ((ChallengeResult.Failed) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.Canceled) {
                analyticsRequestExecutor4 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory4 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor4.executeAsync(paymentAnalyticsRequestFactory4.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeCanceled, ((ChallengeResult.Canceled) this.$challengeResult).getUiTypeCode()));
            } else if (challengeResult instanceof ChallengeResult.ProtocolError) {
                analyticsRequestExecutor3 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory3 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor3.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory3, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 30, null));
            } else if (challengeResult instanceof ChallengeResult.RuntimeError) {
                analyticsRequestExecutor2 = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory2 = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor2.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory2, PaymentAnalyticsEvent.Auth3ds2ChallengeErrored, null, null, null, null, 30, null));
            } else if (challengeResult instanceof ChallengeResult.Timeout) {
                analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
                paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent.Auth3ds2ChallengeTimedOut, ((ChallengeResult.Timeout) this.$challengeResult).getUiTypeCode()));
            }
            analyticsRequestExecutor6 = this.this$0.analyticsRequestExecutor;
            paymentAnalyticsRequestFactory6 = this.this$0.paymentAnalyticsRequestFactory;
            PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.Auth3ds2ChallengePresented;
            UiType initialUiType = this.$challengeResult.getInitialUiType();
            if (initialUiType != null) {
                str = initialUiType.getCode();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            analyticsRequestExecutor6.executeAsync(paymentAnalyticsRequestFactory6.create3ds2Challenge$payments_core_release(paymentAnalyticsEvent, str));
            ApiRequest.Options options2 = new ApiRequest.Options(this.$challengeResult.getIntentData().getPublishableKey(), this.$challengeResult.getIntentData().getAccountId(), null, 4, null);
            DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor = this.this$0;
            ChallengeResult challengeResult2 = this.$challengeResult;
            this.L$0 = options2;
            this.label = 1;
            Object complete3ds2Auth$default = DefaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth$default(defaultStripe3ds2ChallengeResultProcessor, challengeResult2, options2, 0, this, 4, null);
            if (complete3ds2Auth$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            options = options2;
            obj = complete3ds2Auth$default;
        }
        if (((Boolean) obj).booleanValue()) {
            ChallengeResult challengeResult3 = this.$challengeResult;
            if (!(challengeResult3 instanceof ChallengeResult.Succeeded)) {
                if (!(challengeResult3 instanceof ChallengeResult.Failed)) {
                    if (challengeResult3 instanceof ChallengeResult.Canceled) {
                        i2 = 3;
                    } else if (!(challengeResult3 instanceof ChallengeResult.ProtocolError) && !(challengeResult3 instanceof ChallengeResult.RuntimeError)) {
                        if (challengeResult3 instanceof ChallengeResult.Timeout) {
                            i2 = 4;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return new PaymentFlowResult.Unvalidated(this.$challengeResult.getIntentData().getClientSecret(), i2, null, false, null, null, options.getStripeAccount(), 60, null);
        }
        i2 = 2;
        return new PaymentFlowResult.Unvalidated(this.$challengeResult.getIntentData().getClientSecret(), i2, null, false, null, null, options.getStripeAccount(), 60, null);
    }
}
