package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import kotlin.jvm.functions.Function1;
/* renamed from: com.stripe.android.payments.core.injection.AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory */
/* loaded from: classes7.dex */
public final class C19121xba4dded2 implements InterfaceC48812sj1<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> {
    private final Y94<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Y94<DefaultPaymentAuthenticatorRegistry> registryProvider;

    public C19121xba4dded2(Y94<DefaultPaymentAuthenticatorRegistry> y94, Y94<DefaultReturnUrl> y942) {
        this.registryProvider = y94;
        this.defaultReturnUrlProvider = y942;
    }

    public static C19121xba4dded2 create(Y94<DefaultPaymentAuthenticatorRegistry> y94, Y94<DefaultReturnUrl> y942) {
        return new C19121xba4dded2(y94, y942);
    }

    public static Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(Lazy<DefaultPaymentAuthenticatorRegistry> lazy, DefaultReturnUrl defaultReturnUrl) {
        return (Function1) C51679xZ3.m5002e(AuthenticationModule.Companion.providePaymentBrowserAuthStarterFactory(lazy, defaultReturnUrl));
    }

    @Override // p000.Y94
    public Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> get() {
        return providePaymentBrowserAuthStarterFactory(V51.m80430a(this.registryProvider), this.defaultReturnUrlProvider.get());
    }
}
