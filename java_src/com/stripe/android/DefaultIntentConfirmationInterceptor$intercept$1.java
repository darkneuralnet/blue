package com.stripe.android;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.DefaultIntentConfirmationInterceptor", m28418f = "IntentConfirmationInterceptor.kt", m28417i = {0, 0, 0}, m28416l = {92, 94}, m28415m = "intercept", m28414n = {"this", NamedConstantsKt.SHIPPING_VALUES, "setupForFutureUsage"}, m28413s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class DefaultIntentConfirmationInterceptor$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIntentConfirmationInterceptor$intercept$1(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super DefaultIntentConfirmationInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.intercept((String) null, (PaymentMethodCreateParams) null, (ConfirmPaymentIntentParams.Shipping) null, (ConfirmPaymentIntentParams.SetupFutureUsage) null, this);
    }
}
