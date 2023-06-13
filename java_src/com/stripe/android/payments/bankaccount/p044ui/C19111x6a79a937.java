package com.stripe.android.payments.bankaccount.p044ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
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
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1", m28418f = "CollectBankAccountViewModel.kt", m28417i = {}, m28416l = {116, 120, 129}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithFinancialConnectionsSession$1 */
/* loaded from: classes7.dex */
public final class C19111x6a79a937 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSession $financialConnectionsSession;
    Object L$0;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19111x6a79a937(CollectBankAccountViewModel collectBankAccountViewModel, FinancialConnectionsSession financialConnectionsSession, Continuation<? super C19111x6a79a937> continuation) {
        super(2, continuation);
        this.this$0 = collectBankAccountViewModel;
        this.$financialConnectionsSession = financialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19111x6a79a937(this.this$0, this.$financialConnectionsSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((C19111x6a79a937) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        RetrieveStripeIntent retrieveStripeIntent;
        CollectBankAccountContract.Args args;
        CollectBankAccountContract.Args args2;
        Object m116584invoke0E7RQCE;
        Object obj2;
        Object finishWithResult;
        Throwable m116786exceptionOrNullimpl;
        Object finishWithError;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
                if (m116786exceptionOrNullimpl != null) {
                    this.L$0 = obj2;
                    this.label = 3;
                    finishWithError = collectBankAccountViewModel.finishWithError(m116786exceptionOrNullimpl, this);
                    if (finishWithError == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            m116584invoke0E7RQCE = ((Result) obj).m116792unboximpl();
        } else {
            ResultKt.throwOnFailure(obj);
            retrieveStripeIntent = this.this$0.retrieveStripeIntent;
            args = this.this$0.args;
            String publishableKey = args.getPublishableKey();
            args2 = this.this$0.args;
            String clientSecret = args2.getClientSecret();
            this.label = 1;
            m116584invoke0E7RQCE = retrieveStripeIntent.m116584invoke0E7RQCE(publishableKey, clientSecret, this);
            if (m116584invoke0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        obj2 = m116584invoke0E7RQCE;
        CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
        FinancialConnectionsSession financialConnectionsSession = this.$financialConnectionsSession;
        if (Result.m116790isSuccessimpl(obj2)) {
            CollectBankAccountResult.Completed completed = new CollectBankAccountResult.Completed(new CollectBankAccountResponse((StripeIntent) obj2, financialConnectionsSession));
            this.L$0 = obj2;
            this.label = 2;
            finishWithResult = collectBankAccountViewModel2.finishWithResult(completed, this);
            if (finishWithResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CollectBankAccountViewModel collectBankAccountViewModel3 = this.this$0;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
