package com.stripe.android.financialconnections;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.domain.SynchronizeFinancialConnectionsSession;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$fetchManifest$1 extends Lambda implements Function1<FinancialConnectionsSheetState, Unit> {
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchManifest$1$1", m28418f = "FinancialConnectionsSheetViewModel.kt", m28417i = {}, m28416l = {79}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchManifest$1$1 */
    /* loaded from: classes7.dex */
    public static final class C186331 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsSheetState $state;
        int label;
        final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186331(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super C186331> continuation) {
            super(2, continuation);
            this.this$0 = financialConnectionsSheetViewModel;
            this.$state = financialConnectionsSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C186331(this.this$0, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C186331) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object m116783constructorimpl;
            SynchronizeFinancialConnectionsSession synchronizeFinancialConnectionsSession;
            String str;
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
                    synchronizeFinancialConnectionsSession = financialConnectionsSheetViewModel.synchronizeFinancialConnectionsSession;
                    String sessionSecret = financialConnectionsSheetState.getSessionSecret();
                    str = financialConnectionsSheetViewModel.applicationId;
                    this.label = 1;
                    obj = synchronizeFinancialConnectionsSession.invoke(sessionSecret, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((SynchronizeSessionResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.$state;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                financialConnectionsSheetViewModel2.finishWithResult(financialConnectionsSheetState2, new FinancialConnectionsSheetActivityResult.Failed(m116786exceptionOrNullimpl));
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = this.this$0;
            if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                financialConnectionsSheetViewModel3.openAuthFlow((SynchronizeSessionResponse) m116783constructorimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$fetchManifest$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel) {
        super(1);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetState financialConnectionsSheetState) {
        invoke2(financialConnectionsSheetState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Z30.m73800d(this.this$0.getViewModelScope(), null, null, new C186331(this.this$0, state, null), 3, null);
    }
}
