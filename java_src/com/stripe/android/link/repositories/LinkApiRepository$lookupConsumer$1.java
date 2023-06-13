package com.stripe.android.link.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.repositories.LinkApiRepository", m28418f = "LinkApiRepository.kt", m28417i = {}, m28416l = {43}, m28415m = "lookupConsumer-0E7RQCE", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkApiRepository$lookupConsumer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$lookupConsumer$1(LinkApiRepository linkApiRepository, Continuation<? super LinkApiRepository$lookupConsumer$1> continuation) {
        super(continuation);
        this.this$0 = linkApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo116508lookupConsumer0E7RQCE = this.this$0.mo116508lookupConsumer0E7RQCE(null, null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo116508lookupConsumer0E7RQCE == coroutine_suspended ? mo116508lookupConsumer0E7RQCE : Result.m116782boximpl(mo116508lookupConsumer0E7RQCE);
    }
}
