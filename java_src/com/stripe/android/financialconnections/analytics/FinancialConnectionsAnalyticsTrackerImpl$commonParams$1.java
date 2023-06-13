package com.stripe.android.financialconnections.analytics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl", m28418f = "FinancialConnectionsAnalyticsTracker.kt", m28417i = {0}, m28416l = {53}, m28415m = "commonParams", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl$commonParams$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsAnalyticsTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAnalyticsTrackerImpl$commonParams$1(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Continuation<? super FinancialConnectionsAnalyticsTrackerImpl$commonParams$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsAnalyticsTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object commonParams;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        commonParams = this.this$0.commonParams(this);
        return commonParams;
    }
}
