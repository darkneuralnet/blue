package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/PaymentRelayStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.core.injection.AuthenticationModule$Companion$providePaymentRelayStarterFactory$1 */
/* loaded from: classes7.dex */
public final class C19120xe33b699c extends Lambda implements Function1<AuthActivityStarterHost, PaymentRelayStarter> {
    final /* synthetic */ Lazy<DefaultPaymentAuthenticatorRegistry> $lazyRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19120xe33b699c(Lazy<DefaultPaymentAuthenticatorRegistry> lazy) {
        super(1);
        this.$lazyRegistry = lazy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(host, "host");
        AbstractC0407B5<PaymentRelayStarter.Args> paymentRelayLauncher$payments_core_release = this.$lazyRegistry.get().getPaymentRelayLauncher$payments_core_release();
        if (paymentRelayLauncher$payments_core_release != null) {
            return new PaymentRelayStarter.Modern(paymentRelayLauncher$payments_core_release);
        }
        return new PaymentRelayStarter.Legacy(host);
    }
}
