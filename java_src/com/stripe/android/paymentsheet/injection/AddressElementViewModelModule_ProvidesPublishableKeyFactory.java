package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
/* loaded from: classes7.dex */
public final class AddressElementViewModelModule_ProvidesPublishableKeyFactory implements InterfaceC48812sj1<String> {
    private final Y94<AddressElementActivityContract.Args> argsProvider;
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvidesPublishableKeyFactory(AddressElementViewModelModule addressElementViewModelModule, Y94<AddressElementActivityContract.Args> y94) {
        this.module = addressElementViewModelModule;
        this.argsProvider = y94;
    }

    public static AddressElementViewModelModule_ProvidesPublishableKeyFactory create(AddressElementViewModelModule addressElementViewModelModule, Y94<AddressElementActivityContract.Args> y94) {
        return new AddressElementViewModelModule_ProvidesPublishableKeyFactory(addressElementViewModelModule, y94);
    }

    public static String providesPublishableKey(AddressElementViewModelModule addressElementViewModelModule, AddressElementActivityContract.Args args) {
        return (String) C51679xZ3.m5002e(addressElementViewModelModule.providesPublishableKey(args));
    }

    @Override // p000.Y94
    public String get() {
        return providesPublishableKey(this.module, this.argsProvider.get());
    }
}
