package com.stripe.android.paymentsheet.injection;

import com.stripe.android.PaymentConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentSheetCommonModule$Companion$provideStripeAccountId$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Y94<PaymentConfiguration> $paymentConfiguration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetCommonModule$Companion$provideStripeAccountId$1(Y94<PaymentConfiguration> y94) {
        super(0);
        this.$paymentConfiguration = y94;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$paymentConfiguration.get().getStripeAccountId();
    }
}
