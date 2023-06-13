package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class NoOpIntentAuthenticator_Factory implements InterfaceC48812sj1<NoOpIntentAuthenticator> {
    private final Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

    public NoOpIntentAuthenticator_Factory(Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y94) {
        this.paymentRelayStarterFactoryProvider = y94;
    }

    public static NoOpIntentAuthenticator_Factory create(Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y94) {
        return new NoOpIntentAuthenticator_Factory(y94);
    }

    public static NoOpIntentAuthenticator newInstance(Function1<AuthActivityStarterHost, PaymentRelayStarter> function1) {
        return new NoOpIntentAuthenticator(function1);
    }

    @Override // p000.Y94
    public NoOpIntentAuthenticator get() {
        return newInstance(this.paymentRelayStarterFactoryProvider.get());
    }
}
