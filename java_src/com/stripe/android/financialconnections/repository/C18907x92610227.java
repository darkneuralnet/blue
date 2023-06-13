package com.stripe.android.financialconnections.repository;

import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", m28418f = "FinancialConnectionsManifestRepository.kt", m28417i = {0, 0, 0, 0, 1, 1}, m28416l = {396, 164}, m28415m = "getOrFetchSynchronizeFinancialConnectionsSession", m28414n = {"this", "clientSecret", NamedConstantsKt.APPLICATION_ID, "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$getOrFetchSynchronizeFinancialConnectionsSession_u24lambda_u242_u24lambda_u241"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1 */
/* loaded from: classes7.dex */
public final class C18907x92610227 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsManifestRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18907x92610227(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, Continuation<? super C18907x92610227> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsManifestRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getOrFetchSynchronizeFinancialConnectionsSession(null, null, this);
    }
}
