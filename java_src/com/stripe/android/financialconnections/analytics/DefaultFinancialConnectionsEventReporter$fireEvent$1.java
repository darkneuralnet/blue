package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1", m28418f = "DefaultFinancialConnectionsEventReporter.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultFinancialConnectionsEventReporter$fireEvent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsAnalyticsEvent $event;
    int label;
    final /* synthetic */ DefaultFinancialConnectionsEventReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFinancialConnectionsEventReporter$fireEvent$1(DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter, FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent, Continuation<? super DefaultFinancialConnectionsEventReporter$fireEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultFinancialConnectionsEventReporter;
        this.$event = financialConnectionsAnalyticsEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFinancialConnectionsEventReporter$fireEvent$1(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultFinancialConnectionsEventReporter$fireEvent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsRequestExecutor analyticsRequestExecutor;
        AnalyticsRequestFactory analyticsRequestFactory;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
            analyticsRequestFactory = this.this$0.analyticsRequestFactory;
            FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = this.$event;
            analyticsRequestExecutor.executeAsync(analyticsRequestFactory.createRequest(financialConnectionsAnalyticsEvent, financialConnectionsAnalyticsEvent.getAdditionalParams()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
