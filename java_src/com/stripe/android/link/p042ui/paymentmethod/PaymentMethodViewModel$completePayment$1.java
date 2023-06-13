package com.stripe.android.link.p042ui.paymentmethod;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel", m28418f = "PaymentMethodViewModel.kt", m28417i = {0}, m28416l = {208}, m28415m = "completePayment", m28414n = {"this"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$completePayment$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel$completePayment$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$completePayment$1(PaymentMethodViewModel paymentMethodViewModel, Continuation<? super PaymentMethodViewModel$completePayment$1> continuation) {
        super(continuation);
        this.this$0 = paymentMethodViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object completePayment;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        completePayment = this.this$0.completePayment(null, this);
        return completePayment;
    }
}
