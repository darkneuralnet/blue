package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.CancelAuthorizationSession", m28418f = "CancelAuthorizationSession.kt", m28417i = {0}, m28416l = {18, 21}, m28415m = "invoke", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class CancelAuthorizationSession$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CancelAuthorizationSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelAuthorizationSession$invoke$1(CancelAuthorizationSession cancelAuthorizationSession, Continuation<? super CancelAuthorizationSession$invoke$1> continuation) {
        super(continuation);
        this.this$0 = cancelAuthorizationSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
