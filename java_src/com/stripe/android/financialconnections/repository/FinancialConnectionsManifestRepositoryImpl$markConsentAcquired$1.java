package com.stripe.android.financialconnections.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", m28418f = "FinancialConnectionsManifestRepository.kt", m28417i = {0, 0, 0, 1, 1}, m28416l = {396, 211}, m28415m = "markConsentAcquired", m28414n = {"this", "clientSecret", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsManifestRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, Continuation<? super FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsManifestRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.markConsentAcquired(null, this);
    }
}
