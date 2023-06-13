package com.stripe.android.payments.bankaccount.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", m28418f = "CreateFinancialConnectionsSession.kt", m28417i = {}, m28416l = {49}, m28415m = "forSetupIntent-hUnOzRk", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CreateFinancialConnectionsSession$forSetupIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFinancialConnectionsSession$forSetupIntent$1(CreateFinancialConnectionsSession createFinancialConnectionsSession, Continuation<? super CreateFinancialConnectionsSession$forSetupIntent$1> continuation) {
        super(continuation);
        this.this$0 = createFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m116583forSetupIntenthUnOzRk = this.this$0.m116583forSetupIntenthUnOzRk(null, null, null, null, null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m116583forSetupIntenthUnOzRk == coroutine_suspended ? m116583forSetupIntenthUnOzRk : Result.m116782boximpl(m116583forSetupIntenthUnOzRk);
    }
}
