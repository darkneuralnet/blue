package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.p045di.USBankAccountFormViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModel_Factory_MembersInjector implements MembersInjector<USBankAccountFormViewModel.Factory> {
    private final Y94<USBankAccountFormViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public USBankAccountFormViewModel_Factory_MembersInjector(Y94<USBankAccountFormViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<USBankAccountFormViewModel.Factory> create(Y94<USBankAccountFormViewModelSubcomponent.Builder> y94) {
        return new USBankAccountFormViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(USBankAccountFormViewModel.Factory factory, Y94<USBankAccountFormViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(USBankAccountFormViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
