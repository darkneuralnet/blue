package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$3", m28418f = "SuccessViewModel.kt", m28417i = {}, m28416l = {76}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class SuccessViewModel$observeAsyncs$3 extends SuspendLambda implements Function2<SuccessState.Payload, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuccessViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel$observeAsyncs$3(SuccessViewModel successViewModel, Continuation<? super SuccessViewModel$observeAsyncs$3> continuation) {
        super(2, continuation);
        this.this$0 = successViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuccessViewModel$observeAsyncs$3 successViewModel$observeAsyncs$3 = new SuccessViewModel$observeAsyncs$3(this.this$0, continuation);
        successViewModel$observeAsyncs$3.L$0 = obj;
        return successViewModel$observeAsyncs$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SuccessState.Payload payload, Continuation<? super Unit> continuation) {
        return ((SuccessViewModel$observeAsyncs$3) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!((SuccessState.Payload) this.L$0).getSkipSuccessPane()) {
                financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
                FinancialConnectionsEvent.PaneLoaded paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.SUCCESS);
                this.label = 1;
                if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.completeSession();
            }
        }
        return Unit.INSTANCE;
    }
}