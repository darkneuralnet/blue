package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader", m28418f = "PaymentSheetLoader.kt", m28417i = {0, 0, 0, 0, 0}, m28416l = {194, 209}, m28415m = "retrieveSavedPaymentSelection", m28414n = {"this", "prefsRepository", "paymentMethods", "isGooglePayReady", "isLinkReady"}, m28413s = {"L$0", "L$1", "L$2", "Z$0", "Z$1"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1(DefaultPaymentSheetLoader defaultPaymentSheetLoader, Continuation<? super DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1> continuation) {
        super(continuation);
        this.this$0 = defaultPaymentSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object retrieveSavedPaymentSelection;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        retrieveSavedPaymentSelection = this.this$0.retrieveSavedPaymentSelection(null, false, false, null, this);
        return retrieveSavedPaymentSelection;
    }
}
