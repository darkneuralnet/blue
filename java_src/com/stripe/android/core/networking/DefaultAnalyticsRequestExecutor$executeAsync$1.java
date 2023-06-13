package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1", m28418f = "DefaultAnalyticsRequestExecutor.kt", m28417i = {}, m28416l = {45}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class DefaultAnalyticsRequestExecutor$executeAsync$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnalyticsRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultAnalyticsRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor$executeAsync$1(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, AnalyticsRequest analyticsRequest, Continuation<? super DefaultAnalyticsRequestExecutor$executeAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultAnalyticsRequestExecutor;
        this.$request = analyticsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultAnalyticsRequestExecutor$executeAsync$1 defaultAnalyticsRequestExecutor$executeAsync$1 = new DefaultAnalyticsRequestExecutor$executeAsync$1(this.this$0, this.$request, continuation);
        defaultAnalyticsRequestExecutor$executeAsync$1.L$0 = obj;
        return defaultAnalyticsRequestExecutor$executeAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultAnalyticsRequestExecutor$executeAsync$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        Logger logger;
        StripeNetworkClient stripeNetworkClient;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = this.this$0;
                AnalyticsRequest analyticsRequest = this.$request;
                Result.Companion companion = Result.Companion;
                stripeNetworkClient = defaultAnalyticsRequestExecutor.stripeNetworkClient;
                this.label = 1;
                obj = stripeNetworkClient.executeRequest(analyticsRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            logger = defaultAnalyticsRequestExecutor2.logger;
            logger.error("Exception while making analytics request", m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
