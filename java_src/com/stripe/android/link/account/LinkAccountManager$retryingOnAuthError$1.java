package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager", m28418f = "LinkAccountManager.kt", m28417i = {0, 0, 1}, m28416l = {303, 310, 313}, m28415m = "retryingOnAuthError-gIAlu-s", m28414n = {"this", "apiCall", "apiCall"}, m28413s = {"L$0", "L$1", "L$0"})
/* loaded from: classes7.dex */
public final class LinkAccountManager$retryingOnAuthError$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$retryingOnAuthError$1(LinkAccountManager linkAccountManager, Continuation<? super LinkAccountManager$retryingOnAuthError$1> continuation) {
        super(continuation);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116487retryingOnAuthErrorgIAlus;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m116487retryingOnAuthErrorgIAlus = this.this$0.m116487retryingOnAuthErrorgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116487retryingOnAuthErrorgIAlus == coroutine_suspended ? m116487retryingOnAuthErrorgIAlus : Result.m116782boximpl(m116487retryingOnAuthErrorgIAlus);
    }
}
