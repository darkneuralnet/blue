package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", m28418f = "PaymentSheetLoader.kt", m28417i = {0, 0, 0, 0, 0}, m28416l = {285}, m28415m = "createLinkConfiguration", m28414n = {"this", "config", "stripeIntent", "customerPhone", "shippingAddress"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$createLinkConfiguration$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$createLinkConfiguration$1(DefaultPaymentSheetLoader defaultPaymentSheetLoader, Continuation<? super DefaultPaymentSheetLoader$createLinkConfiguration$1> continuation) {
        super(continuation);
        this.this$0 = defaultPaymentSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createLinkConfiguration;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createLinkConfiguration = this.this$0.createLinkConfiguration(null, null, this);
        return createLinkConfiguration;
    }
}
