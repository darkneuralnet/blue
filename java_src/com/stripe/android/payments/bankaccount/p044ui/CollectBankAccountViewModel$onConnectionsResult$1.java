package com.stripe.android.payments.bankaccount.p044ui;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsResult$1", m28418f = "CollectBankAccountViewModel.kt", m28417i = {}, m28416l = {97, 99}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsResult$1 */
/* loaded from: classes7.dex */
public final class CollectBankAccountViewModel$onConnectionsResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSheetResult $result;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$onConnectionsResult$1(FinancialConnectionsSheetResult financialConnectionsSheetResult, CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super CollectBankAccountViewModel$onConnectionsResult$1> continuation) {
        super(2, continuation);
        this.$result = financialConnectionsSheetResult;
        this.this$0 = collectBankAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectBankAccountViewModel$onConnectionsResult$1(this.$result, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CollectBankAccountViewModel$onConnectionsResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CollectBankAccountContract.Args args;
        Object finishWithError;
        Object finishWithResult;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSheetResult financialConnectionsSheetResult = this.$result;
            if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Canceled) {
                CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                CollectBankAccountResult.Cancelled cancelled = CollectBankAccountResult.Cancelled.INSTANCE;
                this.label = 1;
                finishWithResult = collectBankAccountViewModel.finishWithResult(cancelled, this);
                if (finishWithResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Failed) {
                CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
                Throwable error = ((FinancialConnectionsSheetResult.Failed) financialConnectionsSheetResult).getError();
                this.label = 2;
                finishWithError = collectBankAccountViewModel2.finishWithError(error, this);
                if (finishWithError == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetResult.Completed) {
                args = this.this$0.args;
                if (args.getAttachToIntent()) {
                    this.this$0.attachFinancialConnectionsSessionToIntent(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                } else {
                    this.this$0.finishWithFinancialConnectionsSession(((FinancialConnectionsSheetResult.Completed) this.$result).getFinancialConnectionsSession());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
