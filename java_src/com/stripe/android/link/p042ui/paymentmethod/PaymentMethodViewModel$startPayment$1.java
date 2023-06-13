package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
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
@DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$1", m28418f = "PaymentMethodViewModel.kt", m28417i = {}, m28416l = {124, 129}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel$startPayment$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    int label;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$startPayment$1(PaymentMethodViewModel paymentMethodViewModel, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super PaymentMethodViewModel$startPayment$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentMethodViewModel;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodViewModel$startPayment$1(this.this$0, this.$paymentMethodCreateParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodViewModel$startPayment$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116490createCardPaymentDetailsBWLJW6A;
        Object completePayment;
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
            ResultKt.throwOnFailure(obj);
            m116490createCardPaymentDetailsBWLJW6A = ((Result) obj).m116792unboximpl();
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
            String email = this.this$0.getLinkAccount().getEmail();
            StripeIntent stripeIntent$link_release = this.this$0.getArgs().getStripeIntent$link_release();
            this.label = 1;
            m116490createCardPaymentDetailsBWLJW6A = linkAccountManager.m116490createCardPaymentDetailsBWLJW6A(paymentMethodCreateParams, email, stripeIntent$link_release, this);
            if (m116490createCardPaymentDetailsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        PaymentMethodViewModel paymentMethodViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116490createCardPaymentDetailsBWLJW6A);
        if (m116786exceptionOrNullimpl == null) {
            this.label = 2;
            completePayment = paymentMethodViewModel.completePayment((LinkPaymentDetails.New) m116490createCardPaymentDetailsBWLJW6A, this);
            if (completePayment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            paymentMethodViewModel.onError(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
