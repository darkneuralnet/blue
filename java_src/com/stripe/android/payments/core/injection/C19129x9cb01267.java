package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
/* renamed from: com.stripe.android.payments.core.injection.WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory */
/* loaded from: classes7.dex */
public final class C19129x9cb01267 implements InterfaceC48812sj1<PaymentAuthenticator<StripeIntent>> {
    private final WeChatPayAuthenticatorModule module;
    private final Y94<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;

    public C19129x9cb01267(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, Y94<UnsupportedAuthenticator> y94) {
        this.module = weChatPayAuthenticatorModule;
        this.unsupportedAuthenticatorProvider = y94;
    }

    public static C19129x9cb01267 create(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, Y94<UnsupportedAuthenticator> y94) {
        return new C19129x9cb01267(weChatPayAuthenticatorModule, y94);
    }

    public static PaymentAuthenticator<StripeIntent> provideWeChatAuthenticator$payments_core_release(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, UnsupportedAuthenticator unsupportedAuthenticator) {
        return (PaymentAuthenticator) C51679xZ3.m5002e(weChatPayAuthenticatorModule.provideWeChatAuthenticator$payments_core_release(unsupportedAuthenticator));
    }

    @Override // p000.Y94
    public PaymentAuthenticator<StripeIntent> get() {
        return provideWeChatAuthenticator$payments_core_release(this.module, this.unsupportedAuthenticatorProvider.get());
    }
}
