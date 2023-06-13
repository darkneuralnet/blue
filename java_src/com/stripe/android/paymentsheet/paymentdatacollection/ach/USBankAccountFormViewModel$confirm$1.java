package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.ConfirmStripeIntentParamsFactory;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactoryKtxKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$confirm$1", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModel$confirm$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ PaymentSelection.New $paymentSelection;
    int label;
    final /* synthetic */ USBankAccountFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormViewModel$confirm$1(ClientSecret clientSecret, USBankAccountFormViewModel uSBankAccountFormViewModel, PaymentSelection.New r3, Continuation<? super USBankAccountFormViewModel$confirm$1> continuation) {
        super(2, continuation);
        this.$clientSecret = clientSecret;
        this.this$0 = uSBankAccountFormViewModel;
        this.$paymentSelection = r3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new USBankAccountFormViewModel$confirm$1(this.$clientSecret, this.this$0, this.$paymentSelection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((USBankAccountFormViewModel$confirm$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        USBankAccountFormViewModel.Args args;
        ConfirmPaymentIntentParams.Shipping shipping;
        USBankAccountFormViewModel.Args args2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ConfirmStripeIntentParamsFactory.Companion companion = ConfirmStripeIntentParamsFactory.Companion;
            String value = this.$clientSecret.getValue();
            args = this.this$0.args;
            AddressDetails shippingDetails = args.getShippingDetails();
            if (shippingDetails != null) {
                shipping = AddressDetailsKt.toConfirmPaymentIntentShipping(shippingDetails);
            } else {
                shipping = null;
            }
            ConfirmStripeIntentParams create = ConfirmStripeIntentParamsFactoryKtxKt.create(companion.createFactory(value, shipping), this.$paymentSelection);
            args2 = this.this$0.args;
            args2.getOnConfirmStripeIntent().invoke(create);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
