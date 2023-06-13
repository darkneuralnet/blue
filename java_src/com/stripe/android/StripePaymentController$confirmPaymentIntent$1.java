package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripePaymentController", m28418f = "StripePaymentController.kt", m28417i = {}, m28416l = {236}, m28415m = "confirmPaymentIntent", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class StripePaymentController$confirmPaymentIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmPaymentIntent$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$confirmPaymentIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object confirmPaymentIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmPaymentIntent = this.this$0.confirmPaymentIntent(null, null, this);
        return confirmPaymentIntent;
    }
}
