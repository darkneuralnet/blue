package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel", m28418f = "PollingViewModel.kt", m28417i = {0}, m28416l = {102}, m28415m = "performOneOffPoll", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class PollingViewModel$performOneOffPoll$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PollingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingViewModel$performOneOffPoll$1(PollingViewModel pollingViewModel, Continuation<? super PollingViewModel$performOneOffPoll$1> continuation) {
        super(continuation);
        this.this$0 = pollingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performOneOffPoll;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performOneOffPoll = this.this$0.performOneOffPoll(this);
        return performOneOffPoll;
    }
}