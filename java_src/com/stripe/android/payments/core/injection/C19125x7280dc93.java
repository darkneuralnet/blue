package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
/* renamed from: com.stripe.android.payments.core.injection.Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory */
/* loaded from: classes7.dex */
public final class C19125x7280dc93 implements InterfaceC48812sj1<PaymentAuthConfig> {

    /* renamed from: com.stripe.android.payments.core.injection.Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C19125x7280dc93 INSTANCE = new C19125x7280dc93();

        private InstanceHolder() {
        }
    }

    public static C19125x7280dc93 create() {
        return InstanceHolder.INSTANCE;
    }

    public static PaymentAuthConfig providePaymentAuthConfig() {
        return (PaymentAuthConfig) C51679xZ3.m5002e(Stripe3DSAuthenticatorModule.Companion.providePaymentAuthConfig());
    }

    @Override // p000.Y94
    public PaymentAuthConfig get() {
        return providePaymentAuthConfig();
    }
}
