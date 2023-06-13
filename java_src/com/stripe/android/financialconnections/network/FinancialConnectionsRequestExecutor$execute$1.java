package com.stripe.android.financialconnections.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor", m28418f = "FinancialConnectionsRequestExecutor.kt", m28417i = {0, 0, 0}, m28416l = {34}, m28415m = "execute", m28414n = {"this", "request", "responseSerializer"}, m28413s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsRequestExecutor$execute$1<Response> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsRequestExecutor$execute$1(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, Continuation<? super FinancialConnectionsRequestExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, null, this);
    }
}
