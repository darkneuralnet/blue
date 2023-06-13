package com.stripe.android.financialconnections.analytics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl", m28418f = "FinancialConnectionsAnalyticsTracker.kt", m28417i = {0, 0, 0, 0, 1, 1, 1}, m28416l = {37, 43}, m28415m = "track-gIAlu-s", m28414n = {"this", "event", "$this$track_gIAlu_s_u24lambda_u240", "eventParams", "this", "$this$track_gIAlu_s_u24lambda_u240", "request"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl$track$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinancialConnectionsAnalyticsTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAnalyticsTrackerImpl$track$1(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Continuation<? super FinancialConnectionsAnalyticsTrackerImpl$track$1> continuation) {
        super(continuation);
        this.this$0 = financialConnectionsAnalyticsTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo116345trackgIAlus = this.this$0.mo116345trackgIAlus(null, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo116345trackgIAlus == coroutine_suspended ? mo116345trackgIAlus : Result.m116782boximpl(mo116345trackgIAlus);
    }
}
