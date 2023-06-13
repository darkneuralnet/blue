package com.stripe.android.polling;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.polling.DefaultIntentStatusPoller", m28418f = "DefaultIntentStatusPoller.kt", m28417i = {}, m28416l = {58}, m28415m = "fetchIntentStatus", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultIntentStatusPoller$fetchIntentStatus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentStatusPoller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultIntentStatusPoller$fetchIntentStatus$1(DefaultIntentStatusPoller defaultIntentStatusPoller, Continuation<? super DefaultIntentStatusPoller$fetchIntentStatus$1> continuation) {
        super(continuation);
        this.this$0 = defaultIntentStatusPoller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchIntentStatus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchIntentStatus = this.this$0.fetchIntentStatus(this);
        return fetchIntentStatus;
    }
}
