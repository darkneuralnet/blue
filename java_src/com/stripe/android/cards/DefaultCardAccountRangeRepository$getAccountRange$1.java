package com.stripe.android.cards;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.cards.DefaultCardAccountRangeRepository", m28418f = "DefaultCardAccountRangeRepository.kt", m28417i = {0, 0, 1, 1, 2, 2}, m28416l = {17, 18, 20, 21}, m28415m = "getAccountRange", m28414n = {"this", "cardNumber", "this", "cardNumber", "this", "cardNumber"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class DefaultCardAccountRangeRepository$getAccountRange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultCardAccountRangeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepository$getAccountRange$1(DefaultCardAccountRangeRepository defaultCardAccountRangeRepository, Continuation<? super DefaultCardAccountRangeRepository$getAccountRange$1> continuation) {
        super(continuation);
        this.this$0 = defaultCardAccountRangeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountRange(null, this);
    }
}
