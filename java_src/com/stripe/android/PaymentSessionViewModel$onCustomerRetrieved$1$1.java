package com.stripe.android;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSessionViewModel$onCustomerRetrieved$1$1 extends Lambda implements Function1<PaymentMethod, Unit> {
    final /* synthetic */ Function0<Unit> $onComplete;
    final /* synthetic */ PaymentSessionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel$onCustomerRetrieved$1$1(Function0<Unit> function0, PaymentSessionViewModel paymentSessionViewModel) {
        super(1);
        this.$onComplete = function0;
        this.this$0 = paymentSessionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod paymentMethod) {
        PaymentSessionData copy;
        if (paymentMethod != null) {
            PaymentSessionViewModel paymentSessionViewModel = this.this$0;
            copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : paymentMethod, (r22 & 128) != 0 ? paymentSessionViewModel.getPaymentSessionData().useGooglePay : false);
            paymentSessionViewModel.setPaymentSessionData(copy);
        }
        this.$onComplete.invoke();
    }
}
