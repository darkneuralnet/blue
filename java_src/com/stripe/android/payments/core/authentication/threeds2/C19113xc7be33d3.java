package com.stripe.android.payments.core.authentication.threeds2;

import androidx.recyclerview.widget.C11925l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor", m28418f = "Stripe3ds2ChallengeResultProcessor.kt", m28417i = {0, 0, 0, 0}, m28416l = {C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, 208}, m28415m = "onComplete3ds2AuthFailure", m28414n = {"this", "challengeResult", "requestOptions", "remainingRetries"}, m28413s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 */
/* loaded from: classes7.dex */
public final class C19113xc7be33d3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19113xc7be33d3(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, Continuation<? super C19113xc7be33d3> continuation) {
        super(continuation);
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object onComplete3ds2AuthFailure;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onComplete3ds2AuthFailure = this.this$0.onComplete3ds2AuthFailure(null, null, 0, null, this);
        return onComplete3ds2AuthFailure;
    }
}
