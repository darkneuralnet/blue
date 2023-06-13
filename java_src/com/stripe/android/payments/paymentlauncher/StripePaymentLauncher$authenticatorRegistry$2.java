package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripePaymentLauncher$authenticatorRegistry$2 extends Lambda implements Function0<PaymentAuthenticatorRegistry> {
    final /* synthetic */ StripePaymentLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentLauncher$authenticatorRegistry$2(StripePaymentLauncher stripePaymentLauncher) {
        super(0);
        this.this$0 = stripePaymentLauncher;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentAuthenticatorRegistry invoke() {
        PaymentLauncherComponent paymentLauncherComponent;
        paymentLauncherComponent = this.this$0.paymentLauncherComponent;
        return paymentLauncherComponent.getAuthenticatorRegistry();
    }
}
