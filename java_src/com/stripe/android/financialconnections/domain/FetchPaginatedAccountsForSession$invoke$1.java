package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession", m28418f = "FetchPaginatedAccountsForSession.kt", m28417i = {0, 0, 0, 1, 1, 1}, m28416l = {28, 34}, m28415m = "invoke", m28414n = {"this", "session", "accounts", "this", "session", "accounts"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class FetchPaginatedAccountsForSession$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchPaginatedAccountsForSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPaginatedAccountsForSession$invoke$1(FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, Continuation<? super FetchPaginatedAccountsForSession$invoke$1> continuation) {
        super(continuation);
        this.this$0 = fetchPaginatedAccountsForSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
