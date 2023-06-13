package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.StripePaymentController", m28418f = "StripePaymentController.kt", m28417i = {0, 0}, m28416l = {204, 203}, m28415m = "confirmAndAuthenticateAlipay", m28414n = {"authenticator", "requestOptions"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class StripePaymentController$confirmAndAuthenticateAlipay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmAndAuthenticateAlipay$1(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController$confirmAndAuthenticateAlipay$1> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.confirmAndAuthenticateAlipay(null, null, null, this);
    }
}
