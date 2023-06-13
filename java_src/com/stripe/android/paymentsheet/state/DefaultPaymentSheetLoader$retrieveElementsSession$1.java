package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", m28418f = "PaymentSheetLoader.kt", m28417i = {0}, m28416l = {229}, m28415m = "retrieveElementsSession", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$retrieveElementsSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$retrieveElementsSession$1(DefaultPaymentSheetLoader defaultPaymentSheetLoader, Continuation<? super DefaultPaymentSheetLoader$retrieveElementsSession$1> continuation) {
        super(continuation);
        this.this$0 = defaultPaymentSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object retrieveElementsSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        retrieveElementsSession = this.this$0.retrieveElementsSession(null, null, this);
        return retrieveElementsSession;
    }
}
