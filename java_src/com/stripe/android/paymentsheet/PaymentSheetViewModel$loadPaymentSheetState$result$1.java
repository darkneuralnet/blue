package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$loadPaymentSheetState$result$1", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {257}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel$loadPaymentSheetState$result$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super PaymentSheetLoader.Result>, Object> {
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$loadPaymentSheetState$result$1(PaymentSheetViewModel paymentSheetViewModel, Continuation<? super PaymentSheetViewModel$loadPaymentSheetState$result$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetViewModel$loadPaymentSheetState$result$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super PaymentSheetLoader.Result> continuation) {
        return ((PaymentSheetViewModel$loadPaymentSheetState$result$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        PaymentSheetLoader paymentSheetLoader;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            paymentSheetLoader = this.this$0.paymentSheetLoader;
            PaymentSheet.InitializationMode initializationMode$paymentsheet_release = this.this$0.getArgs$paymentsheet_release().getInitializationMode$paymentsheet_release();
            PaymentSheet.Configuration config$paymentsheet_release = this.this$0.getArgs$paymentsheet_release().getConfig$paymentsheet_release();
            this.label = 1;
            obj = paymentSheetLoader.load(initializationMode$paymentsheet_release, config$paymentsheet_release, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
