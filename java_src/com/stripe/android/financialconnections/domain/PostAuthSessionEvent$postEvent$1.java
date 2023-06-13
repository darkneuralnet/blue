package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PostAuthSessionEvent", m28418f = "PostAuthSessionEvent.kt", m28417i = {0}, m28416l = {31}, m28415m = "postEvent-0E7RQCE", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class PostAuthSessionEvent$postEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostAuthSessionEvent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAuthSessionEvent$postEvent$1(PostAuthSessionEvent postAuthSessionEvent, Continuation<? super PostAuthSessionEvent$postEvent$1> continuation) {
        super(continuation);
        this.this$0 = postAuthSessionEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116347postEvent0E7RQCE;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m116347postEvent0E7RQCE = this.this$0.m116347postEvent0E7RQCE(null, null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116347postEvent0E7RQCE == coroutine_suspended ? m116347postEvent0E7RQCE : Result.m116782boximpl(m116347postEvent0E7RQCE);
    }
}
