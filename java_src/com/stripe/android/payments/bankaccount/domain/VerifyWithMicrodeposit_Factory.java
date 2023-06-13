package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.networking.StripeRepository;
/* loaded from: classes7.dex */
public final class VerifyWithMicrodeposit_Factory implements InterfaceC48812sj1<VerifyWithMicrodeposit> {
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public VerifyWithMicrodeposit_Factory(Y94<StripeRepository> y94) {
        this.stripeRepositoryProvider = y94;
    }

    public static VerifyWithMicrodeposit_Factory create(Y94<StripeRepository> y94) {
        return new VerifyWithMicrodeposit_Factory(y94);
    }

    public static VerifyWithMicrodeposit newInstance(StripeRepository stripeRepository) {
        return new VerifyWithMicrodeposit(stripeRepository);
    }

    @Override // p000.Y94
    public VerifyWithMicrodeposit get() {
        return newInstance(this.stripeRepositoryProvider.get());
    }
}
