package com.stripe.android.financialconnections.presentation;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.features.manualentry.CustomManualEntryKt;
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
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1", m28418f = "FinancialConnectionsSheetNativeViewModel.kt", m28417i = {1, 2}, m28416l = {235, 240, 273}, m28415m = "invokeSuspend", m28414n = {"session", "completeSessionError"}, m28413s = {"L$3", "L$3"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $closeAuthFlowError;
    final /* synthetic */ NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause $earlyTerminationCause;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause earlyTerminationCause, Throwable th, Continuation<? super FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeViewModel;
        this.$earlyTerminationCause = earlyTerminationCause;
        this.$closeAuthFlowError = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(this.this$0, this.$earlyTerminationCause, this.$closeAuthFlowError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        Object obj2;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel;
        FinancialConnectionsSession financialConnectionsSession;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        Throwable th;
        Throwable th2;
        Throwable m116786exceptionOrNullimpl;
        Logger logger;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker2;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2;
        Throwable th3;
        FinancialConnectionsSession financialConnectionsSession2;
        CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th4) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th4));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        th3 = (Throwable) this.L$3;
                        th2 = (Throwable) this.L$2;
                        financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) this.L$1;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        financialConnectionsSheetNativeViewModel2.setState(new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$3$1(th2, th3));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSession = (FinancialConnectionsSession) this.L$3;
                th = (Throwable) this.L$2;
                financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.L$1;
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
                financialConnectionsSession2 = financialConnectionsSession;
                if (!CustomManualEntryKt.isCustomManualEntryError(financialConnectionsSession2)) {
                    financialConnectionsSheetNativeViewModel.setState(new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$1(new FinancialConnectionsSheetActivityResult.Failed(new CustomManualEntryRequiredError())));
                } else if (!(!financialConnectionsSession2.getAccounts().getData().isEmpty()) && financialConnectionsSession2.getPaymentAccount() == null && financialConnectionsSession2.getBankAccountToken$financial_connections_release() == null) {
                    if (th != null) {
                        financialConnectionsSheetNativeViewModel.setState(new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$3(th));
                    } else {
                        financialConnectionsSheetNativeViewModel.setState(FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$4.INSTANCE);
                    }
                } else {
                    financialConnectionsSheetNativeViewModel.setState(new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$2(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession2, financialConnectionsSession2.getParsedToken$financial_connections_release(), 1, null)));
                }
                FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel3 = this.this$0;
                th2 = this.$closeAuthFlowError;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
                if (m116786exceptionOrNullimpl != null) {
                    logger = financialConnectionsSheetNativeViewModel3.logger;
                    logger.error("Error completing session before closing", m116786exceptionOrNullimpl);
                    financialConnectionsAnalyticsTracker2 = financialConnectionsSheetNativeViewModel3.eventTracker;
                    FinancialConnectionsEvent.Complete complete = new FinancialConnectionsEvent.Complete(m116786exceptionOrNullimpl, null);
                    this.L$0 = obj2;
                    this.L$1 = financialConnectionsSheetNativeViewModel3;
                    this.L$2 = th2;
                    this.L$3 = m116786exceptionOrNullimpl;
                    this.label = 3;
                    if (financialConnectionsAnalyticsTracker2.mo116345trackgIAlus(complete, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsSheetNativeViewModel2 = financialConnectionsSheetNativeViewModel3;
                    th3 = m116786exceptionOrNullimpl;
                    financialConnectionsSheetNativeViewModel2.setState(new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$3$1(th2, th3));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel4 = this.this$0;
            NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause earlyTerminationCause = this.$earlyTerminationCause;
            Result.Companion companion2 = Result.Companion;
            completeFinancialConnectionsSession = financialConnectionsSheetNativeViewModel4.completeFinancialConnectionsSession;
            if (earlyTerminationCause != null) {
                str = earlyTerminationCause.getValue();
            } else {
                str = null;
            }
            this.label = 1;
            obj = completeFinancialConnectionsSession.invoke(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj);
        obj2 = m116783constructorimpl;
        financialConnectionsSheetNativeViewModel = this.this$0;
        Throwable th5 = this.$closeAuthFlowError;
        if (Result.m116790isSuccessimpl(obj2)) {
            financialConnectionsSession = (FinancialConnectionsSession) obj2;
            financialConnectionsAnalyticsTracker = financialConnectionsSheetNativeViewModel.eventTracker;
            FinancialConnectionsEvent.Complete complete2 = new FinancialConnectionsEvent.Complete(null, Boxing.boxInt(financialConnectionsSession.getAccounts().getData().size()));
            this.L$0 = obj2;
            this.L$1 = financialConnectionsSheetNativeViewModel;
            this.L$2 = th5;
            this.L$3 = financialConnectionsSession;
            this.label = 2;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(complete2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            th = th5;
            financialConnectionsSession2 = financialConnectionsSession;
            if (!CustomManualEntryKt.isCustomManualEntryError(financialConnectionsSession2)) {
            }
        }
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel32 = this.this$0;
        th2 = this.$closeAuthFlowError;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
