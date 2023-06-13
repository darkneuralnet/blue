package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.CompleteAuthorizationSession", m28418f = "CompleteAuthorizationSession.kt", m28417i = {0}, m28416l = {19, 23}, m28415m = "invoke", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class CompleteAuthorizationSession$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CompleteAuthorizationSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteAuthorizationSession$invoke$1(CompleteAuthorizationSession completeAuthorizationSession, Continuation<? super CompleteAuthorizationSession$invoke$1> continuation) {
        super(continuation);
        this.this$0 = completeAuthorizationSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
