package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.networking.StripeApiRepository", m28418f = "StripeApiRepository.kt", m28417i = {0, 0, 0, 0}, m28416l = {1720}, m28415m = "makeApiRequest$payments_core_release", m28414n = {"this", "apiRequest", "onResponse", "dnsCacheData"}, m28413s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes7.dex */
public final class StripeApiRepository$makeApiRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$makeApiRequest$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$makeApiRequest$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.makeApiRequest$payments_core_release(null, null, this);
    }
}
