package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.cards.CardAccountRangeSource$DefaultImpls", m28418f = "CardAccountRangeSource.kt", m28417i = {0}, m28416l = {10}, m28415m = "getAccountRange", m28414n = {"cardNumber"}, m28413s = {"L$0"})
/* loaded from: classes6.dex */
public final class CardAccountRangeSource$getAccountRange$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public CardAccountRangeSource$getAccountRange$1(Continuation<? super CardAccountRangeSource$getAccountRange$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CardAccountRangeSource.DefaultImpls.getAccountRange(null, null, this);
    }
}
