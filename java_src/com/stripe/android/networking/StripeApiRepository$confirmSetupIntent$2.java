package com.stripe.android.networking;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeApiRepository$confirmSetupIntent$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmSetupIntent$2(StripeApiRepository stripeApiRepository, ConfirmSetupIntentParams confirmSetupIntentParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$confirmSetupIntentParams = confirmSetupIntentParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        StripeApiRepository stripeApiRepository = this.this$0;
        paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        PaymentMethodCreateParams paymentMethodCreateParams$payments_core_release = this.$confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release();
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createSetupIntentConfirmation$payments_core_release(paymentMethodCreateParams$payments_core_release != null ? paymentMethodCreateParams$payments_core_release.getTypeCode() : null));
    }
}
