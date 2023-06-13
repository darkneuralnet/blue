package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PollAttachPaymentAccount$invoke$3", m28418f = "PollAttachPaymentAccount.kt", m28417i = {}, m28416l = {31}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PollAttachPaymentAccount$invoke$3 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
    final /* synthetic */ FinancialConnectionsInstitution $activeInstitution;
    final /* synthetic */ boolean $allowManualEntry;
    final /* synthetic */ PaymentAccountParams $params;
    int label;
    final /* synthetic */ PollAttachPaymentAccount this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAttachPaymentAccount$invoke$3(PollAttachPaymentAccount pollAttachPaymentAccount, PaymentAccountParams paymentAccountParams, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, Continuation<? super PollAttachPaymentAccount$invoke$3> continuation) {
        super(1, continuation);
        this.this$0 = pollAttachPaymentAccount;
        this.$params = paymentAccountParams;
        this.$activeInstitution = financialConnectionsInstitution;
        this.$allowManualEntry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PollAttachPaymentAccount$invoke$3(this.this$0, this.$params, this.$activeInstitution, this.$allowManualEntry, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeException domainException;
        FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository;
        FinancialConnectionsSheet.Configuration configuration;
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
                financialConnectionsAccountsRepository = this.this$0.repository;
                configuration = this.this$0.configuration;
                String financialConnectionsSessionClientSecret = configuration.getFinancialConnectionsSessionClientSecret();
                PaymentAccountParams paymentAccountParams = this.$params;
                this.label = 1;
                obj = FinancialConnectionsAccountsRepository.DefaultImpls.postLinkAccountSessionPaymentAccount$default(financialConnectionsAccountsRepository, financialConnectionsSessionClientSecret, paymentAccountParams, null, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return (LinkAccountSessionPaymentAccount) obj;
        } catch (StripeException e) {
            domainException = this.this$0.toDomainException(e, this.$activeInstitution, this.$allowManualEntry);
            throw domainException;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        return ((PollAttachPaymentAccount$invoke$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
