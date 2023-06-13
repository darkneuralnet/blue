package com.stripe.android.paymentsheet.model;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.model.PaymentOptionFactory", m28418f = "PaymentOptionFactory.kt", m28417i = {0, 0}, m28416l = {37}, m28415m = "loadPaymentOption$loadIcon", m28414n = {"this$0", "$paymentOption"}, m28413s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class PaymentOptionFactory$loadPaymentOption$loadIcon$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public PaymentOptionFactory$loadPaymentOption$loadIcon$1(Continuation<? super PaymentOptionFactory$loadPaymentOption$loadIcon$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadPaymentOption$loadIcon;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadPaymentOption$loadIcon = PaymentOptionFactory.loadPaymentOption$loadIcon(null, null, null, this);
        return loadPaymentOption$loadIcon;
    }
}
