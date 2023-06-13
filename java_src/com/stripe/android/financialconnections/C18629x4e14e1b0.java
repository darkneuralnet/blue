package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
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
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1", m28418f = "FinancialConnectionsSheetViewModel.kt", m28417i = {}, m28416l = {234}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1 */
/* loaded from: classes7.dex */
public final class C18629x4e14e1b0 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSheetState $state;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18629x4e14e1b0(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super C18629x4e14e1b0> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetViewModel;
        this.$state = financialConnectionsSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C18629x4e14e1b0(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((C18629x4e14e1b0) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
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
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = this.this$0;
                FinancialConnectionsSheetState financialConnectionsSheetState = this.$state;
                Result.Companion companion = Result.Companion;
                fetchFinancialConnectionsSession = financialConnectionsSheetViewModel.fetchFinancialConnectionsSession;
                String sessionSecret = financialConnectionsSheetState.getSessionSecret();
                this.label = 1;
                obj = fetchFinancialConnectionsSession.invoke(sessionSecret, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
        FinancialConnectionsSheetState financialConnectionsSheetState2 = this.$state;
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
            financialConnectionsSheetViewModel2.finishWithResult(financialConnectionsSheetState2, new FinancialConnectionsSheetActivityResult.Completed(null, (FinancialConnectionsSession) m116783constructorimpl, null, 5, null));
        }
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            financialConnectionsSheetViewModel3.withState(new C18630x907dab0c(financialConnectionsSheetViewModel3, m116786exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
