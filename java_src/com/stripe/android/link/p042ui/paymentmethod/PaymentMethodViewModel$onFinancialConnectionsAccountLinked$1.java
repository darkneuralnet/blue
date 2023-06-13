package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLinkResult;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.model.ConsumerPaymentDetails;
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
@DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1", m28418f = "PaymentMethodViewModel.kt", m28417i = {}, m28416l = {163}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSheetLinkResult $result;
    int label;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1(PaymentMethodViewModel paymentMethodViewModel, FinancialConnectionsSheetLinkResult financialConnectionsSheetLinkResult, Continuation<? super PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentMethodViewModel;
        this.$result = financialConnectionsSheetLinkResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116489createBankAccountPaymentDetailsgIAlus;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116489createBankAccountPaymentDetailsgIAlus = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String linkedAccountId = ((FinancialConnectionsSheetLinkResult.Completed) this.$result).getLinkedAccountId();
            this.label = 1;
            m116489createBankAccountPaymentDetailsgIAlus = linkAccountManager.m116489createBankAccountPaymentDetailsgIAlus(linkedAccountId, this);
            if (m116489createBankAccountPaymentDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        PaymentMethodViewModel paymentMethodViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116489createBankAccountPaymentDetailsgIAlus);
        if (m116786exceptionOrNullimpl == null) {
            paymentMethodViewModel.navigateToWallet((ConsumerPaymentDetails.BankAccount) m116489createBankAccountPaymentDetailsgIAlus);
        } else {
            paymentMethodViewModel.onError(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
