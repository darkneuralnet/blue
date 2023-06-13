package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor", m28418f = "StripeChallengeRequestExecutor.kt", m28417i = {0}, m28416l = {60}, m28415m = "execute", m28414n = {"creqData"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class StripeChallengeRequestExecutor$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeChallengeRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeChallengeRequestExecutor$execute$1(StripeChallengeRequestExecutor stripeChallengeRequestExecutor, Continuation<? super StripeChallengeRequestExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = stripeChallengeRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
