package com.stripe.android.financialconnections.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl", m28418f = "FinancialConnectionsAccountsRepository.kt", m28417i = {0}, m28416l = {95}, m28415m = "postAuthorizationSessionAccounts", m28414n = {"this"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1 */
/* loaded from: classes7.dex */
public final class C18903xec0926b8 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsAccountsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18903xec0926b8(FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, Continuation<? super C18903xec0926b8> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsAccountsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.postAuthorizationSessionAccounts(null, null, this);
    }
}
