package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AddressElementViewModel;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class AddressElementViewModel_Factory_MembersInjector implements MembersInjector<AddressElementViewModel.Factory> {
    private final Y94<AddressElementViewModel> viewModelProvider;

    public AddressElementViewModel_Factory_MembersInjector(Y94<AddressElementViewModel> y94) {
        this.viewModelProvider = y94;
    }

    public static MembersInjector<AddressElementViewModel.Factory> create(Y94<AddressElementViewModel> y94) {
        return new AddressElementViewModel_Factory_MembersInjector(y94);
    }

    public static void injectViewModel(AddressElementViewModel.Factory factory, AddressElementViewModel addressElementViewModel) {
        factory.viewModel = addressElementViewModel;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AddressElementViewModel.Factory factory) {
        injectViewModel(factory, this.viewModelProvider.get());
    }
}
