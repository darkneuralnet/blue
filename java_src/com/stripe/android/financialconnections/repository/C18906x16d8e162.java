package com.stripe.android.financialconnections.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", m28418f = "FinancialConnectionsManifestRepository.kt", m28417i = {0}, m28416l = {299}, m28415m = "completeAuthorizationSession", m28414n = {"this"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1 */
/* loaded from: classes7.dex */
public final class C18906x16d8e162 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsManifestRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18906x16d8e162(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, Continuation<? super C18906x16d8e162> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsManifestRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.completeAuthorizationSession(null, null, null, this);
    }
}
