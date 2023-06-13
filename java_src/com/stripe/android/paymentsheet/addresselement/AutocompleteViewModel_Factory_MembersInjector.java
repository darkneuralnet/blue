package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class AutocompleteViewModel_Factory_MembersInjector implements MembersInjector<AutocompleteViewModel.Factory> {
    private final Y94<AutocompleteViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public AutocompleteViewModel_Factory_MembersInjector(Y94<AutocompleteViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<AutocompleteViewModel.Factory> create(Y94<AutocompleteViewModelSubcomponent.Builder> y94) {
        return new AutocompleteViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(AutocompleteViewModel.Factory factory, Y94<AutocompleteViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AutocompleteViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
