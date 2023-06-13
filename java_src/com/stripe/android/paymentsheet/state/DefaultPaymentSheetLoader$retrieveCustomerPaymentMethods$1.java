package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", m28418f = "PaymentSheetLoader.kt", m28417i = {}, m28416l = {178}, m28415m = "retrieveCustomerPaymentMethods", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1(DefaultPaymentSheetLoader defaultPaymentSheetLoader, Continuation<? super DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1> continuation) {
        super(continuation);
        this.this$0 = defaultPaymentSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object retrieveCustomerPaymentMethods;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        retrieveCustomerPaymentMethods = this.this$0.retrieveCustomerPaymentMethods(null, null, null, this);
        return retrieveCustomerPaymentMethods;
    }
}
