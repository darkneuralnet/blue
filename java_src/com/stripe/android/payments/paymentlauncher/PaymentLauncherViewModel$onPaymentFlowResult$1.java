package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$onPaymentFlowResult$1", m28418f = "PaymentLauncherViewModel.kt", m28417i = {}, m28416l = {204, 207, 212}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel$onPaymentFlowResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentFlowResult.Unvalidated $paymentFlowResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$onPaymentFlowResult$1(PaymentLauncherViewModel paymentLauncherViewModel, PaymentFlowResult.Unvalidated unvalidated, Continuation<? super PaymentLauncherViewModel$onPaymentFlowResult$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$paymentFlowResult = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentLauncherViewModel$onPaymentFlowResult$1 paymentLauncherViewModel$onPaymentFlowResult$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, continuation);
        paymentLauncherViewModel$onPaymentFlowResult$1.L$0 = obj;
        return paymentLauncherViewModel$onPaymentFlowResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$onPaymentFlowResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2;
        boolean z;
        Lazy lazy;
        PaymentFlowResultProcessor paymentFlowResultProcessor;
        Lazy lazy2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            PaymentFlowResult.Unvalidated unvalidated = this.$paymentFlowResult;
            Result.Companion companion2 = Result.Companion;
            z = paymentLauncherViewModel.isPaymentIntent;
            if (z) {
                lazy2 = paymentLauncherViewModel.lazyPaymentIntentFlowResultProcessor;
                paymentFlowResultProcessor = (PaymentFlowResultProcessor) lazy2.get();
            } else {
                lazy = paymentLauncherViewModel.lazySetupIntentFlowResultProcessor;
                paymentFlowResultProcessor = (PaymentFlowResultProcessor) lazy.get();
            }
            this.label = 1;
            obj = paymentFlowResultProcessor.processResult(unvalidated, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeIntentResult) obj);
        PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            coroutineContext2 = paymentLauncherViewModel2.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$2$1 paymentLauncherViewModel$onPaymentFlowResult$1$2$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$2$1(paymentLauncherViewModel2, (StripeIntentResult) m116783constructorimpl, null);
            this.label = 2;
            if (X30.m77504g(coroutineContext2, paymentLauncherViewModel$onPaymentFlowResult$1$2$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            coroutineContext = paymentLauncherViewModel2.uiContext;
            PaymentLauncherViewModel$onPaymentFlowResult$1$3$1 paymentLauncherViewModel$onPaymentFlowResult$1$3$1 = new PaymentLauncherViewModel$onPaymentFlowResult$1$3$1(paymentLauncherViewModel2, m116786exceptionOrNullimpl, null);
            this.label = 3;
            if (X30.m77504g(coroutineContext, paymentLauncherViewModel$onPaymentFlowResult$1$3$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
