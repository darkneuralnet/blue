package com.stripe.android.paymentsheet;

import com.stripe.android.PaymentConfiguration;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel$registerFromActivity$2 extends Lambda implements Function0<String> {
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$registerFromActivity$2(PaymentSheetViewModel paymentSheetViewModel) {
        super(0);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Lazy lazy;
        lazy = this.this$0.lazyPaymentConfig;
        return ((PaymentConfiguration) lazy.get()).getStripeAccountId();
    }
}
