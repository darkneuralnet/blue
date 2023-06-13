package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.functions.Function1;
/* loaded from: classes7.dex */
public final class UnsupportedAuthenticator_Factory implements InterfaceC48812sj1<UnsupportedAuthenticator> {
    private final Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

    public UnsupportedAuthenticator_Factory(Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y94) {
        this.paymentRelayStarterFactoryProvider = y94;
    }

    public static UnsupportedAuthenticator_Factory create(Y94<Function1<AuthActivityStarterHost, PaymentRelayStarter>> y94) {
        return new UnsupportedAuthenticator_Factory(y94);
    }

    public static UnsupportedAuthenticator newInstance(Function1<AuthActivityStarterHost, PaymentRelayStarter> function1) {
        return new UnsupportedAuthenticator(function1);
    }

    @Override // p000.Y94
    public UnsupportedAuthenticator get() {
        return newInstance(this.paymentRelayStarterFactoryProvider.get());
    }
}
