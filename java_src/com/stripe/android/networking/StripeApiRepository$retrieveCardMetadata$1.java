package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.networking.StripeApiRepository", m28418f = "StripeApiRepository.kt", m28417i = {0}, m28416l = {1609}, m28415m = "retrieveCardMetadata", m28414n = {"bin"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class StripeApiRepository$retrieveCardMetadata$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$retrieveCardMetadata$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$retrieveCardMetadata$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveCardMetadata(null, null, this);
    }
}