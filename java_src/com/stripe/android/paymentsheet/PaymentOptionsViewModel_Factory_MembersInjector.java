package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class PaymentOptionsViewModel_Factory_MembersInjector implements MembersInjector<PaymentOptionsViewModel.Factory> {
    private final Y94<PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentOptionsViewModel_Factory_MembersInjector(Y94<PaymentOptionsViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<PaymentOptionsViewModel.Factory> create(Y94<PaymentOptionsViewModelSubcomponent.Builder> y94) {
        return new PaymentOptionsViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(PaymentOptionsViewModel.Factory factory, Y94<PaymentOptionsViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaymentOptionsViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
