package com.stripe.android.payments.core.authentication;

import com.stripe.android.model.StripeIntent;
import java.util.Map;
/* loaded from: classes7.dex */
public final class DefaultPaymentAuthenticatorRegistry_Factory implements InterfaceC48812sj1<DefaultPaymentAuthenticatorRegistry> {
    private final Y94<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;
    private final Y94<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> paymentAuthenticatorsProvider;
    private final Y94<SourceAuthenticator> sourceAuthenticatorProvider;

    public DefaultPaymentAuthenticatorRegistry_Factory(Y94<NoOpIntentAuthenticator> y94, Y94<SourceAuthenticator> y942, Y94<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> y943) {
        this.noOpIntentAuthenticatorProvider = y94;
        this.sourceAuthenticatorProvider = y942;
        this.paymentAuthenticatorsProvider = y943;
    }

    public static DefaultPaymentAuthenticatorRegistry_Factory create(Y94<NoOpIntentAuthenticator> y94, Y94<SourceAuthenticator> y942, Y94<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> y943) {
        return new DefaultPaymentAuthenticatorRegistry_Factory(y94, y942, y943);
    }

    public static DefaultPaymentAuthenticatorRegistry newInstance(NoOpIntentAuthenticator noOpIntentAuthenticator, SourceAuthenticator sourceAuthenticator, Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> map) {
        return new DefaultPaymentAuthenticatorRegistry(noOpIntentAuthenticator, sourceAuthenticator, map);
    }

    @Override // p000.Y94
    public DefaultPaymentAuthenticatorRegistry get() {
        return newInstance(this.noOpIntentAuthenticatorProvider.get(), this.sourceAuthenticatorProvider.get(), this.paymentAuthenticatorsProvider.get());
    }
}
