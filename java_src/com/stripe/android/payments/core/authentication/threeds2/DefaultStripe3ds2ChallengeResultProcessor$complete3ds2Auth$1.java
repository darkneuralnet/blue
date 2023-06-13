package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", m28418f = "Stripe3ds2ChallengeResultProcessor.kt", m28417i = {0, 0, 0, 0}, m28416l = {146, 162}, m28415m = "complete3ds2Auth", m28414n = {"this", "challengeResult", "requestOptions", "remainingRetries"}, m28413s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, Continuation<? super DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1> continuation) {
        super(continuation);
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object complete3ds2Auth;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        complete3ds2Auth = this.this$0.complete3ds2Auth(null, null, 0, this);
        return complete3ds2Auth;
    }
}
