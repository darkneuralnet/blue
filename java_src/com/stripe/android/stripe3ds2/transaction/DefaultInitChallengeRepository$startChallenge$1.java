package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository", m28418f = "InitChallengeRepository.kt", m28417i = {0, 0, 0, 0, 0}, m28416l = {67}, m28415m = "startChallenge", m28414n = {"this", "args", "$this$startChallenge_u24lambda_u240", "errorRequestExecutor", "creqExecutorConfig"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes7.dex */
public final class DefaultInitChallengeRepository$startChallenge$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultInitChallengeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultInitChallengeRepository$startChallenge$1(DefaultInitChallengeRepository defaultInitChallengeRepository, Continuation<? super DefaultInitChallengeRepository$startChallenge$1> continuation) {
        super(continuation);
        this.this$0 = defaultInitChallengeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startChallenge(null, this);
    }
}
