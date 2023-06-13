package com.stripe.android.polling;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.polling.DefaultIntentStatusPoller", m28418f = "DefaultIntentStatusPoller.kt", m28417i = {0, 1}, m28416l = {45, 49, 50}, m28415m = "performPoll", m28414n = {"this", "this"}, m28413s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
public final class DefaultIntentStatusPoller$performPoll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentStatusPoller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIntentStatusPoller$performPoll$1(DefaultIntentStatusPoller defaultIntentStatusPoller, Continuation<? super DefaultIntentStatusPoller$performPoll$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentStatusPoller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performPoll;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performPoll = this.this$0.performPoll(false, this);
        return performPoll;
    }
}
