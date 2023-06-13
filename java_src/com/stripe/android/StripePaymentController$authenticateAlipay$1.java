package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripePaymentController", m28418f = "StripePaymentController.kt", m28417i = {0, 0, 0, 1, 1}, m28416l = {472, 474}, m28415m = "authenticateAlipay", m28414n = {"this", "paymentIntent", "requestOptions", "this", "outcome"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "I$0"})
/* loaded from: classes6.dex */
public final class StripePaymentController$authenticateAlipay$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$authenticateAlipay$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$authenticateAlipay$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object authenticateAlipay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        authenticateAlipay = this.this$0.authenticateAlipay(null, null, null, this);
        return authenticateAlipay;
    }
}
