package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$6", m28418f = "SuccessViewModel.kt", m28417i = {0}, m28416l = {86, 92}, m28415m = "invokeSuspend", m28414n = {"it"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class SuccessViewModel$observeAsyncs$6 extends SuspendLambda implements Function2<FinancialConnectionsSession, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuccessViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel$observeAsyncs$6(SuccessViewModel successViewModel, Continuation<? super SuccessViewModel$observeAsyncs$6> continuation) {
        super(2, continuation);
        this.this$0 = successViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuccessViewModel$observeAsyncs$6 successViewModel$observeAsyncs$6 = new SuccessViewModel$observeAsyncs$6(this.this$0, continuation);
        successViewModel$observeAsyncs$6.L$0 = obj;
        return successViewModel$observeAsyncs$6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FinancialConnectionsSession financialConnectionsSession, Continuation<? super Unit> continuation) {
        return ((SuccessViewModel$observeAsyncs$6) create(financialConnectionsSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsSession financialConnectionsSession;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsSession = (FinancialConnectionsSession) this.L$0;
            ResultKt.throwOnFailure(obj);
            ((Result) obj).m116792unboximpl();
        } else {
            ResultKt.throwOnFailure(obj);
            financialConnectionsSession = (FinancialConnectionsSession) this.L$0;
            financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.Complete complete = new FinancialConnectionsEvent.Complete(null, Boxing.boxInt(financialConnectionsSession.getAccounts().getData().size()));
            this.L$0 = financialConnectionsSession;
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(complete, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        FinancialConnectionsSession financialConnectionsSession2 = financialConnectionsSession;
        nativeAuthFlowCoordinator = this.this$0.nativeAuthFlowCoordinator;
        BX2<NativeAuthFlowCoordinator.Message> invoke = nativeAuthFlowCoordinator.invoke();
        NativeAuthFlowCoordinator.Message.Finish finish = new NativeAuthFlowCoordinator.Message.Finish(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession2, financialConnectionsSession2.getParsedToken$financial_connections_release(), 1, null));
        this.L$0 = null;
        this.label = 2;
        if (invoke.emit(finish, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
