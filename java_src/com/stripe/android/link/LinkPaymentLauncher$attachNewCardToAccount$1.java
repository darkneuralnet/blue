package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.LinkPaymentLauncher", m28418f = "LinkPaymentLauncher.kt", m28417i = {}, m28416l = {175}, m28415m = "attachNewCardToAccount-0E7RQCE", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkPaymentLauncher$attachNewCardToAccount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkPaymentLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPaymentLauncher$attachNewCardToAccount$1(LinkPaymentLauncher linkPaymentLauncher, Continuation<? super LinkPaymentLauncher$attachNewCardToAccount$1> continuation) {
        super(continuation);
        this.this$0 = linkPaymentLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116483attachNewCardToAccount0E7RQCE = this.this$0.m116483attachNewCardToAccount0E7RQCE(null, null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116483attachNewCardToAccount0E7RQCE == coroutine_suspended ? m116483attachNewCardToAccount0E7RQCE : Result.m116782boximpl(m116483attachNewCardToAccount0E7RQCE);
    }
}