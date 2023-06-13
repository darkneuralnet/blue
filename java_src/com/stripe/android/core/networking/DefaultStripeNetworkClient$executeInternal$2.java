package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"BodyType", "LZC0;", "Lcom/stripe/android/core/networking/StripeResponse;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.core.networking.DefaultStripeNetworkClient$executeInternal$2", m28418f = "DefaultStripeNetworkClient.kt", m28417i = {}, m28416l = {50, 56}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class DefaultStripeNetworkClient$executeInternal$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super StripeResponse<BodyType>>, Object> {
    final /* synthetic */ int $remainingRetries;
    final /* synthetic */ Function0<StripeResponse<BodyType>> $requester;
    final /* synthetic */ Iterable<Integer> $retryResponseCodes;
    int label;
    final /* synthetic */ DefaultStripeNetworkClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeNetworkClient$executeInternal$2(Function0<StripeResponse<BodyType>> function0, Iterable<Integer> iterable, int i, DefaultStripeNetworkClient defaultStripeNetworkClient, Continuation<? super DefaultStripeNetworkClient$executeInternal$2> continuation) {
        super(2, continuation);
        this.$requester = function0;
        this.$retryResponseCodes = iterable;
        this.$remainingRetries = i;
        this.this$0 = defaultStripeNetworkClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultStripeNetworkClient$executeInternal$2(this.$requester, this.$retryResponseCodes, this.$remainingRetries, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super StripeResponse<BodyType>> continuation) {
        return ((DefaultStripeNetworkClient$executeInternal$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        boolean contains;
        Logger logger;
        RetryDelaySupplier retryDelaySupplier;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (StripeResponse) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            StripeResponse stripeResponse = (StripeResponse) this.$requester.invoke();
            contains = CollectionsKt___CollectionsKt.contains(this.$retryResponseCodes, Boxing.boxInt(stripeResponse.getCode()));
            if (contains && this.$remainingRetries > 0) {
                logger = this.this$0.logger;
                int code = stripeResponse.getCode();
                int i2 = this.$remainingRetries;
                logger.info("Request failed with code " + code + ". Retrying up to " + i2 + " more time(s).");
                retryDelaySupplier = this.this$0.retryDelaySupplier;
                long delayMillis = retryDelaySupplier.getDelayMillis(3, this.$remainingRetries);
                this.label = 1;
                if (C48120rZ0.m15768a(delayMillis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return stripeResponse;
            }
        }
        Iterable<Integer> iterable = this.$retryResponseCodes;
        Function function = this.$requester;
        this.label = 2;
        obj = this.this$0.executeInternal$stripe_core_release(this.$remainingRetries - 1, iterable, function, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (StripeResponse) obj;
    }
}
