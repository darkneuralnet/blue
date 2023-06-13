package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", m28418f = "ChallengeActionHandler.kt", m28417i = {0, 0, 1, 1}, m28416l = {78, 81}, m28415m = "executeChallengeRequest", m28414n = {"this", "creqData", "this", "creqData"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
public final class ChallengeActionHandler$Default$executeChallengeRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$executeChallengeRequest$1(ChallengeActionHandler.Default r1, Continuation<? super ChallengeActionHandler$Default$executeChallengeRequest$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object executeChallengeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeChallengeRequest = this.this$0.executeChallengeRequest(null, this);
        return executeChallengeRequest;
    }
}
