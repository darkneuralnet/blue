package com.stripe.android.networking;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SourceParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeApiRepository$confirmPaymentIntentInternal$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmPaymentIntentInternal$2(ConfirmPaymentIntentParams confirmPaymentIntentParams, StripeApiRepository stripeApiRepository) {
        super(0);
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String type;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        PaymentMethodCreateParams paymentMethodCreateParams = this.$confirmPaymentIntentParams.getPaymentMethodCreateParams();
        if (paymentMethodCreateParams == null || (type = paymentMethodCreateParams.getTypeCode()) == null) {
            SourceParams sourceParams = this.$confirmPaymentIntentParams.getSourceParams();
            type = sourceParams != null ? sourceParams.getType() : null;
        }
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(type));
    }
}
