package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/PaymentRelayStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StripePaymentController$paymentRelayStarterFactory$1 extends Lambda implements Function1<AuthActivityStarterHost, PaymentRelayStarter> {
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$paymentRelayStarterFactory$1(StripePaymentController stripePaymentController) {
        super(1);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
        AbstractC0407B5 abstractC0407B5;
        Intrinsics.checkNotNullParameter(host, "host");
        abstractC0407B5 = this.this$0.paymentRelayLauncher;
        if (abstractC0407B5 != null) {
            return new PaymentRelayStarter.Modern(abstractC0407B5);
        }
        return new PaymentRelayStarter.Legacy(host);
    }
}
