package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripePaymentController", m28418f = "StripePaymentController.kt", m28417i = {}, m28416l = {253}, m28415m = "confirmSetupIntent", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class StripePaymentController$confirmSetupIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmSetupIntent$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$confirmSetupIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object confirmSetupIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmSetupIntent = this.this$0.confirmSetupIntent(null, null, this);
        return confirmSetupIntent;
    }
}
