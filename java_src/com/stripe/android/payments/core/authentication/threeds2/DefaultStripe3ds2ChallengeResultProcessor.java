package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J1\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "complete3ds2Auth", "", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "remainingRetries", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onComplete3ds2AuthFailure", "error", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor implements Stripe3ds2ChallengeResultProcessor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_RETRIES = 3;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$Companion;", "", "()V", "MAX_RETRIES", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultStripe3ds2ChallengeResultProcessor(StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, RetryDelaySupplier retryDelaySupplier, Logger logger, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.logger = logger;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object complete3ds2Auth(ChallengeResult challengeResult, ApiRequest.Options options, int i, Continuation<? super Boolean> continuation) {
        DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
        Object coroutine_suspended;
        int i2;
        DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1) {
            defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 = (DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1) continuation;
            int i3 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1.label = i3 - Integer.MIN_VALUE;
                DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
                Object obj = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(((Boolean) obj).booleanValue());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.I$0;
                    options = (ApiRequest.Options) defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$2;
                    challengeResult = (ChallengeResult) defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1;
                    defaultStripe3ds2ChallengeResultProcessor = (DefaultStripe3ds2ChallengeResultProcessor) defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        int i4 = i;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        StripeRepository stripeRepository = this.stripeRepository;
                        String sourceId = challengeResult.getIntentData().getSourceId();
                        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0 = this;
                        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1 = challengeResult;
                        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$2 = options;
                        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.I$0 = i;
                        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label = 1;
                        obj = stripeRepository.complete3ds2Auth$payments_core_release(sourceId, options, defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultStripe3ds2ChallengeResultProcessor = this;
                    } catch (Throwable th2) {
                        th = th2;
                        defaultStripe3ds2ChallengeResultProcessor = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        int i42 = i;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((Stripe3ds2AuthResult) obj);
                int i422 = i;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) m116783constructorimpl;
                    Logger logger = defaultStripe3ds2ChallengeResultProcessor.logger;
                    logger.debug("3DS2 challenge completion request was successful. " + (3 - i422) + " retries attempted.");
                    return Boxing.boxBoolean(true);
                }
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0 = null;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1 = null;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$2 = null;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label = 2;
                obj = defaultStripe3ds2ChallengeResultProcessor.onComplete3ds2AuthFailure(challengeResult, options, i422, m116786exceptionOrNullimpl, defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(((Boolean) obj).booleanValue());
            }
        }
        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 = new DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1(this, continuation);
        DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
        Object obj2 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122.label;
        if (i2 == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((Stripe3ds2AuthResult) obj2);
        int i4222 = i;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    public static /* synthetic */ Object complete3ds2Auth$default(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, ChallengeResult challengeResult, ApiRequest.Options options, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return defaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(challengeResult, options, i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[PHI: r11 
      PHI: (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:30:0x009e, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onComplete3ds2AuthFailure(ChallengeResult challengeResult, ApiRequest.Options options, int i, Throwable th, Continuation<? super Boolean> continuation) {
        C19113xc7be33d3 c19113xc7be33d3;
        Object obj;
        Object coroutine_suspended;
        int i2;
        boolean z;
        boolean z2;
        DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor;
        if (continuation instanceof C19113xc7be33d3) {
            c19113xc7be33d3 = (C19113xc7be33d3) continuation;
            int i3 = c19113xc7be33d3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c19113xc7be33d3.label = i3 - Integer.MIN_VALUE;
                obj = c19113xc7be33d3.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c19113xc7be33d3.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = c19113xc7be33d3.I$0;
                    options = (ApiRequest.Options) c19113xc7be33d3.L$2;
                    challengeResult = (ChallengeResult) c19113xc7be33d3.L$1;
                    defaultStripe3ds2ChallengeResultProcessor = (DefaultStripe3ds2ChallengeResultProcessor) c19113xc7be33d3.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.logger.error("3DS2 challenge completion request failed. Remaining retries: " + i, th);
                    if (th instanceof StripeException) {
                        z = ((StripeException) th).isClientError();
                    } else {
                        z = false;
                    }
                    if (i > 0 && z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        long delayMillis = this.retryDelaySupplier.getDelayMillis(3, i);
                        c19113xc7be33d3.L$0 = this;
                        c19113xc7be33d3.L$1 = challengeResult;
                        c19113xc7be33d3.L$2 = options;
                        c19113xc7be33d3.I$0 = i;
                        c19113xc7be33d3.label = 1;
                        if (C48120rZ0.m15768a(delayMillis, c19113xc7be33d3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultStripe3ds2ChallengeResultProcessor = this;
                    } else {
                        this.logger.debug("Did not make a successful 3DS2 challenge completion request after retrying.");
                        return Boxing.boxBoolean(false);
                    }
                }
                c19113xc7be33d3.L$0 = null;
                c19113xc7be33d3.L$1 = null;
                c19113xc7be33d3.L$2 = null;
                c19113xc7be33d3.label = 2;
                obj = defaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(challengeResult, options, i - 1, c19113xc7be33d3);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        c19113xc7be33d3 = new C19113xc7be33d3(this, continuation);
        obj = c19113xc7be33d3.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c19113xc7be33d3.label;
        if (i2 == 0) {
        }
        c19113xc7be33d3.L$0 = null;
        c19113xc7be33d3.L$1 = null;
        c19113xc7be33d3.L$2 = null;
        c19113xc7be33d3.label = 2;
        obj = defaultStripe3ds2ChallengeResultProcessor.complete3ds2Auth(challengeResult, options, i - 1, c19113xc7be33d3);
        if (obj != coroutine_suspended) {
        }
    }

    @Override // com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor
    public Object process(ChallengeResult challengeResult, Continuation<? super PaymentFlowResult.Unvalidated> continuation) {
        return X30.m77504g(this.workContext, new DefaultStripe3ds2ChallengeResultProcessor$process$2(challengeResult, this, null), continuation);
    }
}
