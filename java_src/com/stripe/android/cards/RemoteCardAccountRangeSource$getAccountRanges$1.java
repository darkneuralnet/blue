package com.stripe.android.cards;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.cards.RemoteCardAccountRangeSource", m28418f = "RemoteCardAccountRangeSource.kt", m28417i = {0, 0, 0}, m28416l = {32}, m28415m = "getAccountRanges", m28414n = {"this", "cardNumber", "bin"}, m28413s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class RemoteCardAccountRangeSource$getAccountRanges$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteCardAccountRangeSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCardAccountRangeSource$getAccountRanges$1(RemoteCardAccountRangeSource remoteCardAccountRangeSource, Continuation<? super RemoteCardAccountRangeSource$getAccountRanges$1> continuation) {
        super(continuation);
        this.this$0 = remoteCardAccountRangeSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAccountRanges(null, this);
    }
}
