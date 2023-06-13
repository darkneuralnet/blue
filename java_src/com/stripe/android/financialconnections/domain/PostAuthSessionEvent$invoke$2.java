package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PostAuthSessionEvent", m28418f = "PostAuthSessionEvent.kt", m28417i = {}, m28416l = {25}, m28415m = "invoke-0E7RQCE", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PostAuthSessionEvent$invoke$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostAuthSessionEvent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAuthSessionEvent$invoke$2(PostAuthSessionEvent postAuthSessionEvent, Continuation<? super PostAuthSessionEvent$invoke$2> continuation) {
        super(continuation);
        this.this$0 = postAuthSessionEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116348invoke0E7RQCE = this.this$0.m116348invoke0E7RQCE((String) null, (AuthSessionEvent) null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116348invoke0E7RQCE == coroutine_suspended ? m116348invoke0E7RQCE : Result.m116782boximpl(m116348invoke0E7RQCE);
    }
}
