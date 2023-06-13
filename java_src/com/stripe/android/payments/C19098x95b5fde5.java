package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.PaymentFlowResultProcessor", m28418f = "PaymentFlowResultProcessor.kt", m28417i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, m28416l = {213, 219, 231, 234, 240}, m28415m = "refreshStripeIntentUntilTerminalState", m28414n = {"this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* renamed from: com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 */
/* loaded from: classes7.dex */
public final class C19098x95b5fde5 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentFlowResultProcessor<T, S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19098x95b5fde5(PaymentFlowResultProcessor<T, ? extends S> paymentFlowResultProcessor, Continuation<? super C19098x95b5fde5> continuation) {
        super(continuation);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object refreshStripeIntentUntilTerminalState;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        refreshStripeIntentUntilTerminalState = this.this$0.refreshStripeIntentUntilTerminalState(null, null, null, this);
        return refreshStripeIntentUntilTerminalState;
    }
}
