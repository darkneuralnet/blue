package com.stripe.android.paymentsheet;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
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
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$onPaymentResult$1", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {468}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel$onPaymentResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentResult $paymentResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$onPaymentResult$1(PaymentSheetViewModel paymentSheetViewModel, PaymentResult paymentResult, Continuation<? super PaymentSheetViewModel$onPaymentResult$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentSheetViewModel;
        this.$paymentResult = paymentResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentSheetViewModel$onPaymentResult$1 paymentSheetViewModel$onPaymentResult$1 = new PaymentSheetViewModel$onPaymentResult$1(this.this$0, this.$paymentResult, continuation);
        paymentSheetViewModel$onPaymentResult$1.L$0 = obj;
        return paymentSheetViewModel$onPaymentResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentSheetViewModel$onPaymentResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        ElementsSessionRepository elementsSessionRepository;
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
                ZC0 zc0 = (ZC0) this.L$0;
                PaymentSheetViewModel paymentSheetViewModel = this.this$0;
                Result.Companion companion = Result.Companion;
                elementsSessionRepository = paymentSheetViewModel.elementsSessionRepository;
                PaymentSheet.InitializationMode initializationMode$paymentsheet_release = paymentSheetViewModel.getArgs$paymentsheet_release().getInitializationMode$paymentsheet_release();
                PaymentSheet.Configuration config$paymentsheet_release = paymentSheetViewModel.getArgs$paymentsheet_release().getConfig$paymentsheet_release();
                this.label = 1;
                obj = elementsSessionRepository.get(initializationMode$paymentsheet_release, config$paymentsheet_release, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((ElementsSession) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        PaymentSheetViewModel paymentSheetViewModel2 = this.this$0;
        PaymentResult paymentResult = this.$paymentResult;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            paymentSheetViewModel2.processPayment(((ElementsSession) m116783constructorimpl).getStripeIntent(), paymentResult);
        } else {
            paymentSheetViewModel2.onFatal(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
