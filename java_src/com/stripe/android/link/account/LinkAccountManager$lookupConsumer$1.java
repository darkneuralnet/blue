package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager", m28418f = "LinkAccountManager.kt", m28417i = {0, 0, 0}, m28416l = {100, 122}, m28415m = "lookupConsumer-0E7RQCE", m28414n = {"this", "email", "startSession"}, m28413s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes7.dex */
public final class LinkAccountManager$lookupConsumer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$lookupConsumer$1(LinkAccountManager linkAccountManager, Continuation<? super LinkAccountManager$lookupConsumer$1> continuation) {
        super(continuation);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116495lookupConsumer0E7RQCE = this.this$0.m116495lookupConsumer0E7RQCE(null, false, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116495lookupConsumer0E7RQCE == coroutine_suspended ? m116495lookupConsumer0E7RQCE : Result.m116782boximpl(m116495lookupConsumer0E7RQCE);
    }
}
