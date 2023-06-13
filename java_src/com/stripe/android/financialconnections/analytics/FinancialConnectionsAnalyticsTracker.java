package com.stripe.android.financialconnections.analytics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "", "track", "Lkotlin/Result;", "", "event", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "track-gIAlu-s", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsAnalyticsTracker {
    /* renamed from: track-gIAlu-s  reason: not valid java name */
    Object mo116345trackgIAlus(FinancialConnectionsEvent financialConnectionsEvent, Continuation<? super Result<Unit>> continuation);
}
