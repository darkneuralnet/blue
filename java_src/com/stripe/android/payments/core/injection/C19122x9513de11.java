package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import kotlin.jvm.functions.Function1;
/* renamed from: com.stripe.android.payments.core.injection.AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory */
/* loaded from: classes7.dex */
public final class C19122x9513de11 implements InterfaceC48812sj1<Function1<AuthActivityStarterHost, PaymentRelayStarter>> {
    private final Y94<DefaultPaymentAuthenticatorRegistry> registryProvider;

    public C19122x9513de11(Y94<DefaultPaymentAuthenticatorRegistry> y94) {
        this.registryProvider = y94;
    }

    public static C19122x9513de11 create(Y94<DefaultPaymentAuthenticatorRegistry> y94) {
        return new C19122x9513de11(y94);
    }

    public static Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(Lazy<DefaultPaymentAuthenticatorRegistry> lazy) {
        return (Function1) C51679xZ3.m5002e(AuthenticationModule.Companion.providePaymentRelayStarterFactory(lazy));
    }

    @Override // p000.Y94
    public Function1<AuthActivityStarterHost, PaymentRelayStarter> get() {
        return providePaymentRelayStarterFactory(V51.m80430a(this.registryProvider));
    }
}
