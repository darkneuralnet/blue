package com.stripe.android.financialconnections.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", m28418f = "FinancialConnectionsAccountsRepository.kt", m28417i = {0, 0, 0, 0, 1}, m28416l = {170, 79}, m28415m = "getOrFetchAccounts", m28414n = {"this", "clientSecret", "sessionId", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsAccountsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1(FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, Continuation<? super FinancialConnectionsAccountsRepositoryImpl$getOrFetchAccounts$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsAccountsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getOrFetchAccounts(null, null, this);
    }
}
