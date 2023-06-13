package com.stripe.android.paymentsheet.injection;
/* loaded from: classes7.dex */
public final class AddressElementViewModelModule_ProvideDummyInjectorKeyFactory implements InterfaceC48812sj1<String> {
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvideDummyInjectorKeyFactory(AddressElementViewModelModule addressElementViewModelModule) {
        this.module = addressElementViewModelModule;
    }

    public static AddressElementViewModelModule_ProvideDummyInjectorKeyFactory create(AddressElementViewModelModule addressElementViewModelModule) {
        return new AddressElementViewModelModule_ProvideDummyInjectorKeyFactory(addressElementViewModelModule);
    }

    public static String provideDummyInjectorKey(AddressElementViewModelModule addressElementViewModelModule) {
        return (String) C51679xZ3.m5002e(addressElementViewModelModule.provideDummyInjectorKey());
    }

    @Override // p000.Y94
    public String get() {
        return provideDummyInjectorKey(this.module);
    }
}
