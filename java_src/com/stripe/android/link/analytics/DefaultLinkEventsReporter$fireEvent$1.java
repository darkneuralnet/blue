package com.stripe.android.link.analytics;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.analytics.DefaultLinkEventsReporter$fireEvent$1", m28418f = "DefaultLinkEventsReporter.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultLinkEventsReporter$fireEvent$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $additionalParams;
    final /* synthetic */ LinkEvent $event;
    int label;
    final /* synthetic */ DefaultLinkEventsReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLinkEventsReporter$fireEvent$1(DefaultLinkEventsReporter defaultLinkEventsReporter, LinkEvent linkEvent, Map<String, ? extends Object> map, Continuation<? super DefaultLinkEventsReporter$fireEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultLinkEventsReporter;
        this.$event = linkEvent;
        this.$additionalParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultLinkEventsReporter$fireEvent$1(this.this$0, this.$event, this.$additionalParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultLinkEventsReporter$fireEvent$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
            paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
            LinkEvent linkEvent = this.$event;
            Map<String, ? extends Object> map = this.$additionalParams;
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(linkEvent, map));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
