package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.IntentConfirmationInterceptorKtxKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1", m28418f = "DefaultFlowController.kt", m28417i = {0}, m28416l = {272}, m28415m = "invokeSuspend", m28414n = {"stripeIntent"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class DefaultFlowController$confirmPaymentSelection$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentSelection $paymentSelection;
    final /* synthetic */ PaymentSheetState.Full $state;
    Object L$0;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$confirmPaymentSelection$1(PaymentSheetState.Full full, DefaultFlowController defaultFlowController, PaymentSelection paymentSelection, Continuation<? super DefaultFlowController$confirmPaymentSelection$1> continuation) {
        super(2, continuation);
        this.$state = full;
        this.this$0 = defaultFlowController;
        this.$paymentSelection = paymentSelection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFlowController$confirmPaymentSelection$1(this.$state, this.this$0, this.$paymentSelection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultFlowController$confirmPaymentSelection$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        IntentConfirmationInterceptor intentConfirmationInterceptor;
        ConfirmPaymentIntentParams.Shipping shipping;
        StripeIntent stripeIntent;
        AddressDetails shippingDetails;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                stripeIntent = (StripeIntent) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            StripeIntent stripeIntent2 = this.$state.getStripeIntent();
            if (stripeIntent2 != null) {
                intentConfirmationInterceptor = this.this$0.intentConfirmationInterceptor;
                String clientSecret = stripeIntent2.getClientSecret();
                PaymentSelection paymentSelection = this.$paymentSelection;
                PaymentSheet.Configuration config = this.$state.getConfig();
                if (config != null && (shippingDetails = config.getShippingDetails()) != null) {
                    shipping = AddressDetailsKt.toConfirmPaymentIntentShipping(shippingDetails);
                } else {
                    shipping = null;
                }
                this.L$0 = stripeIntent2;
                this.label = 1;
                Object intercept = IntentConfirmationInterceptorKtxKt.intercept(intentConfirmationInterceptor, clientSecret, paymentSelection, shipping, this);
                if (intercept == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeIntent = stripeIntent2;
                obj = intercept;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        IntentConfirmationInterceptor.NextStep nextStep = (IntentConfirmationInterceptor.NextStep) obj;
        if (nextStep instanceof IntentConfirmationInterceptor.NextStep.HandleNextAction) {
            this.this$0.handleNextAction(((IntentConfirmationInterceptor.NextStep.HandleNextAction) nextStep).getClientSecret(), stripeIntent);
        } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm) {
            this.this$0.confirmStripeIntent(((IntentConfirmationInterceptor.NextStep.Confirm) nextStep).getConfirmParams());
        } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Fail) {
            this.this$0.onPaymentResult$paymentsheet_release(new PaymentResult.Failed(((IntentConfirmationInterceptor.NextStep.Fail) nextStep).getCause()));
        } else if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Complete) {
            this.this$0.onPaymentResult$paymentsheet_release(PaymentResult.Completed.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
