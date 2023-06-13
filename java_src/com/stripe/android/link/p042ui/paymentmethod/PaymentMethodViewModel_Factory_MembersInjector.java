package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import dagger.MembersInjector;
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel_Factory_MembersInjector */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel_Factory_MembersInjector implements MembersInjector<PaymentMethodViewModel.Factory> {
    private final Y94<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentMethodViewModel_Factory_MembersInjector(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<PaymentMethodViewModel.Factory> create(Y94<SignedInViewModelSubcomponent.Builder> y94) {
        return new PaymentMethodViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(PaymentMethodViewModel.Factory factory, Y94<SignedInViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaymentMethodViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
