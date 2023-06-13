package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class InputAddressViewModel_Factory_MembersInjector implements MembersInjector<InputAddressViewModel.Factory> {
    private final Y94<InputAddressViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public InputAddressViewModel_Factory_MembersInjector(Y94<InputAddressViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<InputAddressViewModel.Factory> create(Y94<InputAddressViewModelSubcomponent.Builder> y94) {
        return new InputAddressViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(InputAddressViewModel.Factory factory, Y94<InputAddressViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InputAddressViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
